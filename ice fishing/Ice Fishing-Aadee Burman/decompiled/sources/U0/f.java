package U0;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final k f3150n;

    /* renamed from: u, reason: collision with root package name */
    public final N3.a f3151u;

    public f(k kVar, N3.a aVar) {
        this.f3150n = kVar;
        this.f3151u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3150n.f3159n != this) {
            return;
        }
        if (i.f3157y.c(this.f3150n, this, i.f(this.f3151u))) {
            i.c(this.f3150n);
        }
    }
}
