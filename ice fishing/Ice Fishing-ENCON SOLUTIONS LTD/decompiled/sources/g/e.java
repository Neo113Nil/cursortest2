package g;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z0.i f3016d;

    public e(Z0.i iVar, f fVar, k kVar, j jVar) {
        this.f3016d = iVar;
        this.f3013a = fVar;
        this.f3014b = kVar;
        this.f3015c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f3013a;
        if (fVar != null) {
            Z0.i iVar = this.f3016d;
            ((g) iVar.f1992b).f3043z = true;
            fVar.f3018b.c(false);
            ((g) iVar.f1992b).f3043z = false;
        }
        k kVar = this.f3014b;
        if (kVar.isEnabled() && kVar.hasSubMenu()) {
            this.f3015c.p(kVar, null, 4);
        }
    }
}
