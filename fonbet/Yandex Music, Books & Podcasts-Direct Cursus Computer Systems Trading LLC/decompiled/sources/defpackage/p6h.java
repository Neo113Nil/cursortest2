package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class p6h {
    public static final act a = weo.S(0, 0, null, 7);

    public static final void a(hvb hvbVar, hq5 hq5Var, int i) {
        int i2;
        hvb hvbVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-977149735);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(hvbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            hvbVar2 = hvbVar;
        } else {
            hvbVar2 = hvbVar;
            b(hvbVar2, ild.C(741276874, new mo5(hvbVar, 6), oq5Var), ksw.d, ksw.e, ksw.f, null, oq5Var, (i2 & 14) | 28080, 32);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o6h(hvbVar2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(hvb hvbVar, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, wn5 wn5Var4, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        yci yciVar3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-241483796);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(hvbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(wn5Var3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(wn5Var4) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((74899 & i3) == 74898 || !oq5Var.z()) {
                yci yciVar4 = i4 == 0 ? vci.a : yciVar2;
                if (hvbVar instanceof fvb) {
                    oq5Var.Z(27102283);
                    d(hvbVar, wn5Var, wn5Var2, wn5Var3, wn5Var4, yciVar4, oq5Var, i3 & 524286);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(26829545);
                    c((fvb) hvbVar, wn5Var, wn5Var2, wn5Var3, wn5Var4, yciVar4, oq5Var, i3 & 524286);
                    oq5Var.p(false);
                }
                yciVar3 = yciVar4;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new j6h(hvbVar, wn5Var, wn5Var2, wn5Var3, wn5Var4, yciVar3, i, i2, 0);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((74899 & i3) == 74898) {
        }
        if (i4 == 0) {
        }
        if (hvbVar instanceof fvb) {
        }
        yciVar3 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void c(fvb fvbVar, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, wn5 wn5Var4, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1050996086);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(fvbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(wn5Var4) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hz2 hz2Var = b2c.l;
            x2i x2iVar = qx0.a;
            nx0 g = qx0.g(fvbVar.e.a ? 24 : 48);
            yci o = a.o(yciVar, fvbVar.e.a(), 0.0f, 2);
            nho a2 = lho.a(g, hz2Var, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            int i4 = i2;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci q = a.q(new LayoutWeightElement(true, 1.0f), 0.0f, cub.b, 0.0f, 0.0f, 13);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var2.invoke(Boolean.valueOf(Intrinsics.d(fvbVar, dvb.a)), oq5Var, Integer.valueOf((i4 >> 3) & 112));
            float f = bub.b;
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.e(vciVar, f));
            wn5Var3.invoke(oq5Var, Integer.valueOf((i4 >> 9) & 14));
            u1g.l(oq5Var, d.e(vciVar, bub.c));
            eta.l((i4 >> 12) & 14, wn5Var4, oq5Var, true);
            wn5Var.invoke(fvbVar, oq5Var, Integer.valueOf(i4 & 126));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(fvbVar, wn5Var, wn5Var2, wn5Var3, wn5Var4, yciVar, i, 10);
        }
    }

    public static final void d(hvb hvbVar, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, wn5 wn5Var4, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        cma cmaVar;
        boolean z;
        Function2 function2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-814715370);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(hvbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(wn5Var4) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
            function2 = wn5Var4;
        } else {
            boolean z2 = hvbVar instanceof gvb;
            dvb dvbVar = dvb.a;
            if (z2) {
                cmaVar = new cma(((gvb) hvbVar).c());
            } else {
                if (!Intrinsics.d(hvbVar, dvbVar)) {
                    b6e.s();
                    return;
                }
                cmaVar = null;
            }
            gz2 gz2Var = b2c.o;
            kx0 kx0Var = qx0.c;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            int i4 = i2;
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (Intrinsics.d(hvbVar, dvbVar)) {
                oq5Var.Z(-146290544);
                oq5Var.p(false);
            } else {
                if (!z2) {
                    throw vz1.i(oq5Var, -146292754, false);
                }
                oq5Var.Z(-146288889);
                wn5Var.invoke(hvbVar, oq5Var, Integer.valueOf(i4 & 126));
                oq5Var.p(false);
            }
            float f = v0k.a;
            vci vciVar = vci.a;
            yci o = a.o(vciVar, f, 0.0f, 2);
            if (cmaVar != null) {
                o = o.f(d.r(vciVar, cmaVar.a));
            }
            ta5 a3 = sa5.a(kx0Var, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, o);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            u1g.l(oq5Var, d.e(vciVar, bub.a));
            if (Intrinsics.d(hvbVar, dvbVar)) {
                z = true;
            } else {
                if (!z2) {
                    b6e.s();
                    return;
                }
                z = false;
            }
            wn5Var2.invoke(Boolean.valueOf(z), oq5Var, Integer.valueOf((i4 >> 3) & 112));
            u1g.l(oq5Var, d.e(vciVar, bub.b));
            wn5Var3.invoke(oq5Var, Integer.valueOf((i4 >> 9) & 14));
            u1g.l(oq5Var, d.e(vciVar, bub.c));
            function2 = wn5Var4;
            function2.invoke(oq5Var, Integer.valueOf((i4 >> 12) & 14));
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(hvbVar, wn5Var, wn5Var2, wn5Var3, function2, yciVar, i, 9);
        }
    }

    public static final void e(f4h f4hVar, sdr sdrVar, c6h c6hVar, mcu mcuVar, sdr sdrVar2, ab0 ab0Var, hvb hvbVar, yci yciVar, hq5 hq5Var, int i) {
        sdr sdrVar3;
        yci yciVar2;
        f4hVar.getClass();
        sdrVar.getClass();
        mcuVar.getClass();
        sdrVar2.getClass();
        ab0Var.getClass();
        hvbVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1448299473);
        int i2 = (oq5Var.h(f4hVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            sdrVar3 = sdrVar;
            i2 |= oq5Var.f(sdrVar3) ? 32 : 16;
        } else {
            sdrVar3 = sdrVar;
        }
        int i3 = i2 | (oq5Var.h(c6hVar) ? 256 : 128) | (oq5Var.f(mcuVar) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(sdrVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i3 | (oq5Var.h(ab0Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(hvbVar) ? 1048576 : 524288) | 12582912;
        if ((4793491 & i4) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            t6h t6hVar = (t6h) bcx.x(c6hVar.getState(), oq5Var, 0).getValue();
            kfh d = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (Intrinsics.d(t6hVar, r6h.a)) {
                oq5Var.Z(-913205772);
                a(hvbVar, oq5Var, (i4 >> 18) & 14);
                oq5Var.p(false);
            } else {
                if (!(t6hVar instanceof s6h)) {
                    throw vz1.i(oq5Var, 801824787, false);
                }
                oq5Var.Z(-912986261);
                s6h s6hVar = (s6h) t6hVar;
                iil iilVar = s6hVar.a;
                ynn i6 = irv.i(oq5Var);
                z5h z5hVar = s6hVar.b;
                boolean h = oq5Var.h(c6hVar);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new i6h(c6hVar, 0);
                    oq5Var.k0(K);
                }
                yci c = com.yandex.music.core.ui.compose.a.c(vciVar, i6, z5hVar, (pyc) K, 14);
                int i7 = i4 << 12;
                f(iilVar, sdrVar3, f4hVar, ab0Var, sdrVar2, hvbVar, c6hVar, mcuVar, c, oq5Var, (i7 & 29360128) | (i4 & 112) | ((i4 << 6) & 896) | ((i4 >> 6) & 7168) | (i4 & 57344) | ((i4 >> 3) & 458752) | (3670016 & i7));
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k6h(f4hVar, sdrVar, c6hVar, mcuVar, sdrVar2, ab0Var, hvbVar, yciVar2, i, 0);
        }
    }

    public static final void f(iil iilVar, sdr sdrVar, f4h f4hVar, ab0 ab0Var, sdr sdrVar2, hvb hvbVar, c6h c6hVar, mcu mcuVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        f4h f4hVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-486671763);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(iilVar) : oq5Var2.h(iilVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(sdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f4hVar2 = f4hVar;
            i2 |= oq5Var2.h(f4hVar2) ? 256 : 128;
        } else {
            f4hVar2 = f4hVar;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(ab0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(sdrVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(hvbVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.h(c6hVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? oq5Var2.f(mcuVar) : oq5Var2.h(mcuVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((i3 & 38347923) == 38347922 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            cml cmlVar = iilVar.a.b;
            oq5Var = oq5Var2;
            b(hvbVar, ild.C(1312772126, new g0d(f4hVar2, sdrVar, c6hVar, hvbVar, pk0.b(((u7l) sdrVar.getValue()).a ? 1.0f : 0.89f, null, "lyrics cover scale", null, oq5Var2, 3072, 22), iilVar, mcuVar, ab0Var, 1), oq5Var2), ild.C(-381554462, new l6h(cmlVar, sdrVar2, c6hVar, 0), oq5Var2), ild.C(1974269077, new m6h(cmlVar, sdrVar, c6hVar, 0), oq5Var2), ild.C(-1223380330, new av5(sdrVar, iilVar, c6hVar, hvbVar, 16), oq5Var2), yciVar, oq5Var, ((i3 >> 15) & 14) | 28080 | ((i3 >> 9) & 458752), 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n6h(iilVar, sdrVar, f4hVar, ab0Var, sdrVar2, hvbVar, c6hVar, mcuVar, yciVar, i, 0);
        }
    }
}
