package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.b2c;
import defpackage.es5;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.jx7;
import defpackage.kjn;
import defpackage.nfp;
import defpackage.nx0;
import defpackage.o68;
import defpackage.oq5;
import defpackage.p2v;
import defpackage.q0k;
import defpackage.qx0;
import defpackage.weo;
import defpackage.x2i;
import defpackage.xmn;
import defpackage.yci;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void a(int i, hq5 hq5Var, yci yciVar, List list) {
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-879676741);
        if ((((oq5Var.h(list) ? 4 : 2) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f = 72;
            float f2 = 96;
            if (list.size() <= 2) {
                f = f2;
            }
            int L = ((jx7) oq5Var.j(es5.h)).L(f);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            q0k a = androidx.compose.foundation.layout.a.a(24, 0.0f, 2);
            x2i x2iVar = qx0.a;
            nx0 h = qx0.h(8, b2c.o);
            yci d = androidx.compose.foundation.layout.d.d(yciVar, 1.0f);
            boolean h2 = oq5Var.h(context) | oq5Var.h(list);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new com.yandex.passport.internal.ui.bouncer.o(9, context, list);
                oq5Var.k0(K);
            }
            yci a2 = nfp.a(d, (Function1) K);
            boolean h3 = oq5Var.h(list) | oq5Var.c(f) | oq5Var.d(L);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                K2 = new p2v(f, L, list);
                oq5Var.k0(K2);
            }
            weo.h(a2, null, a, h, null, null, false, (Function1) K2, oq5Var, 24960, 234);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o68(list, yciVar, i, 3);
        }
    }
}
