package androidx.window.layout;

import android.os.Build;
import androidx.window.layout.util.BoundsHelperApi28Impl;
import androidx.window.layout.util.DensityCompatHelper;
import androidx.window.layout.util.DensityCompatHelperApi34Impl;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public final DensityCompatHelper densityCompatHelper;

    public WindowMetricsCalculatorCompat() {
        this.densityCompatHelper = Build.VERSION.SDK_INT >= 34 ? DensityCompatHelperApi34Impl.INSTANCE : BoundsHelperApi28Impl.INSTANCE$2;
        CollectionsKt__CollectionsKt.arrayListOf(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
