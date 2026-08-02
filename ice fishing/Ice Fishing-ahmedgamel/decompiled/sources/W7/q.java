package W7;

import S7.AbstractC0410y;
import u7.AbstractC5083i;
import z7.C5246j;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class q extends B7.c implements V7.c {

    /* renamed from: n, reason: collision with root package name */
    public final V7.c f3612n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5245i f3613u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3614v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC5245i f3615w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC5240d f3616x;

    public q(V7.c cVar, InterfaceC5245i interfaceC5245i) {
        super(m.f3608n, C5246j.f42241n);
        this.f3612n = cVar;
        this.f3613u = interfaceC5245i;
        this.f3614v = ((Number) interfaceC5245i.l(0, p.f3611n)).intValue();
    }

    @Override // V7.c
    public final Object a(Object obj, InterfaceC5240d interfaceC5240d) {
        try {
            Object b9 = b(interfaceC5240d, obj);
            return b9 == A7.a.f215n ? b9 : u7.v.f41073a;
        } catch (Throwable th) {
            this.f3615w = new l(th, interfaceC5240d.getContext());
            throw th;
        }
    }

    public final Object b(InterfaceC5240d interfaceC5240d, Object obj) {
        InterfaceC5245i context = interfaceC5240d.getContext();
        AbstractC0410y.g(context);
        InterfaceC5245i interfaceC5245i = this.f3615w;
        if (interfaceC5245i != context) {
            if (interfaceC5245i instanceof l) {
                throw new IllegalStateException(Q7.k.X("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((l) interfaceC5245i).f3606n + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.l(0, new t(this))).intValue() != this.f3614v) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3613u + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3615w = context;
        }
        this.f3616x = interfaceC5240d;
        r rVar = s.f3618a;
        V7.c cVar = this.f3612n;
        kotlin.jvm.internal.h.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        rVar.getClass();
        Object a9 = cVar.a(obj, this);
        if (!kotlin.jvm.internal.h.a(a9, A7.a.f215n)) {
            this.f3616x = null;
        }
        return a9;
    }

    @Override // B7.a, B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5240d interfaceC5240d = this.f3616x;
        if (interfaceC5240d instanceof B7.d) {
            return (B7.d) interfaceC5240d;
        }
        return null;
    }

    @Override // B7.c, z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        InterfaceC5245i interfaceC5245i = this.f3615w;
        return interfaceC5245i == null ? C5246j.f42241n : interfaceC5245i;
    }

    @Override // B7.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        Throwable a9 = AbstractC5083i.a(obj);
        if (a9 != null) {
            this.f3615w = new l(a9, getContext());
        }
        InterfaceC5240d interfaceC5240d = this.f3616x;
        if (interfaceC5240d != null) {
            interfaceC5240d.resumeWith(obj);
        }
        return A7.a.f215n;
    }
}
