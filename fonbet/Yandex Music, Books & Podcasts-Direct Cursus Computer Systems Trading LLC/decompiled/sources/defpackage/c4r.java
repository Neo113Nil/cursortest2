package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c4r implements in0 {
    public final bcs a;
    public final long b;
    public final tqc c;
    public final oqc d;
    public final pqc e;
    public final qpc f;
    public final String g;
    public final long h;
    public final wu2 i;
    public final ccs j;
    public final bqg k;
    public final long l;
    public final aas m;
    public final otp n;
    public final iuk o;
    public final kpa p;

    public c4r(long j, long j2, tqc tqcVar, oqc oqcVar, pqc pqcVar, qpc qpcVar, String str, long j3, wu2 wu2Var, ccs ccsVar, bqg bqgVar, long j4, aas aasVar, otp otpVar, int i) {
        this((i & 1) != 0 ? d85.n : j, (i & 2) != 0 ? kes.c : j2, (i & 4) != 0 ? null : tqcVar, (i & 8) != 0 ? null : oqcVar, (i & 16) != 0 ? null : pqcVar, (i & 32) != 0 ? null : qpcVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? kes.c : j3, (i & 256) != 0 ? null : wu2Var, (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : ccsVar, (i & 1024) != 0 ? null : bqgVar, (i & 2048) != 0 ? d85.n : j4, (i & 4096) != 0 ? null : aasVar, (i & RemoteCameraConfig.Notification.ID) != 0 ? null : otpVar, (iuk) null);
    }

    public final boolean a(c4r c4rVar) {
        if (this == c4rVar) {
            return true;
        }
        return kes.a(this.b, c4rVar.b) && Intrinsics.d(this.c, c4rVar.c) && Intrinsics.d(this.d, c4rVar.d) && Intrinsics.d(this.e, c4rVar.e) && Intrinsics.d(this.f, c4rVar.f) && Intrinsics.d(this.g, c4rVar.g) && kes.a(this.h, c4rVar.h) && Intrinsics.d(this.i, c4rVar.i) && Intrinsics.d(this.j, c4rVar.j) && Intrinsics.d(this.k, c4rVar.k) && d85.c(this.l, c4rVar.l) && Intrinsics.d(this.o, c4rVar.o);
    }

    public final boolean b(c4r c4rVar) {
        return Intrinsics.d(this.a, c4rVar.a) && Intrinsics.d(this.m, c4rVar.m) && Intrinsics.d(this.n, c4rVar.n) && Intrinsics.d(this.p, c4rVar.p);
    }

    public final c4r c(c4r c4rVar) {
        if (c4rVar == null) {
            return this;
        }
        bcs bcsVar = c4rVar.a;
        return d4r.a(this, bcsVar.a(), bcsVar.c(), bcsVar.b(), c4rVar.b, c4rVar.c, c4rVar.d, c4rVar.e, c4rVar.f, c4rVar.g, c4rVar.h, c4rVar.i, c4rVar.j, c4rVar.k, c4rVar.l, c4rVar.m, c4rVar.n, c4rVar.o, c4rVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4r)) {
            return false;
        }
        c4r c4rVar = (c4r) obj;
        return a(c4rVar) && b(c4rVar);
    }

    public final int hashCode() {
        bcs bcsVar = this.a;
        long a = bcsVar.a();
        int i = d85.o;
        met metVar = net.b;
        int hashCode = Long.hashCode(a) * 31;
        ai3 c = bcsVar.c();
        int hashCode2 = (Float.hashCode(bcsVar.b()) + ((hashCode + (c != null ? c.hashCode() : 0)) * 31)) * 31;
        les[] lesVarArr = kes.b;
        int c2 = tlm.c(this.b, hashCode2, 31);
        tqc tqcVar = this.c;
        int i2 = (c2 + (tqcVar != null ? tqcVar.a : 0)) * 31;
        oqc oqcVar = this.d;
        int hashCode3 = (i2 + (oqcVar != null ? Integer.hashCode(oqcVar.a) : 0)) * 31;
        pqc pqcVar = this.e;
        int hashCode4 = (hashCode3 + (pqcVar != null ? Integer.hashCode(pqcVar.a) : 0)) * 31;
        qpc qpcVar = this.f;
        int hashCode5 = (hashCode4 + (qpcVar != null ? qpcVar.hashCode() : 0)) * 31;
        String str = this.g;
        int c3 = tlm.c(this.h, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        wu2 wu2Var = this.i;
        int hashCode6 = (c3 + (wu2Var != null ? Float.hashCode(wu2Var.a) : 0)) * 31;
        ccs ccsVar = this.j;
        int hashCode7 = (hashCode6 + (ccsVar != null ? ccsVar.hashCode() : 0)) * 31;
        bqg bqgVar = this.k;
        int c4 = tlm.c(this.l, (hashCode7 + (bqgVar != null ? bqgVar.a.hashCode() : 0)) * 31, 31);
        aas aasVar = this.m;
        int i3 = (c4 + (aasVar != null ? aasVar.a : 0)) * 31;
        otp otpVar = this.n;
        int hashCode8 = (i3 + (otpVar != null ? otpVar.hashCode() : 0)) * 31;
        iuk iukVar = this.o;
        int hashCode9 = (hashCode8 + (iukVar != null ? iukVar.hashCode() : 0)) * 31;
        kpa kpaVar = this.p;
        return hashCode9 + (kpaVar != null ? kpaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        bcs bcsVar = this.a;
        sb.append((Object) d85.i(bcsVar.a()));
        sb.append(", brush=");
        sb.append(bcsVar.c());
        sb.append(", alpha=");
        sb.append(bcsVar.b());
        sb.append(", fontSize=");
        sb.append((Object) kes.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) kes.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        dfi.q(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public c4r(bcs bcsVar, long j, tqc tqcVar, oqc oqcVar, pqc pqcVar, qpc qpcVar, String str, long j2, wu2 wu2Var, ccs ccsVar, bqg bqgVar, long j3, aas aasVar, otp otpVar, iuk iukVar, kpa kpaVar) {
        this.a = bcsVar;
        this.b = j;
        this.c = tqcVar;
        this.d = oqcVar;
        this.e = pqcVar;
        this.f = qpcVar;
        this.g = str;
        this.h = j2;
        this.i = wu2Var;
        this.j = ccsVar;
        this.k = bqgVar;
        this.l = j3;
        this.m = aasVar;
        this.n = otpVar;
        this.o = iukVar;
        this.p = kpaVar;
    }

    public c4r(long j, long j2, tqc tqcVar, oqc oqcVar, pqc pqcVar, qpc qpcVar, String str, long j3, wu2 wu2Var, ccs ccsVar, bqg bqgVar, long j4, aas aasVar, otp otpVar, iuk iukVar) {
        this(j != 16 ? new y95(j) : zbs.a, j2, tqcVar, oqcVar, pqcVar, qpcVar, str, j3, wu2Var, ccsVar, bqgVar, j4, aasVar, otpVar, iukVar, null);
    }
}
