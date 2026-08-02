package defpackage;

/* loaded from: classes5.dex */
public final class nen extends k0 {
    public w0 a;

    @Override // defpackage.d0
    public final s0 n() {
        return this.a;
    }

    public final vu1 t() {
        d0[] d0VarArr = this.a.a;
        if (d0VarArr.length == 0) {
            return null;
        }
        return vu1.t(d0VarArr[0]);
    }

    public final vu1[] u() {
        w0 w0Var = this.a;
        int length = w0Var.a.length;
        vu1[] vu1VarArr = new vu1[length];
        for (int i = 0; i != length; i++) {
            vu1VarArr[i] = vu1.t(w0Var.a[i]);
        }
        return vu1VarArr;
    }
}
