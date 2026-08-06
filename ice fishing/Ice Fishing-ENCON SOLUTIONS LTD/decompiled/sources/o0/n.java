package o0;

import java.util.Set;
import n0.InterfaceC0989c;
import p0.InterfaceC1005b;
import p0.InterfaceC1008e;

/* loaded from: classes.dex */
public final class n implements InterfaceC1005b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0989c f8289a;

    /* renamed from: b, reason: collision with root package name */
    public final C0997a f8290b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1008e f8291c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f8292d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8293e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f8294f;

    public n(c cVar, InterfaceC0989c interfaceC0989c, C0997a c0997a) {
        this.f8294f = cVar;
        this.f8289a = interfaceC0989c;
        this.f8290b = c0997a;
    }

    @Override // p0.InterfaceC1005b
    public final void a(m0.b bVar) {
        this.f8294f.f8269m.post(new D0.f(6, this, bVar));
    }

    public final void b(m0.b bVar) {
        l lVar = (l) this.f8294f.f8266j.get(this.f8290b);
        if (lVar != null) {
            lVar.p(bVar);
        }
    }
}
