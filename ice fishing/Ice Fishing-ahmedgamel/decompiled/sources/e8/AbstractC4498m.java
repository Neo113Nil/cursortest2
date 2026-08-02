package e8;

import b8.InterfaceC0537a;
import java.util.Iterator;

/* renamed from: e8.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4498m extends AbstractC4486a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0537a f37382a;

    public AbstractC4498m(InterfaceC0537a interfaceC0537a) {
        this.f37382a = interfaceC0537a;
    }

    @Override // b8.InterfaceC0537a
    public void a(g8.q qVar, Object obj) {
        int g9 = g(obj);
        c8.e descriptor = c();
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        g8.q a9 = qVar.a(descriptor);
        Iterator f2 = f(obj);
        for (int i = 0; i < g9; i++) {
            a9.l(c(), i, this.f37382a, f2.next());
        }
        a9.p(descriptor);
    }

    @Override // e8.AbstractC4486a
    public void i(d8.a aVar, int i, Object obj) {
        l(i, obj, aVar.i(c(), i, this.f37382a, null));
    }

    public abstract void l(int i, Object obj, Object obj2);
}
