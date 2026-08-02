package defpackage;

import ru.yandex.taxi.plus.purchase.PlusInfoTrailType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class rjd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusInfoTrailType.values().length];
        try {
            iArr[PlusInfoTrailType.PAYMENT_METHOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusInfoTrailType.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusInfoTrailType.NAVIGATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusInfoTrailType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
