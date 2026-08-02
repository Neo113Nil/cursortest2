package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class wu01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferScenario.values().length];
        try {
            iArr[TransferScenario.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferScenario.SELF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferScenario.REQUISITES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferScenario.MOBILE_PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransferScenario.INTERNET_PAYMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TransferScenario.C2G.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TransferScenario.FUND.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TransferScenario.SAVERS_TOPUP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TransferScenario.INVOICE_HCS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TransferScenario.CROSS_BORDER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[TransferScenario.MKK_CASHOUT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[TransferScenario.B2C_TRANSFER.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[TransferScenario.TIPS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
    }
}
