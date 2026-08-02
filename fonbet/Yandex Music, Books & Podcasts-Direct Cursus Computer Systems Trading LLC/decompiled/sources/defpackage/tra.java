package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class tra implements yr2 {
    public final ds2 a;
    public final ds2 b;
    public final s85 c;
    public final yic d;
    public final yic e;
    public final yic f;
    public final yic g;
    public Matrix h;

    public tra(ds2 ds2Var, ds2 ds2Var2, gs4 gs4Var) {
        this.b = ds2Var;
        this.a = ds2Var2;
        cs2 a = ((gk0) gs4Var.a).a();
        this.c = (s85) a;
        a.a(this);
        ds2Var2.e(a);
        yic a2 = ((hk0) gs4Var.b).a();
        this.d = a2;
        a2.a(this);
        ds2Var2.e(a2);
        yic a3 = ((hk0) gs4Var.c).a();
        this.e = a3;
        a3.a(this);
        ds2Var2.e(a3);
        yic a4 = ((hk0) gs4Var.d).a();
        this.f = a4;
        a4.a(this);
        ds2Var2.e(a4);
        yic a5 = ((hk0) gs4Var.e).a();
        this.g = a5;
        a5.a(this);
        ds2Var2.e(a5);
    }

    @Override // defpackage.yr2
    public final void a() {
        this.b.a();
    }

    public final qra b(Matrix matrix, int i) {
        float l = this.e.l() * 0.017453292f;
        float floatValue = ((Float) this.f.e()).floatValue();
        double d = l;
        float sin = ((float) Math.sin(d)) * floatValue;
        float cos = ((float) Math.cos(d + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.g.e()).floatValue();
        int intValue = ((Integer) this.c.e()).intValue();
        int argb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        qra qraVar = new qra();
        qraVar.a = floatValue2 * 0.33f;
        qraVar.b = sin;
        qraVar.c = cos;
        qraVar.d = argb;
        qraVar.e = null;
        qraVar.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.e().invert(this.h);
        qraVar.c(this.h);
        return qraVar;
    }

    public final void c(szg szgVar) {
        yic yicVar = this.d;
        if (szgVar == null) {
            yicVar.j(null);
        } else {
            yicVar.j(new sra(0, szgVar));
        }
    }
}
