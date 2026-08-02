package ru.yandex.taxi.logistics.sdk.ui.theme.fonts;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/theme/fonts/DeliveryTypeface;", "", "REGULAR", "LIGHT", "THIN", "MEDIUM", "BOLD", "HEAVY", "sdk-ui-theme"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryTypeface {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryTypeface[] $VALUES;
    public static final DeliveryTypeface BOLD;
    public static final DeliveryTypeface HEAVY;
    public static final DeliveryTypeface LIGHT;
    public static final DeliveryTypeface MEDIUM;
    public static final DeliveryTypeface REGULAR;
    public static final DeliveryTypeface THIN;

    static {
        DeliveryTypeface deliveryTypeface = new DeliveryTypeface("REGULAR", 0);
        REGULAR = deliveryTypeface;
        DeliveryTypeface deliveryTypeface2 = new DeliveryTypeface("LIGHT", 1);
        LIGHT = deliveryTypeface2;
        DeliveryTypeface deliveryTypeface3 = new DeliveryTypeface("THIN", 2);
        THIN = deliveryTypeface3;
        DeliveryTypeface deliveryTypeface4 = new DeliveryTypeface("MEDIUM", 3);
        MEDIUM = deliveryTypeface4;
        DeliveryTypeface deliveryTypeface5 = new DeliveryTypeface("BOLD", 4);
        BOLD = deliveryTypeface5;
        DeliveryTypeface deliveryTypeface6 = new DeliveryTypeface("HEAVY", 5);
        HEAVY = deliveryTypeface6;
        DeliveryTypeface[] deliveryTypefaceArr = {deliveryTypeface, deliveryTypeface2, deliveryTypeface3, deliveryTypeface4, deliveryTypeface5, deliveryTypeface6};
        $VALUES = deliveryTypefaceArr;
        $ENTRIES = a.a(deliveryTypefaceArr);
    }

    public static DeliveryTypeface valueOf(String str) {
        return (DeliveryTypeface) Enum.valueOf(DeliveryTypeface.class, str);
    }

    public static DeliveryTypeface[] values() {
        return (DeliveryTypeface[]) $VALUES.clone();
    }
}
