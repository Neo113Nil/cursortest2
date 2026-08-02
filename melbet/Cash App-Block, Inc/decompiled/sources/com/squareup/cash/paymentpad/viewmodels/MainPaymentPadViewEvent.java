package com.squareup.cash.paymentpad.viewmodels;

import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public abstract class MainPaymentPadViewEvent {

    public abstract class FiatPaymentPadViewEvent extends MainPaymentPadViewEvent {

        public final class AmountChanged extends FiatPaymentPadViewEvent {
            public final String rawAmount;

            public AmountChanged(String str) {
                this.rawAmount = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AmountChanged) && this.rawAmount.equals(((AmountChanged) obj).rawAmount);
            }

            public final int hashCode() {
                return this.rawAmount.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountChanged(rawAmount=", this.rawAmount, ")");
            }
        }

        public final class PoolPayment extends FiatPaymentPadViewEvent {
            public static final PoolPayment INSTANCE = new PoolPayment();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PoolPayment);
            }

            public final int hashCode() {
                return 1237444223;
            }

            public final String toString() {
                return "PoolPayment";
            }
        }

        public final class RequestFiatPayment extends FiatPaymentPadViewEvent {
            public static final RequestFiatPayment INSTANCE = new RequestFiatPayment();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestFiatPayment);
            }

            public final int hashCode() {
                return -2053529332;
            }

            public final String toString() {
                return "RequestFiatPayment";
            }
        }

        public final class RequestTapToPayPayment extends FiatPaymentPadViewEvent {
            public static final RequestTapToPayPayment INSTANCE = new RequestTapToPayPayment();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestTapToPayPayment);
            }

            public final int hashCode() {
                return 661714552;
            }

            public final String toString() {
                return "RequestTapToPayPayment";
            }
        }

        public final class ResetErrorMessage extends FiatPaymentPadViewEvent {
            public static final ResetErrorMessage INSTANCE = new ResetErrorMessage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ResetErrorMessage);
            }

            public final int hashCode() {
                return -861802429;
            }

            public final String toString() {
                return "ResetErrorMessage";
            }
        }

        public final class SendFiatPayment extends FiatPaymentPadViewEvent {
            public static final SendFiatPayment INSTANCE = new SendFiatPayment();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SendFiatPayment);
            }

            public final int hashCode() {
                return -1783182851;
            }

            public final String toString() {
                return "SendFiatPayment";
            }
        }
    }

    /* loaded from: classes9.dex */
    public final class HypeAnimationComplete extends MainPaymentPadViewEvent {
        public static final HypeAnimationComplete INSTANCE = new HypeAnimationComplete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HypeAnimationComplete);
        }

        public final int hashCode() {
            return -662799352;
        }

        public final String toString() {
            return "HypeAnimationComplete";
        }
    }

    /* loaded from: classes7.dex */
    public final class RestoreState extends MainPaymentPadViewEvent {
        public final BitcoinDisplayUnits bitcoinDisplayUnits;
        public final CurrencyCode currencyCode;
        public final String rawAmount;
        public final String transferRawAmount;

        public RestoreState(String str, String str2, CurrencyCode currencyCode, BitcoinDisplayUnits bitcoinDisplayUnits) {
            str.getClass();
            this.rawAmount = str;
            this.transferRawAmount = str2;
            this.currencyCode = currencyCode;
            this.bitcoinDisplayUnits = bitcoinDisplayUnits;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestoreState)) {
                return false;
            }
            RestoreState restoreState = (RestoreState) obj;
            return Intrinsics.areEqual(this.rawAmount, restoreState.rawAmount) && Intrinsics.areEqual(this.transferRawAmount, restoreState.transferRawAmount) && this.currencyCode == restoreState.currencyCode && this.bitcoinDisplayUnits == restoreState.bitcoinDisplayUnits;
        }

        public final int hashCode() {
            int hashCode = this.rawAmount.hashCode() * 31;
            String str = this.transferRawAmount;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            CurrencyCode currencyCode = this.currencyCode;
            int hashCode3 = (hashCode2 + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31;
            BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoinDisplayUnits;
            return hashCode3 + (bitcoinDisplayUnits != null ? bitcoinDisplayUnits.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RestoreState(rawAmount=", this.rawAmount, ", transferRawAmount=", this.transferRawAmount, ", currencyCode=");
            m.append(this.currencyCode);
            m.append(", bitcoinDisplayUnits=");
            m.append(this.bitcoinDisplayUnits);
            m.append(")");
            return m.toString();
        }
    }
}
