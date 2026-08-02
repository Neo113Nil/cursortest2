package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/logistics/sdk/delivery/state/DeliveryState$Poll$Question$AnswersAlignment", "", "Lru/yandex/taxi/logistics/sdk/delivery/state/DeliveryState$Poll$Question$AnswersAlignment;", "TRAIL", "BOTTOM", "sdk-delivery"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryState$Poll$Question$AnswersAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryState$Poll$Question$AnswersAlignment[] $VALUES;
    public static final DeliveryState$Poll$Question$AnswersAlignment BOTTOM;
    public static final DeliveryState$Poll$Question$AnswersAlignment TRAIL;

    static {
        DeliveryState$Poll$Question$AnswersAlignment deliveryState$Poll$Question$AnswersAlignment = new DeliveryState$Poll$Question$AnswersAlignment("TRAIL", 0);
        TRAIL = deliveryState$Poll$Question$AnswersAlignment;
        DeliveryState$Poll$Question$AnswersAlignment deliveryState$Poll$Question$AnswersAlignment2 = new DeliveryState$Poll$Question$AnswersAlignment("BOTTOM", 1);
        BOTTOM = deliveryState$Poll$Question$AnswersAlignment2;
        DeliveryState$Poll$Question$AnswersAlignment[] deliveryState$Poll$Question$AnswersAlignmentArr = {deliveryState$Poll$Question$AnswersAlignment, deliveryState$Poll$Question$AnswersAlignment2};
        $VALUES = deliveryState$Poll$Question$AnswersAlignmentArr;
        $ENTRIES = kotlin.enums.a.a(deliveryState$Poll$Question$AnswersAlignmentArr);
    }

    public static DeliveryState$Poll$Question$AnswersAlignment valueOf(String str) {
        return (DeliveryState$Poll$Question$AnswersAlignment) Enum.valueOf(DeliveryState$Poll$Question$AnswersAlignment.class, str);
    }

    public static DeliveryState$Poll$Question$AnswersAlignment[] values() {
        return (DeliveryState$Poll$Question$AnswersAlignment[]) $VALUES.clone();
    }
}
