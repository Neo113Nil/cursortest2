package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.shapes.Shape;
import kotlin.a;
import ru.yandex.taxi.plus.design.gradient.delegate.CashbackRenderType;

/* loaded from: classes6.dex */
public final class ufd implements m39 {
    public kdd0 a;
    public final i3y b = a.a(new lyc(2, this));
    public CashbackRenderType c = CashbackRenderType.DEFAULT;

    public ufd() {
        g();
    }

    @Override // defpackage.m39
    public final void a(int i, int i2) {
        kdd0 kdd0Var = this.a;
        if (kdd0Var == null) {
            kdd0Var = null;
        }
        kdd0Var.a(i, i2);
    }

    @Override // defpackage.m39
    public final void b(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, float f3, Paint paint) {
        kdd0 kdd0Var = this.a;
        if (kdd0Var == null) {
            kdd0Var = null;
        }
        paint.setShader(kdd0Var.b());
        kdd0 kdd0Var2 = this.a;
        if (kdd0Var2 == null) {
            kdd0Var2 = null;
        }
        kdd0Var2.q(f);
        kdd0 kdd0Var3 = this.a;
        (kdd0Var3 != null ? kdd0Var3 : null).r(f3);
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // defpackage.m39
    public final void c(Canvas canvas, Rect rect) {
        canvas.drawRect(rect, (Paint) this.b.getValue());
    }

    @Override // defpackage.m39
    public final void d(float f, float f2) {
        kdd0 kdd0Var = this.a;
        if (kdd0Var == null) {
            kdd0Var = null;
        }
        kdd0Var.q(f);
        kdd0 kdd0Var2 = this.a;
        (kdd0Var2 != null ? kdd0Var2 : null).r(f2);
    }

    @Override // defpackage.m39
    public final void e(Shape shape, Canvas canvas, Paint paint) {
        kdd0 kdd0Var = this.a;
        if (kdd0Var == null) {
            kdd0Var = null;
        }
        paint.setShader(kdd0Var.b());
        shape.draw(canvas, paint);
    }

    @Override // defpackage.m39
    public final void f(CashbackRenderType cashbackRenderType) {
        this.c = cashbackRenderType;
        g();
    }

    public final void g() {
        kdd0 kdd0Var;
        int[] iArr = qke.d;
        int i = tfd.a[this.c.ordinal()];
        if (i == 1) {
            float[] fArr = qke.j;
            float f = qke.n;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            kdd0Var = new kdd0(new fes0(iArr, fArr, f, tileMode), new fes0(qke.c, qke.i, qke.n, tileMode), PorterDuff.Mode.SRC_OVER);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            float[] fArr2 = qke.h;
            float f2 = qke.n;
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            kdd0Var = new kdd0(new fes0(iArr, fArr2, f2, tileMode2), new fes0(qke.c, qke.g, qke.n, tileMode2), PorterDuff.Mode.SRC_OVER);
        }
        this.a = kdd0Var;
    }
}
