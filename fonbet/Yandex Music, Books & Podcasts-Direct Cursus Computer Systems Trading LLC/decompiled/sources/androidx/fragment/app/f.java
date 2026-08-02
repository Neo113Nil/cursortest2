package androidx.fragment.app;

import android.view.View;
import defpackage.k5r;
import defpackage.xq0;

/* loaded from: classes.dex */
public abstract class f {
    public final f0 a;

    public f(f0 f0Var) {
        f0Var.getClass();
        this.a = f0Var;
    }

    public final boolean a() {
        int i;
        f0 f0Var = this.a;
        View view = f0Var.c.mView;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        xq0.x(k5r.i(visibility, "Unknown visibility "));
                        return false;
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = f0Var.a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }
}
