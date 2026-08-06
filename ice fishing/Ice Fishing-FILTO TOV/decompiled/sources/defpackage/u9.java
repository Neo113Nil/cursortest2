package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u9 implements ho {
    public a1 AvO7iQsrTN;
    public final f4 EljAMC1QTz;
    public final t9 OOA6hdeuvCS;
    public a1 encWxUiV2;

    public u9() {
        hl hlVar = rj0.EljAMC1QTz;
        t9 t9Var = new t9();
        t9Var.GWasM1elztuh = hlVar;
        t9Var.Yi7zF1RB1 = p50.OOA6hdeuvCS;
        t9Var.X1lG3V04pd = up.GWasM1elztuh;
        t9Var.xqGvceK5x = 0L;
        this.OOA6hdeuvCS = t9Var;
        this.EljAMC1QTz = new f4(this);
    }

    public static a1 GWasM1elztuh(u9 u9Var, long j, qj qjVar, float f, int i) {
        a1 OOA6hdeuvCS = u9Var.OOA6hdeuvCS(qjVar);
        Paint paint = (Paint) OOA6hdeuvCS.Yi7zF1RB1;
        if (f != 1.0f) {
            j = yb.Yi7zF1RB1(yb.xqGvceK5x(j) * f, j);
        }
        if (!yb.X1lG3V04pd(ki1.X1lG3V04pd(paint.getColor()), j)) {
            OOA6hdeuvCS.OOA6hdeuvCS(j);
        }
        if (((Shader) OOA6hdeuvCS.X1lG3V04pd) != null) {
            OOA6hdeuvCS.encWxUiV2(null);
        }
        if (!o30.rQPn8YBR((s6) OOA6hdeuvCS.xqGvceK5x, null)) {
            OOA6hdeuvCS.EljAMC1QTz(null);
        }
        if (OOA6hdeuvCS.GWasM1elztuh != i) {
            OOA6hdeuvCS.xqGvceK5x(i);
        }
        if (paint.isFilterBitmap()) {
            return OOA6hdeuvCS;
        }
        OOA6hdeuvCS.AvO7iQsrTN();
        return OOA6hdeuvCS;
    }

    @Override // defpackage.ho
    public final void A1EKNP6CxJ(long j, float f, long j2, float f2, qj qjVar) {
        this.OOA6hdeuvCS.X1lG3V04pd.xqGvceK5x(f, j2, GWasM1elztuh(this, j, qjVar, f2, 3));
    }

    @Override // defpackage.ho
    public final void MZhzXH72(ma0 ma0Var, long j, long j2, float f) {
        s9 s9Var = this.OOA6hdeuvCS.X1lG3V04pd;
        a1 a1Var = this.encWxUiV2;
        if (a1Var == null) {
            a1Var = qj.xqGvceK5x();
            a1Var.E7jCp8Ls(1);
            this.encWxUiV2 = a1Var;
        }
        Paint paint = (Paint) a1Var.Yi7zF1RB1;
        ma0Var.mOu10nynGul(1.0f, xqGvceK5x(), a1Var);
        if (!o30.rQPn8YBR((s6) a1Var.xqGvceK5x, null)) {
            a1Var.EljAMC1QTz(null);
        }
        if (a1Var.GWasM1elztuh != 3) {
            a1Var.xqGvceK5x(3);
        }
        if (paint.getStrokeWidth() != f) {
            a1Var.rQPn8YBR(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (a1Var.GWasM1elztuh() != 1) {
            a1Var.mOu10nynGul(1);
        }
        if (a1Var.Yi7zF1RB1() != 0) {
            a1Var.JFJ3QoxA(0);
        }
        if (!paint.isFilterBitmap()) {
            a1Var.AvO7iQsrTN();
        }
        s9Var.XnEVoBF0td1l(j, j2, a1Var);
    }

    public final a1 OOA6hdeuvCS(qj qjVar) {
        if (o30.rQPn8YBR(qjVar, sr.Mjvvu5DE)) {
            a1 a1Var = this.AvO7iQsrTN;
            if (a1Var != null) {
                return a1Var;
            }
            a1 xqGvceK5x = qj.xqGvceK5x();
            xqGvceK5x.E7jCp8Ls(0);
            this.AvO7iQsrTN = xqGvceK5x;
            return xqGvceK5x;
        }
        if (!(qjVar instanceof j61)) {
            o4.xqGvceK5x();
            return null;
        }
        a1 a1Var2 = this.encWxUiV2;
        if (a1Var2 == null) {
            a1Var2 = qj.xqGvceK5x();
            a1Var2.E7jCp8Ls(1);
            this.encWxUiV2 = a1Var2;
        }
        Paint paint = (Paint) a1Var2.Yi7zF1RB1;
        float strokeWidth = paint.getStrokeWidth();
        j61 j61Var = (j61) qjVar;
        float f = j61Var.Mjvvu5DE;
        if (strokeWidth != f) {
            a1Var2.rQPn8YBR(f);
        }
        int GWasM1elztuh = a1Var2.GWasM1elztuh();
        int i = j61Var.jivtDDk9H;
        if (GWasM1elztuh != i) {
            a1Var2.mOu10nynGul(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = j61Var.mE4lRynR;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int Yi7zF1RB1 = a1Var2.Yi7zF1RB1();
        int i2 = j61Var.Y6hRI1cF8;
        if (Yi7zF1RB1 == i2) {
            return a1Var2;
        }
        a1Var2.JFJ3QoxA(i2);
        return a1Var2;
    }

    @Override // defpackage.ho
    public final void SyyZR548qbcW(h1 h1Var, qj qjVar, float f, qj qjVar2, int i) {
        this.OOA6hdeuvCS.X1lG3V04pd.encWxUiV2(h1Var, X1lG3V04pd(qjVar, qjVar2, f, null, i));
    }

    @Override // defpackage.ho
    public final void TpUsjqg3bxO(w0 w0Var, long j, long j2, float f, s6 s6Var) {
        this.OOA6hdeuvCS.X1lG3V04pd.OOA6hdeuvCS(w0Var, j, j2, X1lG3V04pd(null, sr.Mjvvu5DE, f, s6Var, 3));
    }

    @Override // defpackage.ho
    public final void WdrkLMV3xh(ss0 ss0Var, float f, long j) {
        this.OOA6hdeuvCS.X1lG3V04pd.xqGvceK5x(f, j, X1lG3V04pd(ss0Var, sr.Mjvvu5DE, 1.0f, null, 3));
    }

    public final a1 X1lG3V04pd(qj qjVar, qj qjVar2, float f, s6 s6Var, int i) {
        a1 OOA6hdeuvCS = OOA6hdeuvCS(qjVar2);
        Paint paint = (Paint) OOA6hdeuvCS.Yi7zF1RB1;
        if (qjVar != null) {
            qjVar.mOu10nynGul(f, xqGvceK5x(), OOA6hdeuvCS);
        } else {
            if (((Shader) OOA6hdeuvCS.X1lG3V04pd) != null) {
                OOA6hdeuvCS.encWxUiV2(null);
            }
            long X1lG3V04pd = ki1.X1lG3V04pd(paint.getColor());
            long j = yb.Yi7zF1RB1;
            if (!yb.X1lG3V04pd(X1lG3V04pd, j)) {
                OOA6hdeuvCS.OOA6hdeuvCS(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                OOA6hdeuvCS.X1lG3V04pd(f);
            }
        }
        if (!o30.rQPn8YBR((s6) OOA6hdeuvCS.xqGvceK5x, s6Var)) {
            OOA6hdeuvCS.EljAMC1QTz(s6Var);
        }
        if (OOA6hdeuvCS.GWasM1elztuh != i) {
            OOA6hdeuvCS.xqGvceK5x(i);
        }
        if (paint.isFilterBitmap()) {
            return OOA6hdeuvCS;
        }
        OOA6hdeuvCS.AvO7iQsrTN();
        return OOA6hdeuvCS;
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.OOA6hdeuvCS.GWasM1elztuh.Yi7zF1RB1();
    }

    @Override // defpackage.ho
    public final void ZB4nixHlTE(long j, long j2, long j3, qj qjVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.OOA6hdeuvCS.X1lG3V04pd.iwATDS1i01k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), GWasM1elztuh(this, j, qjVar, 1.0f, i));
    }

    @Override // defpackage.ho
    public final f4 arNh8D4Z5gB() {
        return this.EljAMC1QTz;
    }

    @Override // defpackage.ho
    public final void c4eaifQP(long j, long j2, long j3, float f) {
        s9 s9Var = this.OOA6hdeuvCS.X1lG3V04pd;
        a1 a1Var = this.encWxUiV2;
        if (a1Var == null) {
            a1Var = qj.xqGvceK5x();
            a1Var.E7jCp8Ls(1);
            this.encWxUiV2 = a1Var;
        }
        Paint paint = (Paint) a1Var.Yi7zF1RB1;
        if (!yb.X1lG3V04pd(ki1.X1lG3V04pd(paint.getColor()), j)) {
            a1Var.OOA6hdeuvCS(j);
        }
        if (((Shader) a1Var.X1lG3V04pd) != null) {
            a1Var.encWxUiV2(null);
        }
        if (!o30.rQPn8YBR((s6) a1Var.xqGvceK5x, null)) {
            a1Var.EljAMC1QTz(null);
        }
        if (a1Var.GWasM1elztuh != 3) {
            a1Var.xqGvceK5x(3);
        }
        if (paint.getStrokeWidth() != f) {
            a1Var.rQPn8YBR(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (a1Var.GWasM1elztuh() != 1) {
            a1Var.mOu10nynGul(1);
        }
        if (a1Var.Yi7zF1RB1() != 0) {
            a1Var.JFJ3QoxA(0);
        }
        if (!paint.isFilterBitmap()) {
            a1Var.AvO7iQsrTN();
        }
        s9Var.XnEVoBF0td1l(j2, j3, a1Var);
    }

    @Override // defpackage.ho
    public final void cilMamHF(qj qjVar, long j, long j2, float f, qj qjVar2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.OOA6hdeuvCS.X1lG3V04pd.iwATDS1i01k(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), X1lG3V04pd(qjVar, qjVar2, f, null, 3));
    }

    @Override // defpackage.ho
    public final p50 getLayoutDirection() {
        return this.OOA6hdeuvCS.Yi7zF1RB1;
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.OOA6hdeuvCS.GWasM1elztuh.mOu10nynGul();
    }

    @Override // defpackage.ho
    public final void pog2g9KITJA(long j, long j2, long j3, long j4, qj qjVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.OOA6hdeuvCS.X1lG3V04pd.rQPn8YBR(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), GWasM1elztuh(this, j, qjVar, 1.0f, 3));
    }

    @Override // defpackage.ho
    public final void qugwajBSa59j(ma0 ma0Var, long j, long j2) {
        sr srVar = sr.Mjvvu5DE;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.OOA6hdeuvCS.X1lG3V04pd.mOu10nynGul(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), X1lG3V04pd(ma0Var, srVar, 1.0f, null, 3));
    }

    @Override // defpackage.ho
    public final void uFEq9NpZ(long j, float f, long j2, long j3, qj qjVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.OOA6hdeuvCS.X1lG3V04pd.GWasM1elztuh(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, GWasM1elztuh(this, j, qjVar, 1.0f, 3));
    }
}
