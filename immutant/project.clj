; Copyright 2014 Cognitect, Inc.

; The use and distribution terms for this software are covered by the
; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
; which can be found in the file epl-v10.html at the root of this distribution.
;
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
;
; You must not remove this notice, or any other, from this software.

(defproject io.pedestal/pedestal.immutant "0.3.1-SNAPSHOT"
  :description "Embedded Immutant adapter for Pedestal HTTP Service"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.immutant/web "2.x.incremental.305"]]
  :min-lein-version "2.0.0"
  :global-vars {*warn-on-reflection* true}
  :repositories [["Immutant 2.x incremental builds"
                  "http://downloads.immutant.org/incremental/"]])
