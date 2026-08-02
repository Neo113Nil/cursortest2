package defpackage;

import com.yandex.go.xiva.experiments.XivaEnabledExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes8.dex */
public final class yd51 implements t1b0 {
    public final /* synthetic */ q a;

    public yd51(rqo rqoVar) {
        XivaEnabledExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(XivaEnabledExperiment.c);
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
        return (XivaEnabledExperiment) this.a.c();
    }
}
