package ru.yandex.taxi.masstransit.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/utils/RefreshState;", "", "LOADING", "ERROR_LOADING", "SILENT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RefreshState[] $VALUES;
    public static final RefreshState ERROR_LOADING;
    public static final RefreshState LOADING;
    public static final RefreshState SILENT;

    static {
        RefreshState refreshState = new RefreshState("LOADING", 0);
        LOADING = refreshState;
        RefreshState refreshState2 = new RefreshState("ERROR_LOADING", 1);
        ERROR_LOADING = refreshState2;
        RefreshState refreshState3 = new RefreshState("SILENT", 2);
        SILENT = refreshState3;
        RefreshState[] refreshStateArr = {refreshState, refreshState2, refreshState3};
        $VALUES = refreshStateArr;
        $ENTRIES = kotlin.enums.a.a(refreshStateArr);
    }

    public static RefreshState valueOf(String str) {
        return (RefreshState) Enum.valueOf(RefreshState.class, str);
    }

    public static RefreshState[] values() {
        return (RefreshState[]) $VALUES.clone();
    }
}
