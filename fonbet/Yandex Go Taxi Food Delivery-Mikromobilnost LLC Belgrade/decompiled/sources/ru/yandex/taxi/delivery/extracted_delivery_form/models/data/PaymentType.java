package ru.yandex.taxi.delivery.extracted_delivery_form.models.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/delivery/extracted_delivery_form/models/data/PaymentType;", "", "", "typeName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UNKNOWN", "CASH", "CARD", "CORP", "CARGO_CORP", "GOOGLE_PAY", "PERSONAL_WALLET", "SHARED_FAMILY", "SHARED_BUSINESS", "YB_WALLET", "extracted_delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentType[] $VALUES;
    public static final PaymentType CARD;
    public static final PaymentType CARGO_CORP;
    public static final PaymentType CASH;
    public static final PaymentType CORP;
    public static final PaymentType GOOGLE_PAY;
    public static final PaymentType PERSONAL_WALLET;
    public static final PaymentType SHARED_BUSINESS;
    public static final PaymentType SHARED_FAMILY;
    public static final PaymentType UNKNOWN;
    public static final PaymentType YB_WALLET;
    private final String typeName;

    static {
        PaymentType paymentType = new PaymentType("UNKNOWN", 0, "");
        UNKNOWN = paymentType;
        PaymentType paymentType2 = new PaymentType("CASH", 1, "cash");
        CASH = paymentType2;
        PaymentType paymentType3 = new PaymentType("CARD", 2, "card");
        CARD = paymentType3;
        PaymentType paymentType4 = new PaymentType("CORP", 3, "corp");
        CORP = paymentType4;
        PaymentType paymentType5 = new PaymentType("CARGO_CORP", 4, "cargocorp");
        CARGO_CORP = paymentType5;
        PaymentType paymentType6 = new PaymentType("GOOGLE_PAY", 5, "googlepay");
        GOOGLE_PAY = paymentType6;
        PaymentType paymentType7 = new PaymentType("PERSONAL_WALLET", 6, "personal_wallet");
        PERSONAL_WALLET = paymentType7;
        PaymentType paymentType8 = new PaymentType("SHARED_FAMILY", 7, "coop_family");
        SHARED_FAMILY = paymentType8;
        PaymentType paymentType9 = new PaymentType("SHARED_BUSINESS", 8, "coop_business");
        SHARED_BUSINESS = paymentType9;
        PaymentType paymentType10 = new PaymentType("YB_WALLET", 9, "yandex_card");
        YB_WALLET = paymentType10;
        PaymentType[] paymentTypeArr = {paymentType, paymentType2, paymentType3, paymentType4, paymentType5, paymentType6, paymentType7, paymentType8, paymentType9, paymentType10};
        $VALUES = paymentTypeArr;
        $ENTRIES = a.a(paymentTypeArr);
    }

    public PaymentType(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }
}
