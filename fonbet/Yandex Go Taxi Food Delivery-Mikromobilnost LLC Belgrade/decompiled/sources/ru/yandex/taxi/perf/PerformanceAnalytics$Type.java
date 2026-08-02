package ru.yandex.taxi.perf;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/perf/PerformanceAnalytics$Type", "", "Lru/yandex/taxi/perf/PerformanceAnalytics$Type;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Inflate", "Loading", "Animation", "Bind", "Creating", "Time", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PerformanceAnalytics$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PerformanceAnalytics$Type[] $VALUES;
    public static final PerformanceAnalytics$Type Animation;
    public static final PerformanceAnalytics$Type Bind;
    public static final PerformanceAnalytics$Type Creating;
    public static final PerformanceAnalytics$Type Inflate;
    public static final PerformanceAnalytics$Type Loading;
    public static final PerformanceAnalytics$Type Time;
    private final String analyticsName;

    static {
        PerformanceAnalytics$Type performanceAnalytics$Type = new PerformanceAnalytics$Type("Inflate", 0, "Inflate");
        Inflate = performanceAnalytics$Type;
        PerformanceAnalytics$Type performanceAnalytics$Type2 = new PerformanceAnalytics$Type("Loading", 1, "Loading");
        Loading = performanceAnalytics$Type2;
        PerformanceAnalytics$Type performanceAnalytics$Type3 = new PerformanceAnalytics$Type("Animation", 2, "Animation");
        Animation = performanceAnalytics$Type3;
        PerformanceAnalytics$Type performanceAnalytics$Type4 = new PerformanceAnalytics$Type("Bind", 3, "Bind");
        Bind = performanceAnalytics$Type4;
        PerformanceAnalytics$Type performanceAnalytics$Type5 = new PerformanceAnalytics$Type("Creating", 4, "Creating");
        Creating = performanceAnalytics$Type5;
        PerformanceAnalytics$Type performanceAnalytics$Type6 = new PerformanceAnalytics$Type("Time", 5, "Time");
        Time = performanceAnalytics$Type6;
        PerformanceAnalytics$Type[] performanceAnalytics$TypeArr = {performanceAnalytics$Type, performanceAnalytics$Type2, performanceAnalytics$Type3, performanceAnalytics$Type4, performanceAnalytics$Type5, performanceAnalytics$Type6};
        $VALUES = performanceAnalytics$TypeArr;
        $ENTRIES = kotlin.enums.a.a(performanceAnalytics$TypeArr);
    }

    public PerformanceAnalytics$Type(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static PerformanceAnalytics$Type valueOf(String str) {
        return (PerformanceAnalytics$Type) Enum.valueOf(PerformanceAnalytics$Type.class, str);
    }

    public static PerformanceAnalytics$Type[] values() {
        return (PerformanceAnalytics$Type[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
