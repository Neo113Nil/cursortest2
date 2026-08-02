package ru.yandex.taxi.masstransit.geopayment.purchase;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/purchase/MtPurchaseButtonStyle;", "", "Main", "Minor", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtPurchaseButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtPurchaseButtonStyle[] $VALUES;
    public static final MtPurchaseButtonStyle Main;
    public static final MtPurchaseButtonStyle Minor;

    static {
        MtPurchaseButtonStyle mtPurchaseButtonStyle = new MtPurchaseButtonStyle("Main", 0);
        Main = mtPurchaseButtonStyle;
        MtPurchaseButtonStyle mtPurchaseButtonStyle2 = new MtPurchaseButtonStyle("Minor", 1);
        Minor = mtPurchaseButtonStyle2;
        MtPurchaseButtonStyle[] mtPurchaseButtonStyleArr = {mtPurchaseButtonStyle, mtPurchaseButtonStyle2};
        $VALUES = mtPurchaseButtonStyleArr;
        $ENTRIES = kotlin.enums.a.a(mtPurchaseButtonStyleArr);
    }

    public static MtPurchaseButtonStyle valueOf(String str) {
        return (MtPurchaseButtonStyle) Enum.valueOf(MtPurchaseButtonStyle.class, str);
    }

    public static MtPurchaseButtonStyle[] values() {
        return (MtPurchaseButtonStyle[]) $VALUES.clone();
    }
}
