package j0;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import m0.d1;
import m0.r1;
import m0.v1;
import m0.x1;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0.f f3335a = new i0.f(0.16f, 0.1f, 0.08f, 0.1f);

    public static final void a(oc.a aVar, y0.n nVar, boolean z10, f1.g0 g0Var, a aVar2, g0 g0Var2, z.c0 c0Var, u0.d dVar, m0.r rVar, int i10) {
        y0.n nVar2;
        boolean z11;
        boolean z12;
        y0.n nVar3;
        rVar.Z(650121315);
        if (((i10 | (rVar.h(aVar) ? 4 : 2) | 432 | (rVar.f(g0Var) ? 2048 : 1024) | (rVar.f(aVar2) ? 16384 : 8192) | 102236160) & 306783379) == 306783378 && rVar.B()) {
            rVar.S();
            nVar3 = nVar;
            z12 = z10;
        } else {
            rVar.U();
            if ((i10 & 1) == 0 || rVar.z()) {
                nVar2 = y0.k.f8442a;
                z11 = true;
            } else {
                rVar.S();
                nVar2 = nVar;
                z11 = z10;
            }
            rVar.r();
            rVar.X(-239156623);
            Object M = rVar.M();
            if (M == m0.l.f4646a) {
                M = new y.i();
                rVar.i0(M);
            }
            y.i iVar = (y.i) M;
            rVar.q(false);
            long j3 = z11 ? aVar2.f3285a : aVar2.f3287c;
            long j6 = z11 ? aVar2.f3286b : aVar2.f3288d;
            rVar.X(-239150048);
            rVar.q(false);
            e eVar = e.f3314h;
            AtomicInteger atomicInteger = e2.k.f1989a;
            y0.n d10 = nVar2.d(new AppendedSemanticsElement(eVar, false));
            u0.d e10 = u0.e.e(956488494, new f(j6, c0Var, dVar), rVar);
            m0.e0 e0Var = p0.f3431a;
            float f10 = ((s2.f) rVar.j(e0Var)).f6387g + 0;
            m0.z.b(new v1[]{n.f3409a.a(new f1.q(j6)), e0Var.a(new s2.f(f10))}, u0.e.e(1279702876, new o0(d10, g0Var, j3, f10, iVar, z11, aVar, 0, e10), rVar), rVar, 56);
            z12 = z11;
            nVar3 = nVar2;
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a0.p(aVar, nVar3, z12, g0Var, aVar2, g0Var2, c0Var, dVar, i10);
        }
    }

    public static final void b(y0.n nVar, f1.g0 g0Var, g gVar, h hVar, u0.d dVar, m0.r rVar, int i10, int i11) {
        y0.n nVar2;
        int i12;
        h hVar2;
        h hVar3;
        y0.n nVar3;
        h hVar4;
        y0.n nVar4;
        int i13;
        rVar.Z(1179621553);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 6) == 0) {
            nVar2 = nVar;
            i12 = (rVar.f(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= rVar.f(g0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= rVar.f(gVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                hVar2 = hVar;
                if (rVar.f(hVar2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                hVar2 = hVar;
            }
            i13 = 1024;
            i12 |= i13;
        } else {
            hVar2 = hVar;
        }
        int i15 = i12 | 24576;
        if ((196608 & i10) == 0) {
            i15 |= rVar.h(dVar) ? 131072 : 65536;
        }
        if ((74899 & i15) == 74898 && rVar.B()) {
            rVar.S();
            nVar4 = nVar2;
            hVar4 = hVar2;
        } else {
            rVar.U();
            if ((i10 & 1) == 0 || rVar.z()) {
                y0.n nVar5 = i14 != 0 ? y0.k.f8442a : nVar2;
                if ((i11 & 8) != 0) {
                    hVar3 = e(63, 0.0f);
                    i15 &= -7169;
                } else {
                    hVar3 = hVar2;
                }
                nVar3 = nVar5;
            } else {
                rVar.S();
                if ((i11 & 8) != 0) {
                    i15 &= -7169;
                }
                h hVar5 = hVar2;
                nVar3 = nVar2;
                hVar3 = hVar5;
            }
            rVar.r();
            long j3 = gVar.f3331a;
            long j6 = gVar.f3332b;
            float f10 = hVar3.f3336a;
            rVar.X(-1763481333);
            rVar.X(-734838460);
            Object M = rVar.M();
            if (M == m0.l.f4646a) {
                M = m0.z.s(new s2.f(f10));
                rVar.i0(M);
            }
            rVar.q(false);
            rVar.q(false);
            p0.a(nVar3, g0Var, j3, j6, ((s2.f) ((d1) M).getValue()).f6387g, u0.e.e(664103990, new b0.o0(dVar, 2, (byte) 0), rVar), rVar, (i15 & 14) | 12582912 | (i15 & 112) | ((i15 << 6) & 3670016), 16);
            hVar4 = hVar3;
            nVar4 = nVar3;
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new i(nVar4, g0Var, gVar, hVar4, dVar, i10, i11);
        }
    }

    public static final void c(oc.a aVar, y0.n nVar, boolean z10, q qVar, u0.d dVar, m0.r rVar, int i10) {
        int i11;
        int i12;
        q qVar2;
        boolean z11;
        q qVar3;
        boolean z12;
        rVar.Z(-1142896114);
        if ((i10 & 6) == 0) {
            i11 = (rVar.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= rVar.f(nVar) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i13 = i11 | 1408;
        }
        int i14 = i13 | 24576;
        if ((196608 & i10) == 0) {
            i14 |= rVar.h(dVar) ? 131072 : 65536;
        }
        if ((74899 & i14) == 74898 && rVar.B()) {
            rVar.S();
            z12 = z10;
            qVar3 = qVar;
        } else {
            rVar.U();
            if ((i10 & 1) == 0 || rVar.z()) {
                rVar.X(-1519621781);
                long j3 = ((f1.q) rVar.j(n.f3409a)).f2285a;
                j jVar = (j) rVar.j(l.f3404a);
                q qVar4 = jVar.M;
                if (qVar4 == null) {
                    long j6 = f1.q.f2282g;
                    qVar4 = new q(j6, j3, j6, f1.q.b(j3, 0.38f));
                    jVar.M = qVar4;
                }
                long j10 = qVar4.f3433b;
                if (f1.q.c(j10, j3)) {
                    rVar.q(false);
                } else {
                    long b2 = f1.q.b(j3, 0.38f);
                    long j11 = qVar4.f3432a;
                    long j12 = qVar4.f3434c;
                    if (j3 == 16) {
                        j3 = j10;
                    }
                    q qVar5 = new q(j11, j3, j12, b2 != 16 ? b2 : qVar4.f3435d);
                    rVar.q(false);
                    qVar4 = qVar5;
                }
                i12 = i14 & (-7169);
                qVar2 = qVar4;
                z11 = true;
            } else {
                rVar.S();
                z11 = z10;
                i12 = i14 & (-7169);
                qVar2 = qVar;
            }
            rVar.r();
            x2 x2Var = v.f3485a;
            y0.n d10 = nVar.d(MinimumInteractiveModifier.f569a);
            float f10 = l0.f.f3824b;
            y0.n c3 = androidx.compose.foundation.a.c(androidx.compose.foundation.a.a(x4.f.B(androidx.compose.foundation.layout.b.h(d10, f10), l0.a(5, rVar)), z11 ? qVar2.f3432a : qVar2.f3434c, f1.d0.f2219a), null, h0.a(f10 / 2, rVar, 54, 4), z11, new e2.g(0), aVar, 8);
            v1.e0 e10 = z.m.e(y0.c.f8423k, false);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            y0.n o7 = uc.e.o(rVar, c3);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            m0.z.w(e10, rVar, x1.i.f8079e);
            m0.z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            m0.z.w(o7, rVar, x1.i.f8077c);
            m0.z.a(n.f3409a.a(new f1.q(z11 ? qVar2.f3433b : qVar2.f3435d)), dVar, rVar, ((i12 >> 12) & 112) | 8);
            rVar.q(true);
            qVar3 = qVar2;
            z12 = z11;
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new r(aVar, nVar, z12, qVar3, dVar, i10);
        }
    }

    public static g d(long j3, m0.r rVar, int i10) {
        long j6;
        long b2 = l.b(j3, rVar);
        long j10 = f1.q.f2283h;
        long b10 = f1.q.b(b2, 0.38f);
        j jVar = (j) rVar.j(l.f3404a);
        g gVar = jVar.L;
        if (gVar == null) {
            float f10 = l0.e.f3815a;
            j6 = b2;
            g gVar2 = new g(l.c(jVar, 39), l.a(jVar, l.c(jVar, 39)), f1.d0.h(f1.q.b(l.c(jVar, l0.e.f3816b), l0.e.f3818d), l.c(jVar, 39)), f1.q.b(l.a(jVar, l.c(jVar, 39)), 0.38f));
            jVar.L = gVar2;
            gVar = gVar2;
        } else {
            j6 = b2;
        }
        long j11 = j3 != 16 ? j3 : gVar.f3331a;
        long j12 = j6 != 16 ? j6 : gVar.f3332b;
        if (j10 == 16) {
            j10 = gVar.f3333c;
        }
        long j13 = j10;
        if (b10 == 16) {
            b10 = gVar.f3334d;
        }
        return new g(j11, j12, j13, b10);
    }

    public static h e(int i10, float f10) {
        if ((i10 & 1) != 0) {
            f10 = l0.e.f3815a;
        }
        return new h(f10, l0.e.f3822h, l0.e.f3820f, l0.e.f3821g, l0.e.f3819e, l0.e.f3817c);
    }
}
