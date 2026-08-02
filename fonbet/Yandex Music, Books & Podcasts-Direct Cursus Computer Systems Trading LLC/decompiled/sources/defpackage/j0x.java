package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j0x extends l9 {
    public static final Parcelable.Creator<j0x> CREATOR = new vzw(9);
    public double a;
    public boolean b;
    public int c;
    public jw0 d;
    public int e;
    public a2x f;
    public double g;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0x)) {
            return false;
        }
        j0x j0xVar = (j0x) obj;
        if (this.a == j0xVar.a && this.b == j0xVar.b && this.c == j0xVar.c && d94.d(this.d, j0xVar.d) && this.e == j0xVar.e) {
            a2x a2xVar = this.f;
            if (d94.d(a2xVar, a2xVar) && this.g == j0xVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        double d = this.a;
        o8g.q0(2, 8, parcel);
        parcel.writeDouble(d);
        boolean z = this.b;
        o8g.q0(3, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.c;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(i2);
        o8g.i0(parcel, 5, this.d, i);
        int i3 = this.e;
        o8g.q0(6, 4, parcel);
        parcel.writeInt(i3);
        o8g.i0(parcel, 7, this.f, i);
        double d2 = this.g;
        o8g.q0(8, 8, parcel);
        parcel.writeDouble(d2);
        o8g.p0(parcel, o0);
    }
}
