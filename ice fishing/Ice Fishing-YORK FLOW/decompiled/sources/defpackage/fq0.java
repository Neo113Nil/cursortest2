package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fq0 implements defpackage.e20 {
    public final /* synthetic */ defpackage.fo0 P05cfTpS5W5L;
    public final /* synthetic */ defpackage.i71 QiMR8OkAhezm;
    public final /* synthetic */ defpackage.ja1 WDYagTQQm9ns;
    public final /* synthetic */ defpackage.dg1 e6mdH7fiFuta;
    public final /* synthetic */ defpackage.xo0 oh71FJcDz6S2;

    public fq0(defpackage.ja1 ja1Var, defpackage.xo0 xo0Var, defpackage.j71 j71Var, defpackage.fo0 fo0Var, defpackage.dg1 dg1Var) {
        this.WDYagTQQm9ns = ja1Var;
        this.oh71FJcDz6S2 = xo0Var;
        this.QiMR8OkAhezm = j71Var;
        this.P05cfTpS5W5L = fo0Var;
        this.e6mdH7fiFuta = dg1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // defpackage.e20
    public final java.lang.Object h3m55N1URyyK(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.xo0 xo0Var;
        defpackage.k5 k5Var = (defpackage.k5) obj;
        defpackage.xo0 xo0Var2 = (defpackage.xo0) obj2;
        defpackage.e30 e30Var = (defpackage.e30) obj3;
        ((java.lang.Number) obj4).intValue();
        boolean QiMR8OkAhezm = defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns.fWTAfUmVKrZq.getValue(), this.oh71FJcDz6S2);
        if (!((java.lang.Boolean) this.P05cfTpS5W5L.getValue()).booleanValue() && !QiMR8OkAhezm) {
            java.util.List list = (java.util.List) this.e6mdH7fiFuta.getValue();
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    xo0Var = 0;
                    break;
                }
                xo0Var = listIterator.previous();
                if (defpackage.ma0.QiMR8OkAhezm(xo0Var2, (defpackage.xo0) xo0Var)) {
                    break;
                }
            }
            xo0Var2 = xo0Var;
        }
        if (xo0Var2 == null) {
            e30Var.NkfcFfdaVTox(105930796);
        } else {
            e30Var.NkfcFfdaVTox(-1520603531);
            defpackage.n70.giKS3J6vZuNy(xo0Var2, this.QiMR8OkAhezm, defpackage.nn.OcTWLQzke1i2(-1263531443, new defpackage.bq(xo0Var2, k5Var), e30Var), e30Var, 384);
        }
        e30Var.XntWc4eZSQ8j(false);
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
