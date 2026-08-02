package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* loaded from: classes.dex */
public final class hww implements vww {
    public final xww a;

    public hww(xww xwwVar) {
        this.a = xwwVar;
    }

    @Override // defpackage.vww
    public final gr2 l(gr2 gr2Var) {
        xww xwwVar = this.a;
        try {
            qne qneVar = xwwVar.s.w;
            ((Set) qneVar.a).add(gr2Var);
            gr2Var.g.set((yxw) qneVar.b);
            go0 go0Var = gr2Var.o;
            fo0 fo0Var = (fo0) xwwVar.s.o.get(go0Var);
            y1g.H(fo0Var, "Appropriate Api was not requested.");
            if (!fo0Var.isConnected() && xwwVar.m.containsKey(go0Var)) {
                gr2Var.m(new Status(17, null, null, null));
                return gr2Var;
            }
            try {
                gr2Var.l(fo0Var);
            } catch (DeadObjectException e) {
                gr2Var.m(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                gr2Var.m(new Status(8, e2.getLocalizedMessage(), null, null));
            }
            return gr2Var;
        } catch (DeadObjectException unused) {
            gww gwwVar = new gww(this, this);
            sww swwVar = xwwVar.k;
            swwVar.sendMessage(swwVar.obtainMessage(1, gwwVar));
            return gr2Var;
        }
    }

    @Override // defpackage.vww
    public final void n(int i) {
        xww xwwVar = this.a;
        xwwVar.h();
        xwwVar.t.z(i);
    }

    @Override // defpackage.vww
    public final boolean o() {
        xww xwwVar = this.a;
        xwwVar.s.getClass();
        xwwVar.h();
        return true;
    }

    @Override // defpackage.vww
    public final void h() {
    }

    @Override // defpackage.vww
    public final void j() {
    }

    @Override // defpackage.vww
    public final void b(Bundle bundle) {
    }

    @Override // defpackage.vww
    public final void p(h66 h66Var, po0 po0Var, boolean z) {
    }
}
