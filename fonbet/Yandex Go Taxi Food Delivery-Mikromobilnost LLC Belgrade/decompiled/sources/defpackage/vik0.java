package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Type;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class vik0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardItemDto$Type.values().length];
        try {
            iArr[RideCardItemDto$Type.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardItemDto$Type.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardItemDto$Type.ROUTE_POINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RideCardItemDto$Type.PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RideCardItemDto$Type.REQUIREMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
