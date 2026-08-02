package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ges {
    public static final ges d = new ges(0, 0, null, null, null, null, null, 0, null, 0, 0, null, null, 0, 16777215);
    public final c4r a;
    public final x5k b;
    public final nuk c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ges(long j, long j2, tqc tqcVar, oqc oqcVar, pqc pqcVar, qpc qpcVar, String str, long j3, otp otpVar, int i, long j4, nuk nukVar, h6g h6gVar, int i2, int i3) {
        this(new c4r(r4, r6, r8, r9, r10, r11, r12, r13, (wu2) null, (ccs) null, (bqg) null, r18, (aas) null, r21, r3 != null ? r3.a : null), new x5k(r1, r23, r24, null, r2 != null ? r2.b : null, r26, r0, Integer.MIN_VALUE, null), r2);
        int i4;
        long j5 = (i3 & 1) != 0 ? d85.n : j;
        long j6 = (i3 & 2) != 0 ? kes.c : j2;
        tqc tqcVar2 = (i3 & 4) != 0 ? null : tqcVar;
        oqc oqcVar2 = (i3 & 8) != 0 ? null : oqcVar;
        pqc pqcVar2 = (i3 & 16) != 0 ? null : pqcVar;
        qpc qpcVar2 = (i3 & 32) != 0 ? null : qpcVar;
        String str2 = (i3 & 64) != 0 ? null : str;
        long j7 = (i3 & 128) != 0 ? kes.c : j3;
        long j8 = d85.n;
        otp otpVar2 = (i3 & RemoteCameraConfig.Notification.ID) != 0 ? null : otpVar;
        int i5 = (32768 & i3) != 0 ? Integer.MIN_VALUE : i;
        int i6 = (65536 & i3) == 0 ? 3 : Integer.MIN_VALUE;
        long j9 = (131072 & i3) != 0 ? kes.c : j4;
        nuk nukVar2 = (524288 & i3) != 0 ? null : nukVar;
        h6g h6gVar2 = (1048576 & i3) != 0 ? null : h6gVar;
        if ((i3 & 2097152) != 0) {
            int i7 = u5g.b;
            i4 = 0;
        } else {
            i4 = i2;
        }
        nuk nukVar3 = nukVar2;
    }

    public static ges a(ges gesVar, ltp ltpVar) {
        float b = gesVar.a.a.b();
        c4r c4rVar = gesVar.a;
        long j = c4rVar.b;
        tqc tqcVar = c4rVar.c;
        oqc oqcVar = c4rVar.d;
        pqc pqcVar = c4rVar.e;
        qpc qpcVar = c4rVar.f;
        String str = c4rVar.g;
        long j2 = c4rVar.h;
        wu2 wu2Var = c4rVar.i;
        ccs ccsVar = c4rVar.j;
        bqg bqgVar = c4rVar.k;
        long j3 = c4rVar.l;
        aas aasVar = c4rVar.m;
        otp otpVar = c4rVar.n;
        kpa kpaVar = c4rVar.p;
        x5k x5kVar = gesVar.b;
        int i = x5kVar.a;
        int i2 = x5kVar.b;
        long j4 = x5kVar.c;
        fcs fcsVar = x5kVar.d;
        nuk nukVar = gesVar.c;
        h6g h6gVar = x5kVar.f;
        int i3 = x5kVar.g;
        int i4 = x5kVar.h;
        lds ldsVar = x5kVar.i;
        gesVar.getClass();
        c4r c4rVar2 = new c4r(new ci3(ltpVar, b), j, tqcVar, oqcVar, pqcVar, qpcVar, str, j2, wu2Var, ccsVar, bqgVar, j3, aasVar, otpVar, nukVar != null ? nukVar.a : null, kpaVar);
        duk dukVar = null;
        if (nukVar != null) {
            dukVar = nukVar.b;
        }
        return new ges(c4rVar2, new x5k(i, i2, j4, fcsVar, dukVar, h6gVar, i3, i4, ldsVar), nukVar);
    }

    public static ges b(ges gesVar, long j, long j2, tqc tqcVar, qpc qpcVar, long j3, int i, long j4, nuk nukVar, h6g h6gVar, int i2, int i3, int i4) {
        otp otpVar;
        kpa kpaVar;
        long j5;
        long a = (i4 & 1) != 0 ? gesVar.a.a.a() : j;
        long j6 = (i4 & 2) != 0 ? gesVar.a.b : j2;
        tqc tqcVar2 = (i4 & 4) != 0 ? gesVar.a.c : tqcVar;
        c4r c4rVar = gesVar.a;
        oqc oqcVar = c4rVar.d;
        pqc pqcVar = c4rVar.e;
        qpc qpcVar2 = (i4 & 32) != 0 ? c4rVar.f : qpcVar;
        String str = c4rVar.g;
        long j7 = (i4 & 128) != 0 ? c4rVar.h : j3;
        wu2 wu2Var = c4rVar.i;
        ccs ccsVar = c4rVar.j;
        bqg bqgVar = c4rVar.k;
        long j8 = c4rVar.l;
        aas aasVar = (i4 & 4096) != 0 ? c4rVar.m : aas.b;
        otp otpVar2 = c4rVar.n;
        kpa kpaVar2 = c4rVar.p;
        int i5 = (i4 & SQLiteDatabase.OPEN_NOMUTEX) != 0 ? gesVar.b.a : i;
        int i6 = (i4 & SQLiteDatabase.OPEN_FULLMUTEX) != 0 ? gesVar.b.b : 3;
        if ((i4 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
            otpVar = otpVar2;
            kpaVar = kpaVar2;
            j5 = gesVar.b.c;
        } else {
            otpVar = otpVar2;
            kpaVar = kpaVar2;
            j5 = j4;
        }
        x5k x5kVar = gesVar.b;
        fcs fcsVar = x5kVar.d;
        nuk nukVar2 = (i4 & 524288) != 0 ? gesVar.c : nukVar;
        return new ges(new c4r(d85.c(a, c4rVar.a.a()) ? c4rVar.a : a != 16 ? new y95(a) : zbs.a, j6, tqcVar2, oqcVar, pqcVar, qpcVar2, str, j7, wu2Var, ccsVar, bqgVar, j8, aasVar, otpVar, nukVar2 != null ? nukVar2.a : null, kpaVar), new x5k(i5, i6, j5, fcsVar, nukVar2 != null ? nukVar2.b : null, (i4 & 1048576) != 0 ? x5kVar.f : h6gVar, (i4 & 2097152) != 0 ? x5kVar.g : i2, (i4 & RemoteCameraConfig.Camera.BITRATE) != 0 ? x5kVar.h : i3, x5kVar.i), nukVar2);
    }

    public static ges f(ges gesVar, long j, long j2, tqc tqcVar, long j3, aas aasVar, otp otpVar, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? d85.n : j;
        long j6 = (i2 & 2) != 0 ? kes.c : j2;
        tqc tqcVar2 = (i2 & 4) != 0 ? null : tqcVar;
        long j7 = (i2 & 128) != 0 ? kes.c : j3;
        long j8 = d85.n;
        aas aasVar2 = (i2 & 4096) != 0 ? null : aasVar;
        otp otpVar2 = (i2 & RemoteCameraConfig.Notification.ID) != 0 ? null : otpVar;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j9 = (i2 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 ? kes.c : j4;
        int i4 = u5g.b;
        c4r a = d4r.a(gesVar.a, j5, null, Float.NaN, j6, tqcVar2, null, null, null, null, j7, null, null, null, j8, aasVar2, otpVar2, null, null);
        x5k a2 = y5k.a(gesVar.b, i3, Integer.MIN_VALUE, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        return (gesVar.a == a && gesVar.b == a2) ? gesVar : new ges(a, a2);
    }

    public final long c() {
        return this.a.a.a();
    }

    public final boolean d(ges gesVar) {
        if (this != gesVar) {
            return Intrinsics.d(this.b, gesVar.b) && this.a.a(gesVar.a);
        }
        return true;
    }

    public final ges e(ges gesVar) {
        return (gesVar == null || gesVar.equals(d)) ? this : new ges(this.a.c(gesVar.a), this.b.a(gesVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ges)) {
            return false;
        }
        ges gesVar = (ges) obj;
        return Intrinsics.d(this.a, gesVar.a) && Intrinsics.d(this.b, gesVar.b) && Intrinsics.d(this.c, gesVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        nuk nukVar = this.c;
        return hashCode + (nukVar != null ? nukVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) d85.i(c()));
        sb.append(", brush=");
        c4r c4rVar = this.a;
        sb.append(c4rVar.a.c());
        sb.append(", alpha=");
        sb.append(c4rVar.a.b());
        sb.append(", fontSize=");
        sb.append((Object) kes.d(c4rVar.b));
        sb.append(", fontWeight=");
        sb.append(c4rVar.c);
        sb.append(", fontStyle=");
        sb.append(c4rVar.d);
        sb.append(", fontSynthesis=");
        sb.append(c4rVar.e);
        sb.append(", fontFamily=");
        sb.append(c4rVar.f);
        sb.append(", fontFeatureSettings=");
        sb.append(c4rVar.g);
        sb.append(", letterSpacing=");
        sb.append((Object) kes.d(c4rVar.h));
        sb.append(", baselineShift=");
        sb.append(c4rVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(c4rVar.j);
        sb.append(", localeList=");
        sb.append(c4rVar.k);
        sb.append(", background=");
        dfi.q(c4rVar.l, ", textDecoration=", sb);
        sb.append(c4rVar.m);
        sb.append(", shadow=");
        sb.append(c4rVar.n);
        sb.append(", drawStyle=");
        sb.append(c4rVar.p);
        sb.append(", textAlign=");
        x5k x5kVar = this.b;
        sb.append((Object) o9s.a(x5kVar.a));
        sb.append(", textDirection=");
        sb.append((Object) fas.a(x5kVar.b));
        sb.append(", lineHeight=");
        sb.append((Object) kes.d(x5kVar.c));
        sb.append(", textIndent=");
        sb.append(x5kVar.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(x5kVar.f);
        sb.append(", lineBreak=");
        sb.append((Object) u5g.a(x5kVar.g));
        sb.append(", hyphens=");
        sb.append((Object) f8e.a(x5kVar.h));
        sb.append(", textMotion=");
        sb.append(x5kVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ges(c4r c4rVar, x5k x5kVar) {
        this(c4rVar, x5kVar, (r0 == null && r1 == null) ? null : new nuk(r0, r1));
        iuk iukVar = c4rVar.o;
        duk dukVar = x5kVar.e;
    }

    public ges(c4r c4rVar, x5k x5kVar, nuk nukVar) {
        this.a = c4rVar;
        this.b = x5kVar;
        this.c = nukVar;
    }
}
