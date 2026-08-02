package defpackage;

import com.yandex.go.address.search.perf.experiment.SuggestsPerformanceOptimizationExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes.dex */
public final class wbv0 implements q {
    public final /* synthetic */ q a;

    public wbv0(rqo rqoVar) {
        SuggestsPerformanceOptimizationExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(SuggestsPerformanceOptimizationExperiment.e);
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
        return (SuggestsPerformanceOptimizationExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
