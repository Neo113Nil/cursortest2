package com.gamericefishpro.space.z;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d = 0;
    public com.gamericefishpro.space.ei.a0 e;
    public com.gamericefishpro.space.ei.a0 i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ j1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.gamericefishpro.space.ei.a0 a0Var, j1 j1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.i = a0Var;
        this.y = j1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b0 b0Var = new b0(this.i, this.y, aVar);
                b0Var.w = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0(this.y, aVar);
                b0Var2.w = obj;
                return b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b0) create((Function1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((b0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b A[PHI: r5
      0x005b: PHI (r5v13 com.gamericefishpro.space.pi.x) = 
      (r5v4 com.gamericefishpro.space.pi.x)
      (r5v7 com.gamericefishpro.space.pi.x)
      (r5v7 com.gamericefishpro.space.pi.x)
      (r5v7 com.gamericefishpro.space.pi.x)
      (r5v11 com.gamericefishpro.space.pi.x)
      (r5v14 com.gamericefishpro.space.pi.x)
     binds: [B:20:0x0053, B:50:0x00dc, B:52:0x00e9, B:46:0x00d5, B:32:0x0087, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003a, blocks: (B:37:0x009d, B:40:0x00bd, B:15:0x0034), top: B:92:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8 A[Catch: CancellationException -> 0x00d8, TryCatch #1 {CancellationException -> 0x00d8, blocks: (B:43:0x00c2, B:45:0x00c8, B:49:0x00da, B:51:0x00de), top: B:90:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da A[Catch: CancellationException -> 0x00d8, TryCatch #1 {CancellationException -> 0x00d8, blocks: (B:43:0x00c2, B:45:0x00c8, B:49:0x00da, B:51:0x00de), top: B:90:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00de A[Catch: CancellationException -> 0x00d8, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00d8, blocks: (B:43:0x00c2, B:45:0x00c8, B:49:0x00da, B:51:0x00de), top: B:90:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d5 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00dc -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e9 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00f7 -> B:13:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x014d -> B:82:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0152 -> B:84:0x0153). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:51:0x00de
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.z.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(j1 j1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.y = j1Var;
    }
}
