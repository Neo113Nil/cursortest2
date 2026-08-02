package defpackage;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatus;
import com.yandex.go.payments.api.acceptance.AcceptancePaymentOrderContext;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class td {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AcceptancePaymentOrderContext.values().length];
        try {
            iArr[AcceptancePaymentOrderContext.TRANSPORTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AcceptancePaymentOrderContext.COMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[AcceptancePaymentStatus.values().length];
        try {
            iArr2[AcceptancePaymentStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AcceptancePaymentStatus.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AcceptancePaymentStatus.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AcceptancePaymentStatus.NOT_CREATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AcceptancePaymentStatus.PROCESSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AcceptancePaymentStatus.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
