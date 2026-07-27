package L0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class E implements d0, D0.l {

    /* renamed from: e, reason: collision with root package name */
    public final D f613e;

    public E(D d2) {
        this.f613e = d2;
    }

    public final void b(Throwable th) {
        this.f613e.d();
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        b((Throwable) obj);
        return C0252g.f2994a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f613e + ']';
    }
}
