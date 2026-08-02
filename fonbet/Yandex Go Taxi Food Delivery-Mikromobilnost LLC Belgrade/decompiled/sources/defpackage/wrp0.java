package defpackage;

import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction;
import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction$Event$$serializer;
import com.yandex.go.flex.common.api.actions.j0;
import com.yandex.go.flex.common.api.actions.l0;
import com.yandex.go.flex.common.descriptors.action.SendRythmAnalyticsAction;
import com.yandex.go.flex.common.descriptors.action.g;
import com.yandex.go.payments.paymentlist.experiments.SelectedPaymentMethodButtonUIExperiment;
import com.yandex.go.payments.paymentlist.experiments.w;
import com.yandex.go.ridetech.locationsdk.experiment.dto.SelectSourceDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.h;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.c;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchProgressExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.o;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.ServiceLevel$Branding$$serializer;
import com.yandex.go.zone.dto.objects.ServiceLevel$ForceSuggest$$serializer;
import com.yandex.go.zone.dto.objects.ServiceLevel$HighlightedTariffs$HighlightedPrice$$serializer;
import com.yandex.go.zone.dto.objects.ServiceLevel$TariffDetail$$serializer;
import com.yandex.go.zone.dto.objects.b4;
import com.yandex.go.zone.dto.objects.e4;
import com.yandex.go.zone.dto.response.SearchScreen;
import flex.engine.section.model.ReusePolicy;
import flex.theme.ThemedColor;
import java.lang.annotation.Annotation;
import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.plus.api.dto.MenuType;

/* loaded from: classes9.dex */
public final /* synthetic */ class wrp0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ wrp0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new p53(gmo.a, 0);
            case 1:
                csp0 csp0Var = dsp0.Companion;
                return MenuType.Companion.serializer();
            case 2:
                o oVar = SearchProgressExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 3:
                return vez0.g("com.yandex.go.zone.dto.response.SearchScreen.DisplaySettings.PreferredOrderDetailsType", SearchScreen.DisplaySettings.PreferredOrderDetailsType.values(), new String[]{"details", "feed", "game"}, new Annotation[][]{null, null, null});
            case 4:
                return gwk0.p().b();
            case 5:
                ryp0 ryp0Var = syp0.Companion;
                return ThemedColor.Companion.serializer();
            case 6:
                return new p53(new oke(qoi0.a(pyp0.class), null, new KSerializer[0]), 0);
            case 7:
                return new oke(qoi0.a(pyp0.class), null, new KSerializer[0]);
            case 8:
                return vez0.g("flex.engine.section.model.ReusePolicy", ReusePolicy.values(), new String[]{"FORCE_AND_STORE", "USE_STORED", "FALLBACK_TO_NATIVE"}, new Annotation[][]{null, null, null});
            case 9:
                return new o4o("just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig", (Enum[]) OptimizedPaginationTriggerFeatureConfig.values());
            case 10:
                return new ssp0("flex.engine.section.SectionOperation", qoi0.a(w2q0.class), new lfx[]{qoi0.a(n2q0.class), qoi0.a(q2q0.class), qoi0.a(r2q0.class), qoi0.a(u2q0.class), qoi0.a(v2q0.class)}, new KSerializer[]{l2q0.a, o2q0.a, new o4o("flex.engine.section.SectionOperation.ReloadSectionsOperation", r2q0.INSTANCE, new Annotation[0]), s2q0.a, new o4o("flex.engine.section.SectionOperation.UpdateSectionsOperation", v2q0.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 11:
                return new o4o("flex.engine.section.SectionOperation.ReloadSectionsOperation", r2q0.INSTANCE, new Annotation[0]);
            case 12:
                return w2q0.Companion.serializer();
            case 13:
                h hVar = SelectSourceDto.Companion;
                return new p53(qke.n(auu0.a), 0);
            case 14:
                w wVar = SelectedPaymentMethodButtonUIExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 15:
                w wVar2 = SelectedPaymentMethodButtonUIExperiment.Companion;
                return jsq0.Companion.serializer(PaymentMethod$Type.Companion.serializer());
            case 16:
                c cVar = SelectedTariffInfo.Companion;
                return new p53(auu0.a, 1);
            case 17:
                return new p53(m32.a, 0);
            case 18:
                j0 j0Var = SendRealtimeAnalyticsAction.Companion;
                return new p53(SendRealtimeAnalyticsAction$Event$$serializer.INSTANCE, 0);
            case 19:
                g gVar = SendRythmAnalyticsAction.Companion;
                return new k8u(auu0.a, rcx.a, 1);
            case 20:
                return new o4o("com.yandex.go.flex.common.api.actions.ServiceCatalogAction", l0.INSTANCE, new Annotation[]{new tfr()});
            case 21:
                return new o4o("com.yandex.go.service_catalog.flex.sdk.scaffold.ServiceCatalogPreviewScaffold", wuq0.INSTANCE, new Annotation[0]);
            case 22:
                b4 b4Var = ServiceLevel.Companion;
                return new p53(ServiceLevel$TariffDetail$$serializer.INSTANCE, 0);
            case 23:
                b4 b4Var2 = ServiceLevel.Companion;
                return new p53(auu0.a, 0);
            case 24:
                b4 b4Var3 = ServiceLevel.Companion;
                return jsq0.Companion.serializer(PaymentMethod$Type.Companion.serializer());
            case 25:
                b4 b4Var4 = ServiceLevel.Companion;
                return new p53(ServiceLevel$ForceSuggest$$serializer.INSTANCE, 0);
            case 26:
                b4 b4Var5 = ServiceLevel.Companion;
                return BrandingType.Companion.serializer();
            case 27:
                b4 b4Var6 = ServiceLevel.Companion;
                return new p53(ServiceLevel$Branding$$serializer.INSTANCE, 0);
            case 28:
                e4 e4Var = ServiceLevel.HighlightedTariffs.Companion;
                return new p53(auu0.a, 0);
            default:
                e4 e4Var2 = ServiceLevel.HighlightedTariffs.Companion;
                return new p53(ServiceLevel$HighlightedTariffs$HighlightedPrice$$serializer.INSTANCE, 0);
        }
    }
}
