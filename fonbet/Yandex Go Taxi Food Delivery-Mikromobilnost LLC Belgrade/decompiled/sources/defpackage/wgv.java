package defpackage;

import com.ybsdk.widgets.common.ImageScaleTypeDto;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class wgv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageScaleTypeDto.values().length];
        try {
            iArr[ImageScaleTypeDto.FIT_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageScaleTypeDto.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageScaleTypeDto.FIT_BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ImageScaleTypeDto.FIT_XY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ImageScaleTypeDto.LEGACY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
