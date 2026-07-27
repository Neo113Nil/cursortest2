package O2;

/* loaded from: classes.dex */
public final class C implements InterfaceC0352b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0354d f2164a;

    public C(C0354d c0354d) {
        this.f2164a = c0354d;
    }

    @Override // O2.InterfaceC0352b
    public final void a(boolean z3) {
        a3.e eVar = this.f2164a.f2235F;
        eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z3)));
    }
}
