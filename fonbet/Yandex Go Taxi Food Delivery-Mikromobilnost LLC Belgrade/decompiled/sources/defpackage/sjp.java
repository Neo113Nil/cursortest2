package defpackage;

import com.yandex.go.payments.paymentlist.experiments.YbWalletTopUpRuleExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsHeaderRedesignExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes14.dex */
public final class sjp implements t1b0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1b0 b;

    public sjp(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                MulticlassTariffsHeaderRedesignExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).e(MulticlassTariffsHeaderRedesignExperiment.f);
                break;
            case 2:
                YbWalletTopUpRuleExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).e(YbWalletTopUpRuleExperiment.e);
                break;
            default:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.FAVORITE_USERPLACES_LIST_V2);
                break;
        }
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        switch (this.a) {
        }
        return this.b.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        switch (this.a) {
            case 0:
                return (Boolean) this.b.c();
            case 1:
                return (MulticlassTariffsHeaderRedesignExperiment) this.b.c();
            default:
                return (YbWalletTopUpRuleExperiment) this.b.c();
        }
    }
}
