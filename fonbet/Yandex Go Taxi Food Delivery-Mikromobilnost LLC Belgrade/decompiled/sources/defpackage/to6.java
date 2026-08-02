package defpackage;

import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search.GetStatusChargeSearchResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class to6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GetStatusChargeSearchResponse.Status.values().length];
        try {
            iArr[GetStatusChargeSearchResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GetStatusChargeSearchResponse.Status.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GetStatusChargeSearchResponse.Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
