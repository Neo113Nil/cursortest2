package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class xxr extends byr {
    public static final xxr b = new xxr(2);

    @NotNull
    public static final Parcelable.Creator<xxr> CREATOR = new bwp(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xxr);
    }

    public final int hashCode() {
        return -1707899378;
    }

    public final String toString() {
        return "DELETED";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
