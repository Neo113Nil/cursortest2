package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.tracing.Trace;
import coil3.memory.MemoryCacheService;
import com.squareup.util.Strings;

/* loaded from: classes3.dex */
public abstract class EdgeToEdgeApi26 {
    public abstract void adjustLayoutInDisplayCutoutMode(Window window);

    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z, boolean z2) {
        systemBarStyle.getClass();
        systemBarStyle2.getClass();
        window.getClass();
        view.getClass();
        Trace.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(z ? systemBarStyle.darkScrim : systemBarStyle.lightScrim);
        window.setNavigationBarColor(z2 ? systemBarStyle2.darkScrim : systemBarStyle2.lightScrim);
        MemoryCacheService memoryCacheService = new MemoryCacheService(view);
        int i = Build.VERSION.SDK_INT;
        Strings impl35 = i >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService);
        impl35.setAppearanceLightStatusBars(!z);
        impl35.setAppearanceLightNavigationBars(!z2);
    }
}
