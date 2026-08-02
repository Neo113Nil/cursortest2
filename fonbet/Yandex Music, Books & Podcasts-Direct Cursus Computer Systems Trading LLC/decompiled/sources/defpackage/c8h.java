package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class c8h extends mc4 {
    public final /* synthetic */ g8h a;

    public c8h(g8h g8hVar) {
        this.a = g8hVar;
    }

    @Override // defpackage.mc4
    public final String e() {
        return this.a.b;
    }

    @Override // defpackage.mc4
    public final vn4 g(k3i k3iVar, ks3 ks3Var) {
        j8h j8hVar = this.a.d;
        Logger logger = j8h.c0;
        Executor executor = ks3Var.b;
        if (executor == null) {
            executor = j8hVar.h;
        }
        zn4 zn4Var = new zn4(k3iVar, executor, ks3Var, j8hVar.Z, j8hVar.I ? null : this.a.d.f.a.d, this.a.d.L);
        zn4Var.p = this.a.d.n;
        return zn4Var;
    }
}
