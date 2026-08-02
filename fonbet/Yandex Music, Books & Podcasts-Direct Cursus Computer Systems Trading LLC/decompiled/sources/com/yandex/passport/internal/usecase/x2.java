package com.yandex.passport.internal.usecase;

import com.yandex.passport.internal.report.bd;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.zc;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class x2 {
    public final com.yandex.passport.internal.usecase.ui.e a;
    public final com.yandex.passport.internal.storage.c b;
    public final com.yandex.passport.internal.report.reporters.i1 c;
    public final com.yandex.passport.internal.flags.i d;
    public final com.yandex.passport.internal.core.accounts.s e;

    public x2(com.yandex.passport.internal.usecase.ui.e eVar, com.yandex.passport.internal.storage.c cVar, com.yandex.passport.internal.report.reporters.i1 i1Var, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.core.accounts.s sVar) {
        eVar.getClass();
        cVar.getClass();
        i1Var.getClass();
        iVar.getClass();
        sVar.getClass();
        this.a = eVar;
        this.b = cVar;
        this.c = i1Var;
        this.d = iVar;
        this.e = sVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(1:(5:14|15|(1:17)|18|19)(2:21|22))(8:23|24|25|(1:27)|28|(2:30|31)|18|19))(7:33|34|35|28|(0)|18|19))(9:36|37|38|39|(6:41|(4:48|(2:50|51)|25|(0))|52|(1:54)|55|(2:57|51)(2:58|35))|28|(0)|18|19))(1:59))(3:99|(1:101)|51)|60|(2:62|63)(2:64|(7:70|(4:73|(2:75|76)(1:78)|77|71)|79|80|(2:81|(2:83|(2:85|86)(1:96))(2:97|98))|87|(4:89|(1:91)|92|93)(1:94))(2:68|69))))|108|6|7|(0)(0)|60|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0068, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0069, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0208, code lost:
    
        r2 = r7.a;
        r3.j = r7;
        r3.k = null;
        r3.l = r0;
        r3.m = null;
        r3.n = null;
        r3.q = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021c, code lost:
    
        if (b(r2, false, r3) != r4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021f, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0058, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0152, code lost:
    
        if (r2 == r4) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018e A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:24:0x0053, B:25:0x0184, B:27:0x018e, B:28:0x01e2, B:30:0x01e8, B:39:0x0156, B:41:0x0160, B:43:0x0164, B:45:0x0168, B:48:0x016d, B:52:0x01a5, B:54:0x01ad, B:55:0x01c7), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e8 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #1 {all -> 0x0058, blocks: (B:24:0x0053, B:25:0x0184, B:27:0x018e, B:28:0x01e2, B:30:0x01e8, B:39:0x0156, B:41:0x0160, B:43:0x0164, B:45:0x0168, B:48:0x016d, B:52:0x01a5, B:54:0x01ad, B:55:0x01c7), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.yandex.passport.internal.usecase.y2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y2 y2Var, cg6 cg6Var) {
        w2 w2Var;
        Object obj;
        ?? r5;
        y2 y2Var2;
        com.yandex.passport.internal.d dVar;
        Object obj2;
        Object obj3;
        Throwable a;
        Object obj4;
        y2 y2Var3;
        y2 y2Var4;
        if (cg6Var instanceof w2) {
            w2Var = (w2) cg6Var;
            int i = w2Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2Var.q = i - Integer.MIN_VALUE;
                obj = w2Var.o;
                nm6 nm6Var = nm6.a;
                r5 = w2Var.q;
                y2 y2Var5 = 8;
                if (r5 != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.d dVar2 = y2Var.c;
                    com.yandex.passport.common.core.f fVar = y2Var.a;
                    w2Var.j = y2Var;
                    w2Var.k = dVar2;
                    w2Var.q = 1;
                    Object a2 = this.b.a(fVar, w2Var);
                    if (a2 != nm6Var) {
                        y2Var2 = y2Var;
                        dVar = dVar2;
                        obj = a2;
                    }
                    return nm6Var;
                }
                if (r5 != 1) {
                    if (r5 == 2) {
                        y2Var2 = w2Var.j;
                        qgg.h0(obj);
                        y2 y2Var6 = y2Var2;
                        obj3 = ((z7o) obj).a;
                        a = z7o.a(obj3);
                        y2Var5 = y2Var6;
                        if (a != null) {
                            if (!(a instanceof com.yandex.passport.data.exceptions.d) && !(a instanceof com.yandex.passport.data.exceptions.c) && !(a instanceof com.yandex.passport.common.exception.b)) {
                                com.yandex.passport.common.core.f fVar2 = y2Var6.a;
                                w2Var.j = y2Var6;
                                w2Var.k = null;
                                w2Var.l = null;
                                w2Var.m = obj3;
                                w2Var.n = a;
                                w2Var.q = 4;
                                y2Var4 = y2Var6;
                                if (b(fVar2, false, w2Var) == nm6Var) {
                                    return nm6Var;
                                }
                                com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                                y2Var5 = y2Var4;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                }
                            }
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Can't make master enabled token because of backend error for: " + y2Var6.a, 8);
                            }
                            com.yandex.passport.common.core.f fVar3 = y2Var6.a;
                            w2Var.j = y2Var6;
                            w2Var.k = null;
                            w2Var.l = null;
                            w2Var.m = obj3;
                            w2Var.n = null;
                            w2Var.q = 3;
                            if (b(fVar3, true, w2Var) == nm6Var) {
                                return nm6Var;
                            }
                            obj4 = obj3;
                            y2Var3 = y2Var6;
                            y2Var5 = y2Var3;
                            obj3 = obj4;
                        }
                        r7o r7oVar = z7o.b;
                        if (!(obj3 instanceof t7o)) {
                        }
                        return Boolean.FALSE;
                    }
                    if (r5 == 3) {
                        obj4 = w2Var.m;
                        y2Var3 = w2Var.j;
                        qgg.h0(obj);
                        y2Var5 = y2Var3;
                        obj3 = obj4;
                        r7o r7oVar2 = z7o.b;
                        if (!(obj3 instanceof t7o)) {
                        }
                        return Boolean.FALSE;
                    }
                    if (r5 != 4) {
                        if (r5 != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = w2Var.l;
                        y2 y2Var7 = w2Var.j;
                        qgg.h0(obj);
                        com.yandex.passport.common.logger.d dVar4 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Can not make master enabled token because of error for: " + y2Var7.a, th);
                        }
                        return Boolean.FALSE;
                    }
                    a = w2Var.n;
                    obj3 = w2Var.m;
                    y2 y2Var8 = w2Var.j;
                    qgg.h0(obj);
                    y2Var4 = y2Var8;
                    com.yandex.passport.common.logger.d dVar32 = com.yandex.passport.common.logger.a.a;
                    y2Var5 = y2Var4;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Can not make master enabled token because of error for: " + y2Var4.a, a);
                        y2Var5 = y2Var4;
                    }
                    r7o r7oVar22 = z7o.b;
                    if (!(obj3 instanceof t7o)) {
                        com.yandex.passport.internal.report.reporters.i1 i1Var = this.c;
                        com.yandex.passport.common.core.f fVar4 = y2Var5.a;
                        i1Var.getClass();
                        fVar4.getClass();
                        i1Var.n(bd.d, new ff(fVar4));
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
                dVar = w2Var.k;
                y2Var2 = w2Var.j;
                qgg.h0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                com.yandex.passport.internal.l e = dVar.e(y2Var2.a);
                if (e != null && e.e.Z) {
                    return Boolean.FALSE;
                }
                ArrayList c = this.e.c(y2Var2.b, dVar);
                ArrayList arrayList = new ArrayList();
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    com.yandex.passport.internal.l e2 = dVar.e(((com.yandex.passport.internal.entities.n) it.next()).a);
                    if (e2 != null) {
                        arrayList.add(e2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((com.yandex.passport.internal.l) obj2).e.Z) {
                        break;
                    }
                }
                com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) obj2;
                if (lVar == null) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Neighbour account with Master related token not found for uid " + y2Var2.a, 8);
                    }
                    return Boolean.FALSE;
                }
                com.yandex.passport.internal.usecase.ui.e eVar = this.a;
                com.yandex.passport.common.core.f fVar5 = y2Var2.a;
                com.yandex.passport.common.core.f fVar6 = y2Var2.b;
                com.yandex.passport.common.core.f fVar7 = lVar.b;
                com.yandex.passport.internal.usecase.ui.c cVar = new com.yandex.passport.internal.usecase.ui.c(fVar5, fVar6, fVar7, lVar.d, fVar7.a, com.yandex.passport.internal.analytics.a.z, lVar.h());
                w2Var.j = y2Var2;
                w2Var.k = null;
                w2Var.l = null;
                w2Var.q = 2;
                obj = eVar.g(cVar, w2Var);
            }
        }
        w2Var = new w2(this, cg6Var);
        obj = w2Var.o;
        nm6 nm6Var2 = nm6.a;
        r5 = w2Var.q;
        y2 y2Var52 = 8;
        if (r5 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final Object b(com.yandex.passport.common.core.f fVar, boolean z, w2 w2Var) {
        com.yandex.passport.internal.flags.i iVar = this.d;
        int intValue = z ? ((Number) iVar.b(com.yandex.passport.internal.flags.o.d)).intValue() : ((Number) iVar.b(com.yandex.passport.internal.flags.o.c)).intValue();
        com.yandex.passport.internal.report.reporters.i1 i1Var = this.c;
        i1Var.getClass();
        fVar.getClass();
        i1Var.n(zc.d, new ff(fVar), new ve(intValue, 6));
        com.yandex.passport.internal.storage.c cVar = this.b;
        cVar.getClass();
        Object a = cVar.a.a(new com.yandex.passport.internal.storage.a(new com.yandex.passport.internal.storage.p(fVar, TimeUnit.MINUTES.toMillis(intValue) + System.currentTimeMillis()), null, 0), w2Var);
        nm6 nm6Var = nm6.a;
        if (a != nm6Var) {
            a = Unit.a;
        }
        return a == nm6Var ? a : Unit.a;
    }
}
