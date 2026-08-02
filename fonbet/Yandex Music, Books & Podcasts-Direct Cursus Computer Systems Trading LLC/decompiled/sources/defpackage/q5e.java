package defpackage;

/* loaded from: classes5.dex */
public final class q5e implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ aaf b;

    public q5e(aaf aafVar, long j) {
        this.b = aafVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                ((noj) this.b.a.a).c(sgr.o.i("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public q5e(aaf aafVar, Throwable th) {
        this.b = aafVar;
    }
}
