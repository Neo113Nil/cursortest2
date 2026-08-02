package com.squareup.cash.account.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.play.core.review.zzb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AddAccountScreen implements BottomSheetScreen, RestoringScreen {
    public static final Parcelable.Creator<AddAccountScreen> CREATOR = new zzb(25);
    public final Screen exitScreen;

    public AddAccountScreen(Screen screen) {
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
        return (obj instanceof AddAccountScreen) && Intrinsics.areEqual(this.exitScreen, ((AddAccountScreen) obj).exitScreen);
    }

    public final int hashCode() {
        Screen screen = this.exitScreen;
        if (screen == null) {
            return 0;
        }
        return screen.hashCode();
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.exitScreen, "AddAccountScreen(exitScreen=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
    }
}
