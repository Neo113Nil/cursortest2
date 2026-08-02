package R2;

import java.util.Objects;

/* renamed from: R2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379e implements InterfaceC0378d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0380f f2773a;

    public C0379e(AbstractC0380f abstractC0380f) {
        Objects.requireNonNull(abstractC0380f);
        this.f2773a = abstractC0380f;
    }

    @Override // R2.InterfaceC0378d
    public final void a(O2.b bVar) {
        boolean b9 = bVar.b();
        AbstractC0380f abstractC0380f = this.f2773a;
        if (b9) {
            abstractC0380f.c(null, abstractC0380f.t());
            return;
        }
        InterfaceC0377c interfaceC0377c = abstractC0380f.f2787N;
        if (interfaceC0377c != null) {
            interfaceC0377c.onConnectionFailed(bVar);
        }
    }
}
