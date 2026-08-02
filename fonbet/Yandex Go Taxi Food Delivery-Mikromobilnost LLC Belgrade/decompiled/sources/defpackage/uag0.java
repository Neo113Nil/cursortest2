package defpackage;

import com.ybsdk.feature.qr.payments.internal.network.dto.SubscriptionResult;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class uag0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SubscriptionResult.Status.values().length];
        try {
            iArr[SubscriptionResult.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionResult.Status.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
