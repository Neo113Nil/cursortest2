package defpackage;

import com.yandex.go.business.impl.experiment.YangoBusinessExperiment;
import com.yandex.go.call_order_fallback.experiments.CallOrderFallbackExperiment;
import com.yandex.go.chargers.data.model.ChargersExperiment;
import com.yandex.go.chargers.data.model.ChargersSupportedHostsExperiment;
import com.yandex.go.chargers.experiment.ChargersUsePointAExperiment;
import com.yandex.go.chargers.offer.experiments.ChargersDiscountsEntryPointExperiment;
import com.yandex.go.chargers.offer.experiments.ChargersOfferComposeExperiment;
import com.yandex.go.chargers.plus.api.ChargersPlusPlaqueExperiment;
import com.yandex.go.chargers.promotion.data.ChargersPromotionInScootersExperiment;
import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import com.yandex.go.chargers.qr.experiment.ChargersManualEnterExperiment;
import com.yandex.go.clarify_address.ClarifiedAddressCacheTimeExperiment;
import com.yandex.go.clarify_address.ClarifyAddressBeforeOrderExperiment;
import com.yandex.go.copter.experiment.CopterInfoExperiment;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.point_selection_settings.PointSelectionScreenSettingsExperiment;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class spp implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ spp(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return or6.Companion.serializer();
            case 1:
                return cy6.Companion.serializer();
            case 2:
                return YangoBusinessExperiment.Companion.serializer();
            case 3:
                return CallOrderFallbackExperiment.Companion.serializer();
            case 4:
                return CarPlateAppearanceExperiment.Companion.serializer();
            case 5:
                return e78.Companion.serializer();
            case 6:
                return ChargersSupportedHostsExperiment.Companion.serializer();
            case 7:
                return ChargersUsePointAExperiment.Companion.serializer();
            case 8:
                return ChargersExperiment.Companion.serializer();
            case 9:
                return ChargersOfferComposeExperiment.Companion.serializer();
            case 10:
                return ChargersDiscountsEntryPointExperiment.Companion.serializer();
            case 11:
                return ChargersPlusPlaqueExperiment.Companion.serializer();
            case 12:
                return ChargersPromotionInScootersExperiment.Companion.serializer();
            case 13:
                return ChargersLowBatteryPushExperiment.Companion.serializer();
            case 14:
                return ChargersManualEnterExperiment.Companion.serializer();
            case 15:
                return ClarifiedAddressCacheTimeExperiment.Companion.serializer();
            case 16:
                return ClarifyAddressBeforeOrderExperiment.Companion.serializer();
            case 17:
                return yyb.Companion.serializer();
            case 18:
                return tos0.Companion.serializer();
            case 19:
                return mkv.Companion.serializer();
            case 20:
                return msf0.Companion.serializer();
            case 21:
                return liv.Companion.serializer();
            case 22:
                return olf0.Companion.serializer();
            case 23:
                return pnf0.Companion.serializer();
            case 24:
                return nbe.Companion.serializer();
            case 25:
                return CopterOrderFlowExperiment.Companion.serializer();
            case 26:
                return CopterInfoExperiment.Companion.serializer();
            case 27:
                return agf.Companion.serializer();
            case 28:
                return ggf.Companion.serializer();
            default:
                return PointSelectionScreenSettingsExperiment.Companion.serializer();
        }
    }
}
