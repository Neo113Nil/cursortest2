package ru.yandex.taxi.cashback.interactors;

import defpackage.h3y;
import defpackage.jy60;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wk21;

/* loaded from: classes9.dex */
public final class m implements jy60 {
    public final ru.yandex.taxi.plus.sdk.prefetch.a a;
    public final tse b;
    public final tt2 c;
    public final h3y d;
    public final wk21 e;

    public m(ru.yandex.taxi.plus.sdk.prefetch.a aVar, tse tseVar, tt2 tt2Var, h3y h3yVar, wk21 wk21Var) {
        this.a = aVar;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = h3yVar;
        this.e = wk21Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "UpdatePlusDataOnZoneChangeInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.b, mdh.b, null, new UpdatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1(null, this), 2);
    }
}
