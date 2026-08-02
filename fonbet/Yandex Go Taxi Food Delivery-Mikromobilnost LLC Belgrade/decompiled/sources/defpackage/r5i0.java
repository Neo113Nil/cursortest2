package defpackage;

import com.yandex.div.internal.drawable.RadialGradientDrawable$Radius$Relative$Type;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class r5i0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RadialGradientDrawable$Radius$Relative$Type.values().length];
        try {
            iArr[RadialGradientDrawable$Radius$Relative$Type.NEAREST_CORNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RadialGradientDrawable$Radius$Relative$Type.FARTHEST_CORNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RadialGradientDrawable$Radius$Relative$Type.NEAREST_SIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RadialGradientDrawable$Radius$Relative$Type.FARTHEST_SIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
