package defpackage;

import com.ybsdk.widgets.common.ImageScaleTypeEntity;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class vgv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageScaleTypeEntity.values().length];
        try {
            iArr[ImageScaleTypeEntity.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageScaleTypeEntity.FIT_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageScaleTypeEntity.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ImageScaleTypeEntity.FIT_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ImageScaleTypeEntity.FIT_XY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
