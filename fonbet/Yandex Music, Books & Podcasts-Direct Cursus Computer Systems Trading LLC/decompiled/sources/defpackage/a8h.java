package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class a8h extends wdg {
    public kkp a;
    public final /* synthetic */ j8h b;

    public a8h(j8h j8hVar) {
        this.b = j8hVar;
    }

    @Override // defpackage.wdg
    public final zdg K(ime imeVar) {
        j8h j8hVar = this.b;
        j8hVar.m.e();
        o2g.U("Channel is being terminated", !j8hVar.H);
        return new i8h(j8hVar, imeVar);
    }

    @Override // defpackage.wdg
    public final zc4 N() {
        return this.b.N;
    }

    @Override // defpackage.wdg
    public final ScheduledExecutorService Q() {
        return this.b.g;
    }

    @Override // defpackage.wdg
    public final vq6 R() {
        return this.b.m;
    }

    @Override // defpackage.wdg
    public final void W() {
        vq6 vq6Var = this.b.m;
        vq6Var.e();
        vq6Var.execute(new dsd(10, this));
    }

    @Override // defpackage.wdg
    public final void Z(r76 r76Var, aeg aegVar) {
        vq6 vq6Var = this.b.m;
        vq6Var.e();
        o2g.O(r76Var, "newState");
        o2g.O(aegVar, "newPicker");
        vq6Var.execute(new nud(12, this, aegVar, r76Var));
    }
}
