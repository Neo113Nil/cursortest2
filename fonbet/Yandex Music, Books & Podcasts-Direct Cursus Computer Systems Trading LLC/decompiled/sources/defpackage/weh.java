package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class weh extends AtomicReference implements xeh, ka8, Runnable {
    private static final long serialVersionUID = 8571289934935992137L;
    public final xeh a;
    public final gsd b;
    public Object c;
    public Throwable d;

    public weh(xeh xehVar, gsd gsdVar) {
        this.a = xehVar;
        this.b = gsdVar;
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
        ra8.e(this, this.b.b(this));
    }

    @Override // defpackage.xeh
    public final void onError(Throwable th) {
        this.d = th;
        ra8.e(this, this.b.b(this));
    }

    @Override // defpackage.xeh
    public final void onSuccess(Object obj) {
        this.c = obj;
        ra8.e(this, this.b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.d;
        xeh xehVar = this.a;
        if (th != null) {
            this.d = null;
            xehVar.onError(th);
            return;
        }
        Object obj = this.c;
        if (obj == null) {
            xehVar.onComplete();
        } else {
            this.c = null;
            xehVar.onSuccess(obj);
        }
    }
}
