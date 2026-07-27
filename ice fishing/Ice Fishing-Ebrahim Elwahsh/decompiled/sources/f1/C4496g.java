package f1;

import X0.v;
import X0.z;
import a1.s;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import j1.C4589b;

/* renamed from: f1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4496g extends AbstractC4490a {

    /* renamed from: D, reason: collision with root package name */
    public final RectF f37625D;

    /* renamed from: E, reason: collision with root package name */
    public final Y0.a f37626E;

    /* renamed from: F, reason: collision with root package name */
    public final float[] f37627F;

    /* renamed from: G, reason: collision with root package name */
    public final Path f37628G;

    /* renamed from: H, reason: collision with root package name */
    public final C4493d f37629H;

    /* renamed from: I, reason: collision with root package name */
    public s f37630I;
    public s J;

    public C4496g(v vVar, C4493d c4493d) {
        super(vVar, c4493d);
        this.f37625D = new RectF();
        Y0.a aVar = new Y0.a();
        this.f37626E = aVar;
        this.f37627F = new float[8];
        this.f37628G = new Path();
        this.f37629H = c4493d;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(c4493d.f37608l);
    }

    @Override // f1.AbstractC4490a, c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        super.c(colorFilter, sVar);
        if (colorFilter == z.f3780I) {
            this.f37630I = new s(sVar, null);
        } else if (colorFilter == 1) {
            this.J = new s(sVar, null);
        }
    }

    @Override // f1.AbstractC4490a, Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        RectF rectF2 = this.f37625D;
        C4493d c4493d = this.f37629H;
        rectF2.set(0.0f, 0.0f, c4493d.f37606j, c4493d.f37607k);
        this.f37567n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // f1.AbstractC4490a
    public final void k(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        C4493d c4493d = this.f37629H;
        int alpha = Color.alpha(c4493d.f37608l);
        if (alpha == 0) {
            return;
        }
        s sVar = this.J;
        Integer num = sVar == null ? null : (Integer) sVar.e();
        Y0.a aVar = this.f37626E;
        if (num != null) {
            aVar.setColor(num.intValue());
        } else {
            aVar.setColor(c4493d.f37608l);
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.f37576w.f4354p == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        aVar.setAlpha(intValue);
        if (c4589b == null) {
            aVar.clearShadowLayer();
        } else if (Color.alpha(c4589b.f38482d) > 0) {
            aVar.setShadowLayer(Math.max(c4589b.f38479a, Float.MIN_VALUE), c4589b.f38480b, c4589b.f38481c, c4589b.f38482d);
        } else {
            aVar.clearShadowLayer();
        }
        s sVar2 = this.f37630I;
        if (sVar2 != null) {
            aVar.setColorFilter((ColorFilter) sVar2.e());
        }
        if (intValue > 0) {
            float[] fArr = this.f37627F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f6 = c4493d.f37606j;
            fArr[2] = f6;
            fArr[3] = 0.0f;
            fArr[4] = f6;
            float f9 = c4493d.f37607k;
            fArr[5] = f9;
            fArr[6] = 0.0f;
            fArr[7] = f9;
            matrix.mapPoints(fArr);
            Path path = this.f37628G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar);
        }
    }
}
