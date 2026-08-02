package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.SkippableStep;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PaymentConfigurationFlow implements Parcelable {

    public final class Default extends PaymentConfigurationFlow {
        public static final Parcelable.Creator<Default> CREATOR = new NearbyPayer.Creator(3);
        public final PaymentFlowData.StandardFlowData data;
        public final boolean personalization;
        public final List steps;

        public Default(PaymentFlowData.StandardFlowData standardFlowData, boolean z) {
            standardFlowData.getClass();
            this.data = standardFlowData;
            this.personalization = z;
            this.steps = CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentConfigurationStep.NavigableStep[]{PaymentConfigurationStep.NavigableStep.SelectRecipient.INSTANCE, SkippableStep.InputNote.INSTANCE, PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE});
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r5 = (Default) obj;
            return Intrinsics.areEqual(this.data, r5.data) && this.personalization == r5.personalization;
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final PaymentFlowData getData() {
            return this.data;
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final List getSteps() {
            return this.steps;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.personalization) + (this.data.hashCode() * 31);
        }

        public final String toString() {
            return "Default(data=" + this.data + ", personalization=" + this.personalization + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
            parcel.writeInt(this.personalization ? 1 : 0);
        }
    }

    public final class Lite extends PaymentConfigurationFlow {
        public static final Parcelable.Creator<Lite> CREATOR = new NearbyPayer.Creator(4);
        public final PaymentFlowData.StandardFlowData data;
        public final List steps;

        public Lite(PaymentFlowData.StandardFlowData standardFlowData) {
            standardFlowData.getClass();
            this.data = standardFlowData;
            this.steps = CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentConfigurationStep.NavigableStep[]{PaymentConfigurationStep.NavigableStep.SelectRecipient.INSTANCE, PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE});
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Lite) && Intrinsics.areEqual(this.data, ((Lite) obj).data);
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final PaymentFlowData getData() {
            return this.data;
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final List getSteps() {
            return this.steps;
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "Lite(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
        }
    }

    public final class PayLink extends PaymentConfigurationFlow {
        public static final Parcelable.Creator<PayLink> CREATOR = new NearbyPayer.Creator(5);
        public final PaymentFlowData.StandardFlowData data;
        public final String link;
        public final List steps;

        public PayLink(PaymentFlowData.StandardFlowData standardFlowData, String str) {
            standardFlowData.getClass();
            this.data = standardFlowData;
            this.link = str;
            this.steps = CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentConfigurationStep.NavigableStep[]{SkippableStep.InputNote.INSTANCE, PaymentConfigurationStep.NavigableStep.RequestShareOption.INSTANCE, PaymentConfigurationStep.NavigableStep.SelectRecipient.INSTANCE, PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE});
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayLink)) {
                return false;
            }
            PayLink payLink = (PayLink) obj;
            return Intrinsics.areEqual(this.data, payLink.data) && Intrinsics.areEqual(this.link, payLink.link);
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final PaymentFlowData getData() {
            return this.data;
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final List getSteps() {
            return this.steps;
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode() * 31;
            String str = this.link;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "PayLink(data=" + this.data + ", link=" + this.link + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
            parcel.writeString(this.link);
        }
    }

    public final class PayLinkReview extends PaymentConfigurationFlow {
        public static final Parcelable.Creator<PayLinkReview> CREATOR = new NearbyPayer.Creator(6);
        public final PaymentFlowData.PayLinkFlowData data;
        public final List steps;

        public PayLinkReview(PaymentFlowData.PayLinkFlowData payLinkFlowData) {
            payLinkFlowData.getClass();
            this.data = payLinkFlowData;
            this.steps = CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentConfigurationStep[]{PaymentConfigurationStep$TransientStep$Loading.INSTANCE, PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE});
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PayLinkReview) && Intrinsics.areEqual(this.data, ((PayLinkReview) obj).data);
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final PaymentFlowData getData() {
            return this.data;
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final List getSteps() {
            return this.steps;
        }

        public final int hashCode() {
            return this.data.token.hashCode();
        }

        public final String toString() {
            return "PayLinkReview(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
        }
    }

    public final class PersonFirst extends PaymentConfigurationFlow {
        public static final Parcelable.Creator<PersonFirst> CREATOR = new NearbyPayer.Creator(7);
        public final PaymentFlowData.StandardFlowData data;
        public final boolean personalization;
        public final List steps;

        public PersonFirst(PaymentFlowData.StandardFlowData standardFlowData, boolean z) {
            standardFlowData.getClass();
            this.data = standardFlowData;
            this.personalization = z;
            this.steps = CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentConfigurationStep.NavigableStep[]{SkippableStep.InputAmount.INSTANCE, SkippableStep.InputNote.INSTANCE, PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE});
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersonFirst)) {
                return false;
            }
            PersonFirst personFirst = (PersonFirst) obj;
            return Intrinsics.areEqual(this.data, personFirst.data) && this.personalization == personFirst.personalization;
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final PaymentFlowData getData() {
            return this.data;
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final List getSteps() {
            return this.steps;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.personalization) + (this.data.hashCode() * 31);
        }

        public final String toString() {
            return "PersonFirst(data=" + this.data + ", personalization=" + this.personalization + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
            parcel.writeInt(this.personalization ? 1 : 0);
        }
    }

    public final class StablecoinQrScanFlow extends PaymentConfigurationFlow {
        public static final Parcelable.Creator<StablecoinQrScanFlow> CREATOR = new NearbyPayer.Creator(8);
        public final PaymentFlowData.StablecoinQrScanFlowData data;
        public final List steps;

        public StablecoinQrScanFlow(PaymentFlowData.StablecoinQrScanFlowData stablecoinQrScanFlowData) {
            stablecoinQrScanFlowData.getClass();
            this.data = stablecoinQrScanFlowData;
            this.steps = CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentConfigurationStep[]{PaymentConfigurationStep$TransientStep$Loading.INSTANCE, SkippableStep.InputAmount.INSTANCE, SkippableStep.SelectStablecoinWithdrawalOption.INSTANCE, PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE});
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StablecoinQrScanFlow) && Intrinsics.areEqual(this.data, ((StablecoinQrScanFlow) obj).data);
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final PaymentFlowData getData() {
            return this.data;
        }

        @Override // com.squareup.cash.payments.screens.PaymentConfigurationFlow
        public final List getSteps() {
            return this.steps;
        }

        public final int hashCode() {
            return this.data.scannedData.hashCode();
        }

        public final String toString() {
            return "StablecoinQrScanFlow(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
        }
    }

    public abstract PaymentFlowData getData();

    public abstract List getSteps();
}
