package ru.yandex.taxi.payment_options.model;

import defpackage.b1a0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b)\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lru/yandex/taxi/payment_options/model/PaymentIconType;", "", "Companion", "b1a0", "ADD_CARD", "VISA", "MASTERCARD", "MAESTRO", "MIR", "DISCOVER", "AMERICAN_EXPRESS", "JCB", "DINERS", "UNIONPAY", "DINACARD", "UZCARD", "HUMO", "GENERIC_CARD", "ELCART", "BELKART", "MAAL", "CASH", "CORP", "SHARED_FAMILY", "SHARED_BUSINESS", "GOOGLE_PAY", "PERSONAL_WALLET", "TROY", "MBANK_ACCOUNT", "TRANSPORT_CARD", "TRANSPORT_EXTERNAL", "TROYKA", "SBP", "YAPE_TOKEN", "NEQUI_TOKEN", "SBP_BIND_TOKEN", "KASPI", "CLICK_WALLET", "EASYPAISA_WALLET", "JAZZCASH_WALLET", "FASTSHIFT_ACCOUNT", "TIPS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentIconType[] $VALUES;
    public static final PaymentIconType ADD_CARD;
    public static final PaymentIconType AMERICAN_EXPRESS;
    public static final PaymentIconType BELKART;
    public static final PaymentIconType CASH;
    public static final PaymentIconType CLICK_WALLET;
    public static final PaymentIconType CORP;
    public static final b1a0 Companion;
    public static final PaymentIconType DINACARD;
    public static final PaymentIconType DINERS;
    public static final PaymentIconType DISCOVER;
    public static final PaymentIconType EASYPAISA_WALLET;
    public static final PaymentIconType ELCART;
    public static final PaymentIconType FASTSHIFT_ACCOUNT;
    public static final PaymentIconType GENERIC_CARD;
    public static final PaymentIconType GOOGLE_PAY;
    public static final PaymentIconType HUMO;
    public static final PaymentIconType JAZZCASH_WALLET;
    public static final PaymentIconType JCB;
    public static final PaymentIconType KASPI;
    public static final PaymentIconType MAAL;
    public static final PaymentIconType MAESTRO;
    public static final PaymentIconType MASTERCARD;
    public static final PaymentIconType MBANK_ACCOUNT;
    public static final PaymentIconType MIR;
    public static final PaymentIconType NEQUI_TOKEN;
    public static final PaymentIconType PERSONAL_WALLET;
    public static final PaymentIconType SBP;
    public static final PaymentIconType SBP_BIND_TOKEN;
    public static final PaymentIconType SHARED_BUSINESS;
    public static final PaymentIconType SHARED_FAMILY;
    public static final PaymentIconType TIPS;
    public static final PaymentIconType TRANSPORT_CARD;
    public static final PaymentIconType TRANSPORT_EXTERNAL;
    public static final PaymentIconType TROY;
    public static final PaymentIconType TROYKA;
    public static final PaymentIconType UNIONPAY;
    public static final PaymentIconType UZCARD;
    public static final PaymentIconType VISA;
    public static final PaymentIconType YAPE_TOKEN;

    static {
        PaymentIconType paymentIconType = new PaymentIconType("ADD_CARD", 0);
        ADD_CARD = paymentIconType;
        PaymentIconType paymentIconType2 = new PaymentIconType("VISA", 1);
        VISA = paymentIconType2;
        PaymentIconType paymentIconType3 = new PaymentIconType("MASTERCARD", 2);
        MASTERCARD = paymentIconType3;
        PaymentIconType paymentIconType4 = new PaymentIconType("MAESTRO", 3);
        MAESTRO = paymentIconType4;
        PaymentIconType paymentIconType5 = new PaymentIconType("MIR", 4);
        MIR = paymentIconType5;
        PaymentIconType paymentIconType6 = new PaymentIconType("DISCOVER", 5);
        DISCOVER = paymentIconType6;
        PaymentIconType paymentIconType7 = new PaymentIconType("AMERICAN_EXPRESS", 6);
        AMERICAN_EXPRESS = paymentIconType7;
        PaymentIconType paymentIconType8 = new PaymentIconType("JCB", 7);
        JCB = paymentIconType8;
        PaymentIconType paymentIconType9 = new PaymentIconType("DINERS", 8);
        DINERS = paymentIconType9;
        PaymentIconType paymentIconType10 = new PaymentIconType("UNIONPAY", 9);
        UNIONPAY = paymentIconType10;
        PaymentIconType paymentIconType11 = new PaymentIconType("DINACARD", 10);
        DINACARD = paymentIconType11;
        PaymentIconType paymentIconType12 = new PaymentIconType("UZCARD", 11);
        UZCARD = paymentIconType12;
        PaymentIconType paymentIconType13 = new PaymentIconType("HUMO", 12);
        HUMO = paymentIconType13;
        PaymentIconType paymentIconType14 = new PaymentIconType("GENERIC_CARD", 13);
        GENERIC_CARD = paymentIconType14;
        PaymentIconType paymentIconType15 = new PaymentIconType("ELCART", 14);
        ELCART = paymentIconType15;
        PaymentIconType paymentIconType16 = new PaymentIconType("BELKART", 15);
        BELKART = paymentIconType16;
        PaymentIconType paymentIconType17 = new PaymentIconType("MAAL", 16);
        MAAL = paymentIconType17;
        PaymentIconType paymentIconType18 = new PaymentIconType("CASH", 17);
        CASH = paymentIconType18;
        PaymentIconType paymentIconType19 = new PaymentIconType("CORP", 18);
        CORP = paymentIconType19;
        PaymentIconType paymentIconType20 = new PaymentIconType("SHARED_FAMILY", 19);
        SHARED_FAMILY = paymentIconType20;
        PaymentIconType paymentIconType21 = new PaymentIconType("SHARED_BUSINESS", 20);
        SHARED_BUSINESS = paymentIconType21;
        PaymentIconType paymentIconType22 = new PaymentIconType("GOOGLE_PAY", 21);
        GOOGLE_PAY = paymentIconType22;
        PaymentIconType paymentIconType23 = new PaymentIconType("PERSONAL_WALLET", 22);
        PERSONAL_WALLET = paymentIconType23;
        PaymentIconType paymentIconType24 = new PaymentIconType("TROY", 23);
        TROY = paymentIconType24;
        PaymentIconType paymentIconType25 = new PaymentIconType("MBANK_ACCOUNT", 24);
        MBANK_ACCOUNT = paymentIconType25;
        PaymentIconType paymentIconType26 = new PaymentIconType("TRANSPORT_CARD", 25);
        TRANSPORT_CARD = paymentIconType26;
        PaymentIconType paymentIconType27 = new PaymentIconType("TRANSPORT_EXTERNAL", 26);
        TRANSPORT_EXTERNAL = paymentIconType27;
        PaymentIconType paymentIconType28 = new PaymentIconType("TROYKA", 27);
        TROYKA = paymentIconType28;
        PaymentIconType paymentIconType29 = new PaymentIconType("SBP", 28);
        SBP = paymentIconType29;
        PaymentIconType paymentIconType30 = new PaymentIconType("YAPE_TOKEN", 29);
        YAPE_TOKEN = paymentIconType30;
        PaymentIconType paymentIconType31 = new PaymentIconType("NEQUI_TOKEN", 30);
        NEQUI_TOKEN = paymentIconType31;
        PaymentIconType paymentIconType32 = new PaymentIconType("SBP_BIND_TOKEN", 31);
        SBP_BIND_TOKEN = paymentIconType32;
        PaymentIconType paymentIconType33 = new PaymentIconType("KASPI", 32);
        KASPI = paymentIconType33;
        PaymentIconType paymentIconType34 = new PaymentIconType("CLICK_WALLET", 33);
        CLICK_WALLET = paymentIconType34;
        PaymentIconType paymentIconType35 = new PaymentIconType("EASYPAISA_WALLET", 34);
        EASYPAISA_WALLET = paymentIconType35;
        PaymentIconType paymentIconType36 = new PaymentIconType("JAZZCASH_WALLET", 35);
        JAZZCASH_WALLET = paymentIconType36;
        PaymentIconType paymentIconType37 = new PaymentIconType("FASTSHIFT_ACCOUNT", 36);
        FASTSHIFT_ACCOUNT = paymentIconType37;
        PaymentIconType paymentIconType38 = new PaymentIconType("TIPS", 37);
        TIPS = paymentIconType38;
        PaymentIconType[] paymentIconTypeArr = {paymentIconType, paymentIconType2, paymentIconType3, paymentIconType4, paymentIconType5, paymentIconType6, paymentIconType7, paymentIconType8, paymentIconType9, paymentIconType10, paymentIconType11, paymentIconType12, paymentIconType13, paymentIconType14, paymentIconType15, paymentIconType16, paymentIconType17, paymentIconType18, paymentIconType19, paymentIconType20, paymentIconType21, paymentIconType22, paymentIconType23, paymentIconType24, paymentIconType25, paymentIconType26, paymentIconType27, paymentIconType28, paymentIconType29, paymentIconType30, paymentIconType31, paymentIconType32, paymentIconType33, paymentIconType34, paymentIconType35, paymentIconType36, paymentIconType37, paymentIconType38};
        $VALUES = paymentIconTypeArr;
        $ENTRIES = a.a(paymentIconTypeArr);
        Companion = new b1a0();
    }

    public static PaymentIconType valueOf(String str) {
        return (PaymentIconType) Enum.valueOf(PaymentIconType.class, str);
    }

    public static PaymentIconType[] values() {
        return (PaymentIconType[]) $VALUES.clone();
    }
}
