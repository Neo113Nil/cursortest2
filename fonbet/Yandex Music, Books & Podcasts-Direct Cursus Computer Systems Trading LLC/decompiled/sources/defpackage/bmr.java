package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class bmr extends lt2 {
    public final ds2 q;
    public final String r;
    public final boolean s;
    public final s85 t;
    public rwt u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bmr(czg czgVar, ds2 ds2Var, avp avpVar) {
        super(czgVar, ds2Var, r5, r0 != 0 ? r0 != 1 ? r0 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, avpVar.i, avpVar.e, avpVar.f, avpVar.c, avpVar.b);
        int D = ouj.D(avpVar.g);
        Paint.Cap cap = D != 0 ? D != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int D2 = ouj.D(avpVar.h);
        this.q = ds2Var;
        this.r = avpVar.a;
        this.s = avpVar.j;
        cs2 a = avpVar.d.a();
        this.t = (s85) a;
        a.a(this);
        ds2Var.e(a);
    }

    @Override // defpackage.lt2, defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        super.f(szgVar, obj);
        PointF pointF = lzg.a;
        s85 s85Var = this.t;
        if (obj == 2) {
            s85Var.j(szgVar);
            return;
        }
        if (obj == lzg.I) {
            rwt rwtVar = this.u;
            ds2 ds2Var = this.q;
            if (rwtVar != null) {
                ds2Var.n(rwtVar);
            }
            if (szgVar == null) {
                this.u = null;
                return;
            }
            rwt rwtVar2 = new rwt(szgVar, null);
            this.u = rwtVar2;
            rwtVar2.a(this);
            ds2Var.e(s85Var);
        }
    }

    @Override // defpackage.lt2, defpackage.fqa
    public final void g(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        if (this.s) {
            return;
        }
        s85 s85Var = this.t;
        int l = s85Var.l(s85Var.c.e(), s85Var.c());
        pif pifVar = this.i;
        pifVar.setColor(l);
        rwt rwtVar = this.u;
        if (rwtVar != null) {
            pifVar.setColorFilter((ColorFilter) rwtVar.e());
        }
        super.g(canvas, matrix, i, qraVar);
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.r;
    }
}
