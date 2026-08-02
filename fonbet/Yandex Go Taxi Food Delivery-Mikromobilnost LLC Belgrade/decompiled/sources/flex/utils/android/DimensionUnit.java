package flex.utils.android;

import android.content.res.Resources;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lflex/utils/android/DimensionUnit;", "", "PX", "DP", "SP", "flex-utils-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class DimensionUnit {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DimensionUnit[] $VALUES;
    public static final DimensionUnit DP;
    public static final DimensionUnit PX;
    public static final DimensionUnit SP;

    static {
        DimensionUnit dimensionUnit = new DimensionUnit() { // from class: flex.utils.android.DimensionUnit.PX
            @Override // flex.utils.android.DimensionUnit
            public final float a(float f) {
                return f / Resources.getSystem().getDisplayMetrics().density;
            }

            @Override // flex.utils.android.DimensionUnit
            public final float b(float f) {
                return f;
            }

            @Override // flex.utils.android.DimensionUnit
            public final float c(float f) {
                return f / Resources.getSystem().getDisplayMetrics().scaledDensity;
            }
        };
        PX = dimensionUnit;
        DimensionUnit dimensionUnit2 = new DimensionUnit() { // from class: flex.utils.android.DimensionUnit.DP
            @Override // flex.utils.android.DimensionUnit
            public final float a(float f) {
                return f;
            }

            @Override // flex.utils.android.DimensionUnit
            public final float b(float f) {
                return f * Resources.getSystem().getDisplayMetrics().density;
            }

            @Override // flex.utils.android.DimensionUnit
            public final float c(float f) {
                return DimensionUnit.PX.c(b(f));
            }
        };
        DP = dimensionUnit2;
        DimensionUnit dimensionUnit3 = new DimensionUnit() { // from class: flex.utils.android.DimensionUnit.SP
            @Override // flex.utils.android.DimensionUnit
            public final float a(float f) {
                return DimensionUnit.PX.a(b(f));
            }

            @Override // flex.utils.android.DimensionUnit
            public final float b(float f) {
                return f * Resources.getSystem().getDisplayMetrics().scaledDensity;
            }

            @Override // flex.utils.android.DimensionUnit
            public final float c(float f) {
                return f;
            }
        };
        SP = dimensionUnit3;
        DimensionUnit[] dimensionUnitArr = {dimensionUnit, dimensionUnit2, dimensionUnit3};
        $VALUES = dimensionUnitArr;
        $ENTRIES = a.a(dimensionUnitArr);
    }

    public static DimensionUnit valueOf(String str) {
        return (DimensionUnit) Enum.valueOf(DimensionUnit.class, str);
    }

    public static DimensionUnit[] values() {
        return (DimensionUnit[]) $VALUES.clone();
    }

    public abstract float a(float f);

    public abstract float b(float f);

    public abstract float c(float f);
}
