package ru.yandex.taxi.am;

import androidx.lifecycle.Lifecycle;
import defpackage.hbp0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.t9f0;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vw60;

/* loaded from: classes9.dex */
public final class v implements vw60 {
    public final r a;
    public final com.yandex.go.preload.e b;
    public final Lifecycle c;
    public final tse d;
    public final t9f0 e;

    public v(r rVar, com.yandex.go.preload.e eVar, Lifecycle lifecycle, tse tseVar, t9f0 t9f0Var) {
        this.a = rVar;
        this.b = eVar;
        this.c = lifecycle;
        this.d = tseVar;
        this.e = t9f0Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        r rVar = this.a;
        rVar.m.a.getValue();
        if (rVar.s) {
            rVar.o.a();
            hbp0 hbp0Var = rVar.o;
            rVar.k.getClass();
            sjh sjhVar = uyj.a;
            hbp0.e(hbp0Var, mdh.b, null, new AutoLogin$init$1(rVar, null), 2);
            rVar.a.a(rVar.p);
        }
        com.yandex.go.coroutines.b.g(this.d, null, null, new AutologinOnActivityCreateListener$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "autologin-on-activity-create";
    }
}
