package ru.yandex.taxi.deeplinks;

import android.content.Intent;
import defpackage.ac20;
import defpackage.as21;
import defpackage.tje;
import defpackage.tse;
import defpackage.weu;
import defpackage.zf;

/* loaded from: classes9.dex */
public final class g {
    public final as21 a;
    public final zf b;
    public final ac20 c;

    public g(as21 as21Var, zf zfVar, ac20 ac20Var) {
        this.a = as21Var;
        this.b = zfVar;
        this.c = ac20Var;
    }

    public final void a(tse tseVar, Intent intent, weu weuVar) {
        if (this.a.a("FIELD_DEFERRED_DEEPLINK_HANDLED", false)) {
            return;
        }
        tje.N(tseVar, null, null, new DeferredDeeplinkInteractor$requestDeferredIntent$1(this, intent, weuVar, null), 3);
    }
}
