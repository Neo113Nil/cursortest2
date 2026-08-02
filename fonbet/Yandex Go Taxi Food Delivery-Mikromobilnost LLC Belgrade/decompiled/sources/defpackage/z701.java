package defpackage;

import com.google.ar.core.TrackingFailureReason;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class z701 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrackingFailureReason.values().length];
        try {
            iArr[TrackingFailureReason.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrackingFailureReason.BAD_STATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrackingFailureReason.INSUFFICIENT_LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrackingFailureReason.EXCESSIVE_MOTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TrackingFailureReason.INSUFFICIENT_FEATURES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TrackingFailureReason.CAMERA_UNAVAILABLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
