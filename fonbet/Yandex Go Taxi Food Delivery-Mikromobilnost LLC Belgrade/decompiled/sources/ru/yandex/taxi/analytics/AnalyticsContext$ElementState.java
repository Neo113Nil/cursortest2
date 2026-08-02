package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/analytics/AnalyticsContext$ElementState", "", "Lru/yandex/taxi/analytics/AnalyticsContext$ElementState;", "CARD", "SCREEN", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsContext$ElementState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnalyticsContext$ElementState[] $VALUES;
    public static final AnalyticsContext$ElementState CARD;
    public static final AnalyticsContext$ElementState SCREEN;

    static {
        AnalyticsContext$ElementState analyticsContext$ElementState = new AnalyticsContext$ElementState("CARD", 0);
        CARD = analyticsContext$ElementState;
        AnalyticsContext$ElementState analyticsContext$ElementState2 = new AnalyticsContext$ElementState("SCREEN", 1);
        SCREEN = analyticsContext$ElementState2;
        AnalyticsContext$ElementState[] analyticsContext$ElementStateArr = {analyticsContext$ElementState, analyticsContext$ElementState2};
        $VALUES = analyticsContext$ElementStateArr;
        $ENTRIES = a.a(analyticsContext$ElementStateArr);
    }

    public static AnalyticsContext$ElementState valueOf(String str) {
        return (AnalyticsContext$ElementState) Enum.valueOf(AnalyticsContext$ElementState.class, str);
    }

    public static AnalyticsContext$ElementState[] values() {
        return (AnalyticsContext$ElementState[]) $VALUES.clone();
    }
}
