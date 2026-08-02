package ru.yandex.taxi.masstransit.userlocation;

import defpackage.ney;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.qc5;
import defpackage.qwc;
import defpackage.so21;
import defpackage.tje;

/* loaded from: classes6.dex */
public final class b extends qc5 {
    public final po21 A;
    public final qwc B;
    public pzt0 C;

    public b(po21 po21Var, qwc qwcVar, ney neyVar) {
        super(so21.class, neyVar);
        this.A = po21Var;
        this.B = qwcVar;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        pzt0 pzt0Var = this.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.C = tje.N(Kg(), null, null, new UserLocationPresenter$listenUserLocation$1(this, null), 3);
        tje.N(Kg(), null, null, new UserLocationPresenter$listenAzimuth$1(this, null), 3);
    }
}
