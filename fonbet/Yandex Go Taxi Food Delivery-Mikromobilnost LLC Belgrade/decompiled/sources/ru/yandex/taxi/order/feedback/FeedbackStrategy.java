package ru.yandex.taxi.order.feedback;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import defpackage.isq;
import defpackage.k4o;
import defpackage.ksq;
import defpackage.t8i0;
import defpackage.zxf0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.order.view.FeedbackMvpView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/order/feedback/FeedbackStrategy;", "Lzxf0;", "FeedbackType", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface FeedbackStrategy extends zxf0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "", "ALL_RATING", "LOW_RATING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FeedbackType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FeedbackType[] $VALUES;
        public static final FeedbackType ALL_RATING;
        public static final FeedbackType LOW_RATING;

        static {
            FeedbackType feedbackType = new FeedbackType("ALL_RATING", 0);
            ALL_RATING = feedbackType;
            FeedbackType feedbackType2 = new FeedbackType("LOW_RATING", 1);
            LOW_RATING = feedbackType2;
            FeedbackType[] feedbackTypeArr = {feedbackType, feedbackType2};
            $VALUES = feedbackTypeArr;
            $ENTRIES = kotlin.enums.a.a(feedbackTypeArr);
        }

        public static FeedbackType valueOf(String str) {
            return (FeedbackType) Enum.valueOf(FeedbackType.class, str);
        }

        public static FeedbackType[] values() {
            return (FeedbackType[]) $VALUES.clone();
        }
    }

    boolean H5(isq isqVar);

    List I6(isq isqVar);

    FeedbackDto J1(FeedbackDto feedbackDto, ksq ksqVar);

    boolean N2(isq isqVar, TaxiOrder taxiOrder, ksq ksqVar);

    FeedbackType getRatingType();

    t8i0 qd(isq isqVar, String str);

    FeedbackMvpView.RatingReasonsState w2(isq isqVar);

    void xe(FeedbackParam.a aVar, ksq ksqVar);
}
