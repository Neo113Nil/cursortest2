package com.gamericefishpro.space.l4;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public com.gamericefishpro.space.ei.y d;
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.gamericefishpro.space.ei.y v;
    public final /* synthetic */ c0 w;
    public final /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.gamericefishpro.space.ei.y yVar, c0 c0Var, Object obj, boolean z, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = yVar;
        this.w = c0Var;
        this.y = obj;
        this.z = z;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        b0 b0Var = new b0(this.v, this.w, this.y, this.z, aVar);
        b0Var.i = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((m0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r6.b(r2, r7) == r0) goto L16;
     */
    @Override // com.gamericefishpro.space.vh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0 m0Var;
        com.gamericefishpro.space.ei.y yVar;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.e;
        Object obj2 = this.y;
        c0 c0Var = this.w;
        com.gamericefishpro.space.ei.y yVar2 = this.v;
        if (i != 0) {
            if (i == 1) {
                yVar = this.d;
                m0Var = (m0) this.i;
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            if (this.z) {
                c0Var.A.d(new d(obj2 != null ? obj2.hashCode() : 0, yVar2.d, obj2));
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        m0 m0Var2 = (m0) this.i;
        t0 t0VarF = c0Var.f();
        this.i = m0Var2;
        this.d = yVar2;
        this.e = 1;
        Integer num = new Integer(((AtomicInteger) t0VarF.b.e).incrementAndGet());
        if (num != aVar) {
            m0Var = m0Var2;
            obj = num;
            yVar = yVar2;
        }
        return aVar;
        yVar.d = ((Number) obj).intValue();
        this.i = null;
        this.d = null;
        this.e = 2;
    }
}
