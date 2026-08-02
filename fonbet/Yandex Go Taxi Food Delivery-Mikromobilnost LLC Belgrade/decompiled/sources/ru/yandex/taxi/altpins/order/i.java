package ru.yandex.taxi.altpins.order;

import defpackage.czo0;
import defpackage.hbp0;
import defpackage.n20;
import defpackage.qz1;
import defpackage.tt2;
import defpackage.ysg;

/* loaded from: classes9.dex */
public final class i implements qz1 {
    public final tt2 a;
    public final ysg b;
    public final n20 c;
    public final hbp0 d;

    public i(tt2 tt2Var, ysg ysgVar, n20 n20Var) {
        this.a = tt2Var;
        this.b = ysgVar;
        this.c = n20Var;
        String str = (2 & 1) != 0 ? null : "AltpinOrdersDeactivateProcessor";
        this.d = new hbp0(new czo0(14), str == null ? "" : str, null);
    }

    public final void a() {
        hbp0 hbp0Var = this.d;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new AltpinOrdersDeactivateProcessorImpl$attach$1(null, this), 3);
    }
}
