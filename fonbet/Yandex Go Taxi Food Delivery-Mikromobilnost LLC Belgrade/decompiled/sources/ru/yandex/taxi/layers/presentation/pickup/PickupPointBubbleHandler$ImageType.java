package ru.yandex.taxi.layers.presentation.pickup;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/layers/presentation/pickup/PickupPointBubbleHandler$ImageType", "", "Lru/yandex/taxi/layers/presentation/pickup/PickupPointBubbleHandler$ImageType;", "UNKNOWN", "IMAGE_TAG", "IMAGE_URL", "ICON", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final class PickupPointBubbleHandler$ImageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PickupPointBubbleHandler$ImageType[] $VALUES;
    public static final PickupPointBubbleHandler$ImageType ICON;
    public static final PickupPointBubbleHandler$ImageType IMAGE_TAG;
    public static final PickupPointBubbleHandler$ImageType IMAGE_URL;
    public static final PickupPointBubbleHandler$ImageType UNKNOWN;

    static {
        PickupPointBubbleHandler$ImageType pickupPointBubbleHandler$ImageType = new PickupPointBubbleHandler$ImageType("UNKNOWN", 0);
        UNKNOWN = pickupPointBubbleHandler$ImageType;
        PickupPointBubbleHandler$ImageType pickupPointBubbleHandler$ImageType2 = new PickupPointBubbleHandler$ImageType("IMAGE_TAG", 1);
        IMAGE_TAG = pickupPointBubbleHandler$ImageType2;
        PickupPointBubbleHandler$ImageType pickupPointBubbleHandler$ImageType3 = new PickupPointBubbleHandler$ImageType("IMAGE_URL", 2);
        IMAGE_URL = pickupPointBubbleHandler$ImageType3;
        PickupPointBubbleHandler$ImageType pickupPointBubbleHandler$ImageType4 = new PickupPointBubbleHandler$ImageType("ICON", 3);
        ICON = pickupPointBubbleHandler$ImageType4;
        PickupPointBubbleHandler$ImageType[] pickupPointBubbleHandler$ImageTypeArr = {pickupPointBubbleHandler$ImageType, pickupPointBubbleHandler$ImageType2, pickupPointBubbleHandler$ImageType3, pickupPointBubbleHandler$ImageType4};
        $VALUES = pickupPointBubbleHandler$ImageTypeArr;
        $ENTRIES = kotlin.enums.a.a(pickupPointBubbleHandler$ImageTypeArr);
    }

    public static PickupPointBubbleHandler$ImageType valueOf(String str) {
        return (PickupPointBubbleHandler$ImageType) Enum.valueOf(PickupPointBubbleHandler$ImageType.class, str);
    }

    public static PickupPointBubbleHandler$ImageType[] values() {
        return (PickupPointBubbleHandler$ImageType[]) $VALUES.clone();
    }
}
