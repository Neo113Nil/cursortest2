package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class m extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ defpackage.z31 QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, defpackage.z31 z31Var) {
        super(1);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = z31Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        boolean z;
        int i = this.oh71FJcDz6S2;
        defpackage.z31 z31Var = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                z31Var.WDYagTQQm9ns = (defpackage.nz) obj;
                return java.lang.Boolean.TRUE;
            case 1:
                defpackage.s50 s50Var = (defpackage.s50) obj;
                java.lang.Object obj2 = z31Var.WDYagTQQm9ns;
                if (obj2 == null && s50Var.w7APNrr0aGRc) {
                    z31Var.WDYagTQQm9ns = s50Var;
                } else if (obj2 != null) {
                    s50Var.getClass();
                }
                return java.lang.Boolean.TRUE;
            default:
                defpackage.wo woVar = (defpackage.rp1) obj;
                if (((defpackage.ul0) woVar).WDYagTQQm9ns.s0TASMVLSWD5) {
                    z31Var.WDYagTQQm9ns = woVar;
                    z = false;
                } else {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
