package defpackage;

import androidx.camera.core.impl.SurfaceConfig$ConfigSize;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class zmw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SurfaceConfig$ConfigSize.values().length];
        try {
            iArr[SurfaceConfig$ConfigSize.PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurfaceConfig$ConfigSize.RECORD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurfaceConfig$ConfigSize.MAXIMUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SurfaceConfig$ConfigSize.MAXIMUM_4_3.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SurfaceConfig$ConfigSize.MAXIMUM_16_9.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SurfaceConfig$ConfigSize.ULTRA_MAXIMUM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SurfaceConfig$ConfigSize.NOT_SUPPORT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
