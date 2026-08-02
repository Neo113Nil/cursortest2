package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class rzg extends es2 implements Choreographer.FrameCallback {
    public float d;
    public boolean e;
    public long f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public ayg l;
    public boolean m;
    public boolean n;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        b(h());
        i(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.m) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        ayg aygVar = this.l;
        if (aygVar == null || !this.m) {
            return;
        }
        float abs = (this.f != 0 ? j - r2 : 0L) / ((1.0E9f / aygVar.n) / Math.abs(this.d));
        float f = this.g;
        if (h()) {
            abs = -abs;
        }
        float f2 = f + abs;
        float g = g();
        float f3 = f();
        PointF pointF = y5i.a;
        if (f2 >= g && f2 <= f3) {
            z = true;
        }
        float f4 = this.g;
        float b = y5i.b(f2, g(), f());
        this.g = b;
        if (this.n) {
            b = (float) Math.floor(b);
        }
        this.h = b;
        this.f = j;
        if (z) {
            if (!this.n || this.g != f4) {
                d();
            }
        } else if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.e = !this.e;
                this.d = -this.d;
            } else {
                float f5 = h() ? f() : g();
                this.g = f5;
                this.h = f5;
            }
            this.f = j;
            if (!this.n || this.g != f4) {
                d();
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.i++;
        } else {
            float g2 = this.d < 0.0f ? g() : f();
            this.g = g2;
            this.h = g2;
            i(true);
            if (!this.n || this.g != f4) {
                d();
            }
            b(h());
        }
        if (this.l == null) {
            return;
        }
        float f6 = this.h;
        float f7 = this.j;
        if (f6 < f7 || f6 > this.k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f7), Float.valueOf(this.k), Float.valueOf(this.h)));
        }
    }

    public final float e() {
        ayg aygVar = this.l;
        if (aygVar == null) {
            return 0.0f;
        }
        float f = this.h;
        float f2 = aygVar.l;
        return (f - f2) / (aygVar.m - f2);
    }

    public final float f() {
        ayg aygVar = this.l;
        if (aygVar == null) {
            return 0.0f;
        }
        float f = this.k;
        return f == 2.1474836E9f ? aygVar.m : f;
    }

    public final float g() {
        ayg aygVar = this.l;
        if (aygVar == null) {
            return 0.0f;
        }
        float f = this.j;
        return f == -2.1474836E9f ? aygVar.l : f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float g;
        float f;
        float g2;
        if (this.l == null) {
            return 0.0f;
        }
        if (h()) {
            g = f() - this.h;
            f = f();
            g2 = g();
        } else {
            g = this.h - g();
            f = f();
            g2 = g();
        }
        return g / (f - g2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(e());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        ayg aygVar = this.l;
        if (aygVar == null) {
            return 0L;
        }
        return (long) aygVar.b();
    }

    public final boolean h() {
        return this.d < 0.0f;
    }

    public final void i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.m;
    }

    public final void j(float f) {
        if (this.g == f) {
            return;
        }
        float b = y5i.b(f, g(), f());
        this.g = b;
        if (this.n) {
            b = (float) Math.floor(b);
        }
        this.h = b;
        this.f = 0L;
        d();
    }

    public final void k(float f, float f2) {
        if (f > f2) {
            e7o.k("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        ayg aygVar = this.l;
        float f3 = aygVar == null ? -3.4028235E38f : aygVar.l;
        float f4 = aygVar == null ? Float.MAX_VALUE : aygVar.m;
        float b = y5i.b(f, f3, f4);
        float b2 = y5i.b(f2, f3, f4);
        if (b == this.j && b2 == this.k) {
            return;
        }
        this.j = b;
        this.k = b2;
        j((int) y5i.b(this.h, b, b2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }
}
