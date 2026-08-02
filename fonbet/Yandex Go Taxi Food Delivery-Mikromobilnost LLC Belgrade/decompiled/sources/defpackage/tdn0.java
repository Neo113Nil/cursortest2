package defpackage;

import com.yandex.go.scooters.deposit.experiments.model.ScootersDepositCommunicationExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class tdn0 implements q {
    public final /* synthetic */ q a;

    public tdn0(rqo rqoVar) {
        ScootersDepositCommunicationExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersDepositCommunicationExperiment.g);
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
        return (ScootersDepositCommunicationExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
