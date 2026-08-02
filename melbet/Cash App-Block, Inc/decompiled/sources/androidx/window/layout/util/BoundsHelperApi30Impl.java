package androidx.window.layout.util;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.layout.WindowMetrics;

/* loaded from: classes3.dex */
public final class BoundsHelperApi30Impl implements BoundsHelper, WindowMetricsCompatHelper {
    public static final BoundsHelperApi30Impl INSTANCE = new BoundsHelperApi30Impl();
    public static final BoundsHelperApi30Impl INSTANCE$1 = new BoundsHelperApi30Impl();

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(ContextWrapper contextWrapper, DensityCompatHelper densityCompatHelper) {
        densityCompatHelper.getClass();
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new WindowMetrics(bounds, f);
    }
}
