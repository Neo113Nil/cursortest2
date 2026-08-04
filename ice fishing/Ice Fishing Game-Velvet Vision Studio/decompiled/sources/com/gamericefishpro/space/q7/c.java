package com.gamericefishpro.space.q7;

import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.t0.c1;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ c1 B;
    public int d;
    public int e;
    public int i;
    public int v;
    public int w;
    public c1 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, c1 c1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.A = i;
        this.B = c1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new c(this.A, this.B, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:14:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            com.gamericefishpro.space.uh.a r0 = com.gamericefishpro.space.uh.a.d
            int r1 = r12.z
            com.gamericefishpro.space.t0.c1 r2 = r12.B
            int r3 = r12.A
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 != r4) goto L1d
            int r1 = r12.w
            int r5 = r12.v
            int r6 = r12.i
            int r7 = r12.e
            int r8 = r12.d
            com.gamericefishpro.space.t0.c1 r9 = r12.y
            com.gamericefishpro.space.wa.b.P(r13)
            goto L4c
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            com.gamericefishpro.space.wa.b.P(r13)
            int r13 = r3 / 40
            r1 = 40
            r5 = 0
            r8 = r13
            r7 = r1
            r9 = r2
            r6 = r3
            r1 = r5
        L32:
            if (r1 >= r7) goto L59
            r12.y = r9
            r12.d = r8
            r12.e = r7
            r12.i = r6
            r12.v = r1
            r12.w = r1
            r12.z = r4
            r10 = 50
            java.lang.Object r13 = com.gamericefishpro.space.pi.a0.i(r10, r12)
            if (r13 != r0) goto L4b
            return r0
        L4b:
            r5 = r1
        L4c:
            int r1 = r1 + r4
            int r1 = r1 * r8
            if (r1 <= r6) goto L51
            r1 = r6
        L51:
            int r13 = com.gamericefishpro.space.q7.d.e
            r9.h(r1)
            int r1 = r5 + 1
            goto L32
        L59:
            int r13 = com.gamericefishpro.space.q7.d.e
            r2.h(r3)
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.q7.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
