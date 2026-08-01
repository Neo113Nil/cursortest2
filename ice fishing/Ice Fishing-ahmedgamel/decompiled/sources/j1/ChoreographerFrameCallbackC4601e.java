package j1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC4601e extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: E, reason: collision with root package name */
    public X0.i f38311E;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f38314n = new CopyOnWriteArraySet();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArraySet f38315u = new CopyOnWriteArraySet();

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArraySet f38316v = new CopyOnWriteArraySet();

    /* renamed from: w, reason: collision with root package name */
    public float f38317w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f38318x = false;

    /* renamed from: y, reason: collision with root package name */
    public long f38319y = 0;

    /* renamed from: z, reason: collision with root package name */
    public float f38320z = 0.0f;

    /* renamed from: A, reason: collision with root package name */
    public float f38307A = 0.0f;

    /* renamed from: B, reason: collision with root package name */
    public int f38308B = 0;

    /* renamed from: C, reason: collision with root package name */
    public float f38309C = -2.1474836E9f;

    /* renamed from: D, reason: collision with root package name */
    public float f38310D = 2.1474836E9f;

    /* renamed from: F, reason: collision with root package name */
    public boolean f38312F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f38313G = false;

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f38315u.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38316v.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38314n.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f38315u.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        l(k());
        n(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        boolean z3 = false;
        if (this.f38312F) {
            n(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        X0.i iVar = this.f38311E;
        if (iVar == null || !this.f38312F) {
            return;
        }
        float abs = (this.f38319y != 0 ? j6 - r2 : 0L) / ((1.0E9f / iVar.f3625n) / Math.abs(this.f38317w));
        float f3 = this.f38320z;
        if (k()) {
            abs = -abs;
        }
        float f9 = f3 + abs;
        float j9 = j();
        float i = i();
        PointF pointF = AbstractC4603g.f38322a;
        if (f9 >= j9 && f9 <= i) {
            z3 = true;
        }
        float f10 = this.f38320z;
        float b9 = AbstractC4603g.b(f9, j(), i());
        this.f38320z = b9;
        if (this.f38313G) {
            b9 = (float) Math.floor(b9);
        }
        this.f38307A = b9;
        this.f38319y = j6;
        if (z3) {
            if (!this.f38313G || this.f38320z != f10) {
                m();
            }
        } else if (getRepeatCount() == -1 || this.f38308B < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f38318x = !this.f38318x;
                this.f38317w = -this.f38317w;
            } else {
                float i6 = k() ? i() : j();
                this.f38320z = i6;
                this.f38307A = i6;
            }
            this.f38319y = j6;
            if (!this.f38313G || this.f38320z != f10) {
                m();
            }
            Iterator it = this.f38315u.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f38308B++;
        } else {
            float j10 = this.f38317w < 0.0f ? j() : i();
            this.f38320z = j10;
            this.f38307A = j10;
            n(true);
            if (!this.f38313G || this.f38320z != f10) {
                m();
            }
            l(k());
        }
        if (this.f38311E == null) {
            return;
        }
        float f11 = this.f38307A;
        if (f11 < this.f38309C || f11 > this.f38310D) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f38309C), Float.valueOf(this.f38310D), Float.valueOf(this.f38307A)));
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float j6;
        float i;
        float j9;
        if (this.f38311E == null) {
            return 0.0f;
        }
        if (k()) {
            j6 = i() - this.f38307A;
            i = i();
            j9 = j();
        } else {
            j6 = this.f38307A - j();
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
        X0.i iVar = this.f38311E;
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
        X0.i iVar = this.f38311E;
        if (iVar == null) {
            return 0.0f;
        }
        float f3 = this.f38307A;
        float f9 = iVar.f3623l;
        return (f3 - f9) / (iVar.f3624m - f9);
    }

    public final float i() {
        X0.i iVar = this.f38311E;
        if (iVar == null) {
            return 0.0f;
        }
        float f3 = this.f38310D;
        return f3 == 2.1474836E9f ? iVar.f3624m : f3;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f38312F;
    }

    public final float j() {
        X0.i iVar = this.f38311E;
        if (iVar == null) {
            return 0.0f;
        }
        float f3 = this.f38309C;
        return f3 == -2.1474836E9f ? iVar.f3623l : f3;
    }

    public final boolean k() {
        return this.f38317w < 0.0f;
    }

    public final void l(boolean z3) {
        Iterator it = this.f38315u.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z3);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void m() {
        Iterator it = this.f38314n.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void n(boolean z3) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z3) {
            this.f38312F = false;
        }
    }

    public final void o(float f3) {
        if (this.f38320z == f3) {
            return;
        }
        float b9 = AbstractC4603g.b(f3, j(), i());
        this.f38320z = b9;
        if (this.f38313G) {
            b9 = (float) Math.floor(b9);
        }
        this.f38307A = b9;
        this.f38319y = 0L;
        m();
    }

    public final void p(float f3, float f9) {
        if (f3 > f9) {
            throw new IllegalArgumentException("minFrame (" + f3 + ") must be <= maxFrame (" + f9 + ")");
        }
        X0.i iVar = this.f38311E;
        float f10 = iVar == null ? -3.4028235E38f : iVar.f3623l;
        float f11 = iVar == null ? Float.MAX_VALUE : iVar.f3624m;
        float b9 = AbstractC4603g.b(f3, f10, f11);
        float b10 = AbstractC4603g.b(f9, f10, f11);
        if (b9 == this.f38309C && b10 == this.f38310D) {
            return;
        }
        this.f38309C = b9;
        this.f38310D = b10;
        o((int) AbstractC4603g.b(this.f38307A, b9, b10));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f38315u.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f38314n.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f38315u.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38316v.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38314n.remove(animatorUpdateListener);
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
        if (i == 2 || !this.f38318x) {
            return;
        }
        this.f38318x = false;
        this.f38317w = -this.f38317w;
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
