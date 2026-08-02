package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class wc6 implements ad6 {
    public static final wc6 a = new wc6();

    @NotNull
    public static final Parcelable.Creator<wc6> CREATOR = new kg4(16);

    @Override // defpackage.ad6
    public final String R() {
        return "kids";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wc6);
    }

    public final int hashCode() {
        return 1879632942;
    }

    public final String toString() {
        return "Kids";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
