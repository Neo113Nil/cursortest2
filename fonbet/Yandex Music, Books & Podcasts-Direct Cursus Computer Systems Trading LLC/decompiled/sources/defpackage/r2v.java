package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class r2v {
    public static final float a = 16;
    public static final float b = 496;
    public static final float c = 2;

    public static final void a(String str, jzb jzbVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        long j;
        int i3;
        float f;
        float f2;
        Function0 function0;
        int i4;
        String str2;
        fk0 fk0Var;
        int i5;
        Function0 function02;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-703910447);
        int i6 = i2 | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 32 : 16) | (oq5Var2.d(i) ? 256 : 128) | (oq5Var2.f(yciVar) ? 2048 : 1024);
        if ((i6 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            str2 = str;
            oq5Var = oq5Var2;
        } else {
            jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
            ppc ppcVar = (ppc) oq5Var2.j(es5.k);
            ids O = o5g.O(0, 1, oq5Var2);
            ges c2 = nu0.c();
            Function0 function03 = (Function0) oq5Var2.j(zlu.d);
            ozm ozmVar = htu.a;
            float f3 = ((gtu) oq5Var2.j(ozmVar)).l;
            float f4 = ((gtu) oq5Var2.j(ozmVar)).j;
            long j2 = ((gtu) oq5Var2.j(ozmVar)).o;
            int L = jx7Var.L(f3);
            int L2 = jx7Var.L(f4);
            boolean z = jzbVar != null;
            float f5 = z ? 16 : 0;
            if (z) {
                j = j2;
                f = 4;
                i3 = 0;
            } else {
                j = j2;
                i3 = 0;
                f = 0;
            }
            int L3 = jx7Var.L(f5);
            int L4 = jx7Var.L(f);
            int max = Math.max(i3, ((i - L) - L3) - L4);
            boolean d = ((i6 & 14) == 4) | oq5Var2.d(max) | oq5Var2.g(z);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (d || K == obj) {
                fds fdsVar = new fds(0.0f, 12, j, v7g.z(14));
                str.getClass();
                ppcVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                int i7 = 0;
                for (int i8 = 3; i7 < i8; i8 = 3) {
                    int i9 = i7 + 1;
                    arrayList.add(new Pair(Integer.valueOf(i9), fdsVar));
                    i7 = i9;
                }
                f2 = f5;
                as3 B = n7w.B(str, c2, max, L2, uah.n(arrayList), jx7Var, ppcVar);
                function0 = function03;
                i4 = L4;
                str2 = str;
                K = new spl(str2, ids.a(O, str, ges.b(c2, 0L, B.a, null, null, 0L, 3, v7g.D(B.c, 8589934592L), null, null, 0, 0, 16613373), 2, false, B.b, ia6.b(max, 0, 13), 968), jzbVar);
                oq5Var2.k0(K);
            } else {
                str2 = str;
                f2 = f5;
                function0 = function03;
                i4 = L4;
            }
            spl splVar = (spl) K;
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = szf.g0(splVar);
                oq5Var2.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            Object K3 = oq5Var2.K();
            if (K3 == obj) {
                K3 = szf.g0(null);
                oq5Var2.k0(K3);
            }
            aqi aqiVar2 = (aqi) K3;
            Object K4 = oq5Var2.K();
            if (K4 == obj) {
                K4 = vq2.a(1.0f);
                oq5Var2.k0(K4);
            }
            fk0 fk0Var2 = (fk0) K4;
            boolean h = oq5Var2.h(splVar) | oq5Var2.h(fk0Var2);
            Object K5 = oq5Var2.K();
            if (h || K5 == obj) {
                K5 = new ocu(splVar, fk0Var2, aqiVar, aqiVar2, (Continuation) null);
                aqiVar2 = aqiVar2;
                oq5Var2.k0(K5);
            }
            gld.w(oq5Var2, splVar, (Function2) K5);
            yci D = ksw.D(yciVar, str2, null);
            kfh d2 = ug3.d(b2c.f, false);
            int i10 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, D);
            xp5.T.getClass();
            Function0 function04 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function04);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var2, i10, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            yci v = xp3.v(b.a.b(vci.a));
            boolean d3 = oq5Var2.d(L3) | oq5Var2.d(i4) | oq5Var2.f(function0) | oq5Var2.h(fk0Var2);
            Object K6 = oq5Var2.K();
            if (d3 || K6 == obj) {
                fk0Var = fk0Var2;
                int i11 = i4;
                Function0 function05 = function0;
                K6 = new cq5(fk0Var, aqiVar2, L3, i11, function05, aqiVar);
                i5 = i11;
                function02 = function05;
                aqiVar = aqiVar;
                oq5Var2.k0(K6);
            } else {
                fk0Var = fk0Var2;
                i5 = i4;
                function02 = function0;
            }
            ksw.j(0, oq5Var2, v, (Function1) K6);
            oq5Var = oq5Var2;
            float f6 = f2;
            c(f6, i5, function02, (spl) aqiVar.getValue(), ((Number) fk0Var.e()).floatValue(), oq5Var);
            c(f6, i5, function02, (spl) aqiVar2.getValue(), 1.0f - ((Number) fk0Var.e()).floatValue(), oq5Var);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(str2, jzbVar, i, yciVar, i2);
        }
    }

    public static final void b(int i, int i2, float f, float f2, float f3, Function0 function0, jpa jpaVar, spl splVar, float f4) {
        if (f4 <= 0.01f) {
            return;
        }
        cds cdsVar = splVar.b;
        int i3 = splVar.c != null ? i + i2 : 0;
        long j = cdsVar.c;
        float f5 = (f - ((((int) (j >> 32)) + i3) / 2.0f)) + f2;
        float f6 = f3 - (((int) (j & 4294967295L)) / 2.0f);
        long j2 = ((ylu) function0.invoke()).d;
        ((xzi) jpaVar.q0().b).m0(f5, f6);
        try {
            v5g.A(jpaVar, cdsVar, d85.b(j2, d85.d(j2) * f4, 0.0f, 0.0f, 0.0f, 14), 0L, 252);
        } finally {
            ((xzi) jpaVar.q0().b).m0(-f5, -f6);
        }
    }

    public static final void c(float f, int i, Function0 function0, spl splVar, float f2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1550003708);
        if (f2 <= 0.01f) {
            oq5Var.p(false);
            return;
        }
        jzb jzbVar = splVar != null ? splVar.c : null;
        if (jzbVar == null) {
            oq5Var.Z(-966910018);
        } else {
            oq5Var.Z(-966910017);
            yci m = d.m(b.a.a(vci.a, b2c.f), f);
            boolean c2 = oq5Var.c(f2) | oq5Var.h(splVar) | oq5Var.d(i);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (c2 || K == kjnVar) {
                K = new p2v(f2, splVar, i);
                oq5Var.k0(K);
            }
            yci a2 = androidx.compose.ui.graphics.a.a(m, (Function1) K);
            boolean f3 = oq5Var.f(function0);
            Object K2 = oq5Var.K();
            if (f3 || K2 == kjnVar) {
                K2 = new l92(1, function0);
                oq5Var.k0(K2);
            }
            lg3.p(jzbVar, (Function0) K2, a2, oq5Var, 0);
        }
        oq5Var.p(false);
        oq5Var.p(false);
    }

    public static final void d(aqi aqiVar, sdr sdrVar, sdr sdrVar2, sdr sdrVar3, Function1 function1, Function0 function0, Function0 function02, Function1 function12, yci yciVar, Function1 function13, hq5 hq5Var, int i) {
        yci yciVar2;
        sdrVar.getClass();
        sdrVar3.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1013758333);
        if (((i | (oq5Var.f(aqiVar) ? 4 : 2) | (oq5Var.f(sdrVar) ? 32 : 16) | (oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function02) ? 1048576 : 524288) | (oq5Var.h(function12) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | 100663296 | (oq5Var.h(function13) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456)) & 306783379) == 306783378 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            Object value = aqiVar.getValue();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new t0v(7);
                oq5Var.k0(K);
            }
            ot0.l(value, (Function1) K, null, null, null, false, ild.C(-1541066262, new g0d(function13, sdrVar2, sdrVar, sdrVar3, function1, function0, function02, function12), oq5Var), oq5Var, 1572912, 60);
            yciVar2 = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i11(aqiVar, sdrVar, sdrVar2, sdrVar3, function1, function0, function02, function12, yciVar2, function13, i);
        }
    }

    public static final void e(yci yciVar, yci yciVar2, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1430351260);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar2;
        } else {
            vci vciVar = vci.a;
            yci yciVar4 = i4 != 0 ? vciVar : yciVar2;
            yci o = androidx.compose.foundation.layout.a.o(d.d(yciVar, 1.0f), a, 0.0f, 2);
            kfh d = ug3.d(b2c.f, false);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            bg3.a(d.e(d.d(d.t(vciVar, 0.0f, b, 1), 1.0f), ((gtu) oq5Var.j(htu.a)).j).f(yciVar4), null, false, wn5Var, oq5Var, (i3 << 3) & 7168, 6);
            oq5Var.p(true);
            yciVar3 = yciVar4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(yciVar, (Object) yciVar3, (Function2) wn5Var, i, i2, 15);
        }
    }

    public static final void f(l2v l2vVar, final sdr sdrVar, final sdr sdrVar2, final sdr sdrVar3, final Function1 function1, final Function0 function0, Function0 function02, Function1 function12, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        kjn kjnVar;
        boolean z;
        int i3;
        t6k T0;
        final l2v l2vVar2;
        oq5 oq5Var;
        d8t d8tVar;
        boolean z2;
        act S;
        boolean z3;
        act S2;
        float f;
        oq5 oq5Var2;
        int i4;
        Object obj;
        t6k t6kVar;
        z6g z6gVar;
        v6k v6kVar;
        x6k x6kVar;
        t6k t6kVar2;
        v6k v6kVar2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(2029730451);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.h(l2vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var3.f(sdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var3.f(sdrVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var3.f(sdrVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var3.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var3.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var3.h(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var3.h(function12) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var3.f(yciVar) ? 67108864 : 33554432;
        }
        int i5 = i2;
        if ((i5 & 38347923) == 38347922 && oq5Var3.z()) {
            oq5Var3.S();
            oq5Var2 = oq5Var3;
        } else {
            boolean booleanValue = ((Boolean) oq5Var3.j(rkg.a)).booleanValue();
            kjn kjnVar2 = gq5.a;
            boolean z4 = true;
            if (booleanValue) {
                oq5Var3.Z(-1144226696);
                int i6 = ((i5 >> 3) & 14) | ((i5 << 3) & 112);
                Object K = oq5Var3.K();
                if (K == kjnVar2) {
                    i4 = i6;
                    K = new w6g(((m2v) sdrVar.getValue()).a, ((m2v) sdrVar.getValue()).c, ((m2v) sdrVar.getValue()).b, ((m2v) sdrVar.getValue()).d);
                    oq5Var3.k0(K);
                } else {
                    i4 = i6;
                }
                w6g w6gVar = (w6g) K;
                boolean h = ((((i4 & 14) ^ 6) > 4 && oq5Var3.f(sdrVar)) || (i4 & 6) == 4) | oq5Var3.h(w6gVar);
                Object K2 = oq5Var3.K();
                if (h || K2 == kjnVar2) {
                    npt nptVar = new npt(sdrVar, w6gVar, (Continuation) null, 24);
                    oq5Var3.k0(nptVar);
                    obj = nptVar;
                } else {
                    obj = K2;
                }
                gld.w(oq5Var3, sdrVar, (Function2) obj);
                w6gVar.getClass();
                oq5Var3.W(-953171130, l2vVar);
                t6k t6kVar3 = w6gVar.a;
                v6k v6kVar3 = w6gVar.b;
                x6k x6kVar2 = w6gVar.c;
                t6k t6kVar4 = w6gVar.d;
                Object K3 = oq5Var3.K();
                Object obj2 = K3;
                if (K3 == kjnVar2) {
                    z6g z6gVar2 = new z6g(t6kVar3.e());
                    oq5Var3.k0(z6gVar2);
                    obj2 = z6gVar2;
                }
                z6g z6gVar3 = (z6g) obj2;
                Object[] objArr = {z6gVar3, t6kVar3, v6kVar3, x6kVar2, t6kVar4};
                boolean f2 = oq5Var3.f(t6kVar3) | oq5Var3.h(z6gVar3) | oq5Var3.f(v6kVar3) | oq5Var3.f(x6kVar2) | oq5Var3.f(t6kVar4);
                Object K4 = oq5Var3.K();
                if (f2 || K4 == kjnVar2) {
                    K4 = new x6g(t6kVar3, z6gVar3, v6kVar3, x6kVar2, t6kVar4, (Continuation) null);
                    t6kVar = t6kVar3;
                    z6gVar = z6gVar3;
                    v6kVar = v6kVar3;
                    x6kVar = x6kVar2;
                    t6kVar2 = t6kVar4;
                    oq5Var3.k0(K4);
                } else {
                    t6kVar2 = t6kVar4;
                    x6kVar = x6kVar2;
                    z6gVar = z6gVar3;
                    v6kVar = v6kVar3;
                    t6kVar = t6kVar3;
                }
                gld.z(objArr, (Function2) K4, oq5Var3);
                Object[] objArr2 = {z6gVar, x6kVar, t6kVar2, v6kVar};
                boolean f3 = oq5Var3.f(x6kVar) | oq5Var3.f(t6kVar2) | oq5Var3.h(z6gVar) | oq5Var3.f(v6kVar);
                v6k v6kVar4 = v6kVar;
                Object K5 = oq5Var3.K();
                if (f3 || K5 == kjnVar2) {
                    K5 = new d57(x6kVar, t6kVar2, z6gVar, v6kVar4, (Continuation) null, 29);
                    v6kVar2 = v6kVar4;
                    oq5Var3.k0(K5);
                } else {
                    v6kVar2 = v6kVar4;
                }
                gld.z(objArr2, (Function2) K5, oq5Var3);
                boolean h2 = oq5Var3.h(z6gVar) | oq5Var3.f(t6kVar) | oq5Var3.f(x6kVar) | oq5Var3.f(t6kVar2) | oq5Var3.f(v6kVar2);
                Object K6 = oq5Var3.K();
                if (h2 || K6 == kjnVar2) {
                    K6 = new x6g(z6gVar, t6kVar, x6kVar, t6kVar2, v6kVar2, (Continuation) null);
                    oq5Var3.k0(K6);
                }
                gld.w(oq5Var3, z6gVar, (Function2) K6);
                T0 = z6gVar.b;
                oq5Var3.p(false);
                oq5Var3.p(false);
                z = false;
                l2vVar2 = l2vVar;
                oq5Var = oq5Var3;
                kjnVar = kjnVar2;
                i3 = 6;
            } else {
                oq5Var3.Z(-1144065837);
                kjnVar = kjnVar2;
                z = false;
                i3 = 6;
                T0 = gut.T0(((m2v) sdrVar.getValue()).a, ((m2v) sdrVar.getValue()).b, ((m2v) sdrVar.getValue()).c, ((m2v) sdrVar.getValue()).d, l2vVar, oq5Var3, (i5 << 12) & 57344, 224);
                l2vVar2 = l2vVar;
                oq5Var = oq5Var3;
                oq5Var.p(false);
            }
            final t6k t6kVar5 = T0;
            final aqi o0 = szf.o0(Boolean.valueOf(l2vVar2.b.a == j1g.a ? true : z), oq5Var);
            boolean z5 = l2vVar2.a.g instanceof h2v;
            boolean f4 = oq5Var.f(l2vVar2);
            Object K7 = oq5Var.K();
            if (f4 || K7 == kjnVar) {
                K7 = new jap();
                oq5Var.k0(K7);
            }
            final jap japVar = (jap) K7;
            boolean z6 = z;
            final yci t = lsq.t(japVar, z5, t6kVar5.e(), ((m2v) sdrVar.getValue()).b, function12, function02, oq5Var, ((i5 >> 6) & 458752) | i3 | (i5 & 3670016), 64);
            aqi K8 = ksw.K(oq5Var);
            agr agrVar = htu.a;
            final float f5 = ((gtu) oq5Var.j(agrVar)).j;
            float f6 = ((gtu) oq5Var.j(agrVar)).m;
            final float f7 = ((gtu) oq5Var.j(agrVar)).n;
            final float f8 = f5 + f6;
            boolean z7 = ((!((Boolean) sdrVar2.getValue()).booleanValue() || japVar.a()) && !((Boolean) K8.getValue()).booleanValue()) ? z6 ? 1 : 0 : true;
            d8t e = i8t.e(Boolean.valueOf(z7), "player_block_transition", oq5Var, 48, z6 ? 1 : 0);
            x6k x6kVar3 = e.d;
            oct octVar = azt.c;
            boolean booleanValue2 = ((Boolean) e.c()).booleanValue();
            oq5Var.Z(-1057012393);
            float f9 = booleanValue2 ? f8 : z6 ? 1.0f : 0.0f;
            oq5Var.p(z6);
            cma cmaVar = new cma(f9);
            boolean booleanValue3 = ((Boolean) x6kVar3.getValue()).booleanValue();
            oq5Var.Z(-1057012393);
            float f10 = booleanValue3 ? f8 : z6 ? 1.0f : 0.0f;
            oq5Var.p(z6);
            cma cmaVar2 = new cma(f10);
            e.f().getClass();
            oq5Var.Z(744476490);
            act S3 = weo.S(300, z6 ? 1 : 0, null, 6);
            oq5Var.p(z6);
            final z7t c2 = i8t.c(e, cmaVar, cmaVar2, S3, octVar, oq5Var, 196608);
            oct octVar2 = azt.a;
            boolean booleanValue4 = ((Boolean) e.c()).booleanValue();
            oq5Var.Z(36735883);
            float f11 = booleanValue4 ? 1.0f : 0.0f;
            oq5Var.p(z6);
            Float valueOf = Float.valueOf(f11);
            boolean booleanValue5 = ((Boolean) x6kVar3.getValue()).booleanValue();
            oq5Var.Z(36735883);
            float f12 = booleanValue5 ? 1.0f : 0.0f;
            oq5Var.p(z6);
            Float valueOf2 = Float.valueOf(f12);
            x7t f13 = e.f();
            f13.getClass();
            oq5Var.Z(985236262);
            if (((Boolean) f13.a()).booleanValue()) {
                d8tVar = e;
                S = new act(100, 200, nya.b);
                z2 = false;
            } else {
                d8tVar = e;
                z2 = false;
                S = weo.S(100, 0, nya.c, 2);
            }
            act actVar = S;
            oq5Var.p(z2);
            final z7t c3 = i8t.c(d8tVar, valueOf, valueOf2, actVar, octVar2, oq5Var, 196608);
            if (japVar.a() && !((Boolean) K8.getValue()).booleanValue()) {
                z4 = false;
            }
            d8t e2 = i8t.e(Boolean.valueOf(z4), "like_transition", oq5Var, 48, 0);
            boolean booleanValue6 = ((Boolean) e2.c()).booleanValue();
            oq5Var.Z(-710952799);
            float f14 = booleanValue6 ? 1.0f : 0.0f;
            oq5Var.p(false);
            Float valueOf3 = Float.valueOf(f14);
            boolean booleanValue7 = ((Boolean) e2.d.getValue()).booleanValue();
            oq5Var.Z(-710952799);
            float f15 = booleanValue7 ? 1.0f : 0.0f;
            oq5Var.p(false);
            Float valueOf4 = Float.valueOf(f15);
            x7t f16 = e2.f();
            f16.getClass();
            oq5Var.Z(757882598);
            if (((Boolean) f16.a()).booleanValue()) {
                S2 = new act(100, 200, nya.b);
                z3 = false;
            } else {
                z3 = false;
                S2 = weo.S(100, 0, nya.c, 2);
            }
            oq5Var.p(z3);
            final z7t c4 = i8t.c(e2, valueOf3, valueOf4, S2, octVar2, oq5Var, 196608);
            oq5 oq5Var4 = oq5Var;
            Object K9 = oq5Var4.K();
            if (K9 == kjnVar) {
                f = 0.0f;
                K9 = tlm.h(0.0f, oq5Var4);
            } else {
                f = 0.0f;
            }
            final poi poiVar = (poi) K9;
            Object K10 = oq5Var4.K();
            if (K10 == kjnVar) {
                K10 = tlm.h(f, oq5Var4);
            }
            final poi poiVar2 = (poi) K10;
            boolean h3 = oq5Var4.h(japVar);
            Object K11 = oq5Var4.K();
            if (h3 || K11 == kjnVar) {
                K11 = new pt4(japVar, poiVar, null, 2);
                oq5Var4.k0(K11);
            }
            gld.w(oq5Var4, japVar, (Function2) K11);
            boolean h4 = oq5Var4.h(japVar);
            Object K12 = oq5Var4.K();
            if (h4 || K12 == kjnVar) {
                K12 = new pt4(japVar, poiVar2, null, 3);
                oq5Var4.k0(K12);
            }
            gld.w(oq5Var4, japVar, (Function2) K12);
            final Function0 function03 = (Function0) oq5Var4.j(zlu.d);
            final boolean z8 = z7;
            e(yciVar, null, ild.C(-1118693146, new pyc() { // from class: o2v
                @Override // defpackage.pyc
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    boolean z9;
                    c cVar = (c) obj3;
                    hq5 hq5Var2 = (hq5) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        if (oq5Var5.z()) {
                            oq5Var5.S();
                            return Unit.a;
                        }
                    }
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    jx7 jx7Var = (jx7) oq5Var6.j(es5.h);
                    int L = jx7Var.L(cVar.d());
                    int L2 = L - jx7Var.L(f8 * 2);
                    int i7 = L2 < 0 ? 0 : L2;
                    Object K13 = oq5Var6.K();
                    kjn kjnVar3 = gq5.a;
                    if (K13 == kjnVar3) {
                        K13 = szf.g0(new hqe(0L));
                        oq5Var6.k0(K13);
                    }
                    aqi aqiVar = (aqi) K13;
                    b bVar = b.a;
                    vci vciVar = vci.a;
                    yci o = androidx.compose.foundation.layout.a.o(bVar.b(vciVar), ((cma) c2.getValue()).a, 0.0f, 2);
                    float f17 = f7;
                    yci f18 = xp3.u(o, ugo.a(f17)).f(t);
                    jap japVar2 = japVar;
                    boolean h5 = oq5Var6.h(japVar2);
                    t6k t6kVar6 = t6kVar5;
                    boolean f19 = h5 | oq5Var6.f(t6kVar6);
                    Object K14 = oq5Var6.K();
                    if (f19 || K14 == kjnVar3) {
                        K14 = new xes(25, japVar2, t6kVar6);
                        oq5Var6.k0(K14);
                    }
                    Function0 function04 = (Function0) K14;
                    Function0 function05 = function03;
                    boolean f20 = oq5Var6.f(function05);
                    Object K15 = oq5Var6.K();
                    if (f20 || K15 == kjnVar3) {
                        K15 = new l92(2, function05);
                        oq5Var6.k0(K15);
                    }
                    yci a2 = androidx.compose.ui.draw.a.a(f18, new po1(f17, (Function0) K15, function04, 3));
                    Object K16 = oq5Var6.K();
                    if (K16 == kjnVar3) {
                        K16 = new t0v(6);
                        oq5Var6.k0(K16);
                    }
                    ug3.a(nfp.b(a2, true, (Function1) K16), oq5Var6, 0);
                    sdr sdrVar4 = sdrVar3;
                    boolean booleanValue8 = ((Boolean) sdrVar4.getValue()).booleanValue();
                    l2v l2vVar3 = l2vVar2;
                    boolean f21 = oq5Var6.f(l2vVar3);
                    boolean z10 = z8;
                    boolean g = oq5Var6.g(booleanValue8) | f21 | oq5Var6.g(z10);
                    Object K17 = oq5Var6.K();
                    if (g || K17 == kjnVar3) {
                        K17 = r2v.j(l2vVar3.a, z10, ((Boolean) sdrVar4.getValue()).booleanValue());
                        oq5Var6.k0(K17);
                    }
                    r2v.a((String) K17, l2vVar3.a.i, i7, bVar.b(vciVar), oq5Var6, 0);
                    boolean booleanValue9 = ((Boolean) sdrVar2.getValue()).booleanValue();
                    yci a3 = bVar.a(vciVar, b2c.e);
                    float f22 = f5;
                    yci m = d.m(a3, f22);
                    sdr sdrVar5 = c3;
                    boolean f23 = oq5Var6.f(sdrVar5);
                    Object K18 = oq5Var6.K();
                    if (f23 || K18 == kjnVar3) {
                        K18 = new f6u(sdrVar5, 22);
                        oq5Var6.k0(K18);
                    }
                    q7g.g(booleanValue9, function0, wyf.s(m, (Function0) K18), z10, oq5Var6, 0);
                    aqi aqiVar2 = o0;
                    boolean booleanValue10 = ((Boolean) aqiVar2.getValue()).booleanValue();
                    yci m2 = d.m(bVar.a(vciVar, b2c.g), f22);
                    sdr sdrVar6 = c4;
                    boolean f24 = oq5Var6.f(sdrVar6);
                    Object K19 = oq5Var6.K();
                    if (f24 || K19 == kjnVar3) {
                        z9 = z10;
                        K19 = new f6u(sdrVar6, 23);
                        oq5Var6.k0(K19);
                    } else {
                        z9 = z10;
                    }
                    yci s = wyf.s(m2, (Function0) K19);
                    boolean h6 = oq5Var6.h(japVar2);
                    Function1 function13 = function1;
                    boolean f25 = h6 | oq5Var6.f(function13) | oq5Var6.f(aqiVar2);
                    Object K20 = oq5Var6.K();
                    if (f25 || K20 == kjnVar3) {
                        K20 = new ftr(11, japVar2, function13, aqiVar2);
                        oq5Var6.k0(K20);
                    }
                    Function0 function06 = (Function0) K20;
                    boolean f26 = oq5Var6.f(sdrVar5);
                    Object K21 = oq5Var6.K();
                    if (f26 || K21 == kjnVar3) {
                        K21 = new f6u(sdrVar5, 24);
                        oq5Var6.k0(K21);
                    }
                    q7g.d(0, oq5Var6, s, function06, (Function0) K21, booleanValue10, z9);
                    boolean a4 = japVar2.a();
                    e9b e3 = androidx.compose.animation.c.e(null, 3);
                    vpb f27 = androidx.compose.animation.c.f(null, 3);
                    yci a5 = bVar.a(vciVar, b2c.c);
                    boolean d = oq5Var6.d(L);
                    Object K22 = oq5Var6.K();
                    if (d || K22 == kjnVar3) {
                        K22 = new v50(L, poiVar, aqiVar, 19);
                        oq5Var6.k0(K22);
                    }
                    yci i8 = androidx.compose.foundation.layout.a.i(a5, (Function1) K22);
                    Object K23 = oq5Var6.K();
                    if (K23 == kjnVar3) {
                        K23 = new x80(aqiVar, 26);
                        oq5Var6.k0(K23);
                    }
                    etn.f(a4, androidx.compose.ui.layout.a.f(i8, (Function1) K23), e3, f27, null, ild.C(910307774, new aqp(14, sdrVar, function05, poiVar2), oq5Var6), oq5Var6, 200064, 16);
                    return Unit.a;
                }
            }, oq5Var4), oq5Var4, ((i5 >> 24) & 14) | 384, 2);
            oq5Var2 = oq5Var4;
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new n6h(l2vVar, sdrVar, sdrVar2, sdrVar3, function1, function0, function02, function12, yciVar, i);
        }
    }

    public static final void g(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1617842434);
        if (((i | 6) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Function0 function0 = (Function0) oq5Var.j(zlu.d);
            agr agrVar = htu.a;
            tgo a2 = ugo.a(((gtu) oq5Var.j(agrVar)).n);
            vci vciVar = vci.a;
            yci u = xp3.u(vciVar, a2);
            float f = ((gtu) oq5Var.j(agrVar)).n;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new wuu(26);
                oq5Var.k0(K);
            }
            Function0 function02 = (Function0) K;
            boolean f2 = oq5Var.f(function0);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new l92(3, function0);
                oq5Var.k0(K2);
            }
            e(vciVar, androidx.compose.ui.draw.a.a(u, new po1(f, (Function0) K2, function02, 3)), h4a.i, oq5Var, 390, 0);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 28);
        }
    }

    public static final void h(final l2v l2vVar, sdr sdrVar, final sdr sdrVar2, final Function0 function0, final Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-999988693);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(l2vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(sdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(sdrVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i3 = i2;
        if ((i3 & 74899) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean z = ((Boolean) sdrVar.getValue()).booleanValue() || ((Boolean) ksw.K(oq5Var2).getValue()).booleanValue();
            final Function0 function02 = (Function0) oq5Var2.j(zlu.d);
            agr agrVar = htu.a;
            final float f = ((gtu) oq5Var2.j(agrVar)).n;
            final float f2 = ((gtu) oq5Var2.j(agrVar)).j;
            final float f3 = f2 + ((gtu) oq5Var2.j(agrVar)).m;
            boolean z2 = l2vVar.b.a == j1g.a;
            final float f4 = z ? f3 : 0;
            final boolean z3 = z;
            final float f5 = z ? 1.0f : 0.0f;
            final boolean z4 = z2;
            oq5Var = oq5Var2;
            e(yciVar, null, ild.C(1037955832, new pyc() { // from class: n2v
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    c cVar = (c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    jx7 jx7Var = (jx7) oq5Var4.j(es5.h);
                    int L = jx7Var.L(cVar.d()) - jx7Var.L(f3 * 2);
                    int i4 = L < 0 ? 0 : L;
                    b bVar = b.a;
                    vci vciVar = vci.a;
                    yci o = androidx.compose.foundation.layout.a.o(bVar.b(vciVar), f4, 0.0f, 2);
                    float f6 = f;
                    yci u = xp3.u(o, ugo.a(f6));
                    Object K = oq5Var4.K();
                    Object obj4 = gq5.a;
                    if (K == obj4) {
                        K = new wuu(26);
                        oq5Var4.k0(K);
                    }
                    Function0 function03 = (Function0) K;
                    Function0 function04 = function02;
                    boolean f7 = oq5Var4.f(function04);
                    Object K2 = oq5Var4.K();
                    if (f7 || K2 == obj4) {
                        K2 = new l92(4, function04);
                        oq5Var4.k0(K2);
                    }
                    ug3.a(androidx.compose.ui.draw.a.a(u, new po1(f6, (Function0) K2, function03, 3)), oq5Var4, 0);
                    sdr sdrVar3 = sdrVar2;
                    boolean booleanValue = ((Boolean) sdrVar3.getValue()).booleanValue();
                    l2v l2vVar2 = l2vVar;
                    boolean f8 = oq5Var4.f(l2vVar2);
                    boolean z5 = z3;
                    boolean g = oq5Var4.g(booleanValue) | f8 | oq5Var4.g(z5);
                    Object K3 = oq5Var4.K();
                    if (g || K3 == obj4) {
                        K3 = r2v.j(l2vVar2.a, z5, ((Boolean) sdrVar3.getValue()).booleanValue());
                        oq5Var4.k0(K3);
                    }
                    r2v.a((String) K3, l2vVar2.a.i, i4, bVar.b(vciVar), oq5Var4, 0);
                    yci a2 = bVar.a(vciVar, b2c.e);
                    float f9 = f2;
                    yci m = d.m(a2, f9);
                    float f10 = f5;
                    boolean c2 = oq5Var4.c(f10);
                    Object K4 = oq5Var4.K();
                    if (c2 || K4 == obj4) {
                        K4 = new y8q(f10);
                        oq5Var4.k0(K4);
                    }
                    q7g.g(z5, function0, wyf.s(m, (Function0) K4), z5, oq5Var4, 0);
                    yci m2 = d.m(bVar.a(vciVar, b2c.g), f9);
                    Function1 function12 = function1;
                    boolean f11 = oq5Var4.f(function12);
                    boolean z6 = z4;
                    boolean g2 = f11 | oq5Var4.g(z6);
                    Object K5 = oq5Var4.K();
                    if (g2 || K5 == obj4) {
                        K5 = new j32(function12, z6, 3);
                        oq5Var4.k0(K5);
                    }
                    Function0 function05 = (Function0) K5;
                    boolean c3 = oq5Var4.c(f10);
                    Object K6 = oq5Var4.K();
                    if (c3 || K6 == obj4) {
                        K6 = new y8q(f10);
                        oq5Var4.k0(K6);
                    }
                    q7g.d(0, oq5Var4, m2, function05, (Function0) K6, z6, z5);
                    return Unit.a;
                }
            }, oq5Var2), oq5Var, ((i3 >> 15) & 14) | 384, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(l2vVar, sdrVar, sdrVar2, function0, function1, yciVar, i, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final l2v l2vVar, final l2v l2vVar2, final sdr sdrVar, final sdr sdrVar2, final sdr sdrVar3, final Function1 function1, final Function0 function0, final Function0 function02, final Function1 function12, yci yciVar, hq5 hq5Var, final int i, final int i2) {
        int i3;
        Function1 function13;
        yci yciVar2;
        final yci yciVar3;
        xmn r;
        Function2 function2;
        l2vVar.getClass();
        l2vVar2.getClass();
        sdrVar.getClass();
        sdrVar2.getClass();
        sdrVar3.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1011775166);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(l2vVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(l2vVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(sdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(sdrVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(sdrVar3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            function13 = function1;
            i3 |= oq5Var.h(function13) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function13 = function1;
        }
        if ((1572864 & i) == 0) {
            i3 |= oq5Var.h(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= oq5Var.h(function02) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i3 |= oq5Var.h(function12) ? 67108864 : 33554432;
        }
        int i4 = i2 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i4 != 0) {
            i3 |= 805306368;
        } else if ((805306368 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            if ((306783379 & i3) == 306783378 || !oq5Var.z()) {
                if (i4 != 0) {
                    yciVar2 = vci.a;
                }
                if (l2vVar.equals(l2vVar2)) {
                    oq5Var.Z(-286025266);
                    int i5 = i3 >> 6;
                    final yci yciVar4 = yciVar2;
                    h(l2vVar, sdrVar2, sdrVar3, function0, function13, yciVar4, oq5Var, (i3 & 14) | (i5 & 112) | (i5 & 896) | ((i3 >> 9) & 7168) | ((i3 >> 3) & 57344) | ((i3 >> 12) & 458752));
                    oq5Var.p(false);
                    r = oq5Var.r();
                    if (r != null) {
                        final int i6 = 0;
                        function2 = new Function2() { // from class: q2v
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i6) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        r2v.i(l2vVar, l2vVar2, sdrVar, sdrVar2, sdrVar3, function1, function0, function02, function12, yciVar4, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        r2v.i(l2vVar, l2vVar2, sdrVar, sdrVar2, sdrVar3, function1, function0, function02, function12, yciVar4, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        r.d = function2;
                        return;
                    }
                    return;
                }
                yci yciVar5 = yciVar2;
                oq5Var.Z(-296445916);
                oq5Var.p(false);
                int i7 = i3 & 14;
                int i8 = i3 >> 3;
                f(l2vVar, sdrVar, sdrVar2, sdrVar3, function1, function0, function02, function12, yciVar5, oq5Var, i7 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (3670016 & i8) | (29360128 & i8) | (i8 & 234881024));
                oq5Var = oq5Var;
                yciVar3 = yciVar5;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r != null) {
                final int i9 = 1;
                function2 = new Function2() { // from class: q2v
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i9) {
                            case 0:
                                ((Integer) obj2).getClass();
                                r2v.i(l2vVar, l2vVar2, sdrVar, sdrVar2, sdrVar3, function1, function0, function02, function12, yciVar3, (hq5) obj, rvf.R(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                r2v.i(l2vVar, l2vVar2, sdrVar, sdrVar2, sdrVar3, function1, function0, function02, function12, yciVar3, (hq5) obj, rvf.R(i | 1), i2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                r.d = function2;
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((306783379 & i3) == 306783378) {
        }
        if (i4 != 0) {
        }
        if (l2vVar.equals(l2vVar2)) {
        }
    }

    public static final String j(k2v k2vVar, boolean z, boolean z2) {
        a3v a3vVar = k2vVar.a;
        i2v i2vVar = k2vVar.g;
        if (i2vVar.equals(g2v.a)) {
            return "∞";
        }
        if (!(i2vVar instanceof h2v)) {
            b6e.s();
            return null;
        }
        if (z) {
            return ((h2v) i2vVar).a;
        }
        String str = ((h2v) i2vVar).a;
        String title = a3vVar.getTitle();
        if (StringsKt.U(title)) {
            title = null;
        }
        if (str == null || StringsKt.U(str)) {
            str = null;
        }
        x2v a2 = a3vVar.a();
        if (a2 instanceof t2v) {
            String title2 = a3vVar.getTitle();
            String concat = str != null ? StringUtil.SPACE.concat(str) : null;
            return ouj.n(title2, concat != null ? concat : "");
        }
        if ((a2 instanceof u2v) || (a2 instanceof v2v)) {
            if (z2 && title != null && str != null) {
                return ouj.o(title, " — ", str);
            }
            if (str == null) {
                return title == null ? "" : title;
            }
        } else {
            if (!(a2 instanceof w2v)) {
                b6e.s();
                return null;
            }
            if (z2 && title != null && str != null) {
                return ouj.o(title, " — ", str);
            }
            if (str == null) {
                return a3vVar.getTitle();
            }
        }
        return str;
    }
}
