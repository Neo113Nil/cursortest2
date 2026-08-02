package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class hdq extends Drawable {
    public static final jsg j = new jsg(-1, 2);
    public final TransportCardsActivity a;
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public jsg f;
    public final float[] g;
    public final Object h;
    public final hr2 i;

    public hdq(TransportCardsActivity transportCardsActivity) {
        this.a = transportCardsActivity;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        this.f = j;
        this.g = new float[]{0.0f, 0.5f, 1.0f};
        this.h = btf.a(bwf.c, new kgk(19, this));
        this.i = new hr2(16, this);
    }

    public static jsg a(String str) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Integer.valueOf(Color.parseColor("#".concat(StringsKt.Y(str, "#"))));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        Integer num = (Integer) t7oVar;
        if (num != null) {
            return new jsg(num.intValue(), 2);
        }
        return null;
    }

    public final void b() {
        ValueAnimator valueAnimator = this.e;
        if ((valueAnimator != null ? valueAnimator.isStarted() : false) || getCallback() == null) {
            return;
        }
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            valueAnimator2.setStartDelay(0L);
        }
        ValueAnimator valueAnimator3 = this.e;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void c() {
        Rect bounds = getBounds();
        bounds.getClass();
        if (bounds.isEmpty()) {
            return;
        }
        float width = this.c.width();
        int i = this.f.b;
        int argb = Color.argb((int) (yhn.c(0.0f, 0.0f, 1.0f) * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        int i2 = this.f.b;
        int argb2 = Color.argb((int) (yhn.c(0.6f, 0.0f, 1.0f) * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
        int i3 = this.f.b;
        this.b.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, new int[]{argb, argb2, Color.argb((int) (yhn.c(0.0f, 0.0f, 1.0f) * 255.0f), Color.red(i3), Color.green(i3), Color.blue(i3))}, this.g, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [arf, java.lang.Object] */
    public final void d() {
        ValueAnimator valueAnimator = this.e;
        boolean isStarted = valueAnimator != null ? valueAnimator.isStarted() : false;
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.e;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.e;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(1250L);
        ofFloat.addUpdateListener(this.i);
        ofFloat.setInterpolator((Interpolator) this.h.getValue());
        ofFloat.addListener(new q2e(this));
        if (isStarted) {
            ofFloat.start();
        }
        this.e = ofFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Paint paint = this.b;
        Shader shader = paint.getShader();
        if (shader == null) {
            return;
        }
        Rect rect = this.c;
        float width = rect.width();
        ValueAnimator valueAnimator = this.e;
        float f = -width;
        float width2 = ((getBounds().width() - f) * (valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f)) + f;
        Matrix matrix = this.d;
        matrix.reset();
        matrix.postTranslate(width2, 0.0f);
        shader.setLocalMatrix(matrix);
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width() * 2, rect.height());
        c();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
