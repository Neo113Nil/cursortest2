package com.yandex.passport.internal.ui.sloth.screen;

import com.yandex.passport.internal.ui.sloth.q;
import com.yandex.passport.sloth.d1;
import com.yandex.passport.sloth.v;
import defpackage.bfu;
import defpackage.ot0;
import defpackage.x0q;
import defpackage.x97;

/* loaded from: classes4.dex */
public final class i extends bfu {
    public final d1 k;
    public final x0q l;
    public final x0q m;

    public i(d1 d1Var) {
        d1Var.getClass();
        this.k = d1Var;
        v vVar = d1Var.c;
        this.l = vVar.d;
        this.m = vVar.e;
        x97.y(ot0.F(this), null, null, new q(this, null, 8), 3);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.close();
    }
}
