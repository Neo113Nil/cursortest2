package ru.yandex.taxi.preorder.tollroad.analytics;

import defpackage.k4o;
import defpackage.s131;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/preorder/tollroad/analytics/TollRoadDialogAnalytics$ScrollDirection", "Ls131;", "", "Lru/yandex/taxi/preorder/tollroad/analytics/TollRoadDialogAnalytics$ScrollDirection;", "UP", "DOWN", "dialog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadDialogAnalytics$ScrollDirection implements s131 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TollRoadDialogAnalytics$ScrollDirection[] $VALUES;
    public static final TollRoadDialogAnalytics$ScrollDirection DOWN;
    public static final TollRoadDialogAnalytics$ScrollDirection UP;

    static {
        TollRoadDialogAnalytics$ScrollDirection tollRoadDialogAnalytics$ScrollDirection = new TollRoadDialogAnalytics$ScrollDirection("UP", 0);
        UP = tollRoadDialogAnalytics$ScrollDirection;
        TollRoadDialogAnalytics$ScrollDirection tollRoadDialogAnalytics$ScrollDirection2 = new TollRoadDialogAnalytics$ScrollDirection("DOWN", 1);
        DOWN = tollRoadDialogAnalytics$ScrollDirection2;
        TollRoadDialogAnalytics$ScrollDirection[] tollRoadDialogAnalytics$ScrollDirectionArr = {tollRoadDialogAnalytics$ScrollDirection, tollRoadDialogAnalytics$ScrollDirection2};
        $VALUES = tollRoadDialogAnalytics$ScrollDirectionArr;
        $ENTRIES = kotlin.enums.a.a(tollRoadDialogAnalytics$ScrollDirectionArr);
    }

    public static TollRoadDialogAnalytics$ScrollDirection valueOf(String str) {
        return (TollRoadDialogAnalytics$ScrollDirection) Enum.valueOf(TollRoadDialogAnalytics$ScrollDirection.class, str);
    }

    public static TollRoadDialogAnalytics$ScrollDirection[] values() {
        return (TollRoadDialogAnalytics$ScrollDirection[]) $VALUES.clone();
    }

    @Override // defpackage.s131
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
