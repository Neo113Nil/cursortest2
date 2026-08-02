package com.squareup.cash.savings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.cash.screens.BoostDetailsScreen;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TransferOutScreen$Full implements SavingsScreen {
    public static final Parcelable.Creator<TransferOutScreen$Full> CREATOR = new BoostDetailsScreen.Creator(4);
    public final TransferConfig.TransferOutConfig config;
    public final SavingsTransferContext context;
    public final Money currentAmount;
    public final Money maxAmount;
    public final SavingsScreen origin;
    public final String savingsFolderToken;

    public TransferOutScreen$Full(Money money, Money money2, String str, TransferConfig.TransferOutConfig transferOutConfig, SavingsScreen savingsScreen, SavingsTransferContext savingsTransferContext) {
        money.getClass();
        money2.getClass();
        str.getClass();
        transferOutConfig.getClass();
        savingsScreen.getClass();
        this.currentAmount = money;
        this.maxAmount = money2;
        this.savingsFolderToken = str;
        this.config = transferOutConfig;
        this.origin = savingsScreen;
        this.context = savingsTransferContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferOutScreen$Full)) {
            return false;
        }
        TransferOutScreen$Full transferOutScreen$Full = (TransferOutScreen$Full) obj;
        return Intrinsics.areEqual(this.currentAmount, transferOutScreen$Full.currentAmount) && Intrinsics.areEqual(this.maxAmount, transferOutScreen$Full.maxAmount) && Intrinsics.areEqual(this.savingsFolderToken, transferOutScreen$Full.savingsFolderToken) && Intrinsics.areEqual(this.config, transferOutScreen$Full.config) && Intrinsics.areEqual(this.origin, transferOutScreen$Full.origin) && Intrinsics.areEqual(this.context, transferOutScreen$Full.context);
    }

    public final int hashCode() {
        int hashCode = (this.origin.hashCode() + ((this.config.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, this.currentAmount.hashCode() * 31, 31), 31, this.savingsFolderToken)) * 31)) * 31;
        SavingsTransferContext savingsTransferContext = this.context;
        return hashCode + (savingsTransferContext == null ? 0 : savingsTransferContext.hashCode());
    }

    public final String toString() {
        return "Full(currentAmount=" + this.currentAmount + ", maxAmount=" + this.maxAmount + ", savingsFolderToken=" + this.savingsFolderToken + ", config=" + this.config + ", origin=" + this.origin + ", context=" + this.context + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.currentAmount, i);
        parcel.writeParcelable(this.maxAmount, i);
        parcel.writeString(this.savingsFolderToken);
        parcel.writeParcelable(this.config, i);
        parcel.writeParcelable(this.origin, i);
        parcel.writeParcelable(this.context, i);
    }
}
