package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class cxw implements cr2 {
    public final fo0 a;
    public final wo0 b;
    public g8e c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ umd f;

    public cxw(umd umdVar, fo0 fo0Var, wo0 wo0Var) {
        this.f = umdVar;
        this.a = fo0Var;
        this.b = wo0Var;
    }

    @Override // defpackage.cr2
    public final void a(h66 h66Var) {
        this.f.n.post(new e8h(29, this, h66Var));
    }

    public final void b(h66 h66Var) {
        axw axwVar = (axw) this.f.j.get(this.b);
        if (axwVar != null) {
            axwVar.n(h66Var);
        }
    }
}
