package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class x6h implements b7h {
    public static final x6h a = new x6h();

    @NotNull
    public static final Parcelable.Creator<x6h> CREATOR = new pnf(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x6h);
    }

    public final int hashCode() {
        return -1064888732;
    }

    public final String toString() {
        return "FavoriteTracks";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
