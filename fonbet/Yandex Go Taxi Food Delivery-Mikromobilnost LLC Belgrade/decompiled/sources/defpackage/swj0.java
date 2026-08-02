package defpackage;

import com.yandex.plus.pay.internal.model.PlusPaySubmitResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class swj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPaySubmitResult.Status.values().length];
        try {
            iArr[PlusPaySubmitResult.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPaySubmitResult.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPaySubmitResult.Status.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
