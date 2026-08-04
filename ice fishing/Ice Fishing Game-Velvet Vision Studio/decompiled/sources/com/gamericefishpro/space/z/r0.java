package com.gamericefishpro.space.z;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ com.gamericefishpro.space.ei.a0 A;
    public final /* synthetic */ float B;
    public final /* synthetic */ com.gamericefishpro.space.p5.a C;
    public final /* synthetic */ float D;
    public final /* synthetic */ q1 E;
    public com.gamericefishpro.space.ei.w d;
    public com.gamericefishpro.space.ei.w e;
    public int i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ com.gamericefishpro.space.ei.x y;
    public final /* synthetic */ com.gamericefishpro.space.ei.a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.gamericefishpro.space.ei.x xVar, com.gamericefishpro.space.ei.a0 a0Var, com.gamericefishpro.space.ei.a0 a0Var2, float f, com.gamericefishpro.space.p5.a aVar, float f2, q1 q1Var, com.gamericefishpro.space.th.a aVar2) {
        super(2, aVar2);
        this.y = xVar;
        this.z = a0Var;
        this.A = a0Var2;
        this.B = f;
        this.C = aVar;
        this.D = f2;
        this.E = q1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        r0 r0Var = new r0(this.y, this.z, this.A, this.B, this.C, this.D, this.E, aVar);
        r0Var.w = obj;
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((o1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    /* JADX WARN: Code duplicated, block: B:18:0x008e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:27:0x0142  */
    /* JADX WARN: Code duplicated, block: B:30:0x0148  */
    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:36:0x0172  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0172 -> B:37:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0184 -> B:14:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.z.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
