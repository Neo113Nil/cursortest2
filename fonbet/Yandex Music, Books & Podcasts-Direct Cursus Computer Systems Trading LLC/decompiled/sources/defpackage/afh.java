package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class afh extends AtomicReference implements xeh, ka8 {
    private static final long serialVersionUID = -5955289211445418871L;
    public final xeh a;
    public final bfh b = new bfh(this);

    public afh(xeh xehVar) {
        this.a = xehVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
        ra8.b(this.b);
    }

    @Override // defpackage.xeh
    public final void b(ka8 ka8Var) {
        ra8.g(this, ka8Var);
    }

    @Override // defpackage.xeh
    public final void onComplete() {
        ra8.b(this.b);
        ra8 ra8Var = ra8.a;
        if (getAndSet(ra8Var) != ra8Var) {
            this.a.onComplete();
        }
    }

    @Override // defpackage.xeh
    public final void onError(Throwable th) {
        ra8.b(this.b);
        ra8 ra8Var = ra8.a;
        if (getAndSet(ra8Var) != ra8Var) {
            this.a.onError(th);
        } else {
            y5g.g0(th);
        }
    }

    @Override // defpackage.xeh
    public final void onSuccess(Object obj) {
        ra8.b(this.b);
        ra8 ra8Var = ra8.a;
        if (getAndSet(ra8Var) != ra8Var) {
            this.a.onSuccess(obj);
        }
    }
}
