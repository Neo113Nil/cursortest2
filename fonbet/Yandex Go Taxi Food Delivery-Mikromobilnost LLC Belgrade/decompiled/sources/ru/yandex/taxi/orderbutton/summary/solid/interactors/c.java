package ru.yandex.taxi.orderbutton.summary.solid.interactors;

import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.orderbutton.summary.base.interactors.i;

/* loaded from: classes6.dex */
public final class c {
    public final i a;
    public final tt2 b;

    public c(i iVar, tt2 tt2Var) {
        this.a = iVar;
        this.b = tt2Var;
    }

    public final tpr a(tpr tprVar, r0 r0Var, boolean z, boolean z2) {
        tpr t = e.t(new m0(this.a.b(tprVar, r0Var, z), e.t(new b(tprVar)), new SolidSummaryButtonModelInteractor$modelFlow$2(z2, z, null)));
        this.b.getClass();
        return e.F(t, uyj.a);
    }
}
