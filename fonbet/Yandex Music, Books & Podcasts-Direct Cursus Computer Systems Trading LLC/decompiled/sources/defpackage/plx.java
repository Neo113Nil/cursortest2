package defpackage;

/* loaded from: classes.dex */
public final class plx extends flx implements Runnable {
    public final Runnable h;

    public plx(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // defpackage.flx
    public final String c() {
        return hrg.q("task=[", this.h.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            if (flx.f.R(this, null, new ykx(th))) {
                flx.g(this);
            }
            throw th;
        }
    }
}
