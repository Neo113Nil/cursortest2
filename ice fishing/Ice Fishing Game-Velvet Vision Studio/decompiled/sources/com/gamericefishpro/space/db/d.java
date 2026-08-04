package com.gamericefishpro.space.db;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.work.CoroutineWorker;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.b0.h;
import com.gamericefishpro.space.b0.j;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.l4.c0;
import com.gamericefishpro.space.l6.k;
import com.gamericefishpro.space.n7.g;
import com.gamericefishpro.space.n7.q;
import com.gamericefishpro.space.pi.m0;
import com.gamericefishpro.space.pi.n;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.si.f;
import com.gamericefishpro.space.t0.b1;
import com.gamericefishpro.space.t0.n1;
import com.gamericefishpro.space.t0.t1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.w.l1;
import com.gamericefishpro.space.w.s0;
import com.gamericefishpro.space.y.r0;
import com.gamericefishpro.space.z.b0;
import com.gamericefishpro.space.z.o1;
import com.gamericefishpro.space.z.q1;
import com.gamericefishpro.space.z.x0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public Object i;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(c0 c0Var, Function2 function2, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 5;
        this.v = c0Var;
        this.w = (i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new d((e) this.i, (com.gamericefishpro.space.p4.d) this.v, (Long) this.w, aVar, 0);
            case 1:
                return new d((s0) this.i, (v0) this.v, (b1) this.w, aVar, 1);
            case 2:
                return new d((com.gamericefishpro.space.i0.c) this.i, (f1) this.v, (com.gamericefishpro.space.b2.b) this.w, aVar, 2);
            case 3:
                return new d((com.gamericefishpro.space.ri.e) this.w, aVar, 3);
            case 4:
                d dVar = new d((c0) this.w, aVar, 4);
                dVar.v = obj;
                return dVar;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                d dVar2 = new d((c0) this.v, (Function2) this.w, aVar);
                dVar2.i = obj;
                return dVar2;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new d((k) this.v, (CoroutineWorker) this.w, aVar, 6);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new d((com.gamericefishpro.space.n5.b) this.i, (Uri) this.v, (InputEvent) this.w, aVar, 7);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new d((q) this.i, (com.gamericefishpro.space.i7.d) this.v, (g) this.w, aVar, 8);
            case 9:
                d dVar3 = new d((t1) this.v, (com.gamericefishpro.space.t0.s0) this.w, aVar, 9);
                dVar3.i = obj;
                return dVar3;
            case 10:
                d dVar4 = new d((CoroutineContext) this.v, (com.gamericefishpro.space.si.e) this.w, aVar, 10);
                dVar4.i = obj;
                return dVar4;
            case RequestError.STOP_TRACKING /* 11 */:
                return new d((com.gamericefishpro.space.t7.d) this.v, (Context) this.w, aVar, 11);
            case 12:
                d dVar5 = new d((f) this.v, (com.gamericefishpro.space.ti.e) this.w, aVar, 12);
                dVar5.i = obj;
                return dVar5;
            case 13:
                return new d((a0) this.v, (com.gamericefishpro.space.u5.i) this.w, aVar, 13);
            case 14:
                d dVar6 = new d((n) this.v, (Function2) this.w, aVar);
                dVar6.i = obj;
                return dVar6;
            case 15:
                d dVar7 = new d((l1) this.v, (v0) this.w, aVar, 15);
                dVar7.i = obj;
                return dVar7;
            case 16:
                return new d((s0) this.w, aVar, 16);
            case 17:
                return new d((com.gamericefishpro.space.b0.i) this.i, (j) this.v, (m0) this.w, aVar, 17);
            case 18:
                return new d((com.gamericefishpro.space.b0.i) this.i, (h) this.v, (m0) this.w, aVar, 18);
            case 19:
                d dVar8 = new d((com.gamericefishpro.space.c8.h) this.v, (Function2) this.w, aVar, 19);
                dVar8.i = obj;
                return dVar8;
            case 20:
                return new d((com.gamericefishpro.space.c8.h) this.i, (r0) this.v, (Function2) this.w, aVar, 20);
            case 21:
                d dVar9 = new d((b0) this.v, (q1) this.w, aVar, 21);
                dVar9.i = obj;
                return dVar9;
            default:
                d dVar10 = new d((q1) this.v, (Function2) this.w, aVar, 22);
                dVar10.i = obj;
                return dVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((d) create((f) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((d) create((n1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case RequestError.STOP_TRACKING /* 11 */:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((d) create((n1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((d) create((x0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((d) create((o1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((d) create((x0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:324:0x0626  */
    /* JADX WARN: Code duplicated, block: B:327:0x062f A[Catch: all -> 0x0601, TryCatch #0 {all -> 0x0601, blocks: (B:314:0x05fd, B:325:0x0627, B:327:0x062f, B:328:0x063c, B:335:0x064c, B:322:0x061a, B:337:0x064f, B:339:0x0654, B:340:0x0655, B:341:0x0656, B:321:0x0614, B:329:0x063d, B:331:0x0643), top: B:421:0x05f1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x0643 A[Catch: all -> 0x0653, TRY_LEAVE, TryCatch #2 {, blocks: (B:329:0x063d, B:331:0x0643), top: B:424:0x063d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x064f A[Catch: all -> 0x0601, TryCatch #0 {all -> 0x0601, blocks: (B:314:0x05fd, B:325:0x0627, B:327:0x062f, B:328:0x063c, B:335:0x064c, B:322:0x061a, B:337:0x064f, B:339:0x0654, B:340:0x0655, B:341:0x0656, B:321:0x0614, B:329:0x063d, B:331:0x0643), top: B:421:0x05f1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:424:0x063d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:331:0x0643, B:334:0x064b], limit reached: 435 */
    /* JADX WARN: Type inference failed for: r15v138, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.gamericefishpro.space.ri.s] */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.gamericefishpro.space.ri.e] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.gamericefishpro.space.ri.s] */
    /* JADX WARN: Type inference failed for: r2v36, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:323:0x0624 -> B:325:0x0627). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.db.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(n nVar, Function2 function2, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 14;
        this.v = nVar;
        this.w = (i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = obj;
        this.v = obj2;
        this.w = obj3;
    }
}
