package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.appmessages.SheetAppMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RecurringDepositsFirstTimeUserScreen implements BankingScreens, NeverInBackStackScreen {
    public static final Parcelable.Creator<RecurringDepositsFirstTimeUserScreen> CREATOR = new SheetAppMessage.Creator(18);
    public final Screen exitScreen;
    public final Screen origin;

    public RecurringDepositsFirstTimeUserScreen(Screen screen, Screen screen2) {
        this.exitScreen = screen;
        this.origin = screen2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringDepositsFirstTimeUserScreen)) {
            return false;
        }
        RecurringDepositsFirstTimeUserScreen recurringDepositsFirstTimeUserScreen = (RecurringDepositsFirstTimeUserScreen) obj;
        return Intrinsics.areEqual(this.exitScreen, recurringDepositsFirstTimeUserScreen.exitScreen) && Intrinsics.areEqual(this.origin, recurringDepositsFirstTimeUserScreen.origin);
    }

    public final int hashCode() {
        Screen screen = this.exitScreen;
        int hashCode = (screen == null ? 0 : screen.hashCode()) * 31;
        Screen screen2 = this.origin;
        return hashCode + (screen2 != null ? screen2.hashCode() : 0);
    }

    public final String toString() {
        return "RecurringDepositsFirstTimeUserScreen(exitScreen=" + this.exitScreen + ", origin=" + this.origin + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeParcelable(this.origin, i);
    }
}
