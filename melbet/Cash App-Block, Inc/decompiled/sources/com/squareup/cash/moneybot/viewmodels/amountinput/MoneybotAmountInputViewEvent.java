package com.squareup.cash.moneybot.viewmodels.amountinput;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotAmountInputViewEvent {

    public final class AmountChanged implements MoneybotAmountInputViewEvent {
        public final String rawAmount;

        public AmountChanged(String str) {
            str.getClass();
            this.rawAmount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountChanged) && Intrinsics.areEqual(this.rawAmount, ((AmountChanged) obj).rawAmount);
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountChanged(rawAmount=", this.rawAmount, ")");
        }
    }

    public final class ContinueTapped implements MoneybotAmountInputViewEvent {
        public static final ContinueTapped INSTANCE = new ContinueTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueTapped);
        }

        public final int hashCode() {
            return 1995929489;
        }

        public final String toString() {
            return "ContinueTapped";
        }
    }

    public final class Dismissed implements MoneybotAmountInputViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -668057493;
        }

        public final String toString() {
            return "Dismissed";
        }
    }
}
