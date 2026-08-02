package ru.yandex.taxi.paymentmethods.interactor;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/paymentmethods/interactor/PaymentMethodValidator$PaymentSupportByTariff", "", "Lru/yandex/taxi/paymentmethods/interactor/PaymentMethodValidator$PaymentSupportByTariff;", "UNAVAILABLE", "SUPPORTED", "NOT_SUPPORTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PaymentMethodValidator$PaymentSupportByTariff {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodValidator$PaymentSupportByTariff[] $VALUES;
    public static final PaymentMethodValidator$PaymentSupportByTariff NOT_SUPPORTED;
    public static final PaymentMethodValidator$PaymentSupportByTariff SUPPORTED;
    public static final PaymentMethodValidator$PaymentSupportByTariff UNAVAILABLE;

    static {
        PaymentMethodValidator$PaymentSupportByTariff paymentMethodValidator$PaymentSupportByTariff = new PaymentMethodValidator$PaymentSupportByTariff("UNAVAILABLE", 0);
        UNAVAILABLE = paymentMethodValidator$PaymentSupportByTariff;
        PaymentMethodValidator$PaymentSupportByTariff paymentMethodValidator$PaymentSupportByTariff2 = new PaymentMethodValidator$PaymentSupportByTariff("SUPPORTED", 1);
        SUPPORTED = paymentMethodValidator$PaymentSupportByTariff2;
        PaymentMethodValidator$PaymentSupportByTariff paymentMethodValidator$PaymentSupportByTariff3 = new PaymentMethodValidator$PaymentSupportByTariff("NOT_SUPPORTED", 2);
        NOT_SUPPORTED = paymentMethodValidator$PaymentSupportByTariff3;
        PaymentMethodValidator$PaymentSupportByTariff[] paymentMethodValidator$PaymentSupportByTariffArr = {paymentMethodValidator$PaymentSupportByTariff, paymentMethodValidator$PaymentSupportByTariff2, paymentMethodValidator$PaymentSupportByTariff3};
        $VALUES = paymentMethodValidator$PaymentSupportByTariffArr;
        $ENTRIES = a.a(paymentMethodValidator$PaymentSupportByTariffArr);
    }

    public static PaymentMethodValidator$PaymentSupportByTariff valueOf(String str) {
        return (PaymentMethodValidator$PaymentSupportByTariff) Enum.valueOf(PaymentMethodValidator$PaymentSupportByTariff.class, str);
    }

    public static PaymentMethodValidator$PaymentSupportByTariff[] values() {
        return (PaymentMethodValidator$PaymentSupportByTariff[]) $VALUES.clone();
    }
}
