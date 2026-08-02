package defpackage;

/* loaded from: classes6.dex */
public final class wj0 implements mi3 {
    public static final vj0[] b = {new vj0(0.2d, 7.0d), new vj0(3.0d, 11.0d), new vj0(10.0d, 25.0d)};
    public final vj0[] a = b;

    @Override // defpackage.mi3
    public final Double a(ozw ozwVar) {
        vj0 vj0Var;
        Double d = (Double) ozwVar.b;
        if (d != null) {
            double doubleValue = d.doubleValue();
            vj0[] vj0VarArr = this.a;
            int length = vj0VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    vj0Var = null;
                    break;
                }
                vj0Var = vj0VarArr[i];
                if (doubleValue <= vj0Var.a) {
                    break;
                }
                i++;
            }
            if (vj0Var != null) {
                return Double.valueOf(vj0Var.b);
            }
        }
        return null;
    }
}
