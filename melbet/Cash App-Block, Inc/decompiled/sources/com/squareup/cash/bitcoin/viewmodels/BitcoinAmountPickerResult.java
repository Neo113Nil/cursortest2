package com.squareup.cash.bitcoin.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinAmountPickerResult implements Parcelable {
    public static final Parcelable.Creator<BitcoinAmountPickerResult> CREATOR = new MoveBitcoinScreen.Creator(16);
    public final Money bitcoinAmount;
    public final String note;
    public final Money userInputtedAmount;

    public BitcoinAmountPickerResult(Money money, Money money2, String str) {
        money.getClass();
        this.bitcoinAmount = money;
        this.userInputtedAmount = money2;
        this.note = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinAmountPickerResult)) {
            return false;
        }
        BitcoinAmountPickerResult bitcoinAmountPickerResult = (BitcoinAmountPickerResult) obj;
        return Intrinsics.areEqual(this.bitcoinAmount, bitcoinAmountPickerResult.bitcoinAmount) && Intrinsics.areEqual(this.userInputtedAmount, bitcoinAmountPickerResult.userInputtedAmount) && Intrinsics.areEqual(this.note, bitcoinAmountPickerResult.note);
    }

    public final int hashCode() {
        int hashCode = this.bitcoinAmount.hashCode() * 31;
        Money money = this.userInputtedAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.note;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinAmountPickerResult(bitcoinAmount=");
        sb.append(this.bitcoinAmount);
        sb.append(", userInputtedAmount=");
        sb.append(this.userInputtedAmount);
        sb.append(", note=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.note, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.bitcoinAmount, i);
        parcel.writeParcelable(this.userInputtedAmount, i);
        parcel.writeString(this.note);
    }
}
