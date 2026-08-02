package defpackage;

import com.ybsdk.network.dto.CheckPaymentResponse;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class rgb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CheckPaymentResponse.PaymentConditions.values().length];
        try {
            iArr[CheckPaymentResponse.PaymentConditions.TOPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckPaymentResponse.PaymentConditions.IDENTIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckPaymentResponse.PaymentConditions.KYC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[CheckPaymentResponse.PaymentResolution.values().length];
        try {
            iArr2[CheckPaymentResponse.PaymentResolution.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CheckPaymentResponse.PaymentResolution.ALLOWED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CheckPaymentResponse.PaymentResolution.CONDITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
