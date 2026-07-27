package V1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.PathInterpolator;
import com.anythink.basead.exoplayer.k.p;

/* loaded from: classes.dex */
public final class e extends U1.b {
    public e() {
        g(0.0f);
    }

    @Override // U1.e
    public final ValueAnimator d() {
        Float valueOf = Float.valueOf(1.0f);
        float[] fArr = {0.0f, 0.7f, 1.0f};
        S1.e eVar = new S1.e(this);
        eVar.c(fArr, U1.e.f3177S, new Float[]{Float.valueOf(0.0f), valueOf, valueOf});
        eVar.d(fArr, U1.e.f3178T, new Integer[]{Integer.valueOf(p.f8473b), 178, 0});
        eVar.f2848c = 1000L;
        T1.a aVar = new T1.a(new PathInterpolator(0.21f, 0.53f, 0.56f, 0.8f), new float[0]);
        aVar.f3076b = fArr;
        eVar.f2847b = aVar;
        return eVar.a();
    }

    @Override // U1.b
    public final void h(Canvas canvas, Paint paint) {
        if (this.f3187I != null) {
            paint.setStyle(Paint.Style.STROKE);
            int min = Math.min(this.f3187I.width(), this.f3187I.height()) / 2;
            paint.setStrokeWidth(min / 12);
            canvas.drawCircle(this.f3187I.centerX(), this.f3187I.centerY(), min, paint);
        }
    }
}
