package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaperMoneyDepositBarcodeScreen implements BlockersScreens.SwappingBlockersScreens, Screen {
    public static final Parcelable.Creator<PaperMoneyDepositBarcodeScreen> CREATOR = new Recipient.Creator(19);
    public final BlockersData blockersData;
    public final Origin origin;
    public final PaperCashDepositBlocker paperCashDepositBlocker;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Origin {
        public static final /* synthetic */ Origin[] $VALUES;
        public static final Origin BARCODE_EXPIRATION;
        public static final Origin MAP;
        public static final Origin MERCHANT_DETAILS;

        static {
            Origin origin = new Origin("BARCODE_EXPIRATION", 0);
            BARCODE_EXPIRATION = origin;
            Origin origin2 = new Origin("MAP", 1);
            MAP = origin2;
            Origin origin3 = new Origin("MERCHANT_DETAILS", 2);
            MERCHANT_DETAILS = origin3;
            $VALUES = new Origin[]{origin, origin2, origin3};
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public PaperMoneyDepositBarcodeScreen(PaperCashDepositBlocker paperCashDepositBlocker, Origin origin, BlockersData blockersData) {
        paperCashDepositBlocker.getClass();
        origin.getClass();
        blockersData.getClass();
        this.paperCashDepositBlocker = paperCashDepositBlocker;
        this.origin = origin;
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperMoneyDepositBarcodeScreen)) {
            return false;
        }
        PaperMoneyDepositBarcodeScreen paperMoneyDepositBarcodeScreen = (PaperMoneyDepositBarcodeScreen) obj;
        return Intrinsics.areEqual(this.paperCashDepositBlocker, paperMoneyDepositBarcodeScreen.paperCashDepositBlocker) && this.origin == paperMoneyDepositBarcodeScreen.origin && Intrinsics.areEqual(this.blockersData, paperMoneyDepositBarcodeScreen.blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blockersData.hashCode() + ((this.origin.hashCode() + (this.paperCashDepositBlocker.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PaperMoneyDepositBarcodeScreen(paperCashDepositBlocker=" + this.paperCashDepositBlocker + ", origin=" + this.origin + ", blockersData=" + this.blockersData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.paperCashDepositBlocker, i);
        parcel.writeString(this.origin.name());
        parcel.writeParcelable(this.blockersData, i);
    }
}
