package l1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: l1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC4670e extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: E, reason: collision with root package name */
    public Z0.i f38823E;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f38826n = new CopyOnWriteArraySet();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArraySet f38827u = new CopyOnWriteArraySet();

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArraySet f38828v = new CopyOnWriteArraySet();

    /* renamed from: w, reason: collision with root package name */
    public float f38829w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f38830x = false;

    /* renamed from: y, reason: collision with root package name */
    public long f38831y = 0;

    /* renamed from: z, reason: collision with root package name */
    public float f38832z = 0.0f;

    /* renamed from: A, reason: collision with root package name */
    public float f38819A = 0.0f;

    /* renamed from: B, reason: collision with root package name */
    public int f38820B = 0;

    /* renamed from: C, reason: collision with root package name */
    public float f38821C = -2.1474836E9f;

    /* renamed from: D, reason: collision with root package name */
    public float f38822D = 2.1474836E9f;

    /* renamed from: F, reason: collision with root package name */
    public boolean f38824F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f38825G = false;

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f38827u.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38828v.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38826n.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f38827u.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        l(k());
        n(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        boolean z6 = false;
        if (this.f38824F) {
            n(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        Z0.i iVar = this.f38823E;
        if (iVar == null || !this.f38824F) {
            return;
        }
        float abs = (this.f38831y != 0 ? j6 - r2 : 0L) / ((1.0E9f / iVar.f3977n) / Math.abs(this.f38829w));
        float f2 = this.f38832z;
        if (k()) {
            abs = -abs;
        }
        float f9 = f2 + abs;
        float j9 = j();
        float i = i();
        PointF pointF = AbstractC4672g.f38834a;
        if (f9 >= j9 && f9 <= i) {
            z6 = true;
        }
        float f10 = this.f38832z;
        float b9 = AbstractC4672g.b(f9, j(), i());
        this.f38832z = b9;
        if (this.f38825G) {
            b9 = (float) Math.floor(b9);
        }
        this.f38819A = b9;
        this.f38831y = j6;
        if (z6) {
            if (!this.f38825G || this.f38832z != f10) {
                m();
            }
        } else if (getRepeatCount() == -1 || this.f38820B < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f38830x = !this.f38830x;
                this.f38829w = -this.f38829w;
            } else {
                float i4 = k() ? i() : j();
                this.f38832z = i4;
                this.f38819A = i4;
            }
            this.f38831y = j6;
            if (!this.f38825G || this.f38832z != f10) {
                m();
            }
            Iterator it = this.f38827u.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f38820B++;
        } else {
            float j10 = this.f38829w < 0.0f ? j() : i();
            this.f38832z = j10;
            this.f38819A = j10;
            n(true);
            if (!this.f38825G || this.f38832z != f10) {
                m();
            }
            l(k());
        }
        if (this.f38823E == null) {
            return;
        }
        float f11 = this.f38819A;
        if (f11 < this.f38821C || f11 > this.f38822D) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f38821C), Float.valueOf(this.f38822D), Float.valueOf(this.f38819A)));
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float j6;
        float i;
        float j9;
        if (this.f38823E == null) {
            return 0.0f;
        }
        if (k()) {
            j6 = i() - this.f38819A;
            i = i();
            j9 = j();
        } else {
            j6 = this.f38819A - j();
            i = i();
            j9 = j();
        }
        return j6 / (i - j9);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        Z0.i iVar = this.f38823E;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final float h() {
        Z0.i iVar = this.f38823E;
        if (iVar == null) {
            return 0.0f;
        }
        float f2 = this.f38819A;
        float f9 = iVar.f3975l;
        return (f2 - f9) / (iVar.f3976m - f9);
    }

    public final float i() {
        Z0.i iVar = this.f38823E;
        if (iVar == null) {
            return 0.0f;
        }
        float f2 = this.f38822D;
        return f2 == 2.1474836E9f ? iVar.f3976m : f2;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f38824F;
    }

    public final float j() {
        Z0.i iVar = this.f38823E;
        if (iVar == null) {
            return 0.0f;
        }
        float f2 = this.f38821C;
        return f2 == -2.1474836E9f ? iVar.f3975l : f2;
    }

    public final boolean k() {
        return this.f38829w < 0.0f;
    }

    public final void l(boolean z6) {
        Iterator it = this.f38827u.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z6);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void m() {
        Iterator it = this.f38826n.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void n(boolean z6) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z6) {
            this.f38824F = false;
        }
    }

    public final void o(float f2) {
        if (this.f38832z == f2) {
            return;
        }
        float b9 = AbstractC4672g.b(f2, j(), i());
        this.f38832z = b9;
        if (this.f38825G) {
            b9 = (float) Math.floor(b9);
        }
        this.f38819A = b9;
        this.f38831y = 0L;
        m();
    }

    public final void p(float f2, float f9) {
        if (f2 > f9) {
            throw new IllegalArgumentException("minFrame (" + f2 + ") must be <= maxFrame (" + f9 + ")");
        }
        Z0.i iVar = this.f38823E;
        float f10 = iVar == null ? -3.4028235E38f : iVar.f3975l;
        float f11 = iVar == null ? Float.MAX_VALUE : iVar.f3976m;
        float b9 = AbstractC4672g.b(f2, f10, f11);
        float b10 = AbstractC4672g.b(f9, f10, f11);
        if (b9 == this.f38821C && b10 == this.f38822D) {
            return;
        }
        this.f38821C = b9;
        this.f38822D = b10;
        o((int) AbstractC4672g.b(this.f38819A, b9, b10));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f38827u.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f38826n.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f38827u.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38828v.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38826n.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j6) {
        setDuration(j6);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f38830x) {
            return;
        }
        this.f38830x = false;
        this.f38829w = -this.f38829w;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j6) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j6) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
