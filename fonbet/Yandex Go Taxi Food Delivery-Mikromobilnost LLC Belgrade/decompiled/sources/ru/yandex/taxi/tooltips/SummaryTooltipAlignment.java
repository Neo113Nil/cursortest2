package ru.yandex.taxi.tooltips;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/tooltips/SummaryTooltipAlignment;", "", "START", "END", "CENTER", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SummaryTooltipAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryTooltipAlignment[] $VALUES;
    public static final SummaryTooltipAlignment CENTER;
    public static final SummaryTooltipAlignment END;
    public static final SummaryTooltipAlignment START;

    static {
        SummaryTooltipAlignment summaryTooltipAlignment = new SummaryTooltipAlignment("START", 0);
        START = summaryTooltipAlignment;
        SummaryTooltipAlignment summaryTooltipAlignment2 = new SummaryTooltipAlignment("END", 1);
        END = summaryTooltipAlignment2;
        SummaryTooltipAlignment summaryTooltipAlignment3 = new SummaryTooltipAlignment("CENTER", 2);
        CENTER = summaryTooltipAlignment3;
        SummaryTooltipAlignment[] summaryTooltipAlignmentArr = {summaryTooltipAlignment, summaryTooltipAlignment2, summaryTooltipAlignment3};
        $VALUES = summaryTooltipAlignmentArr;
        $ENTRIES = a.a(summaryTooltipAlignmentArr);
    }

    public static SummaryTooltipAlignment valueOf(String str) {
        return (SummaryTooltipAlignment) Enum.valueOf(SummaryTooltipAlignment.class, str);
    }

    public static SummaryTooltipAlignment[] values() {
        return (SummaryTooltipAlignment[]) $VALUES.clone();
    }
}
