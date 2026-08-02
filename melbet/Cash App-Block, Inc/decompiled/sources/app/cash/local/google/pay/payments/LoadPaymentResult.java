package app.cash.local.google.pay.payments;

import com.google.android.gms.wallet.PaymentData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface LoadPaymentResult {

    public final class Cancelled implements LoadPaymentResult {
        public static final Cancelled INSTANCE = new Cancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public final int hashCode() {
            return 404803625;
        }

        public final String toString() {
            return "Cancelled";
        }
    }

    public final class GooglePayFailure implements LoadPaymentResult {
        public final int failureReason;

        public GooglePayFailure(int i) {
            this.failureReason = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GooglePayFailure) && this.failureReason == ((GooglePayFailure) obj).failureReason;
        }

        public final int hashCode() {
            return Integer.hashCode(this.failureReason);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.failureReason, "GooglePayFailure(failureReason=", ")");
        }
    }

    public final class Success implements LoadPaymentResult {
        public final PaymentData paymentData;

        public Success(PaymentData paymentData) {
            this.paymentData = paymentData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.paymentData == ((Success) obj).paymentData;
        }

        public final int hashCode() {
            return this.paymentData.hashCode();
        }

        public final String toString() {
            return "Success(paymentData=" + this.paymentData + ")";
        }
    }

    public final class UnexpectedFailure implements LoadPaymentResult {
        public static final UnexpectedFailure INSTANCE = new UnexpectedFailure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnexpectedFailure);
        }

        public final int hashCode() {
            return 953360081;
        }

        public final String toString() {
            return "UnexpectedFailure";
        }
    }
}
