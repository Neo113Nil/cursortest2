package ru.yandex.taxi.eatskit.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.t7a0;
import defpackage.u7a0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/eatskit/dto/PaymentMethodType;", "", "Companion", "u7a0", "CASH", "CARD", "CORP", "GOOGLE_PAY", "PERSONAL_WALLET", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PaymentMethodType CARD;
    public static final PaymentMethodType CASH;
    public static final PaymentMethodType CORP;
    public static final u7a0 Companion;
    public static final PaymentMethodType GOOGLE_PAY;
    public static final PaymentMethodType PERSONAL_WALLET;

    static {
        PaymentMethodType paymentMethodType = new PaymentMethodType("CASH", 0);
        CASH = paymentMethodType;
        PaymentMethodType paymentMethodType2 = new PaymentMethodType("CARD", 1);
        CARD = paymentMethodType2;
        PaymentMethodType paymentMethodType3 = new PaymentMethodType("CORP", 2);
        CORP = paymentMethodType3;
        PaymentMethodType paymentMethodType4 = new PaymentMethodType("GOOGLE_PAY", 3);
        GOOGLE_PAY = paymentMethodType4;
        PaymentMethodType paymentMethodType5 = new PaymentMethodType("PERSONAL_WALLET", 4);
        PERSONAL_WALLET = paymentMethodType5;
        PaymentMethodType[] paymentMethodTypeArr = {paymentMethodType, paymentMethodType2, paymentMethodType3, paymentMethodType4, paymentMethodType5};
        $VALUES = paymentMethodTypeArr;
        $ENTRIES = kotlin.enums.a.a(paymentMethodTypeArr);
        Companion = new u7a0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(0));
    }

    public static PaymentMethodType valueOf(String str) {
        return (PaymentMethodType) Enum.valueOf(PaymentMethodType.class, str);
    }

    public static PaymentMethodType[] values() {
        return (PaymentMethodType[]) $VALUES.clone();
    }
}
