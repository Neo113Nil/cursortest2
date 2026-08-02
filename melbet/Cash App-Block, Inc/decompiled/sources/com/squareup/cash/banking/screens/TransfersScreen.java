package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class TransfersScreen implements RestoringScreen, BankingScreens {
    public static final Parcelable.Creator<TransfersScreen> CREATOR = new SheetAppMessage.Creator(20);
    public final TransfersScreenTab transfersScreenTab;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class TransfersScreenTab {
        public static final /* synthetic */ TransfersScreenTab[] $VALUES;
        public static final TransfersScreenTab BANK;
        public static final TransfersScreenTab WIRE;

        static {
            TransfersScreenTab transfersScreenTab = new TransfersScreenTab("BANK", 0);
            BANK = transfersScreenTab;
            TransfersScreenTab transfersScreenTab2 = new TransfersScreenTab("WIRE", 1);
            WIRE = transfersScreenTab2;
            $VALUES = new TransfersScreenTab[]{transfersScreenTab, transfersScreenTab2};
        }

        public static TransfersScreenTab valueOf(String str) {
            return (TransfersScreenTab) Enum.valueOf(TransfersScreenTab.class, str);
        }

        public static TransfersScreenTab[] values() {
            return (TransfersScreenTab[]) $VALUES.clone();
        }
    }

    public TransfersScreen(TransfersScreenTab transfersScreenTab) {
        transfersScreenTab.getClass();
        this.transfersScreenTab = transfersScreenTab;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransfersScreen) && this.transfersScreenTab == ((TransfersScreen) obj).transfersScreenTab;
    }

    public final int hashCode() {
        return this.transfersScreenTab.hashCode();
    }

    public final String toString() {
        return "TransfersScreen(transfersScreenTab=" + this.transfersScreenTab + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.transfersScreenTab.name());
    }
}
