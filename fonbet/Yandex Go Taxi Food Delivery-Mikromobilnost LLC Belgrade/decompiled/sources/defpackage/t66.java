package defpackage;

import com.yandex.go.blur.experiments.BlurConfigurationExperiment;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t66 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlurConfigurationExperiment.DevicePerformanceClass.values().length];
        try {
            iArr[BlurConfigurationExperiment.DevicePerformanceClass.MEDIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlurConfigurationExperiment.DevicePerformanceClass.HIGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlurConfigurationExperiment.DevicePerformanceClass.LOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
