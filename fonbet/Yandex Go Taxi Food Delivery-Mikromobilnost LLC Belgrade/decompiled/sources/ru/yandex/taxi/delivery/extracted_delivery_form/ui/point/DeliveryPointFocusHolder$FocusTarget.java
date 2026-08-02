package ru.yandex.taxi.delivery.extracted_delivery_form.ui.point;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/delivery/extracted_delivery_form/ui/point/DeliveryPointFocusHolder$FocusTarget", "", "Lru/yandex/taxi/delivery/extracted_delivery_form/ui/point/DeliveryPointFocusHolder$FocusTarget;", "None", "Porch", "Apartment", "Floor", "DoorPhone", "Comment", "extracted_delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryPointFocusHolder$FocusTarget {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryPointFocusHolder$FocusTarget[] $VALUES;
    public static final DeliveryPointFocusHolder$FocusTarget Apartment;
    public static final DeliveryPointFocusHolder$FocusTarget Comment;
    public static final DeliveryPointFocusHolder$FocusTarget DoorPhone;
    public static final DeliveryPointFocusHolder$FocusTarget Floor;
    public static final DeliveryPointFocusHolder$FocusTarget None;
    public static final DeliveryPointFocusHolder$FocusTarget Porch;

    static {
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget = new DeliveryPointFocusHolder$FocusTarget("None", 0);
        None = deliveryPointFocusHolder$FocusTarget;
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget2 = new DeliveryPointFocusHolder$FocusTarget("Porch", 1);
        Porch = deliveryPointFocusHolder$FocusTarget2;
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget3 = new DeliveryPointFocusHolder$FocusTarget("Apartment", 2);
        Apartment = deliveryPointFocusHolder$FocusTarget3;
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget4 = new DeliveryPointFocusHolder$FocusTarget("Floor", 3);
        Floor = deliveryPointFocusHolder$FocusTarget4;
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget5 = new DeliveryPointFocusHolder$FocusTarget("DoorPhone", 4);
        DoorPhone = deliveryPointFocusHolder$FocusTarget5;
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget6 = new DeliveryPointFocusHolder$FocusTarget("Comment", 5);
        Comment = deliveryPointFocusHolder$FocusTarget6;
        DeliveryPointFocusHolder$FocusTarget[] deliveryPointFocusHolder$FocusTargetArr = {deliveryPointFocusHolder$FocusTarget, deliveryPointFocusHolder$FocusTarget2, deliveryPointFocusHolder$FocusTarget3, deliveryPointFocusHolder$FocusTarget4, deliveryPointFocusHolder$FocusTarget5, deliveryPointFocusHolder$FocusTarget6};
        $VALUES = deliveryPointFocusHolder$FocusTargetArr;
        $ENTRIES = a.a(deliveryPointFocusHolder$FocusTargetArr);
    }

    public static DeliveryPointFocusHolder$FocusTarget valueOf(String str) {
        return (DeliveryPointFocusHolder$FocusTarget) Enum.valueOf(DeliveryPointFocusHolder$FocusTarget.class, str);
    }

    public static DeliveryPointFocusHolder$FocusTarget[] values() {
        return (DeliveryPointFocusHolder$FocusTarget[]) $VALUES.clone();
    }
}
