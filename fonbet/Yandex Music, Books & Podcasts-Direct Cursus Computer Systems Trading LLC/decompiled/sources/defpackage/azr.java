package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.t;

/* loaded from: classes3.dex */
public final class azr extends se3 {
    public final t a;
    public final Window b;
    public boolean c;
    public int d;
    public float e;

    public azr(t tVar, Window window) {
        this.a = tVar;
        this.b = window;
        this.c = c9g.q(window, vyr.StatusBar);
        this.d = window.getStatusBarColor();
    }

    @Override // defpackage.se3
    public final void b(View view, float f) {
        view.getClass();
        float f2 = this.e;
        Window window = this.b;
        if (f2 == 0.0f) {
            this.c = c9g.q(window, vyr.StatusBar);
            this.d = window.getStatusBarColor();
        }
        if (!pd.M()) {
            if (this.c) {
                c9g.u(window, vyr.StatusBar, f < 0.9f);
            }
            if (!asq.H(this.a)) {
                c9g.u(window, vyr.NavigationBar, f < 0.9f);
            }
        }
        int i = f == 0.0f ? this.d : 0;
        if (i != window.getStatusBarColor()) {
            window.setStatusBarColor(i);
        }
        this.e = f;
    }

    @Override // defpackage.se3
    public final void c(int i, View view) {
    }
}
