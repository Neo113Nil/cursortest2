package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.kinopoisk.sdk.easylogin.internal.T0;

/* loaded from: classes5.dex */
public final class ueh extends AtomicReference implements xeh, jm5, ka8 {
    private static final long serialVersionUID = -2177128922851101253L;
    public final jm5 a;
    public final h5n b;

    public ueh(jm5 jm5Var, h5n h5nVar) {
        this.a = jm5Var;
        this.b = h5nVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
    }

    @Override // defpackage.xeh
    public final void b(ka8 ka8Var) {
        ra8.e(this, ka8Var);
    }

    @Override // defpackage.xeh
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override // defpackage.xeh
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.xeh
    public final void onSuccess(Object obj) {
        try {
            mm5 g = T0.g((T0.e) this.b.b, obj);
            up6.L(g, "The mapper returned a null CompletableSource");
            if (ra8.d((ka8) get())) {
                return;
            }
            ((bm5) g).a(this);
        } catch (Throwable th) {
            leu.a0(th);
            onError(th);
        }
    }
}
