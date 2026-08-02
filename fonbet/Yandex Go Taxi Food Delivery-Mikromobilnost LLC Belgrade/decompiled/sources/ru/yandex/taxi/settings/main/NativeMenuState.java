package ru.yandex.taxi.settings.main;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/settings/main/NativeMenuState;", "", "OPENING", "OPENED", "CLOSING", "CLOSED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NativeMenuState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeMenuState[] $VALUES;
    public static final NativeMenuState CLOSED;
    public static final NativeMenuState CLOSING;
    public static final NativeMenuState OPENED;
    public static final NativeMenuState OPENING;

    static {
        NativeMenuState nativeMenuState = new NativeMenuState("OPENING", 0);
        OPENING = nativeMenuState;
        NativeMenuState nativeMenuState2 = new NativeMenuState("OPENED", 1);
        OPENED = nativeMenuState2;
        NativeMenuState nativeMenuState3 = new NativeMenuState("CLOSING", 2);
        CLOSING = nativeMenuState3;
        NativeMenuState nativeMenuState4 = new NativeMenuState("CLOSED", 3);
        CLOSED = nativeMenuState4;
        NativeMenuState[] nativeMenuStateArr = {nativeMenuState, nativeMenuState2, nativeMenuState3, nativeMenuState4};
        $VALUES = nativeMenuStateArr;
        $ENTRIES = kotlin.enums.a.a(nativeMenuStateArr);
    }

    public static NativeMenuState valueOf(String str) {
        return (NativeMenuState) Enum.valueOf(NativeMenuState.class, str);
    }

    public static NativeMenuState[] values() {
        return (NativeMenuState[]) $VALUES.clone();
    }
}
