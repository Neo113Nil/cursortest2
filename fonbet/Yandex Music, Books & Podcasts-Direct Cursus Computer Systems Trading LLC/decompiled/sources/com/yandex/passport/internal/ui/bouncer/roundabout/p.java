package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import defpackage.a0g;
import defpackage.d85;
import defpackage.gq5;
import defpackage.hd6;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.vci;
import defpackage.w4k;
import defpackage.w85;
import defpackage.xmn;
import defpackage.yci;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class p {
    public static final void a(com.yandex.passport.internal.ui.bouncer.u uVar, r1 r1Var, hq5 hq5Var, int i) {
        w4k w85Var;
        uVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1389825057);
        int i2 = (oq5Var.f(uVar) ? 4 : 2) | i | (oq5Var.h(r1Var) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean h = ((i2 & 14) == 4) | oq5Var.h(r1Var);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new com.yandex.passport.internal.ui.bouncer.o(4, uVar, r1Var);
                oq5Var.k0(K);
            }
            Function1 function1 = (Function1) K;
            yci c = androidx.compose.foundation.layout.d.c(vci.a, 1.0f);
            if (r1Var.a.p.m.a == com.yandex.passport.api.e.a) {
                oq5Var.Z(794552357);
                w85Var = a0g.E(R.drawable.passport_background_main, 0, oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(794648922);
                oq5Var.p(false);
                w85Var = new w85(d85.m);
            }
            androidx.compose.ui.viewinterop.a.a(0, 4, oq5Var, androidx.compose.ui.draw.a.d(c, w85Var, null, hd6.g, 0.0f, null, 54), function1, null);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new com.yandex.passport.internal.ui.bouncer.p(uVar, r1Var, i, 4);
        }
    }
}
