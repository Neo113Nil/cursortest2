package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class wxr extends byr {
    public static final wxr b = new wxr(1);

    @NotNull
    public static final Parcelable.Creator<wxr> CREATOR = new bwp(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wxr);
    }

    public final int hashCode() {
        return 844575797;
    }

    public final String toString() {
        return "ADDED";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
