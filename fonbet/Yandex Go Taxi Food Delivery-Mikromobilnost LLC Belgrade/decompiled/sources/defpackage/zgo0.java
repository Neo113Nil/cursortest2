package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes6.dex */
public final class zgo0 implements q {
    public final /* synthetic */ q a;

    public zgo0(rqo rqoVar) {
        ygo0.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ygo0.c);
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
        return (ygo0) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
