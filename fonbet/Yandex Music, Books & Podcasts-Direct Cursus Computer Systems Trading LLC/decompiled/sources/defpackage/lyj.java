package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class lyj {
    public static final float a = 4;

    static {
        v7g.z(8);
    }

    public static final void a(String str, Function1 function1, yci yciVar, boolean z, ges gesVar, Function2 function2, tiu tiuVar, rbf rbfVar, pbf pbfVar, boolean z2, int i, int i2, dup dupVar, hs7 hs7Var, hq5 hq5Var, int i3) {
        oq5 oq5Var;
        tiu tiuVar2;
        int i4;
        int i5;
        dup dupVar2;
        hs7 hs7Var2;
        int i6;
        dup dupVar3;
        tiu tiuVar3;
        int i7;
        hs7 hs7Var3;
        int i8;
        boolean z3;
        long j;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-621914704);
        int i9 = i3 | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.h(function1) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128) | (oq5Var2.g(z) ? 2048 : 1024) | 24576 | (oq5Var2.f(gesVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | 907542528;
        int i10 = 316236214 | (oq5Var2.f(pbfVar) ? 2048 : 1024);
        if (oq5Var2.P(i9 & 1, ((i9 & 306783379) == 306783378 && (306783379 & i10) == 306783378) ? false : true)) {
            oq5Var2.U();
            if ((i3 & 1) == 0 || oq5Var2.y()) {
                tiu tiuVar4 = i9w.h;
                int i11 = z2 ? 1 : Integer.MAX_VALUE;
                uas uasVar = uas.a;
                tgo tgoVar = ((ivp) oq5Var2.j(kvp.a)).a;
                qs5 qs5Var = sb6.a;
                long b = d85.b(((d85) oq5Var2.j(qs5Var)).a, ((Number) oq5Var2.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                long j2 = ((d85) oq5Var2.j(qs5Var)).a;
                agr agrVar = pa5.a;
                if (((ma5) oq5Var2.j(agrVar)).g()) {
                    c3x.N(j2);
                } else {
                    c3x.N(j2);
                }
                long b2 = d85.b(b, 0.38f, 0.0f, 0.0f, 0.0f, 14);
                long j3 = d85.m;
                long d = ((ma5) oq5Var2.j(agrVar)).d();
                long b3 = ((ma5) oq5Var2.j(agrVar)).b();
                long d2 = ((ma5) oq5Var2.j(agrVar)).d();
                long j4 = ((d85) oq5Var2.j(qs5Var)).a;
                long b4 = d85.b(d2, (!((ma5) oq5Var2.j(agrVar)).g() ? ((double) c3x.N(j4)) < 0.5d : ((double) c3x.N(j4)) > 0.5d) ? 0.87f : 1.0f, 0.0f, 0.0f, 0.0f, 14);
                long c = ((ma5) oq5Var2.j(agrVar)).c();
                long j5 = ((d85) oq5Var2.j(qs5Var)).a;
                if (((ma5) oq5Var2.j(agrVar)).g()) {
                    c3x.N(j5);
                } else {
                    c3x.N(j5);
                }
                long b5 = d85.b(c, 0.38f, 0.0f, 0.0f, 0.0f, 14);
                long j6 = ((d85) oq5Var2.j(qs5Var)).a;
                if (((ma5) oq5Var2.j(agrVar)).g()) {
                    c3x.N(j6);
                } else {
                    c3x.N(j6);
                }
                long b6 = d85.b(b5, 0.38f, 0.0f, 0.0f, 0.0f, 14);
                long b7 = ((ma5) oq5Var2.j(agrVar)).b();
                long b8 = d85.b(((ma5) oq5Var2.j(agrVar)).c(), 0.54f, 0.0f, 0.0f, 0.0f, 14);
                long j7 = ((d85) oq5Var2.j(qs5Var)).a;
                if (((ma5) oq5Var2.j(agrVar)).g()) {
                    c3x.N(j7);
                } else {
                    c3x.N(j7);
                }
                long b9 = d85.b(b8, 0.38f, 0.0f, 0.0f, 0.0f, 14);
                long b10 = d85.b(((ma5) oq5Var2.j(agrVar)).c(), 0.54f, 0.0f, 0.0f, 0.0f, 14);
                long j8 = ((d85) oq5Var2.j(qs5Var)).a;
                if (((ma5) oq5Var2.j(agrVar)).g()) {
                    c3x.N(j8);
                } else {
                    c3x.N(j8);
                }
                long b11 = d85.b(b10, 0.38f, 0.0f, 0.0f, 0.0f, 14);
                long b12 = ((ma5) oq5Var2.j(agrVar)).b();
                long d3 = ((ma5) oq5Var2.j(agrVar)).d();
                long j9 = ((d85) oq5Var2.j(qs5Var)).a;
                long b13 = d85.b(d3, (!((ma5) oq5Var2.j(agrVar)).g() ? ((double) c3x.N(j9)) < 0.5d : ((double) c3x.N(j9)) > 0.5d) ? 0.87f : 1.0f, 0.0f, 0.0f, 0.0f, 14);
                long c2 = ((ma5) oq5Var2.j(agrVar)).c();
                long j10 = ((d85) oq5Var2.j(qs5Var)).a;
                long b14 = d85.b(c2, (!((ma5) oq5Var2.j(agrVar)).g() ? ((double) c3x.N(j10)) < 0.5d : ((double) c3x.N(j10)) > 0.5d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
                long j11 = ((d85) oq5Var2.j(qs5Var)).a;
                if (((ma5) oq5Var2.j(agrVar)).g()) {
                    c3x.N(j11);
                } else {
                    c3x.N(j11);
                }
                long b15 = d85.b(b14, 0.38f, 0.0f, 0.0f, 0.0f, 14);
                long b16 = ((ma5) oq5Var2.j(agrVar)).b();
                long c3 = ((ma5) oq5Var2.j(agrVar)).c();
                long j12 = ((d85) oq5Var2.j(qs5Var)).a;
                long b17 = d85.b(c3, (!((ma5) oq5Var2.j(agrVar)).g() ? ((double) c3x.N(j12)) < 0.5d : ((double) c3x.N(j12)) > 0.5d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
                long j13 = ((d85) oq5Var2.j(qs5Var)).a;
                if (((ma5) oq5Var2.j(agrVar)).g()) {
                    c3x.N(j13);
                } else {
                    c3x.N(j13);
                }
                hs7 hs7Var4 = new hs7(b, b2, d, b3, b4, b5, b7, b6, b8, b9, b8, b10, b11, b12, j3, b13, b14, b15, b16, b17, d85.b(b17, 0.38f, 0.0f, 0.0f, 0.0f, 14));
                i6 = i10 & (-2114387969);
                dupVar3 = tgoVar;
                tiuVar3 = tiuVar4;
                i7 = i11;
                hs7Var3 = hs7Var4;
                i8 = 1;
            } else {
                oq5Var2.S();
                i6 = i10 & (-2114387969);
                tiuVar3 = tiuVar;
                i7 = i;
                i8 = i2;
                dupVar3 = dupVar;
                hs7Var3 = hs7Var;
            }
            int i12 = i6;
            oq5Var2.q();
            oq5Var2.Z(-579356042);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var2);
            }
            uoi uoiVar = (uoi) K;
            oq5Var2.p(false);
            oq5Var2.Z(674052851);
            long c4 = gesVar.c();
            if (c4 != 16) {
                j = c4;
                z3 = false;
            } else {
                hs7Var3.getClass();
                oq5Var2.Z(9804418);
                aqi o0 = szf.o0(new d85(z ? hs7Var3.a : hs7Var3.b), oq5Var2);
                z3 = false;
                oq5Var2.p(false);
                j = ((d85) o0.getValue()).a;
            }
            oq5Var2.p(z3);
            ges e = gesVar.e(new ges(j, 0L, null, null, null, null, null, 0L, null, 0, 0L, null, null, 0, 16777214));
            yci f = yciVar.f(vci.a);
            hyf.I(3, oq5Var2);
            float f2 = cbs.a;
            yci a2 = d.a(f, uas.c, uas.b);
            hs7Var3.getClass();
            oq5Var2.Z(-1446422485);
            aqi o02 = szf.o0(new d85(hs7Var3.c), oq5Var2);
            oq5Var2.p(false);
            dup dupVar4 = dupVar3;
            hs7 hs7Var5 = hs7Var3;
            int i13 = i7;
            oq5Var = oq5Var2;
            tiu tiuVar5 = tiuVar3;
            nv2.b(str, function1, a2, z, e, rbfVar, pbfVar, z2, i13, i8, tiuVar5, null, uoiVar, new f3r(((d85) o02.getValue()).a), ild.C(1710364390, new hyj(str, z, z2, tiuVar3, uoiVar, function2, dupVar3, hs7Var3), oq5Var2), oq5Var, (i9 & 64638) | ScreenMirroringConfig.Video.BITRATE_1_5MB | ((i12 << 12) & 29360128) | 100663296, 196662, 4096);
            tiuVar2 = tiuVar5;
            i4 = i13;
            i5 = i8;
            dupVar2 = dupVar4;
            hs7Var2 = hs7Var5;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            tiuVar2 = tiuVar;
            i4 = i;
            i5 = i2;
            dupVar2 = dupVar;
            hs7Var2 = hs7Var;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new iyj(str, function1, yciVar, z, gesVar, function2, tiuVar2, rbfVar, pbfVar, z2, i4, i5, dupVar2, hs7Var2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.Object, wn5] */
    public static final void b(yci yciVar, Function2 function2, pyc pycVar, Function2 function22, Function2 function23, Function2 function24, boolean z, float f, Function1 function1, wn5 wn5Var, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        Function2 function25;
        pyc pycVar2;
        Function2 function26;
        xof xofVar;
        boolean z2;
        ?? r10;
        pyc pycVar3;
        Function2 function27;
        boolean z3;
        Function2 function28 = function22;
        o0k o0kVar2 = o0kVar;
        iz2 iz2Var = b2c.f;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2049536174);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(pycVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function28) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function23) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function24) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= oq5Var.c(f) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i2 |= oq5Var.h(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= oq5Var.h(wn5Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i3 = i2;
        char c = oq5Var.f(o0kVar2) ? (char) 4 : (char) 2;
        if (oq5Var.P(i3 & 1, ((i2 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            boolean z4 = ((i3 & 234881024) == 67108864) | ((i3 & 3670016) == 1048576) | ((i3 & 29360128) == 8388608) | ((c & 14) == 4);
            Object K = oq5Var.K();
            if (z4 || K == gq5.a) {
                K = new nyj(function1, z, f, o0kVar2);
                oq5Var.k0(K);
            }
            nyj nyjVar = (nyj) K;
            xof xofVar2 = (xof) oq5Var.j(es5.n);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, nyjVar, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            wn5Var.invoke(oq5Var, Integer.valueOf((i3 >> 27) & 14));
            MinimumInteractiveModifier minimumInteractiveModifier = MinimumInteractiveModifier.a;
            vci vciVar = vci.a;
            if (function23 != 0) {
                oq5Var.Z(-978132235);
                yci c2 = androidx.compose.ui.layout.a.c(vciVar, "Leading");
                agr agrVar = yre.a;
                yci f2 = c2.f(minimumInteractiveModifier);
                kfh d = ug3.d(iz2Var, false);
                int i5 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, f2);
                oq5Var.d0();
                xofVar = xofVar2;
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                function23.invoke(oq5Var, Integer.valueOf((i3 >> 12) & 14));
                oq5Var.p(true);
                z2 = false;
                oq5Var.p(false);
            } else {
                xofVar = xofVar2;
                z2 = false;
                oq5Var.Z(-977887180);
                oq5Var.p(false);
            }
            if (function24 != 0) {
                oq5Var.Z(-977844493);
                yci c3 = androidx.compose.ui.layout.a.c(vciVar, "Trailing");
                agr agrVar2 = yre.a;
                yci f3 = c3.f(minimumInteractiveModifier);
                kfh d2 = ug3.d(iz2Var, z2);
                int i6 = oq5Var.P;
                a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, f3);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                function24.invoke(oq5Var, Integer.valueOf((i3 >> 15) & 14));
                oq5Var.p(true);
                r10 = 0;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-977597516);
                oq5Var.p(z2);
                r10 = z2;
            }
            o0kVar2 = o0kVar;
            xof xofVar3 = xofVar;
            float f4 = androidx.compose.foundation.layout.a.f(o0kVar2, xofVar3);
            float e = androidx.compose.foundation.layout.a.e(o0kVar2, xofVar3);
            if (function23 != 0) {
                f4 -= cbs.b;
                float f5 = (float) r10;
                if (f4 < f5) {
                    f4 = f5;
                }
            }
            float f6 = f4;
            if (function24 != 0) {
                e -= cbs.b;
                float f7 = (float) r10;
                if (e < f7) {
                    e = f7;
                }
            }
            yci q = androidx.compose.foundation.layout.a.q(vciVar, f6, 0.0f, e, 0.0f, 10);
            if (pycVar != null) {
                oq5Var.Z(-976746535);
                pyc pycVar4 = pycVar;
                pycVar4.invoke(androidx.compose.ui.layout.a.c(vciVar, "Hint").f(q), oq5Var, Integer.valueOf((i3 >> 3) & 112));
                oq5Var.p(false);
                pycVar3 = pycVar4;
            } else {
                pycVar3 = pycVar;
                oq5Var.Z(-976659084);
                oq5Var.p(false);
            }
            yci f8 = androidx.compose.ui.layout.a.c(vciVar, "TextField").f(q);
            iz2 iz2Var2 = b2c.b;
            kfh d3 = ug3.d(iz2Var2, true);
            int i7 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H4 = vnj.H(oq5Var, f8);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l4, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H4, kb5Var4);
            Function2 function29 = function2;
            function29.invoke(oq5Var, Integer.valueOf((i3 >> 3) & 14));
            oq5Var.p(true);
            if (function22 != null) {
                oq5Var.Z(-976429250);
                yci c4 = androidx.compose.ui.layout.a.c(vciVar, "Label");
                kfh d4 = ug3.d(iz2Var2, false);
                int i8 = oq5Var.P;
                a l5 = oq5Var.l();
                yci H5 = vnj.H(oq5Var, c4);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d4, kb5Var);
                g0g.U(oq5Var, l5, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var3);
                }
                g0g.U(oq5Var, H5, kb5Var4);
                Function2 function210 = function22;
                function210.invoke(oq5Var, Integer.valueOf((i3 >> 9) & 14));
                z3 = true;
                oq5Var.p(true);
                oq5Var.p(false);
                function27 = function210;
            } else {
                function27 = function22;
                z3 = true;
                oq5Var.Z(-976346604);
                oq5Var.p(false);
            }
            oq5Var.p(z3);
            function26 = function27;
            function25 = function29;
            pycVar2 = pycVar3;
        } else {
            function25 = function2;
            pycVar2 = pycVar;
            oq5Var.S();
            function26 = function28;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jyj(yciVar, function25, pycVar2, function26, function23, function24, z, f, function1, wn5Var, o0kVar2, i);
        }
    }

    public static final int c(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, o0k o0kVar) {
        int max = Math.max(i3, Math.max(i5, fxf.K(i4, f, 0)));
        float d = o0kVar.d() * f2;
        return ia6.f(Math.max(i, Math.max(i2, eeh.b(fxf.I(d, Math.max(d, i4 / 2.0f), f) + max + (o0kVar.a() * f2)))), j);
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, o0k o0kVar) {
        int max = Math.max(i3, Math.max(fxf.K(i4, f, 0), i5)) + i + i2;
        xof xofVar = xof.a;
        return ia6.g(Math.max(max, eeh.b((i4 + ((o0kVar.c(xofVar) + o0kVar.b(xofVar)) * f2)) * f)), j);
    }
}
