package defpackage;

import java.util.Set;

/* loaded from: classes5.dex */
public final class qpb implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final y2r0 d;

    public /* synthetic */ qpb(xvf0 xvf0Var, xvf0 xvf0Var2, y2r0 y2r0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = y2r0Var;
    }

    public static qpb a(xvf0 xvf0Var, y2r0 y2r0Var, y2r0 y2r0Var2) {
        return new qpb(xvf0Var, y2r0Var, y2r0Var2, 1);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        y2r0 y2r0Var = this.d;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                tt2 tt2Var = (tt2) xvf0Var2.get();
                Set set = (Set) xvf0Var.get();
                Set set2 = (Set) y2r0Var.get();
                qhw0 a = jl40.a();
                tt2Var.getClass();
                sjh sjhVar = uyj.a;
                return iha1.g(bvf0.a(cvw.U(a, mdh.b)), new a7b(14, set, set2));
            default:
                tt2 tt2Var2 = (tt2) xvf0Var2.get();
                Set set3 = (Set) xvf0Var.get();
                Set set4 = (Set) y2r0Var.get();
                qhw0 a2 = jl40.a();
                tt2Var2.getClass();
                sjh sjhVar2 = uyj.a;
                return iha1.g(bvf0.a(cvw.U(a2, mdh.b)), new lxo0(4, set3, set4, tt2Var2));
        }
    }
}
