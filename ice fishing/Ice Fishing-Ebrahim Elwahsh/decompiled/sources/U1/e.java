package U1;

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
    public static final Rect f3248L = new Rect();

    /* renamed from: M, reason: collision with root package name */
    public static final d f3249M = new d("rotateX", 1);

    /* renamed from: N, reason: collision with root package name */
    public static final d f3250N = new d("rotate", 2);

    /* renamed from: O, reason: collision with root package name */
    public static final d f3251O = new d("rotateY", 3);

    /* renamed from: P, reason: collision with root package name */
    public static final c f3252P;

    /* renamed from: Q, reason: collision with root package name */
    public static final c f3253Q;

    /* renamed from: R, reason: collision with root package name */
    public static final c f3254R;

    /* renamed from: S, reason: collision with root package name */
    public static final c f3255S;

    /* renamed from: T, reason: collision with root package name */
    public static final d f3256T;

    /* renamed from: A, reason: collision with root package name */
    public int f3257A;

    /* renamed from: B, reason: collision with root package name */
    public int f3258B;

    /* renamed from: C, reason: collision with root package name */
    public int f3259C;

    /* renamed from: D, reason: collision with root package name */
    public int f3260D;

    /* renamed from: E, reason: collision with root package name */
    public float f3261E;

    /* renamed from: F, reason: collision with root package name */
    public float f3262F;

    /* renamed from: G, reason: collision with root package name */
    public ValueAnimator f3263G;

    /* renamed from: w, reason: collision with root package name */
    public float f3270w;

    /* renamed from: x, reason: collision with root package name */
    public float f3271x;

    /* renamed from: y, reason: collision with root package name */
    public int f3272y;

    /* renamed from: z, reason: collision with root package name */
    public int f3273z;

    /* renamed from: n, reason: collision with root package name */
    public float f3267n = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f3268u = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f3269v = 1.0f;

    /* renamed from: H, reason: collision with root package name */
    public int f3264H = p.f8630b;

    /* renamed from: I, reason: collision with root package name */
    public Rect f3265I = f3248L;
    public final Camera J = new Camera();

    /* renamed from: K, reason: collision with root package name */
    public final Matrix f3266K = new Matrix();

    static {
        new d("translateX", 4);
        new d("translateY", 5);
        f3252P = new c("translateXPercentage", 1);
        f3253Q = new c("translateYPercentage", 2);
        new c("scaleX", 3);
        f3254R = new c("scaleY", 4);
        f3255S = new c("scale", 0);
        f3256T = new d("alpha", 0);
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
        int i = this.f3258B;
        if (i == 0) {
            i = (int) (getBounds().width() * this.f3261E);
        }
        int i4 = this.f3259C;
        if (i4 == 0) {
            i4 = (int) (getBounds().height() * this.f3262F);
        }
        canvas.translate(i, i4);
        canvas.scale(this.f3268u, this.f3269v, this.f3270w, this.f3271x);
        canvas.rotate(this.f3260D, this.f3270w, this.f3271x);
        if (this.f3273z != 0 || this.f3257A != 0) {
            Camera camera = this.J;
            camera.save();
            camera.rotateX(this.f3273z);
            camera.rotateY(this.f3257A);
            Matrix matrix = this.f3266K;
            camera.getMatrix(matrix);
            matrix.preTranslate(-this.f3270w, -this.f3271x);
            matrix.postTranslate(this.f3270w, this.f3271x);
            camera.restore();
            canvas.concat(matrix);
        }
        b(canvas);
    }

    public abstract void e(int i);

    public final void f(int i, int i4, int i9, int i10) {
        this.f3265I = new Rect(i, i4, i9, i10);
        this.f3270w = r0.centerX();
        this.f3271x = this.f3265I.centerY();
    }

    public final void g(float f6) {
        this.f3267n = f6;
        this.f3268u = f6;
        this.f3269v = f6;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3264H;
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
        ValueAnimator valueAnimator = this.f3263G;
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
        this.f3264H = i;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.f3263G;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            if (this.f3263G == null) {
                this.f3263G = d();
            }
            ValueAnimator valueAnimator2 = this.f3263G;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(this);
                this.f3263G.setStartDelay(this.f3272y);
            }
            ValueAnimator valueAnimator3 = this.f3263G;
            this.f3263G = valueAnimator3;
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
        ValueAnimator valueAnimator = this.f3263G;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.f3263G.removeAllUpdateListeners();
        this.f3263G.end();
        this.f3267n = 1.0f;
        this.f3273z = 0;
        this.f3257A = 0;
        this.f3258B = 0;
        this.f3259C = 0;
        this.f3260D = 0;
        this.f3261E = 0.0f;
        this.f3262F = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
    }
}
