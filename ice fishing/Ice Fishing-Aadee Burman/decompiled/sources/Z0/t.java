package Z0;

import a1.InterfaceC0424a;
import f1.AbstractC4498a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements c, InterfaceC0424a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4116a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4117b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f4118c;

    /* renamed from: d, reason: collision with root package name */
    public final a1.i f4119d;

    /* renamed from: e, reason: collision with root package name */
    public final a1.i f4120e;

    /* renamed from: f, reason: collision with root package name */
    public final a1.i f4121f;

    public t(AbstractC4498a abstractC4498a, e1.p pVar) {
        pVar.getClass();
        this.f4116a = pVar.f37183e;
        this.f4118c = pVar.f37179a;
        a1.i a9 = pVar.f37180b.a();
        this.f4119d = a9;
        a1.i a10 = pVar.f37181c.a();
        this.f4120e = a10;
        a1.i a11 = pVar.f37182d.a();
        this.f4121f = a11;
        abstractC4498a.d(a9);
        abstractC4498a.d(a10);
        abstractC4498a.d(a11);
        a9.a(this);
        a10.a(this);
        a11.a(this);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4117b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0424a) arrayList.get(i)).a();
            i++;
        }
    }

    public final void d(InterfaceC0424a interfaceC0424a) {
        this.f4117b.add(interfaceC0424a);
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
    }
}
