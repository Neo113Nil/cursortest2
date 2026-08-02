package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.z7o;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class b {
    public final h a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final xdr c;

    public b(h hVar, f fVar, com.yandex.plus.pay.log.impl.b bVar) {
        hVar.getClass();
        fVar.getClass();
        bVar.getClass();
        this.a = hVar;
        this.b = bVar;
        this.c = hVar.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        a aVar;
        int i;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof a) {
                aVar = (a) cg6Var;
                int i2 = aVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.k;
                    nm6 nm6Var = nm6.a;
                    i = aVar.m;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                        bVar2.getClass();
                        bVar2.c(aVar2, "PlusPayUserService", "updateUserStatus()");
                        try {
                            r7o r7oVar = z7o.b;
                            h hVar = this.a;
                            aVar.j = bVar2;
                            aVar.m = 1;
                            obj2 = hVar.a(aVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            bVar = bVar2;
                        } catch (wis e) {
                            e = e;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = aVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (PlusPayUserStatus) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayUserStatus plusPayUserStatus = (PlusPayUserStatus) obj;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
                    bVar2.getClass();
                    bVar2.c(aVar3, "PlusPayUserService", "updateUserStatus() = " + plusPayUserStatus);
                    return plusPayUserStatus;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayUserStatus) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        aVar = new a(this, cg6Var);
        Object obj22 = aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aVar.m;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
    }
}
