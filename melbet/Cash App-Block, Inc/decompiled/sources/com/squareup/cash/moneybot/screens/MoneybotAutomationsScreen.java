package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;

/* loaded from: classes.dex */
public final class MoneybotAutomationsScreen implements MoneybotScreen {
    public static final MoneybotAutomationsScreen INSTANCE = new MoneybotAutomationsScreen();
    public static final Parcelable.Creator<MoneybotAutomationsScreen> CREATOR = new zza(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MoneybotAutomationsScreen);
    }

    public final int hashCode() {
        return 1187406469;
    }

    public final String toString() {
        return "MoneybotAutomationsScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
