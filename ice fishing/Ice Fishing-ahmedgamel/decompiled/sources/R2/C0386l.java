package R2;

/* renamed from: R2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386l implements InterfaceC0376b, InterfaceC0377c {

    /* renamed from: u, reason: collision with root package name */
    public static C0386l f2834u;

    /* renamed from: v, reason: collision with root package name */
    public static final m f2835v = new m(0, false, false, 0, 0);

    /* renamed from: n, reason: collision with root package name */
    public Object f2836n;

    public static synchronized C0386l a() {
        C0386l c0386l;
        synchronized (C0386l.class) {
            try {
                if (f2834u == null) {
                    f2834u = new C0386l();
                }
                c0386l = f2834u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0386l;
    }

    @Override // R2.InterfaceC0377c
    public void onConnectionFailed(O2.b bVar) {
        ((P2.j) this.f2836n).onConnectionFailed(bVar);
    }

    @Override // R2.InterfaceC0376b
    public void onConnectionSuspended(int i) {
        ((P2.i) this.f2836n).onConnectionSuspended(i);
    }

    @Override // R2.InterfaceC0376b
    public void z() {
        ((P2.i) this.f2836n).onConnected(null);
    }
}
