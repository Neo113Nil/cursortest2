package androidx.compose.animation;

import defpackage.act;
import defpackage.aqi;
import defpackage.azt;
import defpackage.b2c;
import defpackage.b9r;
import defpackage.bc4;
import defpackage.bs5;
import defpackage.d8t;
import defpackage.e9b;
import defpackage.fm9;
import defpackage.g8t;
import defpackage.gq5;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.hqe;
import defpackage.hz2;
import defpackage.i8t;
import defpackage.iz2;
import defpackage.jx9;
import defpackage.kjn;
import defpackage.mp3;
import defpackage.ocg;
import defpackage.oct;
import defpackage.oq5;
import defpackage.r8b;
import defpackage.s8b;
import defpackage.szf;
import defpackage.t7t;
import defpackage.u8b;
import defpackage.vci;
import defpackage.vpb;
import defpackage.wdc;
import defpackage.weo;
import defpackage.wpe;
import defpackage.x6k;
import defpackage.y3c;
import defpackage.yci;
import defpackage.ysq;
import defpackage.zyt;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {
    public static final oct a;
    public static final b9r b;
    public static final b9r c;
    public static final b9r d;

    static {
        jx9 jx9Var = jx9.Y;
        jx9 jx9Var2 = jx9.Z;
        oct octVar = azt.a;
        a = new oct(jx9Var, jx9Var2);
        b = weo.Q(0.0f, 400.0f, null, 5);
        long j = 1;
        long j2 = (j & 4294967295L) | (j << 32);
        c = weo.Q(0.0f, 400.0f, new wpe(j2), 1);
        d = weo.Q(0.0f, 400.0f, new hqe(j2), 1);
    }

    public static final yci a(d8t d8tVar, e9b e9bVar, vpb vpbVar, String str, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        t7t t7tVar;
        t7t t7tVar2;
        t7t t7tVar3;
        d8t d8tVar2;
        oq5 oq5Var2;
        t7t t7tVar4;
        Object s8bVar;
        vpb vpbVar2;
        e9b e9bVar2;
        bs5 bs5Var = bs5.B0;
        int i3 = i & 14;
        boolean z = ((i3 ^ 6) > 4 && ((oq5) hq5Var).f(d8tVar)) || (i & 6) == 4;
        oq5 oq5Var3 = (oq5) hq5Var;
        Object K = oq5Var3.K();
        kjn kjnVar = gq5.a;
        if (z || K == kjnVar) {
            K = szf.g0(e9bVar);
            oq5Var3.k0(K);
        }
        aqi aqiVar = (aqi) K;
        Object c2 = d8tVar.c();
        x6k x6kVar = d8tVar.d;
        if (c2 == x6kVar.getValue() && d8tVar.c() == r8b.b) {
            if (d8tVar.g()) {
                aqiVar.setValue(e9bVar);
            } else {
                aqiVar.setValue(e9b.b);
            }
        } else if (x6kVar.getValue() == r8b.b) {
            aqiVar.setValue(((e9b) aqiVar.getValue()).a(e9bVar));
        }
        e9b e9bVar3 = (e9b) aqiVar.getValue();
        int i4 = i >> 3;
        int i5 = (i4 & 112) | i3;
        boolean z2 = (((i5 & 14) ^ 6) > 4 && oq5Var3.f(d8tVar)) || (i5 & 6) == 4;
        Object K2 = oq5Var3.K();
        if (z2 || K2 == kjnVar) {
            K2 = szf.g0(vpbVar);
            oq5Var3.k0(K2);
        }
        aqi aqiVar2 = (aqi) K2;
        if (d8tVar.c() == x6kVar.getValue() && d8tVar.c() == r8b.b) {
            if (d8tVar.g()) {
                aqiVar2.setValue(vpbVar);
            } else {
                aqiVar2.setValue(vpb.b);
            }
        } else if (x6kVar.getValue() != r8b.b) {
            aqiVar2.setValue(((vpb) aqiVar2.getValue()).a(vpbVar));
        }
        vpb vpbVar3 = (vpb) aqiVar2.getValue();
        g8t g8tVar = e9bVar3.a;
        boolean z3 = (g8tVar.b == null && vpbVar3.a.b == null) ? false : true;
        boolean z4 = (g8tVar.c == null && vpbVar3.a.c == null) ? false : true;
        if (z3) {
            oq5Var3.Z(-821159459);
            oct octVar = azt.g;
            Object K3 = oq5Var3.K();
            if (K3 == kjnVar) {
                K3 = str.concat(" slide");
                oq5Var3.k0(K3);
            }
            oq5Var = oq5Var3;
            i2 = i4;
            t7t b2 = i8t.b(d8tVar, octVar, (String) K3, oq5Var, i3 | 384, 0);
            oq5Var.p(false);
            t7tVar = b2;
        } else {
            i2 = i4;
            oq5Var = oq5Var3;
            oq5Var.Z(-821053656);
            oq5Var.p(false);
            t7tVar = null;
        }
        if (z4) {
            oq5Var.Z(-820961865);
            oct octVar2 = azt.h;
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = str.concat(" shrink/expand");
                oq5Var.k0(K4);
            }
            t7t b3 = i8t.b(d8tVar, octVar2, (String) K4, oq5Var, i3 | 384, 0);
            oq5Var.p(false);
            t7tVar2 = b3;
        } else {
            oq5Var.Z(-820851041);
            oq5Var.p(false);
            t7tVar2 = null;
        }
        if (z4) {
            oq5Var.Z(-820777446);
            oct octVar3 = azt.g;
            Object K5 = oq5Var.K();
            if (K5 == kjnVar) {
                K5 = str.concat(" InterruptionHandlingOffset");
                oq5Var.k0(K5);
            }
            t7t b4 = i8t.b(d8tVar, octVar3, (String) K5, oq5Var, i3 | 384, 0);
            oq5Var.p(false);
            t7tVar3 = b4;
        } else {
            oq5Var.Z(-820608001);
            oq5Var.p(false);
            t7tVar3 = null;
        }
        boolean z5 = !z4;
        int i6 = i3 | (i2 & 7168);
        if ((e9bVar3.a.a == null && vpbVar3.a.a == null) ? false : true) {
            oq5Var.Z(-675026101);
            oct octVar4 = azt.a;
            Object K6 = oq5Var.K();
            if (K6 == kjnVar) {
                K6 = str.concat(" alpha");
                oq5Var.k0(K6);
            }
            d8tVar2 = d8tVar;
            t7t b5 = i8t.b(d8tVar2, octVar4, (String) K6, oq5Var, (i6 & 14) | 384, 0);
            oq5Var2 = oq5Var;
            oq5Var2.p(false);
            t7tVar4 = b5;
        } else {
            d8tVar2 = d8tVar;
            oq5Var2 = oq5Var;
            oq5Var2.Z(-674857617);
            oq5Var2.p(false);
            t7tVar4 = null;
        }
        oq5Var2.Z(-674621521);
        oq5Var2.p(false);
        oq5Var2.Z(-674372529);
        oq5Var2.p(false);
        t7t t7tVar5 = null;
        boolean h = oq5Var2.h(t7tVar4) | oq5Var2.f(e9bVar3) | oq5Var2.f(vpbVar3) | oq5Var2.h(null) | ((((i6 & 14) ^ 6) > 4 && oq5Var2.f(d8tVar2)) || (i6 & 6) == 4) | oq5Var2.h(null);
        Object K7 = oq5Var2.K();
        if (h || K7 == kjnVar) {
            vpbVar2 = vpbVar3;
            e9bVar2 = e9bVar3;
            s8bVar = new s8b(t7tVar4, t7tVar5, d8tVar, e9bVar2, vpbVar2, t7tVar5);
            oq5Var2.k0(s8bVar);
        } else {
            s8bVar = K7;
            vpbVar2 = vpbVar3;
            e9bVar2 = e9bVar3;
        }
        s8b s8bVar2 = (s8b) s8bVar;
        boolean g = oq5Var2.g(z5) | ((((i & 7168) ^ 3072) > 2048 && oq5Var2.f(bs5Var)) || (i & 3072) == 2048);
        Object K8 = oq5Var2.K();
        if (g || K8 == kjnVar) {
            K8 = new fm9(1, z5);
            oq5Var2.k0(K8);
        }
        return androidx.compose.ui.graphics.a.a(vci.a, (Function1) K8).f(new EnterExitTransitionElement(d8tVar, t7tVar2, t7tVar3, t7tVar, e9bVar2, vpbVar2, s8bVar2));
    }

    public static e9b b(gz2 gz2Var, int i) {
        gz2 gz2Var2 = b2c.p;
        int i2 = 1;
        long j = 1;
        b9r Q = weo.Q(0.0f, 400.0f, new hqe((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            gz2Var = gz2Var2;
        }
        return c(Q, Intrinsics.d(gz2Var, b2c.n) ? b2c.e : Intrinsics.d(gz2Var, gz2Var2) ? b2c.g : b2c.f, new zyt(i2, 29));
    }

    public static final e9b c(b9r b9rVar, iz2 iz2Var, Function1 function1) {
        return new e9b(new g8t((y3c) null, (ysq) null, new bc4(iz2Var, b9rVar, function1), (ocg) null, (LinkedHashMap) null, 59));
    }

    public static e9b d(int i) {
        hz2 hz2Var = b2c.m;
        long j = 1;
        return c(weo.Q(0.0f, 400.0f, new hqe((j & 4294967295L) | (j << 32)), 1), Intrinsics.d(hz2Var, b2c.k) ? b2c.c : Intrinsics.d(hz2Var, hz2Var) ? b2c.i : b2c.f, new u8b(1, 0));
    }

    public static e9b e(act actVar, int i) {
        wdc wdcVar = actVar;
        if ((i & 1) != 0) {
            wdcVar = weo.Q(0.0f, 400.0f, null, 5);
        }
        return new e9b(new g8t(new y3c(wdcVar), (ysq) null, (bc4) null, (ocg) null, (LinkedHashMap) null, 62));
    }

    public static vpb f(act actVar, int i) {
        wdc wdcVar = actVar;
        if ((i & 1) != 0) {
            wdcVar = weo.Q(0.0f, 400.0f, null, 5);
        }
        return new vpb(new g8t(new y3c(wdcVar), (ysq) null, (bc4) null, (ocg) null, (LinkedHashMap) null, 62));
    }

    public static vpb g(act actVar, int i) {
        gz2 gz2Var = b2c.p;
        gz2 gz2Var2 = b2c.n;
        int i2 = 1;
        wdc wdcVar = actVar;
        if ((i & 1) != 0) {
            long j = 1;
            wdcVar = weo.Q(0.0f, 400.0f, new hqe((j & 4294967295L) | (j << 32)), 1);
        }
        gz2 gz2Var3 = (i & 2) != 0 ? gz2Var : gz2Var2;
        return h(Intrinsics.d(gz2Var3, gz2Var2) ? b2c.e : Intrinsics.d(gz2Var3, gz2Var) ? b2c.g : b2c.f, wdcVar, new u8b(i2, 1));
    }

    public static final vpb h(iz2 iz2Var, wdc wdcVar, Function1 function1) {
        return new vpb(new g8t((y3c) null, (ysq) null, new bc4(iz2Var, wdcVar, function1), (ocg) null, (LinkedHashMap) null, 59));
    }

    public static vpb i() {
        long j = 1;
        return h(b2c.j, weo.Q(0.0f, 400.0f, new hqe((j & 4294967295L) | (j << 32)), 1), jx9.w0);
    }

    public static vpb j() {
        int i = 1;
        long j = 1;
        b9r Q = weo.Q(0.0f, 400.0f, new hqe((j & 4294967295L) | (j << 32)), 1);
        hz2 hz2Var = b2c.m;
        return h(Intrinsics.d(hz2Var, b2c.k) ? b2c.c : Intrinsics.d(hz2Var, hz2Var) ? b2c.i : b2c.f, Q, new u8b(i, 2));
    }

    public static e9b k(int i, Function1 function1) {
        long j = 1;
        b9r Q = weo.Q(0.0f, 400.0f, new wpe((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            function1 = jx9.x0;
        }
        return new e9b(new g8t((y3c) null, new ysq(Q, new mp3(1, function1)), (bc4) null, (ocg) null, (LinkedHashMap) null, 61));
    }

    public static final e9b l(wdc wdcVar, Function1 function1) {
        return new e9b(new g8t((y3c) null, new ysq(wdcVar, new mp3(2, function1)), (bc4) null, (ocg) null, (LinkedHashMap) null, 61));
    }

    public static vpb m() {
        long j = 1;
        return new vpb(new g8t((y3c) null, new ysq(weo.Q(0.0f, 400.0f, new wpe((j & 4294967295L) | (j << 32)), 1), new u8b(1, 3)), (bc4) null, (ocg) null, (LinkedHashMap) null, 61));
    }

    public static final vpb n(wdc wdcVar, Function1 function1) {
        return new vpb(new g8t((y3c) null, new ysq(wdcVar, new mp3(3, function1)), (bc4) null, (ocg) null, (LinkedHashMap) null, 61));
    }
}
