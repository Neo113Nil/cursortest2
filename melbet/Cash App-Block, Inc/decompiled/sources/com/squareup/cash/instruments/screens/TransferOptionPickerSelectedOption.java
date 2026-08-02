package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.screens.TransferOptionPickerDisplayIcon;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TransferOptionPickerSelectedOption implements Parcelable {
    public static final Parcelable.Creator<TransferOptionPickerSelectedOption> CREATOR = new Instrument.Creator(17);
    public final String balance;
    public final TransferOptionPickerDisplayIcon icon;
    public final String label;
    public final Money maxAmount;
    public final TransferOptionPickerSelection selection;

    public TransferOptionPickerSelectedOption(TransferOptionPickerSelection transferOptionPickerSelection, String str, TransferOptionPickerDisplayIcon transferOptionPickerDisplayIcon, String str2, Money money) {
        transferOptionPickerSelection.getClass();
        str.getClass();
        this.selection = transferOptionPickerSelection;
        this.label = str;
        this.icon = transferOptionPickerDisplayIcon;
        this.balance = str2;
        this.maxAmount = money;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferOptionPickerSelectedOption)) {
            return false;
        }
        TransferOptionPickerSelectedOption transferOptionPickerSelectedOption = (TransferOptionPickerSelectedOption) obj;
        return Intrinsics.areEqual(this.selection, transferOptionPickerSelectedOption.selection) && Intrinsics.areEqual(this.label, transferOptionPickerSelectedOption.label) && Intrinsics.areEqual(this.icon, transferOptionPickerSelectedOption.icon) && Intrinsics.areEqual(this.balance, transferOptionPickerSelectedOption.balance) && Intrinsics.areEqual(this.maxAmount, transferOptionPickerSelectedOption.maxAmount);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.selection.hashCode() * 31, 31, this.label);
        TransferOptionPickerDisplayIcon transferOptionPickerDisplayIcon = this.icon;
        int hashCode = (m + (transferOptionPickerDisplayIcon == null ? 0 : transferOptionPickerDisplayIcon.hashCode())) * 31;
        String str = this.balance;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.maxAmount;
        return hashCode2 + (money != null ? money.hashCode() : 0);
    }

    public final String toString() {
        return "TransferOptionPickerSelectedOption(selection=" + this.selection + ", label=" + this.label + ", icon=" + this.icon + ", balance=" + this.balance + ", maxAmount=" + this.maxAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.selection.writeToParcel(parcel, i);
        parcel.writeString(this.label);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.balance);
        parcel.writeParcelable(this.maxAmount, i);
    }

    public /* synthetic */ TransferOptionPickerSelectedOption(TransferOptionPickerSelection transferOptionPickerSelection, String str, TransferOptionPickerDisplayIcon.Instrument instrument, String str2, int i) {
        this(transferOptionPickerSelection, str, instrument, (i & 8) != 0 ? null : str2, (Money) null);
    }
}
