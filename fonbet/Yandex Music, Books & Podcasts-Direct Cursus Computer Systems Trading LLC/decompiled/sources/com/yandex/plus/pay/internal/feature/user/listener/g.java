package com.yandex.plus.pay.internal.feature.user.listener;

import com.yandex.plus.pay.internal.di.m;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.d4t;
import defpackage.fkn;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.rqi;
import defpackage.xq0;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class g implements c {
    public static final qqi b = rqi.a();
    public final m a;

    public g(m mVar) {
        this.a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.pyc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(mm6 mm6Var, com.yandex.plus.domain.auth.api.e eVar, Continuation continuation) {
        e eVar2;
        int i;
        if (continuation instanceof e) {
            eVar2 = (e) continuation;
            int i2 = eVar2.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar2.l = i2 - Integer.MIN_VALUE;
                Object obj = eVar2.j;
                Object obj2 = nm6.a;
                i = eVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if ((eVar instanceof com.yandex.plus.domain.auth.api.a) || (eVar instanceof com.yandex.plus.domain.auth.api.c) || (eVar instanceof com.yandex.plus.domain.auth.api.d)) {
                        return Unit.a;
                    }
                    if (!(eVar instanceof com.yandex.plus.domain.auth.api.b)) {
                        b6e.s();
                        return null;
                    }
                    eVar2.l = 1;
                    if (d(eVar2) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        eVar2 = new e(this, continuation);
        Object obj3 = eVar2.j;
        Object obj22 = nm6.a;
        i = eVar2.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r10.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r3v7, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        f fVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        Object h0;
        try {
            if (cg6Var instanceof f) {
                fVar = (f) cg6Var;
                int i3 = fVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.l;
                    nm6Var = nm6.a;
                    i = fVar.n;
                    int i4 = 2;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = b;
                        fVar.j = qqiVar;
                        i2 = 0;
                        fVar.k = 0;
                        fVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = fVar.j;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = fVar.k;
                        ?? r3 = fVar.j;
                        qgg.h0(obj);
                        qqiVar = r3;
                    }
                    fkn fknVar = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.d) ((com.yandex.plus.pay.api.feature.inapp.restore.a) this.a.invoke())).i;
                    d4t d4tVar = new d4t(i4, 16, continuation);
                    fVar.j = qqiVar;
                    fVar.k = i2;
                    fVar.n = 2;
                    h0 = zsd.h0(fknVar, d4tVar, fVar);
                    if (h0 != nm6Var) {
                        oqiVar = qqiVar;
                        obj = h0;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            fkn fknVar2 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.d) ((com.yandex.plus.pay.api.feature.inapp.restore.a) this.a.invoke())).i;
            d4t d4tVar2 = new d4t(i4, 16, continuation);
            fVar.j = qqiVar;
            fVar.k = i2;
            fVar.n = 2;
            h0 = zsd.h0(fknVar2, d4tVar2, fVar);
            if (h0 != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        fVar = new f(this, cg6Var);
        Object obj2 = fVar.l;
        nm6Var = nm6.a;
        i = fVar.n;
        int i42 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }
}
