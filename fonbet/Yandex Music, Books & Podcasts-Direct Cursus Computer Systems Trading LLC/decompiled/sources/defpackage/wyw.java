package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class wyw implements rmd, smd {
    public final po0 a;
    public final boolean h;
    public xww i;

    public wyw(po0 po0Var, boolean z) {
        this.a = po0Var;
        this.h = z;
    }

    @Override // defpackage.rmd
    public final void R(Bundle bundle) {
        y1g.H(this.i, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.i.R(bundle);
    }

    @Override // defpackage.smd
    public final void X(h66 h66Var) {
        po0 po0Var = this.a;
        boolean z = this.h;
        y1g.H(this.i, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        xww xwwVar = this.i;
        xwwVar.a.lock();
        try {
            xwwVar.q.p(h66Var, po0Var, z);
        } finally {
            xwwVar.a.unlock();
        }
    }

    @Override // defpackage.rmd
    public final void p0(int i) {
        y1g.H(this.i, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.i.p0(i);
    }
}
