package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class tgo0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethod$Type.values().length];
        try {
            iArr[PaymentMethod$Type.GOOGLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethod$Type.CORP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethod$Type.NEQUI_TOKEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethod$Type.KASPI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentMethod$Type.CLICK_WALLET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentMethod$Type.EASYPAISA_WALLET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PaymentMethod$Type.JAZZCASH_WALLET.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
