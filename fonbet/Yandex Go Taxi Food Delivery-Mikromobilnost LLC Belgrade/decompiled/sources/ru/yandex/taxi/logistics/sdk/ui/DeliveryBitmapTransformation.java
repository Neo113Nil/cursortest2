package ru.yandex.taxi.logistics.sdk.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/DeliveryBitmapTransformation;", "", "FIT_CENTER", "sdk-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryBitmapTransformation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryBitmapTransformation[] $VALUES;
    public static final DeliveryBitmapTransformation FIT_CENTER;

    static {
        DeliveryBitmapTransformation deliveryBitmapTransformation = new DeliveryBitmapTransformation("FIT_CENTER", 0);
        FIT_CENTER = deliveryBitmapTransformation;
        DeliveryBitmapTransformation[] deliveryBitmapTransformationArr = {deliveryBitmapTransformation};
        $VALUES = deliveryBitmapTransformationArr;
        $ENTRIES = kotlin.enums.a.a(deliveryBitmapTransformationArr);
    }

    public static DeliveryBitmapTransformation valueOf(String str) {
        return (DeliveryBitmapTransformation) Enum.valueOf(DeliveryBitmapTransformation.class, str);
    }

    public static DeliveryBitmapTransformation[] values() {
        return (DeliveryBitmapTransformation[]) $VALUES.clone();
    }
}
