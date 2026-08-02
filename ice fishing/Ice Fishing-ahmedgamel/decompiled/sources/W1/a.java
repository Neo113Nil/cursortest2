package W1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: X, reason: collision with root package name */
    public final /* synthetic */ int f3533X;

    @Override // W1.b
    public final void h(Canvas canvas, Paint paint) {
        switch (this.f3533X) {
            case 0:
                if (this.f3556I != null) {
                    canvas.drawCircle(this.f3556I.centerX(), this.f3556I.centerY(), Math.min(r0.width(), this.f3556I.height()) / 2, paint);
                    break;
                }
                break;
            default:
                Rect rect = this.f3556I;
                if (rect != null) {
                    canvas.drawRect(rect, paint);
                    break;
                }
                break;
        }
    }
}
