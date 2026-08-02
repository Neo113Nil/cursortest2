package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class emd extends ypi {
    @Override // defpackage.ypi
    public final ypi C(Function1 function1, Function1 function12) {
        return (ypi) ((b2r) g2r.f(new kif(6, new dmd(function1, function12, 0))));
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void c() {
        synchronized (g2r.b) {
            o();
        }
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void k() {
        wct.N();
        throw null;
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void l() {
        wct.N();
        throw null;
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void m() {
        g2r.a();
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final b2r u(Function1 function1) {
        return (ekn) ((b2r) g2r.f(new kif(6, new mp3(4, function1))));
    }

    @Override // defpackage.ypi
    public final bzf w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
