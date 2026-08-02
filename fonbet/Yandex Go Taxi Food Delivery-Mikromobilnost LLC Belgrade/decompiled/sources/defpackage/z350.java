package defpackage;

import com.yandex.plus.home.pay.PayError;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class z350 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PayError.values().length];
        try {
            iArr[PayError.OTHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayError.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
