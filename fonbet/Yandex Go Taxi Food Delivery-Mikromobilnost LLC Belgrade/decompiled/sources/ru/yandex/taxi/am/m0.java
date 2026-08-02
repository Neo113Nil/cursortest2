package ru.yandex.taxi.am;

import defpackage.acz;
import defpackage.ep90;
import defpackage.lx4;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.yw60;

/* loaded from: classes9.dex */
public final class m0 implements yw60 {
    public final lx4 a;
    public final tt2 b;
    public final tse c;
    public final acz d;
    public final ep90 e;
    public final com.yandex.go.zone.repository.d f;
    public pzt0 g;
    public pzt0 h;

    public m0(lx4 lx4Var, tt2 tt2Var, tse tseVar, acz aczVar, ep90 ep90Var, com.yandex.go.zone.repository.d dVar) {
        this.a = lx4Var;
        this.b = tt2Var;
        this.c = tseVar;
        this.d = aczVar;
        this.e = ep90Var;
        this.f = dVar;
    }

    @Override // defpackage.yw60
    public final void e() {
        PassportAnticrisisParamsUpdater$onAppCreated$1 passportAnticrisisParamsUpdater$onAppCreated$1 = new PassportAnticrisisParamsUpdater$onAppCreated$1(this, null);
        tse tseVar = this.c;
        this.g = tje.N(tseVar, null, null, passportAnticrisisParamsUpdater$onAppCreated$1, 3);
        this.h = tje.N(tseVar, null, null, new PassportAnticrisisParamsUpdater$onAppCreated$2(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PassportAnticrisisParamsUpdater";
    }

    @Override // defpackage.yw60
    public final void l() {
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = null;
        pzt0 pzt0Var2 = this.h;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.h = null;
    }
}
