package ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/altpins/confirmation_screen/modal/comparison_block/OptionType;", "", "ALTPIN_B", "ORIGINAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OptionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OptionType[] $VALUES;
    public static final OptionType ALTPIN_B;
    public static final OptionType ORIGINAL;

    static {
        OptionType optionType = new OptionType("ALTPIN_B", 0);
        ALTPIN_B = optionType;
        OptionType optionType2 = new OptionType("ORIGINAL", 1);
        ORIGINAL = optionType2;
        OptionType[] optionTypeArr = {optionType, optionType2};
        $VALUES = optionTypeArr;
        $ENTRIES = a.a(optionTypeArr);
    }

    public static OptionType valueOf(String str) {
        return (OptionType) Enum.valueOf(OptionType.class, str);
    }

    public static OptionType[] values() {
        return (OptionType[]) $VALUES.clone();
    }
}
