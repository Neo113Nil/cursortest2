package b;

/* loaded from: classes.dex */
public final class s implements InterfaceC0107c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0116l f2318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f2319b;

    public s(u uVar, AbstractC0116l abstractC0116l) {
        D1.i.e(abstractC0116l, "onBackPressedCallback");
        this.f2319b = uVar;
        this.f2318a = abstractC0116l;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [C1.a, D1.g] */
    @Override // b.InterfaceC0107c
    public final void cancel() {
        u uVar = this.f2319b;
        u1.e eVar = uVar.f2321b;
        AbstractC0116l abstractC0116l = this.f2318a;
        eVar.remove(abstractC0116l);
        if (D1.i.a(uVar.f2322c, abstractC0116l)) {
            abstractC0116l.getClass();
            uVar.f2322c = null;
        }
        abstractC0116l.f2302b.remove(this);
        ?? r02 = abstractC0116l.f2303c;
        if (r02 != 0) {
            r02.c();
        }
        abstractC0116l.f2303c = null;
    }
}
