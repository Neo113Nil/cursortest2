package defpackage;

/* loaded from: classes5.dex */
public final class qwt0 implements Runnable {
    public final rwt0 a;
    public final long b;
    public boolean c = true;

    public qwt0(rwt0 rwt0Var, int i) {
        this.a = rwt0Var;
        this.b = 1000 / i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        this.a.b = false;
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j = currentTimeMillis2 - currentTimeMillis;
            synchronized (this) {
                try {
                    if (this.c) {
                        if (!rwt0.a(this.a, j)) {
                            this.c = false;
                        }
                        z = this.c;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                return;
            }
            try {
                Thread.sleep(this.b);
            } catch (InterruptedException unused) {
            }
            currentTimeMillis = currentTimeMillis2;
        }
    }
}
