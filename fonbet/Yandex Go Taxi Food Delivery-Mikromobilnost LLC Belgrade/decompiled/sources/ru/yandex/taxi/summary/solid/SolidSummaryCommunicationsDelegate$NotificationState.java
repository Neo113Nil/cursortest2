package ru.yandex.taxi.summary.solid;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/summary/solid/SolidSummaryCommunicationsDelegate$NotificationState", "", "Lru/yandex/taxi/summary/solid/SolidSummaryCommunicationsDelegate$NotificationState;", "SHOWING", "HIDING", "SHOWED", "HIDDEN", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SolidSummaryCommunicationsDelegate$NotificationState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SolidSummaryCommunicationsDelegate$NotificationState[] $VALUES;
    public static final SolidSummaryCommunicationsDelegate$NotificationState HIDDEN;
    public static final SolidSummaryCommunicationsDelegate$NotificationState HIDING;
    public static final SolidSummaryCommunicationsDelegate$NotificationState SHOWED;
    public static final SolidSummaryCommunicationsDelegate$NotificationState SHOWING;

    static {
        SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState = new SolidSummaryCommunicationsDelegate$NotificationState("SHOWING", 0);
        SHOWING = solidSummaryCommunicationsDelegate$NotificationState;
        SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState2 = new SolidSummaryCommunicationsDelegate$NotificationState("HIDING", 1);
        HIDING = solidSummaryCommunicationsDelegate$NotificationState2;
        SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState3 = new SolidSummaryCommunicationsDelegate$NotificationState("SHOWED", 2);
        SHOWED = solidSummaryCommunicationsDelegate$NotificationState3;
        SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState4 = new SolidSummaryCommunicationsDelegate$NotificationState("HIDDEN", 3);
        HIDDEN = solidSummaryCommunicationsDelegate$NotificationState4;
        SolidSummaryCommunicationsDelegate$NotificationState[] solidSummaryCommunicationsDelegate$NotificationStateArr = {solidSummaryCommunicationsDelegate$NotificationState, solidSummaryCommunicationsDelegate$NotificationState2, solidSummaryCommunicationsDelegate$NotificationState3, solidSummaryCommunicationsDelegate$NotificationState4};
        $VALUES = solidSummaryCommunicationsDelegate$NotificationStateArr;
        $ENTRIES = kotlin.enums.a.a(solidSummaryCommunicationsDelegate$NotificationStateArr);
    }

    public static SolidSummaryCommunicationsDelegate$NotificationState valueOf(String str) {
        return (SolidSummaryCommunicationsDelegate$NotificationState) Enum.valueOf(SolidSummaryCommunicationsDelegate$NotificationState.class, str);
    }

    public static SolidSummaryCommunicationsDelegate$NotificationState[] values() {
        return (SolidSummaryCommunicationsDelegate$NotificationState[]) $VALUES.clone();
    }
}
