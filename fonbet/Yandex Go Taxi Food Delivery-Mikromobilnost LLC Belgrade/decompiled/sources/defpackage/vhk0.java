package defpackage;

import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class vhk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardDriverState.values().length];
        try {
            iArr[RideCardDriverState.SEARCHING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardDriverState.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardDriverState.WAITING_RESPONSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RideCardDriverState.ASSIGNED_DRIVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
