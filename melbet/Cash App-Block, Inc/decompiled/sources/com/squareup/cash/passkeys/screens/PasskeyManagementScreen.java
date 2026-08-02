package com.squareup.cash.passkeys.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;

/* loaded from: classes.dex */
public final class PasskeyManagementScreen implements Screen {
    public static final PasskeyManagementScreen INSTANCE = new PasskeyManagementScreen();
    public static final Parcelable.Creator<PasskeyManagementScreen> CREATOR = new P2PListScreen.Creator(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PasskeyManagementScreen);
    }

    public final int hashCode() {
        return 867406815;
    }

    public final String toString() {
        return "PasskeyManagementScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
