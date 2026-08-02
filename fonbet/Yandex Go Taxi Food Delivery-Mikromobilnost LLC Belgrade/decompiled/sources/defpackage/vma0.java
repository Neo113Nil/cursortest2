package defpackage;

import com.yandex.mobile.drive.wallet.PaymentMethodType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class vma0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentMethod$Type.values().length];
        try {
            iArr[PaymentMethod$Type.YB_WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethod$Type.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethod$Type.SBP_TOKEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethod$Type.PERSONAL_WALLET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentMethod$Type.CORP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[PaymentMethodType.values().length];
        try {
            iArr2[PaymentMethodType.SBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PaymentMethodType.PLUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PaymentMethodType.CORP_WALLET.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PaymentMethodType.CREDIT_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PaymentMethodType.CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
