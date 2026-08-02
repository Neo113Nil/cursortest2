package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;

/* loaded from: classes6.dex */
public final class xyt implements vh4 {
    public final Paint a;
    public final wyt b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public fes0 j;
    public final fes0 k;
    public final float l;
    public final float m;
    public final Paint n;
    public final RectF o;

    public xyt(Paint paint, wyt wytVar, boolean z, boolean z2, int i, int i2, float f, int i3, int i4) {
        this.a = paint;
        this.b = wytVar;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = f;
        this.h = i3;
        this.i = i4;
        int[] iArr = qke.c;
        float[] fArr = qke.g;
        float f2 = qke.n;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.j = new fes0(iArr, fArr, f2, tileMode);
        this.k = new fes0(qke.d, qke.h, qke.n, tileMode);
        this.l = wytVar.C().getDimension(mrg0.go_design_s_space);
        this.m = TypedValue.applyDimension(1, 2.0f, wytVar.C().getDisplayMetrics());
        Paint paint2 = new Paint();
        paint2.setAlpha(0);
        paint2.setAntiAlias(true);
        this.n = paint2;
        paint.reset();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.o = new RectF();
    }

    @Override // defpackage.vh4
    public final int a() {
        return this.b.getPaddingTop();
    }

    @Override // defpackage.vh4
    public final int b() {
        return this.e;
    }

    @Override // defpackage.vh4
    public final void draw(Canvas canvas) {
        wyt wytVar = this.b;
        int paddingTop = wytVar.getPaddingTop();
        int width = wytVar.getWidth();
        int paddingTop2 = wytVar.getPaddingTop() + this.e;
        RectF rectF = this.o;
        rectF.set(0.0f, paddingTop, width, paddingTop2);
        boolean z = this.d;
        int i = this.f;
        if (z) {
            float f = this.l;
            int i2 = this.h;
            Paint paint = this.n;
            paint.setShadowLayer(this.g, 0.0f, f, i2);
            float f2 = i;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            if (this.c) {
                paint.setShadowLayer(1.0f, 0.0f, this.m, this.i);
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
        }
        int i3 = paddingTop2 - paddingTop;
        this.j.a(width, i3);
        fes0 fes0Var = this.k;
        fes0Var.a(width, i3);
        LinearGradient b = fes0Var.b();
        Paint paint2 = this.a;
        paint2.setShader(b);
        float f3 = i;
        canvas.drawRoundRect(rectF, f3, f3, paint2);
        paint2.setShader(this.j.b());
        canvas.drawRoundRect(rectF, f3, f3, paint2);
    }
}
