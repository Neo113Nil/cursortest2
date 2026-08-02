package defpackage;

/* loaded from: classes5.dex */
public final class hto implements ka8, Runnable {
    public final Runnable a;
    public final ito b;
    public Thread c;

    public hto(Runnable runnable, ito itoVar) {
        this.a = runnable;
        this.b = itoVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.c == Thread.currentThread()) {
            ito itoVar = this.b;
            if (itoVar instanceof p5j) {
                p5j p5jVar = (p5j) itoVar;
                if (p5jVar.b) {
                    return;
                }
                p5jVar.b = true;
                p5jVar.a.shutdown();
                return;
            }
        }
        this.b.a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            a();
            this.c = null;
        }
    }
}
