package ru.yandex.taxi.perf.screen;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/perf/screen/ScreenPerformanceState;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "INITIAL", "FIRST_CONTENTFUL_PAINT", "LARGEST_CONTENTFUL_PAINT", "INTERRUPTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenPerformanceState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScreenPerformanceState[] $VALUES;
    public static final ScreenPerformanceState FIRST_CONTENTFUL_PAINT;
    public static final ScreenPerformanceState INITIAL;
    public static final ScreenPerformanceState INTERRUPTED;
    public static final ScreenPerformanceState LARGEST_CONTENTFUL_PAINT;
    private final String analyticsName;

    static {
        ScreenPerformanceState screenPerformanceState = new ScreenPerformanceState("INITIAL", 0, "Initial");
        INITIAL = screenPerformanceState;
        ScreenPerformanceState screenPerformanceState2 = new ScreenPerformanceState("FIRST_CONTENTFUL_PAINT", 1, "FirstContentfulPaint");
        FIRST_CONTENTFUL_PAINT = screenPerformanceState2;
        ScreenPerformanceState screenPerformanceState3 = new ScreenPerformanceState("LARGEST_CONTENTFUL_PAINT", 2, "LargestContentfulPaint");
        LARGEST_CONTENTFUL_PAINT = screenPerformanceState3;
        ScreenPerformanceState screenPerformanceState4 = new ScreenPerformanceState("INTERRUPTED", 3, "Interrupted");
        INTERRUPTED = screenPerformanceState4;
        ScreenPerformanceState[] screenPerformanceStateArr = {screenPerformanceState, screenPerformanceState2, screenPerformanceState3, screenPerformanceState4};
        $VALUES = screenPerformanceStateArr;
        $ENTRIES = kotlin.enums.a.a(screenPerformanceStateArr);
    }

    public ScreenPerformanceState(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static ScreenPerformanceState valueOf(String str) {
        return (ScreenPerformanceState) Enum.valueOf(ScreenPerformanceState.class, str);
    }

    public static ScreenPerformanceState[] values() {
        return (ScreenPerformanceState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
