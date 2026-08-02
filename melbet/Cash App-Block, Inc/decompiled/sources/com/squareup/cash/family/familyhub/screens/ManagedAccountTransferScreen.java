package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ManagedAccountTransferScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<ManagedAccountTransferScreen> CREATOR = new FamilyHome.Creator(9);
    public final boolean autoPopulateWithdrawAmount;
    public final Money initialAmount;
    public final String selectedInstrumentToken;
    public final TransferType transferType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class TransferType {
        public static final /* synthetic */ TransferType[] $VALUES;
        public static final TransferType ADD_MONEY;
        public static final TransferType WITHDRAW;

        static {
            TransferType transferType = new TransferType("ADD_MONEY", 0);
            ADD_MONEY = transferType;
            TransferType transferType2 = new TransferType("WITHDRAW", 1);
            WITHDRAW = transferType2;
            $VALUES = new TransferType[]{transferType, transferType2};
        }

        public static TransferType valueOf(String str) {
            return (TransferType) Enum.valueOf(TransferType.class, str);
        }

        public static TransferType[] values() {
            return (TransferType[]) $VALUES.clone();
        }
    }

    public ManagedAccountTransferScreen(TransferType transferType, Money money, String str, boolean z) {
        transferType.getClass();
        this.transferType = transferType;
        this.initialAmount = money;
        this.selectedInstrumentToken = str;
        this.autoPopulateWithdrawAmount = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagedAccountTransferScreen)) {
            return false;
        }
        ManagedAccountTransferScreen managedAccountTransferScreen = (ManagedAccountTransferScreen) obj;
        return this.transferType == managedAccountTransferScreen.transferType && Intrinsics.areEqual(this.initialAmount, managedAccountTransferScreen.initialAmount) && Intrinsics.areEqual(this.selectedInstrumentToken, managedAccountTransferScreen.selectedInstrumentToken) && this.autoPopulateWithdrawAmount == managedAccountTransferScreen.autoPopulateWithdrawAmount;
    }

    public final int hashCode() {
        int hashCode = this.transferType.hashCode() * 31;
        Money money = this.initialAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.selectedInstrumentToken;
        return Boolean.hashCode(this.autoPopulateWithdrawAmount) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedAccountTransferScreen(transferType=");
        sb.append(this.transferType);
        sb.append(", initialAmount=");
        sb.append(this.initialAmount);
        sb.append(", selectedInstrumentToken=");
        return re$$ExternalSyntheticOutline0.m(sb, this.selectedInstrumentToken, ", autoPopulateWithdrawAmount=", this.autoPopulateWithdrawAmount, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.transferType.name());
        parcel.writeParcelable(this.initialAmount, i);
        parcel.writeString(this.selectedInstrumentToken);
        parcel.writeInt(this.autoPopulateWithdrawAmount ? 1 : 0);
    }
}
