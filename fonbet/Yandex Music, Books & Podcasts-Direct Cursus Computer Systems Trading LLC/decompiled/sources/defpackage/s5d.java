package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public interface s5d {
    Object a(h4q h4qVar, v0r v0rVar);

    Object b(r0r r0rVar);

    Object c(p5d p5dVar, Continuation continuation);

    Object d(boolean z, u0r u0rVar);

    default Object e(u0r u0rVar) {
        return Unit.a;
    }

    default Object f(nej nejVar, qgl qglVar) {
        return Unit.a;
    }

    long g();

    r5d getPlayerType();

    long h();

    Object i(r0r r0rVar);

    default i6q j() {
        return new nej(0);
    }

    Object k(r0r r0rVar);

    default Object l(u0r u0rVar) {
        return Unit.a;
    }

    Object m(r0r r0rVar);

    Object n(Continuation continuation);

    Object o(long j, Continuation continuation);

    Object p(r0r r0rVar);

    Object q(r0r r0rVar);

    Object r(Continuation continuation);

    default Object s(r0r r0rVar) {
        return Unit.a;
    }

    Object t(Continuation continuation);

    Object u(eol eolVar);

    Object v(n4q n4qVar, v0r v0rVar);

    Object w(Continuation continuation);

    Object x(r0r r0rVar);
}
