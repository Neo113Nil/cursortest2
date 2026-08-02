package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.passcode.screens.EndAppLock;

/* loaded from: classes3.dex */
public final class LocalOrdersScreen implements LocalScreen {
    public static final LocalOrdersScreen INSTANCE = new LocalOrdersScreen();
    public static final Parcelable.Creator<LocalOrdersScreen> CREATOR = new EndAppLock.Creator(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LocalOrdersScreen);
    }

    public final int hashCode() {
        return 1716524951;
    }

    public final String toString() {
        return "LocalOrdersScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
