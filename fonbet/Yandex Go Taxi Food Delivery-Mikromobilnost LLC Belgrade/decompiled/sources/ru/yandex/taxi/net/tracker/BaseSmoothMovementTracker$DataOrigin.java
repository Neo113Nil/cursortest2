package ru.yandex.taxi.net.tracker;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/net/tracker/BaseSmoothMovementTracker$DataOrigin", "", "Lru/yandex/taxi/net/tracker/BaseSmoothMovementTracker$DataOrigin;", "ENDPOINT", "WEBSOCKET", "map_tracker"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseSmoothMovementTracker$DataOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BaseSmoothMovementTracker$DataOrigin[] $VALUES;
    public static final BaseSmoothMovementTracker$DataOrigin ENDPOINT;
    public static final BaseSmoothMovementTracker$DataOrigin WEBSOCKET;

    static {
        BaseSmoothMovementTracker$DataOrigin baseSmoothMovementTracker$DataOrigin = new BaseSmoothMovementTracker$DataOrigin("ENDPOINT", 0);
        ENDPOINT = baseSmoothMovementTracker$DataOrigin;
        BaseSmoothMovementTracker$DataOrigin baseSmoothMovementTracker$DataOrigin2 = new BaseSmoothMovementTracker$DataOrigin("WEBSOCKET", 1);
        WEBSOCKET = baseSmoothMovementTracker$DataOrigin2;
        BaseSmoothMovementTracker$DataOrigin[] baseSmoothMovementTracker$DataOriginArr = {baseSmoothMovementTracker$DataOrigin, baseSmoothMovementTracker$DataOrigin2};
        $VALUES = baseSmoothMovementTracker$DataOriginArr;
        $ENTRIES = kotlin.enums.a.a(baseSmoothMovementTracker$DataOriginArr);
    }

    public static BaseSmoothMovementTracker$DataOrigin valueOf(String str) {
        return (BaseSmoothMovementTracker$DataOrigin) Enum.valueOf(BaseSmoothMovementTracker$DataOrigin.class, str);
    }

    public static BaseSmoothMovementTracker$DataOrigin[] values() {
        return (BaseSmoothMovementTracker$DataOrigin[]) $VALUES.clone();
    }
}
