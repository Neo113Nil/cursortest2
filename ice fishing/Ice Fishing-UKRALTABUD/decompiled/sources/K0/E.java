package K0;

/* loaded from: classes.dex */
public final class E implements d0, D0.l {

    /* renamed from: f, reason: collision with root package name */
    public final D f465f;

    public E(D d2) {
        this.f465f = d2;
    }

    public final void b(Throwable th) {
        this.f465f.d();
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        b((Throwable) obj);
        return t0.g.f2989a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f465f + ']';
    }
}
