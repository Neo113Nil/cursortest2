package com.squareup.cash.buynowpaylater.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AfterPayOrderDocumentViewModel {

    public final class Error extends AfterPayOrderDocumentViewModel {
        public final String message;

        public Error(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
        }
    }

    public final class Loaded extends AfterPayOrderDocumentViewModel {
        public final String documentUrl;

        public Loaded(String str) {
            this.documentUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.documentUrl, ((Loaded) obj).documentUrl);
        }

        public final int hashCode() {
            String str = this.documentUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(documentUrl=", this.documentUrl, ")");
        }
    }

    public final class Loading extends AfterPayOrderDocumentViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1862636660;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
