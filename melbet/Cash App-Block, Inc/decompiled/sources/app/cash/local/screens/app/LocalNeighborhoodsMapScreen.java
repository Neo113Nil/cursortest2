package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.screens.app.LocalLoyaltySheet;

/* loaded from: classes.dex */
public final class LocalNeighborhoodsMapScreen implements LocalScreen {
    public static final LocalNeighborhoodsMapScreen INSTANCE = new LocalNeighborhoodsMapScreen();
    public static final Parcelable.Creator<LocalNeighborhoodsMapScreen> CREATOR = new LocalLoyaltySheet.Creator(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LocalNeighborhoodsMapScreen);
    }

    public final int hashCode() {
        return 1672289193;
    }

    public final String toString() {
        return "LocalNeighborhoodsMapScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
