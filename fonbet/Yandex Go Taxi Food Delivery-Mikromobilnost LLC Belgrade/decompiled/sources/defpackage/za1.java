package defpackage;

import com.ybsdk.api.AdjustEventsHelper$AdjustEnvironment;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class za1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdjustEventsHelper$AdjustEnvironment.values().length];
        try {
            iArr[AdjustEventsHelper$AdjustEnvironment.PROD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdjustEventsHelper$AdjustEnvironment.DEV.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
