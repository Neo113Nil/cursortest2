package t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f40526a;

    /* renamed from: b, reason: collision with root package name */
    public k f40527b;

    /* renamed from: c, reason: collision with root package name */
    public l f40528c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40529d;

    public final void a(Object obj) {
        this.f40529d = true;
        k kVar = this.f40527b;
        if (kVar == null || !kVar.f40532u.j(obj)) {
            return;
        }
        this.f40526a = null;
        this.f40527b = null;
        this.f40528c = null;
    }

    public final void b(Throwable th) {
        this.f40529d = true;
        k kVar = this.f40527b;
        if (kVar == null || !kVar.f40532u.k(th)) {
            return;
        }
        this.f40526a = null;
        this.f40527b = null;
        this.f40528c = null;
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f40527b;
        if (kVar != null) {
            j jVar = kVar.f40532u;
            if (!jVar.isDone()) {
                jVar.k(new U0.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f40526a, 2));
            }
        }
        if (this.f40529d || (lVar = this.f40528c) == null) {
            return;
        }
        lVar.j(null);
    }
}
