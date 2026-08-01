package h;

import d.InterfaceC4433b;

/* renamed from: h.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4550j implements InterfaceC4433b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f37900a;

    public C4550j(AbstractActivityC4551k abstractActivityC4551k) {
        this.f37900a = abstractActivityC4551k;
    }

    @Override // d.InterfaceC4433b
    public final void a(androidx.activity.p pVar) {
        AbstractActivityC4551k abstractActivityC4551k = this.f37900a;
        p delegate = abstractActivityC4551k.getDelegate();
        delegate.a();
        abstractActivityC4551k.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
