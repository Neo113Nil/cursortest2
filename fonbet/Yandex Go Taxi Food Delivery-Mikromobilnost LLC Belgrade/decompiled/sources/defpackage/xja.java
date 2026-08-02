package defpackage;

import com.yandex.go.chargers.offer.passes.data.model.PurchaseStatus;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class xja {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PurchaseStatus.values().length];
        try {
            iArr[PurchaseStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PurchaseStatus.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PurchaseStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
