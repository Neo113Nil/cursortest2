package ru.yandex.taxi.order.view;

import com.yandex.go.taxi.order.feedback.domain.model.TitleShownStrategy;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.view.FeedbackMvpView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[FeedbackStrategy.FeedbackType.values().length];
        try {
            iArr[FeedbackStrategy.FeedbackType.ALL_RATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[FeedbackMvpView.RatingReasonsState.values().length];
        try {
            iArr2[FeedbackMvpView.RatingReasonsState.ACHIEVEMENT_ICON_RATING_REASONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[FeedbackMvpView.RatingReasonsState.TAG_RATING_REASONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
        int[] iArr3 = new int[TitleShownStrategy.values().length];
        try {
            iArr3[TitleShownStrategy.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[TitleShownStrategy.ABOVE_REASONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[TitleShownStrategy.ABOVE_COMMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
