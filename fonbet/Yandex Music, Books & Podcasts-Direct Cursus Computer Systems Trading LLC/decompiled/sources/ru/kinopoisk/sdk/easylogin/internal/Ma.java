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
import defpackage.iz2;
import defpackage.k5r;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.u7g;
import defpackage.ug3;
import defpackage.uif;
import defpackage.vci;
import defpackage.wg3;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* loaded from: classes5.dex */
public final class Ma {

    public static final class a extends uif implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.a;
        }
    }

    public static final class b extends uif implements Function2<hq5, Integer, Unit> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(2);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            Ma.a((hq5) obj, rvf.R(this.a | 1));
            return Unit.a;
        }
    }

    public static final void a(hq5 hq5Var, int i) {
        ges j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-635008019);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean a2 = B8.a((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
            vci vciVar = vci.a;
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d.t(vciVar, 0.0f, 380, 1), u7g.E(R.dimen.space_medium_2, oq5Var), 0.0f, 2);
            gz2 gz2Var = b2c.o;
            oq5Var.a0(-483455358);
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            wp5 wp5Var = xp5.T;
            wp5Var.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(o);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a4 = Lb.a(wp5Var, oq5Var, a3, oq5Var, l);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                Mb.a(i2, oq5Var, i2, a4);
            }
            ouj.z(oq5Var, 0, A, oq5Var, 2058660585);
            yci d = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
            String M = rvf.M(R.string.searching_screen_title, oq5Var);
            long f = C1210rc.a(oq5Var, 0).f();
            if (a2) {
                oq5Var.a0(-245444681);
                j = C1210rc.b(oq5Var, 0).getM();
                oq5Var.p(false);
            } else {
                oq5Var.a0(-245374280);
                j = C1210rc.b(oq5Var, 0).getJ();
                oq5Var.p(false);
            }
            xcs.b(M, d, f, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j, oq5Var, 48, 0, 65016);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_small_3, oq5Var)));
            yci e = androidx.compose.foundation.layout.d.e(vciVar, 104);
            iz2 iz2Var = b2c.f;
            oq5Var.a0(733328855);
            wg3 e2 = ug3.e(iz2Var, false, oq5Var, 6);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            wn5 A2 = ghh.A(e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a5 = Lb.a(wp5Var, oq5Var, e2, oq5Var, l2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                Mb.a(i3, oq5Var, i3, a5);
            }
            ouj.z(oq5Var, 0, A2, oq5Var, 2058660585);
            xcs.b(rvf.M(R.string.searching_screen_subtitle_ios, oq5Var), androidx.compose.foundation.layout.d.d(vciVar, 1.0f), C1210rc.a(oq5Var, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var, 0).getA(), oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            k5r.s(oq5Var, false, true, false, false);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_3, oq5Var)));
            C1197qc.a(a.a, androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.d.t(androidx.compose.foundation.layout.a.r(vciVar, hxe.a), 220, 0.0f, 2), 1.0f), InterfaceC1129m0.h.a, EnumC1087j0.ExtraLarge, false, null, C1186q1.a(), oq5Var, 1576374, 48);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_2, oq5Var)));
            oq5Var.p(false);
            f1d.u(oq5Var, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b(i);
        }
    }
}
