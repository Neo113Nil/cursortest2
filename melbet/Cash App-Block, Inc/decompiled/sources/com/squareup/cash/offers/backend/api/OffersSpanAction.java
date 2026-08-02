package com.squareup.cash.offers.backend.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class OffersSpanAction {

    public final class EndLoading extends OffersSpanAction {
        public static final EndLoading INSTANCE = new EndLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndLoading);
        }

        public final int hashCode() {
            return -788317307;
        }

        public final String toString() {
            return "EndLoading";
        }
    }

    public final class EndNetworking extends OffersSpanAction {
        public static final EndNetworking INSTANCE = new EndNetworking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndNetworking);
        }

        public final int hashCode() {
            return -766018549;
        }

        public final String toString() {
            return "EndNetworking";
        }
    }

    public final class EndRootSpan extends OffersSpanAction {
        public static final EndRootSpan INSTANCE = new EndRootSpan();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndRootSpan);
        }

        public final int hashCode() {
            return -681141725;
        }

        public final String toString() {
            return "EndRootSpan";
        }
    }

    public final class StartLoading extends OffersSpanAction {
        public final boolean isFullscreen;
        public final String operationName;

        public StartLoading(String str, boolean z) {
            this.operationName = str;
            this.isFullscreen = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartLoading)) {
                return false;
            }
            StartLoading startLoading = (StartLoading) obj;
            return this.operationName.equals(startLoading.operationName) && this.isFullscreen == startLoading.isFullscreen;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isFullscreen) + (this.operationName.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("StartLoading(operationName=", this.operationName, ", isFullscreen=", ")", this.isFullscreen);
        }
    }

    public final class StartNetworking extends OffersSpanAction {
        public final String operationName;

        public StartNetworking(String str) {
            this.operationName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartNetworking) && this.operationName.equals(((StartNetworking) obj).operationName);
        }

        public final int hashCode() {
            return this.operationName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StartNetworking(operationName=", this.operationName, ")");
        }
    }

    public final class StartRootSpan extends OffersSpanAction {
        public final String operationName;

        public StartRootSpan(String str) {
            this.operationName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartRootSpan) && this.operationName.equals(((StartRootSpan) obj).operationName);
        }

        public final int hashCode() {
            return this.operationName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StartRootSpan(operationName=", this.operationName, ")");
        }
    }
}
