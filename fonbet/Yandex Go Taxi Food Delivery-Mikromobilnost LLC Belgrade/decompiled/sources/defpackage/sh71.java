package defpackage;

/* loaded from: classes7.dex */
public final class sh71 {
    public boolean a;

    public final synchronized void a() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
