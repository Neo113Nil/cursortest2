package defpackage;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class mww implements rmd, smd {
    public final /* synthetic */ nww a;

    public /* synthetic */ mww(nww nwwVar) {
        this.a = nwwVar;
    }

    @Override // defpackage.rmd
    public final void R(Bundle bundle) {
        nww nwwVar = this.a;
        y1g.G(nwwVar.r);
        rfq rfqVar = nwwVar.k;
        y1g.G(rfqVar);
        rfqVar.B(new lww(nwwVar));
    }

    @Override // defpackage.smd
    public final void X(h66 h66Var) {
        nww nwwVar = this.a;
        Lock lock = nwwVar.b;
        lock.lock();
        try {
            if (nwwVar.l && !h66Var.d()) {
                nwwVar.a();
                nwwVar.g();
            } else {
                nwwVar.e(h66Var);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.rmd
    public final void p0(int i) {
    }
}
