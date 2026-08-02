package ru.yandex.taxi.order.view;

import defpackage.biz0;
import defpackage.k4o;
import defpackage.l050;
import defpackage.t8i0;
import defpackage.xtq;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/order/view/FeedbackMvpView;", "Ll050;", "RatingReasonsState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface FeedbackMvpView extends l050 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;", "", "NO_RATING_REASONS", "TEXT_RATING_REASONS", "TAG_RATING_REASONS", "ACHIEVEMENT_ICON_RATING_REASONS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class RatingReasonsState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RatingReasonsState[] $VALUES;
        public static final RatingReasonsState ACHIEVEMENT_ICON_RATING_REASONS;
        public static final RatingReasonsState NO_RATING_REASONS;
        public static final RatingReasonsState TAG_RATING_REASONS;
        public static final RatingReasonsState TEXT_RATING_REASONS;

        static {
            RatingReasonsState ratingReasonsState = new RatingReasonsState("NO_RATING_REASONS", 0);
            NO_RATING_REASONS = ratingReasonsState;
            RatingReasonsState ratingReasonsState2 = new RatingReasonsState("TEXT_RATING_REASONS", 1);
            TEXT_RATING_REASONS = ratingReasonsState2;
            RatingReasonsState ratingReasonsState3 = new RatingReasonsState("TAG_RATING_REASONS", 2);
            TAG_RATING_REASONS = ratingReasonsState3;
            RatingReasonsState ratingReasonsState4 = new RatingReasonsState("ACHIEVEMENT_ICON_RATING_REASONS", 3);
            ACHIEVEMENT_ICON_RATING_REASONS = ratingReasonsState4;
            RatingReasonsState[] ratingReasonsStateArr = {ratingReasonsState, ratingReasonsState2, ratingReasonsState3, ratingReasonsState4};
            $VALUES = ratingReasonsStateArr;
            $ENTRIES = kotlin.enums.a.a(ratingReasonsStateArr);
        }

        public static RatingReasonsState valueOf(String str) {
            return (RatingReasonsState) Enum.valueOf(RatingReasonsState.class, str);
        }

        public static RatingReasonsState[] values() {
            return (RatingReasonsState[]) $VALUES.clone();
        }
    }

    void setRatingReasonsState(RatingReasonsState ratingReasonsState);

    void setRatingReasonsType(FeedbackStrategy.FeedbackType feedbackType, RatingReasonsState ratingReasonsState);

    void setRatingVisibility(boolean z);

    void showComment(String str);

    void showRating(int i);

    void showRatingReasons(List list);

    void showRatingReasonsUiState(t8i0 t8i0Var);

    void showTipsInput(String str);

    void updateFeedbackQuestion(xtq xtqVar);

    void updateTips(biz0 biz0Var);
}
