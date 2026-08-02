package ru.yandex.taxi.requirements.ui.selector.usual;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/requirements/ui/selector/usual/OptionViewType;", "", "RADIO", "CHECKBOX", "SPINNER", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OptionViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OptionViewType[] $VALUES;
    public static final OptionViewType CHECKBOX;
    public static final OptionViewType RADIO;
    public static final OptionViewType SPINNER;

    static {
        OptionViewType optionViewType = new OptionViewType("RADIO", 0);
        RADIO = optionViewType;
        OptionViewType optionViewType2 = new OptionViewType("CHECKBOX", 1);
        CHECKBOX = optionViewType2;
        OptionViewType optionViewType3 = new OptionViewType("SPINNER", 2);
        SPINNER = optionViewType3;
        OptionViewType[] optionViewTypeArr = {optionViewType, optionViewType2, optionViewType3};
        $VALUES = optionViewTypeArr;
        $ENTRIES = kotlin.enums.a.a(optionViewTypeArr);
    }

    public static OptionViewType valueOf(String str) {
        return (OptionViewType) Enum.valueOf(OptionViewType.class, str);
    }

    public static OptionViewType[] values() {
        return (OptionViewType[]) $VALUES.clone();
    }
}
