package ru.yandex.taxi.preorder.source;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/preorder/source/DrivingRoutes$Type", "", "Lru/yandex/taxi/preorder/source/DrivingRoutes$Type;", "NORMAL_MONOCHROME", "NORMAL_JAMS_COLORED", "ALTERNATIVE_MONOCHROME", "SELECTED_JAMS_COLORED", "OVERRIDE_MONOCHROME", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DrivingRoutes$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DrivingRoutes$Type[] $VALUES;
    public static final DrivingRoutes$Type ALTERNATIVE_MONOCHROME;
    public static final DrivingRoutes$Type NORMAL_JAMS_COLORED;
    public static final DrivingRoutes$Type NORMAL_MONOCHROME;
    public static final DrivingRoutes$Type OVERRIDE_MONOCHROME;
    public static final DrivingRoutes$Type SELECTED_JAMS_COLORED;

    static {
        DrivingRoutes$Type drivingRoutes$Type = new DrivingRoutes$Type("NORMAL_MONOCHROME", 0);
        NORMAL_MONOCHROME = drivingRoutes$Type;
        DrivingRoutes$Type drivingRoutes$Type2 = new DrivingRoutes$Type("NORMAL_JAMS_COLORED", 1);
        NORMAL_JAMS_COLORED = drivingRoutes$Type2;
        DrivingRoutes$Type drivingRoutes$Type3 = new DrivingRoutes$Type("ALTERNATIVE_MONOCHROME", 2);
        ALTERNATIVE_MONOCHROME = drivingRoutes$Type3;
        DrivingRoutes$Type drivingRoutes$Type4 = new DrivingRoutes$Type("SELECTED_JAMS_COLORED", 3);
        SELECTED_JAMS_COLORED = drivingRoutes$Type4;
        DrivingRoutes$Type drivingRoutes$Type5 = new DrivingRoutes$Type("OVERRIDE_MONOCHROME", 4);
        OVERRIDE_MONOCHROME = drivingRoutes$Type5;
        DrivingRoutes$Type[] drivingRoutes$TypeArr = {drivingRoutes$Type, drivingRoutes$Type2, drivingRoutes$Type3, drivingRoutes$Type4, drivingRoutes$Type5};
        $VALUES = drivingRoutes$TypeArr;
        $ENTRIES = kotlin.enums.a.a(drivingRoutes$TypeArr);
    }

    public static DrivingRoutes$Type valueOf(String str) {
        return (DrivingRoutes$Type) Enum.valueOf(DrivingRoutes$Type.class, str);
    }

    public static DrivingRoutes$Type[] values() {
        return (DrivingRoutes$Type[]) $VALUES.clone();
    }
}
