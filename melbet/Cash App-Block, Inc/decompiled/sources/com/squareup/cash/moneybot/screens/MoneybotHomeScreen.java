package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.google.android.gms.common.zza;

/* loaded from: classes.dex */
public final class MoneybotHomeScreen implements MoneybotScreen, RestoringScreen {
    public static final MoneybotHomeScreen INSTANCE = new MoneybotHomeScreen();
    public static final Parcelable.Creator<MoneybotHomeScreen> CREATOR = new zza(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MoneybotHomeScreen);
    }

    public final int hashCode() {
        return -216554482;
    }

    public final String toString() {
        return "MoneybotHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
