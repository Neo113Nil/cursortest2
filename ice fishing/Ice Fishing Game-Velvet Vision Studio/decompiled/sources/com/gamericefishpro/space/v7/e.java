package com.gamericefishpro.space.v7;

import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.j;
import com.gamericefishpro.space.d0.u0;
import com.gamericefishpro.space.d0.v;
import com.gamericefishpro.space.e.q;
import com.gamericefishpro.space.f1.u;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.f3.k;
import com.gamericefishpro.space.g5.s;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ v0 A;
    public final /* synthetic */ com.gamericefishpro.space.x7.f d;
    public final /* synthetic */ i e;
    public final /* synthetic */ q i;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ u y;
    public final /* synthetic */ v0 z;

    public e(com.gamericefishpro.space.x7.f fVar, i iVar, q qVar, Function0 function0, String str, u uVar, v0 v0Var, v0 v0Var2) {
        this.d = fVar;
        this.e = iVar;
        this.i = qVar;
        this.v = function0;
        this.w = str;
        this.y = uVar;
        this.z = v0Var;
        this.A = v0Var2;
    }

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        u0 innerPadding = (u0) obj;
        r rVar = (r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= rVar.f(innerPadding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && rVar.E()) {
            rVar.V();
        } else {
            h0 h0Var = g1.c;
            m mVarK = j.k(h0Var, innerPadding);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            m mVarF = com.gamericefishpro.space.d9.h.F(mVarK, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
            rVar.a0(827236095);
            com.gamericefishpro.space.x7.f fVar = this.d;
            boolean zF = rVar.f(fVar);
            i iVar = this.e;
            boolean zH = zF | rVar.h(iVar);
            q qVar = this.i;
            boolean zH2 = zH | rVar.h(qVar);
            Function0 function0 = this.v;
            boolean zF2 = zH2 | rVar.f(function0);
            String str = this.w;
            boolean zF3 = zF2 | rVar.f(str);
            Object objP = rVar.P();
            if (zF3 || objP == n.a) {
                s sVar = new s(fVar, this.y, str, iVar, this.z, qVar, function0);
                rVar.k0(sVar);
                objP = sVar;
            }
            rVar.p(false);
            k.b((Function1) objP, h0Var, null, rVar, 48);
            rVar.a0(827284109);
            v0 v0Var = this.A;
            if (((g) v0Var.getValue()).a < 100) {
                a4.g(((g) v0Var.getValue()).a / 100.0f, v.b.e(g1.b(com.gamericefishpro.space.h1.j.a, 1.0f), com.gamericefishpro.space.h1.b.e), 0L, 0L, 0L, rVar, 0);
            }
            rVar.p(false);
            rVar.p(true);
        }
        return Unit.a;
    }
}
