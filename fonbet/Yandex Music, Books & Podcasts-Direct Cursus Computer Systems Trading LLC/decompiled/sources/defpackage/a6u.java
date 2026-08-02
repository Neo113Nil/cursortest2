package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class a6u implements s5d {
    public final es6 a;
    public final jyr b;
    public final jyr c;
    public gbw d;
    public final w1f e;
    public mwk f;
    public boolean g;
    public tnl h;
    public final r5d i;

    public a6u(es6 es6Var) {
        this.a = es6Var;
        bdt I = hag.I(fbw.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(g4u.class), true);
        this.e = new w1f();
        this.f = h1b.e;
        this.h = tnl.a;
        wdg.E();
        this.i = r5d.d;
    }

    public static final void y(a6u a6uVar, tnl tnlVar) {
        a6uVar.h = tnlVar;
        boolean z = a6uVar.g;
        w1f w1fVar = a6uVar.e;
        ssg.a(3, "VideoClipPlayer", "updateState: state=" + tnlVar + ", playWhenReady=" + z + ", isMuted=" + ((AtomicBoolean) w1fVar.b).get(), null);
        a6uVar.a.Q(new gzk(a6uVar.f, tnlVar, a6uVar.g, ((AtomicBoolean) w1fVar.b).get()));
    }

    @Override // defpackage.s5d
    public final Object a(h4q h4qVar, v0r v0rVar) {
        Object V = x97.V(dm6.b(), new n6p(this, h4qVar, null, 22), v0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object b(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new z5u(this, null, 4), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object c(p5d p5dVar, Continuation continuation) {
        Object V = x97.V(dm6.b(), new n6p(this, p5dVar, null, 21), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object d(boolean z, u0r u0rVar) {
        return x97.V(dm6.b(), new ze1(this, z, null, 14), u0rVar);
    }

    @Override // defpackage.s5d
    public final long g() {
        return ((Number) ff7.L(new x5u(this, 0))).longValue();
    }

    @Override // defpackage.s5d
    public final r5d getPlayerType() {
        return this.i;
    }

    @Override // defpackage.s5d
    public final long h() {
        return ((Number) ff7.L(new x5u(this, 1))).longValue();
    }

    @Override // defpackage.s5d
    public final Object i(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new z5u(this, null, 3), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object k(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new zts(this, null, 15), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object m(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new z5u(this, null, 8), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object n(Continuation continuation) {
        Object V = x97.V(dm6.b(), new z5u(this, null, 5), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object o(long j, Continuation continuation) {
        Object V = x97.V(dm6.b(), new g84(this, j, null, 3), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object p(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new z5u(this, null, 7), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object q(r0r r0rVar) {
        return t(r0rVar);
    }

    @Override // defpackage.s5d
    public final Object r(Continuation continuation) {
        return x97.V(dm6.b(), new z5u(this, null, 6), continuation);
    }

    @Override // defpackage.s5d
    public final Object t(Continuation continuation) {
        return x97.V(dm6.b(), new z5u(this, null, 0), continuation);
    }

    @Override // defpackage.s5d
    public final Object u(eol eolVar) {
        return new Long(-1L);
    }

    @Override // defpackage.s5d
    public final Object v(n4q n4qVar, v0r v0rVar) {
        Object V = x97.V(dm6.b(), new n6p(this, n4qVar, null, 23), v0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object w(Continuation continuation) {
        return x97.V(dm6.b(), new z5u(this, null, 1), continuation);
    }

    @Override // defpackage.s5d
    public final Object x(r0r r0rVar) {
        return x97.V(dm6.b(), new z5u(this, null, 2), r0rVar);
    }
}
