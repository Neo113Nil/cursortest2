package defpackage;

import com.yandex.go.scooters.passes.data.model.ScootersPassesBduiExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class wco0 implements q {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ q a;

    public wco0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).d(new ScootersPassesBduiExperiment(0));
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
        return (ScootersPassesBduiExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
