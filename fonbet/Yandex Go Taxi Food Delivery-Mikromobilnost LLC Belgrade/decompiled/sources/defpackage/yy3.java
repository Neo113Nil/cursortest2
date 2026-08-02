package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusResultDataEntity;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class yy3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutotopupPaymentStatusResultDataEntity.Status.values().length];
        try {
            iArr[AutotopupPaymentStatusResultDataEntity.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutotopupPaymentStatusResultDataEntity.Status.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutotopupPaymentStatusResultDataEntity.Status.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
