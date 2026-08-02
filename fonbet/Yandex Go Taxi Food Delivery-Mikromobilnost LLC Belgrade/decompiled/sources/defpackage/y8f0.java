package defpackage;

import com.ybsdk.api.entities.YBProduct;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class y8f0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YBProduct.values().length];
        try {
            iArr[YBProduct.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YBProduct.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YBProduct.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[YBProduct.CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[YBProduct.CREDIT_LIMIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[YBProduct.CREDIT_ACCOUNT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
