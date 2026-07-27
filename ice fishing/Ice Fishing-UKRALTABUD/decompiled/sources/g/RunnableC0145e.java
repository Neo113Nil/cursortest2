package g;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0145e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0146f f1926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f1927g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f1928h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.j f1929i;

    public RunnableC0145e(A.j jVar, C0146f c0146f, k kVar, j jVar2) {
        this.f1929i = jVar;
        this.f1926f = c0146f;
        this.f1927g = kVar;
        this.f1928h = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0146f c0146f = this.f1926f;
        if (c0146f != null) {
            A.j jVar = this.f1929i;
            ((ViewOnKeyListenerC0147g) jVar.f30g).f1937E = true;
            c0146f.f1931b.c(false);
            ((ViewOnKeyListenerC0147g) jVar.f30g).f1937E = false;
        }
        k kVar = this.f1927g;
        if (kVar.isEnabled() && kVar.hasSubMenu()) {
            this.f1928h.p(kVar, null, 4);
        }
    }
}
