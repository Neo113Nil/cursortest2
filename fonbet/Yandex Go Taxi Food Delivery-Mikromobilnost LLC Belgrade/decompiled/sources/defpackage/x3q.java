package defpackage;

import com.yandex.go.payments_widgets.yandex_bank.PaymentMethodsHideBalanceExperiment;
import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import com.yandex.go.places.complaint.experiment.ComplaintExperiment;
import com.yandex.go.places.experiments.flex.PlacesClientFlexScreensExperimentDto;
import com.yandex.go.places.experiments.gallery.DiscoveryOrganizationGalleryExperiment;
import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;
import com.yandex.go.places.experiments.map.map_as_main_places.MapAsMainPlacesExperiment;
import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;
import com.yandex.go.places.experiments.map.social_pin.PlacesSocialPinDimensionsExperiment;
import com.yandex.go.places.experiments.tabbar.DiscoveryTabbarExperiment;
import com.yandex.go.places.experiments.walkroute.OrganizationWalkingRouteExperiment;
import com.yandex.go.places.searchbar.impl.experiments.PlacesSearchbarExperiment;
import com.yandex.go.plus.experiment.CashbackExperiment;
import com.yandex.go.plus.experiment.PlusModeExperiment;
import com.yandex.go.profile.config.SuperAppConfigProfileExperiment;
import com.yandex.go.promocodes.base.impl.promo_codes.data.experiments.PromoCodeListRequestServicesExperiment;
import com.yandex.go.promocodes.experiment.BenefitsCenterExperiment;
import com.yandex.go.promocodes.referral.impl.net.experiments.ReferralGiftButtonExperiment;
import com.yandex.go.proxyprovision.GeProxyProvisionExperiment;
import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;
import ru.yandex.taxi.persuggest.experiments.SuggestHeuristicsExperiment;
import ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class x3q implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ x3q(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return PaymentMethodsHideBalanceExperiment.Companion.serializer();
            case 1:
                return fep0.Companion.serializer();
            case 2:
                return SuggestHeuristicsExperiment.Companion.serializer();
            case 3:
                return nlt.Companion.serializer();
            case 4:
                return aer.Companion.serializer();
            case 5:
                return qm21.Companion.serializer();
            case 6:
                return PickupPhotoRecognitionExperiment.Companion.serializer();
            case 7:
                return ClarifyPointsScreenStrategyConfigurationExperiment.Companion.serializer();
            case 8:
                return rtb0.Companion.serializer();
            case 9:
                return ComplaintExperiment.Companion.serializer();
            case 10:
                return PlacesClientFlexScreensExperimentDto.Companion.serializer();
            case 11:
                return DiscoveryTabbarExperiment.Companion.serializer();
            case 12:
                return PlacesMapScreenExperiment.Companion.serializer();
            case 13:
                return OrganizationWalkingRouteExperiment.Companion.serializer();
            case 14:
                return PlacesSocialPinDimensionsExperiment.Companion.serializer();
            case 15:
                return PlacesPinWarV2Experiment.Companion.serializer();
            case 16:
                return DiscoveryOrganizationGalleryExperiment.Companion.serializer();
            case 17:
                return MapAsMainPlacesExperiment.Companion.serializer();
            case 18:
                return PlacesSearchbarExperiment.Companion.serializer();
            case 19:
                return PlusSdkWidgetExperiment.Companion.serializer();
            case 20:
                return PlusModeExperiment.Companion.serializer();
            case 21:
                return CashbackExperiment.Companion.serializer();
            case 22:
                return azi.Companion.serializer();
            case 23:
                return SuperAppConfigProfileExperiment.Companion.serializer();
            case 24:
                return PromoCodeListRequestServicesExperiment.Companion.serializer();
            case 25:
                return BenefitsCenterExperiment.Companion.serializer();
            case 26:
                return ReferralGiftButtonExperiment.Companion.serializer();
            case 27:
                return GeProxyProvisionExperiment.Companion.serializer();
            case 28:
                return fmx0.Companion.serializer();
            default:
                return TariffCardPreorderCellCustomizationExperiment.Companion.serializer();
        }
    }
}
