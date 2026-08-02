package ru.yandex.taxi.map_common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/map_common/ZoomCatcher$CatchResult", "", "Lru/yandex/taxi/map_common/ZoomCatcher$CatchResult;", "CATCHED", "SKIPPED", "TOUCH_SLOP", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ZoomCatcher$CatchResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ZoomCatcher$CatchResult[] $VALUES;
    public static final ZoomCatcher$CatchResult CATCHED;
    public static final ZoomCatcher$CatchResult SKIPPED;
    public static final ZoomCatcher$CatchResult TOUCH_SLOP;

    static {
        ZoomCatcher$CatchResult zoomCatcher$CatchResult = new ZoomCatcher$CatchResult("CATCHED", 0);
        CATCHED = zoomCatcher$CatchResult;
        ZoomCatcher$CatchResult zoomCatcher$CatchResult2 = new ZoomCatcher$CatchResult("SKIPPED", 1);
        SKIPPED = zoomCatcher$CatchResult2;
        ZoomCatcher$CatchResult zoomCatcher$CatchResult3 = new ZoomCatcher$CatchResult("TOUCH_SLOP", 2);
        TOUCH_SLOP = zoomCatcher$CatchResult3;
        ZoomCatcher$CatchResult[] zoomCatcher$CatchResultArr = {zoomCatcher$CatchResult, zoomCatcher$CatchResult2, zoomCatcher$CatchResult3};
        $VALUES = zoomCatcher$CatchResultArr;
        $ENTRIES = kotlin.enums.a.a(zoomCatcher$CatchResultArr);
    }

    public static ZoomCatcher$CatchResult valueOf(String str) {
        return (ZoomCatcher$CatchResult) Enum.valueOf(ZoomCatcher$CatchResult.class, str);
    }

    public static ZoomCatcher$CatchResult[] values() {
        return (ZoomCatcher$CatchResult[]) $VALUES.clone();
    }
}
