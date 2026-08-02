package ru.yandex.taxi.logistics.sdk.tracking.domain.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/domain/api/data/FeedbackType;", "", "CANCEL", "REGULAR", "FINAL", "domain"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeedbackType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedbackType[] $VALUES;
    public static final FeedbackType CANCEL;
    public static final FeedbackType FINAL;
    public static final FeedbackType REGULAR;

    static {
        FeedbackType feedbackType = new FeedbackType("CANCEL", 0);
        CANCEL = feedbackType;
        FeedbackType feedbackType2 = new FeedbackType("REGULAR", 1);
        REGULAR = feedbackType2;
        FeedbackType feedbackType3 = new FeedbackType("FINAL", 2);
        FINAL = feedbackType3;
        FeedbackType[] feedbackTypeArr = {feedbackType, feedbackType2, feedbackType3};
        $VALUES = feedbackTypeArr;
        $ENTRIES = a.a(feedbackTypeArr);
    }

    public static FeedbackType valueOf(String str) {
        return (FeedbackType) Enum.valueOf(FeedbackType.class, str);
    }

    public static FeedbackType[] values() {
        return (FeedbackType[]) $VALUES.clone();
    }
}
