package defpackage;

import com.yandex.quark.yango.ActiveMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class xmt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActiveMode.values().length];
        try {
            iArr[ActiveMode.GO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActiveMode.EATS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActiveMode.DELIVERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActiveMode.GROCERY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ActiveMode.MARKET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
