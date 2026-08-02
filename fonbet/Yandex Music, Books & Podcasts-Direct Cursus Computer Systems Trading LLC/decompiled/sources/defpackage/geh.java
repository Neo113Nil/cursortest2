package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class geh implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<geh> CREATOR = new pnf(26);
    public final int a;
    public final int b;

    public geh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static geh a(geh gehVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = gehVar.a;
        }
        if ((i3 & 2) != 0) {
            i2 = gehVar.b;
        }
        gehVar.getClass();
        return new geh(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geh)) {
            return false;
        }
        geh gehVar = (geh) obj;
        return this.a == gehVar.a && this.b == gehVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("MatrixCoordinates(x=", this.a, this.b, ", y=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
