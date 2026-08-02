package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class cm5 extends AtomicReference implements wjj, jm5, ka8 {
    private static final long serialVersionUID = -8948264376121066672L;
    public final wjj a;
    public oij b;

    public cm5(wjj wjjVar, oij oijVar) {
        this.b = oijVar;
        this.a = wjjVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        ra8.e(this, ka8Var);
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        oij oijVar = this.b;
        if (oijVar == null) {
            this.a.onComplete();
        } else {
            this.b = null;
            oijVar.a(this);
        }
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        this.a.onNext(obj);
    }
}
