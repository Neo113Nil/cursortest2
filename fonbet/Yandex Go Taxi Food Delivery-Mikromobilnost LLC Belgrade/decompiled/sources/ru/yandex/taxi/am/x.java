package ru.yandex.taxi.am;

import android.app.Application;
import defpackage.gtq0;
import defpackage.hjt;
import defpackage.jbh;
import defpackage.pzt0;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.ww60;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class x implements ww60 {
    public final Application a;
    public final tt2 b;
    public final ru.yandex.taxi.am.token.a c;
    public final k d;
    public final t1b0 e;
    public pzt0 f;

    public x(rqo rqoVar, Application application, tt2 tt2Var, ru.yandex.taxi.am.token.a aVar, k kVar) {
        this.a = application;
        this.b = tt2Var;
        this.c = aVar;
        this.d = kVar;
        this.e = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.FORCED_PASSPORT_PROCESS_START);
    }

    @Override // defpackage.ww60
    public final void f() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        gtq0.V(this.a);
        this.b.getClass();
        this.f = tje.N(hjt.a, uyj.a, null, new ForcedPassportProcessStartInteractor$tryStartPassportProcess$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ForcedPassportProcessStartInteractor";
    }
}
