package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.R;
import defpackage.e7t;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ihe;
import defpackage.oq5;
import defpackage.pce;
import defpackage.u1g;
import defpackage.xee;
import defpackage.xmn;
import defpackage.xwh;
import defpackage.xz0;
import defpackage.yci;

/* loaded from: classes4.dex */
public abstract class c {
    public static final void a(int i, int i2, hq5 hq5Var, yci yciVar, String str, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2083712643);
        int i3 = (oq5Var.f(str) ? 4 : 2) | i2 | (oq5Var.d(i) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean f = ((i3 & 14) == 4) | oq5Var.f(context);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                String str2 = str == null ? "" : str;
                context.getClass();
                K = (context.getResources().getConfiguration().uiMode & 48) + str2;
                oq5Var.k0(K);
            }
            String str3 = (String) K;
            pce pceVar = new pce(context);
            pceVar.c = str;
            pceVar.g = str3;
            pceVar.f = str3 != null ? new xwh(str3) : null;
            pceVar.b();
            pceVar.c(R.drawable.passport_icon_user_unknown);
            pceVar.j = xee.L(xz0.X(new e7t[]{new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.b(i, z)}));
            u1g.a(pceVar.a(), yciVar, oq5Var, ((i3 >> 3) & 896) | 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ihe(str, i, z, yciVar, i2);
        }
    }
}
