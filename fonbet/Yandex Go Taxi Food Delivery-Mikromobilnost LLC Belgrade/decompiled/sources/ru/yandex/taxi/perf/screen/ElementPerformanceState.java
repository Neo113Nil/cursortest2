package ru.yandex.taxi.perf.screen;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/perf/screen/ElementPerformanceState;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "INITIAL", "FIRST_CONTENTFUL_PAINT", "LARGEST_CONTENTFUL_PAINT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ElementPerformanceState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ElementPerformanceState[] $VALUES;
    public static final ElementPerformanceState FIRST_CONTENTFUL_PAINT;
    public static final ElementPerformanceState INITIAL;
    public static final ElementPerformanceState LARGEST_CONTENTFUL_PAINT;
    private final String analyticsName;

    static {
        ElementPerformanceState elementPerformanceState = new ElementPerformanceState("INITIAL", 0, "Initial");
        INITIAL = elementPerformanceState;
        ElementPerformanceState elementPerformanceState2 = new ElementPerformanceState("FIRST_CONTENTFUL_PAINT", 1, "FirstContentfulPaint");
        FIRST_CONTENTFUL_PAINT = elementPerformanceState2;
        ElementPerformanceState elementPerformanceState3 = new ElementPerformanceState("LARGEST_CONTENTFUL_PAINT", 2, "LargestContentfulPaint");
        LARGEST_CONTENTFUL_PAINT = elementPerformanceState3;
        ElementPerformanceState[] elementPerformanceStateArr = {elementPerformanceState, elementPerformanceState2, elementPerformanceState3};
        $VALUES = elementPerformanceStateArr;
        $ENTRIES = kotlin.enums.a.a(elementPerformanceStateArr);
    }

    public ElementPerformanceState(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static ElementPerformanceState valueOf(String str) {
        return (ElementPerformanceState) Enum.valueOf(ElementPerformanceState.class, str);
    }

    public static ElementPerformanceState[] values() {
        return (ElementPerformanceState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
