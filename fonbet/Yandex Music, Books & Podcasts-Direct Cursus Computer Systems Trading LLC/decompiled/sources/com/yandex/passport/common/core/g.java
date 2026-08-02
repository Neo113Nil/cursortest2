package com.yandex.passport.common.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.tlm;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new com.yandex.passport.api.impl.a(9);
    public final boolean A;
    public final boolean B;
    public final List C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final Long K;
    public final String L;
    public final Map X;
    public final Long Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final String s;
    public final String t;
    public final int u;
    public final String v;
    public final boolean v0;
    public final String w;
    public final boolean w0;
    public final boolean x;
    public final String y;
    public final boolean z;

    public g(int i, int i2, long j, long j2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        str3.getClass();
        list.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = i;
        this.i = str6;
        this.j = str7;
        this.k = z;
        this.l = str8;
        this.m = z2;
        this.n = str9;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = i2;
        this.v = str13;
        this.w = str14;
        this.x = z6;
        this.y = str15;
        this.z = z7;
        this.A = z8;
        this.B = z9;
        this.C = list;
        this.D = z10;
        this.E = z11;
        this.F = z12;
        this.G = z13;
        this.H = z14;
        this.I = z15;
        this.J = z16;
        this.K = l;
        this.L = str16;
        this.X = map;
        this.Y = l2;
        this.Z = z17;
        this.v0 = z18;
        this.w0 = z19;
    }

    public static g a(g gVar, String str, String str2, long j, int i) {
        String str3 = (i & 1) != 0 ? gVar.a : str;
        String str4 = (i & 2) != 0 ? gVar.b : str2;
        long j2 = (i & 4) != 0 ? gVar.c : j;
        long j3 = gVar.d;
        String str5 = gVar.e;
        String str6 = gVar.f;
        String str7 = gVar.g;
        int i2 = gVar.h;
        String str8 = gVar.i;
        String str9 = gVar.j;
        boolean z = gVar.k;
        String str10 = gVar.l;
        boolean z2 = gVar.m;
        String str11 = gVar.n;
        boolean z3 = gVar.o;
        boolean z4 = gVar.p;
        boolean z5 = gVar.q;
        String str12 = gVar.r;
        String str13 = gVar.s;
        String str14 = gVar.t;
        int i3 = gVar.u;
        String str15 = gVar.v;
        String str16 = gVar.w;
        boolean z6 = gVar.x;
        String str17 = gVar.y;
        boolean z7 = gVar.z;
        boolean z8 = gVar.A;
        boolean z9 = gVar.B;
        List list = gVar.C;
        boolean z10 = gVar.D;
        boolean z11 = gVar.E;
        boolean z12 = gVar.F;
        boolean z13 = gVar.G;
        boolean z14 = gVar.H;
        boolean z15 = gVar.I;
        boolean z16 = gVar.J;
        Long l = gVar.K;
        String str18 = gVar.L;
        Map map = gVar.X;
        Long l2 = gVar.Y;
        boolean z17 = gVar.Z;
        boolean z18 = gVar.v0;
        boolean z19 = gVar.w0;
        gVar.getClass();
        str5.getClass();
        list.getClass();
        map.getClass();
        return new g(i2, i3, j2, j3, l, l2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, list, map, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b) && com.yandex.passport.common.time.a.e(this.c, gVar.c) && this.d == gVar.d && Intrinsics.d(this.e, gVar.e) && Intrinsics.d(this.f, gVar.f) && Intrinsics.d(this.g, gVar.g) && this.h == gVar.h && Intrinsics.d(this.i, gVar.i) && Intrinsics.d(this.j, gVar.j) && this.k == gVar.k && Intrinsics.d(this.l, gVar.l) && this.m == gVar.m && Intrinsics.d(this.n, gVar.n) && this.o == gVar.o && this.p == gVar.p && this.q == gVar.q && Intrinsics.d(this.r, gVar.r) && Intrinsics.d(this.s, gVar.s) && Intrinsics.d(this.t, gVar.t) && this.u == gVar.u && Intrinsics.d(this.v, gVar.v) && Intrinsics.d(this.w, gVar.w) && this.x == gVar.x && Intrinsics.d(this.y, gVar.y) && this.z == gVar.z && this.A == gVar.A && this.B == gVar.B && Intrinsics.d(this.C, gVar.C) && this.D == gVar.D && this.E == gVar.E && this.F == gVar.F && this.G == gVar.G && this.H == gVar.H && this.I == gVar.I && this.J == gVar.J && Intrinsics.d(this.K, gVar.K) && Intrinsics.d(this.L, gVar.L) && Intrinsics.d(this.X, gVar.X) && Intrinsics.d(this.Y, gVar.Y) && this.Z == gVar.Z && this.v0 == gVar.v0 && this.w0 == gVar.w0;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = k5r.c(tlm.c(this.d, tlm.c(this.c, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.e);
        String str3 = this.f;
        int hashCode2 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int a = f1d.a(this.h, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.i;
        int hashCode3 = (a + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int e = k5r.e((hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.k);
        String str7 = this.l;
        int e2 = k5r.e((e + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.m);
        String str8 = this.n;
        int e3 = k5r.e(k5r.e(k5r.e((e2 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.o), 31, this.p), 31, this.q);
        String str9 = this.r;
        int hashCode4 = (e3 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.s;
        int hashCode5 = (hashCode4 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.t;
        int a2 = f1d.a(this.u, (hashCode5 + (str11 == null ? 0 : str11.hashCode())) * 31, 31);
        String str12 = this.v;
        int hashCode6 = (a2 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.w;
        int e4 = k5r.e((hashCode6 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.x);
        String str14 = this.y;
        int e5 = k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.d(k5r.e(k5r.e(k5r.e((e4 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J);
        Long l = this.K;
        int hashCode7 = (e5 + (l == null ? 0 : l.hashCode())) * 31;
        String str15 = this.L;
        int b = f1d.b(this.X, (hashCode7 + (str15 == null ? 0 : str15.hashCode())) * 31, 31);
        Long l2 = this.Y;
        return Boolean.hashCode(this.w0) + k5r.e(k5r.e((b + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.Z), 31, this.v0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(body=");
        sb.append(this.a);
        sb.append(", eTag=");
        sb.append(this.b);
        sb.append(", retrievalTime=");
        sb.append((Object) com.yandex.passport.common.time.a.g(this.c));
        sb.append(", uidValue=");
        sb.append(this.d);
        sb.append(", displayName=");
        sb.append(this.e);
        sb.append(", publicName=");
        sb.append(this.f);
        sb.append(", normalizedDisplayLogin=");
        sb.append(this.g);
        sb.append(", primaryAliasType=");
        sb.append(this.h);
        sb.append(", nativeDefaultEmail=");
        sb.append(this.i);
        sb.append(", avatarUrl=");
        sb.append(this.j);
        sb.append(", isAvatarEmpty=");
        sb.append(this.k);
        sb.append(", socialProviderCode=");
        sb.append(this.l);
        sb.append(", hasPassword=");
        sb.append(this.m);
        sb.append(", yandexoidLogin=");
        sb.append(this.n);
        sb.append(", isBetaTester=");
        sb.append(this.o);
        sb.append(", hasPlus=");
        sb.append(this.p);
        sb.append(", hasMusicSubscription=");
        sb.append(this.q);
        sb.append(", firstName=");
        sb.append(this.r);
        sb.append(", lastName=");
        sb.append(this.s);
        sb.append(", birthday=");
        sb.append(this.t);
        sb.append(", xTokenIssuedAt=");
        sb.append(this.u);
        sb.append(", displayLogin=");
        sb.append(this.v);
        sb.append(", publicId=");
        sb.append(this.w);
        sb.append(", isChild=");
        sb.append(this.x);
        sb.append(", machineReadableLogin=");
        sb.append(this.y);
        sb.append(", is2faEnabled=");
        sb.append(this.z);
        sb.append(", isSms2faEnabled=");
        sb.append(this.A);
        sb.append(", isRfc2faEnabled=");
        sb.append(this.B);
        sb.append(", partitions=");
        sb.append(this.C);
        sb.append(", isPictureLoginForbidden=");
        sb.append(this.D);
        sb.append(", isXtokenTrusted=");
        sb.append(this.E);
        sb.append(", hasPlusCard=");
        sb.append(this.F);
        sb.append(", hasProCard=");
        sb.append(this.G);
        sb.append(", hasFamily=");
        sb.append(this.H);
        sb.append(", isDriveUser=");
        sb.append(this.I);
        sb.append(", isTaxiCompanyBound=");
        sb.append(this.J);
        sb.append(", locationId=");
        sb.append(this.K);
        sb.append(", phoneNumber=");
        sb.append(this.L);
        sb.append(", filterParameters=");
        sb.append(this.X);
        sb.append(", muidValue=");
        sb.append(this.Y);
        sb.append(", hasMasterToken=");
        sb.append(this.Z);
        sb.append(", isBrowserAccount=");
        sb.append(this.v0);
        sb.append(", hasWebAuthNCredential=");
        return dfi.j(sb, this.w0, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeString(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeString(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeString(this.y);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        Iterator n = f1d.n(parcel, this.C);
        while (n.hasNext()) {
            parcel.writeString(((e) n.next()).a);
        }
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.J ? 1 : 0);
        Long l = this.K;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.L);
        Iterator s = k.s(this.X, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            Set set = (Set) entry.getValue();
            parcel.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString((String) it.next());
            }
        }
        Long l2 = this.Y;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.v0 ? 1 : 0);
        parcel.writeInt(this.w0 ? 1 : 0);
    }
}
