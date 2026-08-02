package defpackage;

import com.yandex.go.yb.analytics.SuggestYbCardInRideAnalytics$ChangePaymentError;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class y9v0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuggestYbCardInRideAnalytics$ChangePaymentError.values().length];
        try {
            iArr[SuggestYbCardInRideAnalytics$ChangePaymentError.NETWORK_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuggestYbCardInRideAnalytics$ChangePaymentError.GOOGLE_PAY_BIND_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuggestYbCardInRideAnalytics$ChangePaymentError.CHANGE_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuggestYbCardInRideAnalytics$ChangePaymentError.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
