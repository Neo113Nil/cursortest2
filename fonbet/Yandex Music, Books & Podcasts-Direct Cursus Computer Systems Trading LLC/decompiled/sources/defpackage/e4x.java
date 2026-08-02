package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e4x extends l9 {
    public static final Parcelable.Creator<e4x> CREATOR = new k2x(20);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public e4x(long j, long j2, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e4x) {
            e4x e4xVar = (e4x) obj;
            if (this.a == e4xVar.a && this.b == e4xVar.b && this.c == e4xVar.c && this.d == e4xVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.a + " Cell status: " + this.b + " elapsed time NS: " + this.d + " system time ms: " + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b);
        o8g.q0(3, 8, parcel);
        parcel.writeLong(this.c);
        o8g.q0(4, 8, parcel);
        parcel.writeLong(this.d);
        o8g.p0(parcel, o0);
    }
}
