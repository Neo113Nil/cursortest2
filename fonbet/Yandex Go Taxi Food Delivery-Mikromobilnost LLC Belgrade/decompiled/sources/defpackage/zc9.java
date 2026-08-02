package defpackage;

import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class zc9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DefaultPaymentMethodUnifiedStatus.values().length];
        try {
            iArr[DefaultPaymentMethodUnifiedStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultPaymentMethodUnifiedStatus.REQUIRED_3DS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DefaultPaymentMethodUnifiedStatus.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DefaultPaymentMethodUnifiedStatus.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
