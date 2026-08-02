package androidx.core.splashscreen;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.cash.ui.MainActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SplashScreenViewProvider$ViewImpl31 extends WorkLauncherImpl {
    public SplashScreenView platformView;

    @Override // androidx.work.impl.WorkLauncherImpl
    public final void createSplashScreenView() {
    }

    @Override // androidx.work.impl.WorkLauncherImpl
    public final View getIconView() {
        SplashScreenView splashScreenView = this.platformView;
        if (splashScreenView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("platformView");
            throw null;
        }
        if (splashScreenView.getIconView() == null) {
            return new View((MainActivity) this.processor);
        }
        SplashScreenView splashScreenView2 = this.platformView;
        if (splashScreenView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("platformView");
            throw null;
        }
        View iconView = splashScreenView2.getIconView();
        iconView.getClass();
        return iconView;
    }

    @Override // androidx.work.impl.WorkLauncherImpl
    public final ViewGroup getSplashScreenView() {
        SplashScreenView splashScreenView = this.platformView;
        if (splashScreenView != null) {
            return splashScreenView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("platformView");
        throw null;
    }

    @Override // androidx.work.impl.WorkLauncherImpl
    public final void remove() {
        MainActivity mainActivity = (MainActivity) this.processor;
        SplashScreenView splashScreenView = this.platformView;
        if (splashScreenView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("platformView");
            throw null;
        }
        splashScreenView.remove();
        if (Build.VERSION.SDK_INT < 33) {
            Resources.Theme theme = mainActivity.getTheme();
            theme.getClass();
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            WindowCompat$Api35Impl.applyThemesSystemBarAppearance(theme, decorView, new TypedValue());
        }
    }
}
