package com.yandex.plus.home.payment.google;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.rqi;
import defpackage.xq0;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class g {
    public final qqi a = rqi.a();
    public volatile com.yandex.plus.home.feature.webviews.internalapi.payment.a b = null;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        if (r9.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #0 {all -> 0x007c, blocks: (B:26:0x005c, B:28:0x0060), top: B:25:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [oqi] */
    /* JADX WARN: Type inference failed for: r8v13, types: [oqi] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [oqi] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a aVar, cg6 cg6Var) {
        e eVar;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        ?? r8;
        com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar2;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i3 = eVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.m;
                    nm6 nm6Var = nm6.a;
                    i = eVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar3 = this.b;
                        if (aVar3 != null) {
                            return aVar3;
                        }
                        qqiVar = this.a;
                        eVar.j = aVar;
                        eVar.k = qqiVar;
                        i2 = 0;
                        eVar.l = 0;
                        eVar.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r8 = eVar.k;
                            try {
                                qgg.h0(obj);
                                r8 = r8;
                                this.b = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj;
                                aVar2 = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj;
                                qqiVar = r8;
                                qqiVar.b(null);
                                return aVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                r8.b(null);
                                throw th;
                            }
                        }
                        int i4 = eVar.l;
                        ?? r2 = eVar.k;
                        a aVar4 = eVar.j;
                        qgg.h0(obj);
                        qqiVar = r2;
                        i2 = i4;
                        aVar = aVar4;
                    }
                    aVar2 = this.b;
                    if (aVar2 == null) {
                        eVar.j = null;
                        eVar.k = qqiVar;
                        eVar.l = i2;
                        eVar.o = 2;
                        Object invoke = aVar.invoke(eVar);
                        if (invoke != nm6Var) {
                            qqi qqiVar2 = qqiVar;
                            obj = invoke;
                            r8 = qqiVar2;
                            this.b = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj;
                            aVar2 = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj;
                            qqiVar = r8;
                        }
                        return nm6Var;
                    }
                    qqiVar.b(null);
                    return aVar2;
                }
            }
            aVar2 = this.b;
            if (aVar2 == null) {
            }
            qqiVar.b(null);
            return aVar2;
        } catch (Throwable th3) {
            qqi qqiVar3 = qqiVar;
            th = th3;
            r8 = qqiVar3;
            r8.b(null);
            throw th;
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.m;
        nm6 nm6Var2 = nm6.a;
        i = eVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a aVar, cg6 cg6Var) {
        f fVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Object invoke;
        g gVar;
        try {
            if (cg6Var instanceof f) {
                fVar = (f) cg6Var;
                int i3 = fVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.p = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.n;
                    nm6Var = nm6.a;
                    i = fVar.p;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.a;
                        fVar.j = aVar;
                        fVar.k = qqiVar;
                        i2 = 0;
                        fVar.m = 0;
                        fVar.p = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gVar = fVar.l;
                            oqiVar = fVar.k;
                            try {
                                qgg.h0(obj);
                                gVar.b = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj;
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = fVar.m;
                        ?? r2 = fVar.k;
                        a aVar2 = fVar.j;
                        qgg.h0(obj);
                        qqiVar = r2;
                        i2 = i4;
                        aVar = aVar2;
                    }
                    fVar.j = null;
                    fVar.k = qqiVar;
                    fVar.l = this;
                    fVar.m = i2;
                    fVar.p = 2;
                    invoke = aVar.invoke(fVar);
                    if (invoke != nm6Var) {
                        oqiVar = qqiVar;
                        obj = invoke;
                        gVar = this;
                        gVar.b = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            fVar.j = null;
            fVar.k = qqiVar;
            fVar.l = this;
            fVar.m = i2;
            fVar.p = 2;
            invoke = aVar.invoke(fVar);
            if (invoke != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th2) {
            th = th2;
            oqiVar = qqiVar;
            oqiVar.b(null);
            throw th;
        }
        fVar = new f(this, cg6Var);
        Object obj2 = fVar.n;
        nm6Var = nm6.a;
        i = fVar.p;
        if (i != 0) {
        }
    }
}
