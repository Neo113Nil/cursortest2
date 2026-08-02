package ru.yandex.yandexmaps.multiplatform.pin.war.callback;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/pin/war/callback/PinInvalidationReason;", "", "ADD", "REMOVE", "SELECT", "DESELECT", "HIDE", "SHOW", "REDRAW", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PinInvalidationReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinInvalidationReason[] $VALUES;
    public static final PinInvalidationReason ADD;
    public static final PinInvalidationReason DESELECT;
    public static final PinInvalidationReason HIDE;
    public static final PinInvalidationReason REDRAW;
    public static final PinInvalidationReason REMOVE;
    public static final PinInvalidationReason SELECT;
    public static final PinInvalidationReason SHOW;

    static {
        PinInvalidationReason pinInvalidationReason = new PinInvalidationReason("ADD", 0);
        ADD = pinInvalidationReason;
        PinInvalidationReason pinInvalidationReason2 = new PinInvalidationReason("REMOVE", 1);
        REMOVE = pinInvalidationReason2;
        PinInvalidationReason pinInvalidationReason3 = new PinInvalidationReason("SELECT", 2);
        SELECT = pinInvalidationReason3;
        PinInvalidationReason pinInvalidationReason4 = new PinInvalidationReason("DESELECT", 3);
        DESELECT = pinInvalidationReason4;
        PinInvalidationReason pinInvalidationReason5 = new PinInvalidationReason("HIDE", 4);
        HIDE = pinInvalidationReason5;
        PinInvalidationReason pinInvalidationReason6 = new PinInvalidationReason("SHOW", 5);
        SHOW = pinInvalidationReason6;
        PinInvalidationReason pinInvalidationReason7 = new PinInvalidationReason("REDRAW", 6);
        REDRAW = pinInvalidationReason7;
        PinInvalidationReason[] pinInvalidationReasonArr = {pinInvalidationReason, pinInvalidationReason2, pinInvalidationReason3, pinInvalidationReason4, pinInvalidationReason5, pinInvalidationReason6, pinInvalidationReason7};
        $VALUES = pinInvalidationReasonArr;
        $ENTRIES = kotlin.enums.a.a(pinInvalidationReasonArr);
    }

    public static PinInvalidationReason valueOf(String str) {
        return (PinInvalidationReason) Enum.valueOf(PinInvalidationReason.class, str);
    }

    public static PinInvalidationReason[] values() {
        return (PinInvalidationReason[]) $VALUES.clone();
    }
}
