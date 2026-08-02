package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public abstract class usc extends wdg {
    @Override // defpackage.wdg
    public zdg K(ime imeVar) {
        return b0().K(imeVar);
    }

    @Override // defpackage.wdg
    public final zc4 N() {
        return b0().N();
    }

    @Override // defpackage.wdg
    public final ScheduledExecutorService Q() {
        return b0().Q();
    }

    @Override // defpackage.wdg
    public final vq6 R() {
        return b0().R();
    }

    @Override // defpackage.wdg
    public final void W() {
        b0().W();
    }

    @Override // defpackage.wdg
    public void Z(r76 r76Var, aeg aegVar) {
        b0().Z(r76Var, aegVar);
    }

    public abstract wdg b0();

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(b0(), "delegate");
        return Y.toString();
    }
}
