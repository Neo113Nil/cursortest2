package defpackage;

import com.airbnb.lottie.RenderMode;

/* loaded from: classes.dex */
public abstract /* synthetic */ class zxi0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RenderMode.values().length];
        a = iArr;
        try {
            iArr[RenderMode.HARDWARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[RenderMode.SOFTWARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[RenderMode.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
