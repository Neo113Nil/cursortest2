package ru.yandex.taxi.shortcuts.dto.response.superapp;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kvr0;
import defpackage.mkr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/shortcuts/dto/response/superapp/ShimmeringStyle;", "", "Companion", "kvr0", "Market", "Grocery", "Eats", "Web", "Unknown", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShimmeringStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShimmeringStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final kvr0 Companion;
    public static final ShimmeringStyle Eats;
    public static final ShimmeringStyle Grocery;
    public static final ShimmeringStyle Market;
    public static final ShimmeringStyle Unknown;
    public static final ShimmeringStyle Web;

    static {
        ShimmeringStyle shimmeringStyle = new ShimmeringStyle("Market", 0);
        Market = shimmeringStyle;
        ShimmeringStyle shimmeringStyle2 = new ShimmeringStyle("Grocery", 1);
        Grocery = shimmeringStyle2;
        ShimmeringStyle shimmeringStyle3 = new ShimmeringStyle("Eats", 2);
        Eats = shimmeringStyle3;
        ShimmeringStyle shimmeringStyle4 = new ShimmeringStyle("Web", 3);
        Web = shimmeringStyle4;
        ShimmeringStyle shimmeringStyle5 = new ShimmeringStyle("Unknown", 4);
        Unknown = shimmeringStyle5;
        ShimmeringStyle[] shimmeringStyleArr = {shimmeringStyle, shimmeringStyle2, shimmeringStyle3, shimmeringStyle4, shimmeringStyle5};
        $VALUES = shimmeringStyleArr;
        $ENTRIES = kotlin.enums.a.a(shimmeringStyleArr);
        Companion = new kvr0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(28));
    }

    public static ShimmeringStyle valueOf(String str) {
        return (ShimmeringStyle) Enum.valueOf(ShimmeringStyle.class, str);
    }

    public static ShimmeringStyle[] values() {
        return (ShimmeringStyle[]) $VALUES.clone();
    }
}
