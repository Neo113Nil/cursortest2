package defpackage;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class wv31 {
    public final int a;
    public final int b;
    public final ia30 c;
    public final int d;
    public final vmn0 f;
    public final Interpolator g;
    public float i;
    public float j;
    public final boolean m;
    public final thx e = new thx();
    public boolean h = false;
    public final Rect l = new Rect();
    public long k = System.nanoTime();

    public wv31(vmn0 vmn0Var, ia30 ia30Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.m = false;
        this.f = vmn0Var;
        this.c = ia30Var;
        this.d = i2;
        if (((ArrayList) vmn0Var.x) == null) {
            vmn0Var.x = new ArrayList();
        }
        ((ArrayList) vmn0Var.x).add(this);
        this.g = interpolator;
        this.a = i4;
        this.b = i5;
        if (i3 == 3) {
            this.m = true;
        }
        this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        a();
    }

    public final void a() {
        boolean z = this.h;
        int i = this.b;
        int i2 = this.a;
        Interpolator interpolator = this.g;
        ia30 ia30Var = this.c;
        vmn0 vmn0Var = this.f;
        if (z) {
            long nanoTime = System.nanoTime();
            long j = nanoTime - this.k;
            this.k = nanoTime;
            float f = this.i - (((float) (j * 1.0E-6d)) * this.j);
            this.i = f;
            if (f < 0.0f) {
                this.i = 0.0f;
            }
            float f2 = this.i;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f2);
            }
            boolean f3 = ia30Var.f(f2, nanoTime, this.e, ia30Var.b);
            if (this.i <= 0.0f) {
                if (i2 != -1) {
                    ia30Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    ia30Var.b.setTag(i, null);
                }
                ((ArrayList) vmn0Var.y).add(this);
            }
            if (this.i > 0.0f || f3) {
                ((MotionLayout) vmn0Var.a).invalidate();
                return;
            }
            return;
        }
        long nanoTime2 = System.nanoTime();
        long j2 = nanoTime2 - this.k;
        this.k = nanoTime2;
        float f4 = (((float) (j2 * 1.0E-6d)) * this.j) + this.i;
        this.i = f4;
        if (f4 >= 1.0f) {
            this.i = 1.0f;
        }
        float f5 = this.i;
        if (interpolator != null) {
            f5 = interpolator.getInterpolation(f5);
        }
        boolean f6 = ia30Var.f(f5, nanoTime2, this.e, ia30Var.b);
        if (this.i >= 1.0f) {
            if (i2 != -1) {
                ia30Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                ia30Var.b.setTag(i, null);
            }
            if (!this.m) {
                ((ArrayList) vmn0Var.y).add(this);
            }
        }
        if (this.i < 1.0f || f6) {
            ((MotionLayout) vmn0Var.a).invalidate();
        }
    }

    public final void b() {
        this.h = true;
        int i = this.d;
        if (i != -1) {
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        }
        ((MotionLayout) this.f.a).invalidate();
        this.k = System.nanoTime();
    }
}
