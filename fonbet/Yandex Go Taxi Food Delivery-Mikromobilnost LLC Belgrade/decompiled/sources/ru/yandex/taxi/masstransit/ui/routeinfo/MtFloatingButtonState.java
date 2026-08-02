package ru.yandex.taxi.masstransit.ui.routeinfo;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/ui/routeinfo/MtFloatingButtonState;", "", "FOCUS_ROUTE", "FOCUS_USER_LOCATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtFloatingButtonState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtFloatingButtonState[] $VALUES;
    public static final MtFloatingButtonState FOCUS_ROUTE;
    public static final MtFloatingButtonState FOCUS_USER_LOCATION;

    static {
        MtFloatingButtonState mtFloatingButtonState = new MtFloatingButtonState("FOCUS_ROUTE", 0);
        FOCUS_ROUTE = mtFloatingButtonState;
        MtFloatingButtonState mtFloatingButtonState2 = new MtFloatingButtonState("FOCUS_USER_LOCATION", 1);
        FOCUS_USER_LOCATION = mtFloatingButtonState2;
        MtFloatingButtonState[] mtFloatingButtonStateArr = {mtFloatingButtonState, mtFloatingButtonState2};
        $VALUES = mtFloatingButtonStateArr;
        $ENTRIES = kotlin.enums.a.a(mtFloatingButtonStateArr);
    }

    public static MtFloatingButtonState valueOf(String str) {
        return (MtFloatingButtonState) Enum.valueOf(MtFloatingButtonState.class, str);
    }

    public static MtFloatingButtonState[] values() {
        return (MtFloatingButtonState[]) $VALUES.clone();
    }
}
