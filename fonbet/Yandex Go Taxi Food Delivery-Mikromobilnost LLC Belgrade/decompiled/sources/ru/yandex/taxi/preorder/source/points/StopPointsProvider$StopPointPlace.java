package ru.yandex.taxi.preorder.source.points;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/preorder/source/points/StopPointsProvider$StopPointPlace", "", "Lru/yandex/taxi/preorder/source/points/StopPointsProvider$StopPointPlace;", "MAP", "VIEW", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StopPointsProvider$StopPointPlace {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StopPointsProvider$StopPointPlace[] $VALUES;
    public static final StopPointsProvider$StopPointPlace MAP;
    public static final StopPointsProvider$StopPointPlace VIEW;

    static {
        StopPointsProvider$StopPointPlace stopPointsProvider$StopPointPlace = new StopPointsProvider$StopPointPlace("MAP", 0);
        MAP = stopPointsProvider$StopPointPlace;
        StopPointsProvider$StopPointPlace stopPointsProvider$StopPointPlace2 = new StopPointsProvider$StopPointPlace("VIEW", 1);
        VIEW = stopPointsProvider$StopPointPlace2;
        StopPointsProvider$StopPointPlace[] stopPointsProvider$StopPointPlaceArr = {stopPointsProvider$StopPointPlace, stopPointsProvider$StopPointPlace2};
        $VALUES = stopPointsProvider$StopPointPlaceArr;
        $ENTRIES = kotlin.enums.a.a(stopPointsProvider$StopPointPlaceArr);
    }

    public static StopPointsProvider$StopPointPlace valueOf(String str) {
        return (StopPointsProvider$StopPointPlace) Enum.valueOf(StopPointsProvider$StopPointPlace.class, str);
    }

    public static StopPointsProvider$StopPointPlace[] values() {
        return (StopPointsProvider$StopPointPlace[]) $VALUES.clone();
    }
}
