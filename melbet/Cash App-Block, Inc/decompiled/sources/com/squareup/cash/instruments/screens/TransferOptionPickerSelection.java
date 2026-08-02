package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.instruments.common.Instrument;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TransferOptionPickerSelection implements Parcelable {
    public static final Parcelable.Creator<TransferOptionPickerSelection> CREATOR = new Instrument.Creator(18);
    public final String token;
    public final TransferOptions transferOption;

    public TransferOptionPickerSelection(TransferOptions transferOptions, String str) {
        transferOptions.getClass();
        this.transferOption = transferOptions;
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
        if (!(obj instanceof TransferOptionPickerSelection)) {
            return false;
        }
        TransferOptionPickerSelection transferOptionPickerSelection = (TransferOptionPickerSelection) obj;
        return this.transferOption == transferOptionPickerSelection.transferOption && Intrinsics.areEqual(this.token, transferOptionPickerSelection.token);
    }

    public final int hashCode() {
        int hashCode = this.transferOption.hashCode() * 31;
        String str = this.token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TransferOptionPickerSelection(transferOption=" + this.transferOption + ", token=" + this.token + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.transferOption.name());
        parcel.writeString(this.token);
    }
}
