package defpackage;

import com.yandex.go.summary.experiment.ComposeSummaryExperiment;
import com.yandex.go.tariffcard.experiment.EtaMulticlassHighlightingExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassTariffPromoDescriptionExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsHeaderRedesignExperiment;
import com.yandex.go.taxi.experiments.DisableSwipeVerticalsExperiment;
import com.yandex.go.taxi.experiments.MarketplaceAltDeeplinkExperiment;
import com.yandex.go.taxi.experiments.OverrideInactiveTariffsExperiment;
import com.yandex.go.taxi.experiments.VerticalSelectorSettingsExperiment;
import com.yandex.go.taxi.summary.experiments.NewSummaryExperiment;
import com.yandex.go.taxi.summary.experiments.SummaryPerformanceOptimisationsExperiment;
import com.yandex.go.taxi.summary.experiments.UserLocationToSourcePointWalkRouteExperiment;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.ClarifyPointsOnMapExperiment;
import com.yandex.go.taxi.summary.map.focus.data.SummarySourceAddressFocusExperiment;
import com.yandex.go.taxi.summary.map.focus.data.SummaryZoomZonesExperiment;
import com.yandex.go.taxi.summary.mobilityhub.experiment.HubV2VerticalOnSummaryExperiment;
import com.yandex.go.taxi.summary.mobilityhub.experiment.HubVerticalOnSummaryExperiment;
import com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment;
import com.yandex.go.taxi.summary.models.SummaryVerticalHeaderExperiment;
import com.yandex.go.taxi.summary.shared.experiment.SourceDestinationOnTopExperiment;
import com.yandex.go.taxi.summary.shared.experiment.SummaryIntermediatePointsExperiment;
import com.yandex.go.taxi.summary.shared.models.SmallSummaryConfigExperiment;
import com.yandex.go.taxi.summary.verticalsummary.expriment.VerticalSelectorOnSummaryExperiment;
import com.yandex.go.taxi.ui.selector.model.WideTariffAppearanceExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class qdq implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ qdq(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ComposeSummaryExperiment.Companion.serializer();
            case 1:
                return HubVerticalOnSummaryExperiment.Companion.serializer();
            case 2:
                return SummaryZoomZonesExperiment.Companion.serializer();
            case 3:
                return NewSummaryExperiment.Companion.serializer();
            case 4:
                return UserLocationToSourcePointWalkRouteExperiment.Companion.serializer();
            case 5:
                return SummaryPerformanceOptimisationsExperiment.Companion.serializer();
            case 6:
                return SummarySourceAddressFocusExperiment.Companion.serializer();
            case 7:
                return VerticalSelectorOnSummaryExperiment.Companion.serializer();
            case 8:
                return ClarifyPointsOnMapExperiment.Companion.serializer();
            case 9:
                return HubV2VerticalOnSummaryExperiment.Companion.serializer();
            case 10:
                return z190.Companion.serializer();
            case 11:
                return u851.Companion.serializer();
            case 12:
                return too.Companion.serializer();
            case 13:
                return f0z.Companion.serializer();
            case 14:
                return MarketplaceAltDeeplinkExperiment.Companion.serializer();
            case 15:
                return DisableSwipeVerticalsExperiment.Companion.serializer();
            case 16:
                return VerticalSelectorSettingsExperiment.Companion.serializer();
            case 17:
                return OverrideInactiveTariffsExperiment.Companion.serializer();
            case 18:
                return WideTariffAppearanceExperiment.Companion.serializer();
            case 19:
                return SourceDestinationOnTopExperiment.Companion.serializer();
            case 20:
                return SummaryIntermediatePointsExperiment.Companion.serializer();
            case 21:
                return SmallSummaryConfigExperiment.Companion.serializer();
            case 22:
                return ForceTariffSwitchForIntercityOrdersExperiment.Companion.serializer();
            case 23:
                return SummaryVerticalHeaderExperiment.Companion.serializer();
            case 24:
                return upv0.Companion.serializer();
            case 25:
                return viu.Companion.serializer();
            case 26:
                return na4.Companion.serializer();
            case 27:
                return EtaMulticlassHighlightingExperiment.Companion.serializer();
            case 28:
                return MulticlassTariffsHeaderRedesignExperiment.Companion.serializer();
            default:
                return MulticlassTariffPromoDescriptionExperiment.Companion.serializer();
        }
    }
}
