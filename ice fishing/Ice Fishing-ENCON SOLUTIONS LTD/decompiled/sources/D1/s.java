package D1;

import F.C0042s;
import F1.v;
import h1.C0239i;
import java.util.concurrent.CancellationException;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C.j f301a;

    /* renamed from: b, reason: collision with root package name */
    public static final C.j f302b;

    static {
        int i2 = 5;
        f301a = new C.j(i2, "NONE");
        f302b = new C.j(i2, "PENDING");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(u uVar, C0042s c0042s, Throwable th, AbstractC0991b abstractC0991b) {
        g gVar;
        int i2;
        try {
            if (abstractC0991b instanceof g) {
                gVar = (g) abstractC0991b;
                int i3 = gVar.f253f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.f253f = i3 - Integer.MIN_VALUE;
                    Object obj = gVar.f252e;
                    Object obj2 = EnumC0985a.f8194a;
                    i2 = gVar.f253f;
                    if (i2 != 0) {
                        R1.l.F(obj);
                        gVar.f251d = th;
                        gVar.f253f = 1;
                        if (c0042s.j(uVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f251d;
                        R1.l.F(obj);
                    }
                    return C0239i.f3393a;
                }
            }
            if (i2 != 0) {
            }
            return C0239i.f3393a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC1050a.a(th2, th);
            }
            throw th2;
        }
        gVar = new g(abstractC0991b);
        Object obj3 = gVar.f252e;
        Object obj22 = EnumC0985a.f8194a;
        i2 = gVar.f253f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:19:0x0072, B:21:0x007a, B:23:0x0080, B:25:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [C1.s] */
    /* JADX WARN: Type inference failed for: r9v6, types: [C1.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, C1.q qVar, boolean z2, AbstractC0991b abstractC0991b) {
        f fVar;
        int i2;
        C1.b bVar;
        C1.q qVar2;
        C1.b bVar2;
        e eVar2;
        C1.q qVar3;
        try {
            if (abstractC0991b instanceof f) {
                fVar = (f) abstractC0991b;
                int i3 = fVar.f250i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f250i = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.f249h;
                    EnumC0985a enumC0985a = EnumC0985a.f8194a;
                    i2 = fVar.f250i;
                    if (i2 != 0) {
                        R1.l.F(obj);
                        if (eVar instanceof u) {
                            throw ((u) eVar).f304a;
                        }
                        C1.c cVar = qVar.f195d;
                        cVar.getClass();
                        bVar = new C1.b(cVar);
                        qVar3 = qVar;
                        fVar.f245d = eVar;
                        fVar.f246e = qVar3;
                        fVar.f247f = bVar;
                        fVar.f248g = z2;
                        fVar.f250i = 1;
                        obj = bVar.b(fVar);
                        if (obj == enumC0985a) {
                        }
                    } else if (i2 == 1) {
                        z2 = fVar.f248g;
                        bVar2 = fVar.f247f;
                        ?? r9 = fVar.f246e;
                        eVar2 = fVar.f245d;
                        R1.l.F(obj);
                        qVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = fVar.f248g;
                        bVar2 = fVar.f247f;
                        ?? r92 = fVar.f246e;
                        eVar2 = fVar.f245d;
                        R1.l.F(obj);
                        C1.q qVar4 = r92;
                        e eVar3 = eVar2;
                        bVar = bVar2;
                        eVar = eVar3;
                        qVar3 = qVar4;
                        fVar.f245d = eVar;
                        fVar.f246e = qVar3;
                        fVar.f247f = bVar;
                        fVar.f248g = z2;
                        fVar.f250i = 1;
                        obj = bVar.b(fVar);
                        if (obj == enumC0985a) {
                            return enumC0985a;
                        }
                        C1.b bVar3 = bVar;
                        eVar2 = eVar;
                        bVar2 = bVar3;
                        qVar2 = qVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                qVar2.a(null);
                            }
                            return C0239i.f3393a;
                        }
                        Object obj2 = bVar2.f147a;
                        C.j jVar = C1.e.f177p;
                        if (obj2 == jVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f147a = jVar;
                        if (obj2 == C1.e.f173l) {
                            Throwable n2 = bVar2.f149c.n();
                            int i4 = v.f632a;
                            throw n2;
                        }
                        fVar.f245d = eVar2;
                        fVar.f246e = qVar2;
                        fVar.f247f = bVar2;
                        fVar.f248g = z2;
                        fVar.f250i = 2;
                        qVar4 = qVar2;
                        if (eVar2.a(obj2, fVar) == enumC0985a) {
                            return enumC0985a;
                        }
                        e eVar32 = eVar2;
                        bVar = bVar2;
                        eVar = eVar32;
                        qVar3 = qVar4;
                        fVar.f245d = eVar;
                        fVar.f246e = qVar3;
                        fVar.f247f = bVar;
                        fVar.f248g = z2;
                        fVar.f250i = 1;
                        obj = bVar.b(fVar);
                        if (obj == enumC0985a) {
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z2) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    qVar.a(cancellationException);
                }
                throw th2;
            }
        }
        fVar = new f(abstractC0991b);
        Object obj3 = fVar.f249h;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = fVar.f250i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, AbstractC0991b abstractC0991b) {
        p pVar;
        int i2;
        kotlin.jvm.internal.p pVar2;
        E1.a e2;
        o oVar;
        if (abstractC0991b instanceof p) {
            pVar = (p) abstractC0991b;
            int i3 = pVar.f290g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.f290g = i3 - Integer.MIN_VALUE;
                Object obj = pVar.f289f;
                Object obj2 = EnumC0985a.f8194a;
                i2 = pVar.f290g;
                if (i2 != 0) {
                    R1.l.F(obj);
                    kotlin.jvm.internal.p pVar3 = new kotlin.jvm.internal.p();
                    o oVar2 = new o(0, pVar3);
                    try {
                        pVar.f287d = pVar3;
                        pVar.f288e = oVar2;
                        pVar.f290g = 1;
                        if (dVar.r(oVar2, pVar) == obj2) {
                            return obj2;
                        }
                        pVar2 = pVar3;
                    } catch (E1.a e3) {
                        pVar2 = pVar3;
                        e2 = e3;
                        oVar = oVar2;
                        if (e2.f310a != oVar) {
                            throw e2;
                        }
                        return pVar2.f8076a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = pVar.f288e;
                    pVar2 = pVar.f287d;
                    try {
                        R1.l.F(obj);
                    } catch (E1.a e4) {
                        e2 = e4;
                        if (e2.f310a != oVar) {
                        }
                        return pVar2.f8076a;
                    }
                }
                return pVar2.f8076a;
            }
        }
        pVar = new p(abstractC0991b);
        Object obj3 = pVar.f289f;
        Object obj22 = EnumC0985a.f8194a;
        i2 = pVar.f290g;
        if (i2 != 0) {
        }
        return pVar2.f8076a;
    }
}
