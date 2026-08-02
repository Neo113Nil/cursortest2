package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.passcode.screens.EndAppLock;

/* loaded from: classes.dex */
public final class LocalTabScreen implements LocalScreen, SingleInstanceScreen {
    public static final LocalTabScreen INSTANCE = new LocalTabScreen();
    public static final Parcelable.Creator<LocalTabScreen> CREATOR = new EndAppLock.Creator(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LocalTabScreen);
    }

    public final int hashCode() {
        return -1083270597;
    }

    public final String toString() {
        return "LocalTabScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
