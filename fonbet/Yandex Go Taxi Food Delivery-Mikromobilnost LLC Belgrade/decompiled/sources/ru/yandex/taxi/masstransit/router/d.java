package ru.yandex.taxi.masstransit.router;

import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction;
import defpackage.atd0;
import defpackage.dw;
import defpackage.g18;
import defpackage.i2s0;
import defpackage.kr;
import defpackage.n6u;
import defpackage.rey;
import defpackage.t210;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.tu30;

/* loaded from: classes6.dex */
public final class d implements dw {
    public g18 A = g18.u1;
    public final tse a;
    public final tt2 b;
    public final atd0 c;
    public final ru.yandex.taxi.masstransit.main.router.a w;
    public final tu30 x;
    public final i2s0 y;
    public final ru.yandex.taxi.masstransit.address.interactor.i z;

    public d(tse tseVar, tt2 tt2Var, atd0 atd0Var, ru.yandex.taxi.masstransit.main.router.a aVar, tu30 tu30Var, i2s0 i2s0Var, ru.yandex.taxi.masstransit.address.interactor.i iVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = atd0Var;
        this.w = aVar;
        this.x = tu30Var;
        this.y = i2s0Var;
        this.z = iVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        t210 t210Var = (t210) krVar;
        this.A.cancel();
        TaxiExpectedDestinationAction.ShortcutInfo shortcutInfo = t210Var.d;
        String str = shortcutInfo != null ? shortcutInfo.a : null;
        if (str == null) {
            str = "";
        }
        this.A = new rey(1, this, str, tje.N(this.a, null, null, new MtExpectedDestinationActionHandler$handle$handleJob$1(t210Var, this, str, null), 3));
    }
}
