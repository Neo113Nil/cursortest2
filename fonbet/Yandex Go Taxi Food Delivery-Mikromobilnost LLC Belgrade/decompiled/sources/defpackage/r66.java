package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.blur.experiments.BlurConfigurationExperiment;
import com.yandex.go.blur.experiments.e;
import com.yandex.go.flex.common.api.actions.d;
import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import com.yandex.go.payments.data.model.response.CardProfile;
import com.yandex.go.payments.data.model.response.v;
import com.yandex.go.payments.paymentlist.experiments.CardNetwork;
import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import com.yandex.go.payments.shared.business.l0;
import com.yandex.go.payments.shared.business.m;
import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import com.yandex.go.plus.experiment.CashbackExperiment;
import com.yandex.go.plus.experiment.CashbackStyleScheme;
import com.yandex.go.plus.experiment.a;
import com.yandex.go.plus.experiment.b;
import com.yandex.go.taxi.experiments.BoldVerticalsDesignDto;
import com.yandex.go.taxi.experiments.VerticalSettingsDto$$serializer;
import com.yandex.go.taxi.experiments.c;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.ButtonStyle;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.cashback.models.response.CashbackInactiveTariffBadgeStyleDto;
import ru.yandex.taxi.cashback.models.response.CashbackTariffBadgeStyleDto;
import ru.yandex.taxi.common_models.net.CacheStatus;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonState;
import ru.yandex.taxi.styling.ButtonType;

/* loaded from: classes.dex */
public final /* synthetic */ class r66 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ r66(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.go.blur.experiments.BlurConfigurationExperiment.DevicePerformanceClass", BlurConfigurationExperiment.DevicePerformanceClass.values(), new String[]{Constants.LOW, "medium", Constants.HIGH}, new Annotation[][]{null, null, null});
            case 1:
                e eVar = BlurConfigurationExperiment.SystemRenderEffect.Companion;
                return BlurConfigurationExperiment.DevicePerformanceClass.Companion.serializer();
            case 2:
                c cVar = BoldVerticalsDesignDto.Companion;
                return new k8u(auu0.a, VerticalSettingsDto$$serializer.INSTANCE, 1);
            case 3:
                return vez0.g("com.yandex.go.zone.dto.objects.BrandingType", BrandingType.values(), new String[]{"ya_plus", "mastercard", "ya_plus_mastercard", "visa", "ya_plus_visa", "other"}, new Annotation[][]{null, null, null, null, null, null});
            case 4:
                m mVar = BusinessAccountFlowExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 5:
                l0 l0Var = BusinessAccountFlowExperiment.Menu.Companion;
                return new p53(auu0.a, 0);
            case 6:
                by6 by6Var = cy6.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 7:
                return vez0.g("ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction", ButtonAction.values(), new String[]{"PLUS.BUY", "PLUS.UPGRADE", "PLUS.BUY.WEBVIEW", "PLUS.BUY.INAPP", null}, new Annotation[][]{null, null, null, null, null});
            case 8:
                return new j27();
            case 9:
                return vez0.g("ru.yandex.taxi.plus.api.dto.menu.button.ButtonState", ButtonState.values(), new String[]{"IDLE", "PROCESSING", "SUCCESS", "ALREADY_DONE", "ERROR"}, new Annotation[][]{null, null, null, null, null});
            case 10:
                g37 g37Var = h37.Companion;
                return ButtonState.Companion.serializer();
            case 11:
                return vez0.g("com.yandex.go.zone.dto.objects.ButtonStyle", ButtonStyle.values(), new String[]{"main", "minor"}, new Annotation[][]{null, null});
            case 12:
                return vez0.g("ru.yandex.taxi.styling.ButtonType", ButtonType.values(), new String[]{"promo", "surge", "default"}, new Annotation[][]{null, null, null});
            case 13:
                return vez0.g("ru.yandex.taxi.common_models.net.CacheStatus", CacheStatus.values(), new String[]{CacheStatus.SERIAL_UPDATED, CacheStatus.SERIAL_NOT_MODIFIED, CacheStatus.SERIAL_NO_CACHE}, new Annotation[][]{null, null, null});
            case 14:
                jd7 jd7Var = kd7.Companion;
                return new p53(ld7.a, 0);
            case 15:
                return vez0.g("com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders", CanMakeMoreOrders.values(), new String[]{"allowed", "disallowed", CacheStatus.SERIAL_NOT_MODIFIED}, new Annotation[][]{null, null, null});
            case 16:
                return new o4o("CarTechAction", d.INSTANCE, new Annotation[]{new tfr()});
            case 17:
                bb8 bb8Var = cb8.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 18:
                bb8 bb8Var2 = cb8.Companion;
                return new p53(auu0.a, 0);
            case 19:
                bb8 bb8Var3 = cb8.Companion;
                return new p53(auu0.a, 1);
            case 20:
                bb8 bb8Var4 = cb8.Companion;
                return new p53(ru.yandex.taxi.promotions.model.c.a, 0);
            case 21:
                return vez0.g("com.yandex.go.payments.paymentlist.experiments.CardNetwork", CardNetwork.values(), new String[]{"visa", "mastercard", "mir"}, new Annotation[][]{null, null, null});
            case 22:
                v vVar = CardProfile.Companion;
                return UserCardProfileName.Companion.serializer();
            case 23:
                a aVar = CashbackExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 24:
                return vez0.g("ru.yandex.taxi.cashback.models.response.CashbackInactiveTariffBadgeStyleDto", CashbackInactiveTariffBadgeStyleDto.values(), new String[]{"default", "gray", BackendConfig.Restrictions.DISABLED}, new Annotation[][]{null, null, null});
            case 25:
                b bVar = CashbackStyleScheme.Companion;
                return CashbackInactiveTariffBadgeStyleDto.Companion.serializer();
            case 26:
                b bVar2 = CashbackStyleScheme.Companion;
                return CashbackTariffBadgeStyleDto.Companion.serializer();
            case 27:
                return vez0.g("ru.yandex.taxi.cashback.models.response.CashbackTariffBadgeStyleDto", CashbackTariffBadgeStyleDto.values(), new String[]{"dark", "light"}, new Annotation[][]{null, null});
            case 28:
                f59 f59Var = g59.Companion;
                return new p53(auu0.a, 0);
            default:
                return vez0.g("com.yandex.go.places.models.data.entities.network.CategoryFilterType", CategoryFilterType.values(), new String[]{"search", "favourites", "category", null}, new Annotation[][]{null, null, null, null});
        }
    }
}
