package l;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0221e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0222f f3667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0229m f3669c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B.b f3670d;

    public RunnableC0221e(B.b bVar, C0222f c0222f, o oVar, MenuC0229m menuC0229m) {
        this.f3670d = bVar;
        this.f3667a = c0222f;
        this.f3668b = oVar;
        this.f3669c = menuC0229m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0222f c0222f = this.f3667a;
        if (c0222f != null) {
            B.b bVar = this.f3670d;
            ((ViewOnKeyListenerC0223g) bVar.f10b).f3695z = true;
            c0222f.f3672b.c(false);
            ((ViewOnKeyListenerC0223g) bVar.f10b).f3695z = false;
        }
        o oVar = this.f3668b;
        if (oVar.isEnabled() && oVar.hasSubMenu()) {
            this.f3669c.q(oVar, null, 4);
        }
    }
}
