package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class w6h implements b7h {
    public static final w6h a = new w6h();

    @NotNull
    public static final Parcelable.Creator<w6h> CREATOR = new pnf(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w6h);
    }

    public final int hashCode() {
        return -1085853625;
    }

    public final String toString() {
        return "Downloaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
