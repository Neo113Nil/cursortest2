package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class y2a0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentKitEnvironment.values().length];
        try {
            iArr[PaymentKitEnvironment.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentKitEnvironment.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
