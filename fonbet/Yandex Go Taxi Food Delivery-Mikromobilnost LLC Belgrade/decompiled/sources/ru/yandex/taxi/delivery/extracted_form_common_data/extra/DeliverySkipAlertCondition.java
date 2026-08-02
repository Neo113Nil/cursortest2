package ru.yandex.taxi.delivery.extracted_form_common_data.extra;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/delivery/extracted_form_common_data/extra/DeliverySkipAlertCondition;", "", "REQUIREMENT_NOT_SELECTED", "NEVER", "ALWAYS", "extracted_form_common_data"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliverySkipAlertCondition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliverySkipAlertCondition[] $VALUES;
    public static final DeliverySkipAlertCondition ALWAYS;
    public static final DeliverySkipAlertCondition NEVER;
    public static final DeliverySkipAlertCondition REQUIREMENT_NOT_SELECTED;

    static {
        DeliverySkipAlertCondition deliverySkipAlertCondition = new DeliverySkipAlertCondition("REQUIREMENT_NOT_SELECTED", 0);
        REQUIREMENT_NOT_SELECTED = deliverySkipAlertCondition;
        DeliverySkipAlertCondition deliverySkipAlertCondition2 = new DeliverySkipAlertCondition("NEVER", 1);
        NEVER = deliverySkipAlertCondition2;
        DeliverySkipAlertCondition deliverySkipAlertCondition3 = new DeliverySkipAlertCondition("ALWAYS", 2);
        ALWAYS = deliverySkipAlertCondition3;
        DeliverySkipAlertCondition[] deliverySkipAlertConditionArr = {deliverySkipAlertCondition, deliverySkipAlertCondition2, deliverySkipAlertCondition3};
        $VALUES = deliverySkipAlertConditionArr;
        $ENTRIES = a.a(deliverySkipAlertConditionArr);
    }

    public static DeliverySkipAlertCondition valueOf(String str) {
        return (DeliverySkipAlertCondition) Enum.valueOf(DeliverySkipAlertCondition.class, str);
    }

    public static DeliverySkipAlertCondition[] values() {
        return (DeliverySkipAlertCondition[]) $VALUES.clone();
    }
}
