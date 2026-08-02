package ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation;

import defpackage.ad5;
import defpackage.bvf0;
import defpackage.hpx0;
import defpackage.ipx0;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.l8x;
import defpackage.pav;
import defpackage.tje;
import defpackage.y50;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class a extends ad5 {
    public Pair A;
    public final r0 B;
    public final pav x;
    public final k7x0 y;
    public final y50 z;

    public a(pav pavVar, k7x0 k7x0Var, y50 y50Var) {
        super(ipx0.class);
        this.x = pavVar;
        this.y = k7x0Var;
        this.z = y50Var;
        this.A = new Pair(null, null);
        this.B = bvf0.c(hpx0.e);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        l8x l8xVar = (l8x) this.A.f();
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.A = new Pair(null, null);
    }

    public final void Kg(ipx0 ipx0Var) {
        Bg(ipx0Var);
        tje.N(Jg(), null, null, new TariffUnavailableNotificationsPresenter$attachView$1(this, ipx0Var, null), 3);
    }

    public final void Lg(String str) {
        if (jl40.l(str, this.A.c())) {
            return;
        }
        if (str != null && str.length() != 0) {
            this.A = new Pair(str, tje.N(Jg(), null, null, new TariffUnavailableNotificationsPresenter$loadImage$job$1(this, str, null), 3));
            return;
        }
        l8x l8xVar = (l8x) this.A.f();
        if (l8xVar != null) {
            l8xVar.a(null);
        }
    }
}
