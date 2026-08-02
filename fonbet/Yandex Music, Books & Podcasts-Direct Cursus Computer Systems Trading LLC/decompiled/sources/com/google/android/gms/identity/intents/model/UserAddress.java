package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.k2x;
import defpackage.l9;
import defpackage.o8g;

/* loaded from: classes.dex */
public final class UserAddress extends l9 implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new k2x(5);
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
    public String k;
    public String l;
    public boolean m;
    public String n;
    public String o;

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
        o8g.j0(parcel, 12, this.k);
        o8g.j0(parcel, 13, this.l);
        boolean z = this.m;
        o8g.q0(14, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        o8g.j0(parcel, 15, this.n);
        o8g.j0(parcel, 16, this.o);
        o8g.p0(parcel, o0);
    }
}
