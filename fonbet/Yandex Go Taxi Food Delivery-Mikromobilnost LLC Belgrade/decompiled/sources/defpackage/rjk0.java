package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Accordion;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AchievementRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ActionButtons;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AiBubble;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Button;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ComboCompanion;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CompanionBufferSearch;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CostBreakdown;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CostCenter;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Destination;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DoneFooter;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DriverInfo;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DriverInfoSimple;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$FeedbackQuestion;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Generic;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Payment;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Photo;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$PickupCode;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$PlainComment;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ProgressBarItem;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Promoblock;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$RatingSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Requirement;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$RoutePoint;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ShareLocation;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Slider;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Source;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Status;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TagRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TextRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector;
import com.yandex.go.taxi.order.models.api.response.d5;
import com.yandex.go.taxi.order.models.api.response.o5;
import com.yandex.go.taxi.order.models.api.response.z6;
import java.util.Arrays;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes14.dex */
public final class rjk0 extends xqt {
    public static final rjk0 e = new rjk0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, z6.INSTANCE.serializer(), qoi0.a(z6.class));
    }

    @Override // defpackage.h9
    public final List f() {
        f9 f9Var = new f9(ACSPConstants.STATUS, RideCardItemDto$Status.Companion.serializer(), qoi0.a(RideCardItemDto$Status.class));
        f9 f9Var2 = new f9("driver_info", RideCardItemDto$DriverInfo.Companion.serializer(), qoi0.a(RideCardItemDto$DriverInfo.class));
        f9 f9Var3 = new f9("driver_info_simple", RideCardItemDto$DriverInfoSimple.Companion.serializer(), qoi0.a(RideCardItemDto$DriverInfoSimple.class));
        f9 f9Var4 = new f9("combo_companion", RideCardItemDto$ComboCompanion.Companion.serializer(), qoi0.a(RideCardItemDto$ComboCompanion.class));
        f9 f9Var5 = new f9("companion_buffer_search_animation", RideCardItemDto$CompanionBufferSearch.Companion.serializer(), qoi0.a(RideCardItemDto$CompanionBufferSearch.class));
        f9 f9Var6 = new f9("action_buttons", RideCardItemDto$ActionButtons.Companion.serializer(), qoi0.a(RideCardItemDto$ActionButtons.class));
        d5 d5Var = RideCardItemDto$Generic.Companion;
        f9 f9Var7 = new f9("generic", d5Var.serializer(), qoi0.a(RideCardItemDto$Generic.class));
        f9 f9Var8 = new f9("cancel", d5Var.serializer(), qoi0.a(RideCardItemDto$Generic.class));
        f9 f9Var9 = new f9("order_info", d5Var.serializer(), qoi0.a(RideCardItemDto$Generic.class));
        f9 f9Var10 = new f9("source", RideCardItemDto$Source.Companion.serializer(), qoi0.a(RideCardItemDto$Source.class));
        f9 f9Var11 = new f9("destination", RideCardItemDto$Destination.Companion.serializer(), qoi0.a(RideCardItemDto$Destination.class));
        o5 o5Var = RideCardItemDto$RoutePoint.Companion;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, f9Var5, f9Var6, f9Var7, f9Var8, f9Var9, f9Var10, f9Var11, new f9("route_point", o5Var.serializer(), qoi0.a(RideCardItemDto$RoutePoint.class)), new f9("add_route_point", o5Var.serializer(), qoi0.a(RideCardItemDto$RoutePoint.class)), new f9("plain_comment", RideCardItemDto$PlainComment.Companion.serializer(), qoi0.a(RideCardItemDto$PlainComment.class)), new f9("payment", RideCardItemDto$Payment.Companion.serializer(), qoi0.a(RideCardItemDto$Payment.class)), new f9("extra_dots_cost_breakdown", RideCardItemDto$CostBreakdown.Companion.serializer(), qoi0.a(RideCardItemDto$CostBreakdown.class)), new f9("share_location", RideCardItemDto$ShareLocation.Companion.serializer(), qoi0.a(RideCardItemDto$ShareLocation.class)), new f9("button_done", RideCardItemDto$DoneFooter.Companion.serializer(), qoi0.a(RideCardItemDto$DoneFooter.class)), new f9("feedback_question_placeholder", RideCardItemDto$FeedbackQuestion.Companion.serializer(), qoi0.a(RideCardItemDto$FeedbackQuestion.class)), new f9("rating_selector", RideCardItemDto$RatingSelector.Companion.serializer(), qoi0.a(RideCardItemDto$RatingSelector.class)), new f9("coherent_rating_selector", RideCardItemDto$CoherentRatingSelector.Companion.serializer(), qoi0.a(RideCardItemDto$CoherentRatingSelector.class)), new f9("tips_selector", RideCardItemDto$TipsSelector.Companion.serializer(), qoi0.a(RideCardItemDto$TipsSelector.class)), new f9("tips_wish_selector", RideCardItemDto$TipsWishSelector.Companion.serializer(), qoi0.a(RideCardItemDto$TipsWishSelector.class)), new f9("tag_rating_reasons", RideCardItemDto$TagRatingReasonsSelector.Companion.serializer(), qoi0.a(RideCardItemDto$TagRatingReasonsSelector.class)), new f9("achievement_rating_reasons", RideCardItemDto$AchievementRatingReasonsSelector.Companion.serializer(), qoi0.a(RideCardItemDto$AchievementRatingReasonsSelector.class)), new f9("text_rating_reasons", RideCardItemDto$TextRatingReasonsSelector.Companion.serializer(), qoi0.a(RideCardItemDto$TextRatingReasonsSelector.class)), new f9("cost_center", RideCardItemDto$CostCenter.Companion.serializer(), qoi0.a(RideCardItemDto$CostCenter.class)), new f9("promoblock", RideCardItemDto$Promoblock.Companion.serializer(), qoi0.a(RideCardItemDto$Promoblock.class)), new f9("accordion", RideCardItemDto$Accordion.Companion.serializer(), qoi0.a(RideCardItemDto$Accordion.class)), new f9("progress_bar_item", RideCardItemDto$ProgressBarItem.Companion.serializer(), qoi0.a(RideCardItemDto$ProgressBarItem.class)), new f9("collapsing_container", RideCardItemDto$CollapsingContainer.Companion.serializer(), qoi0.a(RideCardItemDto$CollapsingContainer.class)), new f9("timeline", RideCardItemDto$Timeline.Companion.serializer(), qoi0.a(RideCardItemDto$Timeline.class)), new f9("photo", RideCardItemDto$Photo.Companion.serializer(), qoi0.a(RideCardItemDto$Photo.class)), new f9("slider_item", RideCardItemDto$Slider.Companion.serializer(), qoi0.a(RideCardItemDto$Slider.class)), new f9("ai_bubble", RideCardItemDto$AiBubble.Companion.serializer(), qoi0.a(RideCardItemDto$AiBubble.class)), new f9("pickup_code", RideCardItemDto$PickupCode.Companion.serializer(), qoi0.a(RideCardItemDto$PickupCode.class)), new f9("button", RideCardItemDto$Button.Companion.serializer(), qoi0.a(RideCardItemDto$Button.class)), new f9("status_progress", RideCardItemDto$StatusProgress.Companion.serializer(), qoi0.a(RideCardItemDto$StatusProgress.class)), new f9("requirement", RideCardItemDto$Requirement.Companion.serializer(), qoi0.a(RideCardItemDto$Requirement.class)));
    }
}
