package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lek extends l9 {
    public static final Parcelable.Creator<lek> CREATOR = new pnx(0);
    public boolean a;
    public boolean b;
    public lx3 c;
    public boolean d;
    public idq e;
    public ArrayList f;
    public tfk g;
    public n6t h;
    public boolean i;
    public String j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        boolean z = this.a;
        o8g.q0(1, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.b;
        o8g.q0(2, 4, parcel);
        parcel.writeInt(z2 ? 1 : 0);
        o8g.i0(parcel, 3, this.c, i);
        boolean z3 = this.d;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(z3 ? 1 : 0);
        o8g.i0(parcel, 5, this.e, i);
        o8g.f0(parcel, 6, this.f);
        o8g.i0(parcel, 7, this.g, i);
        o8g.i0(parcel, 8, this.h, i);
        boolean z4 = this.i;
        o8g.q0(9, 4, parcel);
        parcel.writeInt(z4 ? 1 : 0);
        o8g.j0(parcel, 10, this.j);
        o8g.p0(parcel, o0);
    }
}
