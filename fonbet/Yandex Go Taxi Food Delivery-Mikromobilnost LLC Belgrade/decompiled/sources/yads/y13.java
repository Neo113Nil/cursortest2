package yads;

import android.os.Parcel;
import android.os.Parcelable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class y13 implements Comparable, Parcelable {
    public static final Parcelable.Creator<y13> CREATOR = new x13();
    public final int b;
    public final int c;
    public final int d;

    public y13(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y13 y13Var = (y13) obj;
        int i = this.b - y13Var.b;
        return (i == 0 && (i = this.c - y13Var.c) == 0) ? this.d - y13Var.d : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y13.class == obj.getClass()) {
            y13 y13Var = (y13) obj;
            if (this.b == y13Var.b && this.c == y13Var.c && this.d == y13Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return this.b + Extension.DOT_CHAR + this.c + Extension.DOT_CHAR + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public y13(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
