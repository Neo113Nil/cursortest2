package u0;

import m0.r;
import m0.x1;
import pc.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6668a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f6669b = new StackTraceElement[0];

    /* renamed from: c, reason: collision with root package name */
    public static final k f6670c = new k(0, new long[0], new Object[0]);

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final d b(r rVar, int i10, pc.k kVar) {
        d dVar;
        rVar.T(Integer.rotateLeft(i10, 1), 0, f6668a, null);
        Object M = rVar.M();
        if (M == m0.l.f4646a) {
            dVar = new d(i10, kVar, true);
            rVar.i0(dVar);
        } else {
            pc.j.c(M, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            dVar = (d) M;
            dVar.g(kVar);
        }
        rVar.q(false);
        return dVar;
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final void d(r rVar, oc.e eVar) {
        pc.j.c(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        v.c(2, eVar);
        eVar.invoke(rVar, 1);
    }

    public static final d e(int i10, ac.c cVar, r rVar) {
        Object M = rVar.M();
        if (M == m0.l.f4646a) {
            M = new d(i10, cVar, true);
            rVar.i0(M);
        }
        d dVar = (d) M;
        dVar.g(cVar);
        return dVar;
    }

    public static final boolean f(x1 x1Var, x1 x1Var2) {
        if (x1Var == null) {
            return true;
        }
        if (x1Var instanceof x1) {
            return !x1Var.b() || x1Var.equals(x1Var2) || pc.j.a(x1Var.f4808c, x1Var2.f4808c);
        }
        return false;
    }
}
