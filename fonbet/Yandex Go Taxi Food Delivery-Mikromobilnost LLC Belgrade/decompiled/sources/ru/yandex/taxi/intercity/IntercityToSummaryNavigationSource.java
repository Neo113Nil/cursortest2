package ru.yandex.taxi.intercity;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/intercity/IntercityToSummaryNavigationSource;", "", "INTERCITY_DASHBOARD_SCREEN", "INTERCITY_DISCOVERY_SCREEN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntercityToSummaryNavigationSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityToSummaryNavigationSource[] $VALUES;
    public static final IntercityToSummaryNavigationSource INTERCITY_DASHBOARD_SCREEN;
    public static final IntercityToSummaryNavigationSource INTERCITY_DISCOVERY_SCREEN;

    static {
        IntercityToSummaryNavigationSource intercityToSummaryNavigationSource = new IntercityToSummaryNavigationSource("INTERCITY_DASHBOARD_SCREEN", 0);
        INTERCITY_DASHBOARD_SCREEN = intercityToSummaryNavigationSource;
        IntercityToSummaryNavigationSource intercityToSummaryNavigationSource2 = new IntercityToSummaryNavigationSource("INTERCITY_DISCOVERY_SCREEN", 1);
        INTERCITY_DISCOVERY_SCREEN = intercityToSummaryNavigationSource2;
        IntercityToSummaryNavigationSource[] intercityToSummaryNavigationSourceArr = {intercityToSummaryNavigationSource, intercityToSummaryNavigationSource2};
        $VALUES = intercityToSummaryNavigationSourceArr;
        $ENTRIES = kotlin.enums.a.a(intercityToSummaryNavigationSourceArr);
    }

    public static IntercityToSummaryNavigationSource valueOf(String str) {
        return (IntercityToSummaryNavigationSource) Enum.valueOf(IntercityToSummaryNavigationSource.class, str);
    }

    public static IntercityToSummaryNavigationSource[] values() {
        return (IntercityToSummaryNavigationSource[]) $VALUES.clone();
    }
}
