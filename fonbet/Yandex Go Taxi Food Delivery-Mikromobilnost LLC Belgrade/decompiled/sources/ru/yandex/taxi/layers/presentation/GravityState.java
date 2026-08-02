package ru.yandex.taxi.layers.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/layers/presentation/GravityState;", "", "UP", "DOWN", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GravityState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GravityState[] $VALUES;
    public static final GravityState DOWN;
    public static final GravityState UP;

    static {
        GravityState gravityState = new GravityState("UP", 0);
        UP = gravityState;
        GravityState gravityState2 = new GravityState("DOWN", 1);
        DOWN = gravityState2;
        GravityState[] gravityStateArr = {gravityState, gravityState2};
        $VALUES = gravityStateArr;
        $ENTRIES = kotlin.enums.a.a(gravityStateArr);
    }

    public static GravityState valueOf(String str) {
        return (GravityState) Enum.valueOf(GravityState.class, str);
    }

    public static GravityState[] values() {
        return (GravityState[]) $VALUES.clone();
    }
}
