package ru.yandex.taxi.preorder.summary.selector.ui.tariffselector;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/preorder/summary/selector/ui/tariffselector/TariffsSelectorView$SelectorViewType", "", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/TariffsSelectorView$SelectorViewType;", "USUAL", "DOUBLE_SELECTOR", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffsSelectorView$SelectorViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffsSelectorView$SelectorViewType[] $VALUES;
    public static final TariffsSelectorView$SelectorViewType DOUBLE_SELECTOR;
    public static final TariffsSelectorView$SelectorViewType USUAL;

    static {
        TariffsSelectorView$SelectorViewType tariffsSelectorView$SelectorViewType = new TariffsSelectorView$SelectorViewType("USUAL", 0);
        USUAL = tariffsSelectorView$SelectorViewType;
        TariffsSelectorView$SelectorViewType tariffsSelectorView$SelectorViewType2 = new TariffsSelectorView$SelectorViewType("DOUBLE_SELECTOR", 1);
        DOUBLE_SELECTOR = tariffsSelectorView$SelectorViewType2;
        TariffsSelectorView$SelectorViewType[] tariffsSelectorView$SelectorViewTypeArr = {tariffsSelectorView$SelectorViewType, tariffsSelectorView$SelectorViewType2};
        $VALUES = tariffsSelectorView$SelectorViewTypeArr;
        $ENTRIES = kotlin.enums.a.a(tariffsSelectorView$SelectorViewTypeArr);
    }

    public static TariffsSelectorView$SelectorViewType valueOf(String str) {
        return (TariffsSelectorView$SelectorViewType) Enum.valueOf(TariffsSelectorView$SelectorViewType.class, str);
    }

    public static TariffsSelectorView$SelectorViewType[] values() {
        return (TariffsSelectorView$SelectorViewType[]) $VALUES.clone();
    }
}
