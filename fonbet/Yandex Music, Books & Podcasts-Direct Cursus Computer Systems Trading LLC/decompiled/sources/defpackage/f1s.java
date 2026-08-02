package defpackage;

import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f1s {
    public static final float a = 48;
    public static final float b = 16;
    public static final float c = 14;
    public static final float d = 6;
    public static final long e = v7g.z(20);
    public static final float f = 8;

    public static final void a(boolean z, Function0 function0, wn5 wn5Var, wn5 wn5Var2, yci yciVar, boolean z2, long j, long j2, hq5 hq5Var, int i) {
        oq5 oq5Var;
        boolean z3;
        long j3;
        int i2;
        long b2;
        boolean z4;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1499861761);
        int i3 = i | (oq5Var2.g(z) ? 4 : 2) | (oq5Var2.h(function0) ? 32 : 16) | (oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 1769472 | (oq5Var2.e(j) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | 33554432;
        if (oq5Var2.P(i3 & 1, (38347923 & i3) != 38347922)) {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                long j4 = ((d85) oq5Var2.j(sb6.a)).a;
                i2 = i3 & (-234881025);
                b2 = d85.b(j, (!((ma5) oq5Var2.j(pa5.a)).g() ? ((double) c3x.N(j4)) < 0.5d : ((double) c3x.N(j4)) > 0.5d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
                z4 = true;
            } else {
                oq5Var2.S();
                b2 = j2;
                i2 = i3 & (-234881025);
                z4 = z2;
            }
            oq5Var2.q();
            z3 = z4;
            oq5Var = oq5Var2;
            long j5 = b2;
            d(j, j5, z, ild.C(866677691, new y0s(yciVar, z, eeo.a(0.0f, 2, j, true), z3, function0, wn5Var2, wn5Var), oq5Var2), oq5Var, ((i2 << 6) & 896) | ((i2 >> 21) & 14) | 3072);
            j3 = j5;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            z3 = z2;
            j3 = j2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z0s(z, function0, wn5Var, wn5Var2, yciVar, z3, j, j3, i);
        }
    }

    public static final void b(boolean z, Function0 function0, yci yciVar, boolean z2, Function2 function2, long j, long j2, hq5 hq5Var, int i) {
        int i2;
        boolean z3;
        long j3;
        long j4;
        int i3;
        long b2;
        long j5;
        boolean z4;
        wn5 C;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1486097588);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | 39521280;
        if (oq5Var.P(i4 & 1, (38347923 & i4) != 38347922)) {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                qs5 qs5Var = sb6.a;
                long j6 = ((d85) oq5Var.j(qs5Var)).a;
                long j7 = ((d85) oq5Var.j(qs5Var)).a;
                i3 = i4 & (-264241153);
                b2 = d85.b(j6, (!((ma5) oq5Var.j(pa5.a)).g() ? ((double) c3x.N(j7)) < 0.5d : ((double) c3x.N(j7)) > 0.5d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
                j5 = j6;
                z4 = true;
            } else {
                oq5Var.S();
                i3 = i4 & (-264241153);
                z4 = z2;
                j5 = j;
                b2 = j2;
            }
            oq5Var.q();
            if (function2 == null) {
                oq5Var.Z(1041219556);
                oq5Var.p(false);
                C = null;
            } else {
                oq5Var.Z(1041219557);
                C = ild.C(-1729014781, new t30(function2, 4), oq5Var);
                oq5Var.p(false);
            }
            c((i3 & 896) | (i3 & 14) | 12582912 | (i3 & 112) | 27648, 0, j5, b2, ild.C(-178151495, new kfi(C, 1), oq5Var), oq5Var, yciVar, function0, z, z4);
            j3 = j5;
            j4 = b2;
            z3 = z4;
        } else {
            oq5Var.S();
            z3 = z2;
            j3 = j;
            j4 = j2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a1s(z, function0, yciVar, z3, function2, j3, j4, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(int i, int i2, long j, long j2, wn5 wn5Var, hq5 hq5Var, yci yciVar, Function0 function0, boolean z, boolean z2) {
        int i3;
        boolean z3;
        long j3;
        long j4;
        boolean z4;
        long j5;
        long j6;
        xmn r;
        boolean z5;
        long j7;
        long j8;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(713679175);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= oq5Var.g(z3) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= oq5Var.f(null) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if ((196608 & i) != 0) {
                j3 = j;
                i3 |= ((i2 & 32) == 0 && oq5Var.e(j3)) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            } else {
                j3 = j;
            }
            if ((1572864 & i) != 0) {
                j4 = j2;
                i3 |= ((i2 & 64) == 0 && oq5Var.e(j4)) ? 1048576 : 524288;
            } else {
                j4 = j2;
            }
            if ((12582912 & i) == 0) {
                i3 |= oq5Var.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            }
            if (oq5Var.P(i3 & 1, (4793491 & i3) == 4793490)) {
                oq5Var.S();
                long j9 = j3;
                z4 = z3;
                j5 = j9;
                j6 = j4;
            } else {
                oq5Var.U();
                if ((i & 1) == 0 || oq5Var.y()) {
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 32) != 0) {
                        j3 = ((d85) oq5Var.j(sb6.a)).a;
                        i3 &= -458753;
                    }
                    long j10 = j3;
                    if ((i2 & 64) != 0) {
                        long j11 = ((d85) oq5Var.j(sb6.a)).a;
                        i3 &= -3670017;
                        z5 = z3;
                        j7 = j10;
                        j8 = d85.b(j10, (!((ma5) oq5Var.j(pa5.a)).g() ? ((double) c3x.N(j11)) < 0.5d : ((double) c3x.N(j11)) > 0.5d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
                    } else {
                        long j12 = j4;
                        z5 = z3;
                        j7 = j10;
                        j8 = j12;
                    }
                } else {
                    oq5Var.S();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    j8 = j4;
                    z5 = z3;
                    j7 = j3;
                }
                oq5Var.q();
                int i5 = i3 >> 15;
                int i6 = (i5 & 112) | (i5 & 14) | 3072 | ((i3 << 6) & 896);
                long j13 = j7;
                long j14 = j8;
                d(j13, j14, z, ild.C(-1237246709, new b1s(yciVar, z, eeo.a(0.0f, 2, j7, true), z5, function0, wn5Var), oq5Var), oq5Var, i6);
                j6 = j14;
                z4 = z5;
                j5 = j13;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new c1s(i, i2, j5, j6, wn5Var, yciVar, function0, z, z4);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i2 & 16) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (oq5Var.P(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void d(long j, long j2, boolean z, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        long j3;
        int i3;
        boolean z2;
        act S;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-405571117);
        if ((i & 6) == 0) {
            i2 = (oq5Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j2;
            i2 |= oq5Var.e(j3) ? 32 : 16;
        } else {
            j3 = j2;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            int i4 = i2 >> 6;
            d8t e2 = i8t.e(Boolean.valueOf(z), null, oq5Var, i4 & 14, 2);
            x6k x6kVar = e2.d;
            boolean booleanValue = ((Boolean) x6kVar.getValue()).booleanValue();
            oq5Var.Z(1445938070);
            long j4 = booleanValue ? j : j3;
            oq5Var.p(false);
            l95 f2 = d85.f(j4);
            boolean f3 = oq5Var.f(f2);
            Object K = oq5Var.K();
            if (f3 || K == gq5.a) {
                gx3 gx3Var = gx3.J;
                m40 m40Var = new m40(23, f2);
                oct octVar = azt.a;
                oct octVar2 = new oct(gx3Var, m40Var);
                oq5Var.k0(octVar2);
                K = octVar2;
            }
            oct octVar3 = (oct) K;
            boolean booleanValue2 = ((Boolean) e2.c()).booleanValue();
            oq5Var.Z(1445938070);
            d85 f4 = k5r.f(oq5Var, false, booleanValue2 ? j : j3);
            boolean booleanValue3 = ((Boolean) x6kVar.getValue()).booleanValue();
            oq5Var.Z(1445938070);
            d85 f5 = k5r.f(oq5Var, false, booleanValue3 ? j : j3);
            x7t f6 = e2.f();
            oq5Var.Z(-2120892502);
            if (f6.c(Boolean.FALSE, Boolean.TRUE)) {
                i3 = i4;
                S = new act(150, 100, nya.d);
                z2 = false;
            } else {
                i3 = i4;
                z2 = false;
                S = weo.S(100, 0, nya.d, 2);
            }
            oq5Var.p(z2);
            z7t c2 = i8t.c(e2, f4, f5, S, octVar3, oq5Var, 0);
            etn.m(new qzm[]{sb6.a.a(new d85(d85.b(((d85) c2.h.getValue()).a, 1.0f, 0.0f, 0.0f, 0.0f, 14))), mb6.a.a(Float.valueOf(d85.d(((d85) c2.h.getValue()).a)))}, wn5Var, oq5Var, (i3 & 112) | 8);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new e1s(j, j3, z, wn5Var, i);
        }
    }

    public static final void e(Function2 function2, hq5 hq5Var, int i) {
        int i2;
        boolean z;
        iz2 iz2Var = b2c.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1249848471);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(null) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new n5b(6, function2);
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i4 = oq5Var.P;
            a l = oq5Var.l();
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
            g0g.U(oq5Var, kfhVar, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (function2 != null) {
                oq5Var.Z(-238651272);
                yci o = androidx.compose.foundation.layout.a.o(androidx.compose.ui.layout.a.c(vciVar, "text"), b, 0.0f, 2);
                kfh d2 = ug3.d(iz2Var, false);
                int i5 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, o);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                function2.invoke(oq5Var, Integer.valueOf(i3));
                z = true;
                oq5Var.p(true);
                oq5Var.p(false);
            } else {
                z = true;
                oq5Var.Z(-238546523);
                oq5Var.p(false);
            }
            oq5Var.Z(-238455259);
            oq5Var.p(false);
            oq5Var.p(z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tg3(function2, i, 7);
        }
    }
}
