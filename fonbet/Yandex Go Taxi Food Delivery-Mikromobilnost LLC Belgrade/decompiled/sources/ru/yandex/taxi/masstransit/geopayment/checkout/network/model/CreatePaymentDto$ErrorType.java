package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/masstransit/geopayment/checkout/network/model/CreatePaymentDto$ErrorType", "", "Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CreatePaymentDto$ErrorType;", "FAILURE_PAYMENT_ERROR", "REQUEST_PAY_ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreatePaymentDto$ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreatePaymentDto$ErrorType[] $VALUES;
    public static final CreatePaymentDto$ErrorType FAILURE_PAYMENT_ERROR;
    public static final CreatePaymentDto$ErrorType REQUEST_PAY_ERROR;

    static {
        CreatePaymentDto$ErrorType createPaymentDto$ErrorType = new CreatePaymentDto$ErrorType("FAILURE_PAYMENT_ERROR", 0);
        FAILURE_PAYMENT_ERROR = createPaymentDto$ErrorType;
        CreatePaymentDto$ErrorType createPaymentDto$ErrorType2 = new CreatePaymentDto$ErrorType("REQUEST_PAY_ERROR", 1);
        REQUEST_PAY_ERROR = createPaymentDto$ErrorType2;
        CreatePaymentDto$ErrorType[] createPaymentDto$ErrorTypeArr = {createPaymentDto$ErrorType, createPaymentDto$ErrorType2};
        $VALUES = createPaymentDto$ErrorTypeArr;
        $ENTRIES = kotlin.enums.a.a(createPaymentDto$ErrorTypeArr);
    }

    public static CreatePaymentDto$ErrorType valueOf(String str) {
        return (CreatePaymentDto$ErrorType) Enum.valueOf(CreatePaymentDto$ErrorType.class, str);
    }

    public static CreatePaymentDto$ErrorType[] values() {
        return (CreatePaymentDto$ErrorType[]) $VALUES.clone();
    }
}
