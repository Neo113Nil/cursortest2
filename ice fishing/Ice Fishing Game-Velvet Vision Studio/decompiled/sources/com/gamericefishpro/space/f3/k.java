package com.gamericefishpro.space.f3;

import android.content.Context;
import android.view.View;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.i2.b1;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final com.gamericefishpro.space.v8.l a = new com.gamericefishpro.space.v8.l(4);

    public static final void a(int i, com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.t0.r rVar, Function1 function1) {
        int i2;
        Object obj = c.w;
        rVar.b0(-180024211);
        if ((i & 6) == 0) {
            i2 = (rVar.h(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.f(mVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= rVar.h(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar.h(obj) ? 16384 : 8192;
        }
        if (rVar.S(i3 & 1, (i3 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(rVar.T);
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVar.c(r.a).c(com.gamericefishpro.space.m1.t.a).c(x.a).c(u.a), rVar);
            com.gamericefishpro.space.c3.c cVar = (com.gamericefishpro.space.c3.c) rVar.j(b1.h);
            com.gamericefishpro.space.c3.l lVar = (com.gamericefishpro.space.c3.l) rVar.j(b1.n);
            l1 l1VarL = rVar.l();
            com.gamericefishpro.space.z4.u uVar = (com.gamericefishpro.space.z4.u) rVar.j(com.gamericefishpro.space.a5.i.a);
            com.gamericefishpro.space.z5.e eVar = (com.gamericefishpro.space.z5.e) rVar.j(com.gamericefishpro.space.a6.a.a);
            rVar.a0(1314774735);
            int i4 = i3 & 14;
            int iHashCode2 = Long.hashCode(rVar.T);
            Context context = (Context) rVar.j(j0.b);
            com.gamericefishpro.space.t0.q qVarY = com.gamericefishpro.space.t0.i.y(rVar);
            com.gamericefishpro.space.e1.f fVar = (com.gamericefishpro.space.e1.f) rVar.j(com.gamericefishpro.space.e1.h.a);
            View view = (View) rVar.j(j0.f);
            boolean zH = rVar.h(context) | ((((i4 & 14) ^ 6) > 4 && rVar.f(function1)) || (i4 & 6) == 4) | rVar.h(qVarY) | rVar.h(fVar) | rVar.d(iHashCode2) | rVar.h(view);
            Object objP = rVar.P();
            if (zH || objP == com.gamericefishpro.space.t0.n.a) {
                objP = new o(context, function1, qVarY, fVar, iHashCode2, view);
                rVar.k0(objP);
            }
            Function0 function0 = (Function0) objP;
            rVar.W(125, 1, null, null);
            rVar.r = true;
            if (rVar.S) {
                rVar.k(function0);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, m.v);
            com.gamericefishpro.space.t0.i.B(rVar, cVar, m.w);
            com.gamericefishpro.space.t0.i.B(rVar, uVar, m.y);
            com.gamericefishpro.space.t0.i.B(rVar, eVar, m.z);
            com.gamericefishpro.space.t0.i.B(rVar, lVar, m.A);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.B(rVar, obj, m.e);
            com.gamericefishpro.space.t0.i.B(rVar, obj, m.i);
            rVar.p(true);
            rVar.p(false);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new n(function1, mVar, i);
        }
    }

    public static final void b(Function1 function1, com.gamericefishpro.space.h1.m mVar, Function1 function2, com.gamericefishpro.space.t0.r rVar, int i) {
        c cVar = c.w;
        rVar.b0(-1783766393);
        int i2 = (rVar.h(function1) ? 4 : 2) | i | 384;
        if (rVar.S(i2 & 1, (i2 & 147) != 146)) {
            a((i2 & 14) | 27696, mVar, rVar, function1);
            function2 = cVar;
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new l(function1, mVar, function2, i);
        }
    }

    public static final View c(com.gamericefishpro.space.h1.l lVar) {
        z zVar = com.gamericefishpro.space.h2.k.s(lVar.d).I;
        View interopView = zVar != null ? zVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(z zVar, f0 f0Var) {
        long jH = f0Var.Z.c.H(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jH >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jH & 4294967295L)));
        zVar.layout(iRound, iRound2, zVar.getMeasuredWidth() + iRound, zVar.getMeasuredHeight() + iRound2);
    }

    public static final z e(f0 f0Var) {
        z zVar = f0Var.I;
        if (zVar != null) {
            return zVar;
        }
        throw com.gamericefishpro.space.m5.a.e("Required value was null.");
    }
}
