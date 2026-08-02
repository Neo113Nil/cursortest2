package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.SheetAppMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RecurringDepositsScreen implements BankingScreens, RestoringScreen {
    public static final Parcelable.Creator<RecurringDepositsScreen> CREATOR = new SheetAppMessage.Creator(19);
    public final Screen origin;

    public RecurringDepositsScreen(Screen screen) {
        this.origin = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecurringDepositsScreen) && Intrinsics.areEqual(this.origin, ((RecurringDepositsScreen) obj).origin);
    }

    public final int hashCode() {
        Screen screen = this.origin;
        if (screen == null) {
            return 0;
        }
        return screen.hashCode();
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.origin, "RecurringDepositsScreen(origin=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.origin, i);
    }
}
