package ru.yandex.taxi.map.overlay;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/map/overlay/RecenterType;", "", "ALL_ROUTE", "USER_LOCATION", "ALTPIN_A_ON_DRIVING", "CUSTOM_FROM_ORDER", "DESTINATION", "SAVED_POSITION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RecenterType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RecenterType[] $VALUES;
    public static final RecenterType ALL_ROUTE;
    public static final RecenterType ALTPIN_A_ON_DRIVING;
    public static final RecenterType CUSTOM_FROM_ORDER;
    public static final RecenterType DESTINATION;
    public static final RecenterType SAVED_POSITION;
    public static final RecenterType USER_LOCATION;

    static {
        RecenterType recenterType = new RecenterType("ALL_ROUTE", 0);
        ALL_ROUTE = recenterType;
        RecenterType recenterType2 = new RecenterType("USER_LOCATION", 1);
        USER_LOCATION = recenterType2;
        RecenterType recenterType3 = new RecenterType("ALTPIN_A_ON_DRIVING", 2);
        ALTPIN_A_ON_DRIVING = recenterType3;
        RecenterType recenterType4 = new RecenterType("CUSTOM_FROM_ORDER", 3);
        CUSTOM_FROM_ORDER = recenterType4;
        RecenterType recenterType5 = new RecenterType("DESTINATION", 4);
        DESTINATION = recenterType5;
        RecenterType recenterType6 = new RecenterType("SAVED_POSITION", 5);
        SAVED_POSITION = recenterType6;
        RecenterType[] recenterTypeArr = {recenterType, recenterType2, recenterType3, recenterType4, recenterType5, recenterType6};
        $VALUES = recenterTypeArr;
        $ENTRIES = kotlin.enums.a.a(recenterTypeArr);
    }

    public static RecenterType valueOf(String str) {
        return (RecenterType) Enum.valueOf(RecenterType.class, str);
    }

    public static RecenterType[] values() {
        return (RecenterType[]) $VALUES.clone();
    }
}
