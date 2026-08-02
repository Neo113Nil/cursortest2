package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.p0;
import com.yandex.passport.api.q0;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.v1;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.cxb;
import defpackage.e5b;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.ouj;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l implements com.yandex.passport.api.limited.a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new f(4);
    public final boolean A;
    public final a0 B;
    public final boolean C;
    public final v1 D;
    public final String a;
    public final boolean b;
    public final String c;
    public final com.yandex.passport.internal.entities.k d;
    public final y1 e;
    public final com.yandex.passport.internal.e f;
    public final z1 g;
    public final boolean h;
    public final boolean i;
    public final w1 j;
    public final String k;
    public final boolean l;
    public final z1 m;
    public final com.yandex.passport.internal.entities.w n;
    public final f0 o;
    public final k0 p;
    public final h q;
    public final String r;
    public final Map s;
    public final com.yandex.passport.internal.entities.v t;
    public final m0 u;
    public final boolean v;
    public final String w;
    public final Map x;
    public final boolean y;
    public final String z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(String str, boolean z, String str2, com.yandex.passport.internal.entities.k kVar, y1 y1Var, com.yandex.passport.internal.e eVar, z1 z1Var, boolean z2, boolean z3, w1 w1Var, String str3, boolean z4, com.yandex.passport.internal.entities.w wVar, f0 f0Var, k0 k0Var, h hVar, String str4, Map map, com.yandex.passport.internal.entities.v vVar, m0 m0Var, boolean z5, String str5, Map map2, boolean z6, String str6, boolean z7, v1 v1Var, int i) {
        this(r37, r5, r6, kVar, r8, r9, r10, r11, r12, r13, r14, r15, null, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, (i & 16777216) != 0 ? false : z6, (i & 33554432) != 0 ? null : str6, false, null, (i & 268435456) != 0 ? false : z7, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? v1.a : v1Var);
        String str7;
        k0 k0Var2;
        Map map3;
        Map map4;
        String str8 = (i & 1) != 0 ? null : str;
        boolean z8 = (i & 2) != 0 ? false : z;
        String str9 = (i & 4) != 0 ? null : str2;
        y1 y1Var2 = (i & 16) != 0 ? y1.d : y1Var;
        com.yandex.passport.internal.e eVar2 = (i & 32) != 0 ? null : eVar;
        z1 z1Var2 = (i & 64) != 0 ? null : z1Var;
        boolean z9 = (i & 128) != 0 ? false : z2;
        boolean z10 = (i & 256) != 0 ? false : z3;
        w1 w1Var2 = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : w1Var;
        String str10 = (i & 1024) != 0 ? null : str3;
        boolean z11 = (i & 2048) != 0 ? false : z4;
        com.yandex.passport.internal.entities.w wVar2 = (i & RemoteCameraConfig.Notification.ID) != 0 ? null : wVar;
        f0 f0Var2 = (i & 16384) != 0 ? new f0(null, null) : f0Var;
        if ((32768 & i) != 0) {
            str7 = str8;
            k0Var2 = new k0(false, false, false, q0.a, true, null, null, null, null, false, false, null, new a(com.yandex.passport.api.e.a, com.yandex.passport.api.c.a, true, false), new v(new j2(), q2.a, n2.a, true), false, true);
        } else {
            str7 = str8;
            k0Var2 = k0Var;
        }
        h hVar2 = (i & SQLiteDatabase.OPEN_FULLMUTEX) != 0 ? null : hVar;
        String str11 = (i & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 ? null : str4;
        if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            map3 = e5bVar;
        } else {
            map3 = map;
        }
        com.yandex.passport.internal.entities.v vVar2 = (i & 524288) != 0 ? null : vVar;
        m0 m0Var2 = (i & 1048576) != 0 ? null : m0Var;
        boolean z12 = (i & 2097152) != 0 ? false : z5;
        String str12 = (i & RemoteCameraConfig.Camera.BITRATE) != 0 ? null : str5;
        if ((i & 8388608) != 0) {
            e5b e5bVar2 = e5b.a;
            e5bVar2.getClass();
            map4 = e5bVar2;
        } else {
            map4 = map2;
        }
    }

    public static l a(l lVar, z1 z1Var, String str, z1 z1Var2, int i) {
        String str2;
        String str3 = lVar.a;
        boolean z = lVar.b;
        String str4 = lVar.c;
        com.yandex.passport.internal.entities.k kVar = lVar.d;
        y1 y1Var = lVar.e;
        com.yandex.passport.internal.e eVar = lVar.f;
        z1 z1Var3 = (i & 64) != 0 ? lVar.g : z1Var;
        boolean z2 = lVar.h;
        boolean z3 = (i & 256) != 0 ? lVar.i : true;
        w1 w1Var = lVar.j;
        String str5 = (i & 1024) != 0 ? lVar.k : str;
        z1 z1Var4 = z1Var3;
        boolean z4 = z3;
        boolean z5 = lVar.l;
        z1 z1Var5 = (i & 4096) != 0 ? lVar.m : z1Var2;
        com.yandex.passport.internal.entities.w wVar = lVar.n;
        boolean z6 = true;
        String str6 = str5;
        z1 z1Var6 = z1Var5;
        f0 f0Var = lVar.o;
        k0 k0Var = lVar.p;
        h hVar = lVar.q;
        String str7 = lVar.r;
        Map map = lVar.s;
        com.yandex.passport.internal.entities.v vVar = lVar.t;
        m0 m0Var = lVar.u;
        boolean z7 = lVar.v;
        String str8 = lVar.w;
        Map map2 = lVar.x;
        boolean z8 = lVar.y;
        String str9 = lVar.z;
        if ((i & 67108864) != 0) {
            str2 = str9;
            z6 = lVar.A;
        } else {
            str2 = str9;
        }
        a0 a0Var = lVar.B;
        boolean z9 = lVar.C;
        v1 v1Var = lVar.D;
        lVar.getClass();
        kVar.getClass();
        y1Var.getClass();
        f0Var.getClass();
        k0Var.getClass();
        map.getClass();
        map2.getClass();
        v1Var.getClass();
        return new l(str3, z, str4, kVar, y1Var, eVar, z1Var4, z2, z4, w1Var, str6, z5, z1Var6, wVar, f0Var, k0Var, hVar, str7, map, vVar, m0Var, z7, str8, map2, z8, str2, z6, a0Var, z9, v1Var);
    }

    @Override // com.yandex.passport.api.x0
    public final com.yandex.passport.internal.e C() {
        return this.f;
    }

    @Override // com.yandex.passport.api.x0
    public final v1 I() {
        return this.D;
    }

    @Override // com.yandex.passport.api.x0
    public final boolean J() {
        return this.i;
    }

    @Override // com.yandex.passport.api.x0
    public final m0 O() {
        return this.u;
    }

    @Override // com.yandex.passport.api.internal.b
    public final boolean Q() {
        return this.y;
    }

    @Override // com.yandex.passport.api.x0
    public final z1 T() {
        return this.g;
    }

    @Override // com.yandex.passport.api.x0
    public final w1 W() {
        return this.j;
    }

    @Override // com.yandex.passport.api.x0
    public final f0 X() {
        return this.o;
    }

    @Override // com.yandex.passport.api.x0
    public final Map d() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.api.x0
    public final String e() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        boolean d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!Intrinsics.d(this.a, lVar.a) || this.b != lVar.b || !Intrinsics.d(this.c, lVar.c) || !Intrinsics.d(this.d, lVar.d) || this.e != lVar.e || !Intrinsics.d(this.f, lVar.f) || !Intrinsics.d(this.g, lVar.g) || this.h != lVar.h || this.i != lVar.i || this.j != lVar.j || !Intrinsics.d(this.k, lVar.k) || this.l != lVar.l || !Intrinsics.d(this.m, lVar.m) || !Intrinsics.d(this.n, lVar.n) || !Intrinsics.d(this.o, lVar.o) || !Intrinsics.d(this.p, lVar.p) || !Intrinsics.d(this.q, lVar.q) || !Intrinsics.d(this.r, lVar.r) || !Intrinsics.d(this.s, lVar.s) || !Intrinsics.d(this.t, lVar.t) || !Intrinsics.d(this.u, lVar.u) || this.v != lVar.v) {
            return false;
        }
        String str = lVar.w;
        String str2 = this.w;
        if (str2 == null) {
            if (str == null) {
                d = true;
            }
            d = false;
        } else {
            if (str != null) {
                d = Intrinsics.d(str2, str);
            }
            d = false;
        }
        return d && Intrinsics.d(this.x, lVar.x) && this.y == lVar.y && Intrinsics.d(this.z, lVar.z) && this.A == lVar.A && Intrinsics.d(this.B, lVar.B) && this.C == lVar.C && this.D == lVar.D;
    }

    @Override // com.yandex.passport.api.limited.a
    public final String f() {
        return this.a;
    }

    @Override // com.yandex.passport.api.x0
    public final String g() {
        return this.z;
    }

    @Override // com.yandex.passport.api.x0
    public final p0 getFilter() {
        return this.d;
    }

    @Override // com.yandex.passport.api.x0
    public final y1 getTheme() {
        return this.e;
    }

    @Override // com.yandex.passport.api.x0
    public final Map h() {
        return this.s;
    }

    public final int hashCode() {
        String str = this.a;
        int e = k5r.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((e + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        com.yandex.passport.internal.e eVar = this.f;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        z1 z1Var = this.g;
        int e2 = k5r.e(k5r.e((hashCode2 + (z1Var == null ? 0 : z1Var.hashCode())) * 31, 31, this.h), 31, this.i);
        w1 w1Var = this.j;
        int hashCode3 = (e2 + (w1Var == null ? 0 : w1Var.hashCode())) * 31;
        String str3 = this.k;
        int e3 = k5r.e((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.l);
        z1 z1Var2 = this.m;
        int hashCode4 = (e3 + (z1Var2 == null ? 0 : z1Var2.hashCode())) * 31;
        com.yandex.passport.internal.entities.w wVar = this.n;
        int hashCode5 = (this.p.hashCode() + ((this.o.hashCode() + ((hashCode4 + (wVar == null ? 0 : wVar.hashCode())) * 31)) * 31)) * 31;
        h hVar = this.q;
        int hashCode6 = (hashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str4 = this.r;
        int b = f1d.b(this.s, (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        com.yandex.passport.internal.entities.v vVar = this.t;
        int hashCode7 = (b + (vVar == null ? 0 : vVar.hashCode())) * 31;
        m0 m0Var = this.u;
        int e4 = k5r.e((hashCode7 + (m0Var == null ? 0 : m0Var.hashCode())) * 31, 31, this.v);
        String str5 = this.w;
        int e5 = k5r.e(f1d.b(this.x, (e4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31, this.y);
        String str6 = this.z;
        int e6 = k5r.e((e5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.A);
        a0 a0Var = this.B;
        return this.D.hashCode() + k5r.e((e6 + (a0Var != null ? a0Var.a.hashCode() : 0)) * 31, 31, this.C);
    }

    @Override // com.yandex.passport.api.x0
    public final boolean i() {
        return this.v;
    }

    @Override // com.yandex.passport.api.x0
    public final k0 j() {
        return this.p;
    }

    @Override // com.yandex.passport.api.x0
    public final h k() {
        return this.q;
    }

    @Override // com.yandex.passport.api.x0
    public final boolean l() {
        return this.h;
    }

    @Override // com.yandex.passport.api.x0
    public final String m() {
        return this.k;
    }

    @Override // com.yandex.passport.api.x0
    public final com.yandex.passport.internal.entities.v n() {
        return this.t;
    }

    @Override // com.yandex.passport.api.x0
    public final String o() {
        return this.w;
    }

    @Override // com.yandex.passport.api.x0
    public final boolean p() {
        return this.C;
    }

    public final Bundle t() {
        return cxb.K(new Pair("passport-login-properties", this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginProperties(applicationPackageName=");
        sb.append(this.a);
        sb.append(", isWebAmForbidden=");
        sb.append(this.b);
        sb.append(", applicationVersion=");
        sb.append(this.c);
        sb.append(", filter=");
        sb.append(this.d);
        sb.append(", theme=");
        sb.append(this.e);
        sb.append(", animationTheme=");
        sb.append(this.f);
        sb.append(", selectedUid=");
        sb.append(this.g);
        sb.append(", isAdditionOnlyRequired=");
        sb.append(this.h);
        sb.append(", isRegistrationOnlyRequired=");
        sb.append(this.i);
        sb.append(", socialConfiguration=");
        sb.append(this.j);
        sb.append(", loginHint=");
        sb.append(this.k);
        sb.append(", isFromAuthSdk=");
        sb.append(this.l);
        sb.append(", authSdkChallengeUid=");
        sb.append(this.m);
        sb.append(", userCredentials=");
        sb.append(this.n);
        sb.append(", socialRegistrationProperties=");
        sb.append(this.o);
        sb.append(", visualProperties=");
        sb.append(this.p);
        sb.append(", bindPhoneProperties=");
        sb.append(this.q);
        sb.append(", source=");
        sb.append(this.r);
        sb.append(", analyticsParams=");
        sb.append(this.s);
        sb.append(", turboAuthParams=");
        sb.append(this.t);
        sb.append(", webAmProperties=");
        sb.append(this.u);
        sb.append(", setAsCurrent=");
        sb.append(this.v);
        sb.append(", additionalActionRequest=");
        String str = this.w;
        sb.append((Object) (str == null ? "null" : ouj.k(')', "AdditionalActionRequest(rawValue=", str)));
        sb.append(", headers=");
        sb.append(this.x);
        sb.append(", isUpgradePhonish=");
        sb.append(this.y);
        sb.append(", origin=");
        sb.append(this.z);
        sb.append(", isLoginFlow=");
        sb.append(this.A);
        sb.append(", selectAccountParams=");
        sb.append(this.B);
        sb.append(", createMasterEnterPhoneNumberOption=");
        sb.append(this.C);
        sb.append(", lockScreenOrientation=");
        sb.append(this.D);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e.name());
        com.yandex.passport.internal.e eVar = this.f;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i);
        }
        z1 z1Var = this.g;
        if (z1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            z1Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        w1 w1Var = this.j;
        if (w1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(w1Var.name());
        }
        parcel.writeString(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        z1 z1Var2 = this.m;
        if (z1Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            z1Var2.writeToParcel(parcel, i);
        }
        com.yandex.passport.internal.entities.w wVar = this.n;
        if (wVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wVar.writeToParcel(parcel, i);
        }
        this.o.writeToParcel(parcel, i);
        this.p.writeToParcel(parcel, i);
        h hVar = this.q;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.r);
        Iterator s = com.appsflyer.internal.k.s(this.s, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        com.yandex.passport.internal.entities.v vVar = this.t;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vVar.writeToParcel(parcel, i);
        }
        m0 m0Var = this.u;
        if (m0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.v ? 1 : 0);
        String str = this.w;
        if (str == null) {
            str = null;
        }
        parcel.writeString(str);
        Iterator s2 = com.appsflyer.internal.k.s(this.x, parcel);
        while (s2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) s2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeString(this.z);
        parcel.writeInt(this.A ? 1 : 0);
        a0 a0Var = this.B;
        if (a0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a0Var.a.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeString(this.D.name());
    }

    public l(String str, boolean z, String str2, com.yandex.passport.internal.entities.k kVar, y1 y1Var, com.yandex.passport.internal.e eVar, z1 z1Var, boolean z2, boolean z3, w1 w1Var, String str3, boolean z4, z1 z1Var2, com.yandex.passport.internal.entities.w wVar, f0 f0Var, k0 k0Var, h hVar, String str4, Map map, com.yandex.passport.internal.entities.v vVar, m0 m0Var, boolean z5, String str5, Map map2, boolean z6, String str6, boolean z7, a0 a0Var, boolean z8, v1 v1Var) {
        kVar.getClass();
        y1Var.getClass();
        f0Var.getClass();
        k0Var.getClass();
        map.getClass();
        map2.getClass();
        v1Var.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = kVar;
        this.e = y1Var;
        this.f = eVar;
        this.g = z1Var;
        this.h = z2;
        this.i = z3;
        this.j = w1Var;
        this.k = str3;
        this.l = z4;
        this.m = z1Var2;
        this.n = wVar;
        this.o = f0Var;
        this.p = k0Var;
        this.q = hVar;
        this.r = str4;
        this.s = map;
        this.t = vVar;
        this.u = m0Var;
        this.v = z5;
        this.w = str5;
        this.x = map2;
        this.y = z6;
        this.z = str6;
        this.A = z7;
        this.B = a0Var;
        this.C = z8;
        this.D = v1Var;
    }
}
