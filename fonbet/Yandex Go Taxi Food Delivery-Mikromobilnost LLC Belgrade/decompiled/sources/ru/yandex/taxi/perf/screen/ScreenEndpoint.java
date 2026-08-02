package ru.yandex.taxi.perf.screen;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/perf/screen/ScreenEndpoint;", "", "", "analyticName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FinalSuggest", "ZoneInfo", "RouteStats", "Suggest", "ZeroSuggest", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScreenEndpoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScreenEndpoint[] $VALUES;
    public static final ScreenEndpoint FinalSuggest;
    public static final ScreenEndpoint RouteStats;
    public static final ScreenEndpoint Suggest;
    public static final ScreenEndpoint ZeroSuggest;
    public static final ScreenEndpoint ZoneInfo;
    private final String analyticName;

    static {
        ScreenEndpoint screenEndpoint = new ScreenEndpoint("FinalSuggest", 0, "finalsuggest");
        FinalSuggest = screenEndpoint;
        ScreenEndpoint screenEndpoint2 = new ScreenEndpoint("ZoneInfo", 1, "zoneinfo");
        ZoneInfo = screenEndpoint2;
        ScreenEndpoint screenEndpoint3 = new ScreenEndpoint("RouteStats", 2, "routestats");
        RouteStats = screenEndpoint3;
        ScreenEndpoint screenEndpoint4 = new ScreenEndpoint("Suggest", 3, "suggest");
        Suggest = screenEndpoint4;
        ScreenEndpoint screenEndpoint5 = new ScreenEndpoint("ZeroSuggest", 4, "zerosuggest");
        ZeroSuggest = screenEndpoint5;
        ScreenEndpoint[] screenEndpointArr = {screenEndpoint, screenEndpoint2, screenEndpoint3, screenEndpoint4, screenEndpoint5};
        $VALUES = screenEndpointArr;
        $ENTRIES = kotlin.enums.a.a(screenEndpointArr);
    }

    public ScreenEndpoint(String str, int i, String str2) {
        this.analyticName = str2;
    }

    public static ScreenEndpoint valueOf(String str) {
        return (ScreenEndpoint) Enum.valueOf(ScreenEndpoint.class, str);
    }

    public static ScreenEndpoint[] values() {
        return (ScreenEndpoint[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticName() {
        return this.analyticName;
    }
}
