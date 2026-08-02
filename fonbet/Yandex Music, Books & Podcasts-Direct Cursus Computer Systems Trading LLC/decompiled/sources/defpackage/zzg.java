package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzg extends l9 {
    public static final Parcelable.Creator<zzg> CREATOR = new oex(19);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public ArrayList l;
    public khs m;
    public ArrayList n;
    public String o;
    public String p;
    public ArrayList q;
    public boolean r;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;
    public xzg v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.j0(parcel, 4, this.c);
        o8g.j0(parcel, 5, this.d);
        o8g.j0(parcel, 6, this.e);
        o8g.j0(parcel, 7, this.f);
        o8g.j0(parcel, 8, this.g);
        o8g.j0(parcel, 9, this.h);
        o8g.j0(parcel, 10, this.i);
        o8g.j0(parcel, 11, this.j);
        int i2 = this.k;
        o8g.q0(12, 4, parcel);
        parcel.writeInt(i2);
        o8g.n0(parcel, 13, this.l);
        o8g.i0(parcel, 14, this.m, i);
        o8g.n0(parcel, 15, this.n);
        o8g.j0(parcel, 16, this.o);
        o8g.j0(parcel, 17, this.p);
        o8g.n0(parcel, 18, this.q);
        boolean z = this.r;
        o8g.q0(19, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        o8g.n0(parcel, 20, this.s);
        o8g.n0(parcel, 21, this.t);
        o8g.n0(parcel, 22, this.u);
        o8g.i0(parcel, 23, this.v, i);
        o8g.p0(parcel, o0);
    }
}
