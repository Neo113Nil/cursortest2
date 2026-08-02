package com.yandex.plus.experiments.api.cache;

import defpackage.cg6;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.ssa;
import defpackage.xq0;
import defpackage.yd5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public abstract class c {
    public final com.yandex.plus.core.android.extensions.c a;
    public final long b;

    public c(com.yandex.plus.core.android.extensions.c cVar) {
        msa msaVar = nsa.b;
        long M = yd5.M(24, ssa.HOURS);
        cVar.getClass();
        this.a = cVar;
        this.b = M;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(c cVar, cg6 cg6Var) {
        a aVar;
        int i;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                Object obj2 = nm6.a;
                i = aVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    f fVar = new f(null, null, null, null, nsa.o(nsa.n(cVar.a.a(), cVar.b), yd5.M(15, ssa.MINUTES)));
                    aVar.j = fVar;
                    aVar.m = 1;
                    return cVar.g(fVar, aVar) == obj2 ? obj2 : fVar;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f fVar2 = aVar.j;
                qgg.h0(obj);
                return fVar2;
            }
        }
        aVar = new a(cVar, cg6Var);
        Object obj3 = aVar.k;
        Object obj22 = nm6.a;
        i = aVar.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(c cVar, cg6 cg6Var) {
        b bVar;
        int i;
        f fVar;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    bVar.j = cVar;
                    bVar.m = 1;
                    obj = cVar.d(bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = bVar.j;
                    qgg.h0(obj);
                }
                fVar = (f) obj;
                if (fVar != null) {
                    long a = cVar.a.a();
                    long j = fVar.e;
                    if (nsa.c(j, nsa.n(a, cVar.b)) > 0 && nsa.c(j, a) < 0) {
                        return fVar;
                    }
                }
                return null;
            }
        }
        bVar = new b(cVar, cg6Var);
        Object obj2 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        if (i != 0) {
        }
        fVar = (f) obj2;
        if (fVar != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r14.h(r6, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object i(c cVar, long j, cg6 cg6Var) {
        com.yandex.plus.experiments.api.cooldown.a aVar;
        int i;
        c cVar2;
        long j2;
        long j3;
        nsa nsaVar;
        nsa nsaVar2;
        nsa nsaVar3;
        if (cg6Var instanceof com.yandex.plus.experiments.api.cooldown.a) {
            aVar = (com.yandex.plus.experiments.api.cooldown.a) cg6Var;
            int i2 = aVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.o = i2 - Integer.MIN_VALUE;
                Object obj = aVar.m;
                nm6 nm6Var = nm6.a;
                i = aVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    long a = cVar.a.a();
                    aVar.j = cVar;
                    aVar.k = j;
                    aVar.l = a;
                    aVar.o = 1;
                    obj = cVar.b(aVar);
                    if (obj != nm6Var) {
                        cVar2 = cVar;
                        j2 = a;
                        j3 = j;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = aVar.l;
                j3 = aVar.k;
                cVar2 = aVar.j;
                qgg.h0(obj);
                nsaVar = (nsa) obj;
                nsaVar2 = new nsa(j3);
                nsaVar3 = new nsa(cVar2.b);
                if (nsaVar2.compareTo(nsaVar3) > 0) {
                    nsaVar2 = nsaVar3;
                }
                long o = nsa.o(j2, nsaVar2.a);
                if (nsaVar == null && nsa.c(nsaVar.a, o) >= 0) {
                    return Unit.a;
                }
                aVar.j = null;
                aVar.k = j3;
                aVar.l = j2;
                aVar.o = 2;
            }
        }
        aVar = new com.yandex.plus.experiments.api.cooldown.a(cVar, cg6Var);
        Object obj2 = aVar.m;
        nm6 nm6Var2 = nm6.a;
        i = aVar.o;
        if (i != 0) {
        }
        nsaVar = (nsa) obj2;
        nsaVar2 = new nsa(j3);
        nsaVar3 = new nsa(cVar2.b);
        if (nsaVar2.compareTo(nsaVar3) > 0) {
        }
        long o2 = nsa.o(j2, nsaVar2.a);
        if (nsaVar == null) {
        }
        aVar.j = null;
        aVar.k = j3;
        aVar.l = j2;
        aVar.o = 2;
    }

    public abstract Object a(long j, Continuation continuation);

    public abstract Object b(cg6 cg6Var);

    public abstract Object d(cg6 cg6Var);

    public abstract Object f(cg6 cg6Var);

    public abstract Object g(f fVar, cg6 cg6Var);

    public abstract Object h(long j, cg6 cg6Var);

    public c(com.yandex.plus.core.android.extensions.c cVar, long j) {
        cVar.getClass();
        this.a = cVar;
        this.b = j;
    }
}
