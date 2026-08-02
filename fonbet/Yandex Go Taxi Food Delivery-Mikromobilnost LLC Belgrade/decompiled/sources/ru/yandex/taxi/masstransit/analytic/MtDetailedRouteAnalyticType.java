package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/analytic/MtDetailedRouteAnalyticType;", "", "Vertical", "Horizontal", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtDetailedRouteAnalyticType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtDetailedRouteAnalyticType[] $VALUES;
    public static final MtDetailedRouteAnalyticType Horizontal;
    public static final MtDetailedRouteAnalyticType Vertical;

    static {
        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = new MtDetailedRouteAnalyticType("Vertical", 0);
        Vertical = mtDetailedRouteAnalyticType;
        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = new MtDetailedRouteAnalyticType("Horizontal", 1);
        Horizontal = mtDetailedRouteAnalyticType2;
        MtDetailedRouteAnalyticType[] mtDetailedRouteAnalyticTypeArr = {mtDetailedRouteAnalyticType, mtDetailedRouteAnalyticType2};
        $VALUES = mtDetailedRouteAnalyticTypeArr;
        $ENTRIES = a.a(mtDetailedRouteAnalyticTypeArr);
    }

    public static MtDetailedRouteAnalyticType valueOf(String str) {
        return (MtDetailedRouteAnalyticType) Enum.valueOf(MtDetailedRouteAnalyticType.class, str);
    }

    public static MtDetailedRouteAnalyticType[] values() {
        return (MtDetailedRouteAnalyticType[]) $VALUES.clone();
    }
}
