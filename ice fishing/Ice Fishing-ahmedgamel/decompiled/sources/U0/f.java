package U0;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final k f3267n;

    /* renamed from: u, reason: collision with root package name */
    public final P3.a f3268u;

    public f(k kVar, P3.a aVar) {
        this.f3267n = kVar;
        this.f3268u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3267n.f3276n != this) {
            return;
        }
        if (i.f3274y.c(this.f3267n, this, i.f(this.f3268u))) {
            i.c(this.f3267n);
        }
    }
}
