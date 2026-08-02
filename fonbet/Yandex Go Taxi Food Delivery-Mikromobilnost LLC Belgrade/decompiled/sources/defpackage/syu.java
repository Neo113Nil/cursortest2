package defpackage;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.l;
import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;
import com.yandex.go.settings.hidephoneinfo.experiments.a;
import com.yandex.go.taxi.order.models.api.status.ImageType;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubDetailsTariffParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPricesParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubScreenRequestParams;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubServiceLevelParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.b0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.d0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.e0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.z;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubAvailableParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$GroupItemsDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenRequestParamsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenResponseV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubServiceLevelParamV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubTollRoadsParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.a1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.c1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.d1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.e1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.x0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$LogoutResponse$LogoutStatus;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseErrorTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final /* synthetic */ class syu implements sls {
    public final /* synthetic */ int a;

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                x0 x0Var = HubItemDtoV2$GroupItemsDto.Companion;
                return new p53(GroupItemDto$$serializer.INSTANCE, 0);
            case 1:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2.Unsupported", a1.INSTANCE, new Annotation[0]);
            case 2:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind", HubLeadingItemKind.values(), new String[]{"payment", "transport"}, new Annotation[][]{null, null});
            case 3:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType", HubOfferType.values(), new String[]{TariffOrderFlow.ORDER_FLOW_TAXI_KEY, "transport", "scooters", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, "pedestrian", "navigator", "multimodal_taxi_transport", "multimodal", "scooter_multimodal", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
            case 4:
                z zVar = HubOnboardingDto.Companion;
                return HubOnboardingType.Companion.serializer();
            case 5:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingType", HubOnboardingType.values(), new String[]{"only_expanded", "full", null}, new Annotation[][]{null, null, null});
            case 6:
                b0 b0Var = HubPricesParam.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 7:
                b0 b0Var2 = HubPricesParam.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 8:
                d0 d0Var = HubScreenRequestParams.Companion;
                return new p53(auu0.a, 0);
            case 9:
                c1 c1Var = HubScreenRequestParamsV2.Companion;
                return new p53(auu0.a, 0);
            case 10:
                c1 c1Var2 = HubScreenRequestParamsV2.Companion;
                return new p53(auu0.a, 1);
            case 11:
                c1 c1Var3 = HubScreenRequestParamsV2.Companion;
                return vez0.g("com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction", MobilityHubSourceAction.values(), new String[]{"opened_from_taxi_vertical"}, new Annotation[][]{null});
            case 12:
                c1 c1Var4 = HubScreenRequestParamsV2.Companion;
                return vez0.g("com.yandex.go.taxi.summary.api.model.MobilityHubSourceType", MobilityHubSourceType.values(), new String[]{"hub", "transport"}, new Annotation[][]{null, null});
            case 13:
                d1 d1Var = HubScreenResponseV2.Companion;
                return new p53(tyu.e, 0);
            case 14:
                e0 e0Var = HubServiceLevelParam.Companion;
                return new p53(HubDetailsTariffParam$$serializer.INSTANCE, 0);
            case 15:
                e1 e1Var = HubServiceLevelParamV2.Companion;
                return new p53(HubDetailsTariffParam$$serializer.INSTANCE, 0);
            case 16:
                f1 f1Var = HubTollRoadsParam.Companion;
                return HubAvailableParam.Companion.serializer();
            case 17:
                return zy11.a;
            case 18:
                kcv kcvVar = mcv.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 19:
                return vez0.g("com.yandex.go.taxi.order.models.api.status.ImageType", ImageType.values(), new String[]{"icon_spot", "photo"}, new Annotation[][]{null, null});
            case 20:
                return vez0.g("com.yandex.go.inapp_calls.experiment.InAppCallExperiment.FullScreenRequestModal.ShowMode", InAppCallExperiment.FullScreenRequestModal.ShowMode.values(), new String[]{"once", "force"}, new Annotation[][]{null, null});
            case 21:
                l lVar = InAppCallExperiment.RememberMyChoice.SettingCardItem.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 22:
                a aVar = InAppOnlySettingsToggleExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 23:
                return new p53(w7f0.a, 0);
            case 24:
                return InMessage$LogoutResponse$LogoutStatus.Companion.serializer();
            case 25:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage.LogoutResponse.LogoutStatus", InMessage$LogoutResponse$LogoutStatus.values(), new String[]{"success", "failed", "canceled"}, new Annotation[][]{null, null, null});
            case 26:
                return PurchaseTypeDto.Companion.serializer();
            case 27:
                return PurchaseStatusTypeDto.Companion.serializer();
            case 28:
                return PurchaseErrorTypeDto.Companion.serializer();
            default:
                return PurchaseTypeDto.Companion.serializer();
        }
    }

    public /* synthetic */ syu(int i) {
        this.a = i;
    }
}
