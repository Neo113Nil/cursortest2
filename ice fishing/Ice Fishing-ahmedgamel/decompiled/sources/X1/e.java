package X1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.PathInterpolator;
import com.anythink.basead.exoplayer.k.p;

/* loaded from: classes.dex */
public final class e extends W1.b {
    public e() {
        g(0.0f);
    }

    @Override // W1.e
    public final ValueAnimator d() {
        Float valueOf = Float.valueOf(1.0f);
        float[] fArr = {0.0f, 0.7f, 1.0f};
        U1.e eVar = new U1.e(this);
        eVar.c(fArr, W1.e.f3546S, new Float[]{Float.valueOf(0.0f), valueOf, valueOf});
        eVar.d(fArr, W1.e.f3547T, new Integer[]{Integer.valueOf(p.f9259b), 178, 0});
        eVar.f3287c = 1000L;
        V1.a aVar = new V1.a(new PathInterpolator(0.21f, 0.53f, 0.56f, 0.8f), new float[0]);
        aVar.f3392b = fArr;
        eVar.f3286b = aVar;
        return eVar.a();
    }

    @Override // W1.b
    public final void h(Canvas canvas, Paint paint) {
        if (this.f3556I != null) {
            paint.setStyle(Paint.Style.STROKE);
            int min = Math.min(this.f3556I.width(), this.f3556I.height()) / 2;
            paint.setStrokeWidth(min / 12);
            canvas.drawCircle(this.f3556I.centerX(), this.f3556I.centerY(), min, paint);
        }
    }
}
