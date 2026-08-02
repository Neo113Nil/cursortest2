package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.BottomSheetPayloadSectionEntity$Type;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.ButtonTransferType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class yk01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[TransferDirection.values().length];
        try {
            iArr[TransferDirection.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferDirection.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TransferScenario.values().length];
        try {
            iArr2[TransferScenario.REQUISITES.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransferScenario.CROSS_BORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TransferScenario.SELF.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TransferScenario.PHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TransferScenario.MOBILE_PAYMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TransferScenario.INTERNET_PAYMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TransferScenario.FUND.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TransferScenario.C2G.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[TransferScenario.TIPS.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[TransferScenario.INVOICE_HCS.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[TransferScenario.MKK_CASHOUT.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[TransferScenario.SAVERS_TOPUP.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[TransferScenario.B2C_TRANSFER.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
        int[] iArr3 = new int[ButtonTransferType.values().length];
        try {
            iArr3[ButtonTransferType.AFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[ButtonTransferType.COMMON_TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        c = iArr3;
        int[] iArr4 = new int[BottomSheetPayloadSectionEntity$Type.values().length];
        try {
            iArr4[BottomSheetPayloadSectionEntity$Type.OTHER_BANKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[BottomSheetPayloadSectionEntity$Type.YANDEX_PRODUCTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        d = iArr4;
    }
}
