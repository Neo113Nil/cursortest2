package defpackage;

import com.yandex.go.superapp.order_tracking.api.data.OrderTrackingService$Taxi;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class wq70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderTrackingService$Taxi.PreferredTrackingType.values().length];
        try {
            iArr[OrderTrackingService$Taxi.PreferredTrackingType.FEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderTrackingService$Taxi.PreferredTrackingType.DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
