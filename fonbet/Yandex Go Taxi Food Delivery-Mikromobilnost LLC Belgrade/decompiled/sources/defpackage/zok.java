package defpackage;

import com.yandex.div2.DivEvaluableType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class zok {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivEvaluableType.values().length];
        try {
            iArr[DivEvaluableType.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivEvaluableType.INTEGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivEvaluableType.NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivEvaluableType.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivEvaluableType.URL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DivEvaluableType.COLOR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DivEvaluableType.DICT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DivEvaluableType.ARRAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[DivEvaluableType.DATETIME.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
