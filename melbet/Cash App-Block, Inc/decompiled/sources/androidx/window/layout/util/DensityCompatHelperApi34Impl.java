package androidx.window.layout.util;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.layout.WindowMetrics;

/* loaded from: classes3.dex */
public final class DensityCompatHelperApi34Impl implements DensityCompatHelper, WindowMetricsCompatHelper {
    public static final DensityCompatHelperApi34Impl INSTANCE = new DensityCompatHelperApi34Impl();
    public static final DensityCompatHelperApi34Impl INSTANCE$1 = new DensityCompatHelperApi34Impl();

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(ContextWrapper contextWrapper, DensityCompatHelper densityCompatHelper) {
        densityCompatHelper.getClass();
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new WindowMetrics(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
