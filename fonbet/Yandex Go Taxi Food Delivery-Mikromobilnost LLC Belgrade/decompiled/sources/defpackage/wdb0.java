package defpackage;

import com.ybsdk.feature.pfm.internal.ui.PfmTransactionsDataSkeletonType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class wdb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PfmTransactionsDataSkeletonType.values().length];
        try {
            iArr[PfmTransactionsDataSkeletonType.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PfmTransactionsDataSkeletonType.CUSTOM_FILTERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PfmTransactionsDataSkeletonType.CATEGORY_CHANGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
