package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.insets.ColorProtection;
import androidx.core.view.insets.ProtectionLayout;
import androidx.tracing.Trace;
import coil3.memory.MemoryCacheService;
import com.squareup.util.Strings;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class EdgeToEdgeApi35 extends EdgeToEdgeApi30 {
    @Override // androidx.activity.EdgeToEdgeApi29, androidx.activity.EdgeToEdgeApi26
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z, boolean z2) {
        systemBarStyle.getClass();
        systemBarStyle2.getClass();
        window.getClass();
        view.getClass();
        Trace.setDecorFitsSystemWindows(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new ProtectionLayout(viewGroup.getContext(), CollectionsKt__CollectionsKt.listOf((Object[]) new ColorProtection[]{new ColorProtection(2, 0), new ColorProtection(1, 0), new ColorProtection(4, 0), new ColorProtection(8, 0)})));
        }
        window.setNavigationBarContrastEnforced(true);
        MemoryCacheService memoryCacheService = new MemoryCacheService(view);
        int i = Build.VERSION.SDK_INT;
        Strings impl35 = i >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService);
        impl35.setAppearanceLightStatusBars(!z);
        impl35.setAppearanceLightNavigationBars(!z2);
    }
}
