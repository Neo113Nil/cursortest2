package ru.yandex.tankerapp.models.dto;

import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitResultScreenClosing;", "", "<init>", "(Ljava/lang/String;I)V", "Hide", "Manually", "AfterDelay", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentKitResultScreenClosing {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentKitResultScreenClosing[] $VALUES;

    @ysq0("afterDelay")
    public static final PaymentKitResultScreenClosing AfterDelay;

    @ysq0("hide")
    public static final PaymentKitResultScreenClosing Hide;

    @ysq0("manually")
    public static final PaymentKitResultScreenClosing Manually;

    static {
        PaymentKitResultScreenClosing paymentKitResultScreenClosing = new PaymentKitResultScreenClosing("Hide", 0);
        Hide = paymentKitResultScreenClosing;
        PaymentKitResultScreenClosing paymentKitResultScreenClosing2 = new PaymentKitResultScreenClosing("Manually", 1);
        Manually = paymentKitResultScreenClosing2;
        PaymentKitResultScreenClosing paymentKitResultScreenClosing3 = new PaymentKitResultScreenClosing("AfterDelay", 2);
        AfterDelay = paymentKitResultScreenClosing3;
        PaymentKitResultScreenClosing[] paymentKitResultScreenClosingArr = {paymentKitResultScreenClosing, paymentKitResultScreenClosing2, paymentKitResultScreenClosing3};
        $VALUES = paymentKitResultScreenClosingArr;
        $ENTRIES = a.a(paymentKitResultScreenClosingArr);
    }

    private PaymentKitResultScreenClosing(String str, int i) {
    }

    public static PaymentKitResultScreenClosing valueOf(String str) {
        return (PaymentKitResultScreenClosing) Enum.valueOf(PaymentKitResultScreenClosing.class, str);
    }

    public static PaymentKitResultScreenClosing[] values() {
        return (PaymentKitResultScreenClosing[]) $VALUES.clone();
    }
}
