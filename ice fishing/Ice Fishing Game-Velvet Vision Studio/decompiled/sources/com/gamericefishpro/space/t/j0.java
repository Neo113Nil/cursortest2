package com.gamericefishpro.space.t;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends com.gamericefishpro.space.vh.h implements Function2 {
    public int A;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ k0 E;
    public final /* synthetic */ com.gamericefishpro.space.li.e F;
    public com.gamericefishpro.space.li.e e;
    public k0 i;
    public long[] v;
    public int w;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, com.gamericefishpro.space.li.e eVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.E = k0Var;
        this.F = eVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        j0 j0Var = new j0(this.E, this.F, aVar);
        j0Var.D = obj;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((com.gamericefishpro.space.li.g) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:22:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:19:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            com.gamericefishpro.space.uh.a r1 = com.gamericefishpro.space.uh.a.d
            int r2 = r0.C
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L27
            int r2 = r0.A
            int r6 = r0.z
            long r7 = r0.B
            int r9 = r0.y
            int r10 = r0.w
            long[] r11 = r0.v
            com.gamericefishpro.space.t.k0 r12 = r0.i
            com.gamericefishpro.space.li.e r13 = r0.e
            java.lang.Object r14 = r0.D
            com.gamericefishpro.space.li.g r14 = (com.gamericefishpro.space.li.g) r14
            com.gamericefishpro.space.wa.b.P(r22)
            goto L97
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            com.gamericefishpro.space.wa.b.P(r22)
            java.lang.Object r2 = r0.D
            com.gamericefishpro.space.li.g r2 = (com.gamericefishpro.space.li.g) r2
            com.gamericefishpro.space.t.k0 r6 = r0.E
            com.gamericefishpro.space.t.i0 r7 = r6.e
            long[] r7 = r7.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La7
            com.gamericefishpro.space.li.e r9 = r0.F
            r10 = r3
        L44:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La2
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r3
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L67:
            if (r2 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L97
            int r3 = r9 << 3
            int r3 = r3 + r2
            r13.e = r3
            com.gamericefishpro.space.t.i0 r4 = r12.e
            java.lang.Object[] r4 = r4.b
            r3 = r4[r3]
            r0.D = r14
            r0.e = r13
            r0.i = r12
            r0.v = r11
            r0.w = r10
            r0.y = r9
            r0.B = r7
            r0.z = r6
            r0.A = r2
            r0.C = r5
            r14.a(r3, r0)
            com.gamericefishpro.space.uh.a r2 = com.gamericefishpro.space.uh.a.d
            return r1
        L97:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L67
        L9a:
            if (r6 != r4) goto La7
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La2:
            if (r10 == r8) goto La7
            int r10 = r10 + 1
            goto L44
        La7:
            kotlin.Unit r1 = kotlin.Unit.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.t.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
