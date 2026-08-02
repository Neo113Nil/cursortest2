package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class y6h implements b7h {
    public static final y6h a = new y6h();

    @NotNull
    public static final Parcelable.Creator<y6h> CREATOR = new pnf(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y6h);
    }

    public final int hashCode() {
        return -314165758;
    }

    public final String toString() {
        return "Root";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
