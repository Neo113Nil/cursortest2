package defpackage;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class oh0 {
    public final PathMeasure a;

    public oh0(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, nh0 nh0Var) {
        if (nh0Var == null) {
            qq6.d("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, nh0Var.a, true);
        }
    }
}
