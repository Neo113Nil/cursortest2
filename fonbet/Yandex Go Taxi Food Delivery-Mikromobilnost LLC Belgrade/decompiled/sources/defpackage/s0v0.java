package defpackage;

import com.yandex.plus.core.user.SubscriptionStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class s0v0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SubscriptionStatus.values().length];
        try {
            iArr[SubscriptionStatus.NO_SUBSCRIPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionStatus.SUBSCRIPTION_PLUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionStatus.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
