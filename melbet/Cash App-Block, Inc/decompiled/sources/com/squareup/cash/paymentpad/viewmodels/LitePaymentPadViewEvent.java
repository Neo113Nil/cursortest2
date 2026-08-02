package com.squareup.cash.paymentpad.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LitePaymentPadViewEvent {

    public final class AmountChanged implements LitePaymentPadViewEvent {
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

    public final class Dismiss implements LitePaymentPadViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 913722758;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class ExchangeRatePreviewTapped implements LitePaymentPadViewEvent {
        public static final ExchangeRatePreviewTapped INSTANCE = new ExchangeRatePreviewTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExchangeRatePreviewTapped);
        }

        public final int hashCode() {
            return 390857613;
        }

        public final String toString() {
            return "ExchangeRatePreviewTapped";
        }
    }

    public final class Pay implements LitePaymentPadViewEvent {
        public static final Pay INSTANCE = new Pay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pay);
        }

        public final int hashCode() {
            return 2037459364;
        }

        public final String toString() {
            return "Pay";
        }
    }

    public final class QrCode implements LitePaymentPadViewEvent {
        public static final QrCode INSTANCE = new QrCode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrCode);
        }

        public final int hashCode() {
            return 1516916018;
        }

        public final String toString() {
            return "QrCode";
        }
    }
}
