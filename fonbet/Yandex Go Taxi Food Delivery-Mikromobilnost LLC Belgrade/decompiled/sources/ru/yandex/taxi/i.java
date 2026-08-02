package ru.yandex.taxi;

import androidx.lifecycle.Lifecycle;
import defpackage.jy60;
import defpackage.kf4;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class i implements jy60 {
    public final tse a;
    public final Lifecycle b;
    public final ru.yandex.taxi.statebar.a c;
    public final kf4 d;
    public final ru.yandex.taxi.linked_order.a e;
    public final com.yandex.go.overdraft.ui.g f;
    public final ru.yandex.taxi.statebar.controller.a g;
    public final ru.yandex.taxi.inapp_calls.a h;

    public i(tse tseVar, Lifecycle lifecycle, ru.yandex.taxi.statebar.a aVar, kf4 kf4Var, ru.yandex.taxi.linked_order.a aVar2, com.yandex.go.overdraft.ui.g gVar, ru.yandex.taxi.statebar.controller.a aVar3, ru.yandex.taxi.inapp_calls.a aVar4) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = aVar;
        this.d = kf4Var;
        this.e = aVar2;
        this.f = gVar;
        this.g = aVar3;
        this.h = aVar4;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "StateBarActivityLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new StateBarActivityLifecycleListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
