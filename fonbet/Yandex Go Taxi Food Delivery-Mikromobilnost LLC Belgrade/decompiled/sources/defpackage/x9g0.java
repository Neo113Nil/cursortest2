package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class x9g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SubscriptionStatus.values().length];
        try {
            iArr[SubscriptionStatus.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionStatus.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SubscriptionStatus.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[ResultStatus.values().length];
        try {
            iArr2[ResultStatus.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ResultStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ResultStatus.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ResultStatus.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ResultStatus.TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
