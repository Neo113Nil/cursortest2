package com.squareup.cash.bitcoin.presenters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinDepositsQrCodeModel implements Parcelable {
    public static final Parcelable.Creator<BitcoinDepositsQrCodeModel> CREATOR = new Creator();
    public final BitcoinPayments qrCodeInvoice;
    public final String shareUrl;
    public final String unifiedQrCode;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BitcoinDepositsQrCodeModel(parcel.readString(), (BitcoinPayments) parcel.readParcelable(BitcoinDepositsQrCodeModel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BitcoinDepositsQrCodeModel[i];
        }
    }

    public BitcoinDepositsQrCodeModel(String str, BitcoinPayments bitcoinPayments, String str2) {
        str.getClass();
        bitcoinPayments.getClass();
        this.unifiedQrCode = str;
        this.qrCodeInvoice = bitcoinPayments;
        this.shareUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinDepositsQrCodeModel)) {
            return false;
        }
        BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel = (BitcoinDepositsQrCodeModel) obj;
        return Intrinsics.areEqual(this.unifiedQrCode, bitcoinDepositsQrCodeModel.unifiedQrCode) && Intrinsics.areEqual(this.qrCodeInvoice, bitcoinDepositsQrCodeModel.qrCodeInvoice) && Intrinsics.areEqual(this.shareUrl, bitcoinDepositsQrCodeModel.shareUrl);
    }

    public final int hashCode() {
        int hashCode = (this.qrCodeInvoice.hashCode() + (this.unifiedQrCode.hashCode() * 31)) * 31;
        String str = this.shareUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinDepositsQrCodeModel(unifiedQrCode=");
        sb.append(this.unifiedQrCode);
        sb.append(", qrCodeInvoice=");
        sb.append(this.qrCodeInvoice);
        sb.append(", shareUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shareUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.unifiedQrCode);
        parcel.writeParcelable(this.qrCodeInvoice, i);
        parcel.writeString(this.shareUrl);
    }
}
