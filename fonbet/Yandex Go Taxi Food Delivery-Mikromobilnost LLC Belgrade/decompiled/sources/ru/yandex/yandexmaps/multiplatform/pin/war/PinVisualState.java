package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/pin/war/PinVisualState;", "", "INVISIBLE", "DUST", "CLUSTER", "SUPERCLUSTER", "ICON", "ICON_LABEL_S", "ICON_LABEL_M", "SELECTED", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PinVisualState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinVisualState[] $VALUES;
    public static final PinVisualState CLUSTER;
    public static final PinVisualState DUST;
    public static final PinVisualState ICON;
    public static final PinVisualState ICON_LABEL_M;
    public static final PinVisualState ICON_LABEL_S;
    public static final PinVisualState INVISIBLE;
    public static final PinVisualState SELECTED;
    public static final PinVisualState SUPERCLUSTER;

    static {
        PinVisualState pinVisualState = new PinVisualState("INVISIBLE", 0);
        INVISIBLE = pinVisualState;
        PinVisualState pinVisualState2 = new PinVisualState("DUST", 1);
        DUST = pinVisualState2;
        PinVisualState pinVisualState3 = new PinVisualState("CLUSTER", 2);
        CLUSTER = pinVisualState3;
        PinVisualState pinVisualState4 = new PinVisualState("SUPERCLUSTER", 3);
        SUPERCLUSTER = pinVisualState4;
        PinVisualState pinVisualState5 = new PinVisualState("ICON", 4);
        ICON = pinVisualState5;
        PinVisualState pinVisualState6 = new PinVisualState("ICON_LABEL_S", 5);
        ICON_LABEL_S = pinVisualState6;
        PinVisualState pinVisualState7 = new PinVisualState("ICON_LABEL_M", 6);
        ICON_LABEL_M = pinVisualState7;
        PinVisualState pinVisualState8 = new PinVisualState("SELECTED", 7);
        SELECTED = pinVisualState8;
        PinVisualState[] pinVisualStateArr = {pinVisualState, pinVisualState2, pinVisualState3, pinVisualState4, pinVisualState5, pinVisualState6, pinVisualState7, pinVisualState8};
        $VALUES = pinVisualStateArr;
        $ENTRIES = kotlin.enums.a.a(pinVisualStateArr);
    }

    public static PinVisualState valueOf(String str) {
        return (PinVisualState) Enum.valueOf(PinVisualState.class, str);
    }

    public static PinVisualState[] values() {
        return (PinVisualState[]) $VALUES.clone();
    }
}
