package h1;

import Z0.v;
import Z0.z;
import a1.C0428a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c1.s;
import com.google.android.gms.internal.ads.LP;
import l1.C4666a;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4569g extends AbstractC4563a {

    /* renamed from: D, reason: collision with root package name */
    public final RectF f38045D;

    /* renamed from: E, reason: collision with root package name */
    public final C0428a f38046E;

    /* renamed from: F, reason: collision with root package name */
    public final float[] f38047F;

    /* renamed from: G, reason: collision with root package name */
    public final Path f38048G;

    /* renamed from: H, reason: collision with root package name */
    public final C4566d f38049H;

    /* renamed from: I, reason: collision with root package name */
    public s f38050I;
    public s J;

    public C4569g(v vVar, C4566d c4566d) {
        super(vVar, c4566d);
        this.f38045D = new RectF();
        C0428a c0428a = new C0428a();
        this.f38046E = c0428a;
        this.f38047F = new float[8];
        this.f38048G = new Path();
        this.f38049H = c4566d;
        c0428a.setAlpha(0);
        c0428a.setStyle(Paint.Style.FILL);
        c0428a.setColor(c4566d.f38028l);
    }

    @Override // h1.AbstractC4563a, e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        super.d(colorFilter, lp);
        if (colorFilter == z.f4075I) {
            this.f38050I = new s(lp, null);
        } else if (colorFilter == 1) {
            this.J = new s(lp, null);
        }
    }

    @Override // h1.AbstractC4563a, b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        super.e(rectF, matrix, z6);
        RectF rectF2 = this.f38045D;
        C4566d c4566d = this.f38049H;
        rectF2.set(0.0f, 0.0f, c4566d.f38026j, c4566d.f38027k);
        this.f37987n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // h1.AbstractC4563a
    public final void k(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        C4566d c4566d = this.f38049H;
        int alpha = Color.alpha(c4566d.f38028l);
        if (alpha == 0) {
            return;
        }
        s sVar = this.J;
        Integer num = sVar == null ? null : (Integer) sVar.e();
        C0428a c0428a = this.f38046E;
        if (num != null) {
            c0428a.setColor(num.intValue());
        } else {
            c0428a.setColor(c4566d.f38028l);
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.f37996w.f5700p == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        c0428a.setAlpha(intValue);
        if (c4666a == null) {
            c0428a.clearShadowLayer();
        } else if (Color.alpha(c4666a.f38811d) > 0) {
            c0428a.setShadowLayer(Math.max(c4666a.f38808a, Float.MIN_VALUE), c4666a.f38809b, c4666a.f38810c, c4666a.f38811d);
        } else {
            c0428a.clearShadowLayer();
        }
        s sVar2 = this.f38050I;
        if (sVar2 != null) {
            c0428a.setColorFilter((ColorFilter) sVar2.e());
        }
        if (intValue > 0) {
            float[] fArr = this.f38047F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f2 = c4566d.f38026j;
            fArr[2] = f2;
            fArr[3] = 0.0f;
            fArr[4] = f2;
            float f9 = c4566d.f38027k;
            fArr[5] = f9;
            fArr[6] = 0.0f;
            fArr[7] = f9;
            matrix.mapPoints(fArr);
            Path path = this.f38048G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, c0428a);
        }
    }
}
