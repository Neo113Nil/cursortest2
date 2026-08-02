package ru.yandex.taxi.am.early_authorization;

import defpackage.gyn;
import defpackage.h3y;
import defpackage.vw60;
import defpackage.zan;

/* loaded from: classes9.dex */
public final class h implements vw60 {
    public final h3y a;
    public final gyn b;

    public h(h3y h3yVar, gyn gynVar) {
        this.a = h3yVar;
        this.b = gynVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        this.b.getClass();
        zan zanVar = (zan) this.a.get();
        com.yandex.go.coroutines.b.g(zanVar.d, null, null, new EarlyAuthorizationOnActivityCreateListener$onActivityCreate$1(zanVar, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "early-authorization-on-activity-create";
    }
}
