package A1;

import h1.C0239i;

/* renamed from: A1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j extends U implements InterfaceC0008i {

    /* renamed from: e, reason: collision with root package name */
    public final b0 f51e;

    public C0009j(b0 b0Var) {
        this.f51e = b0Var;
    }

    @Override // A1.InterfaceC0008i
    public final boolean c(Throwable th) {
        return j().v(th);
    }

    @Override // t1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return C0239i.f3393a;
    }

    @Override // A1.W
    public final void k(Throwable th) {
        this.f51e.r(j());
    }
}
