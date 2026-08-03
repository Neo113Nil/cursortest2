package z;

import java.util.HashMap;
import m0.r1;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f8982a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f8983b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final l f8984c = l.f8977b;

    public static final void a(y0.n nVar, m0.r rVar, int i10) {
        rVar.Z(-211209833);
        if ((((rVar.f(nVar) ? 4 : 2) | i10) & 3) == 2 && rVar.B()) {
            rVar.S();
        } else {
            int hashCode = Long.hashCode(rVar.T);
            y0.n o7 = uc.e.o(rVar, nVar);
            r1 l10 = rVar.l();
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            m0.z.w(f8984c, rVar, x1.i.f8079e);
            m0.z.w(l10, rVar, x1.i.f8078d);
            m0.z.w(o7, rVar, x1.i.f8077c);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a1.g(i10, 9, nVar);
        }
    }

    public static final void b(v1.i0 i0Var, v1.j0 j0Var, v1.d0 d0Var, s2.l lVar, int i10, int i11, y0.f fVar) {
        y0.f fVar2;
        Object g8 = d0Var.g();
        j jVar = g8 instanceof j ? (j) g8 : null;
        v1.i0.h(i0Var, j0Var, ((jVar == null || (fVar2 = jVar.f8965u) == null) ? fVar : fVar2).a(i7.b.e(j0Var.f7085g, j0Var.f7086h), i7.b.e(i10, i11), lVar));
    }

    public static final HashMap c(boolean z10) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z10, y0.c.f8419g);
        d(hashMap, z10, y0.c.f8420h);
        d(hashMap, z10, y0.c.f8421i);
        d(hashMap, z10, y0.c.f8422j);
        d(hashMap, z10, y0.c.f8423k);
        d(hashMap, z10, y0.c.f8424l);
        d(hashMap, z10, y0.c.f8425m);
        d(hashMap, z10, y0.c.f8426n);
        d(hashMap, z10, y0.c.f8427o);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z10, y0.f fVar) {
        hashMap.put(fVar, new p(fVar, z10));
    }

    public static final v1.e0 e(y0.f fVar, boolean z10) {
        v1.e0 e0Var = (v1.e0) (z10 ? f8982a : f8983b).get(fVar);
        return e0Var == null ? new p(fVar, z10) : e0Var;
    }
}
