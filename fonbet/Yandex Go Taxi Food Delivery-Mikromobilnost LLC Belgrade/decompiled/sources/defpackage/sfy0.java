package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PrerequisiteParam;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class sfy0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransferScenario.values().length];
        try {
            iArr[TransferScenario.MOBILE_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferScenario.INTERNET_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferScenario.C2G.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferScenario.PHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransferScenario.FUND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TransferScenario.SAVERS_TOPUP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TransferScenario.SELF.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TransferScenario.REQUISITES.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TransferScenario.INVOICE_HCS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TransferScenario.MKK_CASHOUT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[TransferScenario.TIPS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[TransferScenario.CROSS_BORDER.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[TransferScenario.B2C_TRANSFER.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
        int[] iArr2 = new int[PrerequisiteParam.TransfersPagePrerequisiteType.values().length];
        try {
            iArr2[PrerequisiteParam.TransfersPagePrerequisiteType.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[PrerequisiteParam.TransfersPagePrerequisiteType.MOBILE_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[PrerequisiteParam.TransfersPagePrerequisiteType.INTERNET_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        b = iArr2;
    }
}
