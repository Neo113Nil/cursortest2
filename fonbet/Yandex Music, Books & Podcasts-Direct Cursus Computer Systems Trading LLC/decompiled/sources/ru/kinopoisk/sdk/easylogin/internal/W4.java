package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.b2c;
import defpackage.b6e;
import defpackage.es5;
import defpackage.ghh;
import defpackage.grb;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.k5r;
import defpackage.nbt;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.vci;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.xof;
import defpackage.xp5;
import defpackage.yci;
import defpackage.zbt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.H3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* loaded from: classes5.dex */
public final class W4 {
    public static final void a(@NotNull H3 h3, @NotNull nbt nbtVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        zbt zbtVar;
        h3.getClass();
        nbtVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1135941883);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(h3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(nbtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = oq5Var.j(es5.n) == xof.b;
            gz2 gz2Var = b2c.o;
            oq5Var.a0(-483455358);
            ta5 a = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            wp5 wp5Var = xp5.T;
            wp5Var.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(yciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a2 = Lb.a(wp5Var, oq5Var, a, oq5Var, l);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                Mb.a(i3, oq5Var, i3, a2);
            }
            ouj.z(oq5Var, 0, A, oq5Var, 2058660585);
            yci o = androidx.compose.foundation.layout.d.o(yciVar, 343, 240);
            if (h3 instanceof H3.b) {
                zbtVar = zbt.b;
            } else if (h3 instanceof H3.c) {
                zbtVar = zbt.a;
            } else {
                if (!(h3 instanceof H3.a)) {
                    b6e.s();
                    return;
                }
                zbtVar = zbt.c;
            }
            nbtVar.c(o, zbtVar, z, oq5Var, ((i2 << 9) & 57344) | ((i2 << 3) & 7168));
            vci vciVar = vci.a;
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 16));
            xcs.b(rvf.M(R.string.waiting_for_install_screen_title, oq5Var), null, C1210rc.a(oq5Var, 0).f(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var, 0).getJ(), oq5Var, 0, 0, 65018);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 8));
            xcs.b(rvf.M(nbtVar.g(), oq5Var), null, C1210rc.a(oq5Var, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var, 0).getA(), oq5Var, 0, 0, 65018);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 24));
            C1197qc.a(U4.a, androidx.compose.foundation.layout.d.t(vciVar, 220, 0.0f, 2), InterfaceC1129m0.j.a, EnumC1087j0.ExtraLarge, false, EnumC1073i0.Start, C1130m1.a(), oq5Var, 1772982, 16);
            oq5Var = oq5Var;
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new V4(h3, nbtVar, yciVar, i);
        }
    }
}
