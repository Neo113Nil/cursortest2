package defpackage;

import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import com.yandex.go.experiment.b;
import com.yandex.go.external_service.preloader.data.models.Manifest;
import com.yandex.go.flex.common.api.actions.MarketPlaceAction;
import com.yandex.go.flex.common.api.actions.y;
import com.yandex.go.lottery.experiment.LotteryMenuItemExperiment;
import com.yandex.go.lottery.experiment.a;
import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment$InformationBanner$$serializer;
import com.yandex.go.payments.paymentlist.experiments.j;
import com.yandex.go.proxyprovision.api.MapKitDefaultHost;
import com.yandex.go.route.experiment.MapRouteAppearanceExperiment;
import com.yandex.go.route.experiment.MapRouteAppearanceExperiment$TariffData$$serializer;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Animation;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$BezierRoute;
import com.yandex.go.taxi.order.models.api.route.e;
import com.yandex.go.taxi.order.models.api.route.f;
import com.yandex.go.user_profile.settings.profile.data.LogoutAvailabilityForServiceOrdersExperiment;
import com.yandex.go.user_profile.settings.profile.data.LogoutAvailabilityForServiceOrdersExperiment$ServiceParameters$$serializer;
import com.yandex.go.user_profile.settings.profile.data.c;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.lang.annotation.Annotation;
import kotlin.text.Regex;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.map_common.style.source.model.Theme;
import ru.yandex.taxi.persuggest.api.LocationProvider;
import ru.yandex.taxi.persuggest.api.MainScreenVersion;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public final /* synthetic */ class t5z implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ t5z(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new Regex("\\p{Alpha}{2,8}");
            case 1:
                return vez0.g("ru.yandex.taxi.persuggest.api.LocationProvider", LocationProvider.values(), new String[]{"gps", "lbs", "mapkit", "platform_lbs", GplLibraryWrapper.FUSED_PROVIDER, "zero_km", "none", "ridetech_location_sdk"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 2:
                b bVar = LocationSdkAndroidGoExperiment.GoConfig.Companion;
                return new p53(auu0.a, 1);
            case 3:
                return new vdz();
            case 4:
                return new dgz();
            case 5:
                c cVar = LogoutAvailabilityForServiceOrdersExperiment.Companion;
                return new k8u(auu0.a, LogoutAvailabilityForServiceOrdersExperiment$ServiceParameters$$serializer.INSTANCE, 1);
            case 6:
                a aVar = LotteryMenuItemExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 7:
                j jVar = MainMenuPaymentMethodsSelectorExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 8:
                j jVar2 = MainMenuPaymentMethodsSelectorExperiment.Companion;
                return new p53(MainMenuPaymentMethodsSelectorExperiment$InformationBanner$$serializer.INSTANCE, 0);
            case 9:
                return vez0.g("ru.yandex.taxi.persuggest.api.MainScreenVersion", MainScreenVersion.values(), new String[]{"shortcuts", "superapp_main", "flex_main"}, new Annotation[][]{null, null, null});
            case 10:
                return vez0.g("com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage", MainSidePagerSidePage.values(), new String[]{"none", "wallet"}, new Annotation[][]{null, null});
            case 11:
                com.yandex.go.external_service.preloader.data.models.a aVar2 = Manifest.Companion;
                return new p53(auu0.a, 0);
            case 12:
                com.yandex.go.external_service.preloader.data.models.a aVar3 = Manifest.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 13:
                return vez0.g("com.yandex.go.proxyprovision.api.MapKitDefaultHost", MapKitDefaultHost.values(), new String[]{"yandex_net", "yandex_com_net", "yango_com", "eu_yango_tech", "yango_tech"}, new Annotation[][]{null, null, null, null, null});
            case 14:
                tk00 tk00Var = uk00.Companion;
                return new p53(pk00.a, 0);
            case 15:
                yk00 yk00Var = zk00.Companion;
                return new p53(auu0.a, 0);
            case 16:
                yk00 yk00Var2 = zk00.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, new k8u(auu0Var4, new p53(auu0Var4, 0), 1), 1);
            case 17:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.MapObjectType", MapObjectType.values(), new String[]{"pickuppoint", "stop", "userplace", "eda", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, "restaurant", "promo", "scooter", "scooters_parking", "scooters_area_label", "charger", "contact", "shuttle_route", "intercity_destination", "group", "city", "city_group", "advert", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 18:
                com.yandex.go.taxi.order.models.api.route.a aVar4 = MapRouteAppearance$Animation.Companion;
                return MapRouteAppearance$AnimationType.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.taxi.order.models.api.route.MapRouteAppearance.AnimationType", MapRouteAppearance$AnimationType.values(), new String[]{"easy_both", null}, new Annotation[][]{null, null});
            case 20:
                com.yandex.go.taxi.order.models.api.route.b bVar2 = MapRouteAppearance$BezierRoute.Companion;
                return new p53(new eni0(qoi0.a(Float.class), nor.a), 0);
            case 21:
                return new o4o("com.yandex.go.taxi.order.models.api.route.MapRouteAppearance.Unsupported", e.INSTANCE, new Annotation[0]);
            case 22:
                return new o4o("com.yandex.go.taxi.order.models.api.route.MapRouteAppearance.WalkRoute", f.INSTANCE, new Annotation[0]);
            case 23:
                com.yandex.go.route.experiment.a aVar5 = MapRouteAppearanceExperiment.Companion;
                return new p53(MapRouteAppearanceExperiment$TariffData$$serializer.INSTANCE, 0);
            case 24:
                com.yandex.go.route.experiment.b bVar3 = MapRouteAppearanceExperiment.TariffData.Companion;
                return new p53(auu0.a, 0);
            case 25:
                com.yandex.go.route.experiment.b bVar4 = MapRouteAppearanceExperiment.TariffData.Companion;
                return new p53(auu0.a, 0);
            case 26:
                gs00 gs00Var = hs00.Companion;
                return Theme.Companion.serializer();
            case 27:
                ns00 ns00Var = os00.Companion;
                return new p53(mdx.a, 0);
            case 28:
                y yVar = MarketPlaceAction.Companion;
                return vez0.g("com.yandex.go.flex.common.api.actions.MarketPlaceAction.MarketplaceTargetScreen", MarketPlaceAction.MarketplaceTargetScreen.values(), new String[]{"buy", "sell"}, new Annotation[][]{null, null});
            default:
                j110 j110Var = k110.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
        }
    }
}
