package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.axm;
import defpackage.dqe0;
import defpackage.dvm;
import defpackage.ibn;
import defpackage.iom0;
import defpackage.mvm;
import defpackage.orx0;
import defpackage.roj0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vfx0;
import defpackage.ynm0;
import defpackage.zuj0;
import defpackage.zy11;

/* loaded from: classes6.dex */
public final class y {
    public final roj0 a;
    public final dqe0 b;
    public final mvm c;
    public final axm d;
    public final ynm0 e;
    public final dvm f;
    public final iom0 g;
    public final orx0 h;
    public final zuj0 i;
    public final tt2 j;
    public final ru.yandex.taxi.requirements.experiments.f k;
    public final ibn l;
    public final vfx0 m;

    public y(roj0 roj0Var, dqe0 dqe0Var, mvm mvmVar, axm axmVar, ynm0 ynm0Var, dvm dvmVar, iom0 iom0Var, orx0 orx0Var, zuj0 zuj0Var, tt2 tt2Var, ru.yandex.taxi.requirements.experiments.f fVar, ibn ibnVar, vfx0 vfx0Var) {
        this.a = roj0Var;
        this.b = dqe0Var;
        this.c = mvmVar;
        this.d = axmVar;
        this.e = ynm0Var;
        this.f = dvmVar;
        this.g = iom0Var;
        this.h = orx0Var;
        this.i = zuj0Var;
        this.j = tt2Var;
        this.k = fVar;
        this.l = ibnVar;
        this.m = vfx0Var;
    }

    public final tpr a() {
        roj0 roj0Var = this.a;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(new x(roj0Var.d(), this)), com.yandex.go.coroutines.b.d(this.d.c, new RequirementsDueStateInteractor$dueStateFlow$$inlined$start$1(zy11.a, null)), roj0Var.e(), new RequirementsDueStateInteractor$dueStateFlow$1(this, null)));
        this.j.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
