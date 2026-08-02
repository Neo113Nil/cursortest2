package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkPlusStateModel$PlusSubscriptionStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class uwj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkPlusStateModel$PlusSubscriptionStatus.values().length];
        try {
            iArr[NetworkPlusStateModel$PlusSubscriptionStatus.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkPlusStateModel$PlusSubscriptionStatus.NO_PLUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NetworkPlusStateModel$PlusSubscriptionStatus.FROZEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
