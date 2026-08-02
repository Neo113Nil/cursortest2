package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.b2c;
import defpackage.d85;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.g7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1052g7 {
    public static final void a(yci yciVar, @NotNull nbt nbtVar, @NotNull Function0 function0, hq5 hq5Var, int i) {
        int i2;
        nbtVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(463739417);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(nbtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
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
            vci vciVar = vci.a;
            nbtVar.s(((i2 << 3) & 896) | 6, oq5Var, androidx.compose.foundation.layout.d.o(vciVar, 343, 240), z);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 16));
            xcs.b(rvf.M(nbtVar.r(), oq5Var), null, ((d85) ((Vb) oq5Var.j(Wb.a)).m.getValue()).a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, ((yc) oq5Var.j(zc.b)).j, oq5Var, 0, 0, 65018);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 24));
            float f = 220;
            yci t = androidx.compose.foundation.layout.d.t(vciVar, f, 0.0f, 2);
            InterfaceC1129m0.j jVar = InterfaceC1129m0.j.a;
            EnumC1087j0 enumC1087j0 = EnumC1087j0.ExtraLarge;
            C1197qc.a(C1024e7.a, t, jVar, enumC1087j0, false, EnumC1073i0.Start, C1144n1.a, oq5Var, 1772982, 16);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 12));
            C1155nc.a(function0, androidx.compose.foundation.layout.d.t(vciVar, f, 0.0f, 2), InterfaceC1129m0.f.a, enumC1087j0, false, C1144n1.b, oq5Var, ((i2 >> 6) & 14) | 200112, 16);
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1038f7(yciVar, nbtVar, function0, i);
        }
    }
}
