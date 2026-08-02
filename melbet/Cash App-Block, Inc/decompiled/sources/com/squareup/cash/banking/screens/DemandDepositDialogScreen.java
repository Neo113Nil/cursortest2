package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.protos.franklin.common.BalanceData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DemandDepositDialogScreen implements BankingDialogs {
    public static final Parcelable.Creator<DemandDepositDialogScreen> CREATOR = new SheetAppMessage.Creator(16);
    public final BalanceData.Dialog dialog;

    public DemandDepositDialogScreen(BalanceData.Dialog dialog) {
        dialog.getClass();
        this.dialog = dialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DemandDepositDialogScreen) && Intrinsics.areEqual(this.dialog, ((DemandDepositDialogScreen) obj).dialog);
    }

    public final int hashCode() {
        return this.dialog.hashCode();
    }

    public final String toString() {
        return "DemandDepositDialogScreen(dialog=" + this.dialog + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.dialog, i);
    }
}
