package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class hod extends lt2 {
    public rwt A;
    public final String q;
    public final boolean r;
    public final ovg s;
    public final ovg t;
    public final RectF u;
    public final int v;
    public final int w;
    public final bod x;
    public final bod y;
    public final bod z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hod(czg czgVar, ds2 ds2Var, god godVar) {
        super(czgVar, ds2Var, r3, r4, godVar.j, godVar.d, godVar.g, godVar.k, godVar.l);
        Paint.Join join;
        Paint.Join join2;
        int D = ouj.D(godVar.h);
        Paint.Cap cap = D != 0 ? D != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int D2 = ouj.D(godVar.i);
        if (D2 == 0) {
            join = Paint.Join.MITER;
        } else if (D2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (D2 != 2) {
                join2 = null;
                this.s = new ovg((Object) null);
                this.t = new ovg((Object) null);
                this.u = new RectF();
                this.q = godVar.a;
                this.v = godVar.b;
                this.r = godVar.m;
                this.w = (int) (czgVar.a.b() / 32.0f);
                cs2 a = godVar.c.a();
                this.x = (bod) a;
                a.a(this);
                ds2Var.e(a);
                cs2 a2 = godVar.e.a();
                this.y = (bod) a2;
                a2.a(this);
                ds2Var.e(a2);
                cs2 a3 = godVar.f.a();
                this.z = (bod) a3;
                a3.a(this);
                ds2Var.e(a3);
            }
            join = Paint.Join.BEVEL;
        }
        join2 = join;
        this.s = new ovg((Object) null);
        this.t = new ovg((Object) null);
        this.u = new RectF();
        this.q = godVar.a;
        this.v = godVar.b;
        this.r = godVar.m;
        this.w = (int) (czgVar.a.b() / 32.0f);
        cs2 a4 = godVar.c.a();
        this.x = (bod) a4;
        a4.a(this);
        ds2Var.e(a4);
        cs2 a22 = godVar.e.a();
        this.y = (bod) a22;
        a22.a(this);
        ds2Var.e(a22);
        cs2 a32 = godVar.f.a();
        this.z = (bod) a32;
        a32.a(this);
        ds2Var.e(a32);
    }

    public final int[] e(int[] iArr) {
        rwt rwtVar = this.A;
        if (rwtVar != null) {
            Integer[] numArr = (Integer[]) rwtVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.lt2, defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        super.f(szgVar, obj);
        if (obj == lzg.J) {
            rwt rwtVar = this.A;
            ds2 ds2Var = this.f;
            if (rwtVar != null) {
                ds2Var.n(rwtVar);
            }
            if (szgVar == null) {
                this.A = null;
                return;
            }
            rwt rwtVar2 = new rwt(szgVar, null);
            this.A = rwtVar2;
            rwtVar2.a(this);
            ds2Var.e(this.A);
        }
    }

    @Override // defpackage.lt2, defpackage.fqa
    public final void g(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        Shader shader;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        d(this.u, matrix, false);
        int i2 = this.v;
        bod bodVar = this.x;
        bod bodVar2 = this.z;
        bod bodVar3 = this.y;
        if (i2 == 1) {
            long h = h();
            ovg ovgVar = this.s;
            shader = (LinearGradient) ovgVar.c(h);
            if (shader == null) {
                PointF pointF = (PointF) bodVar3.e();
                PointF pointF2 = (PointF) bodVar2.e();
                aod aodVar = (aod) bodVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(aodVar.b), aodVar.a, Shader.TileMode.CLAMP);
                ovgVar.f(h, radialGradient);
                shader = radialGradient;
            }
            this.i.setShader(shader);
            super.g(canvas, matrix, i, qraVar);
        }
        long h2 = h();
        ovg ovgVar2 = this.t;
        shader = (RadialGradient) ovgVar2.c(h2);
        if (shader == null) {
            PointF pointF3 = (PointF) bodVar3.e();
            PointF pointF4 = (PointF) bodVar2.e();
            aod aodVar2 = (aod) bodVar.e();
            int[] e = e(aodVar2.b);
            float[] fArr = aodVar2.a;
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), e, fArr, Shader.TileMode.CLAMP);
            ovgVar2.f(h2, radialGradient);
            shader = radialGradient;
        }
        this.i.setShader(shader);
        super.g(canvas, matrix, i, qraVar);
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.q;
    }

    public final int h() {
        float f = this.y.d;
        float f2 = this.w;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.z.d * f2);
        int round3 = Math.round(this.x.d * f2);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
