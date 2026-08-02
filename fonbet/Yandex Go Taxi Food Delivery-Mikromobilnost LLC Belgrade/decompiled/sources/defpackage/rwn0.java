package defpackage;

import com.yandex.go.scooters.live.data.model.ScootersLiveActivityExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes8.dex */
public final class rwn0 implements q {
    public final /* synthetic */ q a;

    public rwn0(rqo rqoVar) {
        ScootersLiveActivityExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersLiveActivityExperiment.c);
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
        return (ScootersLiveActivityExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
