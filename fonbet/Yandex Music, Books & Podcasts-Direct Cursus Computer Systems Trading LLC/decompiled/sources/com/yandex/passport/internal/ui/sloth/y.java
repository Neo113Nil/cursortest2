package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.sloth.d1;
import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;

/* loaded from: classes4.dex */
public final class y implements gfu {
    public final d1 a;

    public y(d1 d1Var) {
        d1Var.getClass();
        this.a = d1Var;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        super.b(cls);
        throw null;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        return new z(this.a);
    }
}
