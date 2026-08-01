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
    public static final Rect f3170L = new Rect();

    /* renamed from: M, reason: collision with root package name */
    public static final d f3171M = new d("rotateX", 1);

    /* renamed from: N, reason: collision with root package name */
    public static final d f3172N = new d("rotate", 2);

    /* renamed from: O, reason: collision with root package name */
    public static final d f3173O = new d("rotateY", 3);

    /* renamed from: P, reason: collision with root package name */
    public static final c f3174P;

    /* renamed from: Q, reason: collision with root package name */
    public static final c f3175Q;

    /* renamed from: R, reason: collision with root package name */
    public static final c f3176R;

    /* renamed from: S, reason: collision with root package name */
    public static final c f3177S;

    /* renamed from: T, reason: collision with root package name */
    public static final d f3178T;

    /* renamed from: A, reason: collision with root package name */
    public int f3179A;

    /* renamed from: B, reason: collision with root package name */
    public int f3180B;

    /* renamed from: C, reason: collision with root package name */
    public int f3181C;

    /* renamed from: D, reason: collision with root package name */
    public int f3182D;

    /* renamed from: E, reason: collision with root package name */
    public float f3183E;

    /* renamed from: F, reason: collision with root package name */
    public float f3184F;

    /* renamed from: G, reason: collision with root package name */
    public ValueAnimator f3185G;

    /* renamed from: w, reason: collision with root package name */
    public float f3192w;

    /* renamed from: x, reason: collision with root package name */
    public float f3193x;

    /* renamed from: y, reason: collision with root package name */
    public int f3194y;

    /* renamed from: z, reason: collision with root package name */
    public int f3195z;

    /* renamed from: n, reason: collision with root package name */
    public float f3189n = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f3190u = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f3191v = 1.0f;

    /* renamed from: H, reason: collision with root package name */
    public int f3186H = p.f8473b;

    /* renamed from: I, reason: collision with root package name */
    public Rect f3187I = f3170L;
    public final Camera J = new Camera();

    /* renamed from: K, reason: collision with root package name */
    public final Matrix f3188K = new Matrix();

    static {
        new d("translateX", 4);
        new d("translateY", 5);
        f3174P = new c("translateXPercentage", 1);
        f3175Q = new c("translateYPercentage", 2);
        new c("scaleX", 3);
        f3176R = new c("scaleY", 4);
        f3177S = new c("scale", 0);
        f3178T = new d("alpha", 0);
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
        int i = this.f3180B;
        if (i == 0) {
            i = (int) (getBounds().width() * this.f3183E);
        }
        int i6 = this.f3181C;
        if (i6 == 0) {
            i6 = (int) (getBounds().height() * this.f3184F);
        }
        canvas.translate(i, i6);
        canvas.scale(this.f3190u, this.f3191v, this.f3192w, this.f3193x);
        canvas.rotate(this.f3182D, this.f3192w, this.f3193x);
        if (this.f3195z != 0 || this.f3179A != 0) {
            Camera camera = this.J;
            camera.save();
            camera.rotateX(this.f3195z);
            camera.rotateY(this.f3179A);
            Matrix matrix = this.f3188K;
            camera.getMatrix(matrix);
            matrix.preTranslate(-this.f3192w, -this.f3193x);
            matrix.postTranslate(this.f3192w, this.f3193x);
            camera.restore();
            canvas.concat(matrix);
        }
        b(canvas);
    }

    public abstract void e(int i);

    public final void f(int i, int i6, int i9, int i10) {
        this.f3187I = new Rect(i, i6, i9, i10);
        this.f3192w = r0.centerX();
        this.f3193x = this.f3187I.centerY();
    }

    public final void g(float f3) {
        this.f3189n = f3;
        this.f3190u = f3;
        this.f3191v = f3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3186H;
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
        ValueAnimator valueAnimator = this.f3185G;
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
        this.f3186H = i;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.f3185G;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            if (this.f3185G == null) {
                this.f3185G = d();
            }
            ValueAnimator valueAnimator2 = this.f3185G;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(this);
                this.f3185G.setStartDelay(this.f3194y);
            }
            ValueAnimator valueAnimator3 = this.f3185G;
            this.f3185G = valueAnimator3;
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
        ValueAnimator valueAnimator = this.f3185G;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.f3185G.removeAllUpdateListeners();
        this.f3185G.end();
        this.f3189n = 1.0f;
        this.f3195z = 0;
        this.f3179A = 0;
        this.f3180B = 0;
        this.f3181C = 0;
        this.f3182D = 0;
        this.f3183E = 0.0f;
        this.f3184F = 0.0f;
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
