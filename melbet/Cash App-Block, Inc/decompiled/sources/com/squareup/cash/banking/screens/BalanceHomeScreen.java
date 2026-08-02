package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.protos.cash.unicorn.balance_home_ui.BalanceHomeUi$FocusArea;

/* loaded from: classes.dex */
public final class BalanceHomeScreen implements BankingScreens, RestoringScreen {
    public static final Parcelable.Creator<BalanceHomeScreen> CREATOR = new SheetAppMessage.Creator(10);
    public final BalanceHomeUi$FocusArea focusArea;

    public BalanceHomeScreen(BalanceHomeUi$FocusArea balanceHomeUi$FocusArea) {
        this.focusArea = balanceHomeUi$FocusArea;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BalanceHomeScreen) && this.focusArea == ((BalanceHomeScreen) obj).focusArea;
    }

    public final int hashCode() {
        BalanceHomeUi$FocusArea balanceHomeUi$FocusArea = this.focusArea;
        if (balanceHomeUi$FocusArea == null) {
            return 0;
        }
        return balanceHomeUi$FocusArea.hashCode();
    }

    public final String toString() {
        return "BalanceHomeScreen(focusArea=" + this.focusArea + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        BalanceHomeUi$FocusArea balanceHomeUi$FocusArea = this.focusArea;
        if (balanceHomeUi$FocusArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(balanceHomeUi$FocusArea.name());
        }
    }
}
