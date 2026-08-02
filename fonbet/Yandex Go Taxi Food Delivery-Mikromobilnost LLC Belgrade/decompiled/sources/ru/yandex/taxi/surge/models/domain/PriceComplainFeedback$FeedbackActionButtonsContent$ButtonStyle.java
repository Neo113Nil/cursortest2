package ru.yandex.taxi.surge.models.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/surge/models/domain/PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle", "", "Lru/yandex/taxi/surge/models/domain/PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle;", "ACCENT", "DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle[] $VALUES;
    public static final PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle ACCENT;
    public static final PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle DEFAULT;

    static {
        PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle = new PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle("ACCENT", 0);
        ACCENT = priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle;
        PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle2 = new PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle("DEFAULT", 1);
        DEFAULT = priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle2;
        PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle[] priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyleArr = {priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle, priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle2};
        $VALUES = priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyleArr;
        $ENTRIES = a.a(priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyleArr);
    }

    public static PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle valueOf(String str) {
        return (PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle) Enum.valueOf(PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle.class, str);
    }

    public static PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle[] values() {
        return (PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle[]) $VALUES.clone();
    }
}
