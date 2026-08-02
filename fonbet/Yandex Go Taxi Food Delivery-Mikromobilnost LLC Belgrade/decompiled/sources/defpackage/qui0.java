package defpackage;

import com.ybsdk.rconfig.ExperimentApplyType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class qui0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExperimentApplyType.values().length];
        try {
            iArr[ExperimentApplyType.COLD_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperimentApplyType.HOT_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExperimentApplyType.LATEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
