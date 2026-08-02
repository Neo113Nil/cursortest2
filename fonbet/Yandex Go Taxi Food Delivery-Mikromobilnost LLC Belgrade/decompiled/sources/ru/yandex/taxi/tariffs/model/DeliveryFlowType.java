package ru.yandex.taxi.tariffs.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/tariffs/model/DeliveryFlowType;", "", "DEFAULT", "NDD_FORM_V1", "NDD_FORM_V2", "ROVER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeliveryFlowType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryFlowType[] $VALUES;
    public static final DeliveryFlowType DEFAULT;
    public static final DeliveryFlowType NDD_FORM_V1;
    public static final DeliveryFlowType NDD_FORM_V2;
    public static final DeliveryFlowType ROVER;

    static {
        DeliveryFlowType deliveryFlowType = new DeliveryFlowType("DEFAULT", 0);
        DEFAULT = deliveryFlowType;
        DeliveryFlowType deliveryFlowType2 = new DeliveryFlowType("NDD_FORM_V1", 1);
        NDD_FORM_V1 = deliveryFlowType2;
        DeliveryFlowType deliveryFlowType3 = new DeliveryFlowType("NDD_FORM_V2", 2);
        NDD_FORM_V2 = deliveryFlowType3;
        DeliveryFlowType deliveryFlowType4 = new DeliveryFlowType("ROVER", 3);
        ROVER = deliveryFlowType4;
        DeliveryFlowType[] deliveryFlowTypeArr = {deliveryFlowType, deliveryFlowType2, deliveryFlowType3, deliveryFlowType4};
        $VALUES = deliveryFlowTypeArr;
        $ENTRIES = kotlin.enums.a.a(deliveryFlowTypeArr);
    }

    public static DeliveryFlowType valueOf(String str) {
        return (DeliveryFlowType) Enum.valueOf(DeliveryFlowType.class, str);
    }

    public static DeliveryFlowType[] values() {
        return (DeliveryFlowType[]) $VALUES.clone();
    }
}
