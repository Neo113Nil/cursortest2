package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import defpackage.k2x;
import defpackage.khs;
import defpackage.l9;
import defpackage.o8g;
import java.util.ArrayList;

@KeepName
/* loaded from: classes.dex */
public class CommonWalletObject extends l9 {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new k2x(7);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public ArrayList j;
    public khs k;
    public ArrayList l;
    public String m;
    public String n;
    public ArrayList o;
    public boolean p;
    public ArrayList q;
    public ArrayList r;
    public ArrayList s;

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
        int i2 = this.i;
        o8g.q0(10, 4, parcel);
        parcel.writeInt(i2);
        o8g.n0(parcel, 11, this.j);
        o8g.i0(parcel, 12, this.k, i);
        o8g.n0(parcel, 13, this.l);
        o8g.j0(parcel, 14, this.m);
        o8g.j0(parcel, 15, this.n);
        o8g.n0(parcel, 16, this.o);
        boolean z = this.p;
        o8g.q0(17, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        o8g.n0(parcel, 18, this.q);
        o8g.n0(parcel, 19, this.r);
        o8g.n0(parcel, 20, this.s);
        o8g.p0(parcel, o0);
    }
}
