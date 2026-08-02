package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i8r extends aqd {
    public SplashScreenView d;

    @Override // defpackage.aqd
    public final ViewGroup m() {
        SplashScreenView splashScreenView = this.d;
        if (splashScreenView != null) {
            return splashScreenView;
        }
        Intrinsics.j("platformView");
        throw null;
    }

    @Override // defpackage.aqd
    public final void s() {
        hn5 hn5Var = (hn5) this.b;
        SplashScreenView splashScreenView = this.d;
        if (splashScreenView == null) {
            Intrinsics.j("platformView");
            throw null;
        }
        splashScreenView.remove();
        if (Build.VERSION.SDK_INT < 33) {
            Resources.Theme theme = hn5Var.getTheme();
            theme.getClass();
            View decorView = hn5Var.getWindow().getDecorView();
            decorView.getClass();
            qdq.f(theme, decorView, new TypedValue());
        }
    }

    @Override // defpackage.aqd
    public final void f() {
    }
}
