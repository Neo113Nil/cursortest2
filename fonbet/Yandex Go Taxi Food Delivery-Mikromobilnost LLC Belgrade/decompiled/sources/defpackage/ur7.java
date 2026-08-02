package defpackage;

import com.yandex.mobile.drive.scan.ui.CameraPattern;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class ur7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraPattern.values().length];
        try {
            iArr[CameraPattern.License.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraPattern.Passport.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
