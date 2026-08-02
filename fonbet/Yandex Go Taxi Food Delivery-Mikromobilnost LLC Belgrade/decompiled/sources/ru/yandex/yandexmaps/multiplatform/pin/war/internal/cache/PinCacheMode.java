package ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/pin/war/internal/cache/PinCacheMode;", "", "PERMANENT", "TRANSIENT", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PinCacheMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinCacheMode[] $VALUES;
    public static final PinCacheMode PERMANENT;
    public static final PinCacheMode TRANSIENT;

    static {
        PinCacheMode pinCacheMode = new PinCacheMode("PERMANENT", 0);
        PERMANENT = pinCacheMode;
        PinCacheMode pinCacheMode2 = new PinCacheMode("TRANSIENT", 1);
        TRANSIENT = pinCacheMode2;
        PinCacheMode[] pinCacheModeArr = {pinCacheMode, pinCacheMode2};
        $VALUES = pinCacheModeArr;
        $ENTRIES = a.a(pinCacheModeArr);
    }

    public static PinCacheMode valueOf(String str) {
        return (PinCacheMode) Enum.valueOf(PinCacheMode.class, str);
    }

    public static PinCacheMode[] values() {
        return (PinCacheMode[]) $VALUES.clone();
    }
}
