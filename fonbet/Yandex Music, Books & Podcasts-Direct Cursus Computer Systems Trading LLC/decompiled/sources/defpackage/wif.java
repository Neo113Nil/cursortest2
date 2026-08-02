package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class wif extends AtomicReference implements wjj, ka8 {
    private static final long serialVersionUID = -7251123623727029452L;
    public final va6 a;
    public final ehv b;
    public final wvo c;
    public final e3s d;

    public wif(va6 va6Var) {
        ehv ehvVar = etn.s;
        wvo wvoVar = etn.q;
        e3s e3sVar = etn.r;
        this.a = va6Var;
        this.b = ehvVar;
        this.c = wvoVar;
        this.d = e3sVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.g(this, ka8Var)) {
            try {
                this.d.getClass();
            } catch (Throwable th) {
                leu.a0(th);
                ka8Var.a();
                onError(th);
            }
        }
    }

    public final boolean d() {
        return get() == ra8.a;
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        if (d()) {
            return;
        }
        lazySet(ra8.a);
        try {
            this.c.getClass();
        } catch (Throwable th) {
            leu.a0(th);
            y5g.g0(th);
        }
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        if (d()) {
            y5g.g0(th);
            return;
        }
        lazySet(ra8.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            leu.a0(th2);
            y5g.g0(new ar5(th, th2));
        }
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        if (d()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            leu.a0(th);
            ((ka8) get()).a();
            onError(th);
        }
    }
}
