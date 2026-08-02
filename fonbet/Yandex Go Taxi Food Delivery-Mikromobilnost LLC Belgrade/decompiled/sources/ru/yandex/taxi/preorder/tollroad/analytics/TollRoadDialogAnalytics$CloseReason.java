package ru.yandex.taxi.preorder.tollroad.analytics;

import defpackage.k4o;
import defpackage.s131;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/preorder/tollroad/analytics/TollRoadDialogAnalytics$CloseReason", "Ls131;", "", "Lru/yandex/taxi/preorder/tollroad/analytics/TollRoadDialogAnalytics$CloseReason;", "ANDROID_BACK_BUTTON", "ROLL_OFF", "MAP_TAPPED", "DONE", "dialog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadDialogAnalytics$CloseReason implements s131 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TollRoadDialogAnalytics$CloseReason[] $VALUES;
    public static final TollRoadDialogAnalytics$CloseReason ANDROID_BACK_BUTTON;
    public static final TollRoadDialogAnalytics$CloseReason DONE;
    public static final TollRoadDialogAnalytics$CloseReason MAP_TAPPED;
    public static final TollRoadDialogAnalytics$CloseReason ROLL_OFF;

    static {
        TollRoadDialogAnalytics$CloseReason tollRoadDialogAnalytics$CloseReason = new TollRoadDialogAnalytics$CloseReason("ANDROID_BACK_BUTTON", 0);
        ANDROID_BACK_BUTTON = tollRoadDialogAnalytics$CloseReason;
        TollRoadDialogAnalytics$CloseReason tollRoadDialogAnalytics$CloseReason2 = new TollRoadDialogAnalytics$CloseReason("ROLL_OFF", 1);
        ROLL_OFF = tollRoadDialogAnalytics$CloseReason2;
        TollRoadDialogAnalytics$CloseReason tollRoadDialogAnalytics$CloseReason3 = new TollRoadDialogAnalytics$CloseReason("MAP_TAPPED", 2);
        MAP_TAPPED = tollRoadDialogAnalytics$CloseReason3;
        TollRoadDialogAnalytics$CloseReason tollRoadDialogAnalytics$CloseReason4 = new TollRoadDialogAnalytics$CloseReason("DONE", 3);
        DONE = tollRoadDialogAnalytics$CloseReason4;
        TollRoadDialogAnalytics$CloseReason[] tollRoadDialogAnalytics$CloseReasonArr = {tollRoadDialogAnalytics$CloseReason, tollRoadDialogAnalytics$CloseReason2, tollRoadDialogAnalytics$CloseReason3, tollRoadDialogAnalytics$CloseReason4};
        $VALUES = tollRoadDialogAnalytics$CloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(tollRoadDialogAnalytics$CloseReasonArr);
    }

    public static TollRoadDialogAnalytics$CloseReason valueOf(String str) {
        return (TollRoadDialogAnalytics$CloseReason) Enum.valueOf(TollRoadDialogAnalytics$CloseReason.class, str);
    }

    public static TollRoadDialogAnalytics$CloseReason[] values() {
        return (TollRoadDialogAnalytics$CloseReason[]) $VALUES.clone();
    }

    @Override // defpackage.s131
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
