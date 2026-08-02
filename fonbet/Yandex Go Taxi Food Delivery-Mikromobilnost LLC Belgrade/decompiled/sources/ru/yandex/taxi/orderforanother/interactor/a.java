package ru.yandex.taxi.orderforanother.interactor;

import defpackage.h3y;
import defpackage.ro0;
import defpackage.tje;
import defpackage.tse;
import defpackage.x880;
import defpackage.y880;
import defpackage.z880;

/* loaded from: classes6.dex */
public final class a implements y880 {
    public final tse a;
    public final h3y b;
    public final z880 c;
    public final ro0 d;

    public a(tse tseVar, h3y h3yVar, z880 z880Var, ro0 ro0Var) {
        this.a = tseVar;
        this.b = h3yVar;
        this.c = z880Var;
        this.d = ro0Var;
    }

    @Override // defpackage.y880
    public final void a(x880 x880Var) {
        tje.N(this.a, null, null, new OrderForAnotherOrderPart$execute$1(this, x880Var, null), 3);
    }
}
