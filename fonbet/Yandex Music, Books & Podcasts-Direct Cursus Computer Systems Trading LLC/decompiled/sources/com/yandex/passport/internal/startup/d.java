package com.yandex.passport.internal.startup;

import android.content.Context;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.methods.x4;
import defpackage.a4g;
import defpackage.b43;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.f9f;
import defpackage.gld;
import defpackage.im6;
import defpackage.j5h;
import defpackage.nm6;
import defpackage.ocu;
import defpackage.qgg;
import defpackage.rre;
import defpackage.tf6;
import defpackage.vz1;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public static final d a = new d();
    public static boolean b;
    public static Boolean c;
    public static final tf6 d;

    static {
        b43 b43Var = new b43(rre.f, 16);
        dq7 dq7Var = ca8.a;
        d = gld.e(j5h.a.g.plus(a4g.n()).plus(new im6("HostProcessForegroundObserver")).plus(b43Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, boolean z, cg6 cg6Var) {
        a aVar;
        int i;
        Throwable a2;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.k = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.k;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(c, Boolean.valueOf(z))) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, vz1.q("isInBackground ", " skipped", z), 8);
                        }
                        return Unit.a;
                    }
                    c = Boolean.valueOf(z);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isInBackground " + z, 8);
                    }
                    dq7 dq7Var = ca8.a;
                    ocu ocuVar = new ocu(fVar, new x4(z), new f9f[0], continuation, 21);
                    aVar.k = 1;
                    obj = x97.V(dq7Var, ocuVar, aVar);
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
                a2 = z7o.a(((z7o) obj).a);
                if (a2 != null && com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Failed to send app background state to passport process " + a2, 8);
                }
                return Unit.a;
            }
        }
        aVar = new a(cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.k;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        a2 = z7o.a(((z7o) obj2).a);
        if (a2 != null) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Failed to send app background state to passport process " + a2, 8);
        }
        return Unit.a;
    }

    public final void b(Context context, f fVar) {
        context.getClass();
        fVar.getClass();
        synchronized (this) {
            Continuation continuation = null;
            if (b) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "HostProcessForegroundObserver already started", 8);
                }
            } else {
                x97.y(d, null, null, new b(fVar, continuation, 2), 3);
                b = true;
            }
        }
    }
}
