package defpackage;

import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class t80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddPaymentMethodButton.AddButtonFlow.AddButtonFlowType.values().length];
        try {
            iArr[AddPaymentMethodButton.AddButtonFlow.AddButtonFlowType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonFlow.AddButtonFlowType.TRANSPORT_EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonFlow.AddButtonFlowType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
