package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class u1o0 implements q {
    public final /* synthetic */ q a;

    public u1o0(rqo rqoVar) {
        n1o0.Companion.getClass();
        this.a = ((jbh) rqoVar).d(n1o0.h);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (n1o0) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
