package ru.yandex.taxi.perf.screen;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/perf/screen/PerformanceScreenName;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Summary", "TaxiMain", "Suggest", "TransportDiscovery", "BenefitsCenter", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PerformanceScreenName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PerformanceScreenName[] $VALUES;
    public static final PerformanceScreenName BenefitsCenter;
    public static final PerformanceScreenName Suggest;
    public static final PerformanceScreenName Summary;
    public static final PerformanceScreenName TaxiMain;
    public static final PerformanceScreenName TransportDiscovery;
    private final String analyticsName;

    static {
        PerformanceScreenName performanceScreenName = new PerformanceScreenName("Summary", 0, "Summary");
        Summary = performanceScreenName;
        PerformanceScreenName performanceScreenName2 = new PerformanceScreenName("TaxiMain", 1, "TaxiMain");
        TaxiMain = performanceScreenName2;
        PerformanceScreenName performanceScreenName3 = new PerformanceScreenName("Suggest", 2, "Suggest");
        Suggest = performanceScreenName3;
        PerformanceScreenName performanceScreenName4 = new PerformanceScreenName("TransportDiscovery", 3, "TransportDiscovery");
        TransportDiscovery = performanceScreenName4;
        PerformanceScreenName performanceScreenName5 = new PerformanceScreenName("BenefitsCenter", 4, "BenefitsCenter");
        BenefitsCenter = performanceScreenName5;
        PerformanceScreenName[] performanceScreenNameArr = {performanceScreenName, performanceScreenName2, performanceScreenName3, performanceScreenName4, performanceScreenName5};
        $VALUES = performanceScreenNameArr;
        $ENTRIES = kotlin.enums.a.a(performanceScreenNameArr);
    }

    public PerformanceScreenName(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static PerformanceScreenName valueOf(String str) {
        return (PerformanceScreenName) Enum.valueOf(PerformanceScreenName.class, str);
    }

    public static PerformanceScreenName[] values() {
        return (PerformanceScreenName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
