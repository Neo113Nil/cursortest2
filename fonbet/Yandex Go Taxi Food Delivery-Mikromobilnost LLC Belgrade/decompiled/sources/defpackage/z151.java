package defpackage;

import android.view.ContextThemeWrapper;
import com.yandex.go.business.impl.experiment.YangoBusinessExperiment;
import com.yandex.go.business.impl.experiment.a;
import com.yandex.go.payments.paymentlist.experiments.YbWalletTopUpRuleExperiment;
import com.yandex.go.payments.paymentlist.experiments.x;
import com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment;
import com.yandex.go.payments.yb.experiments.c;
import com.yandex.go.payments.yb.experiments.f;
import com.yandex.go.payments.yb.experiments.g;
import com.yandex.go.payments_widgets.split.actions.dto.YbSplitOpenTypedURLAction;
import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import com.yandex.go.zone.dto.objects.Branding$$serializer;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo$$serializer;
import com.yandex.go.zone.dto.objects.ZoneVertical$$serializer;
import com.yandex.go.zone.dto.response.p;
import com.yandex.go.zone.model.Policy$$serializer;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.model.ZoneMode$$serializer;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.WidgetDto$Group$Line$Orientation;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.push.impl.data.b;
import com.ybsdk.feature.push.impl.network.PushNotificationsApi;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import javax.net.ssl.X509TrustManager;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final /* synthetic */ class z151 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ z151(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        jb7 jb7Var;
        int i = 0;
        switch (this.a) {
            case 0:
                return new p53(auu0.a, 0);
            case 1:
                return new o4o("com.yandex.plus.home.plaque.repository.graphql.cache.dto.WidgetDto.Group.Line.Orientation", (Enum[]) WidgetDto$Group$Line$Orientation.values());
            case 2:
                return wv.Companion.serializer();
            case 3:
                b551 b551Var = c551.Companion;
                return new p53(ux70.a, 0);
            case 4:
                return new LinkedHashMap();
            case 5:
                o551 o551Var = p551.Companion;
                return new p53(z251.e, 0);
            case 6:
                return r501.l();
            case 7:
                X509TrustManager b = eg11.b(null);
                if (b != null) {
                    return b;
                }
                ny61.g("Failed to create default TrustManager");
                return null;
            case 8:
                a aVar = YangoBusinessExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 9:
                c cVar = YbInPaymentsPromotionExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 10:
                return vez0.g("com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment.ContentType", YbInPaymentsPromotionExperiment.ContentType.values(), new String[]{"link", "button"}, new Annotation[][]{null, null});
            case 11:
                f fVar = YbInPaymentsPromotionExperiment.GroupItemTrailing.Companion;
                return YbInPaymentsPromotionExperiment.ContentType.Companion.serializer();
            case 12:
                g gVar = YbInPaymentsPromotionExperiment.ImageDto.Companion;
                return YbInPaymentsPromotionExperiment.ImageType.Companion.serializer();
            case 13:
                return vez0.g("com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment.ImageType", YbInPaymentsPromotionExperiment.ImageType.values(), new String[]{"yandex_pay"}, new Annotation[][]{null});
            case 14:
                jb7 jb7Var2 = vez0.f;
                jb7Var = jb7Var2 != null ? jb7Var2 : null;
                Object obj = jb7Var.b;
                dnp0 dnp0Var = (dnp0) jb7Var.c;
                m2g0 t = jb7Var.t();
                com.ybsdk.feature.push.impl.data.a aVar2 = new com.ybsdk.feature.push.impl.data.a((PushNotificationsApi) ((xvf0) jb7Var.w).get());
                x8g x8gVar = (x8g) dnp0Var;
                va90 va90Var = new va90((DeviceIdProvider) x8gVar.D.get());
                AppAnalyticsReporter d = x8gVar.d();
                q5z.h(d);
                ContextThemeWrapper contextThemeWrapper = x8gVar.a;
                return new com.ybsdk.feature.push.impl.domain.a(contextThemeWrapper, new yo40(new yvi0(contextThemeWrapper)), new o370((com.ybsdk.common.repositiories.user.a) x8gVar.F.get()), new com.ybsdk.di.modules.features.push.a(x8gVar.c), ((nbp0) x8gVar.u.get()).a, t, aVar2, va90Var, d, (vt51) x8gVar.X0.get(), x8gVar.c(), new lnm0(i5m.a(x8gVar.X), i5m.a(x8gVar.A)));
            case 15:
                jb7 jb7Var3 = vez0.f;
                jb7Var = jb7Var3 != null ? jb7Var3 : null;
                return new b(jb7Var.t(), p03.o(((x8g) ((dnp0) jb7Var.c)).c));
            case 16:
                com.yandex.go.payments_widgets.split.actions.dto.a aVar3 = YbSplitOpenTypedURLAction.Companion;
                return vez0.g("com.yandex.go.payments_widgets.split.actions.dto.YbSplitOpenTypedURLAction.UrlType", YbSplitOpenTypedURLAction.UrlType.values(), new String[]{"onboarding", "account", "future_payments", "saver_promo"}, new Annotation[][]{null, null, null, null});
            case 17:
                com.yandex.go.yb.api.experiments.a aVar4 = YbWalletEntryPointExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 18:
                com.yandex.go.yb.api.experiments.a aVar5 = YbWalletEntryPointExperiment.Companion;
                return jsq0.Companion.serializer(YbWalletEntryPointExperiment.EntryPoint.Companion.serializer());
            case 19:
                return vez0.g("com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment.EntryPoint", YbWalletEntryPointExperiment.EntryPoint.values(), new String[]{"menu", "summary", "summary_force", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, "super_app_main_qr", "aeroexpress"}, new Annotation[][]{null, null, null, null, null, null});
            case 20:
                x xVar = YbWalletTopUpRuleExperiment.Companion;
                return YbWalletTopUpRuleExperiment.TopUpRule.Companion.serializer();
            case 21:
                return vez0.g("com.yandex.go.payments.paymentlist.experiments.YbWalletTopUpRuleExperiment.TopUpRule", YbWalletTopUpRuleExperiment.TopUpRule.values(), new String[]{"up_to_last_digit", "exact", "fit_to_balance", null}, new Annotation[][]{null, null, null, null});
            case 22:
                return g1a1.f(new ob61(i));
            case 23:
                com.yandex.go.zone.model.g gVar2 = Zone.Companion;
                return new p53(ZoneTariffInfo$$serializer.INSTANCE, 0);
            case 24:
                com.yandex.go.zone.model.g gVar3 = Zone.Companion;
                return new p53(p.Companion.serializer(), 0);
            case 25:
                com.yandex.go.zone.model.g gVar4 = Zone.Companion;
                return new p53(Policy$$serializer.INSTANCE, 0);
            case 26:
                com.yandex.go.zone.model.g gVar5 = Zone.Companion;
                return new p53(ZoneMode$$serializer.INSTANCE, 0);
            case 27:
                com.yandex.go.zone.model.g gVar6 = Zone.Companion;
                return new p53(ZoneVertical$$serializer.INSTANCE, 0);
            case 28:
                com.yandex.go.zone.model.g gVar7 = Zone.Companion;
                return new p53(auu0.a, 1);
            default:
                com.yandex.go.zone.model.g gVar8 = Zone.Companion;
                return new p53(Branding$$serializer.INSTANCE, 0);
        }
    }
}
