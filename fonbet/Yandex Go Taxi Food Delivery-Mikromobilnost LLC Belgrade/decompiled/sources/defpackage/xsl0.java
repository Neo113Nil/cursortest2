package defpackage;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xsl0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyCenterExperiment.ButtonType.values().length];
        try {
            iArr[SafetyCenterExperiment.ButtonType.FAQ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyCenterExperiment.ButtonType.CONTACTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyCenterExperiment.ButtonType.SHARE_ROUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyCenterExperiment.ButtonType.EMERGENCY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
