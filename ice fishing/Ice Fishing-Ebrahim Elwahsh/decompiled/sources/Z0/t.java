package Z0;

import a1.InterfaceC0417a;
import f1.AbstractC4490a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements c, InterfaceC0417a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4193a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4194b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f4195c;

    /* renamed from: d, reason: collision with root package name */
    public final a1.i f4196d;

    /* renamed from: e, reason: collision with root package name */
    public final a1.i f4197e;

    /* renamed from: f, reason: collision with root package name */
    public final a1.i f4198f;

    public t(AbstractC4490a abstractC4490a, e1.p pVar) {
        pVar.getClass();
        this.f4193a = pVar.f37314e;
        this.f4195c = pVar.f37310a;
        a1.i a9 = pVar.f37311b.a();
        this.f4196d = a9;
        a1.i a10 = pVar.f37312c.a();
        this.f4197e = a10;
        a1.i a11 = pVar.f37313d.a();
        this.f4198f = a11;
        abstractC4490a.e(a9);
        abstractC4490a.e(a10);
        abstractC4490a.e(a11);
        a9.a(this);
        a10.a(this);
        a11.a(this);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4194b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0417a) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(InterfaceC0417a interfaceC0417a) {
        this.f4194b.add(interfaceC0417a);
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
    }
}
