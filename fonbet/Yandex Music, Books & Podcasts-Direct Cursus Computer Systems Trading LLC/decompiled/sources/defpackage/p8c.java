package defpackage;

/* loaded from: classes.dex */
public final class p8c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ st0 b;

    public p8c(st0 st0Var) {
        this.b = st0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (!bp6.a.contains(this)) {
                    try {
                        this.b.getClass();
                        break;
                    } catch (Throwable th) {
                        bp6.a(this, th);
                        return;
                    }
                }
                break;
            default:
                if (!bp6.a.contains(this)) {
                    try {
                        this.b.getClass();
                        st0.a();
                        break;
                    } catch (Throwable th2) {
                        bp6.a(this, th2);
                    }
                }
                break;
        }
    }

    public p8c(st0 st0Var, n8c n8cVar) {
        this.b = st0Var;
    }
}
