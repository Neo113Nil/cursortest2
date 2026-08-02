package defpackage;

import com.ybsdk.feature.testpayment.api.TestPaymentFlow;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class yr3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TestPaymentFlow.values().length];
        try {
            iArr[TestPaymentFlow.EXTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TestPaymentFlow.AUTOTOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
