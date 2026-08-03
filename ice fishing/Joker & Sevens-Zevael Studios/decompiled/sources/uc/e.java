package uc;

import a1.f;
import androidx.compose.foundation.layout.FillElement;
import bc.a0;
import f1.d0;
import f1.q;
import h2.h0;
import j0.g0;
import j0.r0;
import j0.s0;
import j0.t0;
import java.util.Collections;
import java.util.Set;
import m0.l;
import m0.r;
import m0.r1;
import m0.s;
import m0.x1;
import org.fortheloss.st.R;
import pc.j;
import r2.k;
import rd.g;
import v1.e0;
import x1.h;
import x1.z;
import y0.n;
import z.c0;
import z.i;
import z.m;

/* loaded from: classes.dex */
public abstract class e {
    public static final void a(n nVar, oc.c cVar, r rVar, int i10) {
        rVar.Z(-932836462);
        if ((((rVar.f(nVar) ? 4 : 2) | i10 | (rVar.h(cVar) ? 32 : 16)) & 19) == 18 && rVar.B()) {
            rVar.S();
        } else {
            u2.b.g(rVar, androidx.compose.ui.draw.a.a(nVar, cVar));
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new f(nVar, cVar, i10, 9);
        }
    }

    public static final z0.d b(String str) {
        Set singleton = Collections.singleton(str);
        j.d(singleton, "singleton(...)");
        return new z0.d(singleton);
    }

    public static final void c(int i10, zd.c cVar, r rVar, int i11) {
        rVar.Z(-1089207260);
        if ((((rVar.d(i10) ? 4 : 2) | i11 | (rVar.f(cVar) ? 32 : 16)) & 19) == 18 && rVar.B()) {
            rVar.S();
        } else {
            g0.b(androidx.compose.foundation.layout.b.b(1.0f), d0.e.a(16), g0.d(q.b(ee.a.f2157d, 0.1f), rVar, 6), g0.e(62, 4), u0.e.e(770097906, new ud.e(i10 != 1 ? i10 != 2 ? i10 != 3 ? a4.d.g("#", i10) : "🥉" : "🥈" : "🥇", cVar, 1), rVar), rVar, 196614, 16);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new g(i10, cVar, i11);
        }
    }

