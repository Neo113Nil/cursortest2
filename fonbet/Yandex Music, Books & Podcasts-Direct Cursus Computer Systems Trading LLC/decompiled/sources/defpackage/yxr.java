package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class yxr extends byr {
    public static final yxr b = new yxr(4);

    @NotNull
    public static final Parcelable.Creator<yxr> CREATOR = new bwp(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yxr);
    }

    public final int hashCode() {
        return -1505946937;
    }

    public final String toString() {
        return "IGNORED";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
