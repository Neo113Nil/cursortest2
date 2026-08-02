package defpackage;

import androidx.compose.foundation.layout.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l1r {
    public static final float c;
    public static final float e;
    public static final float a = 30;
    public static final float b = 16;
    public static final float d = 6;
    public static final float f = 48;
    public static final float g = 68;

    static {
        float f2 = 8;
        c = f2;
        e = f2;
    }

    public static final void a(yci yciVar, Function2 function2, dup dupVar, long j, long j2, float f2, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-558258760);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.g(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(dupVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.e(j) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.e(j2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i2 |= oq5Var2.c(f2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if (oq5Var2.P(i2 & 1, (4793491 & i2) != 4793490)) {
            oq5Var2.U();
            if ((i & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            int i3 = i2 >> 6;
            oq5Var = oq5Var2;
            q5g.k(yciVar, dupVar, j, j2, null, f2, ild.C(-2084221700, new u30(function2, wn5Var, 5), oq5Var2), oq5Var, 1572864 | (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i2 >> 3) & 458752), 16);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new op0(yciVar, function2, dupVar, j, j2, f2, wn5Var, i);
        }
    }

    public static final void b(g1r g1rVar, yci yciVar, dup dupVar, long j, long j2, long j3, float f2, hq5 hq5Var, int i) {
        int i2;
        g1r g1rVar2;
        yci yciVar2;
        dup dupVar2;
        long j4;
        long j5;
        float f3;
        oq5 oq5Var;
        long j6;
        int i3;
        long j7;
        int i4;
        dup dupVar3;
        yci yciVar3;
        float f4;
        long j8;
        long j9;
        long j10;
        long j11;
        wn5 wn5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(258660814);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(g1rVar) : oq5Var2.h(g1rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 432;
        if ((i & 3072) == 0) {
            i5 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i5 |= RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i5 |= SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i5 |= 524288;
        }
        int i6 = i5 | 12582912;
        if (oq5Var2.P(i6 & 1, (4793491 & i6) != 4793490)) {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                tgo tgoVar = ((ivp) oq5Var2.j(kvp.a)).a;
                agr agrVar = pa5.a;
                long D = c3x.D(d85.b(((ma5) oq5Var2.j(agrVar)).c(), 0.8f, 0.0f, 0.0f, 0.0f, 14), ((ma5) oq5Var2.j(agrVar)).f());
                long f5 = ((ma5) oq5Var2.j(agrVar)).f();
                ma5 ma5Var = (ma5) oq5Var2.j(agrVar);
                if (ma5Var.g()) {
                    i3 = -4193281;
                    j7 = c3x.D(d85.b(ma5Var.f(), 0.6f, 0.0f, 0.0f, 0.0f, 14), ma5Var.d());
                } else {
                    i3 = -4193281;
                    j7 = ((d85) ma5Var.b.getValue()).a;
                }
                i4 = i6 & i3;
                dupVar3 = tgoVar;
                yciVar3 = vci.a;
                f4 = 6;
                j8 = j7;
                j9 = D;
                j10 = f5;
            } else {
                oq5Var2.S();
                yciVar3 = yciVar;
                j9 = j;
                j10 = j2;
                j8 = j3;
                f4 = f2;
                i4 = i6 & (-4193281);
                dupVar3 = dupVar;
            }
            oq5Var2.q();
            String str = g1rVar.b;
            if (str != null) {
                oq5Var2.Z(1609221416);
                long j12 = j8;
                wf0 wf0Var = new wf0(3, j12, g1rVar, str);
                j11 = j12;
                g1rVar2 = g1rVar;
                wn5Var = ild.C(1843479216, wf0Var, oq5Var2);
                oq5Var2.p(false);
            } else {
                g1rVar2 = g1rVar;
                j11 = j8;
                oq5Var2.Z(1609519419);
                oq5Var2.p(false);
                wn5Var = null;
            }
            float f6 = f4;
            a(a.m(yciVar3, 12), wn5Var, dupVar3, j9, j10, f6, ild.C(-261845785, new f1r(g1rVar2, 1), oq5Var2), oq5Var2, (i4 & 896) | 12582912 | ((i4 >> 3) & 3670016));
            f3 = f6;
            oq5Var = oq5Var2;
            j6 = j11;
            j5 = j10;
            j4 = j9;
            dupVar2 = dupVar3;
            yciVar2 = yciVar3;
        } else {
            g1rVar2 = g1rVar;
            oq5Var2.S();
            yciVar2 = yciVar;
            dupVar2 = dupVar;
            j4 = j;
            j5 = j2;
            f3 = f2;
            oq5Var = oq5Var2;
            j6 = j3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k1r(g1rVar2, yciVar2, dupVar2, j4, j5, j6, f3, i);
        }
    }

    public static final void c(wn5 wn5Var, Function2 function2, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-534813202);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function2) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            vci vciVar = vci.a;
            yci q = a.q(vciVar, b, 0.0f, c, 0.0f, 10);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new r30(14);
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, kfhVar, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci o = a.o(androidx.compose.ui.layout.a.c(vciVar, "text"), 0.0f, d, 1);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, o);
            oq5Var.d0();
            int i5 = i2;
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            eta.l(i5 & 14, wn5Var, oq5Var, true);
            yci c2 = androidx.compose.ui.layout.a.c(vciVar, Constants.KEY_ACTION);
            kfh d3 = ug3.d(iz2Var, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, c2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            function2.invoke(oq5Var, Integer.valueOf((i5 >> 3) & 14));
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(wn5Var, function2, i, 12);
        }
    }

    public static final void d(wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(917397959);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            r30 r30Var = r30.l;
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, r30Var, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci n = a.n(vciVar, b, d);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, n);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var.invoke(oq5Var, Integer.valueOf(i2 & 14));
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tg3(wn5Var, i, 6);
        }
    }
}
