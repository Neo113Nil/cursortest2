package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.SheetAppMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OverdraftCoverageSheetScreen implements BankingSheets {
    public static final Parcelable.Creator<OverdraftCoverageSheetScreen> CREATOR = new SheetAppMessage.Creator(17);
    public final Screen exitScreen;

    public OverdraftCoverageSheetScreen(Screen screen) {
        screen.getClass();
        this.exitScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftCoverageSheetScreen) && Intrinsics.areEqual(this.exitScreen, ((OverdraftCoverageSheetScreen) obj).exitScreen);
    }

    public final int hashCode() {
        return this.exitScreen.hashCode();
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.exitScreen, "OverdraftCoverageSheetScreen(exitScreen=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
    }
}
