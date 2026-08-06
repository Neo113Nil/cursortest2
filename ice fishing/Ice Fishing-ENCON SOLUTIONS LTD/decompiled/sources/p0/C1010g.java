package p0;

/* renamed from: p0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010g implements InterfaceC1005b {

    /* renamed from: b, reason: collision with root package name */
    public static C1010g f8374b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1011h f8375c = new C1011h(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f8376a;

    public /* synthetic */ C1010g(Object obj) {
        this.f8376a = obj;
    }

    public static synchronized C1010g b() {
        C1010g c1010g;
        synchronized (C1010g.class) {
            try {
                if (f8374b == null) {
                    f8374b = new C1010g();
                }
                c1010g = f8374b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1010g;
    }

    @Override // p0.InterfaceC1005b
    public void a(m0.b bVar) {
        boolean z2 = bVar.f8163b == 0;
        C0.a aVar = (C0.a) this.f8376a;
        if (z2) {
            aVar.l(null, aVar.f2706w);
            return;
        }
        C1010g c1010g = aVar.f2699o;
        if (c1010g != null) {
            ((n0.h) c1010g.f8376a).b(bVar);
        }
    }
}
