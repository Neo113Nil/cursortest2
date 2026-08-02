package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class yeh extends AtomicReference implements xeh, ka8 {
    private static final long serialVersionUID = 4603919676453758899L;
    public final nkq a;
    public final gkq b;

    public yeh(nkq nkqVar, gkq gkqVar) {
        this.a = nkqVar;
        this.b = gkqVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
    }

    @Override // defpackage.xeh
    public final void b(ka8 ka8Var) {
        if (ra8.g(this, ka8Var)) {
            this.a.b(this);
        }
    }

    @Override // defpackage.xeh
    public final void onComplete() {
        ka8 ka8Var = (ka8) get();
        if (ka8Var == ra8.a || !compareAndSet(ka8Var, null)) {
            return;
        }
        this.b.K(new qdc(11, this.a, this));
    }

    @Override // defpackage.xeh
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.xeh
    public final void onSuccess(Object obj) {
        this.a.onSuccess(obj);
    }
}
