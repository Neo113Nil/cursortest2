package defpackage;

import android.app.Application;
import android.os.Handler;

/* loaded from: classes4.dex */
public final class pom implements gfu {
    public final Application a;
    public final sdk b;
    public final Handler c;
    public final String d;
    public final ik0 e;
    public final g0c f;

    public pom(Application application, sdk sdkVar, Handler handler, String str, ik0 ik0Var, g0c g0cVar) {
        application.getClass();
        sdkVar.getClass();
        g0cVar.getClass();
        this.a = application;
        this.b = sdkVar;
        this.c = handler;
        this.d = str;
        this.e = ik0Var;
        this.f = g0cVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        if (!cls.equals(eqm.class)) {
            xq0.q("Unknown view model");
            return null;
        }
        return new eqm(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
