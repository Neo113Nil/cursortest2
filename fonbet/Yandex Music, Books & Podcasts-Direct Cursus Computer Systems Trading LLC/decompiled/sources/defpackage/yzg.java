package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class yzg extends l9 {
    public static final Parcelable.Creator<yzg> CREATOR = new k5x(28);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        int i2 = this.a;
        o8g.q0(2, 4, parcel);
        parcel.writeInt(i2);
        o8g.j0(parcel, 3, this.b);
        double d = this.c;
        o8g.q0(4, 8, parcel);
        parcel.writeDouble(d);
        o8g.j0(parcel, 5, this.d);
        long j = this.e;
        o8g.q0(6, 8, parcel);
        parcel.writeLong(j);
        int i3 = this.f;
        o8g.q0(7, 4, parcel);
        parcel.writeInt(i3);
        o8g.p0(parcel, o0);
    }
}
