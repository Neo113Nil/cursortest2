package ru.yandex.taxi.delivery.extracted_form_common_data.extra;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/delivery/extracted_form_common_data/extra/DeliveryBubblePosition;", "", "CENTER", "OFFSET_START", "OFFSET_END", "TOP_LEFT", "extracted_form_common_data"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryBubblePosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryBubblePosition[] $VALUES;
    public static final DeliveryBubblePosition CENTER;
    public static final DeliveryBubblePosition OFFSET_END;
    public static final DeliveryBubblePosition OFFSET_START;
    public static final DeliveryBubblePosition TOP_LEFT;

    static {
        DeliveryBubblePosition deliveryBubblePosition = new DeliveryBubblePosition("CENTER", 0);
        CENTER = deliveryBubblePosition;
        DeliveryBubblePosition deliveryBubblePosition2 = new DeliveryBubblePosition("OFFSET_START", 1);
        OFFSET_START = deliveryBubblePosition2;
        DeliveryBubblePosition deliveryBubblePosition3 = new DeliveryBubblePosition("OFFSET_END", 2);
        OFFSET_END = deliveryBubblePosition3;
        DeliveryBubblePosition deliveryBubblePosition4 = new DeliveryBubblePosition("TOP_LEFT", 3);
        TOP_LEFT = deliveryBubblePosition4;
        DeliveryBubblePosition[] deliveryBubblePositionArr = {deliveryBubblePosition, deliveryBubblePosition2, deliveryBubblePosition3, deliveryBubblePosition4};
        $VALUES = deliveryBubblePositionArr;
        $ENTRIES = a.a(deliveryBubblePositionArr);
    }

    public static DeliveryBubblePosition valueOf(String str) {
        return (DeliveryBubblePosition) Enum.valueOf(DeliveryBubblePosition.class, str);
    }

    public static DeliveryBubblePosition[] values() {
        return (DeliveryBubblePosition[]) $VALUES.clone();
    }
}
