package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/pin/war/PinWarGeometryEasing;", "", "LINEAR", "EASE_IN", "EASE_OUT", "EASE_IN_OUT", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PinWarGeometryEasing {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinWarGeometryEasing[] $VALUES;
    public static final PinWarGeometryEasing EASE_IN;
    public static final PinWarGeometryEasing EASE_IN_OUT;
    public static final PinWarGeometryEasing EASE_OUT;
    public static final PinWarGeometryEasing LINEAR;

    static {
        PinWarGeometryEasing pinWarGeometryEasing = new PinWarGeometryEasing("LINEAR", 0);
        LINEAR = pinWarGeometryEasing;
        PinWarGeometryEasing pinWarGeometryEasing2 = new PinWarGeometryEasing("EASE_IN", 1);
        EASE_IN = pinWarGeometryEasing2;
        PinWarGeometryEasing pinWarGeometryEasing3 = new PinWarGeometryEasing("EASE_OUT", 2);
        EASE_OUT = pinWarGeometryEasing3;
        PinWarGeometryEasing pinWarGeometryEasing4 = new PinWarGeometryEasing("EASE_IN_OUT", 3);
        EASE_IN_OUT = pinWarGeometryEasing4;
        PinWarGeometryEasing[] pinWarGeometryEasingArr = {pinWarGeometryEasing, pinWarGeometryEasing2, pinWarGeometryEasing3, pinWarGeometryEasing4};
        $VALUES = pinWarGeometryEasingArr;
        $ENTRIES = kotlin.enums.a.a(pinWarGeometryEasingArr);
    }

    public static PinWarGeometryEasing valueOf(String str) {
        return (PinWarGeometryEasing) Enum.valueOf(PinWarGeometryEasing.class, str);
    }

    public static PinWarGeometryEasing[] values() {
        return (PinWarGeometryEasing[]) $VALUES.clone();
    }
}
