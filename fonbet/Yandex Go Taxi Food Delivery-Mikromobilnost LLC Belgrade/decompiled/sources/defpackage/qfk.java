package defpackage;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class qfk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DivImageScale.values().length];
        try {
            iArr[DivImageScale.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivImageScale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivImageScale.STRETCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
        try {
            iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[DivAlignmentVertical.values().length];
        try {
            iArr3[DivAlignmentVertical.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
