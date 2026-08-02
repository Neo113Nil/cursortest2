package ru.yandex.taxi.am;

import androidx.lifecycle.Lifecycle;
import defpackage.a2f0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.ip90;
import defpackage.mj;
import defpackage.pux;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class d implements a2f0 {
    public final tse a;
    public final Lifecycle b;
    public final ru.yandex.taxi.zalogin.d c;
    public final ip90 d;
    public final ru.yandex.taxi.activity.g e;
    public final h f;
    public final pux g;
    public final i3y h;
    public final i3y i;
    public final String j = "AccountActivityLifecycleInteractor";

    public d(tse tseVar, Lifecycle lifecycle, ru.yandex.taxi.zalogin.d dVar, ip90 ip90Var, ru.yandex.taxi.activity.g gVar, h hVar, pux puxVar, h3y h3yVar, h3y h3yVar2) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = dVar;
        this.d = ip90Var;
        this.e = gVar;
        this.f = hVar;
        this.g = puxVar;
        this.h = kotlin.a.a(new mj(h3yVar, 0));
        this.i = kotlin.a.a(new mj(h3yVar2, 1));
    }

    @Override // defpackage.a2f0
    public final void c() {
        this.d.a.getValue();
        AccountActivityLifecycleInteractor$onActivityCreate$1 accountActivityLifecycleInteractor$onActivityCreate$1 = new AccountActivityLifecycleInteractor$onActivityCreate$1(null, this);
        tse tseVar = this.a;
        tje.N(tseVar, null, null, accountActivityLifecycleInteractor$onActivityCreate$1, 3);
        tje.N(tseVar, null, null, new AccountActivityLifecycleInteractor$onActivityCreate$2(null, this), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.j;
    }
}
