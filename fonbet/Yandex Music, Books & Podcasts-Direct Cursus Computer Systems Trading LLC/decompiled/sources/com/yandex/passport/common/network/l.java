package com.yandex.passport.common.network;

import defpackage.cg6;
import defpackage.d0o;
import defpackage.es3;
import defpackage.l3o;
import defpackage.mkn;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class l extends com.yandex.passport.common.domain.a {
    public final OkHttpClient b;

    public l(com.yandex.passport.common.coroutine.a aVar, OkHttpClient okHttpClient) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = okHttpClient;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:21|22))(5:23|24|(1:26)|27|(1:29))|11|12|(2:14|(1:16))|17|18))|36|6|7|(0)(0)|11|12|(0)|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(d0o d0oVar, cg6 cg6Var) {
        k kVar;
        int i;
        Throwable a;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kVar.j;
                nm6 nm6Var = nm6.a;
                i = kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Running request " + d0oVar, 8);
                    }
                    es3 b = this.b.b(d0oVar);
                    kVar.l = 1;
                    obj = com.yandex.plus.core.locale.b.f((mkn) b, kVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object t7oVar = (l3o) obj;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(t7oVar);
                if (a != null) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "OkHttp request failed.", a);
                    }
                }
                return new z7o(t7oVar);
            }
        }
        kVar = new k(this, cg6Var);
        Object obj2 = kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kVar.l;
        if (i != 0) {
        }
        Object t7oVar2 = (l3o) obj2;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(t7oVar2);
        if (a != null) {
        }
        return new z7o(t7oVar2);
    }
}
