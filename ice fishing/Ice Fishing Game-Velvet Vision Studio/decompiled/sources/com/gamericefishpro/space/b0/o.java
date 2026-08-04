package com.gamericefishpro.space.b0;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.b2.p;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.f3.q;
import com.gamericefishpro.space.i2.p1;
import com.gamericefishpro.space.l4.c0;
import com.gamericefishpro.space.l4.o0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.s5.k0;
import com.gamericefishpro.space.s5.t;
import com.gamericefishpro.space.si.l0;
import com.gamericefishpro.space.t0.n1;
import com.gamericefishpro.space.t0.u1;
import com.gamericefishpro.space.t0.v0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public Object i;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i, w wVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 1;
        this.e = i;
        this.v = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new o((i) this.i, (v0) this.v, aVar, 0);
            case 1:
                o oVar = new o(this.e, (w) this.v, aVar);
                oVar.i = obj;
                return oVar;
            case 2:
                return new o((Context) this.v, aVar, 2);
            case 3:
                return new o((com.gamericefishpro.space.db.e) this.i, (Function1) this.v, aVar, 3);
            case 4:
                return new o((com.gamericefishpro.space.db.e) this.i, (com.gamericefishpro.space.p4.d) this.v, aVar, 4);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return new o((com.gamericefishpro.space.e.m) this.v, aVar, 5);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new o((q) this.i, (com.gamericefishpro.space.n1.c) this.v, aVar, 6);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new o((com.gamericefishpro.space.f7.j) this.i, (String) this.v, aVar, 7);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new o((com.gamericefishpro.space.i0.c) this.i, (com.gamericefishpro.space.b1.b) this.v, aVar, 8);
            case 9:
                return new o((u1) this.i, (View) this.v, aVar, 9);
            case 10:
                return new o((l0) this.i, (p1) this.v, aVar, 10);
            case RequestError.STOP_TRACKING /* 11 */:
                o oVar2 = new o((List) this.v, aVar, 11);
                oVar2.i = obj;
                return oVar2;
            case 12:
                return new o((Function2) this.i, (com.gamericefishpro.space.l4.d) this.v, aVar);
            case 13:
                o oVar3 = new o((c0) this.v, aVar, 13);
                oVar3.i = obj;
                return oVar3;
            case 14:
                return new o((com.gamericefishpro.space.u6.n) this.v, aVar, 14);
            case 15:
                return new o((com.gamericefishpro.space.n2.c) this.i, (Runnable) this.v, aVar, 15);
            case 16:
                return new o((com.gamericefishpro.space.n5.b) this.i, (Uri) this.v, aVar, 16);
            case 17:
                o oVar4 = new o((com.gamericefishpro.space.p0.a) this.v, aVar, 17);
                oVar4.i = obj;
                return oVar4;
            case 18:
                return new o((p) this.i, (com.gamericefishpro.space.w.i) this.v, aVar, 18);
            case 19:
                return new o((k0) this.i, (Function0) this.v, aVar, 19);
            case 20:
                return new o((com.gamericefishpro.space.si.e) this.i, (n1) this.v, aVar, 20);
            case 21:
                o oVar5 = new o((com.gamericefishpro.space.ti.e) this.v, aVar, 21);
                oVar5.i = obj;
                return oVar5;
            case 22:
                o oVar6 = new o((com.gamericefishpro.space.ti.f) this.v, aVar, 22);
                oVar6.i = obj;
                return oVar6;
            case 23:
                o oVar7 = new o((com.gamericefishpro.space.si.f) this.v, aVar, 23);
                oVar7.i = obj;
                return oVar7;
            case 24:
                return new o((Function2) this.i, (com.gamericefishpro.space.u5.q) this.v, aVar, 24);
            case 25:
                return new o((Function2) this.i, (a0) this.v, aVar, 25);
            case 26:
                return new o((i) this.i, (f) this.v, aVar, 26);
            case 27:
                return new o((i) this.i, (g) this.v, aVar, 27);
            case 28:
                return new o((t) this.i, (com.gamericefishpro.space.a7.c) this.v, aVar, 28);
            default:
                o oVar8 = new o((com.gamericefishpro.space.ri.i) this.v, aVar, 29);
                oVar8.i = obj;
                return oVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((o) create((com.gamericefishpro.space.p4.b) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 10:
                ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
                return com.gamericefishpro.space.uh.a.d;
            case RequestError.STOP_TRACKING /* 11 */:
                return ((o) create((com.gamericefishpro.space.l4.j) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((o) create((o0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((o) create((com.gamericefishpro.space.ri.q) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((o) create((com.gamericefishpro.space.si.f) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((o) create(obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 28:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((o) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:208:0x0333  */
    /* JADX WARN: Code duplicated, block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v122, types: [int] */
    /* JADX WARN: Type inference failed for: r1v123, types: [com.gamericefishpro.space.pi.d1] */
    /* JADX WARN: Type inference failed for: r1v127, types: [com.gamericefishpro.space.pi.d1] */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v44, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x0322 -> B:206:0x0325). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:190:0x02cd
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.b0.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Function2 function2, com.gamericefishpro.space.l4.d dVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 12;
        this.i = (com.gamericefishpro.space.vh.i) function2;
        this.v = dVar;
    }
}
