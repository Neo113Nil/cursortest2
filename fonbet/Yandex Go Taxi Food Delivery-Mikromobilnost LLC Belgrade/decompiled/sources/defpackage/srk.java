package defpackage;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGallery;

/* loaded from: classes.dex */
public abstract /* synthetic */ class srk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DivGallery.ContentAlignment.values().length];
        try {
            iArr[DivGallery.ContentAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivGallery.ContentAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivGallery.ContentAlignment.END.ordinal()] = 3;
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
            iArr3[DivAlignmentVertical.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DivAlignmentVertical.BASELINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[DivAlignmentVertical.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        c = iArr3;
    }
}
