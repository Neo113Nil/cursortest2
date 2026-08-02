package defpackage;

import com.yandex.go.scooters.subscription.api.ScootersSubscriptionPayload$SubscriptionFromScreen;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class uwo0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersSubscriptionPayload$SubscriptionFromScreen.values().length];
        try {
            iArr[ScootersSubscriptionPayload$SubscriptionFromScreen.DISCOVERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersSubscriptionPayload$SubscriptionFromScreen.OFFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
