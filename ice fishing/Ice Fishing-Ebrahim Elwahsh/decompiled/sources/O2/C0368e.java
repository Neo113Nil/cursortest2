package O2;

import java.util.Objects;

/* renamed from: O2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368e implements InterfaceC0367d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0369f f2380a;

    public C0368e(AbstractC0369f abstractC0369f) {
        Objects.requireNonNull(abstractC0369f);
        this.f2380a = abstractC0369f;
    }

    @Override // O2.InterfaceC0367d
    public final void a(L2.b bVar) {
        boolean b9 = bVar.b();
        AbstractC0369f abstractC0369f = this.f2380a;
        if (b9) {
            abstractC0369f.g(null, abstractC0369f.t());
            return;
        }
        InterfaceC0366c interfaceC0366c = abstractC0369f.f2394N;
        if (interfaceC0366c != null) {
            interfaceC0366c.onConnectionFailed(bVar);
        }
    }
}
