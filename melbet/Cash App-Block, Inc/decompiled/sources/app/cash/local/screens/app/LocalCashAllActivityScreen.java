package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.screens.app.LocalLoyaltySheet;

/* loaded from: classes3.dex */
public final class LocalCashAllActivityScreen implements LocalScreen, SingleInstanceScreen {
    public static final LocalCashAllActivityScreen INSTANCE = new LocalCashAllActivityScreen();
    public static final Parcelable.Creator<LocalCashAllActivityScreen> CREATOR = new LocalLoyaltySheet.Creator(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LocalCashAllActivityScreen);
    }

    public final int hashCode() {
        return -684041149;
    }

    public final String toString() {
        return "LocalCashAllActivityScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
