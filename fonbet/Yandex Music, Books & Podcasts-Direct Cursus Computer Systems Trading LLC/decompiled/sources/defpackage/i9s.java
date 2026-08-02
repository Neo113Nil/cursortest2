package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i9s implements s5d {
    public final es6 a;
    public final zzp b;
    public final caw c;
    public final rjq d;
    public final um6 e;
    public final um6 f;
    public volatile mwk g;
    public volatile long h;
    public volatile long i;
    public volatile boolean j;
    public volatile tnl k;
    public volatile h4q l;
    public final r5d m;

    public i9s(es6 es6Var, zzp zzpVar, caw cawVar) {
        cawVar.getClass();
        this.a = es6Var;
        this.b = zzpVar;
        this.c = cawVar;
        rjq rjqVar = new rjq(false);
        this.d = rjqVar;
        this.e = hld.s(rjqVar, dm6.b);
        this.f = hld.s(rjqVar, dm6.b());
        this.g = h1b.e;
        this.k = tnl.a;
        this.l = new h4q(1.0f);
        wdg.E();
        this.m = r5d.g;
    }

    public static final void y(i9s i9sVar) {
        gzk gzkVar = new gzk(i9sVar.g, i9sVar.k, i9sVar.j, false);
        ssg.a(4, "TestPlayer", "updateState = " + gzkVar, null);
        i9sVar.a.Q(gzkVar);
    }

    @Override // defpackage.s5d
    public final Object a(h4q h4qVar, v0r v0rVar) {
        Object V = x97.V(dm6.b(), new n6p(this, h4qVar, null, 12), v0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object b(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new g9s(this, null, 2), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object c(p5d p5dVar, Continuation continuation) {
        Object V = x97.V(dm6.b(), new v0r(this, p5dVar, null, 23), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object d(boolean z, u0r u0rVar) {
        return x97.V(dm6.b(), new ze1(this, z, null, 13), u0rVar);
    }

    @Override // defpackage.s5d
    public final long g() {
        return ((Number) ff7.L(new f9s(this, 0))).longValue();
    }

    @Override // defpackage.s5d
    public final r5d getPlayerType() {
        return this.m;
    }

    @Override // defpackage.s5d
    public final long h() {
        return ((Number) ff7.L(new f9s(this, 1))).longValue();
    }

    @Override // defpackage.s5d
    public final Object i(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new db(2, 18, null), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object k(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new glp(this, null, 23), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object m(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new db(2, 20, null), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object n(Continuation continuation) {
        Object V = x97.V(dm6.b(), new g9s(this, null, 3), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object o(long j, Continuation continuation) {
        Object V = x97.V(dm6.b(), new h9s(this, j, null), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object p(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new g9s(this, null, 6), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object q(r0r r0rVar) {
        return t(r0rVar);
    }

    @Override // defpackage.s5d
    public final Object r(Continuation continuation) {
        return x97.V(dm6.b(), new g9s(this, null, 4), continuation);
    }

    @Override // defpackage.s5d
    public final Object t(Continuation continuation) {
        return x97.V(dm6.b(), new g9s(this, null, 0), continuation);
    }

    @Override // defpackage.s5d
    public final Object u(eol eolVar) {
        return r(eolVar);
    }

    @Override // defpackage.s5d
    public final Object v(n4q n4qVar, v0r v0rVar) {
        Object V = x97.V(dm6.b(), new db(2, 19, null), v0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object w(Continuation continuation) {
        return x97.V(dm6.b(), new g9s(this, null, 1), continuation);
    }

    @Override // defpackage.s5d
    public final Object x(r0r r0rVar) {
        return x97.V(dm6.b(), new db(2, 17, null), r0rVar);
    }
}
