package com.gamericefishpro.space.t0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends u {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final f1 f = new f1(com.gamericefishpro.space.b1.l.z, f.w);
    public final /* synthetic */ r g;

    public q(r rVar, long j, boolean z, boolean z2, com.gamericefishpro.space.m.d dVar) {
        this.g = rVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void a(x xVar, Function2 function2) {
        this.g.b.a(xVar, function2);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final com.gamericefishpro.space.t.i0 b(x xVar, c2 c2Var, Function2 function2) {
        return this.g.b.b(xVar, c2Var, function2);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void c() {
        this.g.A--;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // com.gamericefishpro.space.t0.u
    public final boolean e() {
        return this.b;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final boolean f() {
        return this.c;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final long g() {
        return this.a;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final t h() {
        return this.g.h;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final l1 i() {
        return (l1) this.f.getValue();
    }

    @Override // com.gamericefishpro.space.t0.u
    public final CoroutineContext j() {
        return this.g.b.j();
    }

    @Override // com.gamericefishpro.space.t0.u
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void l(x xVar) {
        r rVar = this.g;
        rVar.b.l(rVar.h);
        rVar.b.l(xVar);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final t0 m(u0 u0Var) {
        return this.g.b.m(u0Var);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final com.gamericefishpro.space.t.i0 n(x xVar, c2 c2Var, com.gamericefishpro.space.t.i0 i0Var) {
        return this.g.b.n(xVar, c2Var, i0Var);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void p(r rVar) {
        this.e.add(rVar);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void q(p1 p1Var) {
        this.g.b.q(p1Var);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void r(x xVar) {
        this.g.b.r(xVar);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final g s(com.gamericefishpro.space.a2.b bVar) {
        return this.g.b.s(bVar);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void t() {
        this.g.A++;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void u(r rVar) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                Intrinsics.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(rVar.y());
            }
        }
        com.gamericefishpro.space.ei.e0.a(this.e).remove(rVar);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void v(x xVar) {
        this.g.b.v(xVar);
    }

    public final void w() {
        LinkedHashSet<r> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (r rVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(rVar.y());
                }
            }
        }
        linkedHashSet.clear();
    }
}
