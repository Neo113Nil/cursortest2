package g;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0145e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0146f f1934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f1935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f1936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A.j f1937h;

    public RunnableC0145e(A.j jVar, C0146f c0146f, k kVar, j jVar2) {
        this.f1937h = jVar;
        this.f1934e = c0146f;
        this.f1935f = kVar;
        this.f1936g = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0146f c0146f = this.f1934e;
        if (c0146f != null) {
            A.j jVar = this.f1937h;
            ((ViewOnKeyListenerC0147g) jVar.f30f).f1944D = true;
            c0146f.f1939b.c(false);
            ((ViewOnKeyListenerC0147g) jVar.f30f).f1944D = false;
        }
        k kVar = this.f1935f;
        if (kVar.isEnabled() && kVar.hasSubMenu()) {
            this.f1936g.p(kVar, null, 4);
        }
    }
}
