package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r1 extends TextPaint {
    public ml AvO7iQsrTN;
    public qj EljAMC1QTz;
    public a1 GWasM1elztuh;
    public yb OOA6hdeuvCS;
    public int X1lG3V04pd;
    public a81 Yi7zF1RB1;
    public t21 encWxUiV2;
    public qj mOu10nynGul;
    public x11 xqGvceK5x;

    public final void AvO7iQsrTN(a81 a81Var) {
        if (a81Var == null || o30.rQPn8YBR(this.Yi7zF1RB1, a81Var)) {
            return;
        }
        this.Yi7zF1RB1 = a81Var;
        int i = a81Var.GWasM1elztuh;
        setUnderlineText((i | 1) == i);
        int i2 = this.Yi7zF1RB1.GWasM1elztuh;
        setStrikeThruText((i2 | 2) == i2);
    }

    public final void EljAMC1QTz(x11 x11Var) {
        if (x11Var == null || o30.rQPn8YBR(this.xqGvceK5x, x11Var)) {
            return;
        }
        this.xqGvceK5x = x11Var;
        if (x11Var.equals(x11.xqGvceK5x)) {
            clearShadowLayer();
            return;
        }
        x11 x11Var2 = this.xqGvceK5x;
        float f = x11Var2.X1lG3V04pd;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (x11Var2.Yi7zF1RB1 >> 32)), Float.intBitsToFloat((int) (this.xqGvceK5x.Yi7zF1RB1 & 4294967295L)), ki1.HFYAaqMd6(this.xqGvceK5x.GWasM1elztuh));
    }

    public final a1 GWasM1elztuh() {
        a1 a1Var = this.GWasM1elztuh;
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1(this);
        this.GWasM1elztuh = a1Var2;
        return a1Var2;
    }

    public final void OOA6hdeuvCS(qj qjVar) {
        if (qjVar == null || o30.rQPn8YBR(this.mOu10nynGul, qjVar)) {
            return;
        }
        this.mOu10nynGul = qjVar;
        if (qjVar.equals(sr.Mjvvu5DE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(qjVar instanceof j61)) {
            o4.xqGvceK5x();
            return;
        }
        GWasM1elztuh().E7jCp8Ls(1);
        j61 j61Var = (j61) qjVar;
        GWasM1elztuh().rQPn8YBR(j61Var.Mjvvu5DE);
        a1 GWasM1elztuh = GWasM1elztuh();
        ((Paint) GWasM1elztuh.Yi7zF1RB1).setStrokeMiter(j61Var.mE4lRynR);
        GWasM1elztuh().JFJ3QoxA(j61Var.Y6hRI1cF8);
        GWasM1elztuh().mOu10nynGul(j61Var.jivtDDk9H);
        ((Paint) GWasM1elztuh().Yi7zF1RB1).setPathEffect(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r1 == null ? false : defpackage.t21.GWasM1elztuh(r1.GWasM1elztuh, r5)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1lG3V04pd(final qj qjVar, final long j, float f) {
        if (qjVar == null) {
            this.AvO7iQsrTN = null;
            this.EljAMC1QTz = null;
            this.encWxUiV2 = null;
            setShader(null);
            return;
        }
        if (qjVar instanceof t41) {
            xqGvceK5x(w60.jivtDDk9H(f, ((t41) qjVar).Mjvvu5DE));
            return;
        }
        if (!(qjVar instanceof v11)) {
            o4.xqGvceK5x();
            return;
        }
        if (o30.rQPn8YBR(this.EljAMC1QTz, qjVar)) {
            t21 t21Var = this.encWxUiV2;
        }
        if (j != 9205357640488583168L) {
            this.EljAMC1QTz = qjVar;
            this.encWxUiV2 = new t21(j);
            this.AvO7iQsrTN = z50.iwATDS1i01k(new wu() { // from class: q1
                @Override // defpackage.wu
                public final Object GWasM1elztuh() {
                    return ((v11) qj.this).MjxSquD6Av(j);
                }
            });
        }
        a1 GWasM1elztuh = GWasM1elztuh();
        ml mlVar = this.AvO7iQsrTN;
        GWasM1elztuh.encWxUiV2(mlVar != null ? (Shader) mlVar.getValue() : null);
        this.OOA6hdeuvCS = null;
        vc0.HFYAaqMd6(this, f);
    }

    public final void Yi7zF1RB1(int i) {
        if (i == this.X1lG3V04pd) {
            return;
        }
        GWasM1elztuh().xqGvceK5x(i);
        this.X1lG3V04pd = i;
    }

    public final void xqGvceK5x(long j) {
        yb ybVar = this.OOA6hdeuvCS;
        if ((ybVar == null ? false : yb.X1lG3V04pd(ybVar.GWasM1elztuh, j)) || j == 16) {
            return;
        }
        this.OOA6hdeuvCS = new yb(j);
        setColor(ki1.HFYAaqMd6(j));
        this.AvO7iQsrTN = null;
        this.EljAMC1QTz = null;
        this.encWxUiV2 = null;
        setShader(null);
    }
}
