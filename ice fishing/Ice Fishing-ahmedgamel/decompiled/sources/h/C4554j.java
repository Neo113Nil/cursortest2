package h;

import d.InterfaceC4448b;

/* renamed from: h.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4554j implements InterfaceC4448b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4555k f37926a;

    public C4554j(AbstractActivityC4555k abstractActivityC4555k) {
        this.f37926a = abstractActivityC4555k;
    }

    @Override // d.InterfaceC4448b
    public final void a(androidx.activity.p pVar) {
        AbstractActivityC4555k abstractActivityC4555k = this.f37926a;
        p delegate = abstractActivityC4555k.getDelegate();
        delegate.a();
        abstractActivityC4555k.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
