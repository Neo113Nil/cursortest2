package defpackage;

import com.yandex.go.chargers.data.model.ChargersActionAttributeDto$$serializer;
import com.yandex.go.chargers.data.model.ChargersOfferButtonDto;
import com.yandex.go.chargers.data.model.ChargersOfferButtonDto$$serializer;
import com.yandex.go.chargers.data.model.r;
import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction;
import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersDiscountsAction;
import com.yandex.go.chargers.discovery_flex.ui.action.c;
import com.yandex.go.chargers.discovery_flex.ui.action.e;
import com.yandex.go.chargers.discovery_flex.ui.action.f;
import com.yandex.go.chargers.discovery_flex.ui.action.g;
import com.yandex.go.chargers.discovery_flex.ui.action.h;
import com.yandex.go.chargers.discovery_flex.ui.action.j;
import com.yandex.go.chargers.discovery_flex.ui.action.k;
import com.yandex.go.chargers.discovery_flex.ui.action.l;
import com.yandex.go.chargers.discovery_flex.ui.action.m;
import com.yandex.go.chargers.discovery_flex.ui.action.n;
import com.yandex.go.chargers.offer.data.api.ChargersOfferKeyDto$$serializer;
import com.yandex.go.chargers.offer.data.api.ChargersOfferParams;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto$Pricing$PlanItem$$serializer;
import com.yandex.go.chargers.offer.data.api.ChargersOfferTabDto$$serializer;
import com.yandex.go.chargers.offer.data.api.ChargersOfferV2Params;
import com.yandex.go.chargers.offer.data.api.ChargersOfferVariantDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferVariantDto$$serializer;
import com.yandex.go.chargers.offer.data.api.PopupDto$$serializer;
import com.yandex.go.chargers.offer.data.api.i;
import com.yandex.go.chargers.offer.data.api.s;
import com.yandex.go.chargers.offer.data.api.t;
import com.yandex.go.chargers.orchestrator_user_events.data.model.ChargersOrchestratorCreateEventRequest;
import com.yandex.go.chargers.orchestrator_user_events.data.model.OrchestratorUserEventDto$$serializer;
import com.yandex.go.chargers.orchestrator_user_events.data.model.a;
import com.yandex.go.chargers.order.data.model.ChargersMultiOrderUiDto;
import com.yandex.go.chargers.order.data.model.ChargersOrdersTabModeDto$$serializer;
import com.yandex.go.chargers.order.data.model.p0;
import com.yandex.go.chargers.order.data.model.r0;
import com.yandex.go.chargers.payments.api.data.ChargersPaymentMethod$$serializer;
import java.lang.annotation.Annotation;

/* loaded from: classes12.dex */
public final /* synthetic */ class z1a implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ z1a(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                c cVar = ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.Companion;
                return new v5e0(qoi0.a(CharSequence.class), new Annotation[0]);
            case 1:
                e eVar = ChargersFlexDiscoveryAction$OpenChargersDiscountsAction.Companion;
                return ChargersFlexDiscoveryAction$OpenChargersDiscountsAction.ChargersDiscountType.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction.OpenChargersDiscountsAction.ChargersDiscountType", ChargersFlexDiscoveryAction$OpenChargersDiscountsAction.ChargersDiscountType.values(), new String[]{"promocode", "discount", ""}, new Annotation[][]{null, null, null});
            case 3:
                return new o4o("OpenChargersDvizhSubscriptionAction", f.INSTANCE, new Annotation[0]);
            case 4:
                return new o4o("OpenChargersPartnerSubscriptionAction", g.INSTANCE, new Annotation[0]);
            case 5:
                return new o4o("OpenChargersPassesAction", h.INSTANCE, new Annotation[0]);
            case 6:
                return new o4o("OpenChargersQrScanAction", j.INSTANCE, new Annotation[0]);
            case 7:
                return new o4o("OpenChargersSubscriptionAction", k.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("OpenChargersSupportAction", l.INSTANCE, new Annotation[0]);
            case 9:
                return new o4o("OpenScootersActiveSuperPassesAction", m.INSTANCE, new Annotation[0]);
            case 10:
                return new o4o("OpenScootersSuperPassesAction", n.INSTANCE, new Annotation[0]);
            case 11:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersMultiOrderButtonActionDto.TakeCharger", u3a.INSTANCE, new Annotation[0]);
            case 12:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersMultiOrderButtonActionDto.Unknown", v3a.INSTANCE, new Annotation[0]);
            case 13:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersMultiOrderItemDto.Unknown", p0.INSTANCE, new Annotation[0]);
            case 14:
                r0 r0Var = ChargersMultiOrderUiDto.Companion;
                return new p53(g4a.e, 0);
            case 15:
                r0 r0Var2 = ChargersMultiOrderUiDto.Companion;
                return new p53(ChargersOrdersTabModeDto$$serializer.INSTANCE, 0);
            case 16:
                r rVar = ChargersOfferButtonDto.Companion;
                return ChargersOfferButtonDto.Action.Companion.serializer();
            case 17:
                return vez0.g("com.yandex.go.chargers.data.model.ChargersOfferButtonDto.Action", ChargersOfferButtonDto.Action.values(), new String[]{"create_order", "return_charger", "buy_sharing_subscription_then_create_order", "buy_plus_dvizh_subscription_then_create_order"}, new Annotation[][]{null, null, null, null});
            case 18:
                com.yandex.go.chargers.offer.data.api.c cVar2 = ChargersOfferParams.Companion;
                return new p53(ChargersPaymentMethod$$serializer.INSTANCE, 0);
            case 19:
                i iVar = ChargersOfferResponseDto.Companion;
                return new p53(ChargersActionAttributeDto$$serializer.INSTANCE, 0);
            case 20:
                i iVar2 = ChargersOfferResponseDto.Companion;
                return new p53(ChargersOfferButtonDto$$serializer.INSTANCE, 0);
            case 21:
                i iVar3 = ChargersOfferResponseDto.Companion;
                return new p53(PopupDto$$serializer.INSTANCE, 0);
            case 22:
                i iVar4 = ChargersOfferResponseDto.Companion;
                return new p53(ChargersOfferTabDto$$serializer.INSTANCE, 0);
            case 23:
                i iVar5 = ChargersOfferResponseDto.Companion;
                return new p53(ChargersOfferVariantDto$$serializer.INSTANCE, 0);
            case 24:
                return new o4o("com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto.ChargersOfferBannerActionDto.Unknown", com.yandex.go.chargers.offer.data.api.g.INSTANCE, new Annotation[0]);
            case 25:
                com.yandex.go.chargers.offer.data.api.m mVar = ChargersOfferResponseDto.Pricing.Companion;
                return new p53(ChargersOfferResponseDto$Pricing$PlanItem$$serializer.INSTANCE, 0);
            case 26:
                s sVar = ChargersOfferV2Params.Companion;
                return new p53(ChargersPaymentMethod$$serializer.INSTANCE, 0);
            case 27:
                t tVar = ChargersOfferVariantDto.Companion;
                return new p53(ChargersOfferButtonDto$$serializer.INSTANCE, 0);
            case 28:
                t tVar2 = ChargersOfferVariantDto.Companion;
                return new p53(ChargersOfferKeyDto$$serializer.INSTANCE, 0);
            default:
                a aVar = ChargersOrchestratorCreateEventRequest.Companion;
                return new p53(OrchestratorUserEventDto$$serializer.INSTANCE, 0);
        }
    }
}
