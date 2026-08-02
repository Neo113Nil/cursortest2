package defpackage;

import ru.yandex.taxi.payment_options.model.PaymentIconType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class uf8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentIconType.values().length];
        try {
            iArr[PaymentIconType.VISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentIconType.AMERICAN_EXPRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentIconType.MIR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentIconType.DISCOVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
