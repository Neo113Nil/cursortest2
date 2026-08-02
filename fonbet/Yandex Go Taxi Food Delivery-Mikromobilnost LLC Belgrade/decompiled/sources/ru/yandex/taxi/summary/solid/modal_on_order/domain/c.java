package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import defpackage.b1g;
import defpackage.dmv0;
import defpackage.emv0;
import defpackage.imv0;
import defpackage.jas0;
import defpackage.llv0;
import defpackage.oep0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wiq0;
import defpackage.x880;
import defpackage.y880;

/* loaded from: classes6.dex */
public final class c implements y880 {
    public final tse a;
    public final dmv0 b;
    public final jas0 c;
    public final emv0 d;
    public final llv0 e;
    public final imv0 f;
    public final b1g g;
    public final oep0 h;
    public final wiq0 i;

    public c(tse tseVar, dmv0 dmv0Var, jas0 jas0Var, emv0 emv0Var, llv0 llv0Var, imv0 imv0Var, b1g b1gVar, oep0 oep0Var, wiq0 wiq0Var) {
        this.a = tseVar;
        this.b = dmv0Var;
        this.c = jas0Var;
        this.d = emv0Var;
        this.e = llv0Var;
        this.f = imv0Var;
        this.g = b1gVar;
        this.h = oep0Var;
        this.i = wiq0Var;
    }

    @Override // defpackage.y880
    public final void a(x880 x880Var) {
        tje.N(this.a, null, null, new SummaryPromotionsOrderPart$execute$1(this, x880Var, null), 3);
    }
}
