package app.cash.payment.asset;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.passcode.screens.EndAppLock;
import com.squareup.protos.franklin.investing.resources.InvestPaymentData;
import com.squareup.protos.giftly.GiftCardPaymentData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface PaymentData extends Parcelable {

    public final class GiftCardPaymentDataWrapper implements PaymentData {
        public static final Parcelable.Creator<GiftCardPaymentDataWrapper> CREATOR = new EndAppLock.Creator(20);
        public final GiftCardPaymentData giftCardPaymentData;
        public final SourceContext sourceContext;

        public interface SourceContext extends Parcelable {

            public final class DeepLink implements SourceContext {
                public static final DeepLink INSTANCE = new DeepLink();
                public static final Parcelable.Creator<DeepLink> CREATOR = new EndAppLock.Creator(21);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof DeepLink);
                }

                @Override // app.cash.payment.asset.PaymentData.GiftCardPaymentDataWrapper.SourceContext
                public final String getReferrerFlowToken() {
                    return null;
                }

                public final int hashCode() {
                    return -912042823;
                }

                public final String toString() {
                    return "DeepLink";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class Discover implements SourceContext {
                public static final Parcelable.Creator<Discover> CREATOR = new EndAppLock.Creator(22);
                public final String referrerFlowToken;

                public Discover(String str) {
                    str.getClass();
                    this.referrerFlowToken = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Discover) && Intrinsics.areEqual(this.referrerFlowToken, ((Discover) obj).referrerFlowToken);
                }

                @Override // app.cash.payment.asset.PaymentData.GiftCardPaymentDataWrapper.SourceContext
                public final String getReferrerFlowToken() {
                    return this.referrerFlowToken;
                }

                public final int hashCode() {
                    return this.referrerFlowToken.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Discover(referrerFlowToken=", this.referrerFlowToken, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.referrerFlowToken);
                }
            }

            public final class PaymentPad implements SourceContext {
                public static final PaymentPad INSTANCE = new PaymentPad();
                public static final Parcelable.Creator<PaymentPad> CREATOR = new EndAppLock.Creator(23);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof PaymentPad);
                }

                @Override // app.cash.payment.asset.PaymentData.GiftCardPaymentDataWrapper.SourceContext
                public final String getReferrerFlowToken() {
                    return null;
                }

                public final int hashCode() {
                    return -1168676448;
                }

                public final String toString() {
                    return "PaymentPad";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            String getReferrerFlowToken();
        }

        public GiftCardPaymentDataWrapper(GiftCardPaymentData giftCardPaymentData, SourceContext sourceContext) {
            giftCardPaymentData.getClass();
            sourceContext.getClass();
            this.giftCardPaymentData = giftCardPaymentData;
            this.sourceContext = sourceContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GiftCardPaymentDataWrapper)) {
                return false;
            }
            GiftCardPaymentDataWrapper giftCardPaymentDataWrapper = (GiftCardPaymentDataWrapper) obj;
            return Intrinsics.areEqual(this.giftCardPaymentData, giftCardPaymentDataWrapper.giftCardPaymentData) && Intrinsics.areEqual(this.sourceContext, giftCardPaymentDataWrapper.sourceContext);
        }

        public final int hashCode() {
            return this.sourceContext.hashCode() + (this.giftCardPaymentData.hashCode() * 31);
        }

        public final String toString() {
            return "GiftCardPaymentDataWrapper(giftCardPaymentData=" + this.giftCardPaymentData + ", sourceContext=" + this.sourceContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.giftCardPaymentData, i);
            parcel.writeParcelable(this.sourceContext, i);
        }
    }

    public final class InvestPaymentDataWrapper implements PaymentData {
        public static final Parcelable.Creator<InvestPaymentDataWrapper> CREATOR = new EndAppLock.Creator(24);
        public final InvestPaymentData investPaymentData;

        public InvestPaymentDataWrapper(InvestPaymentData investPaymentData) {
            investPaymentData.getClass();
            this.investPaymentData = investPaymentData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvestPaymentDataWrapper) && Intrinsics.areEqual(this.investPaymentData, ((InvestPaymentDataWrapper) obj).investPaymentData);
        }

        public final int hashCode() {
            return this.investPaymentData.hashCode();
        }

        public final String toString() {
            return "InvestPaymentDataWrapper(investPaymentData=" + this.investPaymentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.investPaymentData, i);
        }
    }
}
