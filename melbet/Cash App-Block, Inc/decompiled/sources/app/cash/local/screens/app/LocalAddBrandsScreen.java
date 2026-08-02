package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.screens.app.LocalLoyaltySheet;

/* loaded from: classes.dex */
public final class LocalAddBrandsScreen implements LocalScreen {
    public static final LocalAddBrandsScreen INSTANCE = new LocalAddBrandsScreen();
    public static final Parcelable.Creator<LocalAddBrandsScreen> CREATOR = new LocalLoyaltySheet.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LocalAddBrandsScreen);
    }

    public final int hashCode() {
        return -452734221;
    }

    public final String toString() {
        return "LocalAddBrandsScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
