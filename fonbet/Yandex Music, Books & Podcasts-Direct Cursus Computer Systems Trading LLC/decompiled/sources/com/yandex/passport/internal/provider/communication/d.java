package com.yandex.passport.internal.provider.communication;

import android.os.Bundle;
import defpackage.avf;
import defpackage.r7o;
import defpackage.rzm;
import defpackage.t7o;
import defpackage.t8a;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class d {
    public static final com.yandex.passport.common.coroutine.d a = new com.yandex.passport.common.coroutine.d(5);
    public static final com.yandex.passport.common.coroutine.d b = new com.yandex.passport.common.coroutine.d(6);
    public static final com.yandex.passport.common.coroutine.d c = new com.yandex.passport.common.coroutine.d(7);
    public static com.yandex.passport.internal.flags.experiments.p d;

    public static com.yandex.passport.internal.flags.experiments.p a() {
        com.yandex.passport.internal.flags.experiments.p pVar = new com.yandex.passport.internal.flags.experiments.p(1);
        rzm b2 = t8a.b(a);
        pVar.b = b2;
        pVar.c = t8a.b(new com.yandex.passport.internal.di.module.d(b2, 9));
        pVar.d = t8a.b(new com.yandex.passport.internal.di.module.d((rzm) pVar.b, 10));
        return pVar;
    }

    public static Object b(Bundle bundle) {
        i iVar = (i) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "HostResponse");
        if (iVar != null) {
            return avf.u(iVar);
        }
        Serializable serializable = bundle.getSerializable(Constants.KEY_EXCEPTION);
        z7o z7oVar = null;
        if (!(serializable instanceof Throwable)) {
            serializable = null;
        }
        Throwable th = (Throwable) serializable;
        if (th != null) {
            r7o r7oVar = z7o.b;
            z7oVar = new z7o(new t7o(th));
        }
        if (z7oVar != null) {
            return z7oVar.a;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unknown object in bundle");
        r7o r7oVar2 = z7o.b;
        return new t7o(illegalStateException);
    }
}
