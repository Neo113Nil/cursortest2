package P2;

import java.util.Objects;

/* renamed from: P2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375e implements InterfaceC0374d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376f f2452a;

    public C0375e(AbstractC0376f abstractC0376f) {
        Objects.requireNonNull(abstractC0376f);
        this.f2452a = abstractC0376f;
    }

    @Override // P2.InterfaceC0374d
    public final void a(M2.b bVar) {
        boolean b9 = bVar.b();
        AbstractC0376f abstractC0376f = this.f2452a;
        if (b9) {
            abstractC0376f.a(null, abstractC0376f.t());
            return;
        }
        InterfaceC0373c interfaceC0373c = abstractC0376f.f2466N;
        if (interfaceC0373c != null) {
            interfaceC0373c.onConnectionFailed(bVar);
        }
    }
}
