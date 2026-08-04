package com.gamericefishpro.space.n7;

import com.gamericefishpro.space.ph.g0;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public int e;
    public final /* synthetic */ q i;
    public final /* synthetic */ Pair v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Pair pair, int i, int i2, g gVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.i = qVar;
        this.v = pair;
        this.w = i;
        this.y = i2;
        this.z = gVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new m(this.i, this.v, this.w, this.y, this.z, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (com.gamericefishpro.space.n7.q.g(r0, r1, r12) == r2) goto L29;
     */
    @Override // com.gamericefishpro.space.vh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        q qVar = this.i;
        com.gamericefishpro.space.w7.b bVar = qVar.f;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = this.e;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.d;
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        com.gamericefishpro.space.i7.c cVar = qVar.g;
        Pair pair = this.v;
        int iIntValue = ((Number) pair.d).intValue();
        int iIntValue2 = ((Number) pair.e).intValue();
        cVar.getClass();
        int i3 = this.y;
        int i4 = this.w;
        g0 g0VarE = null;
        if ((iIntValue == i4 && Math.abs(iIntValue2 - i3) == 1) || (iIntValue2 == i3 && Math.abs(iIntValue - i4) == 1)) {
            cVar.g(iIntValue, iIntValue2, i4, i3);
            LinkedHashSet linkedHashSetA = cVar.a();
            if (linkedHashSetA.isEmpty()) {
                cVar.g(iIntValue, iIntValue2, i4, i3);
            } else {
                g0VarE = cVar.e(linkedHashSetA);
            }
        }
        if (g0VarE == null) {
            qVar.e(new h(i4, i3, 1));
            return Unit.a;
        }
        bVar.a();
        bVar.c();
        i = this.z.d - 1;
        this.d = i;
        this.e = 1;
        if (q.f(qVar, this) != aVar) {
        }
        return aVar;
        qVar.e(new com.gamericefishpro.space.f1.s(i, 3, qVar));
        this.e = 2;
    }
}
