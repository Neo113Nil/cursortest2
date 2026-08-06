package defpackage;

/* loaded from: classes.dex */
public class np0 {
    public final defpackage.xl0 IHQe1A4L2xu = new defpackage.xl0(new defpackage.bp0[16]);
    public final defpackage.gl0 oh6vYeIP = new defpackage.gl0(10);

    public boolean IHQe1A4L2xu(defpackage.vf0 vf0Var, defpackage.v90 v90Var, defpackage.F7NU4MC0GW f7nu4mc0gw, boolean z) {
        defpackage.xl0 xl0Var = this.IHQe1A4L2xu;
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((defpackage.bp0) objArr[i2]).IHQe1A4L2xu(vf0Var, v90Var, f7nu4mc0gw, z) || z2;
        }
        return z2;
    }

    public void oh6vYeIP(defpackage.F7NU4MC0GW f7nu4mc0gw) {
        defpackage.xl0 xl0Var = this.IHQe1A4L2xu;
        int i = xl0Var.AARZUJiTa;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((defpackage.bp0) xl0Var.adDC3e2L[i]).F7NU4MC0GW.IHQe1A4L2xu == 0) {
                xl0Var.ez2rX8ReCYw(i);
            }
        }
    }
}
