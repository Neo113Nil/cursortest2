package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class veh extends wyf implements Callable {
    public final Callable a;

    public veh(Callable callable) {
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.call();
    }

    @Override // defpackage.wyf
    public final void d0(xeh xehVar) {
        kjo kjoVar = new kjo(etn.p);
        xehVar.b(kjoVar);
        if (kjoVar.b()) {
            return;
        }
        try {
            Object call = this.a.call();
            if (kjoVar.b()) {
                return;
            }
            if (call == null) {
                xehVar.onComplete();
            } else {
                xehVar.onSuccess(call);
            }
        } catch (Throwable th) {
            leu.a0(th);
            if (kjoVar.b()) {
                y5g.g0(th);
            } else {
                xehVar.onError(th);
            }
        }
    }
}
