package defpackage;

import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class zda0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentOptionState.values().length];
        try {
            iArr[PaymentOptionState.SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
