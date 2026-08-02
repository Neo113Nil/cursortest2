package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import defpackage.jey;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.ybn0;

/* loaded from: classes6.dex */
public final class c extends jey {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        d dVar = this.a;
        dVar.C = tje.N(dVar.Jg(), null, null, new ScootersDamagePresenter$start$1(dVar, null), 3);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        d dVar = this.a;
        pzt0 pzt0Var = dVar.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((ybn0) dVar.Dg()).stopCamera();
    }
}
