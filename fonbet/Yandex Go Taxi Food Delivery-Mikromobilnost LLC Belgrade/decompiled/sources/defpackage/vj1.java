package defpackage;

import com.ybsdk.network.dto.common.Product;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class vj1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Product.values().length];
        try {
            iArr[Product.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Product.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Product.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Product.CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Product.CREDIT_LIMIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Product.CREDIT_ACCOUNT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Product.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
