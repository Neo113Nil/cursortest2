package ru.yandex.taxi.masstransit.ui.stopsline;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/masstransit/ui/stopsline/LineState;", "", "NONE_TO_SECONDARY", "SECONDARY_TO_MAIN", "MAIN_TO_NONE", "NONE_TO_MAIN", "SECONDARY_TO_NONE_POINT_MAIN", "MAIN_TO_SECONDARY", "SECONDARY", "SECONDARY_POINT", "MAIN", "MAIN_POINT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LineState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LineState[] $VALUES;
    public static final LineState MAIN;
    public static final LineState MAIN_POINT;
    public static final LineState MAIN_TO_NONE;
    public static final LineState MAIN_TO_SECONDARY;
    public static final LineState NONE_TO_MAIN;
    public static final LineState NONE_TO_SECONDARY;
    public static final LineState SECONDARY;
    public static final LineState SECONDARY_POINT;
    public static final LineState SECONDARY_TO_MAIN;
    public static final LineState SECONDARY_TO_NONE_POINT_MAIN;

    static {
        LineState lineState = new LineState("NONE_TO_SECONDARY", 0);
        NONE_TO_SECONDARY = lineState;
        LineState lineState2 = new LineState("SECONDARY_TO_MAIN", 1);
        SECONDARY_TO_MAIN = lineState2;
        LineState lineState3 = new LineState("MAIN_TO_NONE", 2);
        MAIN_TO_NONE = lineState3;
        LineState lineState4 = new LineState("NONE_TO_MAIN", 3);
        NONE_TO_MAIN = lineState4;
        LineState lineState5 = new LineState("SECONDARY_TO_NONE_POINT_MAIN", 4);
        SECONDARY_TO_NONE_POINT_MAIN = lineState5;
        LineState lineState6 = new LineState("MAIN_TO_SECONDARY", 5);
        MAIN_TO_SECONDARY = lineState6;
        LineState lineState7 = new LineState("SECONDARY", 6);
        SECONDARY = lineState7;
        LineState lineState8 = new LineState("SECONDARY_POINT", 7);
        SECONDARY_POINT = lineState8;
        LineState lineState9 = new LineState("MAIN", 8);
        MAIN = lineState9;
        LineState lineState10 = new LineState("MAIN_POINT", 9);
        MAIN_POINT = lineState10;
        LineState[] lineStateArr = {lineState, lineState2, lineState3, lineState4, lineState5, lineState6, lineState7, lineState8, lineState9, lineState10};
        $VALUES = lineStateArr;
        $ENTRIES = a.a(lineStateArr);
    }

    public static LineState valueOf(String str) {
        return (LineState) Enum.valueOf(LineState.class, str);
    }

    public static LineState[] values() {
        return (LineState[]) $VALUES.clone();
    }
}
