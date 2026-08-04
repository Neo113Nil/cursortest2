package com.gamericefishpro.space.pi;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final com.gamericefishpro.space.d6.a a;
    public static final com.gamericefishpro.space.d6.a b;
    public static final com.gamericefishpro.space.d6.a c;
    public static final com.gamericefishpro.space.d6.a d;
    public static final com.gamericefishpro.space.d6.a e;
    public static final com.gamericefishpro.space.d6.a f;
    public static final com.gamericefishpro.space.d6.a g;
    public static final com.gamericefishpro.space.d6.a h;
    public static final o0 i = new o0(false);
    public static final o0 j = new o0(true);

    static {
        int i2 = 2;
        a = new com.gamericefishpro.space.d6.a("RESUME_TOKEN", i2);
        b = new com.gamericefishpro.space.d6.a("REMOVED_TASK", i2);
        c = new com.gamericefishpro.space.d6.a("CLOSED_EMPTY", i2);
        d = new com.gamericefishpro.space.d6.a("COMPLETING_ALREADY", i2);
        e = new com.gamericefishpro.space.d6.a("COMPLETING_WAITING_CHILDREN", i2);
        f = new com.gamericefishpro.space.d6.a("COMPLETING_RETRY", i2);
        g = new com.gamericefishpro.space.d6.a("TOO_LATE_TO_CANCEL", i2);
        h = new com.gamericefishpro.space.d6.a("SEALED", i2);
    }

    public static final Object A(z1 z1Var, Function2 function2) throws Throwable {
        Object qVar;
        Object objX;
        q(z1Var, true, new n0(0, l(z1Var.v.getContext()).l(z1Var.w, z1Var, z1Var.i)));
        try {
            if (function2 instanceof com.gamericefishpro.space.vh.a) {
                com.gamericefishpro.space.ei.e0.c(2, function2);
                qVar = function2.invoke(z1Var, z1Var);
            } else {
                qVar = com.gamericefishpro.space.uh.f.c(function2, z1Var, z1Var);
            }
        } catch (Throwable th) {
            qVar = new q(th, false);
        }
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (qVar == aVar || (objX = z1Var.X(qVar)) == e) {
            return aVar;
        }
        if (objX instanceof q) {
            Throwable th2 = ((q) objX).a;
            if (!(th2 instanceof y1) || ((y1) th2).d != z1Var) {
                throw th2;
            }
            if (qVar instanceof q) {
                throw ((q) qVar).a;
            }
        } else {
            qVar = C(objX);
        }
        return qVar;
    }

    public static final String B(com.gamericefishpro.space.th.a aVar) {
        Object objQ;
        if (aVar instanceof com.gamericefishpro.space.ui.f) {
            return ((com.gamericefishpro.space.ui.f) aVar).toString();
        }
        try {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            objQ = aVar + '@' + m(aVar);
        } catch (Throwable th) {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            objQ = com.gamericefishpro.space.wa.b.q(th);
        }
        if (com.gamericefishpro.space.oh.p.a(objQ) != null) {
            objQ = aVar.getClass().getName() + '@' + m(aVar);
        }
        return (String) objQ;
    }

    public static final Object C(Object obj) {
        z0 z0Var;
        a1 a1Var = obj instanceof a1 ? (a1) obj : null;
        return (a1Var == null || (z0Var = a1Var.a) == null) ? obj : z0Var;
    }

    public static final Object D(CoroutineContext coroutineContext, Function2 function2, com.gamericefishpro.space.th.a frame) {
        Object objC;
        CoroutineContext context = frame.getContext();
        CoroutineContext coroutineContextO = !((Boolean) coroutineContext.w(Boolean.FALSE, new com.gamericefishpro.space.g7.a(5))).booleanValue() ? context.o(coroutineContext) : r.a(context, coroutineContext, false);
        j(coroutineContextO);
        if (coroutineContextO == context) {
            com.gamericefishpro.space.ui.p pVar = new com.gamericefishpro.space.ui.p(frame, coroutineContextO);
            objC = com.gamericefishpro.space.b9.a.F(pVar, pVar, function2);
        } else {
            com.gamericefishpro.space.th.b bVar = kotlin.coroutines.d.x;
            if (Intrinsics.a(coroutineContextO.j(bVar), context.j(bVar))) {
                c2 c2Var = new c2(frame, coroutineContextO);
                CoroutineContext coroutineContext2 = c2Var.i;
                Object objC2 = com.gamericefishpro.space.ui.t.c(coroutineContext2, null);
                try {
                    Object objF = com.gamericefishpro.space.b9.a.F(c2Var, c2Var, function2);
                    com.gamericefishpro.space.ui.t.a(coroutineContext2, objC2);
                    objC = objF;
                } catch (Throwable th) {
                    com.gamericefishpro.space.ui.t.a(coroutineContext2, objC2);
                    throw th;
                }
            } else {
                h0 h0Var = new h0(frame, coroutineContextO);
                com.gamericefishpro.space.a.a.E(function2, h0Var, h0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.w;
                while (true) {
                    int i2 = atomicIntegerFieldUpdater.get(h0Var);
                    if (i2 != 0) {
                        if (i2 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objC = C(l1.d.get(h0Var));
                        if (!(objC instanceof q)) {
                            break;
                        }
                        throw ((q) objC).a;
                    }
                    if (atomicIntegerFieldUpdater.compareAndSet(h0Var, 0, 1)) {
                        objC = com.gamericefishpro.space.uh.a.d;
                        break;
                    }
                }
            }
        }
        if (objC == com.gamericefishpro.space.uh.a.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objC;
    }

    public static final Object E(long j2, Function2 function2, com.gamericefishpro.space.vh.c frame) throws Throwable {
        if (j2 <= 0) {
            throw new y1("Timed out immediately", null);
        }
        Object objA = A(new z1(j2, frame), function2);
        if (objA == com.gamericefishpro.space.uh.a.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F(long j2, Function2 function2, com.gamericefishpro.space.th.a aVar) throws Throwable {
        a2 frame;
        com.gamericefishpro.space.ei.a0 a0Var;
        if (aVar instanceof a2) {
            frame = (a2) aVar;
            int i2 = frame.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                frame.i = i2 - Integer.MIN_VALUE;
            } else {
                frame = new a2(aVar);
            }
        } else {
            frame = new a2(aVar);
        }
        Object obj = frame.e;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = frame.i;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (j2 <= 0) {
                return null;
            }
            com.gamericefishpro.space.ei.a0 a0Var2 = new com.gamericefishpro.space.ei.a0();
            try {
                frame.d = a0Var2;
                frame.i = 1;
                z1 z1Var = new z1(j2, frame);
                a0Var2.d = z1Var;
                Object objA = A(z1Var, function2);
                if (objA == aVar2) {
                    try {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    } catch (y1 e2) {
                        e = e2;
                        a0Var = a0Var2;
                        if (e.d == a0Var.d) {
                            return null;
                        }
                        throw e;
                    }
                }
                return objA == aVar2 ? aVar2 : objA;
            } catch (y1 e3) {
                e = e3;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = frame.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                return obj;
            } catch (y1 e4) {
                e = e4;
            }
        }
        if (e.d == a0Var.d) {
            return null;
        }
        throw e;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object G(com.gamericefishpro.space.vh.c frame) {
        Object obj;
        CoroutineContext context = frame.getContext();
        j(context);
        com.gamericefishpro.space.th.a aVarB = com.gamericefishpro.space.uh.f.b(frame);
        com.gamericefishpro.space.ui.f fVar = aVarB instanceof com.gamericefishpro.space.ui.f ? (com.gamericefishpro.space.ui.f) aVarB : null;
        if (fVar == null) {
            obj = Unit.a;
        } else {
            t tVar = fVar.v;
            if (com.gamericefishpro.space.ui.a.i(tVar, context)) {
                fVar.y = Unit.a;
                fVar.i = 1;
                tVar.Q(context, fVar);
            } else {
                f2 f2Var = new f2(f2.i);
                CoroutineContext coroutineContextO = context.o(f2Var);
                Unit unit = Unit.a;
                fVar.y = unit;
                fVar.i = 1;
                tVar.Q(coroutineContextO, fVar);
                if (f2Var.e) {
                    u0 u0VarA = w1.a();
                    com.gamericefishpro.space.ph.r rVar = u0VarA.w;
                    if (rVar != null ? rVar.isEmpty() : true) {
                        obj = Unit.a;
                    } else {
                        if (u0VarA.i >= 4294967296L) {
                            fVar.y = unit;
                            fVar.i = 1;
                            u0VarA.U(fVar);
                            obj = com.gamericefishpro.space.uh.a.d;
                        } else {
                            u0VarA.W(true);
                            try {
                                fVar.run();
                                do {
                                } while (u0VarA.Y());
                            } catch (Throwable th) {
                                try {
                                    fVar.g(th);
                                } catch (Throwable th2) {
                                    u0VarA.T(true);
                                    throw th2;
                                }
                            }
                            u0VarA.T(true);
                            obj = Unit.a;
                        }
                    }
                }
            }
            obj = com.gamericefishpro.space.uh.a.d;
        }
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (obj == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return obj == aVar ? obj : Unit.a;
    }

    public static n a() {
        n nVar = new n(true);
        nVar.S(null);
        return nVar;
    }

    public static final com.gamericefishpro.space.ui.c b(CoroutineContext coroutineContext) {
        if (coroutineContext.j(u.e) == null) {
            coroutineContext = coroutineContext.o(c());
        }
        return new com.gamericefishpro.space.ui.c(coroutineContext);
    }

    public static f1 c() {
        return new f1(null);
    }

    public static u1 d() {
        return new u1(null);
    }

    public static e0 e(x xVar, CoroutineContext coroutineContext, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.d;
        }
        y yVar = y.d;
        CoroutineContext coroutineContextB = r.b(xVar, coroutineContext);
        y yVar2 = y.d;
        e0 e0Var = new e0(coroutineContextB, true);
        e0Var.l0(yVar, e0Var, function2);
        return e0Var;
    }

    public static final void f(x xVar, com.gamericefishpro.space.b2.q qVar) {
        d1 d1Var = (d1) xVar.l().j(u.e);
        if (d1Var != null) {
            d1Var.c(qVar);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + xVar).toString());
        }
    }

    public static final void g(CoroutineContext coroutineContext, CancellationException cancellationException) {
        d1 d1Var = (d1) coroutineContext.j(u.e);
        if (d1Var != null) {
            d1Var.c(cancellationException);
        }
    }

    public static final Object h(Function2 function2, com.gamericefishpro.space.th.a frame) {
        com.gamericefishpro.space.ui.p pVar = new com.gamericefishpro.space.ui.p(frame, frame.getContext());
        Object objF = com.gamericefishpro.space.b9.a.F(pVar, pVar, function2);
        if (objF == com.gamericefishpro.space.uh.a.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objF;
    }

    public static final Object i(long j2, com.gamericefishpro.space.th.a frame) {
        if (j2 <= 0) {
            return Unit.a;
        }
        h hVar = new h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        if (j2 < Long.MAX_VALUE) {
            l(hVar.w).C(j2, hVar);
        }
        Object objR = hVar.r();
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.a;
    }

    public static final void j(CoroutineContext coroutineContext) {
        d1 d1Var = (d1) coroutineContext.j(u.e);
        if (d1Var != null && !d1Var.b()) {
            throw d1Var.t();
        }
    }

    public static final t k(Executor executor) {
        return new w0(executor);
    }

    public static final f0 l(CoroutineContext coroutineContext) {
        CoroutineContext.Element elementJ = coroutineContext.j(kotlin.coroutines.d.x);
        f0 f0Var = elementJ instanceof f0 ? (f0) elementJ : null;
        return f0Var == null ? c0.a : f0Var;
    }

    public static final String m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final d1 n(CoroutineContext coroutineContext) {
        d1 d1Var = (d1) coroutineContext.j(u.e);
        if (d1Var != null) {
            return d1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final h o(com.gamericefishpro.space.th.a aVar) {
        h hVar;
        h hVar2;
        if (!(aVar instanceof com.gamericefishpro.space.ui.f)) {
            return new h(1, aVar);
        }
        com.gamericefishpro.space.ui.f fVar = (com.gamericefishpro.space.ui.f) aVar;
        com.gamericefishpro.space.d6.a aVar2 = com.gamericefishpro.space.ui.a.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = com.gamericefishpro.space.ui.f.A;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            hVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, aVar2);
                hVar2 = null;
                break;
            }
            if (obj instanceof h) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, aVar2)) {
                        hVar2 = (h) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == obj);
            } else if (obj != aVar2 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (hVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.z;
            Object obj2 = atomicReferenceFieldUpdater2.get(hVar2);
            if (!(obj2 instanceof p) || ((p) obj2).d == null) {
                h.y.set(hVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hVar2, b.a);
                hVar = hVar2;
            } else {
                hVar2.n();
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new h(2, aVar);
    }

    public static final void p(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof g0) {
            th = ((g0) th).d;
        }
        try {
            v vVar = (v) coroutineContext.j(u.d);
            if (vVar != null) {
                vVar.N(th, coroutineContext);
            } else {
                com.gamericefishpro.space.ui.a.d(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                com.gamericefishpro.space.oh.c.a(runtimeException, th);
                th = runtimeException;
            }
            com.gamericefishpro.space.ui.a.d(th, coroutineContext);
        }
    }

    public static final m0 q(d1 d1Var, boolean z, h1 h1Var) {
        if (d1Var instanceof l1) {
            return ((l1) d1Var).T(z, h1Var);
        }
        return d1Var.J(h1Var.k(), z, new g1(1, h1Var, h1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean r(x xVar) {
        d1 d1Var = (d1) xVar.l().j(u.e);
        if (d1Var != null) {
            return d1Var.b();
        }
        return true;
    }

    public static final boolean s(CoroutineContext coroutineContext) {
        d1 d1Var = (d1) coroutineContext.j(u.e);
        if (d1Var != null) {
            return d1Var.b();
        }
        return true;
    }

    public static final s1 t(x xVar, CoroutineContext coroutineContext, y yVar, Function2 function2) {
        CoroutineContext coroutineContextB = r.b(xVar, coroutineContext);
        yVar.getClass();
        s1 m1Var = yVar == y.e ? new m1(coroutineContextB, function2) : new s1(coroutineContextB, true);
        m1Var.l0(yVar, m1Var, function2);
        return m1Var;
    }

    public static /* synthetic */ s1 u(x xVar, CoroutineContext coroutineContext, Function2 function2, int i2) {
        y yVar = y.v;
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.d;
        }
        if ((i2 & 2) != 0) {
            yVar = y.d;
        }
        return t(xVar, coroutineContext, yVar, function2);
    }

    public static final w0 v(String str) {
        return new w0(Executors.newScheduledThreadPool(1, new x1(str, new AtomicInteger())));
    }

    public static final Object w(Object obj) {
        if (obj instanceof q) {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            return com.gamericefishpro.space.wa.b.q(((q) obj).a);
        }
        com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
        return obj;
    }

    public static final void x(h hVar, com.gamericefishpro.space.th.a aVar, boolean z) {
        Object objE;
        Object obj = h.z.get(hVar);
        Throwable thD = hVar.d(obj);
        if (thD != null) {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            objE = com.gamericefishpro.space.wa.b.q(thD);
        } else {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            objE = hVar.e(obj);
        }
        if (!z) {
            aVar.resumeWith(objE);
            return;
        }
        Intrinsics.c(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        com.gamericefishpro.space.ui.f fVar = (com.gamericefishpro.space.ui.f) aVar;
        com.gamericefishpro.space.vh.c cVar = fVar.w;
        Object obj2 = fVar.z;
        CoroutineContext context = cVar.getContext();
        Object objC = com.gamericefishpro.space.ui.t.c(context, obj2);
        c2 c2VarC = objC != com.gamericefishpro.space.ui.t.a ? r.c(cVar, context, objC) : null;
        try {
            cVar.resumeWith(objE);
            Unit unit = Unit.a;
        } finally {
            if (c2VarC == null || c2VarC.n0()) {
                com.gamericefishpro.space.ui.t.a(context, objC);
            }
        }
    }

    public static final Object y(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        u0 u0VarA;
        CoroutineContext coroutineContextA;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.f fVar = kotlin.coroutines.d.x;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.j(fVar);
        if (dVar == null) {
            u0VarA = w1.a();
            coroutineContextA = r.a(kotlin.coroutines.g.d, coroutineContext.o(u0VarA), true);
            com.gamericefishpro.space.wi.e eVar = k0.a;
            if (coroutineContextA != eVar && coroutineContextA.j(fVar) == null) {
                coroutineContextA = coroutineContextA.o(eVar);
            }
        } else {
            if (dVar instanceof u0) {
            }
            u0VarA = (u0) w1.a.get();
            coroutineContextA = r.a(kotlin.coroutines.g.d, coroutineContext, true);
            com.gamericefishpro.space.wi.e eVar2 = k0.a;
            if (coroutineContextA != eVar2 && coroutineContextA.j(fVar) == null) {
                coroutineContextA = coroutineContextA.o(eVar2);
            }
        }
        c cVar = new c(coroutineContextA, threadCurrentThread, u0VarA);
        cVar.l0(y.d, cVar, function2);
        u0 u0Var = cVar.w;
        if (u0Var != null) {
            int i2 = u0.y;
            u0Var.W(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jX = u0Var != null ? u0Var.X() : Long.MAX_VALUE;
                if (cVar.U()) {
                    if (u0Var != null) {
                        int i3 = u0.y;
                        u0Var.T(false);
                    }
                    Object objC = C(l1.d.get(cVar));
                    q qVar = objC instanceof q ? (q) objC : null;
                    if (qVar == null) {
                        return objC;
                    }
                    throw qVar.a;
                }
                LockSupport.parkNanos(cVar, jX);
            } catch (Throwable th) {
                if (u0Var != null) {
                    int i4 = u0.y;
                    u0Var.T(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        cVar.s(interruptedException);
        throw interruptedException;
    }
}
