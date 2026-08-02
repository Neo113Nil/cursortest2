package defpackage;

/* loaded from: classes5.dex */
public final class oib extends pib {
    public final Runnable c;

    public oib(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.pib
    public final String toString() {
        return super.toString() + this.c;
    }
}
