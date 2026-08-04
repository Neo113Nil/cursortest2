package com.gamericefishpro.space.l7;

import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.j;
import com.gamericefishpro.space.d0.y;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.u6.l;
import com.gamericefishpro.space.w.b0;
import com.gamericefishpro.space.w.j0;
import com.gamericefishpro.space.w.o1;
import com.gamericefishpro.space.w.t;
import com.gamericefishpro.space.w.z;
import com.gamericefishpro.space.y.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int i;
    public final /* synthetic */ int v;
    public final /* synthetic */ float w;

    public h(int i, boolean z, int i2, int i3, float f) {
        this.d = i;
        this.e = z;
        this.i = i2;
        this.v = i3;
        this.w = f;
    }

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        y BoxWithConstraints = (y) obj;
        r rVar = (r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= rVar.f(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && rVar.E()) {
            rVar.V();
        } else {
            com.gamericefishpro.space.c3.c cVar = BoxWithConstraints.a;
            long j = BoxWithConstraints.b;
            float fG0 = com.gamericefishpro.space.c3.a.d(j) ? cVar.g0(com.gamericefishpro.space.c3.a.h(j)) : Float.POSITIVE_INFINITY;
            float f = 100;
            StringBuilder sb = new StringBuilder("fish_transition_");
            int i = this.d;
            sb.append(i);
            b0 b0VarM = com.gamericefishpro.space.w.c.m(sb.toString(), rVar);
            boolean z = this.e;
            float f2 = z ? -f : fG0 + f;
            float f3 = z ? fG0 + f : -f;
            com.gamericefishpro.space.c3.f fVar = new com.gamericefishpro.space.c3.f(f2);
            com.gamericefishpro.space.c3.f fVar2 = new com.gamericefishpro.space.c3.f(f3);
            l lVar = com.gamericefishpro.space.w.c.l;
            z zVarG = com.gamericefishpro.space.w.c.g(b0VarM, fVar, fVar2, lVar, com.gamericefishpro.space.w.c.l(new o1(this.i, this.v, t.b), j0.d), "fish_x", rVar, 229384);
            z zVarG2 = com.gamericefishpro.space.w.c.g(b0VarM, new com.gamericefishpro.space.c3.f(-10), new com.gamericefishpro.space.c3.f(10), lVar, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(1500, 2, t.a), j0.e), "fish_y", rVar, 229816);
            com.gamericefishpro.space.t1.b bVarI = com.gamericefishpro.space.u6.f.I(i, rVar, 0);
            m mVarF = g1.f(j.i(com.gamericefishpro.space.h1.j.a, ((com.gamericefishpro.space.c3.f) zVarG.v.getValue()).d, this.w + ((com.gamericefishpro.space.c3.f) zVarG2.v.getValue()).d), f);
            rVar.a0(170838013);
            boolean zG = rVar.g(z);
            Object objP = rVar.P();
            if (zG || objP == n.a) {
                objP = new g(0, z);
                rVar.k0(objP);
            }
            rVar.p(false);
            q.b(bVarI, null, o.m(mVarF, (Function1) objP), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar, 24632, 104);
        }
        return Unit.a;
    }
}
