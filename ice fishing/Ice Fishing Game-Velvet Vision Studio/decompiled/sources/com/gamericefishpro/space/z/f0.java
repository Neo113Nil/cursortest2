package com.gamericefishpro.space.z;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.gamericefishpro.space.vh.h implements Function2 {
    public final /* synthetic */ int e = 1;
    public Object i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ com.gamericefishpro.space.oh.d y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.gamericefishpro.space.a3.b bVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.y = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.gamericefishpro.space.vh.h, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = new f0((CoroutineContext) this.w, (com.gamericefishpro.space.vh.h) this.y, aVar);
                f0Var.i = obj;
                return f0Var;
            default:
                f0 f0Var2 = new f0((com.gamericefishpro.space.a3.b) this.y, aVar);
                f0Var2.w = obj;
                return f0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((f0) create((com.gamericefishpro.space.b2.c0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((f0) create((com.gamericefishpro.space.li.g) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.gamericefishpro.space.b2.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.gamericefishpro.space.b2.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.gamericefishpro.space.vh.h, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003f -> B:15:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x009e -> B:28:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00b5 -> B:28:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.e
            com.gamericefishpro.space.oh.d r1 = r9.y
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            switch(r0) {
                case 0: goto L45;
                default: goto La;
            }
        La:
            com.gamericefishpro.space.uh.a r0 = com.gamericefishpro.space.uh.a.d
            int r4 = r9.v
            if (r4 == 0) goto L22
            if (r4 != r3) goto L1c
            java.lang.Object r2 = r9.i
            java.lang.Object r4 = r9.w
            com.gamericefishpro.space.li.g r4 = (com.gamericefishpro.space.li.g) r4
            com.gamericefishpro.space.wa.b.P(r10)
            goto L40
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L22:
            com.gamericefishpro.space.wa.b.P(r10)
            java.lang.Object r10 = r9.w
            com.gamericefishpro.space.li.g r10 = (com.gamericefishpro.space.li.g) r10
            r4 = r10
        L2a:
            r10 = r1
            com.gamericefishpro.space.a3.b r10 = (com.gamericefishpro.space.a3.b) r10
            java.lang.Object r10 = r10.invoke()
            if (r10 == 0) goto L3f
            r9.w = r4
            r9.i = r10
            r9.v = r3
            r4.a(r10, r9)
            com.gamericefishpro.space.uh.a r10 = com.gamericefishpro.space.uh.a.d
            goto L44
        L3f:
            r2 = 0
        L40:
            if (r2 != 0) goto L2a
            kotlin.Unit r0 = kotlin.Unit.a
        L44:
            return r0
        L45:
            java.lang.Object r0 = r9.w
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            com.gamericefishpro.space.uh.a r4 = com.gamericefishpro.space.uh.a.d
            int r5 = r9.v
            r6 = 3
            r7 = 2
            if (r5 == 0) goto L78
            if (r5 == r3) goto L70
            if (r5 == r7) goto L65
            if (r5 != r6) goto L5f
            java.lang.Object r2 = r9.i
            com.gamericefishpro.space.b2.c0 r2 = (com.gamericefishpro.space.b2.c0) r2
            com.gamericefishpro.space.wa.b.P(r10)
            goto L6c
        L5f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L65:
            java.lang.Object r2 = r9.i
            com.gamericefishpro.space.b2.c0 r2 = (com.gamericefishpro.space.b2.c0) r2
            com.gamericefishpro.space.wa.b.P(r10)     // Catch: java.util.concurrent.CancellationException -> L6e
        L6c:
            r10 = r2
            goto L7f
        L6e:
            r10 = move-exception
            goto La5
        L70:
            java.lang.Object r2 = r9.i
            com.gamericefishpro.space.b2.c0 r2 = (com.gamericefishpro.space.b2.c0) r2
            com.gamericefishpro.space.wa.b.P(r10)     // Catch: java.util.concurrent.CancellationException -> L6e
            goto L94
        L78:
            com.gamericefishpro.space.wa.b.P(r10)
            java.lang.Object r10 = r9.i
            com.gamericefishpro.space.b2.c0 r10 = (com.gamericefishpro.space.b2.c0) r10
        L7f:
            boolean r2 = com.gamericefishpro.space.pi.a0.s(r0)
            if (r2 == 0) goto Lb9
            r2 = r1
            com.gamericefishpro.space.vh.h r2 = (com.gamericefishpro.space.vh.h) r2     // Catch: java.util.concurrent.CancellationException -> La1
            r9.i = r10     // Catch: java.util.concurrent.CancellationException -> La1
            r9.v = r3     // Catch: java.util.concurrent.CancellationException -> La1
            java.lang.Object r2 = r2.invoke(r10, r9)     // Catch: java.util.concurrent.CancellationException -> La1
            if (r2 != r4) goto L93
            goto Lbb
        L93:
            r2 = r10
        L94:
            r9.i = r2     // Catch: java.util.concurrent.CancellationException -> L6e
            r9.v = r7     // Catch: java.util.concurrent.CancellationException -> L6e
            com.gamericefishpro.space.b2.i r10 = com.gamericefishpro.space.b2.i.i     // Catch: java.util.concurrent.CancellationException -> L6e
            java.lang.Object r10 = com.gamericefishpro.space.z5.g.a(r2, r10, r9)     // Catch: java.util.concurrent.CancellationException -> L6e
            if (r10 != r4) goto L6c
            goto Lbb
        La1:
            r2 = move-exception
            r8 = r2
            r2 = r10
            r10 = r8
        La5:
            boolean r5 = com.gamericefishpro.space.pi.a0.s(r0)
            if (r5 == 0) goto Lb8
            r9.i = r2
            r9.v = r6
            com.gamericefishpro.space.b2.i r10 = com.gamericefishpro.space.b2.i.i
            java.lang.Object r10 = com.gamericefishpro.space.z5.g.a(r2, r10, r9)
            if (r10 != r4) goto L6c
            goto Lbb
        Lb8:
            throw r10
        Lb9:
            kotlin.Unit r4 = kotlin.Unit.a
        Lbb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.z.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(CoroutineContext coroutineContext, Function2 function2, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.w = coroutineContext;
        this.y = (com.gamericefishpro.space.vh.h) function2;
    }
}
