package defpackage;

import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class r4n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayEvent$Type.values().length];
        try {
            iArr[PlusPayEvent$Type.DWH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayEvent$Type.CLIENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPayEvent$Type.DIAGNOSTIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusPayEvent$Type.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlusPayEvent$Type.LOG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
