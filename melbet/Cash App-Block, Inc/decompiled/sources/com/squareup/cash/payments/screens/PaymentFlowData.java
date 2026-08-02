package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaymentFlowData extends Parcelable {

    public final class PayLinkFlowData implements PaymentFlowData {
        public static final Parcelable.Creator<PayLinkFlowData> CREATOR = new NearbyPayer.Creator(13);
        public final String token;

        public PayLinkFlowData(String str) {
            str.getClass();
            this.token = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PayLinkFlowData) && Intrinsics.areEqual(this.token, ((PayLinkFlowData) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PayLinkFlowData(token=", this.token, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
        }
    }

    public final class StablecoinQrScanFlowData implements PaymentFlowData {
        public static final Parcelable.Creator<StablecoinQrScanFlowData> CREATOR = new NearbyPayer.Creator(14);
        public final String scannedData;

        public StablecoinQrScanFlowData(String str) {
            str.getClass();
            this.scannedData = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StablecoinQrScanFlowData) && Intrinsics.areEqual(this.scannedData, ((StablecoinQrScanFlowData) obj).scannedData);
        }

        public final int hashCode() {
            return this.scannedData.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StablecoinQrScanFlowData(scannedData=", this.scannedData, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.scannedData);
        }
    }

    public final class StandardFlowData implements PaymentFlowData {
        public static final Parcelable.Creator<StandardFlowData> CREATOR = new NearbyPayer.Creator(15);
        public final Redacted note;
        public final Redacted recipient;

        public /* synthetic */ StandardFlowData(RedactedString redactedString, RedactedParcelable redactedParcelable, int i) {
            this((i & 1) != 0 ? null : redactedString, (i & 2) != 0 ? null : redactedParcelable);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardFlowData)) {
                return false;
            }
            StandardFlowData standardFlowData = (StandardFlowData) obj;
            return Intrinsics.areEqual(this.note, standardFlowData.note) && Intrinsics.areEqual(this.recipient, standardFlowData.recipient);
        }

        public final int hashCode() {
            Redacted redacted = this.note;
            int hashCode = (redacted == null ? 0 : redacted.hashCode()) * 31;
            Redacted redacted2 = this.recipient;
            return hashCode + (redacted2 != null ? redacted2.hashCode() : 0);
        }

        public final String toString() {
            return "StandardFlowData(note=" + this.note + ", recipient=" + this.recipient + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.note, i);
            parcel.writeParcelable(this.recipient, i);
        }

        public StandardFlowData(Redacted redacted, Redacted redacted2) {
            this.note = redacted;
            this.recipient = redacted2;
        }
    }
}
