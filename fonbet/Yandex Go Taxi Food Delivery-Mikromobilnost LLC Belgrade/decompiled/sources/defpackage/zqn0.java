package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.go.scooters.data.model.ScootersLegalTermsExperiment;
import com.yandex.go.scooters.data.model.ScootersLegalTermsExperiment$LegalTerms$$serializer;
import com.yandex.go.scooters.data.model.t;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.ignition.data.model.m;
import com.yandex.go.scooters.ignition.data.model.r;
import com.yandex.go.scooters.mosru.data.model.ScootersMosRuIntegrationExperiment;
import com.yandex.go.scooters.mosru.data.model.a;
import com.yandex.go.scooters.mosru.data.model.c;
import com.yandex.go.scooters.mosru.data.model.d;
import com.yandex.go.scooters.parking.data.model.ScootersParkingDescriptionExperiment;
import com.yandex.go.scooters.parking.data.model.ScootersParkingDescriptionExperiment$Content$Item$$serializer;
import com.yandex.go.scooters.parking.data.model.b;
import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolExperiment;
import com.yandex.go.scooters.promocodes.data.ScootersPromocodesPromoLinksExperiment;
import com.yandex.go.scooters.promocodes.data.ScootersPromocodesPromoLinksExperiment$PromoLinkItem$$serializer;
import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import defpackage.jso0;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;
import ru.yandex.taxi.scooters.experiments.l0;
import ru.yandex.taxi.scooters.experiments.m0;
import ru.yandex.taxi.scooters.experiments.o0;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersOnboardingOnActiveRideExperiment;

/* loaded from: classes8.dex */
public final /* synthetic */ class zqn0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ zqn0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m mVar = ScootersIgnitionExperiment.Ui.OnboardingScreen.Companion;
                return new p53(auu0.a, 0);
            case 1:
                r rVar = ScootersIgnitionExperiment.Ui.RegularScreen.Companion;
                return new p53(auu0.a, 0);
            case 2:
                t tVar = ScootersLegalTermsExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 3:
                t tVar2 = ScootersLegalTermsExperiment.Companion;
                return new p53(ScootersLegalTermsExperiment$LegalTerms$$serializer.INSTANCE, 0);
            case 4:
                a aVar = ScootersMosRuIntegrationExperiment.Companion;
                return jsq0.Companion.serializer(ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.Companion.serializer());
            case 5:
                return vez0.g("com.yandex.go.scooters.mosru.data.model.ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen", ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.values(), new String[]{"on_discovery", "on_offer", "on_finish"}, new Annotation[][]{null, null, null});
            case 6:
                c cVar = ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.Companion;
                return new p53(h6w.a, 0);
            case 7:
                d dVar = ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.ShowModal.Companion;
                return new p53(h6w.a, 0);
            case 8:
                d dVar2 = ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.ShowModal.Companion;
                return new p53(h6w.a, 0);
            case 9:
                d dVar3 = ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.ShowModal.Companion;
                return new p53(h6w.a, 0);
            case 10:
                i0o0 i0o0Var = ScootersMultiOrderExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 11:
                o0 o0Var = ScootersMultiOrderExperiment.Camera.ScooterPreview.Companion;
                return new p53(l0.a, 0);
            case 12:
                m0 m0Var = ScootersMultiOrderExperiment.Camera.ScooterPreview.a.Companion;
                return ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.Companion.serializer();
            case 13:
                return vez0.g("ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType", ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.values(), new String[]{"add", FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE}, new Annotation[][]{null, null});
            case 14:
                k1o0 k1o0Var = n1o0.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 15:
                j5o0 j5o0Var = ScootersOnboardingOnActiveRideExperiment.Companion;
                return jsq0.Companion.serializer(ScootersOnboardingOnActiveRideExperiment.Status.Companion.serializer());
            case 16:
                j5o0 j5o0Var2 = ScootersOnboardingOnActiveRideExperiment.Companion;
                return new p53(ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.a.a, 0);
            case 17:
                return vez0.g("ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersOnboardingOnActiveRideExperiment.Status", ScootersOnboardingOnActiveRideExperiment.Status.values(), new String[]{"reservation", "riding", "parking"}, new Annotation[][]{null, null, null});
            case 18:
                com.yandex.go.scooters.parking.data.model.a aVar2 = ScootersParkingDescriptionExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 19:
                b bVar = ScootersParkingDescriptionExperiment.Content.Companion;
                return new p53(ScootersParkingDescriptionExperiment$Content$Item$$serializer.INSTANCE, 0);
            case 20:
                com.yandex.go.scooters.photocontrol.data.model.a aVar3 = ScootersPhotocontrolExperiment.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 21:
                com.yandex.go.scooters.promocodes.data.a aVar4 = ScootersPromocodesPromoLinksExperiment.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 22:
                com.yandex.go.scooters.promocodes.data.a aVar5 = ScootersPromocodesPromoLinksExperiment.Companion;
                return new p53(ScootersPromocodesPromoLinksExperiment$PromoLinkItem$$serializer.INSTANCE, 0);
            case 23:
                com.yandex.go.scooters.qr.unavailable_scooter.data.model.b bVar2 = ScootersQrUnavailableScooterExperiment.Companion;
                auu0 auu0Var7 = auu0.a;
                return new k8u(auu0Var7, auu0Var7, 1);
            case 24:
                com.yandex.go.scooters.qr.unavailable_scooter.data.model.b bVar3 = ScootersQrUnavailableScooterExperiment.Companion;
                return new p53(auu0.a, 0);
            case 25:
                com.yandex.go.scooters.qr.unavailable_scooter.data.model.a aVar6 = ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall.Companion;
                return new p53(auu0.a, 0);
            case 26:
                iso0 iso0Var = jso0.a.Companion;
                return new p53(kso0.a, 0);
            case 27:
                wso0 wso0Var = zso0.Companion;
                auu0 auu0Var8 = auu0.a;
                return new k8u(auu0Var8, auu0Var8, 1);
            case 28:
                eto0 eto0Var = hto0.Companion;
                auu0 auu0Var9 = auu0.a;
                return new k8u(auu0Var9, auu0Var9, 1);
            default:
                gvo0 gvo0Var = fvo0.Companion;
                auu0 auu0Var10 = auu0.a;
                return new k8u(auu0Var10, auu0Var10, 1);
        }
    }
}
