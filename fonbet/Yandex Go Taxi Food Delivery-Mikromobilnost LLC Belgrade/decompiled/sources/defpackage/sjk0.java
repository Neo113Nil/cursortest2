package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPickupCodeView;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TagRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TextRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline$TimelineItem$$serializer;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector$Style$$serializer;
import com.yandex.go.taxi.order.models.api.response.b6;
import com.yandex.go.taxi.order.models.api.response.c6;
import com.yandex.go.taxi.order.models.api.response.e6;
import com.yandex.go.taxi.order.models.api.response.f6;
import com.yandex.go.taxi.order.models.api.response.g6;
import com.yandex.go.taxi.order.models.api.response.m6;
import com.yandex.go.taxi.order.models.api.response.q6;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonBadgeDto$Tag$$serializer;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonBadgeDto$Text$$serializer;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonsTitleDto$$serializer;
import com.yandex.go.taxi.order.models.api.response.s6;
import com.yandex.go.taxi.order.models.api.response.status.RideCardStatusProperties;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.taxi.order.models.api.response.status.b;
import com.yandex.go.taxi.order.models.api.response.status.d;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$CustomTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.a;
import com.yandex.go.taxi.order.models.api.response.tips.e;
import com.yandex.go.taxi.order.models.api.response.v6;
import com.yandex.go.taxi.order.models.api.response.w5;
import com.yandex.go.taxi.order.models.api.response.x6;
import com.yandex.go.taxi.order.models.api.response.z6;
import com.yandex.payment.common.result.ResultType;
import java.lang.annotation.Annotation;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes14.dex */
public final /* synthetic */ class sjk0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ sjk0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        vlk0 clickableAccessibilityDelegate_delegate$lambda$0;
        wlk0 unclickableAccessibilityDelegate_delegate$lambda$0;
        switch (this.a) {
            case 0:
                w5 w5Var = RideCardItemDto$StatusProgress.Companion;
                return RideCardItemDto$StatusProgress.State.Companion.serializer();
            case 1:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.StatusProgress.State", RideCardItemDto$StatusProgress.State.values(), new String[]{null, ClidProvider.APP_ACTIVE, ResultType.RESULT_TYPE_LOADING}, new Annotation[][]{null, null, null});
            case 2:
                return new o4o("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.StatusProgress.Trail.RegularTimer", b6.INSTANCE, new Annotation[0]);
            case 3:
                return new o4o("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.StatusProgress.Trail.UnknownTrail", c6.INSTANCE, new Annotation[0]);
            case 4:
                e6 e6Var = RideCardItemDto$TagRatingReasonsSelector.Companion;
                return new p53(h6w.a, 0);
            case 5:
                e6 e6Var2 = RideCardItemDto$TagRatingReasonsSelector.Companion;
                return new p53(RatingReasonBadgeDto$Tag$$serializer.INSTANCE, 0);
            case 6:
                e6 e6Var3 = RideCardItemDto$TagRatingReasonsSelector.Companion;
                return new p53(RatingReasonsTitleDto$$serializer.INSTANCE, 0);
            case 7:
                f6 f6Var = RideCardItemDto$TextRatingReasonsSelector.Companion;
                return new p53(h6w.a, 0);
            case 8:
                f6 f6Var2 = RideCardItemDto$TextRatingReasonsSelector.Companion;
                return new p53(RatingReasonBadgeDto$Text$$serializer.INSTANCE, 0);
            case 9:
                f6 f6Var3 = RideCardItemDto$TextRatingReasonsSelector.Companion;
                return new p53(RatingReasonsTitleDto$$serializer.INSTANCE, 0);
            case 10:
                g6 g6Var = RideCardItemDto$Timeline.Companion;
                return RideCardItemDto$Timeline.TimelineType.Companion.serializer();
            case 11:
                g6 g6Var2 = RideCardItemDto$Timeline.Companion;
                return new p53(RideCardItemDto$Timeline$TimelineItem$$serializer.INSTANCE, 0);
            case 12:
                return new o4o("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.Timeline.TimelineItem.TimelineItemContent.UnknownTimelineContentType", m6.INSTANCE, new Annotation[0]);
            case 13:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.Timeline.TimelineType", RideCardItemDto$Timeline.TimelineType.values(), new String[]{"horizontal_compact", "horizontal_regular", null}, new Annotation[][]{null, null, null});
            case 14:
                q6 q6Var = RideCardItemDto$TipsSelector.Companion;
                return new p53(e.Companion.serializer(), 0);
            case 15:
                s6 s6Var = RideCardItemDto$TipsWishSelector.Companion;
                return new p53(RideCardItemDto$TipsWishSelector$Style$$serializer.INSTANCE, 0);
            case 16:
                s6 s6Var2 = RideCardItemDto$TipsWishSelector.Companion;
                return new p53(e.Companion.serializer(), 0);
            case 17:
                return new o4o("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.TipsWishSelector.Content.UnknownContentType", v6.INSTANCE, new Annotation[0]);
            case 18:
                x6 x6Var = RideCardItemDto$TipsWishSelector.Style.Companion;
                return RideCardItemDto$TipsWishSelector.StyleType.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.TipsWishSelector.StyleType", RideCardItemDto$TipsWishSelector.StyleType.values(), new String[]{null, "selected"}, new Annotation[][]{null, null});
            case 20:
                return new o4o("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.UnknownType", z6.INSTANCE, new Annotation[0]);
            case 21:
                clickableAccessibilityDelegate_delegate$lambda$0 = RideCardPickupCodeView.clickableAccessibilityDelegate_delegate$lambda$0();
                return clickableAccessibilityDelegate_delegate$lambda$0;
            case 22:
                unclickableAccessibilityDelegate_delegate$lambda$0 = RideCardPickupCodeView.unclickableAccessibilityDelegate_delegate$lambda$0();
                return unclickableAccessibilityDelegate_delegate$lambda$0;
            case 23:
                rmk0 rmk0Var = smk0.Companion;
                return new p53(RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer.INSTANCE, 0);
            case 24:
                b bVar = RideCardStatusProperties.Effect.Companion;
                return RideCardStatusProperties.Effect.Type.Companion.serializer();
            case 25:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.status.RideCardStatusProperties.Effect.Type", RideCardStatusProperties.Effect.Type.values(), new String[]{"shimmering", null}, new Annotation[][]{null, null});
            case 26:
                d dVar = RideCardTimerDto.Companion;
                return RideCardTimerDto.TimerType.Companion.serializer();
            case 27:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto.TimerType", RideCardTimerDto.TimerType.values(), new String[]{"until", "from"}, new Annotation[][]{null, null});
            case 28:
                a aVar = RideCardTipsChoiceDto$CustomTipsChoiceDto.Companion;
                return TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.Companion.serializer();
            default:
                return new o4o("com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto.UnknownType", com.yandex.go.taxi.order.models.api.response.tips.b.INSTANCE, new Annotation[0]);
        }
    }
}
