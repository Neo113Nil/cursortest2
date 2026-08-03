package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends hc.c implements bd.f {

    /* renamed from: g, reason: collision with root package name */
    public final bd.f f1392g;

    /* renamed from: h, reason: collision with root package name */
    public final fc.i f1393h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1394i;

    /* renamed from: j, reason: collision with root package name */
    public fc.i f1395j;

    /* renamed from: k, reason: collision with root package name */
    public fc.d f1396k;

    public w(bd.f fVar, fc.i iVar) {
        super(t.f1389g, fc.j.f2348g);
        this.f1392g = fVar;
        this.f1393h = iVar;
        this.f1394i = ((Number) iVar.i(0, v.f1391g)).intValue();
    }

    @Override // bd.f
    public final Object a(Object obj, fc.d dVar) {
        try {
            Object f10 = f(dVar, obj);
            return f10 == gc.a.f2559g ? f10 : ac.o.f277a;
        } catch (Throwable th) {
            this.f1395j = new q(dVar.getContext(), th);
            throw th;
        }
    }

    public final Object f(fc.d dVar, Object obj) {
        fc.i context = dVar.getContext();
        yc.a0.g(context);
        fc.i iVar = this.f1395j;
        if (iVar != context) {
            if (iVar instanceof q) {
                throw new IllegalStateException(xc.c.m("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) iVar).f1387g + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.i(0, new a1.g(1, this))).intValue() != this.f1394i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1393h + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f1395j = context;
        }
        this.f1396k = dVar;
        oc.f fVar = y.f1398a;
        bd.f fVar2 = this.f1392g;
        pc.j.c(fVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b2 = fVar.b(fVar2, obj, this);
        if (!pc.j.a(b2, gc.a.f2559g)) {
            this.f1396k = null;
        }
        return b2;
    }

    @Override // hc.a, hc.d
    public final hc.d getCallerFrame() {
        fc.d dVar = this.f1396k;
        if (dVar instanceof hc.d) {
            return (hc.d) dVar;
        }
        return null;
    }

    @Override // hc.c, fc.d
    public final fc.i getContext() {
        fc.i iVar = this.f1395j;
        return iVar == null ? fc.j.f2348g : iVar;
    }

    @Override // hc.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        Throwable a6 = ac.l.a(obj);
        if (a6 != null) {
            this.f1395j = new q(getContext(), a6);
        }
        fc.d dVar = this.f1396k;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return gc.a.f2559g;
    }
}
