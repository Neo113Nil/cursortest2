package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class qgq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FrequencyType.values().length];
        try {
            iArr[FrequencyType.ONCE_PER_WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrequencyType.ONCE_PER_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FrequencyType.TWICE_PER_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
