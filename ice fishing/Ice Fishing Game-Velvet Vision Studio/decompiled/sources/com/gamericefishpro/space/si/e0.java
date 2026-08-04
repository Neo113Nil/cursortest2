package com.gamericefishpro.space.si;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static final com.gamericefishpro.space.d6.a a = new com.gamericefishpro.space.d6.a("NO_VALUE", 2);
    public static final com.gamericefishpro.space.d6.a b = new com.gamericefishpro.space.d6.a("NONE", 2);
    public static final com.gamericefishpro.space.d6.a c = new com.gamericefishpro.space.d6.a("PENDING", 2);

    public static final d0 a(int i, int i2, com.gamericefishpro.space.ri.a aVar) {
        if (i < 0) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "replay cannot be negative, but was ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i2 <= 0 && aVar != com.gamericefishpro.space.ri.a.d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new d0(i, i3, aVar);
    }

    public static final n0 b(Object obj) {
        if (obj == null) {
            obj = com.gamericefishpro.space.ti.c.b;
        }
        return new n0(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(p0 p0Var, com.gamericefishpro.space.di.c cVar, Throwable th, com.gamericefishpro.space.vh.c cVar2) {
        h hVar;
        if (cVar2 instanceof h) {
            hVar = (h) cVar2;
            int i = hVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.i = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(cVar2);
            }
        } else {
            hVar = new h(cVar2);
        }
        Object obj = hVar.e;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = hVar.i;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                hVar.d = th;
                hVar.i = 1;
                if (cVar.a(p0Var, th, hVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = hVar.d;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                com.gamericefishpro.space.oh.c.a(th2, th);
            }
            throw th2;
        }
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static e e(e eVar, int i) {
        com.gamericefishpro.space.ri.a aVar = com.gamericefishpro.space.ri.a.d;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            aVar = com.gamericefishpro.space.ri.a.e;
            i = 0;
        }
        return eVar instanceof com.gamericefishpro.space.ti.q ? ((com.gamericefishpro.space.ti.q) eVar).b(kotlin.coroutines.g.d, i, aVar) : new com.gamericefishpro.space.ti.g(eVar, kotlin.coroutines.g.d, i, aVar);
    }

    public static final e f(e eVar) {
        return ((eVar instanceof l0) || (eVar instanceof d)) ? eVar : new d(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r2.d(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(f fVar, com.gamericefishpro.space.ri.s sVar, boolean z, com.gamericefishpro.space.th.a aVar) throws Throwable {
        g gVar;
        com.gamericefishpro.space.ri.b it;
        com.gamericefishpro.space.ri.b bVar;
        f fVar2;
        Object objB;
        if (aVar instanceof g) {
            gVar = (g) aVar;
            int i = gVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.y = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(aVar);
            }
        } else {
            gVar = new g(aVar);
        }
        Object obj = gVar.w;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = gVar.y;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                if (fVar instanceof p0) {
                    throw ((p0) fVar).d;
                }
                it = sVar.iterator();
                gVar.d = fVar;
                gVar.e = sVar;
                gVar.i = it;
                gVar.v = z;
                gVar.y = 1;
                objB = it.b(gVar);
                if (objB == aVar2) {
                    fVar2 = fVar;
                    bVar = it;
                    obj = objB;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z) {
                            sVar.c(null);
                        }
                        return Unit.a;
                    }
                    Object objC = bVar.c();
                    gVar.d = fVar2;
                    gVar.e = sVar;
                    gVar.i = bVar;
                    gVar.v = z;
                    gVar.y = 2;
                }
                return aVar2;
            }
            if (i2 == 1) {
                z = gVar.v;
                bVar = gVar.i;
                sVar = gVar.e;
                fVar2 = gVar.d;
                com.gamericefishpro.space.wa.b.P(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        sVar.c(null);
                    }
                    return Unit.a;
                }
                Object objC2 = bVar.c();
                gVar.d = fVar2;
                gVar.e = sVar;
                gVar.i = bVar;
                gVar.v = z;
                gVar.y = 2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = gVar.v;
                bVar = gVar.i;
                sVar = gVar.e;
                fVar2 = gVar.d;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            it = bVar;
            fVar = fVar2;
            gVar.d = fVar;
            gVar.e = sVar;
            gVar.i = it;
            gVar.v = z;
            gVar.y = 1;
            objB = it.b(gVar);
            if (objB == aVar2) {
                fVar2 = fVar;
                bVar = it;
                obj = objB;
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        sVar.c(null);
                    }
                    return Unit.a;
                }
                Object objC3 = bVar.c();
                gVar.d = fVar2;
                gVar.e = sVar;
                gVar.i = bVar;
                gVar.v = z;
                gVar.y = 2;
            }
            return aVar2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    sVar.c(cancellationException);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object h(com.gamericefishpro.space.c7.e eVar, com.gamericefishpro.space.vh.c cVar) {
        u uVar;
        com.gamericefishpro.space.ei.a0 a0Var;
        com.gamericefishpro.space.ti.a e;
        s sVar;
        com.gamericefishpro.space.d6.a aVar = com.gamericefishpro.space.ti.c.b;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i = uVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.v = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(cVar);
            }
        } else {
            uVar = new u(cVar);
        }
        Object obj = uVar.i;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = uVar.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.ei.a0 a0Var2 = new com.gamericefishpro.space.ei.a0();
            a0Var2.d = aVar;
            s sVar2 = new s(a0Var2, 0);
            try {
                uVar.d = a0Var2;
                uVar.e = sVar2;
                uVar.v = 1;
                if (eVar.a(sVar2, uVar) == obj2) {
                    return obj2;
                }
                a0Var = a0Var2;
            } catch (com.gamericefishpro.space.ti.a e2) {
                a0Var = a0Var2;
                e = e2;
                sVar = sVar2;
                if (e.d == sVar) {
                    throw e;
                }
                com.gamericefishpro.space.pi.a0.j(uVar.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = uVar.e;
            a0Var = uVar.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (com.gamericefishpro.space.ti.a e3) {
                e = e3;
                if (e.d == sVar) {
                    throw e;
                }
                com.gamericefishpro.space.pi.a0.j(uVar.getContext());
            }
        }
        Object obj3 = a0Var.d;
        if (obj3 != aVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object i(e eVar, Function2 function2, com.gamericefishpro.space.vh.c cVar) {
        v vVar;
        com.gamericefishpro.space.ei.a0 a0Var;
        com.gamericefishpro.space.ti.a e;
        com.gamericefishpro.space.b0.n nVar;
        com.gamericefishpro.space.d6.a aVar = com.gamericefishpro.space.ti.c.b;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i = vVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.v = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(cVar);
            }
        } else {
            vVar = new v(cVar);
        }
        Object obj = vVar.i;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = vVar.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.ei.a0 a0Var2 = new com.gamericefishpro.space.ei.a0();
            a0Var2.d = aVar;
            com.gamericefishpro.space.b0.n nVar2 = new com.gamericefishpro.space.b0.n(5, function2, a0Var2);
            try {
                vVar.d = a0Var2;
                vVar.e = nVar2;
                vVar.v = 1;
                if (eVar.a(nVar2, vVar) == obj2) {
                    return obj2;
                }
                a0Var = a0Var2;
            } catch (com.gamericefishpro.space.ti.a e2) {
                a0Var = a0Var2;
                e = e2;
                nVar = nVar2;
                if (e.d == nVar) {
                    throw e;
                }
                com.gamericefishpro.space.pi.a0.j(vVar.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = vVar.e;
            a0Var = vVar.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (com.gamericefishpro.space.ti.a e3) {
                e = e3;
                if (e.d == nVar) {
                    throw e;
                }
                com.gamericefishpro.space.pi.a0.j(vVar.getContext());
            }
        }
        Object obj3 = a0Var.d;
        if (obj3 != aVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(e eVar, com.gamericefishpro.space.vh.c cVar) {
        w wVar;
        com.gamericefishpro.space.ei.a0 a0Var;
        com.gamericefishpro.space.ti.a e;
        s sVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.v = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(cVar);
            }
        } else {
            wVar = new w(cVar);
        }
        Object obj = wVar.i;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = wVar.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.ei.a0 a0Var2 = new com.gamericefishpro.space.ei.a0();
            s sVar2 = new s(a0Var2, 1);
            try {
                wVar.d = a0Var2;
                wVar.e = sVar2;
                wVar.v = 1;
                if (eVar.a(sVar2, wVar) == obj2) {
                    return obj2;
                }
                a0Var = a0Var2;
            } catch (com.gamericefishpro.space.ti.a e2) {
                a0Var = a0Var2;
                e = e2;
                sVar = sVar2;
                if (e.d == sVar) {
                    throw e;
                }
                com.gamericefishpro.space.pi.a0.j(wVar.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = wVar.e;
            a0Var = wVar.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (com.gamericefishpro.space.ti.a e3) {
                e = e3;
                if (e.d == sVar) {
                    throw e;
                }
                com.gamericefishpro.space.pi.a0.j(wVar.getContext());
            }
        }
        return a0Var.d;
    }

    public static final void k(m mVar, com.gamericefishpro.space.e5.a aVar) {
        com.gamericefishpro.space.pi.a0.u(aVar, null, new com.gamericefishpro.space.b2.e0(mVar, null, 12), 3);
    }

    public static final a0 l(com.gamericefishpro.space.l4.p pVar, com.gamericefishpro.space.ui.c cVar, k0 k0Var, Float f) {
        com.gamericefishpro.space.ri.i.t.getClass();
        com.gamericefishpro.space.ri.h hVar = com.gamericefishpro.space.ri.h.a;
        com.gamericefishpro.space.ri.a aVar = com.gamericefishpro.space.ri.a.d;
        com.gamericefishpro.space.u6.e eVar = new com.gamericefishpro.space.u6.e(12, pVar, kotlin.coroutines.g.d);
        n0 n0VarB = b(f);
        com.gamericefishpro.space.pi.a0.t(cVar, (CoroutineContext) eVar.c, k0Var.equals(h0.a) ? com.gamericefishpro.space.pi.y.d : com.gamericefishpro.space.pi.y.v, new com.gamericefishpro.space.g5.y(k0Var, (e) eVar.b, n0VarB, f, null, 4));
        return new a0(n0VarB);
    }
}
