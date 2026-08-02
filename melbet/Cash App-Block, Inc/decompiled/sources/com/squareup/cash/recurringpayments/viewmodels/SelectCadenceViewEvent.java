package com.squareup.cash.recurringpayments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class SelectCadenceViewEvent {

    public final class SelectCadenceOption extends SelectCadenceViewEvent {
        public final String cadenceToken;

        public SelectCadenceOption(String str) {
            str.getClass();
            this.cadenceToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectCadenceOption) && Intrinsics.areEqual(this.cadenceToken, ((SelectCadenceOption) obj).cadenceToken);
        }

        public final int hashCode() {
            return this.cadenceToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectCadenceOption(cadenceToken=", this.cadenceToken, ")");
        }
    }

    public final class TapBack extends SelectCadenceViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -197630555;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapClose extends SelectCadenceViewEvent {
        public static final TapClose INSTANCE = new TapClose();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapClose);
        }

        public final int hashCode() {
            return -1830316806;
        }

        public final String toString() {
            return "TapClose";
        }
    }
}
