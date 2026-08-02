package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class vfd implements n39 {
    public final q6c0 a;

    public vfd() {
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        ges0 ges0Var = new ges0(ri91.c, ri91.f, 56.31f);
        ges0 ges0Var2 = new ges0(ri91.a, ri91.e, 56.31f);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        this.a = new q6c0(ges0Var, ges0Var2);
    }

    @Override // defpackage.n39
    public final void a(int i, int i2, int i3, int i4) {
        this.a.a(i, i2, i3, i4);
    }

    @Override // defpackage.n39
    public final void b(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, float f3, Paint paint) {
        q6c0 q6c0Var = this.a;
        paint.setShader(q6c0Var.b());
        q6c0Var.c(f);
        q6c0Var.i(f3);
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }
}
