package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import io.grpc.internal.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class x13 extends y13 implements pue {
    public final List r;
    public sfm s;

    public x13(xhj xhjVar, xu1 xu1Var, List list, IBinder iBinder) {
        super(xhjVar, xu1Var, sue.a("from " + xu1Var.a.get(wdp.f), x13.class));
        this.r = list;
        ScheduledExecutorService scheduledExecutorService = this.b;
        Logger logger = xrj.b;
        xrj vrjVar = iBinder instanceof Binder ? new vrj(iBinder, scheduledExecutorService) : new wrj(iBinder);
        this.j = vrjVar;
        try {
            vrjVar.a.linkToDeath(this, 0);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.y13
    public final void k() {
        sfm sfmVar = this.s;
        if (sfmVar != null) {
            Future future = (Future) sfmVar.b;
            if (future != null) {
                future.cancel(false);
                sfmVar.b = null;
            }
            Iterator it = ((b) sfmVar.c).g.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
            b bVar = (b) sfmVar.c;
            x13 x13Var = (x13) sfmVar.a;
            synchronized (bVar.o) {
                try {
                    if (!bVar.q.remove(x13Var)) {
                        throw new AssertionError("Transport already removed");
                    }
                    lte.b((kte) bVar.t.e.get(Long.valueOf(bVar.b.c)), x13Var);
                    bVar.e();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void q(sfm sfmVar) {
        try {
            this.s = sfmVar;
            if (j()) {
                n(5);
                k();
                this.a.K(this.b);
            } else {
                l();
                if (!j()) {
                    n(3);
                    xu1 xu1Var = this.g;
                    ((Future) sfmVar.b).cancel(false);
                    sfmVar.b = null;
                    Iterator it = ((b) sfmVar.c).g.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    this.g = xu1Var;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
