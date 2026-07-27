package P2;

/* renamed from: P2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382l implements InterfaceC0372b, InterfaceC0373c {

    /* renamed from: u, reason: collision with root package name */
    public static C0382l f2513u;

    /* renamed from: v, reason: collision with root package name */
    public static final m f2514v = new m(0, false, false, 0, 0);

    /* renamed from: n, reason: collision with root package name */
    public Object f2515n;

    public static synchronized C0382l a() {
        C0382l c0382l;
        synchronized (C0382l.class) {
            try {
                if (f2513u == null) {
                    f2513u = new C0382l();
                }
                c0382l = f2513u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0382l;
    }

    @Override // P2.InterfaceC0373c
    public void onConnectionFailed(M2.b bVar) {
        ((N2.j) this.f2515n).onConnectionFailed(bVar);
    }

    @Override // P2.InterfaceC0372b
    public void onConnectionSuspended(int i) {
        ((N2.i) this.f2515n).onConnectionSuspended(i);
    }

    @Override // P2.InterfaceC0372b
    public void r() {
        ((N2.i) this.f2515n).onConnected(null);
    }
}
