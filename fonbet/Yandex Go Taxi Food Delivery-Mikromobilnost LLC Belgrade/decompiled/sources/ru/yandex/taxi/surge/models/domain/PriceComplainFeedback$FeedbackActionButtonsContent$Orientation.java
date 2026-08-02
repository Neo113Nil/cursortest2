package ru.yandex.taxi.surge.models.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/surge/models/domain/PriceComplainFeedback$FeedbackActionButtonsContent$Orientation", "", "Lru/yandex/taxi/surge/models/domain/PriceComplainFeedback$FeedbackActionButtonsContent$Orientation;", "VERTICAL", "HORIZONTAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PriceComplainFeedback$FeedbackActionButtonsContent$Orientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PriceComplainFeedback$FeedbackActionButtonsContent$Orientation[] $VALUES;
    public static final PriceComplainFeedback$FeedbackActionButtonsContent$Orientation HORIZONTAL;
    public static final PriceComplainFeedback$FeedbackActionButtonsContent$Orientation VERTICAL;

    static {
        PriceComplainFeedback$FeedbackActionButtonsContent$Orientation priceComplainFeedback$FeedbackActionButtonsContent$Orientation = new PriceComplainFeedback$FeedbackActionButtonsContent$Orientation("VERTICAL", 0);
        VERTICAL = priceComplainFeedback$FeedbackActionButtonsContent$Orientation;
        PriceComplainFeedback$FeedbackActionButtonsContent$Orientation priceComplainFeedback$FeedbackActionButtonsContent$Orientation2 = new PriceComplainFeedback$FeedbackActionButtonsContent$Orientation("HORIZONTAL", 1);
        HORIZONTAL = priceComplainFeedback$FeedbackActionButtonsContent$Orientation2;
        PriceComplainFeedback$FeedbackActionButtonsContent$Orientation[] priceComplainFeedback$FeedbackActionButtonsContent$OrientationArr = {priceComplainFeedback$FeedbackActionButtonsContent$Orientation, priceComplainFeedback$FeedbackActionButtonsContent$Orientation2};
        $VALUES = priceComplainFeedback$FeedbackActionButtonsContent$OrientationArr;
        $ENTRIES = a.a(priceComplainFeedback$FeedbackActionButtonsContent$OrientationArr);
    }

    public static PriceComplainFeedback$FeedbackActionButtonsContent$Orientation valueOf(String str) {
        return (PriceComplainFeedback$FeedbackActionButtonsContent$Orientation) Enum.valueOf(PriceComplainFeedback$FeedbackActionButtonsContent$Orientation.class, str);
    }

    public static PriceComplainFeedback$FeedbackActionButtonsContent$Orientation[] values() {
        return (PriceComplainFeedback$FeedbackActionButtonsContent$Orientation[]) $VALUES.clone();
    }
}
