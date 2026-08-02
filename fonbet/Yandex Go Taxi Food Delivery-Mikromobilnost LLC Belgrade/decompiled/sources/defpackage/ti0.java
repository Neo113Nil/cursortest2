package defpackage;

import com.yandex.go.payments.experiments.AddPaymentMethodButtonInMenuExperiment;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class ti0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddPaymentMethodButtonInMenuExperiment.PaymentMethodType.values().length];
        try {
            iArr[AddPaymentMethodButtonInMenuExperiment.PaymentMethodType.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddPaymentMethodButtonInMenuExperiment.PaymentMethodType.SBP_TOKEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
