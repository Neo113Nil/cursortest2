package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class nmw implements s5d {
    public final wlw a;
    public final es6 b;
    public final jyr c = btf.b(new lmw(this, 1));
    public final jyr d = btf.b(new lmw(this, 2));
    public final r5d e;
    public final nej f;

    public nmw(wlw wlwVar, es6 es6Var) {
        this.a = wlwVar;
        this.b = es6Var;
        wdg.E();
        this.e = r5d.f;
        this.f = new nej(0);
    }

    @Override // defpackage.s5d
    public final Object a(h4q h4qVar, v0r v0rVar) {
        Object V = x97.V(dm6.b(), new j9w(this, h4qVar, null, 6), v0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object b(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new mmw(this, null, 4), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object c(p5d p5dVar, Continuation continuation) {
        Object V = x97.V(dm6.b(), new mmw(this, null, 7), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object d(boolean z, u0r u0rVar) {
        return x97.V(dm6.b(), new ze1(this, z, null, 15), u0rVar);
    }

    @Override // defpackage.s5d
    public final long g() {
        return ((Number) ff7.L(new lmw(this, 3))).longValue();
    }

    @Override // defpackage.s5d
    public final r5d getPlayerType() {
        return this.e;
    }

    @Override // defpackage.s5d
    public final long h() {
        return ((Number) ff7.L(new lmw(this, 0))).longValue();
    }

    @Override // defpackage.s5d
    public final Object i(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new mmw(this, null, 3), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final i6q j() {
        return this.f;
    }

    @Override // defpackage.s5d
    public final Object k(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new mmw(this, null, 8), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object m(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new mmw(this, null, 10), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object n(Continuation continuation) {
        Object V = x97.V(dm6.b(), new mmw(this, null, 5), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object o(long j, Continuation continuation) {
        Object V = x97.V(dm6.b(), new g84(this, j, null, 4), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object p(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new mmw(this, null, 9), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object q(r0r r0rVar) {
        return t(r0rVar);
    }

    @Override // defpackage.s5d
    public final Object r(Continuation continuation) {
        return x97.V(dm6.b(), new mmw(this, null, 6), continuation);
    }

    @Override // defpackage.s5d
    public final Object t(Continuation continuation) {
        return x97.V(dm6.b(), new mmw(this, null, 0), continuation);
    }

    @Override // defpackage.s5d
    public final Object u(eol eolVar) {
        return new Long(-1L);
    }

    @Override // defpackage.s5d
    public final Object v(n4q n4qVar, v0r v0rVar) {
        Object V = x97.V(dm6.b(), new j9w(this, n4qVar, null, 7), v0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object w(Continuation continuation) {
        return x97.V(dm6.b(), new mmw(this, null, 1), continuation);
    }

    @Override // defpackage.s5d
    public final Object x(r0r r0rVar) {
        return x97.V(dm6.b(), new mmw(this, null, 2), r0rVar);
    }

    public final epw y() {
        return (epw) this.d.getValue();
    }
}
