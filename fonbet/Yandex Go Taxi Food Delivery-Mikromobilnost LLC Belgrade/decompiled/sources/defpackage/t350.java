package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes8.dex */
public final class t350 implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public t350(rqo rqoVar) {
        this.a = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.ENABLE_NATIVE_MESSENGER);
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
        return (Boolean) this.a.c();
    }
}
