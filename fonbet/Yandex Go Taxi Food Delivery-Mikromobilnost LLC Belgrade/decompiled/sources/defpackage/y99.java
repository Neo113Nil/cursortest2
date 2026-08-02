package defpackage;

import com.yandex.go.benefits_center.benefits.sdk.actions.ClaimBenefitAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.d;
import com.yandex.go.chargers.data.model.ChargersExperiment;
import com.yandex.go.chargers.data.model.ChargersSupportedHostsExperiment;
import com.yandex.go.chargers.data.model.p;
import com.yandex.go.chargers.data.model.v;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderDto$$serializer;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrdersResponse;
import com.yandex.go.chargers.order.data.model.j0;
import com.yandex.go.chargers.plus.api.ChargersPlusPlaqueExperiment;
import com.yandex.go.chargers.promotion.data.ChargersPromotionInScootersExperiment;
import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import com.yandex.go.chargers.push.data.b;
import com.yandex.go.clarify_address.ClarifyAddressBeforeOrderExperiment;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings;
import com.yandex.go.pickuppoints.impl.e;
import com.yandex.go.pickuppoints.impl.f;
import com.yandex.go.pickuppoints.impl.g;
import com.yandex.go.pickuppoints.impl.j;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment$ChangeConfirmationScreens$$serializer;
import com.yandex.go.taxi.order.change.source.experiment.c;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.ClarifyPointsOnMapExperiment;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.PointsVisiblePriorityDto;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.TariffOverride$$serializer;
import com.yandex.go.yb.experiments.ChangeToYbWalletExperiment;
import com.yandex.go.yb.experiments.a;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class y99 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ y99(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new o4o("com.yandex.go.flex.main_screen.presentation.actions.ChangeCurrentAddressAction", aa9.INSTANCE, new Annotation[0]);
            case 1:
                c cVar = ChangeSourcePointExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 2:
                c cVar2 = ChangeSourcePointExperiment.Companion;
                return new p53(ChangeSourcePointExperiment$ChangeConfirmationScreens$$serializer.INSTANCE, 0);
            case 3:
                a aVar = ChangeToYbWalletExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 4:
                a aVar2 = ChangeToYbWalletExperiment.Companion;
                return new p53(qke.n(auu0.a), 0);
            case 5:
                j0 j0Var = ChargersActiveOrdersResponse.Companion;
                return new p53(ChargersActiveOrderDto$$serializer.INSTANCE, 0);
            case 6:
                p pVar = ChargersExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 7:
                b bVar = ChargersLowBatteryPushExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 8:
                com.yandex.go.chargers.plus.api.a aVar3 = ChargersPlusPlaqueExperiment.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 9:
                com.yandex.go.chargers.promotion.data.b bVar2 = ChargersPromotionInScootersExperiment.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 10:
                com.yandex.go.chargers.promotion.data.b bVar3 = ChargersPromotionInScootersExperiment.Companion;
                return new p53(auu0.a, 0);
            case 11:
                v vVar = ChargersSupportedHostsExperiment.Companion;
                return new p53(auu0.a, 1);
            case 12:
                d dVar = ClaimBenefitAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 13:
                com.yandex.go.clarify_address.d dVar2 = ClarifyAddressBeforeOrderExperiment.Companion;
                return new p53(auu0.a, 0);
            case 14:
                com.yandex.go.clarify_address.d dVar3 = ClarifyAddressBeforeOrderExperiment.Companion;
                auu0 auu0Var7 = auu0.a;
                return new k8u(auu0Var7, auu0Var7, 1);
            case 15:
                com.yandex.go.clarify_address.d dVar4 = ClarifyAddressBeforeOrderExperiment.Companion;
                return new p53(auu0.a, 0);
            case 16:
                xyb xybVar = yyb.Companion;
                return new p53(auu0.a, 0);
            case 17:
                com.yandex.go.taxi.summary.map.clarify_source_point.experiments.a aVar4 = ClarifyPointsOnMapExperiment.Companion;
                auu0 auu0Var8 = auu0.a;
                return new k8u(auu0Var8, auu0Var8, 1);
            case 18:
                com.yandex.go.taxi.summary.map.clarify_source_point.experiments.a aVar5 = ClarifyPointsOnMapExperiment.Companion;
                return PointsVisiblePriorityDto.Companion.serializer();
            case 19:
                com.yandex.go.taxi.summary.map.clarify_source_point.experiments.a aVar6 = ClarifyPointsOnMapExperiment.Companion;
                return new p53(auu0.a, 0);
            case 20:
                com.yandex.go.taxi.summary.map.clarify_source_point.experiments.a aVar7 = ClarifyPointsOnMapExperiment.Companion;
                return new p53(TariffOverride$$serializer.INSTANCE, 0);
            case 21:
                com.yandex.go.pickuppoints.impl.a aVar8 = ClarifyPointsScreenStrategyConfigurationExperiment.Companion;
                return new p53(izb.e, 0);
            case 22:
                return vez0.g("com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType", ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.values(), new String[]{"select_on_map", "select_by_text_suggest", "open_copter_city_tours_selector"}, new Annotation[][]{null, null, null});
            case 23:
                e eVar = ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings.Companion;
                return new p53(auu0.a, 0);
            case 24:
                f fVar = ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings.Companion;
                return new p53(auu0.a, 0);
            case 25:
                return new o4o("com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment.SettingsDto.UnknownType", g.INSTANCE, new Annotation[0]);
            case 26:
                j jVar = ClarifyPointsScreenStrategyConfigurationExperiment.SummaryInnerConfigurationDto.Companion;
                return ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.Companion.serializer();
            case 27:
                j jVar2 = ClarifyPointsScreenStrategyConfigurationExperiment.SummaryInnerConfigurationDto.Companion;
                return ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.Companion.serializer();
            case 28:
                j jVar3 = ClarifyPointsScreenStrategyConfigurationExperiment.SummaryInnerConfigurationDto.Companion;
                return ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.Companion.serializer();
            default:
                return dgc.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
        }
    }
}
