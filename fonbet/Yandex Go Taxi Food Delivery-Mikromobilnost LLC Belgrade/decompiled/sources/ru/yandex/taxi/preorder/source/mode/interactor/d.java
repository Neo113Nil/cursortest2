package ru.yandex.taxi.preorder.source.mode.interactor;

import defpackage.fy01;
import defpackage.jgt0;
import defpackage.pft0;
import defpackage.tse;
import defpackage.tt2;

/* loaded from: classes6.dex */
public final class d implements pft0 {
    public final tt2 a;
    public final jgt0 b;
    public final fy01 c;

    public d(tt2 tt2Var, jgt0 jgt0Var, fy01 fy01Var) {
        this.a = tt2Var;
        this.b = jgt0Var;
        this.c = fy01Var;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        com.yandex.go.coroutines.b.g(tseVar, null, null, new SourcePointBadgeVisibilityInteractor$onResume$1(this, null), 3);
    }
}
