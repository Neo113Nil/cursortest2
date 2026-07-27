package a8;

import java.util.Iterator;

/* renamed from: a8.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0446m extends AbstractC0434a {

    /* renamed from: a, reason: collision with root package name */
    public final X7.a f4491a;

    public AbstractC0446m(X7.a aVar) {
        this.f4491a = aVar;
    }

    @Override // X7.a
    public void a(c8.r rVar, Object obj) {
        int g9 = g(obj);
        Y7.e descriptor = c();
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        c8.r a9 = rVar.a(descriptor);
        Iterator f6 = f(obj);
        for (int i = 0; i < g9; i++) {
            a9.l(c(), i, this.f4491a, f6.next());
        }
        a9.p(descriptor);
    }

    @Override // a8.AbstractC0434a
    public void i(Z7.a aVar, int i, Object obj) {
        l(i, obj, aVar.i(c(), i, this.f4491a, null));
    }

    public abstract void l(int i, Object obj, Object obj2);
}
