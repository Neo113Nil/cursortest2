package defpackage;

import com.yandex.go.environment.SwitchNetworkEnvironmentExperiment;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppConfigMenuExperiment;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppMainScreenLogoImageExperiment;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.transport.SuperAppDiscoveryMapTransportExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.go.superapp.discovery.map.scooters.impl.experiments.SuperAppDiscoveryMapScootersExperiment;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment;
import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment;
import com.yandex.go.tappable_poi.experiments.TappablePoiExperiment;
import com.yandex.go.tariffcard.experiment.DisableOldVerticalModeExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassCashbackShowExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsUnavailableTextsExperiment;
import com.yandex.go.tariffcard.experiment.RequirementsScrollButtonExperiment;
import com.yandex.go.tariffcard.experiment.SummaryOptionsTariffCardExperiment;
import com.yandex.go.tariffcard.experiment.TariffRedirectAnimationExperiment;
import com.yandex.go.user_session.data.model.SuperappSessionTtlSettingsExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class tfq implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ tfq(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return TariffRedirectAnimationExperiment.Companion.serializer();
            case 1:
                return MulticlassCashbackShowExperiment.Companion.serializer();
            case 2:
                return DisableOldVerticalModeExperiment.Companion.serializer();
            case 3:
                return RequirementsScrollButtonExperiment.Companion.serializer();
            case 4:
                return MulticlassTariffsUnavailableTextsExperiment.Companion.serializer();
            case 5:
                return ziu.Companion.serializer();
            case 6:
                return SummaryOptionsTariffCardExperiment.Companion.serializer();
            case 7:
                return kiv0.Companion.serializer();
            case 8:
                return w5d0.Companion.serializer();
            case 9:
                return k5w0.Companion.serializer();
            case 10:
                return SuperAppDiscoveryMapV2Experiment.Companion.serializer();
            case 11:
                return SuperAppDiscoveryMapTransportExperiment.Companion.serializer();
            case 12:
                return SuperAppDiscoveryMapExperiment.Companion.serializer();
            case 13:
                return SuperAppDiscoveryMapScootersExperiment.Companion.serializer();
            case 14:
                return cyw0.Companion.serializer();
            case 15:
                return sdn.Companion.serializer();
            case 16:
                return t1p.Companion.serializer();
            case 17:
                return SuperAppConfigMenuExperiment.Companion.serializer();
            case 18:
                return SuperAppMainScreenLogoImageExperiment.Companion.serializer();
            case 19:
                return CurrentAddressModalExperiment.Companion.serializer();
            case 20:
                return SuperAppFallbackBehaviourExperiment.Companion.serializer();
            case 21:
                return SuperAppOrderTrackingExperiment.Companion.serializer();
            case 22:
                return SuperappTrackingCardExperiment.Companion.serializer();
            case 23:
                return SuperappSearchbarExperiment.Companion.serializer();
            case 24:
                return SuperappSessionTtlSettingsExperiment.Companion.serializer();
            case 25:
                return p02.Companion.serializer();
            case 26:
                return gww0.Companion.serializer();
            case 27:
                return SwitchNetworkEnvironmentExperiment.Companion.serializer();
            case 28:
                return TappablePoiExperiment.Companion.serializer();
            default:
                return TappablePoiCardExperiment.Companion.serializer();
        }
    }
}
