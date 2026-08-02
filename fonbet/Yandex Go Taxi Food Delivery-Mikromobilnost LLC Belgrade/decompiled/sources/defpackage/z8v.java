package defpackage;

import io.flutter.plugins.camerax.CameraXFlashMode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class z8v {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraXFlashMode.values().length];
        a = iArr;
        try {
            iArr[CameraXFlashMode.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CameraXFlashMode.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[CameraXFlashMode.ON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
