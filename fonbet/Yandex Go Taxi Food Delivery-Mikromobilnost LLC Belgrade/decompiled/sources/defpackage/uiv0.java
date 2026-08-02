package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment;
import com.yandex.go.external_service.preloader.c;
import com.yandex.go.flex.common.api.actions.SummaryRedirectAction;
import com.yandex.go.flex.common.api.actions.n0;
import com.yandex.go.information.experiemnts.SuperAppConfigInformationExperiment;
import com.yandex.go.settings.experiments.SuperAppConfigAppSettingsExperiment;
import com.yandex.go.settings.experiments.a;
import com.yandex.go.tariffcard.api.experiment.HeaderBackground$$serializer;
import com.yandex.go.tariffcard.api.experiment.HeaderCollapseButtonType;
import com.yandex.go.tariffcard.experiment.HeaderGradientConfigDto$$serializer;
import com.yandex.go.tariffcard.experiment.SummaryOptionsTariffCardExperiment;
import com.yandex.go.tariffcard.experiment.o;
import com.yandex.go.taxi.summary.map.focus.data.SummaryZoomZonesExperiment;
import com.yandex.go.taxi.summary.map.focus.data.e;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;
import ru.yandex.taxi.summary.promotions.models.c1;
import ru.yandex.taxi.summary.promotions.models.g;
import ru.yandex.taxi.summary.promotions.models.l0;
import ru.yandex.taxi.summary.promotions.models.o0;
import ru.yandex.taxi.summary.promotions.models.q;
import ru.yandex.taxi.summary.promotions.models.q0;
import ru.yandex.taxi.summary.promotions.models.v0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final /* synthetic */ class uiv0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ uiv0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                o oVar = SummaryOptionsTariffCardExperiment.Companion;
                return new k8u(auu0.a, HeaderBackground$$serializer.INSTANCE, 1);
            case 1:
                o oVar2 = SummaryOptionsTariffCardExperiment.Companion;
                return new k8u(auu0.a, HeaderBackground$$serializer.INSTANCE, 1);
            case 2:
                o oVar3 = SummaryOptionsTariffCardExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, new k8u(auu0Var, HeaderBackground$$serializer.INSTANCE, 1), 1);
            case 3:
                o oVar4 = SummaryOptionsTariffCardExperiment.Companion;
                return new p53(HeaderGradientConfigDto$$serializer.INSTANCE, 0);
            case 4:
                o oVar5 = SummaryOptionsTariffCardExperiment.Companion;
                return new p53(auu0.a, 0);
            case 5:
                o oVar6 = SummaryOptionsTariffCardExperiment.Companion;
                return jsq0.Companion.serializer(TariffOrderFlow.Companion.serializer());
            case 6:
                o oVar7 = SummaryOptionsTariffCardExperiment.Companion;
                return new p53(auu0.a, 0);
            case 7:
                o oVar8 = SummaryOptionsTariffCardExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 8:
                o oVar9 = SummaryOptionsTariffCardExperiment.Companion;
                return HeaderCollapseButtonType.Companion.serializer();
            case 9:
                o oVar10 = SummaryOptionsTariffCardExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 10:
                o oVar11 = SummaryOptionsTariffCardExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, new k8u(auu0Var4, auu0Var4, 1), 1);
            case 11:
                xkv0 xkv0Var = ykv0.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, new k8u(auu0Var5, new p53(auu0Var5, 0), 1), 1);
            case 12:
                g gVar = SummaryPromotionsParam.a.C0117a.Companion;
                return new p53(auu0.a, 0);
            case 13:
                g gVar2 = SummaryPromotionsParam.a.C0117a.Companion;
                return new p53(auu0.a, 0);
            case 14:
                return vez0.g("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.DisplayOnType", SummaryPromotionsResponse.DisplayOnType.values(), new String[]{"summary", "tariff_card", "order_button", "promoblock"}, new Annotation[][]{null, null, null, null});
            case 15:
                o0 o0Var = SummaryPromotionsResponse.d.Companion;
                return new p53(q.a, 0);
            case 16:
                o0 o0Var2 = SummaryPromotionsResponse.d.Companion;
                return new p53(c1.a, 0);
            case 17:
                q0 q0Var = SummaryPromotionsResponse.e.Companion;
                return new p53(v0.e, 0);
            case 18:
                q0 q0Var2 = SummaryPromotionsResponse.e.Companion;
                return new p53(l0.a, 0);
            case 19:
                n0 n0Var = SummaryRedirectAction.Companion;
                return vez0.g("com.yandex.go.flex.common.api.actions.SummaryRedirectAction.State", SummaryRedirectAction.State.values(), new String[]{"collapsed", "expanded", "anchored"}, new Annotation[][]{null, null, null});
            case 20:
                tpv0 tpv0Var = upv0.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 21:
                e eVar = SummaryZoomZonesExperiment.Companion;
                return new p53(auu0.a, 0);
            case 22:
                a aVar = SuperAppConfigAppSettingsExperiment.Companion;
                return SuperAppConfigAppSettingsExperiment.Type.Companion.serializer();
            case 23:
                return vez0.g("com.yandex.go.settings.experiments.SuperAppConfigAppSettingsExperiment.Type", SuperAppConfigAppSettingsExperiment.Type.values(), new String[]{"V1", "V2"}, new Annotation[][]{null, null});
            case 24:
                c cVar = SuperAppConfigEatsKitStaticExperiment.Companion;
                return SuperAppConfigEatsKitStaticExperiment.Type.Companion.serializer();
            case 25:
                c cVar2 = SuperAppConfigEatsKitStaticExperiment.Companion;
                return SuperAppConfigEatsKitStaticExperiment.BundleStrategy.Companion.serializer();
            case 26:
                return vez0.g("com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment.BundleStrategy", SuperAppConfigEatsKitStaticExperiment.BundleStrategy.values(), new String[]{Constants.NORMAL, "preload", "ignore"}, new Annotation[][]{null, null, null});
            case 27:
                return vez0.g("com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment.Type", SuperAppConfigEatsKitStaticExperiment.Type.values(), new String[]{"none", "lcp"}, new Annotation[][]{null, null});
            case 28:
                com.yandex.go.information.experiemnts.a aVar2 = SuperAppConfigInformationExperiment.Companion;
                return SuperAppConfigInformationExperiment.Type.Companion.serializer();
            default:
                return vez0.g("com.yandex.go.information.experiemnts.SuperAppConfigInformationExperiment.Type", SuperAppConfigInformationExperiment.Type.values(), new String[]{"common", "superlegal"}, new Annotation[][]{null, null});
        }
    }
}
