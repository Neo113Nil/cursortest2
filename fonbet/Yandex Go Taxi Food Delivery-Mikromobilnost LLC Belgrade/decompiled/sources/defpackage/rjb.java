package defpackage;

import com.yandex.go.masstransit.sdk.client_api.model.trip.CheckoutStatus;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class rjb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckoutStatus.values().length];
        try {
            iArr[CheckoutStatus.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckoutStatus.Failure.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckoutStatus.Processing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
