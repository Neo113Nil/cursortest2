package t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f40579a;

    /* renamed from: b, reason: collision with root package name */
    public k f40580b;

    /* renamed from: c, reason: collision with root package name */
    public l f40581c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40582d;

    public final void a(Object obj) {
        this.f40582d = true;
        k kVar = this.f40580b;
        if (kVar == null || !kVar.f40585u.j(obj)) {
            return;
        }
        this.f40579a = null;
        this.f40580b = null;
        this.f40581c = null;
    }

    public final void b(Throwable th) {
        this.f40582d = true;
        k kVar = this.f40580b;
        if (kVar == null || !kVar.f40585u.k(th)) {
            return;
        }
        this.f40579a = null;
        this.f40580b = null;
        this.f40581c = null;
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f40580b;
        if (kVar != null) {
            j jVar = kVar.f40585u;
            if (!jVar.isDone()) {
                jVar.k(new U0.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f40579a, 2));
            }
        }
        if (this.f40582d || (lVar = this.f40581c) == null) {
            return;
        }
        lVar.j(null);
    }
}
