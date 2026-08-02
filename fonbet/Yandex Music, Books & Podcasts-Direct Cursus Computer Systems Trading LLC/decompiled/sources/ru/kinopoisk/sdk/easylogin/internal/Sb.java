package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.a0g;
import defpackage.d85;
import defpackage.gae;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.u7g;
import defpackage.ugo;
import defpackage.uif;
import defpackage.vci;
import defpackage.w4k;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.R;

/* loaded from: classes5.dex */
public final class Sb extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sb(long j, long j2) {
        super(2);
        this.a = j;
        this.b = j2;
    }

    public final void a(hq5 hq5Var, int i) {
        if ((i & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return;
            }
        }
        boolean z = C1015dc.a(hq5Var) == N4.Redesigned;
        w4k E = a0g.E(z ? R.drawable.ui_kit_ic_cross_16 : R.drawable.ic_close_2, 0, hq5Var);
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.a0(-903167988);
        long j = this.a;
        long j2 = d85.n;
        long e = d85.c(j, j2) ? C1210rc.a(oq5Var2, 0).e() : this.a;
        oq5Var2.p(false);
        yci m = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(vci.a, e, ugo.a(u7g.E(R.dimen.button_corner_radius, oq5Var2))), z ? 6 : 0);
        oq5Var2.a0(-903158251);
        long h = d85.c(this.b, j2) ? C1210rc.a(oq5Var2, 0).h() : this.b;
        oq5Var2.p(false);
        gae.b(E, null, m, h, oq5Var2, 48, 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((hq5) obj, ((Number) obj2).intValue());
        return Unit.a;
    }
}
