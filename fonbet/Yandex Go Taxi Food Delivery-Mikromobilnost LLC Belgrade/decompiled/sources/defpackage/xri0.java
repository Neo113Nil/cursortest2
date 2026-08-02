package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.regular.DayOfWeek;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class xri0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[RegularAutotopupStatusEntity.values().length];
        try {
            iArr[RegularAutotopupStatusEntity.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RegularAutotopupStatusEntity.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DayOfWeek.values().length];
        try {
            iArr2[DayOfWeek.MON.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DayOfWeek.TUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DayOfWeek.WED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DayOfWeek.THU.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DayOfWeek.FRI.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DayOfWeek.SAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DayOfWeek.SUN.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
        int[] iArr3 = new int[FrequencyType.values().length];
        try {
            iArr3[FrequencyType.ONCE_PER_WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[FrequencyType.ONCE_PER_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[FrequencyType.TWICE_PER_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        c = iArr3;
    }
}
