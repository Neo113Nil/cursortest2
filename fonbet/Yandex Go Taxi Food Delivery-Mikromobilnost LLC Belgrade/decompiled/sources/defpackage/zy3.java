package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupRetryPaymentEntity$Status;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupRetryPaymentEntity$StatusDataEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class zy3 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AutotopupRetryPaymentEntity$StatusDataEntity$Status.values().length];
        try {
            iArr[AutotopupRetryPaymentEntity$StatusDataEntity$Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutotopupRetryPaymentEntity$StatusDataEntity$Status.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[AutotopupRetryPaymentEntity$Status.values().length];
        try {
            iArr2[AutotopupRetryPaymentEntity$Status.INITIATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AutotopupRetryPaymentEntity$Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
