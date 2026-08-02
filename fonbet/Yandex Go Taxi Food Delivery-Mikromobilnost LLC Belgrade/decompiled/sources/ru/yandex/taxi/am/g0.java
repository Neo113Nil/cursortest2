package ru.yandex.taxi.am;

import androidx.lifecycle.Lifecycle;
import defpackage.ip90;
import defpackage.tje;
import defpackage.tse;
import defpackage.vw60;

/* loaded from: classes9.dex */
public final class g0 implements vw60 {
    public final tse a;
    public final Lifecycle b;
    public final ip90 c;

    public g0(tse tseVar, Lifecycle lifecycle, ip90 ip90Var) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = ip90Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        tje.N(this.a, null, null, new PassportAnticrisisInteractor$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PassportAnticrisisInteractor";
    }
}
