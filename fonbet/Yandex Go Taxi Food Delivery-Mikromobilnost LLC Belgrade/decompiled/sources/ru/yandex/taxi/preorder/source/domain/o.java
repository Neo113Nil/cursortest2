package ru.yandex.taxi.preorder.source.domain;

import defpackage.git0;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.wiq0;
import defpackage.ynm0;
import defpackage.yvf0;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes6.dex */
public final class o {
    public final yvf0 a;
    public final wiq0 b;
    public final ynm0 c;
    public final git0 d;
    public final oep0 e;
    public pzt0 f;

    public o(yvf0 yvf0Var, wiq0 wiq0Var, ynm0 ynm0Var, git0 git0Var, oep0 oep0Var) {
        this.a = yvf0Var;
        this.b = wiq0Var;
        this.c = ynm0Var;
        this.d = git0Var;
        this.e = oep0Var;
    }

    public final void a(sls slsVar) {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = ru.yandex.taxi.lifecycle.c.b(this.d.a, CoroutineStart.DEFAULT, new ShowDuePickerInteractorImpl$tryShowDuePicker$1(this, slsVar, null));
    }
}
