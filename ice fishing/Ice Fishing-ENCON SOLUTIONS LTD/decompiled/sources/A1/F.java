package A1;

import h1.C0239i;

/* loaded from: classes.dex */
public final class F implements e0, t1.l {

    /* renamed from: a, reason: collision with root package name */
    public final E f4a;

    public F(E e2) {
        this.f4a = e2;
    }

    public final void a(Throwable th) {
        this.f4a.a();
    }

    @Override // t1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return C0239i.f3393a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f4a + ']';
    }
}
