package defpackage;

import androidx.camera.core.impl.SurfaceConfig$ConfigType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class q4p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SurfaceConfig$ConfigType.values().length];
        a = iArr;
        try {
            iArr[SurfaceConfig$ConfigType.PRIV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[SurfaceConfig$ConfigType.YUV.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[SurfaceConfig$ConfigType.JPEG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
