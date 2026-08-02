package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.tracing.Trace;
import coil3.memory.MemoryCacheService;
import com.squareup.util.Strings;

/* loaded from: classes3.dex */
public class EdgeToEdgeApi29 extends EdgeToEdgeApi28 {
    @Override // androidx.activity.EdgeToEdgeApi26
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z, boolean z2) {
        systemBarStyle.getClass();
        systemBarStyle2.getClass();
        window.getClass();
        view.getClass();
        Trace.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        MemoryCacheService memoryCacheService = new MemoryCacheService(view);
        int i = Build.VERSION.SDK_INT;
        Strings impl35 = i >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService);
        impl35.setAppearanceLightStatusBars(!z);
        impl35.setAppearanceLightNavigationBars(true ^ z2);
    }
}
