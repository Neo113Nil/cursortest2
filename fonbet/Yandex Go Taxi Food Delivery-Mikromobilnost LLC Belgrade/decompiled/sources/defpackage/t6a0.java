package defpackage;

import com.ybsdk.network.dto.AutoTopupStatus;
import com.ybsdk.network.dto.PaymentMethodProductType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class t6a0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentMethodProductType.values().length];
        try {
            iArr[PaymentMethodProductType.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethodProductType.CREDIT_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethodProductType.WALLET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethodProductType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[AutoTopupStatus.values().length];
        try {
            iArr2[AutoTopupStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AutoTopupStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AutoTopupStatus.AVAILABLE_AFTER_UPGRADE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AutoTopupStatus.UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
