package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.SplashScreen;
import android.window.SplashScreenView;

/* loaded from: classes.dex */
public final class q6r extends evj {
    public boolean g;
    public final p6r h;

    public q6r(hn5 hn5Var) {
        super(hn5Var);
        this.g = true;
        this.h = new p6r(this, hn5Var);
    }

    public static void o(q6r q6rVar, d7r d7rVar, SplashScreenView splashScreenView) {
        hn5 hn5Var = (hn5) q6rVar.c;
        splashScreenView.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = hn5Var.getTheme();
            Window window = hn5Var.getWindow();
            if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            View decorView = window.getDecorView();
            decorView.getClass();
            ViewGroup viewGroup = (ViewGroup) decorView;
            qdq.f(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(q6rVar.g);
        }
        vtm vtmVar = new vtm(hn5Var);
        aqd aqdVar = (aqd) vtmVar.a;
        aqdVar.getClass();
        ((i8r) aqdVar).d = splashScreenView;
        d7rVar.a(vtmVar);
    }

    @Override // defpackage.evj
    public final void d() {
        int i;
        hn5 hn5Var = (hn5) this.c;
        Resources.Theme theme = hn5Var.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(ru.yandex.music.R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            hn5Var.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = hn5Var.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.h);
        }
    }

    @Override // defpackage.evj
    public final void k(final d7r d7rVar) {
        ((hn5) this.c).getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: o6r
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                q6r.o(q6r.this, d7rVar, splashScreenView);
            }
        });
    }
}
