package L1;

/* loaded from: classes.dex */
public final class A implements W, C1.l {

    /* renamed from: a, reason: collision with root package name */
    public final O1.j f524a;

    public A(O1.j jVar) {
        this.f524a = jVar;
    }

    public final void a(Throwable th) {
        this.f524a.e();
    }

    @Override // C1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        a((Throwable) obj);
        return t1.i.f4388c;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f524a + ']';
    }
}
