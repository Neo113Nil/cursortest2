package ru.yandex.taxi.payments;

import defpackage.cty;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wky;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/payments/ListPaymentMethodDtoType;", "", "Companion", "cty", "CASH", "CARD", "CORP", "GOOGLE_PAY", "PERSONAL_WALLET", "FAMILY_ACCOUNT", "BUSINESS_ACCOUNT", "SBP_TOKEN", "YB_CARD", "MBANK_ACCOUNT", "YAPE_TOKEN", "TRANSPORT_CARD", "TRANSPORT_EXTERNAL", "NEQUI_TOKEN", "SBP_BIND_TOKEN", "KASPI", "CLICK_WALLET", "EASYPAISA_WALLET", "JAZZCASH_WALLET", "FASTSHIFT_ACCOUNT", "CASH_LIKE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ListPaymentMethodDtoType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ListPaymentMethodDtoType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ListPaymentMethodDtoType BUSINESS_ACCOUNT;
    public static final ListPaymentMethodDtoType CARD;
    public static final ListPaymentMethodDtoType CASH;
    public static final ListPaymentMethodDtoType CASH_LIKE;
    public static final ListPaymentMethodDtoType CLICK_WALLET;
    public static final ListPaymentMethodDtoType CORP;
    public static final cty Companion;
    public static final ListPaymentMethodDtoType EASYPAISA_WALLET;
    public static final ListPaymentMethodDtoType FAMILY_ACCOUNT;
    public static final ListPaymentMethodDtoType FASTSHIFT_ACCOUNT;
    public static final ListPaymentMethodDtoType GOOGLE_PAY;
    public static final ListPaymentMethodDtoType JAZZCASH_WALLET;
    public static final ListPaymentMethodDtoType KASPI;
    public static final ListPaymentMethodDtoType MBANK_ACCOUNT;
    public static final ListPaymentMethodDtoType NEQUI_TOKEN;
    public static final ListPaymentMethodDtoType PERSONAL_WALLET;
    public static final ListPaymentMethodDtoType SBP_BIND_TOKEN;
    public static final ListPaymentMethodDtoType SBP_TOKEN;
    public static final ListPaymentMethodDtoType TRANSPORT_CARD;
    public static final ListPaymentMethodDtoType TRANSPORT_EXTERNAL;
    public static final ListPaymentMethodDtoType YAPE_TOKEN;
    public static final ListPaymentMethodDtoType YB_CARD;

    static {
        ListPaymentMethodDtoType listPaymentMethodDtoType = new ListPaymentMethodDtoType("CASH", 0);
        CASH = listPaymentMethodDtoType;
        ListPaymentMethodDtoType listPaymentMethodDtoType2 = new ListPaymentMethodDtoType("CARD", 1);
        CARD = listPaymentMethodDtoType2;
        ListPaymentMethodDtoType listPaymentMethodDtoType3 = new ListPaymentMethodDtoType("CORP", 2);
        CORP = listPaymentMethodDtoType3;
        ListPaymentMethodDtoType listPaymentMethodDtoType4 = new ListPaymentMethodDtoType("GOOGLE_PAY", 3);
        GOOGLE_PAY = listPaymentMethodDtoType4;
        ListPaymentMethodDtoType listPaymentMethodDtoType5 = new ListPaymentMethodDtoType("PERSONAL_WALLET", 4);
        PERSONAL_WALLET = listPaymentMethodDtoType5;
        ListPaymentMethodDtoType listPaymentMethodDtoType6 = new ListPaymentMethodDtoType("FAMILY_ACCOUNT", 5);
        FAMILY_ACCOUNT = listPaymentMethodDtoType6;
        ListPaymentMethodDtoType listPaymentMethodDtoType7 = new ListPaymentMethodDtoType("BUSINESS_ACCOUNT", 6);
        BUSINESS_ACCOUNT = listPaymentMethodDtoType7;
        ListPaymentMethodDtoType listPaymentMethodDtoType8 = new ListPaymentMethodDtoType("SBP_TOKEN", 7);
        SBP_TOKEN = listPaymentMethodDtoType8;
        ListPaymentMethodDtoType listPaymentMethodDtoType9 = new ListPaymentMethodDtoType("YB_CARD", 8);
        YB_CARD = listPaymentMethodDtoType9;
        ListPaymentMethodDtoType listPaymentMethodDtoType10 = new ListPaymentMethodDtoType("MBANK_ACCOUNT", 9);
        MBANK_ACCOUNT = listPaymentMethodDtoType10;
        ListPaymentMethodDtoType listPaymentMethodDtoType11 = new ListPaymentMethodDtoType("YAPE_TOKEN", 10);
        YAPE_TOKEN = listPaymentMethodDtoType11;
        ListPaymentMethodDtoType listPaymentMethodDtoType12 = new ListPaymentMethodDtoType("TRANSPORT_CARD", 11);
        TRANSPORT_CARD = listPaymentMethodDtoType12;
        ListPaymentMethodDtoType listPaymentMethodDtoType13 = new ListPaymentMethodDtoType("TRANSPORT_EXTERNAL", 12);
        TRANSPORT_EXTERNAL = listPaymentMethodDtoType13;
        ListPaymentMethodDtoType listPaymentMethodDtoType14 = new ListPaymentMethodDtoType("NEQUI_TOKEN", 13);
        NEQUI_TOKEN = listPaymentMethodDtoType14;
        ListPaymentMethodDtoType listPaymentMethodDtoType15 = new ListPaymentMethodDtoType("SBP_BIND_TOKEN", 14);
        SBP_BIND_TOKEN = listPaymentMethodDtoType15;
        ListPaymentMethodDtoType listPaymentMethodDtoType16 = new ListPaymentMethodDtoType("KASPI", 15);
        KASPI = listPaymentMethodDtoType16;
        ListPaymentMethodDtoType listPaymentMethodDtoType17 = new ListPaymentMethodDtoType("CLICK_WALLET", 16);
        CLICK_WALLET = listPaymentMethodDtoType17;
        ListPaymentMethodDtoType listPaymentMethodDtoType18 = new ListPaymentMethodDtoType("EASYPAISA_WALLET", 17);
        EASYPAISA_WALLET = listPaymentMethodDtoType18;
        ListPaymentMethodDtoType listPaymentMethodDtoType19 = new ListPaymentMethodDtoType("JAZZCASH_WALLET", 18);
        JAZZCASH_WALLET = listPaymentMethodDtoType19;
        ListPaymentMethodDtoType listPaymentMethodDtoType20 = new ListPaymentMethodDtoType("FASTSHIFT_ACCOUNT", 19);
        FASTSHIFT_ACCOUNT = listPaymentMethodDtoType20;
        ListPaymentMethodDtoType listPaymentMethodDtoType21 = new ListPaymentMethodDtoType("CASH_LIKE", 20);
        CASH_LIKE = listPaymentMethodDtoType21;
        ListPaymentMethodDtoType[] listPaymentMethodDtoTypeArr = {listPaymentMethodDtoType, listPaymentMethodDtoType2, listPaymentMethodDtoType3, listPaymentMethodDtoType4, listPaymentMethodDtoType5, listPaymentMethodDtoType6, listPaymentMethodDtoType7, listPaymentMethodDtoType8, listPaymentMethodDtoType9, listPaymentMethodDtoType10, listPaymentMethodDtoType11, listPaymentMethodDtoType12, listPaymentMethodDtoType13, listPaymentMethodDtoType14, listPaymentMethodDtoType15, listPaymentMethodDtoType16, listPaymentMethodDtoType17, listPaymentMethodDtoType18, listPaymentMethodDtoType19, listPaymentMethodDtoType20, listPaymentMethodDtoType21};
        $VALUES = listPaymentMethodDtoTypeArr;
        $ENTRIES = a.a(listPaymentMethodDtoTypeArr);
        Companion = new cty();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wky(10));
    }

    public static ListPaymentMethodDtoType valueOf(String str) {
        return (ListPaymentMethodDtoType) Enum.valueOf(ListPaymentMethodDtoType.class, str);
    }

    public static ListPaymentMethodDtoType[] values() {
        return (ListPaymentMethodDtoType[]) $VALUES.clone();
    }
}
