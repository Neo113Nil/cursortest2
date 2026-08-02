package ru.yandex.tankerapp.models.dto;

import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "Release", "Debug", "CrowdTesting", "MiminoTesting", "LocalTesting", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentKitEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentKitEnvironment[] $VALUES;

    @ysq0("crowdtesting")
    public static final PaymentKitEnvironment CrowdTesting;

    @ysq0("debug")
    public static final PaymentKitEnvironment Debug;

    @ysq0("localtesting")
    public static final PaymentKitEnvironment LocalTesting;

    @ysq0("miminotesting")
    public static final PaymentKitEnvironment MiminoTesting;

    @ysq0("release")
    public static final PaymentKitEnvironment Release;

    static {
        PaymentKitEnvironment paymentKitEnvironment = new PaymentKitEnvironment("Release", 0);
        Release = paymentKitEnvironment;
        PaymentKitEnvironment paymentKitEnvironment2 = new PaymentKitEnvironment("Debug", 1);
        Debug = paymentKitEnvironment2;
        PaymentKitEnvironment paymentKitEnvironment3 = new PaymentKitEnvironment("CrowdTesting", 2);
        CrowdTesting = paymentKitEnvironment3;
        PaymentKitEnvironment paymentKitEnvironment4 = new PaymentKitEnvironment("MiminoTesting", 3);
        MiminoTesting = paymentKitEnvironment4;
        PaymentKitEnvironment paymentKitEnvironment5 = new PaymentKitEnvironment("LocalTesting", 4);
        LocalTesting = paymentKitEnvironment5;
        PaymentKitEnvironment[] paymentKitEnvironmentArr = {paymentKitEnvironment, paymentKitEnvironment2, paymentKitEnvironment3, paymentKitEnvironment4, paymentKitEnvironment5};
        $VALUES = paymentKitEnvironmentArr;
        $ENTRIES = a.a(paymentKitEnvironmentArr);
    }

    private PaymentKitEnvironment(String str, int i) {
    }

    public static PaymentKitEnvironment valueOf(String str) {
        return (PaymentKitEnvironment) Enum.valueOf(PaymentKitEnvironment.class, str);
    }

    public static PaymentKitEnvironment[] values() {
        return (PaymentKitEnvironment[]) $VALUES.clone();
    }
}
