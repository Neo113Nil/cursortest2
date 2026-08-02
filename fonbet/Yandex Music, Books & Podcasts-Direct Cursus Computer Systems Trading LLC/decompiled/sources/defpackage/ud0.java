package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ud0 implements mu3 {
    public Canvas a = vd0.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.mu3
    public final void a(yg0 yg0Var, gh0 gh0Var) {
        this.a.drawBitmap(fx1.b(yg0Var), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), gh0Var.a);
    }

    @Override // defpackage.mu3
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.mu3
    public final void c(float f, long j, gh0 gh0Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, gh0Var.a);
    }

    @Override // defpackage.mu3
    public final void d(yg0 yg0Var, long j, long j2, long j3, long j4, gh0 gh0Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap b = fx1.b(yg0Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(b, rect, rect2, gh0Var.a);
    }

    @Override // defpackage.mu3
    public final void e(eak eakVar, gh0 gh0Var) {
        Canvas canvas = this.a;
        if (eakVar instanceof nh0) {
            canvas.drawPath(((nh0) eakVar).a, gh0Var.a);
        } else {
            qq6.d("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.mu3
    public final void f(float f, float f2, float f3, float f4, float f5, float f6, gh0 gh0Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, gh0Var.a);
    }

    @Override // defpackage.mu3
    public final void g(long j, long j2, gh0 gh0Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), gh0Var.a);
    }

    @Override // defpackage.mu3
    public final void h(eak eakVar) {
        Canvas canvas = this.a;
        if (eakVar instanceof nh0) {
            canvas.clipPath(((nh0) eakVar).a, Region.Op.INTERSECT);
        } else {
            qq6.d("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.mu3
    public final void i(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.mu3
    public final void j(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.mu3
    public final void k() {
        this.a.restore();
    }

    @Override // defpackage.mu3
    public final void l(ArrayList arrayList, gh0 gh0Var) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((enj) arrayList.get(i)).a;
            this.a.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), gh0Var.a);
        }
    }

    @Override // defpackage.mu3
    public final void m(ynn ynnVar, gh0 gh0Var) {
        this.a.saveLayer(ynnVar.a, ynnVar.b, ynnVar.c, ynnVar.d, gh0Var.a, 31);
    }

    @Override // defpackage.mu3
    public final void n() {
        u2x.C(this.a, true);
    }

    @Override // defpackage.mu3
    public final void o(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.mu3
    public final void p(float f, float f2, float f3, float f4, float f5, float f6, boolean z, gh0 gh0Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, z, gh0Var.a);
    }

    @Override // defpackage.mu3
    public final void q(float f, float f2, float f3, float f4, gh0 gh0Var) {
        this.a.drawOval(f, f2, f3, f4, gh0Var.a);
    }

    @Override // defpackage.mu3
    public final void r() {
        this.a.save();
    }

    @Override // defpackage.mu3
    public final void s() {
        u2x.C(this.a, false);
    }

    @Override // defpackage.mu3
    public final void t(float f, float f2, float f3, float f4, gh0 gh0Var) {
        this.a.drawRect(f, f2, f3, f4, gh0Var.a);
    }

    @Override // defpackage.mu3
    public final void u(float[] fArr) {
        if (tyf.B(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        cxb.i0(matrix, fArr);
        this.a.concat(matrix);
    }
}
