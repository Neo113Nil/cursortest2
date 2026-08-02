package ru.yandex.taxi.personalstate.api.network.objects;

import defpackage.ff70;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.y570;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/personalstate/api/network/objects/OptionType;", "", "Companion", "ff70", "REDIRECT", "EDIT_COMMENT", "DELETE_COMMENT_AND_ORDER", "SELECT_PAYMENT_THEN_REDIRECT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OptionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OptionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ff70 Companion;
    public static final OptionType DELETE_COMMENT_AND_ORDER;
    public static final OptionType EDIT_COMMENT;
    public static final OptionType REDIRECT;
    public static final OptionType SELECT_PAYMENT_THEN_REDIRECT;

    static {
        OptionType optionType = new OptionType("REDIRECT", 0);
        REDIRECT = optionType;
        OptionType optionType2 = new OptionType("EDIT_COMMENT", 1);
        EDIT_COMMENT = optionType2;
        OptionType optionType3 = new OptionType("DELETE_COMMENT_AND_ORDER", 2);
        DELETE_COMMENT_AND_ORDER = optionType3;
        OptionType optionType4 = new OptionType("SELECT_PAYMENT_THEN_REDIRECT", 3);
        SELECT_PAYMENT_THEN_REDIRECT = optionType4;
        OptionType[] optionTypeArr = {optionType, optionType2, optionType3, optionType4};
        $VALUES = optionTypeArr;
        $ENTRIES = a.a(optionTypeArr);
        Companion = new ff70();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(23));
    }

    public static OptionType valueOf(String str) {
        return (OptionType) Enum.valueOf(OptionType.class, str);
    }

    public static OptionType[] values() {
        return (OptionType[]) $VALUES.clone();
    }
}
