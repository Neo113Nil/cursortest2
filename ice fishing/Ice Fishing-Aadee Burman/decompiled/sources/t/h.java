package t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f40523a;

    /* renamed from: b, reason: collision with root package name */
    public k f40524b;

    /* renamed from: c, reason: collision with root package name */
    public l f40525c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40526d;

    public final void a(Object obj) {
        this.f40526d = true;
        k kVar = this.f40524b;
        if (kVar == null || !kVar.f40529u.j(obj)) {
            return;
        }
        this.f40523a = null;
        this.f40524b = null;
        this.f40525c = null;
    }

    public final void b(Throwable th) {
        this.f40526d = true;
        k kVar = this.f40524b;
        if (kVar == null || !kVar.f40529u.k(th)) {
            return;
        }
        this.f40523a = null;
        this.f40524b = null;
        this.f40525c = null;
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f40524b;
        if (kVar != null) {
            j jVar = kVar.f40529u;
            if (!jVar.isDone()) {
                jVar.k(new U0.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f40523a, 2));
            }
        }
        if (this.f40526d || (lVar = this.f40525c) == null) {
            return;
        }
        lVar.j(null);
    }
}
