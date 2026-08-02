package W1;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.anythink.basead.exoplayer.k.p;

/* loaded from: classes.dex */
public abstract class e extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {

    /* renamed from: L, reason: collision with root package name */
    public static final Rect f3539L = new Rect();

    /* renamed from: M, reason: collision with root package name */
    public static final d f3540M = new d("rotateX", 1);

    /* renamed from: N, reason: collision with root package name */
    public static final d f3541N = new d("rotate", 2);

    /* renamed from: O, reason: collision with root package name */
    public static final d f3542O = new d("rotateY", 3);

    /* renamed from: P, reason: collision with root package name */
    public static final c f3543P;

    /* renamed from: Q, reason: collision with root package name */
    public static final c f3544Q;

    /* renamed from: R, reason: collision with root package name */
    public static final c f3545R;

    /* renamed from: S, reason: collision with root package name */
    public static final c f3546S;

    /* renamed from: T, reason: collision with root package name */
    public static final d f3547T;

    /* renamed from: A, reason: collision with root package name */
    public int f3548A;

    /* renamed from: B, reason: collision with root package name */
    public int f3549B;

    /* renamed from: C, reason: collision with root package name */
    public int f3550C;

    /* renamed from: D, reason: collision with root package name */
    public int f3551D;

    /* renamed from: E, reason: collision with root package name */
    public float f3552E;

    /* renamed from: F, reason: collision with root package name */
    public float f3553F;

    /* renamed from: G, reason: collision with root package name */
    public ValueAnimator f3554G;

    /* renamed from: w, reason: collision with root package name */
    public float f3561w;

    /* renamed from: x, reason: collision with root package name */
    public float f3562x;

    /* renamed from: y, reason: collision with root package name */
    public int f3563y;

    /* renamed from: z, reason: collision with root package name */
    public int f3564z;

    /* renamed from: n, reason: collision with root package name */
    public float f3558n = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f3559u = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f3560v = 1.0f;

    /* renamed from: H, reason: collision with root package name */
    public int f3555H = p.f9259b;

    /* renamed from: I, reason: collision with root package name */
    public Rect f3556I = f3539L;
    public final Camera J = new Camera();

    /* renamed from: K, reason: collision with root package name */
    public final Matrix f3557K = new Matrix();

    static {
        new d("translateX", 4);
        new d("translateY", 5);
        f3543P = new c("translateXPercentage", 1);
        f3544Q = new c("translateYPercentage", 2);
        new c("scaleX", 3);
        f3545R = new c("scaleY", 4);
        f3546S = new c("scale", 0);
        f3547T = new d("alpha", 0);
    }

    public static Rect a(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i = min / 2;
        return new Rect(centerX - i, centerY - i, centerX + i, centerY + i);
    }

    public abstract void b(Canvas canvas);

    public abstract int c();

    public abstract ValueAnimator d();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = this.f3549B;
        if (i == 0) {
            i = (int) (getBounds().width() * this.f3552E);
        }
        int i4 = this.f3550C;
        if (i4 == 0) {
            i4 = (int) (getBounds().height() * this.f3553F);
        }
        canvas.translate(i, i4);
        canvas.scale(this.f3559u, this.f3560v, this.f3561w, this.f3562x);
        canvas.rotate(this.f3551D, this.f3561w, this.f3562x);
        if (this.f3564z != 0 || this.f3548A != 0) {
            Camera camera = this.J;
            camera.save();
            camera.rotateX(this.f3564z);
            camera.rotateY(this.f3548A);
            Matrix matrix = this.f3557K;
            camera.getMatrix(matrix);
            matrix.preTranslate(-this.f3561w, -this.f3562x);
            matrix.postTranslate(this.f3561w, this.f3562x);
            camera.restore();
            canvas.concat(matrix);
        }
        b(canvas);
    }

    public abstract void e(int i);

    public final void f(int i, int i4, int i6, int i9) {
        this.f3556I = new Rect(i, i4, i6, i9);
        this.f3561w = r0.centerX();
        this.f3562x = this.f3556I.centerY();
    }

    public final void g(float f2) {
        this.f3558n = f2;
        this.f3559u = f2;
        this.f3560v = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3555H;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.f3554G;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3555H = i;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.f3554G;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            if (this.f3554G == null) {
                this.f3554G = d();
            }
            ValueAnimator valueAnimator2 = this.f3554G;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(this);
                this.f3554G.setStartDelay(this.f3563y);
            }
            ValueAnimator valueAnimator3 = this.f3554G;
            this.f3554G = valueAnimator3;
            if (valueAnimator3 == null) {
                return;
            }
            if (!valueAnimator3.isStarted()) {
                valueAnimator3.start();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.f3554G;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.f3554G.removeAllUpdateListeners();
        this.f3554G.end();
        this.f3558n = 1.0f;
        this.f3564z = 0;
        this.f3548A = 0;
        this.f3549B = 0;
        this.f3550C = 0;
        this.f3551D = 0;
        this.f3552E = 0.0f;
        this.f3553F = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
    }
}
