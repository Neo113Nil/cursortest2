package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i9o extends q9o {
    public static final i9o a = new i9o();

    @NotNull
    public static final Parcelable.Creator<i9o> CREATOR = new z8o(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i9o);
    }

    public final int hashCode() {
        return 765370619;
    }

    public final String toString() {
        return "SbpNoAppsResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
