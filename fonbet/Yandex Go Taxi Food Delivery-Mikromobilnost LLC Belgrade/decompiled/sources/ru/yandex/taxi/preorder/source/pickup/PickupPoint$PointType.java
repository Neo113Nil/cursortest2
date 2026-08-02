package ru.yandex.taxi.preorder.source.pickup;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/preorder/source/pickup/PickupPoint$PointType", "", "Lru/yandex/taxi/preorder/source/pickup/PickupPoint$PointType;", "PICKUP_POINT", "STOP", "USER_PLACE", "EDA", "DRIVE", "PROMO", "FAVORITES", "UNKNOWN", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PickupPoint$PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PickupPoint$PointType[] $VALUES;
    public static final PickupPoint$PointType DRIVE;
    public static final PickupPoint$PointType EDA;
    public static final PickupPoint$PointType FAVORITES;
    public static final PickupPoint$PointType PICKUP_POINT;
    public static final PickupPoint$PointType PROMO;
    public static final PickupPoint$PointType STOP;
    public static final PickupPoint$PointType UNKNOWN;
    public static final PickupPoint$PointType USER_PLACE;

    static {
        PickupPoint$PointType pickupPoint$PointType = new PickupPoint$PointType("PICKUP_POINT", 0);
        PICKUP_POINT = pickupPoint$PointType;
        PickupPoint$PointType pickupPoint$PointType2 = new PickupPoint$PointType("STOP", 1);
        STOP = pickupPoint$PointType2;
        PickupPoint$PointType pickupPoint$PointType3 = new PickupPoint$PointType("USER_PLACE", 2);
        USER_PLACE = pickupPoint$PointType3;
        PickupPoint$PointType pickupPoint$PointType4 = new PickupPoint$PointType("EDA", 3);
        EDA = pickupPoint$PointType4;
        PickupPoint$PointType pickupPoint$PointType5 = new PickupPoint$PointType("DRIVE", 4);
        DRIVE = pickupPoint$PointType5;
        PickupPoint$PointType pickupPoint$PointType6 = new PickupPoint$PointType("PROMO", 5);
        PROMO = pickupPoint$PointType6;
        PickupPoint$PointType pickupPoint$PointType7 = new PickupPoint$PointType("FAVORITES", 6);
        FAVORITES = pickupPoint$PointType7;
        PickupPoint$PointType pickupPoint$PointType8 = new PickupPoint$PointType("UNKNOWN", 7);
        UNKNOWN = pickupPoint$PointType8;
        PickupPoint$PointType[] pickupPoint$PointTypeArr = {pickupPoint$PointType, pickupPoint$PointType2, pickupPoint$PointType3, pickupPoint$PointType4, pickupPoint$PointType5, pickupPoint$PointType6, pickupPoint$PointType7, pickupPoint$PointType8};
        $VALUES = pickupPoint$PointTypeArr;
        $ENTRIES = kotlin.enums.a.a(pickupPoint$PointTypeArr);
    }

    public static PickupPoint$PointType valueOf(String str) {
        return (PickupPoint$PointType) Enum.valueOf(PickupPoint$PointType.class, str);
    }

    public static PickupPoint$PointType[] values() {
        return (PickupPoint$PointType[]) $VALUES.clone();
    }
}
