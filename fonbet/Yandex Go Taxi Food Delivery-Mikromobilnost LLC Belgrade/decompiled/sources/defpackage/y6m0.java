package defpackage;

import com.ybsdk.feature.savings.internal.network.dto.PlusSubscriptionStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class y6m0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusSubscriptionStatusDto.values().length];
        try {
            iArr[PlusSubscriptionStatusDto.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusSubscriptionStatusDto.FROZEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusSubscriptionStatusDto.UNSUBSCRIBED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
