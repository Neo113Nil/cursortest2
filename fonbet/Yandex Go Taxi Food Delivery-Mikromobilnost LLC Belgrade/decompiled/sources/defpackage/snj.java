package defpackage;

import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class snj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbSdkPaymentMethodInfo$ProductType.values().length];
        try {
            iArr[YbSdkPaymentMethodInfo$ProductType.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbSdkPaymentMethodInfo$ProductType.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YbSdkPaymentMethodInfo$ProductType.CREDIT_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
