package com.yandex.plus.pay.internal.feature.family;

import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.internal.model.PlusPayWebFamilyInviteResult;
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
public final class d {
    public final b a;
    public final com.yandex.plus.pay.log.impl.b b;

    public d(b bVar, com.yandex.plus.pay.log.impl.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.plus.pay.log.impl.b bVar;
        Throwable th;
        wis e;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof c) {
                cVar = (c) cg6Var;
                int i2 = cVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = cVar.k;
                    nm6 nm6Var = nm6.a;
                    i = cVar.m;
                    if (i != 0) {
                        qgg.h0(obj2);
                        com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                        try {
                            r7o r7oVar = z7o.b;
                            b bVar3 = this.a;
                            cVar.j = bVar2;
                            cVar.m = 1;
                            Object a2 = bVar3.a(cVar);
                            if (a2 == nm6Var) {
                                return nm6Var;
                            }
                            bVar = bVar2;
                            obj2 = a2;
                        } catch (wis e2) {
                            bVar = bVar2;
                            e = e2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th2) {
                            bVar = bVar2;
                            th = th2;
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
                        bVar = cVar.j;
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
                    obj = (PlusPayWebFamilyInviteResult) obj2;
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
            obj = (PlusPayWebFamilyInviteResult) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a != null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        cVar = new c(this, cg6Var);
        Object obj22 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
    }
}
