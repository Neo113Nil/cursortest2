package ru.yandex.taxi.eatskit;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/eatskit/EatsKitDelegates$ClickTarget", "", "Lru/yandex/taxi/eatskit/EatsKitDelegates$ClickTarget;", "BUTTON_ERROR_HIDE", "BUTTON_ERROR_RELOAD", "BUTTON_AUTH", "BUTTON_AUTH_HIDE", "BUTTON_CLOSE", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EatsKitDelegates$ClickTarget {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsKitDelegates$ClickTarget[] $VALUES;
    public static final EatsKitDelegates$ClickTarget BUTTON_AUTH;
    public static final EatsKitDelegates$ClickTarget BUTTON_AUTH_HIDE;
    public static final EatsKitDelegates$ClickTarget BUTTON_CLOSE;
    public static final EatsKitDelegates$ClickTarget BUTTON_ERROR_HIDE;
    public static final EatsKitDelegates$ClickTarget BUTTON_ERROR_RELOAD;

    static {
        EatsKitDelegates$ClickTarget eatsKitDelegates$ClickTarget = new EatsKitDelegates$ClickTarget("BUTTON_ERROR_HIDE", 0);
        BUTTON_ERROR_HIDE = eatsKitDelegates$ClickTarget;
        EatsKitDelegates$ClickTarget eatsKitDelegates$ClickTarget2 = new EatsKitDelegates$ClickTarget("BUTTON_ERROR_RELOAD", 1);
        BUTTON_ERROR_RELOAD = eatsKitDelegates$ClickTarget2;
        EatsKitDelegates$ClickTarget eatsKitDelegates$ClickTarget3 = new EatsKitDelegates$ClickTarget("BUTTON_AUTH", 2);
        BUTTON_AUTH = eatsKitDelegates$ClickTarget3;
        EatsKitDelegates$ClickTarget eatsKitDelegates$ClickTarget4 = new EatsKitDelegates$ClickTarget("BUTTON_AUTH_HIDE", 3);
        BUTTON_AUTH_HIDE = eatsKitDelegates$ClickTarget4;
        EatsKitDelegates$ClickTarget eatsKitDelegates$ClickTarget5 = new EatsKitDelegates$ClickTarget("BUTTON_CLOSE", 4);
        BUTTON_CLOSE = eatsKitDelegates$ClickTarget5;
        EatsKitDelegates$ClickTarget[] eatsKitDelegates$ClickTargetArr = {eatsKitDelegates$ClickTarget, eatsKitDelegates$ClickTarget2, eatsKitDelegates$ClickTarget3, eatsKitDelegates$ClickTarget4, eatsKitDelegates$ClickTarget5};
        $VALUES = eatsKitDelegates$ClickTargetArr;
        $ENTRIES = kotlin.enums.a.a(eatsKitDelegates$ClickTargetArr);
    }

    public static EatsKitDelegates$ClickTarget valueOf(String str) {
        return (EatsKitDelegates$ClickTarget) Enum.valueOf(EatsKitDelegates$ClickTarget.class, str);
    }

    public static EatsKitDelegates$ClickTarget[] values() {
        return (EatsKitDelegates$ClickTarget[]) $VALUES.clone();
    }
}
