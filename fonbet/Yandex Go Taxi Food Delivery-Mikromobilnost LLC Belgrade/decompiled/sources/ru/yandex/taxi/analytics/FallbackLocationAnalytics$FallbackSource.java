package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"ru/yandex/taxi/analytics/FallbackLocationAnalytics$FallbackSource", "", "Lru/yandex/taxi/analytics/FallbackLocationAnalytics$FallbackSource;", "PREDEFINED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FallbackLocationAnalytics$FallbackSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FallbackLocationAnalytics$FallbackSource[] $VALUES;
    public static final FallbackLocationAnalytics$FallbackSource PREDEFINED;

    static {
        FallbackLocationAnalytics$FallbackSource fallbackLocationAnalytics$FallbackSource = new FallbackLocationAnalytics$FallbackSource("PREDEFINED", 0);
        PREDEFINED = fallbackLocationAnalytics$FallbackSource;
        FallbackLocationAnalytics$FallbackSource[] fallbackLocationAnalytics$FallbackSourceArr = {fallbackLocationAnalytics$FallbackSource};
        $VALUES = fallbackLocationAnalytics$FallbackSourceArr;
        $ENTRIES = a.a(fallbackLocationAnalytics$FallbackSourceArr);
    }

    public static FallbackLocationAnalytics$FallbackSource valueOf(String str) {
        return (FallbackLocationAnalytics$FallbackSource) Enum.valueOf(FallbackLocationAnalytics$FallbackSource.class, str);
    }

    public static FallbackLocationAnalytics$FallbackSource[] values() {
        return (FallbackLocationAnalytics$FallbackSource[]) $VALUES.clone();
    }
}
