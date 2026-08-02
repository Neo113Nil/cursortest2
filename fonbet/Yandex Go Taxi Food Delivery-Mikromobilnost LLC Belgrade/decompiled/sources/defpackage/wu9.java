package defpackage;

import com.yandex.go.chargers.data.model.ChargersAttributeDto$$serializer;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto$$serializer;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsListParams;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsListResponse;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTabDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTabDto$$serializer;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsToggleDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTypeDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsViewedParams;
import com.yandex.go.chargers.discounts.data.models.b0;
import com.yandex.go.chargers.discounts.data.models.c0;
import com.yandex.go.chargers.discounts.data.models.d0;
import com.yandex.go.chargers.discounts.data.models.e0;
import com.yandex.go.chargers.discounts.data.models.f0;
import com.yandex.go.chargers.discounts.data.models.z;
import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction;
import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer;
import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersDiscountsAction;
import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersDiscountsAction$$serializer;
import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction;
import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction$$serializer;
import com.yandex.go.chargers.discovery_flex.ui.action.f;
import com.yandex.go.chargers.discovery_flex.ui.action.j;
import com.yandex.go.chargers.discovery_flex.ui.action.l;
import com.yandex.go.chargers.discovery_flex.ui.action.o;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackItemDto$$serializer;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackItemsDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackParamsDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackResponseDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateAnimationTag;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackSendRequestDto;
import com.yandex.go.chargers.feedback.data.ChargersFinishedOrderDto;
import com.yandex.go.chargers.feedback.data.ChargersFinishedOrderDto$$serializer;
import com.yandex.go.chargers.feedback.data.b;
import com.yandex.go.chargers.feedback.data.c;
import com.yandex.go.chargers.feedback.data.e;
import com.yandex.go.chargers.feedback.data.g;
import com.yandex.go.chargers.feedback.data.h;
import com.yandex.go.chargers.feedback.data.i;
import com.yandex.go.chargers.feedback.data.k;
import com.yandex.go.chargers.feedback.data.m;
import com.yandex.go.chargers.feedback.data.n;
import com.yandex.go.chargers.feedback.data.p;
import com.yandex.go.chargers.feedback.data.q;
import com.yandex.go.chargers.feedback.data.s;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersFinishProgressResponse;
import com.yandex.go.chargers.payments.api.data.ChargersPaymentMethod$$serializer;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes12.dex */
public final /* synthetic */ class wu9 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ wu9(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto.Unknown", z.INSTANCE, new Annotation[0]);
            case 1:
                b0 b0Var = ChargersDiscountsListParams.Companion;
                return new p53(ChargersPaymentMethod$$serializer.INSTANCE, 0);
            case 2:
                c0 c0Var = ChargersDiscountsListResponse.Companion;
                return new p53(ChargersDiscountsTabDto$$serializer.INSTANCE, 0);
            case 3:
                d0 d0Var = ChargersDiscountsTabDto.Companion;
                return ChargersDiscountsTypeDto.Companion.serializer();
            case 4:
                d0 d0Var2 = ChargersDiscountsTabDto.Companion;
                return new p53(vu9.e, 0);
            case 5:
                e0 e0Var = ChargersDiscountsToggleDto.Companion;
                return new p53(auu0.a, 0);
            case 6:
                return vez0.g("com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTypeDto", ChargersDiscountsTypeDto.values(), new String[]{"rental", "partners", "tasks"}, new Annotation[][]{null, null, null});
            case 7:
                f0 f0Var = ChargersDiscountsViewedParams.Companion;
                return new p53(ChargersDiscountDto$$serializer.INSTANCE, 0);
            case 8:
                b bVar = ChargersFeedbackItemsDto.Companion;
                return new p53(ChargersFeedbackItemDto$$serializer.INSTANCE, 0);
            case 9:
                c cVar = ChargersFeedbackParamsDto.Companion;
                return new p53(auu0.a, 0);
            case 10:
                e eVar = ChargersFeedbackResponseDto.Companion;
                return new p53(ChargersFinishedOrderDto$$serializer.INSTANCE, 0);
            case 11:
                return new o4o("com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerActionDto.DvizhSubscription", g.INSTANCE, new Annotation[0]);
            case 12:
                return new o4o("com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerActionDto.SuperPasses", h.INSTANCE, new Annotation[0]);
            case 13:
                return new o4o("com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerActionDto.Unknown", i.INSTANCE, new Annotation[0]);
            case 14:
                k kVar = ChargersFeedbackScreenBannerDto.Companion;
                return new p53(ChargersAttributeDto$$serializer.INSTANCE, 0);
            case 15:
                return new o4o("com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateActionDto.OpenDiscountsList", m.INSTANCE, new Annotation[0]);
            case 16:
                return new o4o("com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateActionDto.Unknown", n.INSTANCE, new Annotation[0]);
            case 17:
                return vez0.g("com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateAnimationTag", ChargersFeedbackScreenPromoPlateAnimationTag.values(), new String[]{"discount_progress_achieved", "task_progress_achieved"}, new Annotation[][]{null, null});
            case 18:
                p pVar = ChargersFeedbackScreenPromoPlateDto.Companion;
                return new p53(ChargersAttributeDto$$serializer.INSTANCE, 0);
            case 19:
                p pVar2 = ChargersFeedbackScreenPromoPlateDto.Companion;
                return ChargersFeedbackScreenPromoPlateAnimationTag.Companion.serializer();
            case 20:
                return new o4o("com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenValueActionDto.OpenSurgeModal", wz9.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenValueActionDto.Unknown", yz9.INSTANCE, new Annotation[0]);
            case 22:
                q qVar = ChargersFeedbackSendRequestDto.Companion;
                return new p53(auu0.a, 0);
            case 23:
                com.yandex.go.chargers.order.completion.pre_finish.data.model.b bVar2 = ChargersFinishProgressResponse.Companion;
                return ChargersFinishProgressResponse.ProgressState.Companion.serializer();
            case 24:
                return vez0.g("com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersFinishProgressResponse.ProgressState", ChargersFinishProgressResponse.ProgressState.values(), new String[]{"running", UgcLiveVideoData.UgcLiveStatus.FINISHED, "failed"}, new Annotation[][]{null, null, null});
            case 25:
                s sVar = ChargersFinishedOrderDto.Companion;
                return ChargersFinishedOrderDto.FinishingStage.Companion.serializer();
            case 26:
                return vez0.g("com.yandex.go.chargers.feedback.data.ChargersFinishedOrderDto.FinishingStage", ChargersFinishedOrderDto.FinishingStage.values(), new String[]{"default", "free_check_period"}, new Annotation[][]{null, null});
            case 27:
                return new ssp0("com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction", qoi0.a(o.class), new lfx[]{qoi0.a(com.yandex.go.chargers.discovery_flex.ui.action.b.class), qoi0.a(ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.class), qoi0.a(ChargersFlexDiscoveryAction$OpenChargersDiscountsAction.class), qoi0.a(f.class), qoi0.a(com.yandex.go.chargers.discovery_flex.ui.action.g.class), qoi0.a(com.yandex.go.chargers.discovery_flex.ui.action.h.class), qoi0.a(ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction.class), qoi0.a(j.class), qoi0.a(com.yandex.go.chargers.discovery_flex.ui.action.k.class), qoi0.a(l.class), qoi0.a(com.yandex.go.chargers.discovery_flex.ui.action.m.class), qoi0.a(com.yandex.go.chargers.discovery_flex.ui.action.n.class)}, new KSerializer[]{new o4o("GeoTabAction", com.yandex.go.chargers.discovery_flex.ui.action.b.INSTANCE, new Annotation[0]), ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer.INSTANCE, ChargersFlexDiscoveryAction$OpenChargersDiscountsAction$$serializer.INSTANCE, new o4o("OpenChargersDvizhSubscriptionAction", f.INSTANCE, new Annotation[0]), new o4o("OpenChargersPartnerSubscriptionAction", com.yandex.go.chargers.discovery_flex.ui.action.g.INSTANCE, new Annotation[0]), new o4o("OpenChargersPassesAction", com.yandex.go.chargers.discovery_flex.ui.action.h.INSTANCE, new Annotation[0]), ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction$$serializer.INSTANCE, new o4o("OpenChargersQrScanAction", j.INSTANCE, new Annotation[0]), new o4o("OpenChargersSubscriptionAction", com.yandex.go.chargers.discovery_flex.ui.action.k.INSTANCE, new Annotation[0]), new o4o("OpenChargersSupportAction", l.INSTANCE, new Annotation[0]), new o4o("OpenScootersActiveSuperPassesAction", com.yandex.go.chargers.discovery_flex.ui.action.m.INSTANCE, new Annotation[0]), new o4o("OpenScootersSuperPassesAction", com.yandex.go.chargers.discovery_flex.ui.action.n.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 28:
                return new o4o("GeoTabAction", com.yandex.go.chargers.discovery_flex.ui.action.b.INSTANCE, new Annotation[0]);
            default:
                com.yandex.go.chargers.discovery_flex.ui.action.c cVar2 = ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.Companion;
                return new v5e0(qoi0.a(CharSequence.class), new Annotation[0]);
        }
    }
}
