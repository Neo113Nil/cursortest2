package defpackage;

import com.yandex.go.order.ui.presentation.routing.CopyCarNumberByTapExperiment;
import com.yandex.go.safety.center.experiment.SafetyCenterOrderButtonExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassTariffPromoDescriptionExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchProgressExperiment;
import com.yandex.go.taxi.order.recalculation.experiment.PriceRecalculationExperiment;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes6.dex */
public final /* synthetic */ class xn3 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rqo b;

    public /* synthetic */ xn3(rqo rqoVar, int i) {
        this.a = i;
        this.b = rqoVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Float f;
        int i = this.a;
        rqo rqoVar = this.b;
        switch (i) {
            case 0:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.AUTHORIZATION_URL_INTERCEPTION);
            case 1:
                return ((jbh) rqoVar).c(CopyCarNumberByTapExperiment.e);
            case 2:
                return ((jbh) rqoVar).e(xs8.c);
            case 3:
                return ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.DELIVERY_PUSH_REPLACING);
            case 4:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.EBOKS_PERF);
            case 5:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.INITIAL_KEYBOARD_HIDING_IN_SUGGESTS);
            case 6:
                MulticlassTariffPromoDescriptionExperiment.Companion.getClass();
                return ((jbh) rqoVar).c(MulticlassTariffPromoDescriptionExperiment.f);
            case 7:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.MULTICLASS_TARIFF_CARD_ETA);
            case 8:
                z190.Companion.getClass();
                return ((jbh) rqoVar).b(new z190(0));
            case 9:
                return ((jbh) rqoVar).c(PriceRecalculationExperiment.h);
            case 10:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.RESET_SUGGEST_GEOCODER);
            case 11:
                SafetyCenterOrderButtonExperiment.Companion.getClass();
                return ((jbh) rqoVar).d(SafetyCenterOrderButtonExperiment.i);
            case 12:
                SearchProgressExperiment.Companion.getClass();
                return ((jbh) rqoVar).c(SearchProgressExperiment.e);
            case 13:
                tos0.Companion.getClass();
                return ((jbh) rqoVar).c(tos0.f);
            case 14:
                cyw0.Companion.getClass();
                cyw0 cyw0Var = (cyw0) ((jbh) rqoVar).c(cyw0.d).b();
                MapBuilder mapBuilder = new MapBuilder();
                for (fyw0 fyw0Var : cyw0Var.b) {
                    String str = fyw0Var.a;
                    if (str != null && (f = fyw0Var.b) != null) {
                        mapBuilder.put(str, f);
                    }
                }
                return mapBuilder.j();
            default:
                ms21.Companion.getClass();
                return ((jbh) rqoVar).d(ms21.d);
        }
    }
}
