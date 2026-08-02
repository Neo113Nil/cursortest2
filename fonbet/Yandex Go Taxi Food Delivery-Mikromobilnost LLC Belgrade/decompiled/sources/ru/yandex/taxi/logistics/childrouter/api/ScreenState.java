package ru.yandex.taxi.logistics.childrouter.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/childrouter/api/ScreenState;", "", "COMMON", "OVER_MAP", "OVER_CAMERA", "sdk-delivery-child-router"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScreenState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScreenState[] $VALUES;
    public static final ScreenState COMMON;
    public static final ScreenState OVER_CAMERA;
    public static final ScreenState OVER_MAP;

    static {
        ScreenState screenState = new ScreenState("COMMON", 0);
        COMMON = screenState;
        ScreenState screenState2 = new ScreenState("OVER_MAP", 1);
        OVER_MAP = screenState2;
        ScreenState screenState3 = new ScreenState("OVER_CAMERA", 2);
        OVER_CAMERA = screenState3;
        ScreenState[] screenStateArr = {screenState, screenState2, screenState3};
        $VALUES = screenStateArr;
        $ENTRIES = a.a(screenStateArr);
    }

    public static ScreenState valueOf(String str) {
        return (ScreenState) Enum.valueOf(ScreenState.class, str);
    }

    public static ScreenState[] values() {
        return (ScreenState[]) $VALUES.clone();
    }
}
