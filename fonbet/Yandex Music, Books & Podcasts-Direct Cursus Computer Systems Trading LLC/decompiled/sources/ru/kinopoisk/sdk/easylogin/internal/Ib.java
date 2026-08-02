package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.a0g;
import defpackage.b2c;
import defpackage.b6e;
import defpackage.cma;
import defpackage.d43;
import defpackage.ezf;
import defpackage.ghh;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.irf;
import defpackage.iz2;
import defpackage.k5r;
import defpackage.kjn;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.sdr;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.u7g;
import defpackage.ug3;
import defpackage.uif;
import defpackage.vci;
import defpackage.vnj;
import defpackage.wg3;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.H3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* loaded from: classes5.dex */
public final class Ib {

    public static final class a extends uif implements Function0<Unit> {
        public final /* synthetic */ Function1<H3, Unit> a;
        public final /* synthetic */ H3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super H3, Unit> function1, H3 h3) {
            super(0);
            this.a = function1;
            this.b = h3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.a.invoke(this.b);
            return Unit.a;
        }
    }

    public static final class b extends uif implements Function0<Unit> {
        public final /* synthetic */ Function1<H3, Unit> a;
        public final /* synthetic */ H3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super H3, Unit> function1, H3 h3) {
            super(0);
            this.a = function1;
            this.b = h3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.a.invoke(this.b);
            return Unit.a;
        }
    }

    public static final class c extends uif implements Function2<hq5, Integer, Unit> {
        public final /* synthetic */ H3 a;
        public final /* synthetic */ sdr b;
        public final /* synthetic */ Function1<H3, Unit> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(H3 h3, sdr sdrVar, Function1<? super H3, Unit> function1, int i) {
            super(2);
            this.a = h3;
            this.b = sdrVar;
            this.c = function1;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            Ib.a(this.a, this.b, this.c, (hq5) obj, rvf.R(this.d | 1));
            return Unit.a;
        }
    }

    public static final void a(@NotNull H3 h3, @NotNull sdr sdrVar, @NotNull Function1<? super H3, Unit> function1, hq5 hq5Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        h3.getClass();
        sdrVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(525507431);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(h3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(sdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            cma cmaVar = new cma(A2.a(((Number) sdrVar.getValue()).intValue(), (hq5) oq5Var));
            cma cmaVar2 = new cma(200);
            if (cmaVar.compareTo(cmaVar2) > 0) {
                cmaVar = cmaVar2;
            }
            vci vciVar = vci.a;
            yci b2 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.d.e(vciVar, 168), cmaVar.a), C1210rc.a(oq5Var, 0).i(), vnj.i);
            oq5Var.a0(-1912665789);
            int i4 = i2 & 896;
            boolean h = (i4 == 256) | oq5Var.h(h3);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new a(function1, h3);
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            yci e = androidx.compose.foundation.a.e(b2, false, null, null, (Function0) K, 7);
            oq5Var.a0(733328855);
            iz2 iz2Var = b2c.b;
            wg3 e2 = ug3.e(iz2Var, false, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            wp5 wp5Var = xp5.T;
            wp5Var.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a2 = Lb.a(wp5Var, oq5Var, e2, oq5Var, l);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                Mb.a(i5, oq5Var, i5, a2);
            }
            ouj.z(oq5Var, 0, A, oq5Var, 2058660585);
            yci c2 = androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.a.m(vciVar, u7g.E(R.dimen.space_medium_1, oq5Var)), 1.0f);
            gz2 gz2Var = b2c.o;
            oq5Var.a0(-483455358);
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            wn5 A2 = ghh.A(c2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a4 = Lb.a(wp5Var, oq5Var, a3, oq5Var, l2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                Mb.a(i6, oq5Var, i6, a4);
            }
            ouj.z(oq5Var, 0, A2, oq5Var, 2058660585);
            xcs.b(h3.getB(), null, C1210rc.a(oq5Var, 0).c(), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, C1210rc.b(oq5Var, 0).getI(), oq5Var, 0, 3120, 55290);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_small_2, oq5Var)));
            yci q = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.d.c(vciVar, 1.0f), 0.0f, 0.0f, 0.0f, u7g.E(R.dimen.space_small_2, oq5Var), 7);
            oq5Var.a0(733328855);
            wg3 e3 = ug3.e(iz2Var, false, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            wn5 A3 = ghh.A(q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a5 = Lb.a(wp5Var, oq5Var, e3, oq5Var, l3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                Mb.a(i7, oq5Var, i7, a5);
            }
            ouj.z(oq5Var, 0, A3, oq5Var, 2058660585);
            if (h3 instanceof H3.a) {
                i3 = R.drawable.android_tv;
            } else if (h3 instanceof H3.c) {
                i3 = R.drawable.samsung;
            } else {
                if (!(h3 instanceof H3.b)) {
                    b6e.s();
                    return;
                }
                i3 = R.drawable.lg;
            }
            yci d = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.d.e(vciVar, 68), 1.0f);
            iz2 iz2Var2 = b2c.c;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            irf.r(a0g.E(i3, 0, oq5Var), null, bVar.a(d, iz2Var2), null, null, 0.0f, new d43(C1210rc.a(oq5Var, 0).f(), 5), oq5Var, 48, 56);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_small_2, oq5Var)));
            yci a6 = bVar.a(vciVar, b2c.i);
            InterfaceC1129m0.e eVar = InterfaceC1129m0.e.a;
            EnumC1087j0 enumC1087j0 = EnumC1087j0.Small;
            oq5Var.a0(-1162746368);
            boolean h2 = oq5Var.h(h3) | (i4 == 256);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new b(function1, h3);
                oq5Var.k0(K2);
            }
            oq5Var.p(false);
            C1155nc.a((Function0) K2, a6, eVar, enumC1087j0, false, C1227t1.a(), oq5Var, 200064, 16);
            oq5Var = oq5Var;
            k5r.s(oq5Var, false, true, false, false);
            k5r.s(oq5Var, false, true, false, false);
            oq5Var.a0(-781703639);
            if (h3.getD()) {
                z = true;
                xcs.b("Mock", ezf.N(androidx.compose.foundation.layout.a.n(vciVar, 8, 16), -45.0f), C1210rc.a(oq5Var, 0).a(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var, 0).getM(), oq5Var, 54, 0, 65528);
                oq5Var = oq5Var;
                z2 = false;
            } else {
                z = true;
                z2 = false;
            }
            k5r.s(oq5Var, z2, z2, z, z2);
            oq5Var.p(z2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new c(h3, sdrVar, function1, i);
        }
    }
}
