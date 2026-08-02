package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.shortcuts.impl.experiments.SuperAppShortcutsExperiment;
import com.yandex.go.shortcuts.impl.experiments.c;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestCartButtonExperiment;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService;
import com.yandex.go.superapp.order_tracking.common.experiments.d;
import com.yandex.go.superapp.order_tracking.common.experiments.f;
import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment;
import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment$TrackingCardColors$$serializer;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment$Button$$serializer;
import com.yandex.go.superapp.searchbar.impl.experiments.b;
import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersBodyDto;
import com.yandex.go.superapp.unified_polling.data.dto.TrackingsGroupMethodDto;
import com.yandex.go.superapp.unified_polling.data.dto.e;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$TextChoice$$serializer;
import com.yandex.go.zone.dto.objects.FeedbackRatingMapping$$serializer;
import com.yandex.go.zone.dto.objects.SupportedFeedbackChoices;
import com.yandex.go.zone.dto.objects.UserCancelReasonChoice$$serializer;
import com.yandex.go.zone.dto.objects.h2;
import com.yandex.go.zone.dto.objects.p5;
import com.yandex.go.zone.model.SupportPage;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.net.taxi.dto.request.SupportedFeature;
import ru.yandex.taxi.net.taxi.dto.request.SupportedOptionType;

/* loaded from: classes8.dex */
public final /* synthetic */ class w5w0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ w5w0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment.OrderService.ExternalOrderService.PreferredTrackingType", SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.PreferredTrackingType.values(), new String[]{"feed", "blank", "web_details"}, new Annotation[][]{null, null, null});
            case 1:
                d dVar = SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.Companion;
                return SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.PreferredTrackingType.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment.OrderService.TaxiOrderService.PreferredTrackingType", SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.PreferredTrackingType.values(), new String[]{"feed", "details"}, new Annotation[][]{null, null});
            case 3:
                return new o4o("com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment.OrderService.Unsupported", f.INSTANCE, new Annotation[0]);
            case 4:
                e eVar = SuperAppOrdersBodyDto.Companion;
                return new p53(auu0.a, 0);
            case 5:
                e eVar2 = SuperAppOrdersBodyDto.Companion;
                return TrackingsGroupMethodDto.Companion.serializer();
            case 6:
                c cVar = SuperAppShortcutsExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 7:
                b bVar = SuperappSearchbarExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 8:
                b bVar2 = SuperappSearchbarExperiment.Companion;
                return new p53(SuperappSearchbarExperiment$Button$$serializer.INSTANCE, 0);
            case 9:
                b bVar3 = SuperappSearchbarExperiment.Companion;
                return new p53(SuperappSearchbarExperiment$Button$$serializer.INSTANCE, 0);
            case 10:
                com.yandex.go.suggest.impl.data.experiments.b bVar4 = SuperappSuggestCartButtonExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 11:
                return new o4o("com.yandex.go.suggest.impl.view.error.SuperappSuggestErrorScaffold", pfw0.INSTANCE, new Annotation[0]);
            case 12:
                com.yandex.go.suggest.impl.data.experiments.d dVar2 = SuperappSuggestExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 13:
                com.yandex.go.suggest.impl.data.experiments.d dVar3 = SuperappSuggestExperiment.Companion;
                return SuperappSuggestExperiment.LoadingStrategy.Companion.serializer();
            case 14:
                com.yandex.go.suggest.impl.data.experiments.d dVar4 = SuperappSuggestExperiment.Companion;
                return SuperappSuggestExperiment.SearchScaffoldStyle.Companion.serializer();
            case 15:
                return vez0.g("com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment.LoadingStrategy", SuperappSuggestExperiment.LoadingStrategy.values(), new String[]{"async_reloading", "full_request"}, new Annotation[][]{null, null});
            case 16:
                return vez0.g("com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment.SearchScaffoldStyle", SuperappSuggestExperiment.SearchScaffoldStyle.values(), new String[]{Constants.NORMAL, "floating_input"}, new Annotation[][]{null, null});
            case 17:
                com.yandex.go.superapp.orders.card.experiments.b bVar5 = SuperappTrackingCardExperiment.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 18:
                com.yandex.go.superapp.orders.card.experiments.b bVar6 = SuperappTrackingCardExperiment.Companion;
                return new k8u(auu0.a, SuperappTrackingCardExperiment$TrackingCardColors$$serializer.INSTANCE, 1);
            case 19:
                com.yandex.go.zone.model.e eVar3 = SupportPage.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 20:
                return c7h.Companion.serializer();
            case 21:
                return khh.Companion.serializer();
            case 22:
                flw0 flw0Var = SupportedFeature.Companion;
                return SupportedFeature.Type.Companion.serializer();
            case 23:
                flw0 flw0Var2 = SupportedFeature.Companion;
                return new p53(auu0.a, 0);
            case 24:
                return vez0.g("ru.yandex.taxi.net.taxi.dto.request.SupportedFeature.Type", SupportedFeature.Type.values(), new String[]{null, "order_button_actions", "swap_summary"}, new Annotation[][]{null, null, null});
            case 25:
                p5 p5Var = SupportedFeedbackChoices.Companion;
                return new p53(h2.Companion.serializer(), 0);
            case 26:
                p5 p5Var2 = SupportedFeedbackChoices.Companion;
                return new p53(FeedbackRatingMapping$$serializer.INSTANCE, 0);
            case 27:
                p5 p5Var3 = SupportedFeedbackChoices.Companion;
                return new p53(UserCancelReasonChoice$$serializer.INSTANCE, 0);
            case 28:
                p5 p5Var4 = SupportedFeedbackChoices.Companion;
                return new p53(FeedbackBadgeChoice$TextChoice$$serializer.INSTANCE, 0);
            default:
                return SupportedOptionType.Companion.serializer();
        }
    }
}
