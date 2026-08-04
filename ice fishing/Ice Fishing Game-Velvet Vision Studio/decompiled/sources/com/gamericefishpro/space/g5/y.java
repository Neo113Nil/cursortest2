package com.gamericefishpro.space.g5;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.s5.k0;
import com.gamericefishpro.space.si.g0;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.w.l1;
import com.gamericefishpro.space.w.s0;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object i;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v0 v0Var, com.gamericefishpro.space.w.b0 b0Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 6;
        this.w = v0Var;
        this.y = b0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y yVar = new y((s0) this.v, (com.gamericefishpro.space.f5.k) this.w, (l1) this.y, aVar, 0);
                yVar.i = obj;
                return yVar;
            case 1:
                return new y((com.gamericefishpro.space.n2.c) this.i, (ScrollCaptureSession) this.v, (Rect) this.w, (Consumer) this.y, aVar, 1);
            case 2:
                y yVar2 = new y((k0) this.v, (int[]) this.w, (String[]) this.y, aVar, 2);
                yVar2.i = obj;
                return yVar2;
            case 3:
                y yVar3 = new y((com.gamericefishpro.space.si.e) this.v, (n0) this.w, (Float) this.y, aVar, 3);
                yVar3.i = obj;
                return yVar3;
            case 4:
                return new y((com.gamericefishpro.space.si.k0) this.i, (com.gamericefishpro.space.si.e) this.v, (n0) this.w, (Float) this.y, aVar, 4);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return new y(this.i, (com.gamericefishpro.space.w.b) this.v, (v0) this.w, (v0) this.y, aVar, 5);
            default:
                y yVar4 = new y((v0) this.w, (com.gamericefishpro.space.w.b0) this.y, aVar);
                yVar4.i = obj;
                return yVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((y) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((y) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                ((y) create((com.gamericefishpro.space.si.f) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
                return com.gamericefishpro.space.uh.a.d;
            case 3:
                return ((y) create((g0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((y) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return ((y) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                ((y) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
                return com.gamericefishpro.space.uh.a.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02b4 A[PHI: r7
      0x02b4: PHI (r7v8 com.gamericefishpro.space.si.f) = (r7v6 com.gamericefishpro.space.si.f), (r7v7 com.gamericefishpro.space.si.f), (r7v15 com.gamericefishpro.space.si.f) binds: [B:122:0x0291, B:127:0x02b1, B:109:0x0241] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0050 A[PHI: r13 r14
      0x0050: PHI (r13v7 com.gamericefishpro.space.ei.x) = 
      (r13v5 com.gamericefishpro.space.ei.x)
      (r13v6 com.gamericefishpro.space.ei.x)
      (r13v6 com.gamericefishpro.space.ei.x)
      (r13v9 com.gamericefishpro.space.ei.x)
     binds: [B:12:0x003e, B:19:0x0082, B:21:0x00a4, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r14v6 com.gamericefishpro.space.pi.x) = 
      (r14v4 com.gamericefishpro.space.pi.x)
      (r14v5 com.gamericefishpro.space.pi.x)
      (r14v5 com.gamericefishpro.space.pi.x)
      (r14v8 com.gamericefishpro.space.pi.x)
     binds: [B:12:0x003e, B:19:0x0082, B:21:0x00a4, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x006e  */
    /* JADX WARN: Code duplicated, block: B:18:0x007d A[PHI: r13 r14
      0x007d: PHI (r13v6 com.gamericefishpro.space.ei.x) = (r13v7 com.gamericefishpro.space.ei.x), (r13v8 com.gamericefishpro.space.ei.x) binds: [B:16:0x007a, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r14v5 com.gamericefishpro.space.pi.x) = (r14v6 com.gamericefishpro.space.pi.x), (r14v7 com.gamericefishpro.space.pi.x) binds: [B:16:0x007a, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0082 -> B:13:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a4 -> B:13:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.g5.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, Object obj3, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.v = obj;
        this.w = obj2;
        this.y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = obj;
        this.v = obj2;
        this.w = obj3;
        this.y = obj4;
    }
}
