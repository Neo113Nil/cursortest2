package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class s72 implements i28 {
    public Canvas a = t72.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.i28
    public final void a(l8v l8vVar, long j, long j2, long j3, long j4, ka90 ka90Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap a = hua1.a(l8vVar);
        Rect rect = this.b;
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        Rect rect2 = this.c;
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        canvas.drawBitmap(a, rect, rect2, vez0.B(ka90Var));
    }

    @Override // defpackage.i28
    public final void b(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, hnb1.a(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.i28
    public final void c(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.i28
    public final void d(long j, long j2, ka90 ka90Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), vez0.B(ka90Var));
    }

    @Override // defpackage.i28
    public final void e(float f, float f2, float f3, float f4, float f5, float f6, ka90 ka90Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, vez0.B(ka90Var));
    }

    @Override // defpackage.i28
    public final void f() {
        teb1.b(this.a, false);
    }

    @Override // defpackage.i28
    public final void h(float f, float f2, float f3, float f4, ka90 ka90Var) {
        this.a.drawOval(f, f2, f3, f4, vez0.B(ka90Var));
    }

    @Override // defpackage.i28
    public final void i(float f, float f2, float f3, float f4, ka90 ka90Var) {
        this.a.drawRect(f, f2, f3, f4, vez0.B(ka90Var));
    }

    @Override // defpackage.i28
    public final void j(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.i28
    public final void k(rq90 rq90Var) {
        Canvas canvas = this.a;
        if (rq90Var instanceof jb2) {
            canvas.clipPath(((jb2) rq90Var).k(), hnb1.a(1) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
        } else {
            w511.x("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.i28
    public final void l(float f, float f2, float f3, float f4, float f5, float f6, boolean z, ka90 ka90Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, z, vez0.B(ka90Var));
    }

    @Override // defpackage.i28
    public final void m(l8v l8vVar, ka90 ka90Var) {
        this.a.drawBitmap(hua1.a(l8vVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), vez0.B(ka90Var));
    }

    @Override // defpackage.i28
    public final void n() {
        this.a.restore();
    }

    @Override // defpackage.i28
    public final void o() {
        teb1.b(this.a, true);
    }

    @Override // defpackage.i28
    public final void p(rq90 rq90Var, ka90 ka90Var) {
        Canvas canvas = this.a;
        if (rq90Var instanceof jb2) {
            canvas.drawPath(((jb2) rq90Var).k(), vez0.B(ka90Var));
        } else {
            w511.x("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.i28
    public final void q(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.i28
    public final void r(float[] fArr) {
        if (ooc.s(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        gtq0.M(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.i28
    public final void s(zii0 zii0Var, ka90 ka90Var) {
        this.a.saveLayer(zii0Var.a, zii0Var.b, zii0Var.c, zii0Var.d, vez0.B(ka90Var), 31);
    }

    @Override // defpackage.i28
    public final void save() {
        this.a.save();
    }

    @Override // defpackage.i28
    public final void t(float f, long j, ka90 ka90Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), f, vez0.B(ka90Var));
    }
}
