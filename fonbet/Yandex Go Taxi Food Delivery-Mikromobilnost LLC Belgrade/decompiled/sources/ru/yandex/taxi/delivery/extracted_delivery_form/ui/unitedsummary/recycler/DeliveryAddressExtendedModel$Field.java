package ru.yandex.taxi.delivery.extracted_delivery_form.ui.unitedsummary.recycler;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/recycler/DeliveryAddressExtendedModel$Field", "", "Lru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/recycler/DeliveryAddressExtendedModel$Field;", "Porch", "Apartment", "Floor", "DoorPhone", "Comment", "extracted_delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryAddressExtendedModel$Field {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryAddressExtendedModel$Field[] $VALUES;
    public static final DeliveryAddressExtendedModel$Field Apartment;
    public static final DeliveryAddressExtendedModel$Field Comment;
    public static final DeliveryAddressExtendedModel$Field DoorPhone;
    public static final DeliveryAddressExtendedModel$Field Floor;
    public static final DeliveryAddressExtendedModel$Field Porch;

    static {
        DeliveryAddressExtendedModel$Field deliveryAddressExtendedModel$Field = new DeliveryAddressExtendedModel$Field("Porch", 0);
        Porch = deliveryAddressExtendedModel$Field;
        DeliveryAddressExtendedModel$Field deliveryAddressExtendedModel$Field2 = new DeliveryAddressExtendedModel$Field("Apartment", 1);
        Apartment = deliveryAddressExtendedModel$Field2;
        DeliveryAddressExtendedModel$Field deliveryAddressExtendedModel$Field3 = new DeliveryAddressExtendedModel$Field("Floor", 2);
        Floor = deliveryAddressExtendedModel$Field3;
        DeliveryAddressExtendedModel$Field deliveryAddressExtendedModel$Field4 = new DeliveryAddressExtendedModel$Field("DoorPhone", 3);
        DoorPhone = deliveryAddressExtendedModel$Field4;
        DeliveryAddressExtendedModel$Field deliveryAddressExtendedModel$Field5 = new DeliveryAddressExtendedModel$Field("Comment", 4);
        Comment = deliveryAddressExtendedModel$Field5;
        DeliveryAddressExtendedModel$Field[] deliveryAddressExtendedModel$FieldArr = {deliveryAddressExtendedModel$Field, deliveryAddressExtendedModel$Field2, deliveryAddressExtendedModel$Field3, deliveryAddressExtendedModel$Field4, deliveryAddressExtendedModel$Field5};
        $VALUES = deliveryAddressExtendedModel$FieldArr;
        $ENTRIES = a.a(deliveryAddressExtendedModel$FieldArr);
    }

    public static DeliveryAddressExtendedModel$Field valueOf(String str) {
        return (DeliveryAddressExtendedModel$Field) Enum.valueOf(DeliveryAddressExtendedModel$Field.class, str);
    }

    public static DeliveryAddressExtendedModel$Field[] values() {
        return (DeliveryAddressExtendedModel$Field[]) $VALUES.clone();
    }
}
