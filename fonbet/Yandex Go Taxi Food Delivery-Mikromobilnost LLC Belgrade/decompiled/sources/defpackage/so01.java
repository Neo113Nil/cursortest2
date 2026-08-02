package defpackage;

import com.ybsdk.feature.transfer.internal.network.dto.CheckUserTransferTargetResponse;
import com.ybsdk.feature.transfer.internal.network.dto.YbCheckResult;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class so01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[YbCheckResult.Status.values().length];
        try {
            iArr[YbCheckResult.Status.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbCheckResult.Status.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[CheckUserTransferTargetResponse.Status.values().length];
        try {
            iArr2[CheckUserTransferTargetResponse.Status.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CheckUserTransferTargetResponse.Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CheckUserTransferTargetResponse.Status.FAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
