package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.google.android.gms.common.zza;

/* loaded from: classes.dex */
public final class MoneybotPreambleEditorScreen implements MoneybotScreen, RestoringScreen {
    public static final MoneybotPreambleEditorScreen INSTANCE = new MoneybotPreambleEditorScreen();
    public static final Parcelable.Creator<MoneybotPreambleEditorScreen> CREATOR = new zza(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MoneybotPreambleEditorScreen);
    }

    public final int hashCode() {
        return 845655400;
    }

    public final String toString() {
        return "MoneybotPreambleEditorScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
