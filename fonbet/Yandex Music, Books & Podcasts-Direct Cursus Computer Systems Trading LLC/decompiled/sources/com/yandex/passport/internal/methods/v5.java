package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.avf;
import defpackage.c5b;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class v5 {
    public final w5 a;
    public final c5b b = c5b.a;

    public v5(w5 w5Var) {
        this.a = w5Var;
    }

    public List a() {
        return this.b;
    }

    public abstract f b();

    public final Object c(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
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
        return z7oVar != null ? z7oVar.a : avf.u(b().f(bundle));
    }
}