    public static final void d(oc.a aVar, r rVar, int i10) {
        int i11;
        r rVar2;
        rVar.Z(-1056762042);
        if ((i10 & 6) == 0) {
            i11 = (rVar.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            float f10 = 24;
            rVar2 = rVar;
            g0.b(androidx.compose.foundation.layout.b.b(1.0f), d0.e.b(f10, f10), g0.d(ee.a.f2162i, rVar, 6), g0.e(62, 8), u0.e.e(292278200, new ud.f(1, aVar), rVar), rVar2, 196614, 16);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new g(i10, 2, aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    public static final void e(zd.e eVar, oc.a aVar, r rVar, int i10) {
        boolean z10;
        Object obj;
        r rVar2 = rVar;
        rVar2.Z(543078183);
        int i11 = i10 | (rVar2.h(eVar) ? 4 : 2) | (rVar2.h(aVar) ? 32 : 16);
        if ((i11 & 19) == 18 && rVar2.B()) {
            rVar2.S();
            obj = eVar;
        } else {
            k1.b B = i7.b.B(R.drawable.app_background, rVar2);
            FillElement fillElement = androidx.compose.foundation.layout.b.f542b;
            n a6 = androidx.compose.foundation.a.a(androidx.compose.ui.draw.a.b(fillElement, B, v1.j.f7082a, 0.0f, null, 54), q.b(d0.c(4278911008L), 0.55f), d0.f2219a);
            z.r a8 = z.q.a(i.f8960b, y0.c.f8430r, rVar2, 0);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            n o7 = o(rVar2, a6);
            x1.j.f8084f.getClass();
            z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            h hVar = x1.i.f8079e;
            m0.z.w(a8, rVar2, hVar);
            h hVar2 = x1.i.f8078d;
            m0.z.w(l10, rVar2, hVar2);
            h hVar3 = x1.i.f8080f;
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar3);
            }
            h hVar4 = x1.i.f8077c;
            m0.z.w(o7, rVar2, hVar4);
            d(aVar, rVar2, (i11 >> 3) & 14);
            if (eVar.f9191a.isEmpty()) {
                rVar2.X(258366034);
                e0 e10 = m.e(y0.c.f8423k, false);
                int hashCode2 = Long.hashCode(rVar2.T);
                r1 l11 = rVar2.l();
                n o10 = o(rVar2, fillElement);
                rVar2.b0();
                if (rVar2.S) {
                    rVar2.k(zVar);
                } else {
                    rVar2.l0();
                }
                m0.z.w(e10, rVar2, hVar);
                m0.z.w(l11, rVar2, hVar2);
                if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode2))) {
                    a4.d.p(hashCode2, rVar2, hashCode2, hVar3);
                }
                m0.z.w(o10, rVar2, hVar4);
                z10 = true;
                r0.b("No scores yet.\nPlay your first game!", null, 0L, 0L, 0L, new k(3), 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(t0.f3483a)).f3472j, q.f2278c, 0L, null, null, 0L, 0L, null, 16777214), rVar, 6, 65022);
                rVar2 = rVar;
                rVar2.q(true);
                rVar2.q(false);
                obj = eVar;
            } else {
                z10 = true;
                rVar2.X(258821393);
                float f10 = 16;
                c0 c0Var = new c0(f10, f10, f10, f10);
                z.e eVar2 = new z.e(12);
                rVar2.X(-130191693);
                obj = eVar;
                boolean h10 = rVar2.h(obj);
                Object M = rVar2.M();
                if (h10 || M == l.f4646a) {
                    M = new k2.e(15, obj);
                    rVar2.i0(M);
                }
                rVar2.q(false);
                a.a.b(fillElement, null, c0Var, eVar2, null, null, false, (oc.c) M, rVar2, 24966);
                rVar2.q(false);
            }
            rVar2.q(z10);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new s(i10, 5, obj, aVar);
        }
    }

    public static double f(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float g(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int h(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long i(long j3, long j6, long j10) {
        if (j6 <= j10) {
            return j3 < j6 ? j6 : j3 > j10 ? j10 : j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j6 + '.');
    }

    public static Comparable j(Float f10, a aVar) {
        float f11 = aVar.f6734b;
        float f12 = aVar.f6733a;
        if (f12 <= f11) {
            return (!a.a(f10, Float.valueOf(f12)) || a.a(Float.valueOf(f12), f10)) ? (!a.a(Float.valueOf(f11), f10) || a.a(f10, Float.valueOf(f11))) ? f10 : Float.valueOf(f11) : Float.valueOf(f12);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
    }

    public static final n k(n nVar, oc.f fVar) {
        return nVar.d(new y0.i(fVar));
    }

    public static final String[] l(z0.m mVar) {
        j.c(mVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((z0.d) mVar).f9058b.toArray(new String[0]);
    }

    public static wc.f m(oc.e eVar) {
        wc.f fVar = new wc.f();
        fVar.f7721i = a0.h(fVar, fVar, eVar);
        return fVar;
    }

    public static final n n(r rVar, n nVar) {
        if (nVar.a(y0.j.f8441g)) {
            return nVar;
        }
        rVar.Y(1219399079);
        n nVar2 = (n) nVar.c(y0.k.f8442a, new a1.g(6, rVar));
        rVar.q(false);
        return nVar2;
    }

    public static final n o(r rVar, n nVar) {
        rVar.X(439770924);
        n n7 = n(rVar, nVar);
        rVar.q(false);
        return n7;
    }

    public static b p(d dVar) {
        j.e(dVar, "<this>");
        return new b(dVar.f6735g, dVar.f6736h, dVar.f6737i > 0 ? 2 : -2);
    }

    public static d q(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new d(i10, i11 - 1, 1);
        }
        d dVar = d.f6742j;
        return d.f6742j;
    }
}
