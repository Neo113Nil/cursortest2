package com.squareup.cash.checks;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface CheckDepositAmountViewEvent {

    public final class AmountChanged implements CheckDepositAmountViewEvent {
        public final String amount;

        public AmountChanged(String str) {
            str.getClass();
            this.amount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountChanged) && Intrinsics.areEqual(this.amount, ((AmountChanged) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountChanged(amount=", this.amount, ")");
        }
    }

    public final class Close implements CheckDepositAmountViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1492983072;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class PrimaryButtonClicked implements CheckDepositAmountViewEvent {
        public static final PrimaryButtonClicked INSTANCE = new PrimaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClicked);
        }

        public final int hashCode() {
            return 1562503115;
        }

        public final String toString() {
            return "PrimaryButtonClicked";
        }
    }
}
