package O2;

/* renamed from: O2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375l implements InterfaceC0365b, InterfaceC0366c {

    /* renamed from: u, reason: collision with root package name */
    public static C0375l f2441u;

    /* renamed from: v, reason: collision with root package name */
    public static final m f2442v = new m(0, false, false, 0, 0);

    /* renamed from: n, reason: collision with root package name */
    public Object f2443n;

    public static synchronized C0375l a() {
        C0375l c0375l;
        synchronized (C0375l.class) {
            try {
                if (f2441u == null) {
                    f2441u = new C0375l();
                }
                c0375l = f2441u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0375l;
    }

    @Override // O2.InterfaceC0365b
    public void j() {
        ((M2.i) this.f2443n).onConnected(null);
    }

    @Override // O2.InterfaceC0366c
    public void onConnectionFailed(L2.b bVar) {
        ((M2.j) this.f2443n).onConnectionFailed(bVar);
    }

    @Override // O2.InterfaceC0365b
    public void onConnectionSuspended(int i) {
        ((M2.i) this.f2443n).onConnectionSuspended(i);
    }
}
