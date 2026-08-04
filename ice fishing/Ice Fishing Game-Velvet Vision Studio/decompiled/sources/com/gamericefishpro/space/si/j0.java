package com.gamericefishpro.space.si;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends com.gamericefishpro.space.vh.i implements com.gamericefishpro.space.di.c {
    public int d;
    public /* synthetic */ f e;
    public /* synthetic */ int i;
    public final /* synthetic */ k0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, com.gamericefishpro.space.th.a aVar) {
        super(3, aVar);
        this.v = k0Var;
    }

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        j0 j0Var = new j0(this.v, (com.gamericefishpro.space.th.a) obj3);
        j0Var.e = (f) obj;
        j0Var.i = iIntValue;
        return j0Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[PHI: r1
      0x0062: PHI (r1v3 com.gamericefishpro.space.si.f) = (r1v2 com.gamericefishpro.space.si.f), (r1v6 com.gamericefishpro.space.si.f) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.d(r8, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r1.d(r8, r7) == r0) goto L32;
     */
    @Override // com.gamericefishpro.space.vh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        g0 g0Var;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            fVar = this.e;
            if (this.i > 0) {
                g0 g0Var2 = g0.d;
                this.d = 1;
            } else {
                this.e = fVar;
                this.d = 2;
                if (com.gamericefishpro.space.pi.a0.i(0L, this) != aVar) {
                    g0Var = g0.e;
                    this.e = fVar;
                    this.d = 3;
                    if (fVar.d(g0Var, this) != aVar) {
                        this.e = fVar;
                        this.d = 4;
                        if (com.gamericefishpro.space.pi.a0.i(Long.MAX_VALUE, this) != aVar) {
                            g0 g0Var3 = g0.i;
                            this.e = null;
                            this.d = 5;
                        }
                    }
                }
            }
            return aVar;
        }
        if (i != 1) {
            if (i == 2) {
                fVar = this.e;
                com.gamericefishpro.space.wa.b.P(obj);
                g0Var = g0.e;
                this.e = fVar;
                this.d = 3;
                if (fVar.d(g0Var, this) != aVar) {
                    this.e = fVar;
                    this.d = 4;
                    if (com.gamericefishpro.space.pi.a0.i(Long.MAX_VALUE, this) != aVar) {
                    }
                }
                return aVar;
            }
            if (i == 3) {
                fVar = this.e;
                com.gamericefishpro.space.wa.b.P(obj);
                this.e = fVar;
                this.d = 4;
                if (com.gamericefishpro.space.pi.a0.i(Long.MAX_VALUE, this) != aVar) {
                }
                return aVar;
            }
            if (i == 4) {
                fVar = this.e;
                com.gamericefishpro.space.wa.b.P(obj);
            } else if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0 g0Var4 = g0.i;
            this.e = null;
            this.d = 5;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        return Unit.a;
    }
}
