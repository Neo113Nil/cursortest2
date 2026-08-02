package ru.yandex.taxi.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/utils/FeedbackConstantsDelegate$FeedbackIdentifierType", "", "Lru/yandex/taxi/utils/FeedbackConstantsDelegate$FeedbackIdentifierType;", "PHONE", "ID", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeedbackConstantsDelegate$FeedbackIdentifierType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedbackConstantsDelegate$FeedbackIdentifierType[] $VALUES;
    public static final FeedbackConstantsDelegate$FeedbackIdentifierType ID;
    public static final FeedbackConstantsDelegate$FeedbackIdentifierType PHONE;

    static {
        FeedbackConstantsDelegate$FeedbackIdentifierType feedbackConstantsDelegate$FeedbackIdentifierType = new FeedbackConstantsDelegate$FeedbackIdentifierType("PHONE", 0);
        PHONE = feedbackConstantsDelegate$FeedbackIdentifierType;
        FeedbackConstantsDelegate$FeedbackIdentifierType feedbackConstantsDelegate$FeedbackIdentifierType2 = new FeedbackConstantsDelegate$FeedbackIdentifierType("ID", 1);
        ID = feedbackConstantsDelegate$FeedbackIdentifierType2;
        FeedbackConstantsDelegate$FeedbackIdentifierType[] feedbackConstantsDelegate$FeedbackIdentifierTypeArr = {feedbackConstantsDelegate$FeedbackIdentifierType, feedbackConstantsDelegate$FeedbackIdentifierType2};
        $VALUES = feedbackConstantsDelegate$FeedbackIdentifierTypeArr;
        $ENTRIES = kotlin.enums.a.a(feedbackConstantsDelegate$FeedbackIdentifierTypeArr);
    }

    public static FeedbackConstantsDelegate$FeedbackIdentifierType valueOf(String str) {
        return (FeedbackConstantsDelegate$FeedbackIdentifierType) Enum.valueOf(FeedbackConstantsDelegate$FeedbackIdentifierType.class, str);
    }

    public static FeedbackConstantsDelegate$FeedbackIdentifierType[] values() {
        return (FeedbackConstantsDelegate$FeedbackIdentifierType[]) $VALUES.clone();
    }
}
