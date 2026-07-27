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
import com.google.android.gms.internal.ads.C2991bm;
import j1.C4597a;

/* renamed from: f1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4504g extends AbstractC4498a {

    /* renamed from: D, reason: collision with root package name */
    public final RectF f37421D;

    /* renamed from: E, reason: collision with root package name */
    public final Y0.a f37422E;

    /* renamed from: F, reason: collision with root package name */
    public final float[] f37423F;

    /* renamed from: G, reason: collision with root package name */
    public final Path f37424G;

    /* renamed from: H, reason: collision with root package name */
    public final C4501d f37425H;

    /* renamed from: I, reason: collision with root package name */
    public s f37426I;
    public s J;

    public C4504g(v vVar, C4501d c4501d) {
        super(vVar, c4501d);
        this.f37421D = new RectF();
        Y0.a aVar = new Y0.a();
        this.f37422E = aVar;
        this.f37423F = new float[8];
        this.f37424G = new Path();
        this.f37425H = c4501d;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(c4501d.f37404l);
    }

    @Override // f1.AbstractC4498a, Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        super.c(rectF, matrix, z3);
        RectF rectF2 = this.f37421D;
        C4501d c4501d = this.f37425H;
        rectF2.set(0.0f, 0.0f, c4501d.f37402j, c4501d.f37403k);
        this.f37363n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // f1.AbstractC4498a, c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        super.h(colorFilter, c2991bm);
        if (colorFilter == z.f3724I) {
            this.f37426I = new s(c2991bm, null);
        } else if (colorFilter == 1) {
            this.J = new s(c2991bm, null);
        }
    }

    @Override // f1.AbstractC4498a
    public final void k(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        C4501d c4501d = this.f37425H;
        int alpha = Color.alpha(c4501d.f37404l);
        if (alpha == 0) {
            return;
        }
        s sVar = this.J;
        Integer num = sVar == null ? null : (Integer) sVar.e();
        Y0.a aVar = this.f37422E;
        if (num != null) {
            aVar.setColor(num.intValue());
        } else {
            aVar.setColor(c4501d.f37404l);
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.f37372w.f4305p == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        aVar.setAlpha(intValue);
        if (c4597a == null) {
            aVar.clearShadowLayer();
        } else if (Color.alpha(c4597a.f38299d) > 0) {
            aVar.setShadowLayer(Math.max(c4597a.f38296a, Float.MIN_VALUE), c4597a.f38297b, c4597a.f38298c, c4597a.f38299d);
        } else {
            aVar.clearShadowLayer();
        }
        s sVar2 = this.f37426I;
        if (sVar2 != null) {
            aVar.setColorFilter((ColorFilter) sVar2.e());
        }
        if (intValue > 0) {
            float[] fArr = this.f37423F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f3 = c4501d.f37402j;
            fArr[2] = f3;
            fArr[3] = 0.0f;
            fArr[4] = f3;
            float f9 = c4501d.f37403k;
            fArr[5] = f9;
            fArr[6] = 0.0f;
            fArr[7] = f9;
            matrix.mapPoints(fArr);
            Path path = this.f37424G;
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
