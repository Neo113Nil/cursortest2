package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.jqr;
import defpackage.pwy0;
import defpackage.roj0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vfx0;

/* loaded from: classes6.dex */
public final class l0 {
    public final roj0 a;
    public final tt2 b;
    public final ru.yandex.taxi.summary.requirements.list.mapper.b c;
    public final ru.yandex.taxi.summary.requirements.list.recycler.i d;
    public final pwy0 e;
    public final vfx0 f;

    public l0(roj0 roj0Var, tt2 tt2Var, ru.yandex.taxi.summary.requirements.list.mapper.b bVar, ru.yandex.taxi.summary.requirements.list.recycler.i iVar, pwy0 pwy0Var, vfx0 vfx0Var) {
        this.a = roj0Var;
        this.b = tt2Var;
        this.c = bVar;
        this.d = iVar;
        this.e = pwy0Var;
        this.f = vfx0Var;
    }

    public final tpr a() {
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(this.a.e(), this.e.a(), new TariffRulesStateInteractor$tariffRulesStateFlow$1(this, null))), new TariffRulesStateInteractor$tariffRulesStateFlow$2(this, null), 3);
        this.b.getClass();
        return kotlinx.coroutines.flow.e.F(jqrVar, uyj.a);
    }
}
