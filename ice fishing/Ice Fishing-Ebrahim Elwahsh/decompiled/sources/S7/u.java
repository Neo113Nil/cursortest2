package S7;

import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class u implements R7.c {

    /* renamed from: n, reason: collision with root package name */
    public final Q7.r f3024n;

    public u(Q7.r rVar) {
        this.f3024n = rVar;
    }

    @Override // R7.c
    public final Object a(Object obj, InterfaceC5133d interfaceC5133d) {
        Object b9 = this.f3024n.b(obj, interfaceC5133d);
        return b9 == EnumC5179a.f41704n ? b9 : q7.v.f40183a;
    }
}
