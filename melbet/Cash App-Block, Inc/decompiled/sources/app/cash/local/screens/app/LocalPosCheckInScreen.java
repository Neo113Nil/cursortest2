package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.passcode.screens.EndAppLock;

/* loaded from: classes.dex */
public final class LocalPosCheckInScreen implements LocalScreen, NeverInBackStackScreen {
    public static final LocalPosCheckInScreen INSTANCE = new LocalPosCheckInScreen();
    public static final Parcelable.Creator<LocalPosCheckInScreen> CREATOR = new EndAppLock.Creator(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LocalPosCheckInScreen);
    }

    public final int hashCode() {
        return -58239477;
    }

    public final String toString() {
        return "LocalPosCheckInScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
