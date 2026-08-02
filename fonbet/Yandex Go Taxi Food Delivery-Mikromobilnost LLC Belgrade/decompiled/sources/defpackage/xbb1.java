package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public abstract class xbb1 {
    public static final void a(final ms6 ms6Var, final tls tlsVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1321628311);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(ms6Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            oip0 o = pw91.o(btsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.d(new is6(o, 0));
                btsVar.o0(Q);
            }
            m3u0 m3u0Var = (m3u0) Q;
            c530 c530Var = c530.a;
            f530 o2 = an91.o(c530Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d = b.d(btsVar, o2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o3);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 u = pw91.u(an91.o(ljs0.g(c530Var, 0.0f, 400.0f, 1), 16.0f, 0.0f, 16.0f, 0.0f, 10), o, 14);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d2 = b.d(btsVar, u);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            String str = ms6Var.a;
            String str2 = ms6Var.b;
            final int i3 = 0;
            jeb1.f(str, c530Var, AppColor$Palette.Text, 0L, 0L, null, null, uh6.K(30.0f, 4294967296L), 0, false, 0, 0, null, xya1.e(btsVar).e.d, btsVar, 432, 0, 16120);
            btsVar = btsVar;
            if (evu0.J(str2)) {
                btsVar.e0(-14628449);
                btsVar.t(false);
            } else {
                btsVar.e0(-14689953);
                b(str2, btsVar, 0);
                btsVar.t(false);
            }
            d(6, btsVar, an91.o(c530Var, 0.0f, 21.0f, 0.0f, 0.0f, 13), ohb1.e(btsVar, kyh0.navigator_parking_info_address), ms6Var.c.D1());
            btsVar.t(true);
            f530 c = bzk0.c(hbb1.c(c530Var, dbb1.c(btsVar), false, 24.0f, m3u0Var, 2), AppColor$Palette.Background, ((nx2) btsVar.m(uy2.c)).a);
            WeakHashMap weakHashMap = a.w;
            f530 n = an91.n(c, 16.0f, 20.0f, 16.0f, w8a1.f(vuz.o(btsVar).e, btsVar).a() + 8.0f);
            int i4 = 2;
            boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
            Object Q2 = btsVar.Q();
            if (b || Q2 == o430Var) {
                Q2 = new jg0(i4);
                btsVar.o0(Q2);
            }
            z910 z910Var = (z910) Q2;
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o5 = btsVar.o();
            f530 d3 = b.d(btsVar, n);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, z910Var);
            qje.W(btsVar, wlsVar2, o5);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            int i5 = i2 & 112;
            int i6 = i2 & 14;
            boolean z2 = (i6 == 4 || btsVar.e(ms6Var)) | (i5 == 32);
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new sls() { // from class: js6
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i3;
                        zy11 zy11Var = zy11.a;
                        ms6 ms6Var2 = ms6Var;
                        tls tlsVar3 = tlsVar;
                        switch (i7) {
                            case 0:
                                tlsVar3.invoke(new us6(ms6Var2.c));
                                break;
                            default:
                                tlsVar3.invoke(new vs6(ms6Var2.c));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q3);
            }
            o3d.a.getClass();
            ohb1.b(c2, false, null, (sls) Q3, o3d.b, btsVar, 24582, 6);
            f530 c3 = ljs0.c(c530Var, 1.0f);
            boolean z3 = (i5 == 32) | (i6 == 4 || btsVar.e(ms6Var));
            Object Q4 = btsVar.Q();
            if (z3 || Q4 == o430Var) {
                z = true;
                final char c4 = 1 == true ? 1 : 0;
                Q4 = new sls() { // from class: js6
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = c4;
                        zy11 zy11Var = zy11.a;
                        ms6 ms6Var2 = ms6Var;
                        tls tlsVar3 = tlsVar;
                        switch (i7) {
                            case 0:
                                tlsVar3.invoke(new us6(ms6Var2.c));
                                break;
                            default:
                                tlsVar3.invoke(new vs6(ms6Var2.c));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q4);
            } else {
                z = true;
            }
            ulb1.a(c3, false, null, (sls) Q4, o3d.c, btsVar, 24582, 6);
            btsVar.t(z);
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(ms6Var, tlsVar, i, 26);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1998121803);
        int i2 = i | (btsVar.k(str) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 6.0f, 0.0f, 0.0f, 13);
            to5 to5Var = x4c.E;
            lhl0 a = khl0.a(lr20.a, to5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            f530 m = ljs0.m(c530Var, 20.0f);
            au2 a2 = zeb1.a();
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            sya1.a(a2, m, null, appColor$Palette, btsVar, 3120, 4);
            jeb1.f(str, an91.o(c530Var, 2.0f, 0.0f, 0.0f, 0.0f, 14).k(new pa31(to5Var)), appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, (i2 & 14) | 384, 0, 16248);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 8);
        }
    }

    public static final void c(String str, au2 au2Var, wp2 wp2Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-544019046);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(au2Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            sya1.a(au2Var, null, null, wp2Var, btsVar, ((i2 >> 3) & 14) | 3456, 2);
            jeb1.f(str, null, wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).h.c, btsVar, i2 & 910, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ls6(str, au2Var, wp2Var, i, 0);
        }
    }

    public static final void d(int i, fid fidVar, f530 f530Var, String str, String str2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1935255888);
        int i2 = i | (btsVar.k(str) ? 32 : 16) | (btsVar.k(str2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            jeb1.f(str, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, ((i2 >> 3) & 14) | 384, 0, 16378);
            jeb1.f(str2, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, ((i2 >> 6) & 14) | 384, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ks6(f530Var, str, str2, i, 0);
        }
    }

    public static nyk0 e(int i) {
        return nsa1.b((i & 1) != 0 ? 8 : 10, 1.0f / ((float) Math.cos(ex21.b / r3)), new wre(2), null);
    }

    public static final String f(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final nyk0 g(int i, float f, wre wreVar) {
        if (f <= 0.0f) {
            ny61.g("Star radii must both be greater than 0");
            return null;
        }
        if (f >= 1.0f) {
            ny61.g("innerRadius must be less than radius");
            return null;
        }
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = ex21.b / i;
            long e = ex21.e(1.0f, 2.0f * f2 * i3);
            fArr[i2] = pw91.j(e) + 0.0f;
            fArr[i2 + 1] = pw91.k(e) + 0.0f;
            long e2 = ex21.e(f, f2 * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = pw91.j(e2) + 0.0f;
            i2 += 4;
            fArr[i4] = pw91.k(e2) + 0.0f;
        }
        return nsa1.c(fArr, wreVar, null, 0.0f, 0.0f);
    }
}
