package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/preorder/summary/solid/sourcedestination/RideTimeAppearanceType;", "", "PLAIN_TEXT", "SINGLE_ICON", "ICON_WITH_BACKGROUND", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RideTimeAppearanceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideTimeAppearanceType[] $VALUES;
    public static final RideTimeAppearanceType ICON_WITH_BACKGROUND;
    public static final RideTimeAppearanceType PLAIN_TEXT;
    public static final RideTimeAppearanceType SINGLE_ICON;

    static {
        RideTimeAppearanceType rideTimeAppearanceType = new RideTimeAppearanceType("PLAIN_TEXT", 0);
        PLAIN_TEXT = rideTimeAppearanceType;
        RideTimeAppearanceType rideTimeAppearanceType2 = new RideTimeAppearanceType("SINGLE_ICON", 1);
        SINGLE_ICON = rideTimeAppearanceType2;
        RideTimeAppearanceType rideTimeAppearanceType3 = new RideTimeAppearanceType("ICON_WITH_BACKGROUND", 2);
        ICON_WITH_BACKGROUND = rideTimeAppearanceType3;
        RideTimeAppearanceType[] rideTimeAppearanceTypeArr = {rideTimeAppearanceType, rideTimeAppearanceType2, rideTimeAppearanceType3};
        $VALUES = rideTimeAppearanceTypeArr;
        $ENTRIES = kotlin.enums.a.a(rideTimeAppearanceTypeArr);
    }

    public static RideTimeAppearanceType valueOf(String str) {
        return (RideTimeAppearanceType) Enum.valueOf(RideTimeAppearanceType.class, str);
    }

    public static RideTimeAppearanceType[] values() {
        return (RideTimeAppearanceType[]) $VALUES.clone();
    }
}
