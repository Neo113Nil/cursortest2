package com.gamericefishpro.space.ti;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements q {
    public final CoroutineContext d;
    public final int e;
    public final com.gamericefishpro.space.ri.a i;

    public e(CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        this.d = coroutineContext;
        this.e = i;
        this.i = aVar;
    }

    @Override // com.gamericefishpro.space.si.e
    public Object a(com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar) {
        Object objH = a0.h(new com.gamericefishpro.space.db.d(fVar, this, null, 12), aVar);
        return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // com.gamericefishpro.space.ti.q
    public final com.gamericefishpro.space.si.e b(CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        CoroutineContext coroutineContext2 = this.d;
        CoroutineContext coroutineContextO = coroutineContext.o(coroutineContext2);
        com.gamericefishpro.space.ri.a aVar2 = com.gamericefishpro.space.ri.a.d;
        com.gamericefishpro.space.ri.a aVar3 = this.i;
        int i2 = this.e;
        if (aVar == aVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (Intrinsics.a(coroutineContextO, coroutineContext2) && i == i2 && aVar == aVar3) ? this : e(coroutineContextO, i, aVar);
    }

    public String c() {
        return null;
    }

    public abstract Object d(com.gamericefishpro.space.ri.q qVar, com.gamericefishpro.space.b0.o oVar);

    public abstract e e(CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar);

    public com.gamericefishpro.space.si.e f() {
        return null;
    }

    public com.gamericefishpro.space.ri.s g(com.gamericefishpro.space.pi.x xVar) {
        int i = this.e;
        if (i == -3) {
            i = -2;
        }
        com.gamericefishpro.space.pi.y yVar = com.gamericefishpro.space.pi.y.i;
        Function2 oVar = new com.gamericefishpro.space.b0.o(this, (com.gamericefishpro.space.th.a) null, 21);
        com.gamericefishpro.space.ri.p pVar = new com.gamericefishpro.space.ri.p(com.gamericefishpro.space.pi.r.b(xVar, this.d), com.gamericefishpro.space.hj.c.a(i, 4, this.i));
        pVar.l0(yVar, pVar, oVar);
        return pVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.d;
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        com.gamericefishpro.space.ri.a aVar = com.gamericefishpro.space.ri.a.d;
        com.gamericefishpro.space.ri.a aVar2 = this.i;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return y0.i(sb, CollectionsKt.A(arrayList, ", ", null, null, null, 62), ']');
    }
}
