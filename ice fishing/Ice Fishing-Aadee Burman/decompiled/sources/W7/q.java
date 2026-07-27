package W7;

import S7.AbstractC0406y;
import u7.AbstractC5091i;
import z7.C5273j;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class q extends B7.c implements V7.c {

    /* renamed from: n, reason: collision with root package name */
    public final V7.c f3450n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5272i f3451u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3452v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC5272i f3453w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC5267d f3454x;

    public q(V7.c cVar, InterfaceC5272i interfaceC5272i) {
        super(m.f3446n, C5273j.f42269n);
        this.f3450n = cVar;
        this.f3451u = interfaceC5272i;
        this.f3452v = ((Number) interfaceC5272i.l(0, p.f3449n)).intValue();
    }

    @Override // V7.c
    public final Object a(Object obj, InterfaceC5267d interfaceC5267d) {
        try {
            Object b9 = b(interfaceC5267d, obj);
            return b9 == A7.a.f58n ? b9 : u7.v.f41350a;
        } catch (Throwable th) {
            this.f3453w = new l(th, interfaceC5267d.getContext());
            throw th;
        }
    }

    public final Object b(InterfaceC5267d interfaceC5267d, Object obj) {
        InterfaceC5272i context = interfaceC5267d.getContext();
        AbstractC0406y.g(context);
        InterfaceC5272i interfaceC5272i = this.f3453w;
        if (interfaceC5272i != context) {
            if (interfaceC5272i instanceof l) {
                throw new IllegalStateException(Q7.k.H("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((l) interfaceC5272i).f3444n + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.l(0, new t(this))).intValue() != this.f3452v) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3451u + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3453w = context;
        }
        this.f3454x = interfaceC5267d;
        r rVar = s.f3456a;
        V7.c cVar = this.f3450n;
        kotlin.jvm.internal.h.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        rVar.getClass();
        Object a9 = cVar.a(obj, this);
        if (!kotlin.jvm.internal.h.a(a9, A7.a.f58n)) {
            this.f3454x = null;
        }
        return a9;
    }

    @Override // B7.a, B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5267d interfaceC5267d = this.f3454x;
        if (interfaceC5267d instanceof B7.d) {
            return (B7.d) interfaceC5267d;
        }
        return null;
    }

    @Override // B7.c, z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        InterfaceC5272i interfaceC5272i = this.f3453w;
        return interfaceC5272i == null ? C5273j.f42269n : interfaceC5272i;
    }

    @Override // B7.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        Throwable a9 = AbstractC5091i.a(obj);
        if (a9 != null) {
            this.f3453w = new l(a9, getContext());
        }
        InterfaceC5267d interfaceC5267d = this.f3454x;
        if (interfaceC5267d != null) {
            interfaceC5267d.resumeWith(obj);
        }
        return A7.a.f58n;
    }
}
