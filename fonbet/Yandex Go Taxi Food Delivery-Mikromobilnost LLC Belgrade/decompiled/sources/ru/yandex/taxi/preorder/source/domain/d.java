package ru.yandex.taxi.preorder.source.domain;

import defpackage.ik6;
import defpackage.oep0;
import defpackage.peb;
import defpackage.pft0;
import defpackage.pj;
import defpackage.qbl0;
import defpackage.tse;

/* loaded from: classes6.dex */
public final class d implements pft0 {
    public final ik6 a;
    public final peb b;
    public final com.yandex.go.navigation.screen.c c;
    public final qbl0 d;
    public final pj e;
    public final oep0 f;

    public d(ik6 ik6Var, peb pebVar, com.yandex.go.navigation.screen.c cVar, qbl0 qbl0Var, pj pjVar, oep0 oep0Var) {
        this.a = ik6Var;
        this.b = pebVar;
        this.c = cVar;
        this.d = qbl0Var;
        this.e = pjVar;
        this.f = oep0Var;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        com.yandex.go.coroutines.b.g(tseVar, null, null, new BridgeNotificationInteractor$onResume$1(this, null), 3);
    }
}
