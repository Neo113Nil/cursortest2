package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class h3r extends ds2 {
    public final RectF D;
    public final pif E;
    public final float[] F;
    public final Path G;
    public final iof H;
    public rwt I;
    public rwt J;

    public h3r(czg czgVar, iof iofVar) {
        super(czgVar, iofVar);
        this.D = new RectF();
        pif pifVar = new pif();
        this.E = pifVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = iofVar;
        pifVar.setAlpha(0);
        pifVar.setStyle(Paint.Style.FILL);
        pifVar.setColor(iofVar.l);
    }

    @Override // defpackage.ds2, defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        iof iofVar = this.H;
        float f = iofVar.j;
        float f2 = iofVar.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.ds2, defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        super.f(szgVar, obj);
        if (obj == lzg.I) {
            if (szgVar == null) {
                this.I = null;
                return;
            } else {
                this.I = new rwt(szgVar, null);
                return;
            }
        }
        if (obj == 1) {
            if (szgVar != null) {
                this.J = new rwt(szgVar, null);
                return;
            }
            this.J = null;
            this.E.setColor(this.H.l);
        }
    }

    @Override // defpackage.ds2
    public final void j(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        iof iofVar = this.H;
        int alpha = Color.alpha(iofVar.l);
        if (alpha == 0) {
            return;
        }
        rwt rwtVar = this.J;
        Integer num = rwtVar == null ? null : (Integer) rwtVar.e();
        pif pifVar = this.E;
        if (num != null) {
            pifVar.setColor(num.intValue());
        } else {
            pifVar.setColor(iofVar.l);
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.w.p == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        pifVar.setAlpha(intValue);
        if (qraVar == null) {
            pifVar.clearShadowLayer();
        } else if (Color.alpha(qraVar.d) > 0) {
            pifVar.setShadowLayer(Math.max(qraVar.a, Float.MIN_VALUE), qraVar.b, qraVar.c, qraVar.d);
        } else {
            pifVar.clearShadowLayer();
        }
        rwt rwtVar2 = this.I;
        if (rwtVar2 != null) {
            pifVar.setColorFilter((ColorFilter) rwtVar2.e());
        }
        if (intValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = iofVar.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = iofVar.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, pifVar);
        }
    }
}
