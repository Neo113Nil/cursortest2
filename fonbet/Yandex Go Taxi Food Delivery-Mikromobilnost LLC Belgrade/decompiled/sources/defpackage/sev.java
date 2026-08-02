package defpackage;

import com.ybsdk.core.utils.ScreenDensity;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class sev {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScreenDensity.values().length];
        try {
            iArr[ScreenDensity.HDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
