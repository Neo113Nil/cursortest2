package defpackage;

import com.yandex.go.chargers.debt.data.model.ChargersDebtStatusResponse;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class yp9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersDebtStatusResponse.Status.values().length];
        try {
            iArr[ChargersDebtStatusResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersDebtStatusResponse.Status.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
