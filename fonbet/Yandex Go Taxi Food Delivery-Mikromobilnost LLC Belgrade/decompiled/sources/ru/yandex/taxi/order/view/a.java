package ru.yandex.taxi.order.view;

import ru.yandex.taxi.order.view.FeedbackMvpView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FeedbackMvpView.RatingReasonsState.values().length];
        try {
            iArr[FeedbackMvpView.RatingReasonsState.TEXT_RATING_REASONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeedbackMvpView.RatingReasonsState.TAG_RATING_REASONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FeedbackMvpView.RatingReasonsState.ACHIEVEMENT_ICON_RATING_REASONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FeedbackMvpView.RatingReasonsState.NO_RATING_REASONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
