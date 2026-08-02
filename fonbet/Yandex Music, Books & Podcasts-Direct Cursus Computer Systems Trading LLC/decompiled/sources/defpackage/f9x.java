package defpackage;

/* loaded from: classes.dex */
public final class f9x extends j8x implements Runnable, f8x {
    public final Runnable h;

    public f9x(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // defpackage.j8x
    public final String c() {
        return hrg.q("task=[", this.h.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
