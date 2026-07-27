package e8;

import b8.InterfaceC0529a;
import java.util.Iterator;

/* renamed from: e8.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4481m extends AbstractC4469a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0529a f37306a;

    public AbstractC4481m(InterfaceC0529a interfaceC0529a) {
        this.f37306a = interfaceC0529a;
    }

    @Override // b8.InterfaceC0529a
    public void a(g8.q qVar, Object obj) {
        int g4 = g(obj);
        c8.e descriptor = c();
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        g8.q a9 = qVar.a(descriptor);
        Iterator f3 = f(obj);
        for (int i = 0; i < g4; i++) {
            a9.l(c(), i, this.f37306a, f3.next());
        }
        a9.p(descriptor);
    }

    @Override // e8.AbstractC4469a
    public void i(d8.a aVar, int i, Object obj) {
        l(i, obj, aVar.i(c(), i, this.f37306a, null));
    }

    public abstract void l(int i, Object obj, Object obj2);
}
