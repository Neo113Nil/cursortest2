package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.b2c;
import defpackage.f1d;
import defpackage.ges;
import defpackage.ghh;
import defpackage.grb;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.hxe;
import defpackage.k5r;
import defpackage.kx0;
import defpackage.nbt;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.u7g;
import defpackage.vci;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* loaded from: classes5.dex */
public final class Va {
    public static final void a(@NotNull nbt nbtVar, boolean z, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        int i2;
        Function0 function03;
        ges j;
        nbtVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-670692527);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(nbtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function03 = function0;
            i2 |= oq5Var.h(function03) ? 256 : 128;
        } else {
            function03 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean a = B8.a((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
            vci vciVar = vci.a;
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d.t(vciVar, 0.0f, 380, 1), u7g.E(R.dimen.space_medium_2, oq5Var), 0.0f, 2);
            gz2 gz2Var = b2c.o;
            oq5Var.a0(-483455358);
            kx0 kx0Var = qx0.c;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            wp5 wp5Var = xp5.T;
            wp5Var.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(o);
            oq5Var.d0();
            int i4 = i2;
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a3 = Lb.a(wp5Var, oq5Var, a2, oq5Var, l);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                Mb.a(i3, oq5Var, i3, a3);
            }
            ouj.z(oq5Var, 0, A, oq5Var, 2058660585);
            nbtVar.e(C1210rc.a(oq5Var, 0).k(), oq5Var, (i4 << 3) & 112);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_2, oq5Var)));
            yci d = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
            String M = rvf.M(R.string.error_screen_searching_error_title, oq5Var);
            long f = C1210rc.a(oq5Var, 0).f();
            if (a) {
                oq5Var.a0(-1310628629);
                j = C1210rc.b(oq5Var, 0).getM();
                oq5Var.p(false);
            } else {
                oq5Var.a0(-1310558228);
                j = C1210rc.b(oq5Var, 0).getJ();
                oq5Var.p(false);
            }
            xcs.b(M, d, f, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j, oq5Var, 48, 0, 65016);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_small_3, oq5Var)));
            xcs.b(rvf.M(nbtVar.k(), oq5Var), androidx.compose.foundation.layout.d.d(vciVar, 1.0f), C1210rc.a(oq5Var, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var, 0).getA(), oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_3, oq5Var)));
            yci r = androidx.compose.foundation.layout.a.r(vciVar, hxe.a);
            oq5Var.a0(-483455358);
            ta5 a4 = sa5.a(kx0Var, b2c.n, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            wn5 A2 = ghh.A(r);
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
            yci d2 = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.d.t(vciVar, 220, 0.0f, 2), 1.0f);
            InterfaceC1129m0.h hVar = InterfaceC1129m0.h.a;
            EnumC1087j0 enumC1087j0 = EnumC1087j0.ExtraLarge;
            C1155nc.a(function03, d2, hVar, enumC1087j0, false, C1213s1.a(), oq5Var, ((i4 >> 6) & 14) | 200112, 16);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_1, oq5Var)));
            oq5Var.a0(766482006);
            if (z) {
                C1155nc.a(function02, androidx.compose.foundation.layout.d.d(vciVar, 1.0f), InterfaceC1129m0.f.a, enumC1087j0, false, C1213s1.b(), oq5Var, ((i4 >> 9) & 14) | 200112, 16);
            }
            k5r.s(oq5Var, false, false, true, false);
            oq5Var.p(false);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_2, oq5Var)));
            oq5Var.p(false);
            f1d.u(oq5Var, true, false, false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new Ua(nbtVar, z, function0, function02, i);
        }
    }
}
