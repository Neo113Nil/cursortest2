package com.squareup.cash.paymentpad.views;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final class MainPaymentPadViewState implements Parcelable {
    public static final Parcelable.Creator<MainPaymentPadViewState> CREATOR = new Creator();
    public final BitcoinDisplayUnits bitcoinDisplayUnits;
    public final CurrencyCode currencyCode;
    public final String rawAmount;
    public final String transferRawAmount;
    public final boolean updated;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MainPaymentPadViewState(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CurrencyCode.valueOf(parcel.readString()), parcel.readInt() != 0 ? BitcoinDisplayUnits.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainPaymentPadViewState[i];
        }
    }

    public MainPaymentPadViewState(String str, String str2, CurrencyCode currencyCode, BitcoinDisplayUnits bitcoinDisplayUnits, boolean z) {
        str.getClass();
        this.rawAmount = str;
        this.transferRawAmount = str2;
        this.currencyCode = currencyCode;
        this.bitcoinDisplayUnits = bitcoinDisplayUnits;
        this.updated = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPaymentPadViewState)) {
            return false;
        }
        MainPaymentPadViewState mainPaymentPadViewState = (MainPaymentPadViewState) obj;
        return Intrinsics.areEqual(this.rawAmount, mainPaymentPadViewState.rawAmount) && Intrinsics.areEqual(this.transferRawAmount, mainPaymentPadViewState.transferRawAmount) && this.currencyCode == mainPaymentPadViewState.currencyCode && this.bitcoinDisplayUnits == mainPaymentPadViewState.bitcoinDisplayUnits && this.updated == mainPaymentPadViewState.updated;
    }

    public final int hashCode() {
        int hashCode = this.rawAmount.hashCode() * 31;
        String str = this.transferRawAmount;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CurrencyCode currencyCode = this.currencyCode;
        int hashCode3 = (hashCode2 + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31;
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoinDisplayUnits;
        return Boolean.hashCode(this.updated) + ((hashCode3 + (bitcoinDisplayUnits != null ? bitcoinDisplayUnits.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MainPaymentPadViewState(rawAmount=", this.rawAmount, ", transferRawAmount=", this.transferRawAmount, ", currencyCode=");
        m.append(this.currencyCode);
        m.append(", bitcoinDisplayUnits=");
        m.append(this.bitcoinDisplayUnits);
        m.append(", updated=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.updated, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.rawAmount);
        parcel.writeString(this.transferRawAmount);
        CurrencyCode currencyCode = this.currencyCode;
        if (currencyCode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(currencyCode.name());
        }
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoinDisplayUnits;
        if (bitcoinDisplayUnits == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bitcoinDisplayUnits.name());
        }
        parcel.writeInt(this.updated ? 1 : 0);
    }
}
