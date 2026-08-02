package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.google.android.gms.common.zza;

/* loaded from: classes.dex */
public final class Back implements Screen {
    public static final Back INSTANCE = new Back();
    public static final Parcelable.Creator<Back> CREATOR = new zza(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
