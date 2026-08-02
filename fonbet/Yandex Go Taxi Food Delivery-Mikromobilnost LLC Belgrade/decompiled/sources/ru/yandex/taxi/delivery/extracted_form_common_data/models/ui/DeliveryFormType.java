package ru.yandex.taxi.delivery.extracted_form_common_data.models.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/delivery/extracted_form_common_data/models/ui/DeliveryFormType;", "", "SHORT", "MINIMAL", "REDUCED", "FULL", "extracted_form_common_data"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryFormType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryFormType[] $VALUES;
    public static final DeliveryFormType FULL;
    public static final DeliveryFormType MINIMAL;
    public static final DeliveryFormType REDUCED;
    public static final DeliveryFormType SHORT;

    static {
        DeliveryFormType deliveryFormType = new DeliveryFormType("SHORT", 0);
        SHORT = deliveryFormType;
        DeliveryFormType deliveryFormType2 = new DeliveryFormType("MINIMAL", 1);
        MINIMAL = deliveryFormType2;
        DeliveryFormType deliveryFormType3 = new DeliveryFormType("REDUCED", 2);
        REDUCED = deliveryFormType3;
        DeliveryFormType deliveryFormType4 = new DeliveryFormType("FULL", 3);
        FULL = deliveryFormType4;
        DeliveryFormType[] deliveryFormTypeArr = {deliveryFormType, deliveryFormType2, deliveryFormType3, deliveryFormType4};
        $VALUES = deliveryFormTypeArr;
        $ENTRIES = a.a(deliveryFormTypeArr);
    }

    public static DeliveryFormType valueOf(String str) {
        return (DeliveryFormType) Enum.valueOf(DeliveryFormType.class, str);
    }

    public static DeliveryFormType[] values() {
        return (DeliveryFormType[]) $VALUES.clone();
    }
}
