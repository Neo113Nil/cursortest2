package ru.yandex.taxi.widget;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/widget/TooltipPointerDrawer$PointerGravity", "", "Lru/yandex/taxi/widget/TooltipPointerDrawer$PointerGravity;", "END", "START", "UNSPECIFIED", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TooltipPointerDrawer$PointerGravity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TooltipPointerDrawer$PointerGravity[] $VALUES;
    public static final TooltipPointerDrawer$PointerGravity END;
    public static final TooltipPointerDrawer$PointerGravity START;
    public static final TooltipPointerDrawer$PointerGravity UNSPECIFIED;

    static {
        TooltipPointerDrawer$PointerGravity tooltipPointerDrawer$PointerGravity = new TooltipPointerDrawer$PointerGravity("END", 0);
        END = tooltipPointerDrawer$PointerGravity;
        TooltipPointerDrawer$PointerGravity tooltipPointerDrawer$PointerGravity2 = new TooltipPointerDrawer$PointerGravity("START", 1);
        START = tooltipPointerDrawer$PointerGravity2;
        TooltipPointerDrawer$PointerGravity tooltipPointerDrawer$PointerGravity3 = new TooltipPointerDrawer$PointerGravity("UNSPECIFIED", 2);
        UNSPECIFIED = tooltipPointerDrawer$PointerGravity3;
        TooltipPointerDrawer$PointerGravity[] tooltipPointerDrawer$PointerGravityArr = {tooltipPointerDrawer$PointerGravity, tooltipPointerDrawer$PointerGravity2, tooltipPointerDrawer$PointerGravity3};
        $VALUES = tooltipPointerDrawer$PointerGravityArr;
        $ENTRIES = kotlin.enums.a.a(tooltipPointerDrawer$PointerGravityArr);
    }

    public static TooltipPointerDrawer$PointerGravity valueOf(String str) {
        return (TooltipPointerDrawer$PointerGravity) Enum.valueOf(TooltipPointerDrawer$PointerGravity.class, str);
    }

    public static TooltipPointerDrawer$PointerGravity[] values() {
        return (TooltipPointerDrawer$PointerGravity[]) $VALUES.clone();
    }
}
