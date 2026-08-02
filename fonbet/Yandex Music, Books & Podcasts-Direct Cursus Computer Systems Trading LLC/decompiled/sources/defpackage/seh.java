package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class seh extends AtomicReference implements xeh, ka8 {
    private static final long serialVersionUID = -6076952298809384986L;
    public final h5n a;
    public final h5n b;
    public final wvo c;

    public seh(h5n h5nVar, h5n h5nVar2) {
        wvo wvoVar = etn.q;
        this.a = h5nVar;
        this.b = h5nVar2;
        this.c = wvoVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
    }

    @Override // defpackage.xeh
    public final void b(ka8 ka8Var) {
        ra8.g(this, ka8Var);
    }

    @Override // defpackage.xeh
    public final void onComplete() {
        lazySet(ra8.a);
        try {
            this.c.getClass();
        } catch (Throwable th) {
            leu.a0(th);
            y5g.g0(th);
        }
    }

    @Override // defpackage.xeh
    public final void onError(Throwable th) {
        lazySet(ra8.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            leu.a0(th2);
            y5g.g0(new ar5(th, th2));
        }
    }

    @Override // defpackage.xeh
    public final void onSuccess(Object obj) {
        lazySet(ra8.a);
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            leu.a0(th);
            y5g.g0(th);
        }
    }
}
