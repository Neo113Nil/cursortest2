package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/pin/war/PinState;", "", "INVISIBLE", "DUST", "CLUSTER", "SUPERCLUSTER", "ICON", "ICON_LABEL_S", "ICON_LABEL_M", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PinState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinState[] $VALUES;
    public static final PinState CLUSTER;
    public static final PinState DUST;
    public static final PinState ICON;
    public static final PinState ICON_LABEL_M;
    public static final PinState ICON_LABEL_S;
    public static final PinState INVISIBLE;
    public static final PinState SUPERCLUSTER;

    static {
        PinState pinState = new PinState("INVISIBLE", 0);
        INVISIBLE = pinState;
        PinState pinState2 = new PinState("DUST", 1);
        DUST = pinState2;
        PinState pinState3 = new PinState("CLUSTER", 2);
        CLUSTER = pinState3;
        PinState pinState4 = new PinState("SUPERCLUSTER", 3);
        SUPERCLUSTER = pinState4;
        PinState pinState5 = new PinState("ICON", 4);
        ICON = pinState5;
        PinState pinState6 = new PinState("ICON_LABEL_S", 5);
        ICON_LABEL_S = pinState6;
        PinState pinState7 = new PinState("ICON_LABEL_M", 6);
        ICON_LABEL_M = pinState7;
        PinState[] pinStateArr = {pinState, pinState2, pinState3, pinState4, pinState5, pinState6, pinState7};
        $VALUES = pinStateArr;
        $ENTRIES = kotlin.enums.a.a(pinStateArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static PinState valueOf(String str) {
        return (PinState) Enum.valueOf(PinState.class, str);
    }

    public static PinState[] values() {
        return (PinState[]) $VALUES.clone();
    }
}
