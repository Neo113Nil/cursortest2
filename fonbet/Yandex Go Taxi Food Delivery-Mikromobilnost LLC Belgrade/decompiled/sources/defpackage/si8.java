package defpackage;

import com.ybsdk.feature.card.internal.network.dto.SetPeriodLimitsResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class si8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SetPeriodLimitsResponse.Status.values().length];
        try {
            iArr[SetPeriodLimitsResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SetPeriodLimitsResponse.Status.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SetPeriodLimitsResponse.Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
