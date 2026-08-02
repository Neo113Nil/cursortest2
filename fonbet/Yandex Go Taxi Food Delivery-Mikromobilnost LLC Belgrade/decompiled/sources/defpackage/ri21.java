package defpackage;

import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature$StabilizationMode;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class ri21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoStabilizationFeature$StabilizationMode.values().length];
        a = iArr;
        try {
            iArr[VideoStabilizationFeature$StabilizationMode.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[VideoStabilizationFeature$StabilizationMode.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[VideoStabilizationFeature$StabilizationMode.PREVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
