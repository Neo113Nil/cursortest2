package u2;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.e;
import f1.d0;
import h2.h0;
import j0.g0;
import j0.j;
import j0.l;
import j0.r0;
import j0.s0;
import j0.t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import m0.i2;
import m0.m2;
import m0.o;
import m0.r;
import m0.r1;
import m0.t;
import m0.w1;
import m0.x1;
import m0.x2;
import m0.z0;
import org.fortheloss.st.R;
import r1.g;
import r1.u;
import rd.k;
import rd.m;
import rd.s;
import rd.v;
import s.a0;
import u.l0;
import v.c;
import v.d;
import v1.e0;
import w.u0;
import w.v0;
import w.w0;
import x1.h;
import x1.i;
import x1.z;
import y0.n;
import y1.y0;
import z.c0;
import z.f;
import z.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {
    public static final void a(int i10, r rVar, int i11) {
        r rVar2;
        rVar.Z(1087350654);
        if ((((rVar.d(i10) ? 4 : 2) | i11) & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            g0.b(null, e.a(20), g0.d(((j) rVar.j(l.f3404a)).f3357c, rVar, 0), null, u0.e.e(809386352, new v(i10, 3), rVar), rVar2, 196608, 25);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new k(i10, i11, 3);
        }
    }

    public static final void b(final int i10, final boolean z10, final oc.a aVar, r rVar, final int i11) {
        r rVar2 = rVar;
        pc.j.e(aVar, "onClick");
        rVar2.Z(1966909659);
        int i12 = i11 | (rVar2.d(i10) ? 4 : 2) | (rVar2.g(z10) ? 32 : 16) | (rVar2.h(aVar) ? 256 : 128);
        if ((i12 & 147) == 146 && rVar2.B()) {
            rVar2.S();
        } else {
            rVar2.X(-2008988767);
            Object M = rVar2.M();
            z0 z0Var = m0.l.f4646a;
            if (M == z0Var) {
                M = d.a(1.0f);
                rVar2.i0(M);
            }
            c cVar = (c) M;
            rVar2.q(false);
            Boolean valueOf = Boolean.valueOf(z10);
            rVar2.X(-2008985731);
            int i13 = i12 & 112;
            int i14 = 1;
            boolean h10 = ((i12 & 896) == 256) | (i13 == 32) | rVar2.h(cVar);
            Object M2 = rVar2.M();
            if (h10 || M2 == z0Var) {
                M2 = new vd.j(z10, cVar, aVar);
                rVar2.i0(M2);
            }
            rVar2.q(false);
            g gVar = u.f5994a;
            SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(valueOf, null, (PointerInputEventHandler) M2, 6);
            n i15 = androidx.compose.foundation.layout.b.i(y0.k.f8442a, 100, 52);
            rVar2.X(-2008972237);
            boolean h11 = (i13 == 32) | rVar2.h(cVar);
            Object M3 = rVar2.M();
            if (h11 || M3 == z0Var) {
                M3 = new m(cVar, z10, i14);
                rVar2.i0(M3);
            }
            rVar2.q(false);
            n d10 = androidx.compose.ui.graphics.a.a(i15, (oc.c) M3).d(suspendPointerInputElement);
            e0 e10 = z.m.e(y0.c.f8419g, false);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            n o7 = uc.e.o(rVar2, d10);
            x1.j.f8084f.getClass();
            z zVar = i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            h hVar = i.f8079e;
            m0.z.w(e10, rVar2, hVar);
            h hVar2 = i.f8078d;
            m0.z.w(l10, rVar2, hVar2);
            h hVar3 = i.f8080f;
            if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar3);
            }
            h hVar4 = i.f8077c;
            m0.z.w(o7, rVar2, hVar4);
            l0.a(i7.b.B(R.drawable.custom_button, rVar2), "custom button", null, null, null, 0.0f, rVar2, 48, 124);
            n a6 = androidx.compose.foundation.layout.a.f540a.a();
            z.r a8 = q.a(z.i.f8960b, y0.c.f8431s, rVar2, 48);
            int hashCode2 = Long.hashCode(rVar2.T);
            r1 l11 = rVar2.l();
            n o10 = uc.e.o(rVar2, a6);
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            m0.z.w(a8, rVar2, hVar);
            m0.z.w(l11, rVar2, hVar2);
            if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar2, hashCode2, hVar3);
            }
            m0.z.w(o10, rVar2, hVar4);
            String valueOf2 = String.valueOf(i10);
            x2 x2Var = t0.f3483a;
            h0 h0Var = ((s0) rVar2.j(x2Var)).f3473k;
            long j3 = f1.q.f2279d;
            r0.b(valueOf2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(h0Var, j3, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar, 0, 65534);
            r0.b("CHIPS BUY", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3477o, j3, 0L, null, null, 0L, 0L, null, 16777214), rVar, 6, 65534);
            rVar2 = rVar;
            rVar2.q(true);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(i10, z10, aVar, i11) { // from class: vd.h

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f7331g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f7332h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ oc.a f7333i;

                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int y10 = m0.z.y(1);
                    u2.b.b(this.f7331g, this.f7332h, this.f7333i, (r) obj, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static final void c(final qd.k kVar, final boolean z10, final oc.a aVar, r rVar, final int i10) {
        rVar.Z(823372329);
        if ((((rVar.f(kVar) ? 4 : 2) | i10 | (rVar.g(z10) ? 32 : 16) | (rVar.h(aVar) ? 256 : 128)) & 147) == 146 && rVar.B()) {
            rVar.S();
        } else {
            g0.b(androidx.compose.foundation.layout.b.b(1.0f), e.a(16), g0.d(ee.a.f2162i, rVar, 6), g0.e(62, 4), u0.e.e(-380036233, new vd.k(kVar, z10, aVar), rVar), rVar, 196614, 16);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(z10, aVar, i10) { // from class: vd.g

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f7329h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ oc.a f7330i;

                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int y10 = m0.z.y(1);
                    u2.b.c(qd.k.this, this.f7329h, this.f7330i, (r) obj, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static final void d(final List list, final int i10, final oc.c cVar, r rVar, final int i11) {
        int i12;
        rVar.Z(1821330928);
        if ((i11 & 6) == 0) {
            i12 = (rVar.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= rVar.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= rVar.h(cVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && rVar.B()) {
            rVar.S();
        } else {
            float f10 = 16;
            c0 c0Var = new c0(f10, f10, f10, f10);
            f fVar = z.i.f8959a;
            z.e eVar = new z.e(12);
            rVar.X(-69653300);
            int i13 = 1;
            boolean h10 = ((i12 & 896) == 256) | rVar.h(list) | ((i12 & 112) == 32);
            Object M = rVar.M();
            if (h10 || M == m0.l.f4646a) {
                M = new w1(i10, i13, list, cVar);
                rVar.i0(M);
            }
            rVar.q(false);
            a.a.b(androidx.compose.foundation.layout.b.f542b, null, c0Var, eVar, null, null, false, (oc.c) M, rVar, 24966);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new oc.e() { // from class: vd.e
                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int y10 = m0.z.y(i11 | 1);
                    u2.b.d(list, i10, cVar, (r) obj, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static final void e(final int i10, final oc.a aVar, r rVar, final int i11) {
        int i12;
        r rVar2;
        rVar.Z(-2117361430);
        if ((i11 & 6) == 0) {
            i12 = (rVar.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= rVar.h(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            float f10 = 24;
            rVar2 = rVar;
            g0.b(androidx.compose.foundation.layout.b.b(1.0f), e.b(f10, f10), g0.d(ee.a.f2162i, rVar, 6), g0.e(62, 8), u0.e.e(843196636, new s(i10, 1, aVar), rVar), rVar2, 196614, 16);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new oc.e() { // from class: vd.f
                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int y10 = m0.z.y(i11 | 1);
                    u2.b.e(i10, aVar, (r) obj, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static final void f(final vd.n nVar, final oc.c cVar, final oc.a aVar, r rVar, final int i10) {
        rVar.Z(-1491061132);
        int i11 = (rVar.h(nVar) ? 4 : 2) | i10 | (rVar.h(cVar) ? 32 : 16) | (rVar.h(aVar) ? 256 : 128);
        if ((i11 & 147) == 146 && rVar.B()) {
            rVar.S();
        } else {
            n a6 = androidx.compose.foundation.a.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.f542b, i7.b.B(R.drawable.app_background, rVar), v1.j.f7082a, 0.0f, null, 54), f1.q.b(d0.c(4278911008L), 0.55f), d0.f2219a);
            z.r a8 = q.a(z.i.f8960b, y0.c.f8430r, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            n o7 = uc.e.o(rVar, a6);
            x1.j.f8084f.getClass();
            z zVar = i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            m0.z.w(a8, rVar, i.f8079e);
            m0.z.w(l10, rVar, i.f8078d);
            h hVar = i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            m0.z.w(o7, rVar, i.f8077c);
            e(nVar.f7350a, aVar, rVar, (i11 >> 3) & 112);
            d(nVar.f7351b, nVar.f7350a, cVar, rVar, (i11 << 3) & 896);
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(cVar, aVar, i10) { // from class: vd.d

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ oc.c f7319h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ oc.a f7320i;

                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int y10 = m0.z.y(1);
                    u2.b.f(n.this, this.f7319h, this.f7320i, (r) obj, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static final void g(r rVar, n nVar) {
        z.l lVar = z.l.f8978c;
        int o7 = m0.z.o(rVar);
        n o10 = uc.e.o(rVar, nVar);
        r1 l10 = rVar.l();
        x1.j.f8084f.getClass();
        z zVar = i.f8076b;
        rVar.b0();
        if (rVar.S) {
            rVar.k(zVar);
        } else {
            rVar.l0();
        }
        m0.z.w(lVar, rVar, i.f8079e);
        m0.z.w(l10, rVar, i.f8078d);
        m0.z.w(o10, rVar, i.f8077c);
        h hVar = i.f8080f;
        if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o7))) {
            a4.d.p(o7, rVar, o7, hVar);
        }
        rVar.q(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [c5.d, x0.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [m0.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List h(m2 m2Var, Integer num, int i10, Integer num2) {
        int i11;
        a0 a0Var;
        if (m2Var.f4680w || m2Var.p() == 0) {
            return bc.v.f1067g;
        }
        ?? hVar = new x0.h(m2Var);
        if (num2 != null) {
            i11 = num2.intValue();
        } else {
            i11 = m2Var.f4679v;
            if (i11 < 0) {
                i11 = m2Var.D(m2Var.f4659b, i10);
            }
        }
        if (num == 0) {
            int M = m2Var.f4666i - m2Var.M(m2Var.f4659b, m2Var.r(i10));
            s.u uVar = m2Var.f4676s;
            num = Integer.valueOf(M + ((uVar == null || (a0Var = (a0) uVar.b(i10)) == null) ? 0 : a0Var.f6220b));
        }
        while (i10 >= 0) {
            hVar.c(m2Var.N(i10), num);
            num = m2Var.b(i10);
            if (i11 >= 0) {
                int i12 = i11;
                i11 = m2Var.D(m2Var.f4659b, i11);
                i10 = i12;
            } else {
                i10 = i11;
            }
        }
        return (ArrayList) hVar.f1234a;
    }

    public static void i(int i10) {
        if (2 > i10 || i10 >= 37) {
            throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new uc.d(2, 36, 1));
        }
    }

    public static androidx.lifecycle.t0 j(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                pc.j.b(newInstance);
                return (androidx.lifecycle.t0) newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    public static final float k(float f10) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f10) & 8589934591L) / 3)) + 709952852);
        float f11 = intBitsToFloat - ((intBitsToFloat - (f10 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final Integer l(i2 i2Var, m0.v vVar, int i10, int i11) {
        Integer l10;
        int[] iArr = i2Var.f4615b;
        while (true) {
            if (i10 >= i11) {
                return null;
            }
            int i12 = iArr[(i10 * 5) + 3] + i10;
            if (i2Var.j(i10) && i2Var.i(i10) == 206 && pc.j.a(i2Var.p(iArr, i10), t.f4761e)) {
                Object h10 = i2Var.h(i10, 0);
                o oVar = h10 instanceof o ? (o) h10 : null;
                if (oVar != null && oVar.f4688g.equals(vVar)) {
                    return Integer.valueOf(i10);
                }
            }
            if (i2Var.d(i10) && (l10 = l(i2Var, vVar, i10 + 1, i12)) != null) {
                return Integer.valueOf(l10.intValue());
            }
            i10 = i12;
        }
    }

    public static boolean m(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    public static final n n(n nVar, x.t0 t0Var, x.e0 e0Var, boolean z10, x.k kVar, y.i iVar, r rVar) {
        w0 w0Var;
        x.t0 t0Var2;
        x.e0 e0Var2;
        boolean z11;
        x.k kVar2;
        n nVar2;
        boolean z12;
        y.i iVar2;
        Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f603b);
        u0 u0Var = (u0) rVar.j(v0.f7516a);
        if (u0Var != null) {
            rVar.X(1586021609);
            boolean f10 = rVar.f(context) | rVar.f(u0Var);
            Object M = rVar.M();
            if (f10 || M == m0.l.f4646a) {
                M = new w.g(context, u0Var);
                rVar.i0(M);
            }
            w0Var = (w.g) M;
            rVar.q(false);
        } else {
            rVar.X(1586120933);
            rVar.q(false);
            w0Var = w.t0.f7508h;
        }
        w0 w0Var2 = w0Var;
        x.e0 e0Var3 = x.e0.f7769g;
        n d10 = nVar.d(e0Var == e0Var3 ? w.t.f7506c : w.t.f7505b).d(w0Var2.b());
        if (((s2.l) rVar.j(y0.f8715n)) != s2.l.f6397h || e0Var == e0Var3) {
            t0Var2 = t0Var;
            e0Var2 = e0Var;
            z11 = z10;
            kVar2 = kVar;
            nVar2 = d10;
            z12 = true;
            iVar2 = iVar;
        } else {
            t0Var2 = t0Var;
            e0Var2 = e0Var;
            kVar2 = kVar;
            iVar2 = iVar;
            nVar2 = d10;
            z12 = false;
            z11 = z10;
        }
        return androidx.compose.foundation.gestures.a.b(nVar2, t0Var2, e0Var2, w0Var2, z11, z12, kVar2, iVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c5.d, x0.h] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList o(i2 i2Var, int i10, Integer num) {
        ?? hVar = new x0.h(i2Var);
        int q10 = i2Var.q(i10);
        m0.a a6 = i2Var.a(i10);
        while (i10 >= 0) {
            hVar.c(i2Var.f4614a.f(i10), num);
            if (q10 >= 0) {
                m0.a aVar = a6;
                a6 = i2Var.a(q10);
                i10 = q10;
                q10 = i2Var.q(q10);
                num = aVar;
            } else {
                i10 = q10;
                num = a6;
            }
        }
        return (ArrayList) hVar.f1234a;
    }
}
