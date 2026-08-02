package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.R;
import defpackage.a0g;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.bfu;
import defpackage.ern;
import defpackage.g0g;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gs6;
import defpackage.gut;
import defpackage.hd6;
import defpackage.hq5;
import defpackage.ild;
import defpackage.irf;
import defpackage.iz2;
import defpackage.kb5;
import defpackage.kfh;
import defpackage.kfu;
import defpackage.kjn;
import defpackage.l1p;
import defpackage.mdn;
import defpackage.ngg;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.rpg;
import defpackage.rvf;
import defpackage.ss3;
import defpackage.ssd;
import defpackage.szf;
import defpackage.ug3;
import defpackage.ugo;
import defpackage.vci;
import defpackage.vnj;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp3;
import defpackage.xp5;
import defpackage.xq0;
import defpackage.yci;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class j {
    public static final void a(i0 i0Var, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1219993065);
        if ((((oq5Var.f(i0Var) ? 4 : 2) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci yciVar = vci.a;
            yci f = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.c(yciVar, 1.0f), i0Var.b, i0Var.c).f(!i0Var.equals(new i0()) ? gut.r1(yciVar) : yciVar);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci d2 = androidx.compose.foundation.layout.d.d(yciVar, 1.0f);
            int i3 = i0Var.d;
            yci f2 = d2.f(i3 > 0 ? androidx.compose.foundation.layout.d.e(yciVar, i3) : androidx.compose.foundation.layout.d.b(yciVar, 1.0f));
            int i4 = i0Var.a;
            if (i4 > 0) {
                yciVar = xp3.u(yciVar, ugo.a(i4));
            }
            yci f3 = f2.f(yciVar);
            int ordinal = i0Var.e.ordinal();
            iz2 iz2Var2 = ordinal != 1 ? ordinal != 3 ? b2c.f : b2c.i : b2c.c;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            yci a = bVar.a(f3, iz2Var2);
            kfh d3 = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var.invoke(bVar, oq5Var, 54);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new com.yandex.passport.internal.ui.bouncer.p(i0Var, wn5Var, i, 13);
        }
    }

    public static final void b(final f fVar, final Function0 function0, final Function1 function1, final Function1 function12, hq5 hq5Var, final int i) {
        fVar.getClass();
        function0.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1293114600);
        int i2 = i | (oq5Var.f(fVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function12) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            b0 viewModelFactory = fVar.getViewModelFactory();
            oq5Var.a0(1729797275);
            kfu a = rpg.a(oq5Var);
            if (a == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(h0.class), a, null, viewModelFactory, a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
            oq5Var.p(false);
            h0 h0Var = (h0) R;
            aqi Q = szf.Q(h0Var.l, oq5Var);
            i0 i0Var = new i0(20, 16, 16, 278, m0.d);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(i0Var);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            s0 s0Var = ((c0) Q.getValue()).a;
            if (s0Var == null) {
                oq5Var.Z(1616043446);
            } else {
                oq5Var.Z(1616043447);
                s0 s0Var2 = ((c0) Q.getValue()).a;
                boolean h = ((i2 & 896) == 256) | oq5Var.h(s0Var);
                Object K2 = oq5Var.K();
                if (h || K2 == kjnVar) {
                    K2 = new com.yandex.passport.internal.storage.a(function1, s0Var, null, 23);
                    oq5Var.k0(K2);
                }
                gld.w(oq5Var, s0Var2, (Function2) K2);
            }
            oq5Var.p(false);
            ss3 ss3Var = h0Var.m;
            boolean z = (i2 & 7168) == 2048;
            Object K3 = oq5Var.K();
            if (z || K3 == kjnVar) {
                K3 = new l1p((Object) function12, aqiVar, (Continuation) null, 20);
                oq5Var.k0(K3);
            }
            com.yandex.plus.pay.ui.core.b.b(ss3Var, (Function2) K3, oq5Var, 0);
            Throwable th = ((c0) Q.getValue()).c;
            if (th != null) {
                oq5Var.Z(1616469790);
                boolean z2 = (i2 & 112) == 32;
                Object K4 = oq5Var.K();
                if (z2 || K4 == kjnVar) {
                    K4 = new com.yandex.passport.internal.ui.common.screen.d(1, function0);
                    oq5Var.k0(K4);
                }
                com.yandex.passport.internal.ui.common.screen.e.a(th, true, false, (Function0) K4, oq5Var, 48, 4);
                oq5Var.p(false);
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i3 = 0;
                    r.d = new Function2(fVar, function0, function1, function12, i, i3) { // from class: com.yandex.passport.internal.ui.sloth.webcard.h
                        public final /* synthetic */ int a;
                        public final /* synthetic */ f b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function1 d;
                        public final /* synthetic */ Function1 e;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int R2 = rvf.R(1);
                                    j.b(this.b, this.c, this.d, this.e, (hq5) obj, R2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int R3 = rvf.R(1);
                                    j.b(this.b, this.c, this.d, this.e, (hq5) obj, R3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int R4 = rvf.R(1);
                                    j.b(this.b, this.c, this.d, this.e, (hq5) obj, R4);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var.Z(1616469789);
            oq5Var.p(false);
            com.yandex.passport.sloth.data.m mVar = ((c0) Q.getValue()).b;
            if (mVar != null) {
                oq5Var.Z(1616718131);
                vci vciVar = vci.a;
                yci c = androidx.compose.foundation.layout.d.c(vciVar, 1.0f);
                kfh d = ug3.d(b2c.b, false);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, c);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                irf.r(a0g.E(R.drawable.passport_background_main, 0, oq5Var), null, androidx.compose.foundation.layout.d.c(vciVar, 1.0f), null, hd6.a, 0.0f, null, oq5Var, 25008, 104);
                a((i0) aqiVar.getValue(), ild.C(371945178, new mdn(mVar, fVar, h0Var, aqiVar, 12), oq5Var), oq5Var, 48);
                oq5Var.p(true);
                oq5Var.p(false);
                xmn r2 = oq5Var.r();
                if (r2 != null) {
                    final int i5 = 1;
                    r2.d = new Function2(fVar, function0, function1, function12, i, i5) { // from class: com.yandex.passport.internal.ui.sloth.webcard.h
                        public final /* synthetic */ int a;
                        public final /* synthetic */ f b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function1 d;
                        public final /* synthetic */ Function1 e;

                        {
                            this.a = i5;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int R2 = rvf.R(1);
                                    j.b(this.b, this.c, this.d, this.e, (hq5) obj, R2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int R3 = rvf.R(1);
                                    j.b(this.b, this.c, this.d, this.e, (hq5) obj, R3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int R4 = rvf.R(1);
                                    j.b(this.b, this.c, this.d, this.e, (hq5) obj, R4);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var.Z(1616718130);
            oq5Var.p(false);
            com.yandex.passport.common.ui.progress.g progressProperties = fVar.getProgressProperties();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.internal.ui.a.i(null, progressProperties, false, oq5Var, 0, 5);
            oq5Var = oq5Var;
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            final int i6 = 2;
            r3.d = new Function2(fVar, function0, function1, function12, i, i6) { // from class: com.yandex.passport.internal.ui.sloth.webcard.h
                public final /* synthetic */ int a;
                public final /* synthetic */ f b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;

                {
                    this.a = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int R2 = rvf.R(1);
                            j.b(this.b, this.c, this.d, this.e, (hq5) obj, R2);
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            int R3 = rvf.R(1);
                            j.b(this.b, this.c, this.d, this.e, (hq5) obj, R3);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int R4 = rvf.R(1);
                            j.b(this.b, this.c, this.d, this.e, (hq5) obj, R4);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }
}
