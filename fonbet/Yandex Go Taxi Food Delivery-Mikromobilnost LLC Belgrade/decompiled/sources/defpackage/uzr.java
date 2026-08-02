package defpackage;

import androidx.compose.ui.semantics.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class uzr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bpl0 b;

    public /* synthetic */ uzr(int i, bpl0 bpl0Var) {
        this.a = i;
        this.b = bpl0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        bpl0 bpl0Var = this.b;
        mnq0 mnq0Var = (mnq0) obj;
        switch (i) {
            case 0:
                f.j(mnq0Var, new hcc(bpl0Var.a.size(), 1));
                break;
            case 1:
                f.j(mnq0Var, new hcc(1, bpl0Var.a.size()));
                break;
            case 2:
                f.j(mnq0Var, new hcc(bpl0Var.a.size(), 1));
                break;
            default:
                f.j(mnq0Var, new hcc(1, bpl0Var.a.size()));
                break;
        }
        return zy11Var;
    }
}
