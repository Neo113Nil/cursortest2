package com.gamericefishpro.space.n9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<t4> CREATOR = new com.gamericefishpro.space.h.a(14);
    public final boolean A;
    public final boolean B;
    public final long C;
    public final String D;
    public final long E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final Boolean I;
    public final long J;
    public final List K;
    public final String L;
    public final String M;
    public final String N;
    public final boolean O;
    public final long P;
    public final int Q;
    public final String R;
    public final int S;
    public final long T;
    public final String U;
    public final String V;
    public final long W;
    public final int X;
    public final String d;
    public final String e;
    public final String i;
    public final String v;
    public final long w;
    public final long y;
    public final String z;

    public t4(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        com.gamericefishpro.space.v8.c0.d(str);
        this.d = str;
        this.e = true == TextUtils.isEmpty(str2) ? null : str2;
        this.i = str3;
        this.C = j;
        this.v = str4;
        this.w = j2;
        this.y = j3;
        this.z = str5;
        this.A = z;
        this.B = z2;
        this.D = str6;
        this.E = j4;
        this.F = i;
        this.G = z3;
        this.H = z4;
        this.I = bool;
        this.J = j5;
        this.K = list;
        this.L = str7;
        this.M = str8;
        this.N = str9;
        this.O = z5;
        this.P = j6;
        this.Q = i2;
        this.R = str10;
        this.S = i3;
        this.T = j7;
        this.U = str11;
        this.V = str12;
        this.W = j8;
        this.X = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = com.gamericefishpro.space.i9.y3.V(parcel, 20293);
        com.gamericefishpro.space.i9.y3.Q(parcel, 2, this.d);
        com.gamericefishpro.space.i9.y3.Q(parcel, 3, this.e);
        com.gamericefishpro.space.i9.y3.Q(parcel, 4, this.i);
        com.gamericefishpro.space.i9.y3.Q(parcel, 5, this.v);
        com.gamericefishpro.space.i9.y3.U(parcel, 6, 8);
        parcel.writeLong(this.w);
        com.gamericefishpro.space.i9.y3.U(parcel, 7, 8);
        parcel.writeLong(this.y);
        com.gamericefishpro.space.i9.y3.Q(parcel, 8, this.z);
        com.gamericefishpro.space.i9.y3.U(parcel, 9, 4);
        parcel.writeInt(this.A ? 1 : 0);
        com.gamericefishpro.space.i9.y3.U(parcel, 10, 4);
        parcel.writeInt(this.B ? 1 : 0);
        com.gamericefishpro.space.i9.y3.U(parcel, 11, 8);
        parcel.writeLong(this.C);
        com.gamericefishpro.space.i9.y3.Q(parcel, 12, this.D);
        com.gamericefishpro.space.i9.y3.U(parcel, 14, 8);
        parcel.writeLong(this.E);
        com.gamericefishpro.space.i9.y3.U(parcel, 15, 4);
        parcel.writeInt(this.F);
        com.gamericefishpro.space.i9.y3.U(parcel, 16, 4);
        parcel.writeInt(this.G ? 1 : 0);
        com.gamericefishpro.space.i9.y3.U(parcel, 18, 4);
        parcel.writeInt(this.H ? 1 : 0);
        Boolean bool = this.I;
        if (bool != null) {
            com.gamericefishpro.space.i9.y3.U(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        com.gamericefishpro.space.i9.y3.U(parcel, 22, 8);
        parcel.writeLong(this.J);
        List<String> list = this.K;
        if (list != null) {
            int iV2 = com.gamericefishpro.space.i9.y3.V(parcel, 23);
            parcel.writeStringList(list);
            com.gamericefishpro.space.i9.y3.W(parcel, iV2);
        }
        com.gamericefishpro.space.i9.y3.Q(parcel, 25, this.L);
        com.gamericefishpro.space.i9.y3.Q(parcel, 26, this.M);
        com.gamericefishpro.space.i9.y3.Q(parcel, 27, this.N);
        com.gamericefishpro.space.i9.y3.U(parcel, 28, 4);
        parcel.writeInt(this.O ? 1 : 0);
        com.gamericefishpro.space.i9.y3.U(parcel, 29, 8);
        parcel.writeLong(this.P);
        com.gamericefishpro.space.i9.y3.U(parcel, 30, 4);
        parcel.writeInt(this.Q);
        com.gamericefishpro.space.i9.y3.Q(parcel, 31, this.R);
        com.gamericefishpro.space.i9.y3.U(parcel, 32, 4);
        parcel.writeInt(this.S);
        com.gamericefishpro.space.i9.y3.U(parcel, 34, 8);
        parcel.writeLong(this.T);
        com.gamericefishpro.space.i9.y3.Q(parcel, 35, this.U);
        com.gamericefishpro.space.i9.y3.Q(parcel, 36, this.V);
        com.gamericefishpro.space.i9.y3.U(parcel, 37, 8);
        parcel.writeLong(this.W);
        com.gamericefishpro.space.i9.y3.U(parcel, 38, 4);
        parcel.writeInt(this.X);
        com.gamericefishpro.space.i9.y3.W(parcel, iV);
    }

    public t4(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        this.d = str;
        this.e = str2;
        this.i = str3;
        this.C = j3;
        this.v = str4;
        this.w = j;
        this.y = j2;
        this.z = str5;
        this.A = z;
        this.B = z2;
        this.D = str6;
        this.E = j4;
        this.F = i;
        this.G = z3;
        this.H = z4;
        this.I = bool;
        this.J = j5;
        this.K = arrayList;
        this.L = str7;
        this.M = str8;
        this.N = str9;
        this.O = z5;
        this.P = j6;
        this.Q = i2;
        this.R = str10;
        this.S = i3;
        this.T = j7;
        this.U = str11;
        this.V = str12;
        this.W = j8;
        this.X = i4;
    }
}
