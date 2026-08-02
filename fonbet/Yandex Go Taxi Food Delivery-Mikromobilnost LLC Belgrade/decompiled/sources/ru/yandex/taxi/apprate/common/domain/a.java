package ru.yandex.taxi.apprate.common.domain;

import defpackage.iw2;
import defpackage.kgx;
import defpackage.lw2;
import defpackage.sme0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.x4e;
import defpackage.y631;
import defpackage.z631;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes5.dex */
public final class a {
    public final iw2 a;
    public final lw2 b;
    public final y631 c;
    public final tse d;

    public a(iw2 iw2Var, lw2 lw2Var, y631 y631Var, tse tseVar) {
        this.a = iw2Var;
        this.b = lw2Var;
        this.c = y631Var;
        this.d = tseVar;
    }

    public final void a(float f, String str) {
        if (f < 5.0f) {
            return;
        }
        lw2 lw2Var = this.b;
        sme0 sme0Var = lw2Var.c;
        sme0 sme0Var2 = lw2Var.c;
        kgx[] kgxVarArr = lw2.f;
        if (((Set) sme0Var.getValue(lw2Var, kgxVarArr[1])).size() != 0) {
            return;
        }
        z631 a = this.c.a();
        if (a == null) {
            x4e.B(this.a.a.a, "OrderFeedback.Rate.ReviewServicesUnavailable", new HashMap(), 1);
            return;
        }
        sme0Var2.setValue(lw2Var, kgxVarArr[1], v4r0.i((Set) sme0Var2.getValue(lw2Var, kgxVarArr[1]), str));
        lw2Var.b.setValue(lw2Var, kgxVarArr[0], str);
        tje.N(this.d, null, null, new AppRateStarsClickedInteractor$rateOrderStarsClicked$1(this, a, null), 3);
    }
}
