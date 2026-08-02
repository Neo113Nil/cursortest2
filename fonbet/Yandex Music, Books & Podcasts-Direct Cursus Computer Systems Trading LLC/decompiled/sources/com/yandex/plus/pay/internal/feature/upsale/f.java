package com.yandex.plus.pay.internal.feature.upsale;

import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class f implements com.yandex.plus.pay.api.feature.upsale.a {
    public final a a;
    public final com.yandex.plus.pay.log.impl.b b;

    public f(a aVar, com.yandex.plus.pay.log.impl.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, cg6 cg6Var) {
        e eVar;
        int i;
        Throwable th;
        com.yandex.plus.pay.log.impl.b bVar;
        wis e;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i2 = eVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = eVar.k;
                    nm6 nm6Var = nm6.a;
                    i = eVar.m;
                    if (i != 0) {
                        qgg.h0(obj2);
                        com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                        try {
                            r7o r7oVar = z7o.b;
                            a aVar = this.a;
                            eVar.j = bVar2;
                            eVar.m = 1;
                            Object b = ((d) aVar).b(offer, eVar);
                            if (b == nm6Var) {
                                return nm6Var;
                            }
                            obj2 = b;
                            bVar = bVar2;
                        } catch (wis e2) {
                            e = e2;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVar2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = eVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e3) {
                            e = e3;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        }
                    }
                    obj = (PlusPayCompositeUpsale) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a != null) {
                        return obj;
                    }
                    if (a instanceof com.yandex.plus.pay.api.exception.a) {
                        throw a;
                    }
                    com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                    throw new PlusPayUnexpectedException(a);
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayCompositeUpsale) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a != null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        eVar = new e(this, cg6Var);
        Object obj22 = eVar.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar.m;
    }
}
