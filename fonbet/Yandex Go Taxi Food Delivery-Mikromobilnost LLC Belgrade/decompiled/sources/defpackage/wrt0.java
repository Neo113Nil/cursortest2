package defpackage;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import androidx.core.splashscreen.a;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public final class wrt0 extends a {
    public SplashScreenView c;

    @Override // androidx.core.splashscreen.a
    public final void a() {
    }

    @Override // androidx.core.splashscreen.a
    public final ViewGroup b() {
        SplashScreenView splashScreenView = this.c;
        if (splashScreenView != null) {
            return splashScreenView;
        }
        return null;
    }

    @Override // androidx.core.splashscreen.a
    public final void c() {
        SplashScreenView splashScreenView = this.c;
        if (splashScreenView == null) {
            splashScreenView = null;
        }
        splashScreenView.remove();
        FragmentActivity fragmentActivity = this.a;
        uwy0.b(fragmentActivity.getTheme(), fragmentActivity.getWindow().getDecorView(), new TypedValue());
    }
}
