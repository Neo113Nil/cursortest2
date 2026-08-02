package b1;

import c1.InterfaceC0541a;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements InterfaceC0519c, InterfaceC0541a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5505a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5506b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f5507c;

    /* renamed from: d, reason: collision with root package name */
    public final c1.i f5508d;

    /* renamed from: e, reason: collision with root package name */
    public final c1.i f5509e;

    /* renamed from: f, reason: collision with root package name */
    public final c1.i f5510f;

    public t(AbstractC4563a abstractC4563a, g1.p pVar) {
        pVar.getClass();
        this.f5505a = pVar.f37659e;
        this.f5507c = pVar.f37655a;
        c1.i a9 = pVar.f37656b.a();
        this.f5508d = a9;
        c1.i a10 = pVar.f37657c.a();
        this.f5509e = a10;
        c1.i a11 = pVar.f37658d.a();
        this.f5510f = a11;
        abstractC4563a.f(a9);
        abstractC4563a.f(a10);
        abstractC4563a.f(a11);
        a9.a(this);
        a10.a(this);
        a11.a(this);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5506b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0541a) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(InterfaceC0541a interfaceC0541a) {
        this.f5506b.add(interfaceC0541a);
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
    }
}
