package W1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class b extends e {

    /* renamed from: U, reason: collision with root package name */
    public final Paint f3534U;

    /* renamed from: V, reason: collision with root package name */
    public int f3535V;

    /* renamed from: W, reason: collision with root package name */
    public int f3536W;

    public b() {
        e(-1);
        Paint paint = new Paint();
        this.f3534U = paint;
        paint.setAntiAlias(true);
        paint.setColor(this.f3535V);
    }

    @Override // W1.e
    public final void b(Canvas canvas) {
        Paint paint = this.f3534U;
        paint.setColor(this.f3535V);
        h(canvas, paint);
    }

    @Override // W1.e
    public final int c() {
        return this.f3536W;
    }

    @Override // W1.e
    public final void e(int i) {
        this.f3536W = i;
        i();
    }

    public abstract void h(Canvas canvas, Paint paint);

    public final void i() {
        int i = this.f3555H;
        int i4 = this.f3536W;
        this.f3535V = ((((i4 >>> 24) * (i + (i >> 7))) >> 8) << 24) | ((i4 << 8) >>> 8);
    }

    @Override // W1.e, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3555H = i;
        i();
    }

    @Override // W1.e, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3534U.setColorFilter(colorFilter);
    }
}
