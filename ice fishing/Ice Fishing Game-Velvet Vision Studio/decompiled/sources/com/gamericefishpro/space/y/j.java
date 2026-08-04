package com.gamericefishpro.space.y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.vh.h implements Function2 {
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.v = lVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        j jVar = new j(this.v, aVar);
        jVar.i = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((com.gamericefishpro.space.b2.c0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e A[LOOP:1: B:24:0x007a->B:28:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[EDGE_INSN: B:43:0x0092->B:30:0x0092 BREAK  A[LOOP:1: B:24:0x007a->B:28:0x008e], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:17:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            com.gamericefishpro.space.uh.a r0 = com.gamericefishpro.space.uh.a.d
            int r1 = r11.e
            r2 = 2
            com.gamericefishpro.space.y.l r3 = r11.v
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r11.i
            com.gamericefishpro.space.b2.c0 r1 = (com.gamericefishpro.space.b2.c0) r1
            com.gamericefishpro.space.wa.b.P(r12)
            goto L50
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            java.lang.Object r1 = r11.i
            com.gamericefishpro.space.b2.c0 r1 = (com.gamericefishpro.space.b2.c0) r1
            com.gamericefishpro.space.wa.b.P(r12)
            goto L39
        L26:
            com.gamericefishpro.space.wa.b.P(r12)
            java.lang.Object r12 = r11.i
            r1 = r12
            com.gamericefishpro.space.b2.c0 r1 = (com.gamericefishpro.space.b2.c0) r1
            r11.i = r1
            r11.e = r4
            java.lang.Object r12 = com.gamericefishpro.space.z.s1.b(r1, r11, r2)
            if (r12 != r0) goto L39
            goto L4f
        L39:
            com.gamericefishpro.space.b2.m r12 = (com.gamericefishpro.space.b2.m) r12
            long r4 = r12.a
            r3.h = r4
            long r4 = r12.c
            r3.b = r4
        L43:
            r11.i = r1
            r11.e = r2
            com.gamericefishpro.space.b2.i r12 = com.gamericefishpro.space.b2.i.e
            java.lang.Object r12 = r1.a(r12, r11)
            if (r12 != r0) goto L50
        L4f:
            return r0
        L50:
            com.gamericefishpro.space.b2.h r12 = (com.gamericefishpro.space.b2.h) r12
            java.util.List r12 = r12.a
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r12.size()
            r4.<init>(r5)
            int r5 = r12.size()
            r6 = 0
            r7 = r6
        L63:
            if (r7 >= r5) goto L76
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            com.gamericefishpro.space.b2.m r9 = (com.gamericefishpro.space.b2.m) r9
            boolean r9 = r9.d
            if (r9 == 0) goto L73
            r4.add(r8)
        L73:
            int r7 = r7 + 1
            goto L63
        L76:
            int r12 = r4.size()
        L7a:
            if (r6 >= r12) goto L91
            java.lang.Object r5 = r4.get(r6)
            r7 = r5
            com.gamericefishpro.space.b2.m r7 = (com.gamericefishpro.space.b2.m) r7
            long r7 = r7.a
            long r9 = r3.h
            boolean r7 = com.gamericefishpro.space.u6.f.s(r7, r9)
            if (r7 == 0) goto L8e
            goto L92
        L8e:
            int r6 = r6 + 1
            goto L7a
        L91:
            r5 = 0
        L92:
            com.gamericefishpro.space.b2.m r5 = (com.gamericefishpro.space.b2.m) r5
            if (r5 != 0) goto L9d
            java.lang.Object r12 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            r5 = r12
            com.gamericefishpro.space.b2.m r5 = (com.gamericefishpro.space.b2.m) r5
        L9d:
            if (r5 == 0) goto La7
            long r6 = r5.a
            r3.h = r6
            long r5 = r5.c
            r3.b = r5
        La7:
            boolean r12 = r4.isEmpty()
            if (r12 == 0) goto L43
            r0 = -1
            r3.h = r0
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.y.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
