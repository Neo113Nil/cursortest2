package ru.yandex.taxi.tooltips.manager;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/tooltips/manager/TooltipPlacement;", "", "SUMMARY_TARIFF_SELECTOR", "SURGE_INFO_MODAL", "PANORAMA_ENTRY_POINT", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TooltipPlacement {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TooltipPlacement[] $VALUES;
    public static final TooltipPlacement PANORAMA_ENTRY_POINT;
    public static final TooltipPlacement SUMMARY_TARIFF_SELECTOR;
    public static final TooltipPlacement SURGE_INFO_MODAL;

    static {
        TooltipPlacement tooltipPlacement = new TooltipPlacement("SUMMARY_TARIFF_SELECTOR", 0);
        SUMMARY_TARIFF_SELECTOR = tooltipPlacement;
        TooltipPlacement tooltipPlacement2 = new TooltipPlacement("SURGE_INFO_MODAL", 1);
        SURGE_INFO_MODAL = tooltipPlacement2;
        TooltipPlacement tooltipPlacement3 = new TooltipPlacement("PANORAMA_ENTRY_POINT", 2);
        PANORAMA_ENTRY_POINT = tooltipPlacement3;
        TooltipPlacement[] tooltipPlacementArr = {tooltipPlacement, tooltipPlacement2, tooltipPlacement3};
        $VALUES = tooltipPlacementArr;
        $ENTRIES = a.a(tooltipPlacementArr);
    }

    public static TooltipPlacement valueOf(String str) {
        return (TooltipPlacement) Enum.valueOf(TooltipPlacement.class, str);
    }

    public static TooltipPlacement[] values() {
        return (TooltipPlacement[]) $VALUES.clone();
    }
}
