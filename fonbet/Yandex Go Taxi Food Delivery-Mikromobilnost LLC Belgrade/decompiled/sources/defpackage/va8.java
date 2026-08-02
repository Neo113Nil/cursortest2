package defpackage;

import com.ybsdk.feature.card.api.dto.CardClaimingStatusResponse;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class va8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardClaimingStatusResponse.Status.values().length];
        try {
            iArr[CardClaimingStatusResponse.Status.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardClaimingStatusResponse.Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
