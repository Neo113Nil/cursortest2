package defpackage;

import com.yandex.go.chargers.promotion.data.model.SubtitleDto;
import com.yandex.go.chargers.promotion.data.model.TextItemDto$$serializer;
import com.yandex.go.chargers.promotion.data.model.d;
import com.yandex.go.preorder.suggested.menu.experiment.SuggestMenuExperiment;
import com.yandex.go.preorder.suggested.menu.experiment.a;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.SuggestCommentRequestDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.b;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.SuggestCommentDto$$serializer;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.SuggestCommentResponseDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.i;
import com.yandex.go.tariffs.SummaryHighTariffSelectorExperiment;
import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import com.yandex.go.zone.dto.objects.SummaryCardPromo$Bullet$$serializer;
import com.yandex.go.zone.dto.objects.j5;
import com.yandex.go.zone.dto.objects.k5;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError;
import com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.suggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.experiments.SuggestHeuristicsExperiment;
import ru.yandex.taxi.plus.net.response.Status;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;
import ru.yandex.taxi.summary.promotions.models.e;
import ru.yandex.taxi.summary.promotions.models.f;
import ru.yandex.taxi.summary.promotions.models.h;
import ru.yandex.taxi.summary.promotions.models.m;

/* loaded from: classes13.dex */
public final /* synthetic */ class w0v0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ w0v0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto.SubscriptionStatusDto", SubscriptionInfoDto.SubscriptionStatusDto.values(), new String[]{"FAIL_3DS", "HOLD", "PAYMENT_FAILED", "REFUND", "WAIT_FOR_PAYMENT", null}, new Annotation[][]{null, null, null, null, null, null});
            case 1:
                _childSerializers$_anonymous_ = SubscriptionInfoError.EmptyProductsByTarget._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                q1v0 q1v0Var = r1v0.Companion;
                return Status.Companion.serializer();
            case 3:
                d dVar = SubtitleDto.Companion;
                return new p53(TextItemDto$$serializer.INSTANCE, 0);
            case 4:
                b bVar = SuggestCommentRequestDto.Companion;
                return new p53(imx0.a, 0);
            case 5:
                b bVar2 = SuggestCommentRequestDto.Companion;
                return new p53(b0t.a, 0);
            case 6:
                i iVar = SuggestCommentResponseDto.Companion;
                return new p53(SuggestCommentDto$$serializer.INSTANCE, 0);
            case 7:
                j5v0 j5v0Var = SuggestHeuristicsExperiment.Companion;
                return jsq0.Companion.serializer(SuggestHeuristicsExperiment.Heuristic.Companion.serializer());
            case 8:
                j5v0 j5v0Var2 = SuggestHeuristicsExperiment.Companion;
                return jsq0.Companion.serializer(RoutePointType.Companion.serializer());
            case 9:
                return vez0.g("ru.yandex.taxi.persuggest.experiments.SuggestHeuristicsExperiment.Heuristic", SuggestHeuristicsExperiment.Heuristic.values(), new String[]{"session_time", "result_seen_fully", "event_number"}, new Annotation[][]{null, null, null});
            case 10:
                a aVar = SuggestMenuExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 11:
                a aVar2 = SuggestMenuExperiment.Companion;
                return jsq0.Companion.serializer(EntryPoint.Companion.serializer());
            case 12:
                a aVar3 = SuggestMenuExperiment.Companion;
                return new p53(h6w.a, 0);
            case 13:
                return Action.Companion.serializer();
            case 14:
                k7v0 k7v0Var = l7v0.Companion;
                return new p53(h6w.a, 0);
            case 15:
                t7v0 t7v0Var = u7v0.Companion;
                return new p53(gsw.a, 0);
            case 16:
                t7v0 t7v0Var2 = u7v0.Companion;
                return new p53(ao0.a, 0);
            case 17:
                return pwf0.b(elh.class);
            case 18:
                tav0 tav0Var = wav0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 19:
                return new p53(auu0.a, 0);
            case 20:
                j5 j5Var = SummaryCardPromo.Companion;
                return new p53(SummaryCardPromo$Bullet$$serializer.INSTANCE, 0);
            case 21:
                k5 k5Var = SummaryCardPromo.HeaderAppearance.Companion;
                return SummaryCardPromo.Type.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.zone.dto.objects.SummaryCardPromo.Type", SummaryCardPromo.Type.values(), new String[]{"default", "prominent"}, new Annotation[][]{null, null});
            case 23:
                com.yandex.go.tariffs.a aVar4 = SummaryHighTariffSelectorExperiment.Companion;
                return new p53(auu0.a, 1);
            case 24:
                e eVar = SummaryPromotionsParam.a.Companion;
                return new p53(auu0.a, 0);
            case 25:
                e eVar2 = SummaryPromotionsParam.a.Companion;
                return new p53(f.a, 0);
            case 26:
                return SummaryPromotionsParam.Type.Companion.serializer();
            case 27:
                m mVar = SummaryPromotionsParam.c.Companion;
                return new p53(auu0.a, 0);
            case 28:
                m mVar2 = SummaryPromotionsParam.c.Companion;
                return new p53(h.a, 0);
            default:
                m mVar3 = SummaryPromotionsParam.c.Companion;
                return new p53(wmv0.a, 1);
        }
    }
}
