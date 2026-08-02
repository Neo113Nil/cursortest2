package ru.yandex.tankerapp.models.results;

import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "", "<init>", "(Ljava/lang/String;I)V", "Success", "Failure", "Cancel", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentKitStatusResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentKitStatusResult[] $VALUES;

    @ysq0("cancelled")
    public static final PaymentKitStatusResult Cancel;

    @ysq0("failed")
    public static final PaymentKitStatusResult Failure;

    @ysq0("success")
    public static final PaymentKitStatusResult Success;

    static {
        PaymentKitStatusResult paymentKitStatusResult = new PaymentKitStatusResult("Success", 0);
        Success = paymentKitStatusResult;
        PaymentKitStatusResult paymentKitStatusResult2 = new PaymentKitStatusResult("Failure", 1);
        Failure = paymentKitStatusResult2;
        PaymentKitStatusResult paymentKitStatusResult3 = new PaymentKitStatusResult("Cancel", 2);
        Cancel = paymentKitStatusResult3;
        PaymentKitStatusResult[] paymentKitStatusResultArr = {paymentKitStatusResult, paymentKitStatusResult2, paymentKitStatusResult3};
        $VALUES = paymentKitStatusResultArr;
        $ENTRIES = a.a(paymentKitStatusResultArr);
    }

    private PaymentKitStatusResult(String str, int i) {
    }

    public static PaymentKitStatusResult valueOf(String str) {
        return (PaymentKitStatusResult) Enum.valueOf(PaymentKitStatusResult.class, str);
    }

    public static PaymentKitStatusResult[] values() {
        return (PaymentKitStatusResult[]) $VALUES.clone();
    }
}
