package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class xc6 implements ad6 {
    public static final xc6 a = new xc6();

    @NotNull
    public static final Parcelable.Creator<xc6> CREATOR = new kg4(17);

    @Override // defpackage.ad6
    public final String R() {
        return "lumen";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xc6);
    }

    public final int hashCode() {
        return -1859631604;
    }

    public final String toString() {
        return "Lumen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
