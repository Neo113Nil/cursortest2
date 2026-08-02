package com.yandex.passport.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.f1d;
import defpackage.i5f;
import defpackage.k5r;
import defpackage.mhp;
import defpackage.quj;
import defpackage.tlm;
import defpackage.vhp;
import defpackage.x3f;
import defpackage.z5i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class w implements Parcelable {
    public static final arf[] x0;
    public static final i5f y0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final List D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final Long L;
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
    public final String h;
    public final int i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final String t;
    public final String u;
    public final int v;
    public final boolean v0;
    public final String w;
    public final boolean w0;
    public final String x;
    public final boolean y;
    public final String z;

    @NotNull
    public static final v Companion = new v();

    @NotNull
    public static final Parcelable.Creator<w> CREATOR = new com.yandex.passport.api.impl.a(17);

    static {
        bwf bwfVar = bwf.b;
        x0 = new arf[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, btf.a(bwfVar, new com.yandex.passport.api.exception.l(11)), null, null, null, null, null, null, null, null, btf.a(bwfVar, new com.yandex.passport.api.exception.l(12)), null, null, null, null};
        y0 = quj.r(x3f.d, new com.yandex.passport.common.network.r(3));
    }

    public w(int i, int i2, long j, String str, String str2, String str3, String str4, int i3, String str5, String str6, boolean z, String str7, boolean z2, String str8, boolean z3, boolean z4, boolean z5, String str9, String str10, String str11, int i4, String str12, String str13, boolean z6, String str14, boolean z7, boolean z8, boolean z9, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l, Map map, Long l2, boolean z17, boolean z18, boolean z19) {
        Map map2;
        if (35 != (i & 35)) {
            int[] iArr = {i, i2};
            int[] iArr2 = {35, 0};
            mhp descriptor = u.a.getDescriptor();
            descriptor.getClass();
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < 2; i5++) {
                int i6 = iArr2[i5] & (~iArr[i5]);
                if (i6 != 0) {
                    for (int i7 = 0; i7 < 32; i7++) {
                        if ((i6 & 1) != 0) {
                            arrayList.add(descriptor.f((i5 * 32) + i7));
                        }
                        i6 >>>= 1;
                    }
                }
            }
            throw new z5i(descriptor.i(), arrayList);
        }
        this.a = null;
        this.b = null;
        this.c = 0L;
        this.d = j;
        this.e = str;
        if ((i & 4) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 8) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 16) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        this.i = i3;
        if ((i & 64) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 128) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 256) == 0) {
            this.l = false;
        } else {
            this.l = z;
        }
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            this.m = null;
        } else {
            this.m = str7;
        }
        if ((i & 1024) == 0) {
            this.n = false;
        } else {
            this.n = z2;
        }
        if ((i & 2048) == 0) {
            this.o = null;
        } else {
            this.o = str8;
        }
        if ((i & 4096) == 0) {
            this.p = false;
        } else {
            this.p = z3;
        }
        if ((i & RemoteCameraConfig.Notification.ID) == 0) {
            this.q = false;
        } else {
            this.q = z4;
        }
        if ((i & 16384) == 0) {
            this.r = false;
        } else {
            this.r = z5;
        }
        if ((32768 & i) == 0) {
            this.s = null;
        } else {
            this.s = str9;
        }
        if ((65536 & i) == 0) {
            this.t = null;
        } else {
            this.t = str10;
        }
        if ((131072 & i) == 0) {
            this.u = null;
        } else {
            this.u = str11;
        }
        if ((262144 & i) == 0) {
            this.v = 0;
        } else {
            this.v = i4;
        }
        if ((524288 & i) == 0) {
            this.w = null;
        } else {
            this.w = str12;
        }
        if ((1048576 & i) == 0) {
            this.x = null;
        } else {
            this.x = str13;
        }
        if ((2097152 & i) == 0) {
            this.y = false;
        } else {
            this.y = z6;
        }
        if ((4194304 & i) == 0) {
            this.z = null;
        } else {
            this.z = str14;
        }
        if ((8388608 & i) == 0) {
            this.A = false;
        } else {
            this.A = z7;
        }
        if ((16777216 & i) == 0) {
            this.B = false;
        } else {
            this.B = z8;
        }
        if ((33554432 & i) == 0) {
            this.C = false;
        } else {
            this.C = z9;
        }
        this.D = (67108864 & i) == 0 ? c5b.a : list;
        if ((134217728 & i) == 0) {
            this.E = false;
        } else {
            this.E = z10;
        }
        if ((268435456 & i) == 0) {
            this.F = false;
        } else {
            this.F = z11;
        }
        if ((536870912 & i) == 0) {
            this.G = false;
        } else {
            this.G = z12;
        }
        if ((1073741824 & i) == 0) {
            this.H = false;
        } else {
            this.H = z13;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.I = false;
        } else {
            this.I = z14;
        }
        if ((i2 & 1) == 0) {
            this.J = false;
        } else {
            this.J = z15;
        }
        if ((i2 & 2) == 0) {
            this.K = false;
        } else {
            this.K = z16;
        }
        if ((i2 & 4) == 0) {
            this.L = null;
        } else {
            this.L = l;
        }
        if ((i2 & 8) == 0) {
            map2 = e5b.a;
            map2.getClass();
        } else {
            map2 = map;
        }
        this.X = map2;
        if ((i2 & 16) == 0) {
            this.Y = null;
        } else {
            this.Y = l2;
        }
        if ((i2 & 32) == 0) {
            this.Z = false;
        } else {
            this.Z = z17;
        }
        if ((i2 & 64) == 0) {
            this.v0 = false;
        } else {
            this.v0 = z18;
        }
        if ((i2 & 128) == 0) {
            this.w0 = false;
        } else {
            this.w0 = z19;
        }
    }

    public static w a(w wVar, String str, String str2, long j) {
        long j2 = wVar.d;
        String str3 = wVar.e;
        String str4 = wVar.f;
        String str5 = wVar.g;
        String str6 = wVar.h;
        int i = wVar.i;
        String str7 = wVar.j;
        String str8 = wVar.k;
        boolean z = wVar.l;
        String str9 = wVar.m;
        boolean z2 = wVar.n;
        String str10 = wVar.o;
        boolean z3 = wVar.p;
        boolean z4 = wVar.q;
        boolean z5 = wVar.r;
        String str11 = wVar.s;
        String str12 = wVar.t;
        String str13 = wVar.u;
        int i2 = wVar.v;
        String str14 = wVar.w;
        String str15 = wVar.x;
        boolean z6 = wVar.y;
        String str16 = wVar.z;
        boolean z7 = wVar.A;
        boolean z8 = wVar.B;
        boolean z9 = wVar.C;
        List list = wVar.D;
        boolean z10 = wVar.E;
        boolean z11 = wVar.F;
        boolean z12 = wVar.G;
        boolean z13 = wVar.H;
        boolean z14 = wVar.I;
        boolean z15 = wVar.J;
        boolean z16 = wVar.K;
        Long l = wVar.L;
        Map map = wVar.X;
        Long l2 = wVar.Y;
        boolean z17 = wVar.Z;
        boolean z18 = wVar.v0;
        boolean z19 = wVar.w0;
        wVar.getClass();
        str3.getClass();
        list.getClass();
        map.getClass();
        return new w(i, i2, j, j2, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, list, map, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.a, wVar.a) && Intrinsics.d(this.b, wVar.b) && com.yandex.passport.common.time.a.e(this.c, wVar.c) && this.d == wVar.d && Intrinsics.d(this.e, wVar.e) && Intrinsics.d(this.f, wVar.f) && Intrinsics.d(this.g, wVar.g) && Intrinsics.d(this.h, wVar.h) && this.i == wVar.i && Intrinsics.d(this.j, wVar.j) && Intrinsics.d(this.k, wVar.k) && this.l == wVar.l && Intrinsics.d(this.m, wVar.m) && this.n == wVar.n && Intrinsics.d(this.o, wVar.o) && this.p == wVar.p && this.q == wVar.q && this.r == wVar.r && Intrinsics.d(this.s, wVar.s) && Intrinsics.d(this.t, wVar.t) && Intrinsics.d(this.u, wVar.u) && this.v == wVar.v && Intrinsics.d(this.w, wVar.w) && Intrinsics.d(this.x, wVar.x) && this.y == wVar.y && Intrinsics.d(this.z, wVar.z) && this.A == wVar.A && this.B == wVar.B && this.C == wVar.C && Intrinsics.d(this.D, wVar.D) && this.E == wVar.E && this.F == wVar.F && this.G == wVar.G && this.H == wVar.H && this.I == wVar.I && this.J == wVar.J && this.K == wVar.K && Intrinsics.d(this.L, wVar.L) && Intrinsics.d(this.X, wVar.X) && Intrinsics.d(this.Y, wVar.Y) && this.Z == wVar.Z && this.v0 == wVar.v0 && this.w0 == wVar.w0;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = k5r.c(tlm.c(this.d, tlm.c(this.c, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.e);
        String str3 = this.f;
        int hashCode2 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int a = f1d.a(this.i, (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.j;
        int hashCode4 = (a + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int e = k5r.e((hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.l);
        String str8 = this.m;
        int e2 = k5r.e((e + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.n);
        String str9 = this.o;
        int e3 = k5r.e(k5r.e(k5r.e((e2 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.p), 31, this.q), 31, this.r);
        String str10 = this.s;
        int hashCode5 = (e3 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.t;
        int hashCode6 = (hashCode5 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.u;
        int a2 = f1d.a(this.v, (hashCode6 + (str12 == null ? 0 : str12.hashCode())) * 31, 31);
        String str13 = this.w;
        int hashCode7 = (a2 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.x;
        int e4 = k5r.e((hashCode7 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.y);
        String str15 = this.z;
        int e5 = k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.d(k5r.e(k5r.e(k5r.e((e4 + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K);
        Long l = this.L;
        int b = f1d.b(this.X, (e5 + (l == null ? 0 : l.hashCode())) * 31, 31);
        Long l2 = this.Y;
        return Boolean.hashCode(this.w0) + k5r.e(k5r.e((b + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.Z), 31, this.v0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfoData(body=");
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
        sb.append(", securePhoneNumber=");
        sb.append(this.g);
        sb.append(", normalizedDisplayLogin=");
        sb.append(this.h);
        sb.append(", primaryAliasType=");
        sb.append(this.i);
        sb.append(", nativeDefaultEmail=");
        sb.append(this.j);
        sb.append(", avatarUrl=");
        sb.append(this.k);
        sb.append(", isAvatarEmpty=");
        sb.append(this.l);
        sb.append(", socialProviderCode=");
        sb.append(this.m);
        sb.append(", hasPassword=");
        sb.append(this.n);
        sb.append(", yandexoidLogin=");
        sb.append(this.o);
        sb.append(", isBetaTester=");
        sb.append(this.p);
        sb.append(", hasPlus=");
        sb.append(this.q);
        sb.append(", hasMusicSubscription=");
        sb.append(this.r);
        sb.append(", firstName=");
        sb.append(this.s);
        sb.append(", lastName=");
        sb.append(this.t);
        sb.append(", birthday=");
        sb.append(this.u);
        sb.append(", xTokenIssuedAt=");
        sb.append(this.v);
        sb.append(", displayLogin=");
        sb.append(this.w);
        sb.append(", publicId=");
        sb.append(this.x);
        sb.append(", isChild=");
        sb.append(this.y);
        sb.append(", machineReadableLogin=");
        sb.append(this.z);
        sb.append(", is2faEnabled=");
        sb.append(this.A);
        sb.append(", isSms2faEnabled=");
        sb.append(this.B);
        sb.append(", isRfc2faEnabled=");
        sb.append(this.C);
        sb.append(", partitions=");
        sb.append(this.D);
        sb.append(", isPictureLoginForbidden=");
        sb.append(this.E);
        sb.append(", isXtokenTrusted=");
        sb.append(this.F);
        sb.append(", hasPlusCard=");
        sb.append(this.G);
        sb.append(", hasProCard=");
        sb.append(this.H);
        sb.append(", hasFamily=");
        sb.append(this.I);
        sb.append(", isDriveUser=");
        sb.append(this.J);
        sb.append(", isTaxiCompanyBound=");
        sb.append(this.K);
        sb.append(", locationId=");
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
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeString(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeString(this.z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeStringList(this.D);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        Long l = this.L;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Iterator s = com.appsflyer.internal.k.s(this.X, parcel);
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

    public w(int i, int i2, long j, long j2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
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
        this.h = str6;
        this.i = i;
        this.j = str7;
        this.k = str8;
        this.l = z;
        this.m = str9;
        this.n = z2;
        this.o = str10;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = i2;
        this.w = str14;
        this.x = str15;
        this.y = z6;
        this.z = str16;
        this.A = z7;
        this.B = z8;
        this.C = z9;
        this.D = list;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = z13;
        this.I = z14;
        this.J = z15;
        this.K = z16;
        this.L = l;
        this.X = map;
        this.Y = l2;
        this.Z = z17;
        this.v0 = z18;
        this.w0 = z19;
    }
}
