package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.ads.mobile_ads_sdk.data.experiment.MobileAdsSdkOptionsExperiment;
import com.yandex.go.ads.mobile_ads_sdk.data.experiment.a;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.morphlex.data.dto.MorphlexInstruction;
import com.yandex.go.morphlex.data.dto.MorphlexInstruction$$serializer;
import com.yandex.go.morphlex.data.dto.MorphlexScreenInstructionType;
import com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType;
import com.yandex.go.morphlex.experiments.MorphlexConfigurationsExperiment;
import com.yandex.go.morphlex.experiments.MorphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer;
import com.yandex.go.morphlex.experiments.b;
import com.yandex.mob.api.model.MobContourAvailabilityCheckStrategyName;
import com.yandex.mob.api.model.MobPingPolicy;
import com.yandex.mob.model.MobCronJobType;
import com.yandex.mob.model.MobNotificationType;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.qs30;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;
import ru.yandex.taxi.masstransit.experiment.c;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;
import ru.yandex.taxi.masstransit.promo.models.x;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final /* synthetic */ class um20 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ um20(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new p53(ml20.a, 0);
            case 1:
                return vez0.g("com.yandex.mob.api.model.MobContourAvailabilityCheckStrategyName", MobContourAvailabilityCheckStrategyName.values(), new String[]{"current_and_default", "all"}, new Annotation[][]{null, null});
            case 2:
                return new p53(e6m.a, 0);
            case 3:
                return MobNotificationType.Companion.serializer();
            case 4:
                return vez0.g("com.yandex.mob.model.MobNotificationType", MobNotificationType.values(), new String[]{"update_config", "availability_report", "detailed_report"}, new Annotation[][]{null, null, null});
            case 5:
                return vez0.g("com.yandex.mob.api.model.MobPingPolicy", MobPingPolicy.values(), new String[]{"default", "no_auto"}, new Annotation[][]{null, null});
            case 6:
                qq20 qq20Var = rq20.Companion;
                return new p53(lp20.a, 0);
            case 7:
                wr20 wr20Var = xr20.Companion;
                return new p53(op20.a, 0);
            case 8:
                wr20 wr20Var2 = xr20.Companion;
                return new p53(bq20.a, 0);
            case 9:
                wr20 wr20Var3 = xr20.Companion;
                return new k8u(new o4o("com.yandex.mob.model.MobCronJobType", (Enum[]) MobCronJobType.values()), on20.a, 1);
            case 10:
                wr20 wr20Var4 = xr20.Companion;
                return new k8u(new o4o("com.yandex.mob.model.MobCronJobType", (Enum[]) MobCronJobType.values()), on20.a, 1);
            case 11:
                wr20 wr20Var5 = xr20.Companion;
                return new p53(auu0.a, 1);
            case 12:
                wr20 wr20Var6 = xr20.Companion;
                return new p53(nr20.a, 0);
            case 13:
                a aVar = MobileAdsSdkOptionsExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 14:
                mz20 mz20Var = nz20.Companion;
                return new p53(iz20.a, 0);
            case 15:
                return null;
            case 16:
                return vez0.g("com.yandex.go.layers.api.model.params.Mode", Mode.values(), new String[]{Constants.NORMAL, "sdc", "boats", "eats", "grocery", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, "masstransit", "navigator", "scooters", "chargers", "restaurants", "city", "ultima", ContactsFragment.WEBVIEW_NAME, TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY, "intercity", "intercity_shuttle_choose_point", "delivery_ndd", "delivery_intercity", "rover", "organizations", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 17:
                com.yandex.go.morphlex.experiments.a aVar2 = MorphlexConfigurationsExperiment.Companion;
                return new k8u(auu0.a, MorphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer.INSTANCE, 1);
            case 18:
                b bVar = MorphlexConfigurationsExperiment.MorphlexScreenConfig.Companion;
                return new p53(MorphlexInstruction$$serializer.INSTANCE, 0);
            case 19:
                b bVar2 = MorphlexConfigurationsExperiment.MorphlexScreenConfig.Companion;
                return MorphlexScreenPresentType.Companion.serializer();
            case 20:
                com.yandex.go.morphlex.data.dto.b bVar3 = MorphlexInstruction.Companion;
                return MorphlexScreenInstructionType.Companion.serializer();
            case 21:
                return vez0.g("com.yandex.go.morphlex.data.dto.MorphlexScreenInstructionType", MorphlexScreenInstructionType.values(), new String[]{"auth", "geo", "point_a", "orders", "system_sound_is_muted", "payment_method", "tariff_requirements", "order_comment", "tariff_class", "preorder_due", "additional_preorder_info", "route", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 22:
                return vez0.g("com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType", MorphlexScreenPresentType.values(), new String[]{"fullscreen", "card", "popup", null}, new Annotation[][]{null, null, null, null});
            case 23:
                c cVar = MtMainRedirectExperiment.Companion;
                return MtMainRedirectExperiment.RedirectVertical.Companion.serializer();
            case 24:
                return vez0.g("ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment.RedirectVertical", MtMainRedirectExperiment.RedirectVertical.values(), new String[]{"hub", "transport"}, new Annotation[][]{null, null});
            case 25:
                rs30 rs30Var = qs30.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 26:
                vs30 vs30Var = qs30.c.Companion;
                return new p53(ys30.a, 0);
            case 27:
                zs30 zs30Var = qs30.e.Companion;
                return new p53(auu0.a, 0);
            case 28:
                x xVar = MtSummaryCommunicationsResponse.b.a.Companion;
                return new p53(gq30.a, 0);
            default:
                x xVar2 = MtSummaryCommunicationsResponse.b.a.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
