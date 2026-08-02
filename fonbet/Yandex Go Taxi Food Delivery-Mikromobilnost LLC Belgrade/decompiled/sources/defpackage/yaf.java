package defpackage;

import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositTransactionStatusResponse;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionStatusResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class yaf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CreditDepositTransactionStatusResponse.Status.values().length];
        try {
            iArr[CreditDepositTransactionStatusResponse.Status.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreditDepositTransactionStatusResponse.Status.REQUIRED_3DS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreditDepositTransactionStatusResponse.Status.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CreditDepositTransactionStatusResponse.Status.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[CreditLimitDepositTransactionStatusResponse.Status.values().length];
        try {
            iArr2[CreditLimitDepositTransactionStatusResponse.Status.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CreditLimitDepositTransactionStatusResponse.Status.REQUIRED_3DS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CreditLimitDepositTransactionStatusResponse.Status.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CreditLimitDepositTransactionStatusResponse.Status.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
