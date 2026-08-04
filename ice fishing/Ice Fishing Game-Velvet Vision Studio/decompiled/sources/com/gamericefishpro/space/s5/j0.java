package com.gamericefishpro.space.s5;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ j[] A;
    public final /* synthetic */ k0 B;
    public final /* synthetic */ a0 C;
    public j[] d;
    public k0 e;
    public a0 i;
    public int v;
    public int w;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(j[] jVarArr, k0 k0Var, a0 a0Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.A = jVarArr;
        this.B = k0Var;
        this.C = a0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new j0(this.A, this.B, this.C, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((com.gamericefishpro.space.u5.k) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.gamericefishpro.space.uh.a r0 = com.gamericefishpro.space.uh.a.d
            int r1 = r10.z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L1c
        Lc:
            int r1 = r10.y
            int r4 = r10.w
            int r5 = r10.v
            com.gamericefishpro.space.s5.a0 r6 = r10.i
            com.gamericefishpro.space.s5.k0 r7 = r10.e
            com.gamericefishpro.space.s5.j[] r8 = r10.d
            com.gamericefishpro.space.wa.b.P(r11)
            goto L58
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            com.gamericefishpro.space.wa.b.P(r11)
            com.gamericefishpro.space.s5.j[] r11 = r10.A
            int r1 = r11.length
            r4 = 0
            com.gamericefishpro.space.s5.k0 r5 = r10.B
            com.gamericefishpro.space.s5.a0 r6 = r10.C
            r8 = r11
            r11 = r4
            r7 = r5
        L32:
            if (r4 >= r1) goto L78
            r5 = r8[r4]
            int r9 = r11 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L75
            if (r5 == r3) goto L60
            if (r5 != r2) goto L5a
            r10.d = r8
            r10.e = r7
            r10.i = r6
            r10.v = r9
            r10.w = r4
            r10.y = r1
            r10.z = r2
            java.lang.Object r11 = com.gamericefishpro.space.s5.k0.d(r7, r6, r11, r10)
            if (r11 != r0) goto L57
            goto L74
        L57:
            r5 = r9
        L58:
            r11 = r5
            goto L76
        L5a:
            com.gamericefishpro.space.oh.k r11 = new com.gamericefishpro.space.oh.k
            r11.<init>()
            throw r11
        L60:
            r10.d = r8
            r10.e = r7
            r10.i = r6
            r10.v = r9
            r10.w = r4
            r10.y = r1
            r10.z = r3
            java.lang.Object r11 = com.gamericefishpro.space.s5.k0.c(r7, r6, r11, r10)
            if (r11 != r0) goto L57
        L74:
            return r0
        L75:
            r11 = r9
        L76:
            int r4 = r4 + r3
            goto L32
        L78:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.s5.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
