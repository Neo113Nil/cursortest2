package ru.yandex.taxi.preorder.tollroad.analytics;

import defpackage.k4o;
import defpackage.s131;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/preorder/tollroad/analytics/TollRoadDialogAnalytics$Button", "Ls131;", "", "Lru/yandex/taxi/preorder/tollroad/analytics/TollRoadDialogAnalytics$Button;", "ANDROID_BACK_BUTTON", "DONE", "SELECT_ROUTE", "dialog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadDialogAnalytics$Button implements s131 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TollRoadDialogAnalytics$Button[] $VALUES;
    public static final TollRoadDialogAnalytics$Button ANDROID_BACK_BUTTON;
    public static final TollRoadDialogAnalytics$Button DONE;
    public static final TollRoadDialogAnalytics$Button SELECT_ROUTE;

    static {
        TollRoadDialogAnalytics$Button tollRoadDialogAnalytics$Button = new TollRoadDialogAnalytics$Button("ANDROID_BACK_BUTTON", 0);
        ANDROID_BACK_BUTTON = tollRoadDialogAnalytics$Button;
        TollRoadDialogAnalytics$Button tollRoadDialogAnalytics$Button2 = new TollRoadDialogAnalytics$Button("DONE", 1);
        DONE = tollRoadDialogAnalytics$Button2;
        TollRoadDialogAnalytics$Button tollRoadDialogAnalytics$Button3 = new TollRoadDialogAnalytics$Button("SELECT_ROUTE", 2);
        SELECT_ROUTE = tollRoadDialogAnalytics$Button3;
        TollRoadDialogAnalytics$Button[] tollRoadDialogAnalytics$ButtonArr = {tollRoadDialogAnalytics$Button, tollRoadDialogAnalytics$Button2, tollRoadDialogAnalytics$Button3};
        $VALUES = tollRoadDialogAnalytics$ButtonArr;
        $ENTRIES = kotlin.enums.a.a(tollRoadDialogAnalytics$ButtonArr);
    }

    public static TollRoadDialogAnalytics$Button valueOf(String str) {
        return (TollRoadDialogAnalytics$Button) Enum.valueOf(TollRoadDialogAnalytics$Button.class, str);
    }

    public static TollRoadDialogAnalytics$Button[] values() {
        return (TollRoadDialogAnalytics$Button[]) $VALUES.clone();
    }

    @Override // defpackage.s131
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
