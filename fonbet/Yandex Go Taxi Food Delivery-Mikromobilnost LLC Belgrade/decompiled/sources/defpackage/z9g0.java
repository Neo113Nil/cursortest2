package defpackage;

import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentsResultStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class z9g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QrPaymentsResultStatus.values().length];
        try {
            iArr[QrPaymentsResultStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrPaymentsResultStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QrPaymentsResultStatus.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
