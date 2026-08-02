package defpackage;

/* loaded from: classes5.dex */
public final class gyr implements Runnable {
    public final Runnable a;
    public boolean b;
    public boolean c;

    public gyr(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c = true;
        this.a.run();
    }
}
