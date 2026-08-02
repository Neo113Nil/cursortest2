package ru.yandex.taxi.delivery.extracted_form_common_data.extra;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/delivery/extracted_form_common_data/extra/DeliveryFormStepType;", "", "SOURCE", "DESTINATION", "extracted_form_common_data"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveryFormStepType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryFormStepType[] $VALUES;
    public static final DeliveryFormStepType DESTINATION;
    public static final DeliveryFormStepType SOURCE;

    static {
        DeliveryFormStepType deliveryFormStepType = new DeliveryFormStepType("SOURCE", 0);
        SOURCE = deliveryFormStepType;
        DeliveryFormStepType deliveryFormStepType2 = new DeliveryFormStepType("DESTINATION", 1);
        DESTINATION = deliveryFormStepType2;
        DeliveryFormStepType[] deliveryFormStepTypeArr = {deliveryFormStepType, deliveryFormStepType2};
        $VALUES = deliveryFormStepTypeArr;
        $ENTRIES = a.a(deliveryFormStepTypeArr);
    }

    public static DeliveryFormStepType valueOf(String str) {
        return (DeliveryFormStepType) Enum.valueOf(DeliveryFormStepType.class, str);
    }

    public static DeliveryFormStepType[] values() {
        return (DeliveryFormStepType[]) $VALUES.clone();
    }
}
