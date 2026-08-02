package defpackage;

import com.google.ar.core.TrackingState;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class r33 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrackingState.values().length];
        try {
            iArr[TrackingState.TRACKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrackingState.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrackingState.STOPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
