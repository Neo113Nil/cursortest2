package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class gh6 {
    public static final long a = d85.b(d85.b, 0.1f, 0.0f, 0.0f, 0.0f, 14);

    public static final void a(float f, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-972046094);
        int i2 = (oq5Var.g(true) ? 4 : 2) | i | (oq5Var.c(f) ? 32 : 16);
        vci vciVar = vci.a;
        int i3 = i2 | (oq5Var.f(vciVar) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci a2 = a.a(androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), "my_shelf_block");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i5 = i3 & 14;
            f(i5, 0, oq5Var, d.e(vciVar, f));
            u1g.l(oq5Var, d.e(vciVar, 8));
            leu.o(d.e(vciVar, ug6.c), oq5Var, i5 | 48);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xd1(i, f, 1);
        }
    }

    public static final void b(kh6 kh6Var, zg6 zg6Var, float f, hq5 hq5Var, int i) {
        int i2;
        zg6 zg6Var2 = zg6Var;
        kh6Var.getClass();
        zg6Var2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-841287609);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(kh6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(zg6Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.c(f) ? 256 : 128;
        }
        int i3 = i & 3072;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci a2 = a.a(androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), "my_shelf_block");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            aqi M = gld.M(zg6Var2.i, oq5Var);
            aqi M2 = gld.M(zg6Var2.j, oq5Var);
            c8l c8lVar = kh6Var.c;
            if (c8lVar != null) {
                oq5Var.Z(2133903853);
                String str = c8lVar.a;
                if (str == null) {
                    str = "";
                }
                uo6 X = leu.X(str, oq5Var);
                String str2 = c8lVar.b;
                boolean booleanValue = ((Boolean) M.getValue()).booleanValue();
                cdj cdjVar = (cdj) M2.getValue();
                yci e = d.e(vciVar, f);
                boolean h = oq5Var.h(zg6Var2);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new hg6(zg6Var2, 4);
                    oq5Var.k0(K);
                }
                e(str2, X, booleanValue, cdjVar, zg6Var2, com.yandex.music.core.ui.compose.a.b(e, null, 0L, 0.0f, null, (Function2) K, 15), oq5Var, (i4 << 9) & 57344, 0);
                oq5Var = oq5Var;
                eta.p(vciVar, 8, oq5Var, false);
            } else {
                oq5Var.Z(2128852837);
                oq5Var.p(false);
            }
            if (kh6Var.a == null && kh6Var.b == null) {
                oq5Var.Z(2128852837);
                oq5Var.p(false);
                zg6Var2 = zg6Var;
            } else {
                oq5Var.Z(2134648907);
                qh6 qh6Var = kh6Var.a;
                o3j o3jVar = kh6Var.b;
                float f2 = ug6.a;
                zg6Var2 = zg6Var;
                leu.p(qh6Var, o3jVar, zg6Var2, null, oq5Var, ((i4 << 3) & 896) | 3072);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fh6(kh6Var, zg6Var2, f, i);
        }
    }

    public static final void c(float f, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1338121108);
        if ((((oq5Var.g(true) ? 4 : 2) | i | (oq5Var.c(f) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            h(d.e(yciVar, f), ild.C(-732193244, new fp5(10), oq5Var), ild.C(-2000863323, new fp5(8), oq5Var), ild.C(1025433894, new fp5(9), oq5Var), oq5Var, 3504);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dh6(f, i, 0, yciVar);
        }
    }

    public static final void d(kh6 kh6Var, zg6 zg6Var, float f, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        wn5 C;
        wn5 C2;
        kh6Var.getClass();
        c8l c8lVar = kh6Var.c;
        zg6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(279684365);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(kh6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(zg6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f2 = c8lVar == null ? ug6.c : f;
            yci e = d.e(yciVar, f2);
            wn5 wn5Var = null;
            if (c8lVar == null) {
                oq5Var.Z(-159190775);
                oq5Var.p(false);
                C = null;
            } else {
                oq5Var.Z(-159190774);
                C = ild.C(571188531, new sh1(27, zg6Var, kh6Var, c8lVar), oq5Var);
                oq5Var.p(false);
            }
            o3j o3jVar = kh6Var.b;
            if (o3jVar == null) {
                oq5Var.Z(-158537357);
                oq5Var.p(false);
                C2 = null;
            } else {
                oq5Var.Z(-158537356);
                C2 = ild.C(816572407, new eh6(f2, 0, zg6Var, o3jVar), oq5Var);
                oq5Var.p(false);
            }
            qh6 qh6Var = kh6Var.a;
            if (qh6Var == null) {
                oq5Var.Z(-158239788);
            } else {
                oq5Var.Z(-158239787);
                wn5Var = ild.C(-910611922, new eh6(f2, 1, zg6Var, qh6Var), oq5Var);
            }
            oq5Var.p(false);
            h(e, C, C2, wn5Var, oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new og6(f, i, 1, kh6Var, zg6Var, yciVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String str, uo6 uo6Var, boolean z, cdj cdjVar, zg6 zg6Var, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z2;
        yci yciVar2;
        yci yciVar3;
        Object K;
        kjn kjnVar;
        float f;
        float f2;
        boolean h;
        Object K2;
        kjn kjnVar2;
        yci yciVar4;
        int i4;
        boolean h2;
        Object K3;
        boolean z3;
        Object K4;
        boolean z4;
        Object K5;
        int i5;
        oq5 oq5Var;
        yci yciVar5;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(898260932);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.f(uo6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= oq5Var2.g(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? oq5Var2.f(cdjVar) : oq5Var2.h(cdjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.h(zg6Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((74899 & i3) == 74898 || !oq5Var2.z()) {
                yciVar3 = i6 == 0 ? vci.a : yciVar2;
                K = oq5Var2.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = vz1.h(oq5Var2);
                }
                uoi uoiVar = (uoi) K;
                p85 b0 = pd.b0(uo6Var.a());
                float f3 = b0.a;
                f = b0.b + 0.1f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                f2 = b0.c - 0.06f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                int i7 = d85.o;
                long z5 = mvt.z(f3, f, f2, 1.0f, 16);
                yci u = xp3.u(yciVar3, o5g.G(oq5Var2));
                h = oq5Var2.h(zg6Var);
                K2 = oq5Var2.K();
                if (!h || K2 == kjnVar) {
                    kjnVar2 = kjnVar;
                    yciVar4 = yciVar3;
                    i4 = 32;
                    e65 e65Var = new e65(0, zg6Var, zg6.class, "onCardClick", "onCardClick()V", 0, 25);
                    oq5Var2.k0(e65Var);
                    K2 = e65Var;
                } else {
                    yciVar4 = yciVar3;
                    kjnVar2 = kjnVar;
                    i4 = 32;
                }
                h9f h9fVar = (h9f) K2;
                h2 = oq5Var2.h(zg6Var);
                K3 = oq5Var2.K();
                if (!h2 || K3 == kjnVar2) {
                    e65 e65Var2 = new e65(0, zg6Var, zg6.class, "onOverflowButtonClick", "onOverflowButtonClick()V", 0, 26);
                    oq5Var2.k0(e65Var2);
                    K3 = e65Var2;
                }
                yci f4 = androidx.compose.foundation.a.f(u, uoiVar, null, false, null, irf.S((Function0) ((h9f) K3), oq5Var2, 0), null, (Function0) h9fVar, 188);
                z3 = (i3 & 112) != i4;
                K4 = oq5Var2.K();
                if (!z3 || K4 == kjnVar2) {
                    K4 = new at5(9, uo6Var);
                    oq5Var2.k0(K4);
                }
                yci a2 = androidx.compose.ui.draw.a.a(f4, (Function1) K4);
                z4 = (i3 & 14) != 4;
                K5 = oq5Var2.K();
                if (!z4 || K5 == kjnVar2) {
                    K5 = new wq(str, 16);
                    oq5Var2.k0(K5);
                }
                yci a3 = a.a(nfp.b(a2, false, (Function1) K5), "my_shelf_last_entity_block");
                kfh d = ug3.d(b2c.b, false);
                i5 = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, a3);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.n0();
                } else {
                    oq5Var2.k(grbVar);
                }
                g0g.U(oq5Var2, d, wp5.f);
                g0g.U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var2, i5, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                oq5Var = oq5Var2;
                zc4.m(z5, ild.C(1955254010, new td5(uoiVar, z5, z2, zg6Var, uo6Var, str, cdjVar), oq5Var), oq5Var, 48, 0);
                oq5Var.p(true);
                yciVar5 = yciVar4;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                yciVar5 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new tp(str, uo6Var, z, cdjVar, zg6Var, yciVar5, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((74899 & i3) == 74898) {
        }
        if (i6 == 0) {
        }
        K = oq5Var2.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        uoi uoiVar2 = (uoi) K;
        p85 b02 = pd.b0(uo6Var.a());
        float f32 = b02.a;
        f = b02.b + 0.1f;
        if (f > 1.0f) {
        }
        f2 = b02.c - 0.06f;
        if (f2 < 0.0f) {
        }
        int i72 = d85.o;
        long z52 = mvt.z(f32, f, f2, 1.0f, 16);
        yci u2 = xp3.u(yciVar3, o5g.G(oq5Var2));
        h = oq5Var2.h(zg6Var);
        K2 = oq5Var2.K();
        if (h) {
        }
        kjnVar2 = kjnVar;
        yciVar4 = yciVar3;
        i4 = 32;
        e65 e65Var3 = new e65(0, zg6Var, zg6.class, "onCardClick", "onCardClick()V", 0, 25);
        oq5Var2.k0(e65Var3);
        K2 = e65Var3;
        h9f h9fVar2 = (h9f) K2;
        h2 = oq5Var2.h(zg6Var);
        K3 = oq5Var2.K();
        if (!h2) {
        }
        e65 e65Var22 = new e65(0, zg6Var, zg6.class, "onOverflowButtonClick", "onOverflowButtonClick()V", 0, 26);
        oq5Var2.k0(e65Var22);
        K3 = e65Var22;
        yci f42 = androidx.compose.foundation.a.f(u2, uoiVar2, null, false, null, irf.S((Function0) ((h9f) K3), oq5Var2, 0), null, (Function0) h9fVar2, 188);
        if ((i3 & 112) != i4) {
        }
        K4 = oq5Var2.K();
        if (!z3) {
        }
        K4 = new at5(9, uo6Var);
        oq5Var2.k0(K4);
        yci a22 = androidx.compose.ui.draw.a.a(f42, (Function1) K4);
        if ((i3 & 14) != 4) {
        }
        K5 = oq5Var2.K();
        if (!z4) {
        }
        K5 = new wq(str, 16);
        oq5Var2.k0(K5);
        yci a32 = a.a(nfp.b(a22, false, (Function1) K5), "my_shelf_last_entity_block");
        kfh d2 = ug3.d(b2c.b, false);
        i5 = oq5Var2.P;
        androidx.compose.runtime.internal.a l2 = oq5Var2.l();
        yci H2 = vnj.H(oq5Var2, a32);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
        }
        g0g.U(oq5Var2, d2, wp5.f);
        g0g.U(oq5Var2, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var2.O) {
        }
        ouj.x(i5, oq5Var2, i5, kb5Var2);
        g0g.U(oq5Var2, H2, wp5.d);
        oq5Var = oq5Var2;
        zc4.m(z52, ild.C(1955254010, new td5(uoiVar2, z52, z2, zg6Var, uo6Var, str, cdjVar), oq5Var), oq5Var, 48, 0);
        oq5Var.p(true);
        yciVar5 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(int i, int i2, hq5 hq5Var, yci yciVar) {
        int i3;
        yci yciVar2;
        int i4;
        int i5;
        int i6;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-532845032);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(true) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i3 & 19) == 18 || !oq5Var.z()) {
                vci vciVar = vci.a;
                yci yciVar3 = i7 == 0 ? vciVar : yciVar2;
                float f = 12;
                yci m = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(xp3.u(d.c(yciVar3, 1.0f), o5g.G(oq5Var)), ((dq0) oq5Var.j(eq0.a)).c.b, vnj.i), f);
                nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, m);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var, a2, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                float f2 = 80;
                yci m2 = d.m(xp3.u(vciVar, o5g.G(oq5Var)), f2);
                kfh d = ug3.d(b2c.b, false);
                i5 = oq5Var.P;
                int i8 = i3;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, m2);
                oq5Var.d0();
                yci yciVar4 = yciVar3;
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                swf.e(0, 1, oq5Var, null);
                oq5Var.p(true);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci q = androidx.compose.foundation.layout.a.q(new LayoutWeightElement(false, 1.0f), f, 0.0f, 0.0f, 0.0f, 14);
                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, q);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                int i9 = (i8 & 14) | 48;
                ivf.l(true, d.r(vciVar, 120), nu0.j(), oq5Var, i9, 0);
                u1g.l(oq5Var, d.e(vciVar, 4));
                ivf.l(true, d.r(vciVar, f2), nu0.i(), oq5Var, i9, 0);
                oq5Var.p(true);
                oq5Var.p(true);
                yciVar2 = yciVar4;
            } else {
                oq5Var.S();
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new rl4(yciVar2, i, i2, 3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 19) == 18) {
        }
        vci vciVar2 = vci.a;
        if (i7 == 0) {
        }
        float f3 = 12;
        yci m3 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(xp3.u(d.c(yciVar3, 1.0f), o5g.G(oq5Var)), ((dq0) oq5Var.j(eq0.a)).c.b, vnj.i), f3);
        nho a22 = lho.a(qx0.a, b2c.l, oq5Var, 48);
        i4 = oq5Var.P;
        androidx.compose.runtime.internal.a l4 = oq5Var.l();
        yci H4 = vnj.H(oq5Var, m3);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var5 = wp5.f;
        g0g.U(oq5Var, a22, kb5Var5);
        kb5 kb5Var22 = wp5.e;
        g0g.U(oq5Var, l4, kb5Var22);
        kb5 kb5Var32 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i4, oq5Var, i4, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H4, kb5Var42);
        float f22 = 80;
        yci m22 = d.m(xp3.u(vciVar2, o5g.G(oq5Var)), f22);
        kfh d2 = ug3.d(b2c.b, false);
        i5 = oq5Var.P;
        int i82 = i3;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, m22);
        oq5Var.d0();
        yci yciVar42 = yciVar3;
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d2, kb5Var5);
        g0g.U(oq5Var, l22, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var32);
        g0g.U(oq5Var, H22, kb5Var42);
        swf.e(0, 1, oq5Var, null);
        oq5Var.p(true);
        if (1.0f <= 0.0d) {
        }
        yci q2 = androidx.compose.foundation.layout.a.q(new LayoutWeightElement(false, 1.0f), f3, 0.0f, 0.0f, 0.0f, 14);
        ta5 a32 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l32 = oq5Var.l();
        yci H32 = vnj.H(oq5Var, q2);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, kb5Var5);
        g0g.U(oq5Var, l32, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var32);
        g0g.U(oq5Var, H32, kb5Var42);
        int i92 = (i82 & 14) | 48;
        ivf.l(true, d.r(vciVar2, 120), nu0.j(), oq5Var, i92, 0);
        u1g.l(oq5Var, d.e(vciVar2, 4));
        ivf.l(true, d.r(vciVar2, f22), nu0.i(), oq5Var, i92, 0);
        oq5Var.p(true);
        oq5Var.p(true);
        yciVar2 = yciVar42;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void g(cdj cdjVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-91524172);
        if ((((oq5Var.f(cdjVar) ? 4 : 2) | i | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jf0.a(new qzm[0], null, true, ild.C(-1505347012, new kv4(cdjVar), oq5Var), oq5Var, 3072, 2);
            yciVar = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(cdjVar, yciVar, i, 10);
        }
    }

    public static final void h(yci yciVar, Function2 function2, Function2 function22, Function2 function23, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1131153718);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function23) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bg3.a(androidx.compose.foundation.layout.a.o(d.d(yciVar, 1.0f), 16, 0.0f, 2), null, false, ild.C(-1342611660, new xk(22, function2, function23, function22), oq5Var), oq5Var, 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(yciVar, function2, false, function22, function23, i, 27);
        }
    }
}
