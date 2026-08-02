package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class bfh extends AtomicReference implements xeh {
    private static final long serialVersionUID = 8663801314800248617L;
    public final afh a;

    public bfh(afh afhVar) {
        this.a = afhVar;
    }

    @Override // defpackage.xeh
    public final void b(ka8 ka8Var) {
        ra8.g(this, ka8Var);
    }

    @Override // defpackage.xeh
    public final void onComplete() {
        afh afhVar = this.a;
        afhVar.getClass();
        if (ra8.b(afhVar)) {
            afhVar.a.onError(new TimeoutException());
        }
    }

    @Override // defpackage.xeh
    public final void onError(Throwable th) {
        afh afhVar = this.a;
        afhVar.getClass();
        if (ra8.b(afhVar)) {
            afhVar.a.onError(th);
        } else {
            y5g.g0(th);
        }
    }

    @Override // defpackage.xeh
    public final void onSuccess(Object obj) {
        afh afhVar = this.a;
        afhVar.getClass();
        if (ra8.b(afhVar)) {
            afhVar.a.onError(new TimeoutException());
        }
    }
}
