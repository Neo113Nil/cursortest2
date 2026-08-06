package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ur extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ defpackage.v31 QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(defpackage.k0 k0Var, defpackage.vr vrVar, defpackage.v31 v31Var) {
        super(1);
        this.QiMR8OkAhezm = v31Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.oh71FJcDz6S2;
        defpackage.qp1 qp1Var = defpackage.qp1.WDYagTQQm9ns;
        defpackage.v31 v31Var = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                defpackage.vr vrVar = (defpackage.vr) obj;
                if (!vrVar.s0TASMVLSWD5) {
                    return defpackage.qp1.oh71FJcDz6S2;
                }
                if (vrVar.ZVVdXbWmyCSK != null) {
                    defpackage.e80.giKS3J6vZuNy("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                vrVar.ZVVdXbWmyCSK = null;
                v31Var.WDYagTQQm9ns = v31Var.WDYagTQQm9ns;
                return qp1Var;
            default:
                if (!((defpackage.s50) obj).w7APNrr0aGRc) {
                    return qp1Var;
                }
                v31Var.WDYagTQQm9ns = false;
                return defpackage.qp1.QiMR8OkAhezm;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(defpackage.v31 v31Var) {
        super(1);
        this.QiMR8OkAhezm = v31Var;
    }
}
