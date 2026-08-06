package defpackage;

/* loaded from: classes.dex */
public final class bj0 implements defpackage.c51 {
    public final defpackage.QQUzIjv3iOC5 IHQe1A4L2xu;
    public final defpackage.qk1 oh6vYeIP;
    public final defpackage.vu r1MBDhnF;

    public bj0(defpackage.qk1 qk1Var, defpackage.vu vuVar, defpackage.QQUzIjv3iOC5 qQUzIjv3iOC5) {
        this.oh6vYeIP = qk1Var;
        vuVar.getClass();
        this.r1MBDhnF = vuVar;
        this.IHQe1A4L2xu = qQUzIjv3iOC5;
    }

    @Override // defpackage.c51
    public final boolean AARZUJiTa(defpackage.e20 e20Var, defpackage.e20 e20Var2) {
        this.oh6vYeIP.getClass();
        return e20Var.unknownFields.equals(e20Var2.unknownFields);
    }

    @Override // defpackage.c51
    public final void EXtogiMhuM(java.lang.Object obj, defpackage.pd pdVar, defpackage.uu uuVar) {
        this.oh6vYeIP.getClass();
        defpackage.qk1.IHQe1A4L2xu(obj);
        this.r1MBDhnF.getClass();
        obj.getClass();
        throw new java.lang.ClassCastException();
    }

    @Override // defpackage.c51
    public final int F7NU4MC0GW(defpackage.e20 e20Var) {
        this.oh6vYeIP.getClass();
        defpackage.pk1 pk1Var = e20Var.unknownFields;
        int i = pk1Var.F7NU4MC0GW;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < pk1Var.IHQe1A4L2xu; i3++) {
            int i4 = pk1Var.oh6vYeIP[i3] >>> 3;
            i2 += defpackage.rd.xiZrDbcSW0(3, (defpackage.ra) pk1Var.r1MBDhnF[i3]) + defpackage.rd.riuEU0zW4(i4) + defpackage.rd.EXtogiMhuM(2) + (defpackage.rd.EXtogiMhuM(1) * 2);
        }
        pk1Var.F7NU4MC0GW = i2;
        return i2;
    }

    @Override // defpackage.c51
    public final int IHQe1A4L2xu(defpackage.e20 e20Var) {
        this.oh6vYeIP.getClass();
        return e20Var.unknownFields.hashCode();
    }

    @Override // defpackage.c51
    public final boolean adDC3e2L(java.lang.Object obj) {
        this.r1MBDhnF.getClass();
        defpackage.fx0.kd6TUFXn(obj);
        throw null;
    }

    @Override // defpackage.c51
    public final void oh6vYeIP(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.d51.ez2rX8ReCYw(this.oh6vYeIP, obj, obj2);
    }

    @Override // defpackage.c51
    public final void r1MBDhnF(java.lang.Object obj) {
        this.oh6vYeIP.getClass();
        defpackage.pk1 pk1Var = ((defpackage.e20) obj).unknownFields;
        if (pk1Var.adDC3e2L) {
            pk1Var.adDC3e2L = false;
        }
        this.r1MBDhnF.getClass();
        defpackage.fx0.kd6TUFXn(obj);
        throw null;
    }

    @Override // defpackage.c51
    public final defpackage.e20 riuEU0zW4() {
        defpackage.QQUzIjv3iOC5 qQUzIjv3iOC5 = this.IHQe1A4L2xu;
        return qQUzIjv3iOC5 instanceof defpackage.e20 ? ((defpackage.e20) qQUzIjv3iOC5).riuEU0zW4() : ((defpackage.c20) ((defpackage.e20) qQUzIjv3iOC5).r1MBDhnF(5)).oh6vYeIP();
    }

    @Override // defpackage.c51
    public final void xiZrDbcSW0(java.lang.Object obj, defpackage.c1NqjJifC7 c1nqjjifc7) {
        this.r1MBDhnF.getClass();
        defpackage.fx0.kd6TUFXn(obj);
        throw null;
    }
}
