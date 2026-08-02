package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import defpackage.ld;
import defpackage.tje;
import defpackage.tse;
import defpackage.x880;
import defpackage.y880;

/* loaded from: classes6.dex */
public final class a implements y880 {
    public final tse a;
    public final ld b;
    public final ru.yandex.taxi.sdc.router.a c;

    public a(tse tseVar, ld ldVar, ru.yandex.taxi.sdc.router.a aVar) {
        this.a = tseVar;
        this.b = ldVar;
        this.c = aVar;
    }

    @Override // defpackage.y880
    public final void a(x880 x880Var) {
        tje.N(this.a, null, null, new AcceptanceOrderPart$execute$1(this, x880Var, null), 3);
    }
}
