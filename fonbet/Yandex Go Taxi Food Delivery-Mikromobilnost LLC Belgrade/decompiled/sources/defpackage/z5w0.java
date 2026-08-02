package defpackage;

import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class z5w0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.PreferredTrackingType.values().length];
        try {
            iArr[SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.PreferredTrackingType.DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.PreferredTrackingType.FEED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.PreferredTrackingType.values().length];
        try {
            iArr2[SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.PreferredTrackingType.FEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.PreferredTrackingType.BLANK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.PreferredTrackingType.WEB_DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
