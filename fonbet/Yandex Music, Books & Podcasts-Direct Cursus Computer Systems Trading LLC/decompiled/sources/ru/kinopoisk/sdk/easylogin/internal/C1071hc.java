package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.d85;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.u7g;
import defpackage.ug3;
import defpackage.ugo;
import defpackage.xmn;
import defpackage.yci;
import ru.kinopoisk.sdk.easylogin.R;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.hc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1071hc {
    public static final void a(yci yciVar, long j, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1501789074);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.e(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci e = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.r(yciVar, u7g.E(R.dimen.drag_line_width, oq5Var)), u7g.E(R.dimen.drag_line_height, oq5Var));
            oq5Var.a0(1913848292);
            long g = d85.c(j, d85.n) ? C1210rc.a(oq5Var, 0).g() : j;
            oq5Var.p(false);
            ug3.a(androidx.compose.foundation.a.b(e, g, ugo.a(u7g.E(R.dimen.corner_radius_round, oq5Var))), oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1057gc(yciVar, j, i);
        }
    }
}
