package ru.yandex.taxi.preorder.summary.selector.ui.interactor;

import defpackage.aqv0;
import defpackage.bgx0;
import defpackage.fk31;
import defpackage.h3y;
import defpackage.jha1;
import defpackage.pwy0;
import defpackage.wiq0;

/* loaded from: classes6.dex */
public final class f {
    public final wiq0 a;
    public final fk31 b;
    public final aqv0 c;
    public final h3y d;
    public final pwy0 e;
    public final bgx0 f;

    public f(wiq0 wiq0Var, fk31 fk31Var, aqv0 aqv0Var, h3y h3yVar, pwy0 pwy0Var, bgx0 bgx0Var) {
        this.a = wiq0Var;
        this.b = fk31Var;
        this.c = aqv0Var;
        this.d = h3yVar;
        this.e = pwy0Var;
        this.f = bgx0Var;
    }

    public final e a() {
        return new e(kotlinx.coroutines.flow.e.m(this.b.a(new c(jha1.e(this.a))), this.c.a(), this.e.a(), this.f.a, new SelectorInteractor$selectorFlow$2(5, null)), this);
    }
}
