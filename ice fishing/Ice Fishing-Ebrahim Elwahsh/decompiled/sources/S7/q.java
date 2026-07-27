package S7;

import O7.AbstractC0399y;
import q7.AbstractC4940i;
import v7.C5139j;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class q extends AbstractC5219c implements R7.c {

    /* renamed from: n, reason: collision with root package name */
    public final R7.c f3016n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5138i f3017u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3018v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC5138i f3019w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC5133d f3020x;

    public q(R7.c cVar, InterfaceC5138i interfaceC5138i) {
        super(m.f3012n, C5139j.f41372n);
        this.f3016n = cVar;
        this.f3017u = interfaceC5138i;
        this.f3018v = ((Number) interfaceC5138i.m(0, p.f3015n)).intValue();
    }

    @Override // R7.c
    public final Object a(Object obj, InterfaceC5133d interfaceC5133d) {
        try {
            Object b9 = b(interfaceC5133d, obj);
            return b9 == EnumC5179a.f41704n ? b9 : q7.v.f40183a;
        } catch (Throwable th) {
            this.f3019w = new l(th, interfaceC5133d.getContext());
            throw th;
        }
    }

    public final Object b(InterfaceC5133d interfaceC5133d, Object obj) {
        InterfaceC5138i context = interfaceC5133d.getContext();
        AbstractC0399y.g(context);
        InterfaceC5138i interfaceC5138i = this.f3019w;
        if (interfaceC5138i != context) {
            if (interfaceC5138i instanceof l) {
                throw new IllegalStateException(M7.k.y("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((l) interfaceC5138i).f3010n + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.m(0, new t(this))).intValue() != this.f3018v) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3017u + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3019w = context;
        }
        this.f3020x = interfaceC5133d;
        r rVar = s.f3022a;
        R7.c cVar = this.f3016n;
        kotlin.jvm.internal.h.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        rVar.getClass();
        Object a9 = cVar.a(obj, this);
        if (!kotlin.jvm.internal.h.a(a9, EnumC5179a.f41704n)) {
            this.f3020x = null;
        }
        return a9;
    }

    @Override // x7.AbstractC5217a, x7.d
    public final x7.d getCallerFrame() {
        InterfaceC5133d interfaceC5133d = this.f3020x;
        if (interfaceC5133d instanceof x7.d) {
            return (x7.d) interfaceC5133d;
        }
        return null;
    }

    @Override // x7.AbstractC5219c, v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        InterfaceC5138i interfaceC5138i = this.f3019w;
        return interfaceC5138i == null ? C5139j.f41372n : interfaceC5138i;
    }

    @Override // x7.AbstractC5217a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        Throwable a9 = AbstractC4940i.a(obj);
        if (a9 != null) {
            this.f3019w = new l(a9, getContext());
        }
        InterfaceC5133d interfaceC5133d = this.f3020x;
        if (interfaceC5133d != null) {
            interfaceC5133d.resumeWith(obj);
        }
        return EnumC5179a.f41704n;
    }
}
