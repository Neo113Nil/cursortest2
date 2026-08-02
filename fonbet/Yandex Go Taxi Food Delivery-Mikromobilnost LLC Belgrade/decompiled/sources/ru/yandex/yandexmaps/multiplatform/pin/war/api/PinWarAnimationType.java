package ru.yandex.yandexmaps.multiplatform.pin.war.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/pin/war/api/PinWarAnimationType;", "", "Smooth", "Linear", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PinWarAnimationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinWarAnimationType[] $VALUES;
    public static final PinWarAnimationType Linear;
    public static final PinWarAnimationType Smooth;

    static {
        PinWarAnimationType pinWarAnimationType = new PinWarAnimationType("Smooth", 0);
        Smooth = pinWarAnimationType;
        PinWarAnimationType pinWarAnimationType2 = new PinWarAnimationType("Linear", 1);
        Linear = pinWarAnimationType2;
        PinWarAnimationType[] pinWarAnimationTypeArr = {pinWarAnimationType, pinWarAnimationType2};
        $VALUES = pinWarAnimationTypeArr;
        $ENTRIES = a.a(pinWarAnimationTypeArr);
    }

    public static PinWarAnimationType valueOf(String str) {
        return (PinWarAnimationType) Enum.valueOf(PinWarAnimationType.class, str);
    }

    public static PinWarAnimationType[] values() {
        return (PinWarAnimationType[]) $VALUES.clone();
    }
}
