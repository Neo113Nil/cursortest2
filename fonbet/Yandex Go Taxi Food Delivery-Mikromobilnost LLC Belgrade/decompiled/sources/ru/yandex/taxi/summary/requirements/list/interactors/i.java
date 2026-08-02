package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.amc;
import defpackage.ga0;
import defpackage.roj0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vfx0;

/* loaded from: classes6.dex */
public final class i {
    public final roj0 a;
    public final vfx0 b;
    public final amc c;
    public final ru.yandex.taxi.preorder.repositories.g d;
    public final ga0 e;
    public final tt2 f;

    public i(roj0 roj0Var, vfx0 vfx0Var, amc amcVar, ru.yandex.taxi.preorder.repositories.g gVar, ga0 ga0Var, tt2 tt2Var) {
        this.a = roj0Var;
        this.b = vfx0Var;
        this.c = amcVar;
        this.d = gVar;
        this.e = ga0Var;
        this.f = tt2Var;
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(this.a.e(), this.d.e(), new CostCenterItemStateInteractor$availableFlow$1(null, this))), new CostCenterItemStateInteractor$costCenterStateFlow$$inlined$flatMapLatest$1(null, this)));
        this.f.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
