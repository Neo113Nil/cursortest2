package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation.RideCardDriverSectionUpdate$Animated$AnimationType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class rhk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardDriverSectionUpdate$Animated$AnimationType.values().length];
        try {
            iArr[RideCardDriverSectionUpdate$Animated$AnimationType.FROM_SEARCHING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardDriverSectionUpdate$Animated$AnimationType.TO_SEARCHING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardDriverSectionUpdate$Animated$AnimationType.THROUGH_COLLAPSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RideCardDriverSectionUpdate$Animated$AnimationType.WAITING_RESPONSE_TO_REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RideCardDriverSectionUpdate$Animated$AnimationType.WAITING_RESPONSE_TO_ASSIGNED_DRIVER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
