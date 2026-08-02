package defpackage;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivImageScale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class tml {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;

    static {
        int[] iArr = new int[DivAnimationInterpolator.values().length];
        try {
            iArr[DivAnimationInterpolator.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivAnimationInterpolator.EASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivAnimationInterpolator.EASE_IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivAnimationInterpolator.EASE_OUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivAnimationInterpolator.EASE_IN_OUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DivAnimationInterpolator.SPRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[DivAnimationDirection.values().length];
        try {
            iArr2[DivAnimationDirection.REVERSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DivAnimationDirection.ALTERNATE_REVERSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DivAnimationDirection.ALTERNATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
        int[] iArr3 = new int[DivAlignmentHorizontal.values().length];
        try {
            iArr3[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[DivAlignmentHorizontal.START.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[DivAlignmentHorizontal.END.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr3;
        int[] iArr4 = new int[DivAlignmentVertical.values().length];
        try {
            iArr4[DivAlignmentVertical.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[DivAlignmentVertical.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[DivAlignmentVertical.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        d = iArr4;
        int[] iArr5 = new int[DivContentAlignmentHorizontal.values().length];
        try {
            iArr5[DivContentAlignmentHorizontal.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[DivContentAlignmentHorizontal.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[DivContentAlignmentHorizontal.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[DivContentAlignmentHorizontal.START.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[DivContentAlignmentHorizontal.END.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[DivContentAlignmentHorizontal.SPACE_AROUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[DivContentAlignmentHorizontal.SPACE_BETWEEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr5[DivContentAlignmentHorizontal.SPACE_EVENLY.ordinal()] = 8;
        } catch (NoSuchFieldError unused25) {
        }
        e = iArr5;
        int[] iArr6 = new int[DivContentAlignmentVertical.values().length];
        try {
            iArr6[DivContentAlignmentVertical.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[DivContentAlignmentVertical.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[DivContentAlignmentVertical.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr6[DivContentAlignmentVertical.SPACE_AROUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr6[DivContentAlignmentVertical.SPACE_BETWEEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr6[DivContentAlignmentVertical.SPACE_EVENLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr6[DivContentAlignmentVertical.BASELINE.ordinal()] = 7;
        } catch (NoSuchFieldError unused32) {
        }
        f = iArr6;
        int[] iArr7 = new int[DivBlendMode.values().length];
        try {
            iArr7[DivBlendMode.SOURCE_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr7[DivBlendMode.SOURCE_ATOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr7[DivBlendMode.DARKEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr7[DivBlendMode.LIGHTEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr7[DivBlendMode.MULTIPLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr7[DivBlendMode.SCREEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused38) {
        }
        g = iArr7;
        int[] iArr8 = new int[DivImageScale.values().length];
        try {
            iArr8[DivImageScale.NO_SCALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr8[DivImageScale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr8[DivImageScale.FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr8[DivImageScale.STRETCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused42) {
        }
        h = iArr8;
    }
}
