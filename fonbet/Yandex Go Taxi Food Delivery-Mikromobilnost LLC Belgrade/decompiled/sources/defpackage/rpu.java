package defpackage;

import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class rpu {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SubscriptionConfiguration.Subscription.PaymentMethod.values().length];
        try {
            iArr[SubscriptionConfiguration.Subscription.PaymentMethod.NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionConfiguration.Subscription.PaymentMethod.IN_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionConfiguration.Subscription.PaymentMethod.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
