package androidx.core.splashscreen;

import android.R;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.work.impl.WorkLauncherImpl;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SplashScreen$Impl31 extends SplashScreen$Impl {
    public final SplashScreen$Impl31$hierarchyListener$1 hierarchyListener;
    public boolean mDecorFitWindowInsets;
    public SplashScreen$Impl31$setKeepOnScreenCondition$1 preDrawListener;

    public static void $r8$lambda$DZFrDuM4AtvN6nNqEUUJzQTdeNI(SplashScreen$Impl31 splashScreen$Impl31, MainActivity$$ExternalSyntheticLambda3 mainActivity$$ExternalSyntheticLambda3, SplashScreenView splashScreenView) {
        MainActivity mainActivity = splashScreen$Impl31.activity;
        splashScreenView.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = mainActivity.getTheme();
            Window window = mainActivity.getWindow();
            if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(PKIFailureInfo.systemUnavail);
                } else {
                    window.clearFlags(PKIFailureInfo.systemUnavail);
                }
            }
            View decorView = window.getDecorView();
            decorView.getClass();
            ViewGroup viewGroup = (ViewGroup) decorView;
            WindowCompat$Api35Impl.applyThemesSystemBarAppearance(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(splashScreen$Impl31.mDecorFitWindowInsets);
        }
        MemoryCacheService memoryCacheService = new MemoryCacheService(mainActivity);
        WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) memoryCacheService.imageLoader;
        workLauncherImpl.getClass();
        ((SplashScreenViewProvider$ViewImpl31) workLauncherImpl).platformView = splashScreenView;
        mainActivity$$ExternalSyntheticLambda3.onSplashScreenExit(memoryCacheService);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1] */
    public SplashScreen$Impl31(final MainActivity mainActivity) {
        super(mainActivity);
        this.mDecorFitWindowInsets = true;
        this.hierarchyListener = new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                if (DifferentialMotionFlingController$$ExternalSyntheticLambda0.m1102m((Object) view2)) {
                    SplashScreenView m = DifferentialMotionFlingController$$ExternalSyntheticLambda0.m((Object) view2);
                    WindowInsets build = new WindowInsets.Builder().build();
                    build.getClass();
                    Rect rect = new Rect(PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    SplashScreen$Impl31.this.mDecorFitWindowInsets = (build == m.getRootView().computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true;
                    View decorView = mainActivity.getWindow().getDecorView();
                    decorView.getClass();
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
            }
        };
    }

    @Override // androidx.core.splashscreen.SplashScreen$Impl
    public final void install() {
        int i;
        MainActivity mainActivity = this.activity;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(com.squareup.cash.R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.hierarchyListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1] */
    @Override // androidx.core.splashscreen.SplashScreen$Impl
    public final void setKeepOnScreenCondition(SplashScreen$KeepOnScreenCondition splashScreen$KeepOnScreenCondition) {
        this.splashScreenWaitPredicate = splashScreen$KeepOnScreenCondition;
        final View findViewById = this.activity.findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.preDrawListener != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
        }
        ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (SplashScreen$Impl31.this.splashScreenWaitPredicate.shouldKeepOnScreen()) {
                    return false;
                }
                findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        };
        this.preDrawListener = r1;
        viewTreeObserver.addOnPreDrawListener(r1);
    }

    @Override // androidx.core.splashscreen.SplashScreen$Impl
    public final void setOnExitAnimationListener(final MainActivity$$ExternalSyntheticLambda3 mainActivity$$ExternalSyntheticLambda3) {
        this.activity.getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$$ExternalSyntheticLambda0
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                SplashScreen$Impl31.$r8$lambda$DZFrDuM4AtvN6nNqEUUJzQTdeNI(SplashScreen$Impl31.this, mainActivity$$ExternalSyntheticLambda3, splashScreenView);
            }
        });
    }
}
