package defpackage;

/* loaded from: classes3.dex */
public final class ydi extends o6 implements Runnable {
    public final Runnable h;

    public ydi(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // defpackage.v6
    public final String j() {
        return "task=[" + this.h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
