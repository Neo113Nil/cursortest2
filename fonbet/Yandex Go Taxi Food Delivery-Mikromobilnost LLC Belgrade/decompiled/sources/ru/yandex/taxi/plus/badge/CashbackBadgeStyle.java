package ru.yandex.taxi.plus.badge;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/plus/badge/CashbackBadgeStyle;", "", "DARK_GRAY", "LIGHT_GRAY", "LIGHT_GRADIENT", "DARK_GRADIENT", "DISABLED", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackBadgeStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackBadgeStyle[] $VALUES;
    public static final CashbackBadgeStyle DARK_GRADIENT;
    public static final CashbackBadgeStyle DARK_GRAY;
    public static final CashbackBadgeStyle DISABLED;
    public static final CashbackBadgeStyle LIGHT_GRADIENT;
    public static final CashbackBadgeStyle LIGHT_GRAY;

    static {
        CashbackBadgeStyle cashbackBadgeStyle = new CashbackBadgeStyle("DARK_GRAY", 0);
        DARK_GRAY = cashbackBadgeStyle;
        CashbackBadgeStyle cashbackBadgeStyle2 = new CashbackBadgeStyle("LIGHT_GRAY", 1);
        LIGHT_GRAY = cashbackBadgeStyle2;
        CashbackBadgeStyle cashbackBadgeStyle3 = new CashbackBadgeStyle("LIGHT_GRADIENT", 2);
        LIGHT_GRADIENT = cashbackBadgeStyle3;
        CashbackBadgeStyle cashbackBadgeStyle4 = new CashbackBadgeStyle("DARK_GRADIENT", 3);
        DARK_GRADIENT = cashbackBadgeStyle4;
        CashbackBadgeStyle cashbackBadgeStyle5 = new CashbackBadgeStyle("DISABLED", 4);
        DISABLED = cashbackBadgeStyle5;
        CashbackBadgeStyle[] cashbackBadgeStyleArr = {cashbackBadgeStyle, cashbackBadgeStyle2, cashbackBadgeStyle3, cashbackBadgeStyle4, cashbackBadgeStyle5};
        $VALUES = cashbackBadgeStyleArr;
        $ENTRIES = a.a(cashbackBadgeStyleArr);
    }

    public static CashbackBadgeStyle valueOf(String str) {
        return (CashbackBadgeStyle) Enum.valueOf(CashbackBadgeStyle.class, str);
    }

    public static CashbackBadgeStyle[] values() {
        return (CashbackBadgeStyle[]) $VALUES.clone();
    }
}
