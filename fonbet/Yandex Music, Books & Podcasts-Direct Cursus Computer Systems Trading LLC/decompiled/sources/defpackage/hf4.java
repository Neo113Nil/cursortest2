package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class hf4 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ hf4(float f, long j) {
        this.b = f;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                float f = if4.b;
                float f2 = 2;
                float f3 = f / f2;
                jpa.D0(opfVar, this.c, opfVar.n0(if4.a + f3), swf.i(opfVar.n0(f3), opfVar.n0(((3 * f) / f2) - ((this.b - 1.0f) * f))), 0.0f, null, 8, 56);
                break;
            default:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                opfVar2.a();
                float n0 = opfVar2.n0(this.b);
                ou3 ou3Var = opfVar2.a;
                float c = nmq.c(ou3Var.e()) / 2.0f;
                float d = nmq.d(ou3Var.e()) / 2.0f;
                float b = nmq.b(ou3Var.e()) / 2.0f;
                Canvas a = vd0.a(ou3Var.b.s());
                a.saveLayer(new RectF(0.0f, 0.0f, nmq.d(ou3Var.e()), nmq.b(ou3Var.e())), null);
                Paint paint = new Paint();
                paint.setColor(c3x.U(this.c));
                a.drawCircle(d, b, c, paint);
                Paint paint2 = new Paint(1);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                paint2.setMaskFilter(new BlurMaskFilter(n0, BlurMaskFilter.Blur.NORMAL));
                a.drawCircle(d, b, c - n0, paint2);
                a.restore();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hf4(long j, float f) {
        this.c = j;
        this.b = f;
    }
}
