package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.flex.common.actions.create_order.SendOrderDraftAction;
import com.yandex.go.information.data.dto.LinkDto$$serializer;
import com.yandex.go.information.data.dto.ServiceDto;
import com.yandex.go.information.data.dto.b;
import com.yandex.go.taxi.order.chat.api.data.model.Sender;
import com.yandex.go.taxi.order.chat.api.data.model.g;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.SelectedTariffInfoDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.g2;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.ServiceLevel$RequirementAlternativesSection$$serializer;
import com.yandex.go.zone.dto.objects.f4;
import com.yandex.go.zone.dto.objects.j4;
import com.yandex.go.zone.dto.objects.k4;
import com.yandex.go.zone.dto.objects.o4;
import com.yandex.go.zone.dto.objects.q4;
import com.yandex.go.zone.dto.objects.u3;
import com.yandex.go.zone.dto.objects.v3;
import com.yandex.go.zone.dto.objects.v4;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.eatskit.dto.BleError;
import ru.yandex.taxi.surge.models.dto.SelectorStyle;

/* loaded from: classes14.dex */
public final /* synthetic */ class xiq0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ xiq0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                g2 g2Var = SelectedTariffInfoDto.Companion;
                return new p53(auu0.a, 1);
            case 1:
                return new zkq0();
            case 2:
                qwd qwdVar = alq0.a;
                return null;
            case 3:
                return vez0.g("ru.yandex.taxi.surge.models.dto.SelectorStyle", SelectorStyle.values(), new String[]{"default", "accent", null}, new Annotation[][]{null, null, null});
            case 4:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 5:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 6:
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 7:
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 8:
                return SendOrderDraftAction.Companion.serializer();
            case 9:
                cqq0 cqq0Var = dqq0.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 10:
                iqq0 iqq0Var = jqq0.Companion;
                return BleError.Companion.serializer();
            case 11:
                g gVar = Sender.Companion;
                return Sender.Role.Companion.serializer();
            case 12:
                g gVar2 = Sender.Companion;
                return new tmx(Sender.Role.Companion.serializer());
            case 13:
                return vez0.g("com.yandex.go.taxi.order.chat.api.data.model.Sender.Role", Sender.Role.values(), new String[]{"client", "driver", "system", null}, new Annotation[][]{null, null, null, null});
            case 14:
                return new p53(rxx0.a, 0);
            case 15:
                b bVar = ServiceDto.Companion;
                return new p53(LinkDto$$serializer.INSTANCE, 0);
            case 16:
                u3 u3Var = ServiceLevel.Branding.Companion;
                return ServiceLevel.Branding.Action.Companion.serializer();
            case 17:
                u3 u3Var2 = ServiceLevel.Branding.Companion;
                return ServiceLevel.Branding.Type.Companion.serializer();
            case 18:
                return vez0.g("com.yandex.go.zone.dto.objects.ServiceLevel.Branding.Action", ServiceLevel.Branding.Action.values(), new String[]{"redirect", "show_banner"}, new Annotation[][]{null, null});
            case 19:
                v3 v3Var = ServiceLevel.Branding.Extra.Companion;
                return ServiceLevel.Branding.Extra.CostCoverage.Companion.serializer();
            case 20:
                return vez0.g("com.yandex.go.zone.dto.objects.ServiceLevel.Branding.Extra.CostCoverage", ServiceLevel.Branding.Extra.CostCoverage.values(), new String[]{"full", "partial", null}, new Annotation[][]{null, null, null});
            case 21:
                return vez0.g("com.yandex.go.zone.dto.objects.ServiceLevel.Branding.Type", ServiceLevel.Branding.Type.values(), new String[]{"cashback", "badge", "plus_promotion", "wallet_payment_method_suggest", "complement_payment", "tariff_promotion", "create_business_account", "complement_wallet_full_cost_coverage", "modifier_field", "mastercard_cashback_notification", Constants.DEEPLINK, "composite_payment_amount", "has_possible_discount", "tariff_unavailable", "long_search_v2", "searching_pulsar", "tariff_tooltip", "preview_card", "start_pin_text", "detailed_start_pin", "detailed_finish_pin", "ride_time", "start_pin_appearance_override", "combo_inner_pin"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 22:
                f4 f4Var = ServiceLevel.HighlightedTariffs.HighlightedPrice.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 23:
                j4 j4Var = ServiceLevel.RequirementAlternatives.Companion;
                return new p53(ServiceLevel$RequirementAlternativesSection$$serializer.INSTANCE, 0);
            case 24:
                k4 k4Var = ServiceLevel.RequirementAlternativesSection.Companion;
                return new p53(auu0.a, 0);
            case 25:
                o4 o4Var = ServiceLevel.ScheduledOrderViewDto.Companion;
                return ServiceLevel.ScheduledOrderViewDto.Type.Companion.serializer();
            case 26:
                return vez0.g("com.yandex.go.zone.dto.objects.ServiceLevel.ScheduledOrderViewDto.Type", ServiceLevel.ScheduledOrderViewDto.Type.values(), new String[]{"default", "timetable", "timetable_with_seats", Constants.DEEPLINK}, new Annotation[][]{null, null, null, null});
            case 27:
                q4 q4Var = ServiceLevel.SearchingPulsarDTO.Companion;
                return ServiceLevel.SearchingPulsarDTO.SearchingPulsar.Companion.serializer();
            case 28:
                return vez0.g("com.yandex.go.zone.dto.objects.ServiceLevel.SearchingPulsarDTO.SearchingPulsar", ServiceLevel.SearchingPulsarDTO.SearchingPulsar.values(), new String[]{null, "two_circles", "wide_circle"}, new Annotation[][]{null, null, null});
            default:
                return new o4o("com.yandex.go.zone.dto.objects.ServiceLevel.TariffCard.BulletAction.None", v4.INSTANCE, new Annotation[0]);
        }
    }
}
