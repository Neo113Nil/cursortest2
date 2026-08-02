package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zxr extends byr {

    @NotNull
    public static final Parcelable.Creator<zxr> CREATOR = new bwp(28);
    public final int b;
    public final boolean c;
    public final boolean d;

    public zxr(int i) {
        super(i);
        this.b = i;
        this.c = (i & 16) == 16 || i == 3;
        this.d = (i & 32) == 32;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxr) && this.b == ((zxr) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return dfi.c(this.b, "META_CHANGED(metaCode=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.b);
    }
}
