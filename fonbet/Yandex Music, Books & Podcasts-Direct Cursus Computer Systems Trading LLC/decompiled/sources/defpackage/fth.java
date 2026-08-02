package defpackage;

import android.os.RemoteException;
import androidx.media3.session.MediaSessionService;
import androidx.media3.session.i;

/* loaded from: classes.dex */
public final /* synthetic */ class fth implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ fth(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                jth jthVar = iVar.v;
                if (jthVar != null) {
                    iVar.t.x0(jthVar);
                    return;
                }
                return;
            case 1:
                i iVar2 = this.b;
                synchronized (iVar2.a) {
                    try {
                        if (iVar2.y) {
                            return;
                        }
                        final tmp l1 = iVar2.t.l1();
                        if (!iVar2.c.hasMessages(1) && vwh.a(l1, iVar2.s.c)) {
                            g06 g06Var = iVar2.g.i;
                            yde x = g06Var.x();
                            for (int i = 0; i < x.size(); i++) {
                                final wrh wrhVar = (wrh) x.get(i);
                                final boolean J = g06Var.J(wrhVar, 16);
                                final boolean J2 = g06Var.J(wrhVar, 17);
                                iVar2.c(wrhVar, new kth() { // from class: hth
                                    @Override // defpackage.kth
                                    public final void a(vrh vrhVar, int i2) {
                                        vrhVar.h(i2, tmp.this, J, J2, wrhVar.c);
                                    }
                                });
                            }
                            try {
                                iVar2.h.j.h(0, l1, true, true, 0);
                            } catch (RemoteException e) {
                                vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
                            }
                        }
                        iVar2.v();
                        return;
                    } finally {
                    }
                }
            case 2:
                this.b.v();
                return;
            default:
                i iVar3 = this.b;
                qzc qzcVar = iVar3.w;
                if (qzcVar != null) {
                    ((MediaSessionService) qzcVar.b).h(iVar3.k, false);
                    return;
                }
                return;
        }
    }
}
