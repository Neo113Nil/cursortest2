package z4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final j f9120g;

    /* renamed from: h, reason: collision with root package name */
    public final h7.a f9121h;

    public e(j jVar, h7.a aVar) {
        this.f9120g = jVar;
        this.f9121h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9120g.f9129g != this) {
            return;
        }
        if (h.f9127l.c(this.f9120g, this, h.f(this.f9121h))) {
            h.c(this.f9120g);
        }
    }
}
