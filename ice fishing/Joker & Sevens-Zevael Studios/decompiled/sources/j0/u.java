package j0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import m0.x1;
import m0.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final y0.n f3484a = androidx.compose.foundation.layout.b.h(y0.k.f8442a, l0.f.f3823a);

    public static final void a(k1.b bVar, String str, y0.n nVar, long j3, m0.r rVar, int i10) {
        k1.b bVar2;
        int i11;
        y0.n nVar2;
        rVar.Z(-2142239481);
        if ((i10 & 6) == 0) {
            bVar2 = bVar;
            i11 = (rVar.h(bVar2) ? 4 : 2) | i10;
        } else {
            bVar2 = bVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= rVar.f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= rVar.f(nVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= rVar.e(j3) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            rVar.U();
            if ((i10 & 1) != 0 && !rVar.z()) {
                rVar.S();
            }
            rVar.r();
            int i12 = 1;
            boolean z10 = (((i11 & 7168) ^ 3072) > 2048 && rVar.e(j3)) || (i11 & 3072) == 2048;
            Object M = rVar.M();
            z0 z0Var = m0.l.f4646a;
            if (z10 || M == z0Var) {
                M = f1.q.c(j3, f1.q.f2283h) ? null : new f1.l(5, j3);
                rVar.i0(M);
            }
            f1.l lVar = (f1.l) M;
            rVar.X(-2144891392);
            boolean z11 = (i11 & 112) == 32;
            Object M2 = rVar.M();
            if (z11 || M2 == z0Var) {
                M2 = new e2.l(str, i12);
                rVar.i0(M2);
            }
            AtomicInteger atomicInteger = e2.k.f1989a;
            AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((oc.c) M2, false);
            rVar.q(false);
            if (!e1.e.a(bVar2.d(), 9205357640488583168L)) {
                long d10 = bVar2.d();
                if (!Float.isInfinite(e1.e.d(d10)) || !Float.isInfinite(e1.e.b(d10))) {
                    nVar2 = y0.k.f8442a;
                    z.m.a(androidx.compose.ui.draw.a.b(nVar.d(nVar2), bVar2, v1.j.f7083b, 0.0f, lVar, 22).d(appendedSemanticsElement), rVar, 0);
                }
            }
            nVar2 = f3484a;
            z.m.a(androidx.compose.ui.draw.a.b(nVar.d(nVar2), bVar2, v1.j.f7083b, 0.0f, lVar, 22).d(appendedSemanticsElement), rVar, 0);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new t(bVar, str, nVar, j3, i10);
        }
    }

    public static final void b(l1.f fVar, String str, y0.n nVar, long j3, m0.r rVar, int i10, int i11) {
        m0.r rVar2;
        String str2;
        long j6;
        y0.n nVar2;
        rVar.Z(-126890956);
        int i12 = (rVar.f(fVar) ? 4 : 2) | i10;
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= rVar.f(nVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= rVar.e(j3) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
            j6 = j3;
            nVar2 = nVar;
            str2 = str;
        } else {
            rVar.U();
            if ((i10 & 1) != 0 && !rVar.z()) {
                rVar.S();
            } else if (i13 != 0) {
                nVar = y0.k.f8442a;
            }
            y0.n nVar3 = nVar;
            rVar.r();
            rVar2 = rVar;
            a(l1.b.c(fVar, rVar), str, nVar3, j3, rVar2, (i12 & 896) | 56 | (i12 & 7168));
            str2 = str;
            j6 = j3;
            nVar2 = nVar3;
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new s(fVar, str2, nVar2, j6, i10, i11);
        }
    }
}
