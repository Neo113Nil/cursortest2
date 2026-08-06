package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gn extends he0 implements va1, l50 {
    public long Y6hRI1cF8;
    public gn jivtDDk9H;
    public gn mE4lRynR;

    @Override // defpackage.va1
    public final Object E7jCp8Ls() {
        return b9xEq24R1.k8h8IjolWQ;
    }

    public final void Hc2GqxcqBiX(j6IIN2O8eOU j6iin2o8eou) {
        va1 va1Var;
        gn gnVar;
        gn gnVar2 = this.mE4lRynR;
        int i = 1;
        if (gnVar2 == null || !vc0.rQPn8YBR(gnVar2, rj0.WRKkgoJXwDn(j6iin2o8eou))) {
            if (this.OOA6hdeuvCS.Mjvvu5DE) {
                rt0 rt0Var = new rt0();
                w60.M3K9sHhK(this, new n2(rt0Var, this, j6iin2o8eou, i));
                va1Var = (va1) rt0Var.OOA6hdeuvCS;
            } else {
                va1Var = null;
            }
            gnVar = (gn) va1Var;
        } else {
            gnVar = gnVar2;
        }
        if (gnVar != null && gnVar2 == null) {
            gnVar.sb9fmtV8A();
            gnVar.Hc2GqxcqBiX(j6iin2o8eou);
            gn gnVar3 = this.jivtDDk9H;
            if (gnVar3 != null) {
                gnVar3.XmVeRDAr();
            }
        } else if (gnVar == null && gnVar2 != null) {
            gn gnVar4 = this.jivtDDk9H;
            if (gnVar4 != null) {
                gnVar4.sb9fmtV8A();
                gnVar4.Hc2GqxcqBiX(j6iin2o8eou);
            }
            gnVar2.XmVeRDAr();
        } else if (!o30.rQPn8YBR(gnVar, gnVar2)) {
            if (gnVar != null) {
                gnVar.sb9fmtV8A();
                gnVar.Hc2GqxcqBiX(j6iin2o8eou);
            }
            if (gnVar2 != null) {
                gnVar2.XmVeRDAr();
            }
        } else if (gnVar != null) {
            gnVar.Hc2GqxcqBiX(j6iin2o8eou);
        } else {
            gn gnVar5 = this.jivtDDk9H;
            if (gnVar5 != null) {
                gnVar5.Hc2GqxcqBiX(j6iin2o8eou);
            }
        }
        this.mE4lRynR = gnVar;
    }

    public final void OGdJP42E() {
        gn gnVar = this.jivtDDk9H;
        if (gnVar != null) {
            gnVar.OGdJP42E();
            return;
        }
        gn gnVar2 = this.mE4lRynR;
        if (gnVar2 != null) {
            gnVar2.OGdJP42E();
        }
    }

    @Override // defpackage.l50, defpackage.ed0
    public final void X1lG3V04pd(long j) {
        this.Y6hRI1cF8 = j;
    }

    public final void XmVeRDAr() {
        gn gnVar = this.jivtDDk9H;
        if (gnVar != null) {
            gnVar.XmVeRDAr();
        }
        gn gnVar2 = this.mE4lRynR;
        if (gnVar2 != null) {
            gnVar2.XmVeRDAr();
        }
        this.mE4lRynR = null;
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
        this.jivtDDk9H = null;
        this.mE4lRynR = null;
    }

    public final boolean gqMuANyCes() {
        gn gnVar = this.mE4lRynR;
        if (gnVar != null) {
            return gnVar.gqMuANyCes();
        }
        gn gnVar2 = this.jivtDDk9H;
        if (gnVar2 != null) {
            return gnVar2.gqMuANyCes();
        }
        return false;
    }

    public final void sb9fmtV8A() {
        gn gnVar = this.jivtDDk9H;
        if (gnVar != null) {
            gnVar.sb9fmtV8A();
            return;
        }
        gn gnVar2 = this.mE4lRynR;
        if (gnVar2 != null) {
            gnVar2.sb9fmtV8A();
        }
    }
}
