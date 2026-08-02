package ru.yandex.taxi.map;

import ru.yandex.taxi.map.WalkingRouteUiState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WalkingRouteUiState.Type.values().length];
        try {
            iArr[WalkingRouteUiState.Type.UNDERGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WalkingRouteUiState.Type.GROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
