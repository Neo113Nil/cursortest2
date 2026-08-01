package U1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class b extends e {

    /* renamed from: U, reason: collision with root package name */
    public final Paint f3165U;

    /* renamed from: V, reason: collision with root package name */
    public int f3166V;

    /* renamed from: W, reason: collision with root package name */
    public int f3167W;

    public b() {
        e(-1);
        Paint paint = new Paint();
        this.f3165U = paint;
        paint.setAntiAlias(true);
        paint.setColor(this.f3166V);
    }

    @Override // U1.e
    public final void b(Canvas canvas) {
        Paint paint = this.f3165U;
        paint.setColor(this.f3166V);
        h(canvas, paint);
    }

    @Override // U1.e
    public final int c() {
        return this.f3167W;
    }

    @Override // U1.e
    public final void e(int i) {
        this.f3167W = i;
        i();
    }

    public abstract void h(Canvas canvas, Paint paint);

    public final void i() {
        int i = this.f3186H;
        int i6 = this.f3167W;
        this.f3166V = ((((i6 >>> 24) * (i + (i >> 7))) >> 8) << 24) | ((i6 << 8) >>> 8);
    }

    @Override // U1.e, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3186H = i;
        i();
    }

    @Override // U1.e, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3165U.setColorFilter(colorFilter);
    }
}
