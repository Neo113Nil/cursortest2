package defpackage;

import com.ybsdk.feature.pfm.internal.domain.entities.FilterEntity$Mode;
import com.ybsdk.feature.pfm.internal.ui.PfmTransactionsDataSkeletonType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class zdb0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PfmTransactionsDataSkeletonType.values().length];
        try {
            iArr[PfmTransactionsDataSkeletonType.CUSTOM_FILTERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PfmTransactionsDataSkeletonType.CATEGORY_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PfmTransactionsDataSkeletonType.IDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[FilterEntity$Mode.values().length];
        try {
            iArr2[FilterEntity$Mode.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FilterEntity$Mode.SELECTABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FilterEntity$Mode.SELECTABLE_AND_RESETTABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
