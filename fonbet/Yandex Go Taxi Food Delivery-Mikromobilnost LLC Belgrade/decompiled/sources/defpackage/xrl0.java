package defpackage;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xrl0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyCenterExperiment.Action.values().length];
        try {
            iArr[SafetyCenterExperiment.Action.CALL_EMERGENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyCenterExperiment.Action.CALL_ANY_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyCenterExperiment.Action.CONTACT_SUPPORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyCenterExperiment.Action.CALL_DRIVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
