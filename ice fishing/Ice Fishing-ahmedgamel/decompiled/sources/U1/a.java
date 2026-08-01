package U1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: X, reason: collision with root package name */
    public final /* synthetic */ int f3164X;

    @Override // U1.b
    public final void h(Canvas canvas, Paint paint) {
        switch (this.f3164X) {
            case 0:
                if (this.f3187I != null) {
                    canvas.drawCircle(this.f3187I.centerX(), this.f3187I.centerY(), Math.min(r0.width(), this.f3187I.height()) / 2, paint);
                    break;
                }
                break;
            default:
                Rect rect = this.f3187I;
                if (rect != null) {
                    canvas.drawRect(rect, paint);
                    break;
                }
                break;
        }
    }
}
