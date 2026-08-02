package defpackage;

import com.yandex.go.chargers.experiment.ChargersUsePointAExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes12.dex */
public final class rya implements q {
    public final /* synthetic */ q a;

    public rya(rqo rqoVar) {
        ChargersUsePointAExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ChargersUsePointAExperiment.c);
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
        return (ChargersUsePointAExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
