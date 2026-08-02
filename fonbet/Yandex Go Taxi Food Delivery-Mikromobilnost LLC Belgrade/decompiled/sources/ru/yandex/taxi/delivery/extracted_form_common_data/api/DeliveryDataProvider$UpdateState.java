package ru.yandex.taxi.delivery.extracted_form_common_data.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/delivery/extracted_form_common_data/api/DeliveryDataProvider$UpdateState", "", "Lru/yandex/taxi/delivery/extracted_form_common_data/api/DeliveryDataProvider$UpdateState;", "NEED_UPDATE", "NOT_NEED_UPDATE", "extracted_form_common_data"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveryDataProvider$UpdateState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryDataProvider$UpdateState[] $VALUES;
    public static final DeliveryDataProvider$UpdateState NEED_UPDATE;
    public static final DeliveryDataProvider$UpdateState NOT_NEED_UPDATE;

    static {
        DeliveryDataProvider$UpdateState deliveryDataProvider$UpdateState = new DeliveryDataProvider$UpdateState("NEED_UPDATE", 0);
        NEED_UPDATE = deliveryDataProvider$UpdateState;
        DeliveryDataProvider$UpdateState deliveryDataProvider$UpdateState2 = new DeliveryDataProvider$UpdateState("NOT_NEED_UPDATE", 1);
        NOT_NEED_UPDATE = deliveryDataProvider$UpdateState2;
        DeliveryDataProvider$UpdateState[] deliveryDataProvider$UpdateStateArr = {deliveryDataProvider$UpdateState, deliveryDataProvider$UpdateState2};
        $VALUES = deliveryDataProvider$UpdateStateArr;
        $ENTRIES = a.a(deliveryDataProvider$UpdateStateArr);
    }

    public static DeliveryDataProvider$UpdateState valueOf(String str) {
        return (DeliveryDataProvider$UpdateState) Enum.valueOf(DeliveryDataProvider$UpdateState.class, str);
    }

    public static DeliveryDataProvider$UpdateState[] values() {
        return (DeliveryDataProvider$UpdateState[]) $VALUES.clone();
    }
}
