package Q2;

/* loaded from: classes.dex */
public final class B implements InterfaceC0357b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0359d f2482a;

    public B(C0359d c0359d) {
        this.f2482a = c0359d;
    }

    @Override // Q2.InterfaceC0357b
    public final void a(boolean z6) {
        c3.e eVar = this.f2482a.f2553F;
        eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z6)));
    }
}
