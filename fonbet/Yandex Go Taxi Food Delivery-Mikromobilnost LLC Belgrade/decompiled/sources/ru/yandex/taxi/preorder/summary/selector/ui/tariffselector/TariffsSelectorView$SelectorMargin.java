package ru.yandex.taxi.preorder.summary.selector.ui.tariffselector;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/preorder/summary/selector/ui/tariffselector/TariffsSelectorView$SelectorMargin", "", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/TariffsSelectorView$SelectorMargin;", "SMALL", "USUAL", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffsSelectorView$SelectorMargin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffsSelectorView$SelectorMargin[] $VALUES;
    public static final TariffsSelectorView$SelectorMargin SMALL;
    public static final TariffsSelectorView$SelectorMargin USUAL;

    static {
        TariffsSelectorView$SelectorMargin tariffsSelectorView$SelectorMargin = new TariffsSelectorView$SelectorMargin("SMALL", 0);
        SMALL = tariffsSelectorView$SelectorMargin;
        TariffsSelectorView$SelectorMargin tariffsSelectorView$SelectorMargin2 = new TariffsSelectorView$SelectorMargin("USUAL", 1);
        USUAL = tariffsSelectorView$SelectorMargin2;
        TariffsSelectorView$SelectorMargin[] tariffsSelectorView$SelectorMarginArr = {tariffsSelectorView$SelectorMargin, tariffsSelectorView$SelectorMargin2};
        $VALUES = tariffsSelectorView$SelectorMarginArr;
        $ENTRIES = kotlin.enums.a.a(tariffsSelectorView$SelectorMarginArr);
    }

    public static TariffsSelectorView$SelectorMargin valueOf(String str) {
        return (TariffsSelectorView$SelectorMargin) Enum.valueOf(TariffsSelectorView$SelectorMargin.class, str);
    }

    public static TariffsSelectorView$SelectorMargin[] values() {
        return (TariffsSelectorView$SelectorMargin[]) $VALUES.clone();
    }
}
