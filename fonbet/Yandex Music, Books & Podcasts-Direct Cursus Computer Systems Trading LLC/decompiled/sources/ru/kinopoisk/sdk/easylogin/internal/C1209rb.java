package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.f1d;
import defpackage.ges;
import defpackage.ghh;
import defpackage.gq5;
import defpackage.grb;
import defpackage.hq5;
import defpackage.hz2;
import defpackage.k5r;
import defpackage.kjn;
import defpackage.lho;
import defpackage.nho;
import defpackage.nx0;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.q0k;
import defpackage.qx0;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.szf;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.u7g;
import defpackage.vci;
import defpackage.weo;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.rb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1209rb {
    public static final void a(@NotNull ArrayList arrayList, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        ges j;
        arrayList.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1382983934);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.h(arrayList) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean a = B8.a((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
            vci vciVar = vci.a;
            yci d = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
            oq5Var.a0(-483455358);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            wp5 wp5Var = xp5.T;
            wp5Var.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a3 = Lb.a(wp5Var, oq5Var, a2, oq5Var, l);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                Mb.a(i4, oq5Var, i4, a3);
            }
            ouj.z(oq5Var, 0, A, oq5Var, 2058660585);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(b2c.o);
            hz2 hz2Var = b2c.l;
            oq5Var.a0(693286680);
            nho a4 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            wn5 A2 = ghh.A(horizontalAlignElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a5 = Lb.a(wp5Var, oq5Var, a4, oq5Var, l2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                Mb.a(i5, oq5Var, i5, a5);
            }
            ouj.z(oq5Var, 0, A2, oq5Var, 2058660585);
            T8 t8 = a ? T8.Small : T8.Medium;
            U8 u8 = U8.Themed;
            C1113kc.a(null, t8, oq5Var, 384);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.r(vciVar, u7g.E(R.dimen.space_medium_1, oq5Var)));
            String M = rvf.M(R.string.tv_list_screen_title, oq5Var);
            long f = C1210rc.a(oq5Var, 0).f();
            if (a) {
                oq5Var.a0(-1249565490);
                j = C1210rc.b(oq5Var, 0).getM();
                oq5Var.p(false);
            } else {
                oq5Var.a0(-1249487153);
                j = C1210rc.b(oq5Var, 0).getJ();
                oq5Var.p(false);
            }
            xcs.b(M, vciVar, f, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j, oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            k5r.s(oq5Var, false, true, false, false);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_3, oq5Var)));
            float E = u7g.E(R.dimen.space_small_3, oq5Var);
            float a6 = A2.a(E, oq5Var);
            float E2 = u7g.E(R.dimen.space_medium_2, oq5Var);
            float a7 = A2.a(E2, oq5Var);
            oq5Var.a0(-1068995478);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(0);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            oq5Var.p(false);
            nx0 g = qx0.g(E);
            yci d2 = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
            oq5Var.a0(-1068988309);
            boolean c = oq5Var.c(a6) | oq5Var.c(a7);
            Object K2 = oq5Var.K();
            if (c || K2 == kjnVar) {
                K2 = new C1126lb(aqiVar, a6, a7);
                oq5Var.k0(K2);
            }
            oq5Var.p(false);
            yci f2 = androidx.compose.ui.layout.a.f(d2, (Function1) K2);
            q0k a8 = androidx.compose.foundation.layout.a.a(E2, 0.0f, 2);
            oq5Var.a0(-1068983343);
            boolean h = oq5Var.h(arrayList) | ((i3 & 112) == 32);
            Object K3 = oq5Var.K();
            if (h || K3 == kjnVar) {
                K3 = new C1182pb(arrayList, aqiVar, function1);
                oq5Var.k0(K3);
            }
            oq5Var.p(false);
            weo.h(f2, null, a8, g, null, null, false, (Function1) K3, oq5Var, 0, 234);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_2, oq5Var)));
            oq5Var.p(false);
            f1d.u(oq5Var, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1196qb(arrayList, function1, i);
        }
    }
}
