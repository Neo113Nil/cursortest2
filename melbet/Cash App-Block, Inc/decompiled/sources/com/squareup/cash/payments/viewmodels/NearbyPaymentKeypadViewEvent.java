package com.squareup.cash.payments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface NearbyPaymentKeypadViewEvent {

    public final class OnAmountChanged implements NearbyPaymentKeypadViewEvent {
        public final String rawAmount;

        public OnAmountChanged(String str) {
            str.getClass();
            this.rawAmount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAmountChanged) && Intrinsics.areEqual(this.rawAmount, ((OnAmountChanged) obj).rawAmount);
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnAmountChanged(rawAmount=", this.rawAmount, ")");
        }
    }

    public final class OnCloseClicked implements NearbyPaymentKeypadViewEvent {
        public static final OnCloseClicked INSTANCE = new OnCloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCloseClicked);
        }

        public final int hashCode() {
            return -372171246;
        }

        public final String toString() {
            return "OnCloseClicked";
        }
    }

    public final class OnInstrumentClicked implements NearbyPaymentKeypadViewEvent {
        public static final OnInstrumentClicked INSTANCE = new OnInstrumentClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnInstrumentClicked);
        }

        public final int hashCode() {
            return 1162891549;
        }

        public final String toString() {
            return "OnInstrumentClicked";
        }
    }

    public final class OnMoreInfoClicked implements NearbyPaymentKeypadViewEvent {
        public static final OnMoreInfoClicked INSTANCE = new OnMoreInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnMoreInfoClicked);
        }

        public final int hashCode() {
            return 677231393;
        }

        public final String toString() {
            return "OnMoreInfoClicked";
        }
    }

    public final class OnPayClicked implements NearbyPaymentKeypadViewEvent {
        public static final OnPayClicked INSTANCE = new OnPayClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPayClicked);
        }

        public final int hashCode() {
            return -1607677406;
        }

        public final String toString() {
            return "OnPayClicked";
        }
    }
}
