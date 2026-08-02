package ru.yandex.taxi.design.utils;

import defpackage.erl;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/design/utils/DividerPosition;", "", "Companion", "erl", JCP.RAW_PREFIX, "TOP", "BOTTOM", "TOP_AND_BOTTOM", "START", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DividerPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DividerPosition[] $VALUES;
    public static final DividerPosition BOTTOM;
    public static final erl Companion;
    public static final DividerPosition NONE;
    public static final DividerPosition START;
    public static final DividerPosition TOP;
    public static final DividerPosition TOP_AND_BOTTOM;

    static {
        DividerPosition dividerPosition = new DividerPosition(JCP.RAW_PREFIX, 0);
        NONE = dividerPosition;
        DividerPosition dividerPosition2 = new DividerPosition("TOP", 1);
        TOP = dividerPosition2;
        DividerPosition dividerPosition3 = new DividerPosition("BOTTOM", 2);
        BOTTOM = dividerPosition3;
        DividerPosition dividerPosition4 = new DividerPosition("TOP_AND_BOTTOM", 3);
        TOP_AND_BOTTOM = dividerPosition4;
        DividerPosition dividerPosition5 = new DividerPosition("START", 4);
        START = dividerPosition5;
        DividerPosition[] dividerPositionArr = {dividerPosition, dividerPosition2, dividerPosition3, dividerPosition4, dividerPosition5};
        $VALUES = dividerPositionArr;
        $ENTRIES = kotlin.enums.a.a(dividerPositionArr);
        Companion = new erl();
    }

    public static DividerPosition valueOf(String str) {
        return (DividerPosition) Enum.valueOf(DividerPosition.class, str);
    }

    public static DividerPosition[] values() {
        return (DividerPosition[]) $VALUES.clone();
    }
}
