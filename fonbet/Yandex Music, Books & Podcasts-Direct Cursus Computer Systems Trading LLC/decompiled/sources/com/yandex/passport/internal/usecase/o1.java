package com.yandex.passport.internal.usecase;

import com.yandex.passport.internal.report.ad;
import com.yandex.passport.internal.report.ff;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class o1 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.internal.storage.c b;
    public final x2 c;
    public final com.yandex.passport.internal.flags.i d;
    public final com.yandex.passport.internal.report.reporters.i1 e;

    public o1(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.storage.c cVar, x2 x2Var, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.report.reporters.i1 i1Var) {
        eVar.getClass();
        cVar.getClass();
        x2Var.getClass();
        iVar.getClass();
        i1Var.getClass();
        this.a = eVar;
        this.b = cVar;
        this.c = x2Var;
        this.d = iVar;
        this.e = i1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(8:11|12|13|14|(3:17|(2:19|20)(1:22)|15)|23|24|25)(2:27|28))(2:29|30))(2:32|(2:34|35)(11:36|(4:39|(3:44|45|46)|47|37)|50|51|(4:53|(2:56|54)|57|58)|59|(2:62|60)|63|64|(1:66)(1:70)|(2:68|20)(1:69)))|31|14|(1:15)|23|24|25))|75|6|7|(0)(0)|31|14|(1:15)|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0034, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013a, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013c, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "An error occurred while making all tokens master related: " + r14, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002e, B:15:0x0109, B:17:0x010f, B:30:0x0041, B:31:0x0102, B:36:0x005c, B:37:0x006f, B:39:0x0075, B:42:0x0080, B:45:0x0086, B:51:0x008a, B:53:0x0092, B:54:0x00a1, B:56:0x00a7, B:58:0x00b3, B:59:0x00c4, B:60:0x00d3, B:62:0x00d9, B:64:0x00e5, B:70:0x00fb), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        n1 n1Var;
        int i;
        com.yandex.passport.internal.d dVar;
        ArrayList arrayList;
        Iterator it;
        int i2;
        if (cg6Var instanceof n1) {
            n1Var = (n1) cg6Var;
            int i3 = n1Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n1Var.p = i3 - Integer.MIN_VALUE;
                Object obj = n1Var.n;
                nm6 nm6Var = nm6.a;
                i = n1Var.p;
                int i4 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!((Boolean) this.d.b(com.yandex.passport.internal.flags.o.b)).booleanValue()) {
                        return Unit.a;
                    }
                    com.yandex.passport.internal.d a = this.a.a();
                    ArrayList g = a.g();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = g.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) next;
                        if (lVar.c != null && !lVar.e.Z) {
                            arrayList2.add(next);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        com.yandex.passport.internal.report.reporters.i1 i1Var = this.e;
                        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((com.yandex.passport.internal.l) it3.next()).b);
                        }
                        i1Var.getClass();
                        i1Var.n(ad.d, new ff(arrayList3));
                    }
                    com.yandex.passport.internal.storage.c cVar = this.b;
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((com.yandex.passport.internal.l) it4.next()).b);
                    }
                    n1Var.j = a;
                    n1Var.k = arrayList2;
                    n1Var.p = 1;
                    Object a2 = cVar.a.a(new com.yandex.passport.internal.storage.a(arrayList4, continuation, i4), n1Var);
                    if (a2 != nm6.a) {
                        a2 = Unit.a;
                    }
                    if (a2 == nm6Var) {
                        return nm6Var;
                    }
                    dVar = a;
                    arrayList = arrayList2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i5 = n1Var.m;
                        it = n1Var.l;
                        dVar = n1Var.j;
                        qgg.h0(obj);
                        i2 = i5;
                        while (it.hasNext()) {
                            com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) it.next();
                            x2 x2Var = this.c;
                            com.yandex.passport.common.core.f fVar = lVar2.b;
                            com.yandex.passport.common.core.f fVar2 = lVar2.c;
                            fVar2.getClass();
                            y2 y2Var = new y2(fVar, fVar2, dVar);
                            n1Var.j = dVar;
                            n1Var.k = null;
                            n1Var.l = it;
                            n1Var.m = i2;
                            n1Var.p = 2;
                            if (x2Var.a(y2Var, n1Var) == nm6Var) {
                                return nm6Var;
                            }
                        }
                        return Unit.a;
                    }
                    arrayList = n1Var.k;
                    dVar = n1Var.j;
                    qgg.h0(obj);
                }
                it = arrayList.iterator();
                i2 = 0;
                while (it.hasNext()) {
                }
                return Unit.a;
            }
        }
        n1Var = new n1(this, cg6Var);
        Object obj2 = n1Var.n;
        nm6 nm6Var2 = nm6.a;
        i = n1Var.p;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        it = arrayList.iterator();
        i2 = 0;
        while (it.hasNext()) {
        }
        return Unit.a;
    }
}
