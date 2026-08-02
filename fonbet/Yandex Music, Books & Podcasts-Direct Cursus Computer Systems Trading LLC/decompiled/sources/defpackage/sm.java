package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.music.core.ui.compose.b;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ sm(int i, int i2, boolean z) {
        this.a = i2;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        boolean z = this.b;
        vci vciVar = vci.a;
        switch (i3) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                gae.b(a0g.E(z ? R.drawable.ic_check_24 : R.drawable.ic_add_24, 0, hq5Var), null, null, 0L, hq5Var, 48, 12);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                yci e = d.e(vciVar, w1g.p(nu0.i(), 0, hq5Var2, 0, 2) + w1g.p(nu0.j(), 0, hq5Var2, 0, 2) + mu0.a);
                ta5 a = sa5.a(qx0.e, b2c.n, hq5Var2, 6);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i4 = oq5Var3.P;
                a l = oq5Var3.l();
                yci H = vnj.H(hq5Var2, e);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var2, a, wp5.f);
                g0g.U(hq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var3, i4, kb5Var);
                }
                g0g.U(hq5Var2, H, wp5.d);
                ivf.l(this.b, d.r(vciVar, 120), nu0.j(), hq5Var2, 48, 0);
                oq5Var3.p(true);
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var3, 0);
                oq5 oq5Var5 = (oq5) hq5Var3;
                int i5 = oq5Var5.P;
                a l2 = oq5Var5.l();
                yci H2 = vnj.H(hq5Var3, vciVar);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar2);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(hq5Var3, a2, wp5.f);
                g0g.U(hq5Var3, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var5, i5, kb5Var2);
                }
                g0g.U(hq5Var3, H2, wp5.d);
                h6g h6gVar3 = nu0.a;
                h6g h6gVar4 = h6g.c;
                ges j = nu0.j();
                yci a3 = androidx.compose.ui.platform.a.a(d.r(vciVar, 148), "title_placeholder");
                boolean z2 = this.b;
                ivf.l(z2, a3, j, hq5Var3, 48, 0);
                u1g.l(hq5Var3, d.e(vciVar, mu0.a));
                ivf.l(z2, androidx.compose.ui.platform.a.a(d.r(vciVar, 64), "subtitle_placeholder"), nu0.i(), hq5Var3, 48, 0);
                oq5Var5.p(true);
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                ivf.k(0, 0, hq5Var4, xp3.u(d.m(vciVar, 52), lsq.r(e9g.a, qo6.e, hq5Var4, 54)), z);
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                ta5 a4 = sa5.a(qx0.c, b2c.n, hq5Var5, 0);
                oq5 oq5Var8 = (oq5) hq5Var5;
                int i6 = oq5Var8.P;
                a l3 = oq5Var8.l();
                yci H3 = vnj.H(hq5Var5, vciVar);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar3);
                } else {
                    oq5Var8.n0();
                }
                g0g.U(hq5Var5, a4, wp5.f);
                g0g.U(hq5Var5, l3, wp5.e);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var8, i6, kb5Var3);
                }
                g0g.U(hq5Var5, H3, wp5.d);
                yci r = d.r(vciVar, 180);
                boolean z3 = this.b;
                ivf.l(z3, r, null, hq5Var5, 48, 4);
                ivf.l(z3, d.r(vciVar, 210), null, hq5Var5, 48, 4);
                oq5Var8.p(true);
                break;
            case 5:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var6;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                a0g.e(this.b, null, null, 0L, 0L, b0g.c, hq5Var6, 0, 30);
            case 6:
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                ivf.l(this.b, d.r(vciVar, 148), null, hq5Var7, 48, 4);
            case 7:
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var8;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                gdg.h(0, hq5Var8, null, z);
            case 8:
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var9;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        break;
                    }
                }
                ivf.k(0, 0, hq5Var9, xp3.u(d.c(vciVar, 1.0f), ugo.a), z);
            case 9:
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var13 = (oq5) hq5Var10;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                ta5 a5 = sa5.a(qx0.c, b2c.n, hq5Var10, 0);
                oq5 oq5Var14 = (oq5) hq5Var10;
                int i7 = oq5Var14.P;
                a l4 = oq5Var14.l();
                yci H4 = vnj.H(hq5Var10, vciVar);
                xp5.T.getClass();
                grb grbVar4 = wp5.b;
                oq5Var14.d0();
                if (oq5Var14.O) {
                    oq5Var14.k(grbVar4);
                } else {
                    oq5Var14.n0();
                }
                g0g.U(hq5Var10, a5, wp5.f);
                g0g.U(hq5Var10, l4, wp5.e);
                kb5 kb5Var4 = wp5.g;
                if (oq5Var14.O || !Intrinsics.d(oq5Var14.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var14, i7, kb5Var4);
                }
                g0g.U(hq5Var10, H4, wp5.d);
                yci r2 = d.r(vciVar, 214);
                boolean z4 = this.b;
                ivf.l(z4, r2, null, hq5Var10, 48, 4);
                ivf.l(z4, d.r(vciVar, 164), null, hq5Var10, 48, 4);
                oq5Var14.p(true);
                break;
            case 10:
                ((Integer) obj2).getClass();
                sj2.c(z, (hq5) obj, rvf.R(1));
                break;
            case 11:
                hq5 hq5Var11 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var11;
                if (oq5Var15.P(intValue & 1, (intValue & 3) != 2)) {
                    ta5 a6 = sa5.a(qx0.c, b2c.n, oq5Var15, 0);
                    int i8 = oq5Var15.P;
                    a l5 = oq5Var15.l();
                    yci H5 = vnj.H(oq5Var15, vciVar);
                    xp5.T.getClass();
                    grb grbVar5 = wp5.b;
                    oq5Var15.d0();
                    if (oq5Var15.O) {
                        oq5Var15.k(grbVar5);
                    } else {
                        oq5Var15.n0();
                    }
                    g0g.U(oq5Var15, a6, wp5.f);
                    g0g.U(oq5Var15, l5, wp5.e);
                    kb5 kb5Var5 = wp5.g;
                    if (oq5Var15.O || !Intrinsics.d(oq5Var15.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var15, i8, kb5Var5);
                    }
                    g0g.U(oq5Var15, H5, wp5.d);
                    yci r3 = d.r(vciVar, 148);
                    ges j2 = nu0.j();
                    boolean z5 = this.b;
                    ivf.l(z5, r3, j2, oq5Var15, 48, 0);
                    u1g.l(oq5Var15, d.e(vciVar, mu0.a));
                    ivf.l(z5, d.r(vciVar, 64), nu0.i(), oq5Var15, 48, 0);
                    oq5Var15.p(true);
                } else {
                    oq5Var15.S();
                }
                break;
            case 12:
                hq5 hq5Var12 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var16 = (oq5) hq5Var12;
                if (oq5Var16.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ta5 a7 = sa5.a(qx0.c, b2c.n, oq5Var16, 0);
                    int i9 = oq5Var16.P;
                    a l6 = oq5Var16.l();
                    yci H6 = vnj.H(oq5Var16, vciVar);
                    xp5.T.getClass();
                    grb grbVar6 = wp5.b;
                    oq5Var16.d0();
                    if (oq5Var16.O) {
                        oq5Var16.k(grbVar6);
                    } else {
                        oq5Var16.n0();
                    }
                    g0g.U(oq5Var16, a7, wp5.f);
                    g0g.U(oq5Var16, l6, wp5.e);
                    kb5 kb5Var6 = wp5.g;
                    if (oq5Var16.O || !Intrinsics.d(oq5Var16.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var16, i9, kb5Var6);
                    }
                    g0g.U(oq5Var16, H6, wp5.d);
                    yci r4 = d.r(vciVar, 148);
                    ges j3 = nu0.j();
                    boolean z6 = this.b;
                    ivf.l(z6, r4, j3, oq5Var16, 48, 0);
                    u1g.l(oq5Var16, d.e(vciVar, mu0.a));
                    ivf.l(z6, d.r(vciVar, 64), nu0.i(), oq5Var16, 48, 0);
                    oq5Var16.p(true);
                } else {
                    oq5Var16.S();
                }
                break;
            case 13:
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var13;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                if (z) {
                    oq5 oq5Var18 = (oq5) hq5Var13;
                    oq5Var18.Z(1466450993);
                    vum.b(d.m(vciVar, 24), ((dq0) oq5Var18.j(eq0.a)).a.a, 2, 0L, 0, oq5Var18, 390, 24);
                    oq5Var18.p(false);
                } else {
                    oq5 oq5Var19 = (oq5) hq5Var13;
                    oq5Var19.Z(1466657856);
                    gae.b(a0g.E(R.drawable.ic_check_24, 0, oq5Var19), rvf.M(R.string.button_accept, oq5Var19), null, ((dq0) oq5Var19.j(eq0.a)).a.a, oq5Var19, 0, 4);
                    oq5Var19.p(false);
                }
            case 14:
                ((Integer) obj2).getClass();
                y65.c(z, (hq5) obj, rvf.R(7));
                break;
            case 15:
                hq5 hq5Var14 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var20 = (oq5) hq5Var14;
                if (oq5Var20.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    float f = 16;
                    vci vciVar2 = vci.a;
                    yci a8 = androidx.compose.ui.platform.a.a(d.t(androidx.compose.foundation.layout.a.q(vciVar2, f, 4, f, 0.0f, 8), 0.0f, e9q.a, 1), "collection_wave_block_placeholder");
                    boolean z7 = this.b;
                    e9q.i(48, 0, oq5Var20, b.c(a8, "isLoading", Boolean.valueOf(z7)), z7, true);
                    u1g.l(oq5Var20, d.e(vciVar2, 8));
                    ivf.l(z7, d.r(androidx.compose.foundation.layout.a.o(vciVar2, 24, 0.0f, 2), 230), nu0.i(), oq5Var20, 48, 0);
                } else {
                    oq5Var20.S();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                vut.e(z, (hq5) obj, rvf.R(7));
                break;
            case 17:
                hq5 hq5Var15 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var21 = (oq5) hq5Var15;
                if (!oq5Var21.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    oq5Var21.S();
                } else if (z) {
                    oq5Var21.Z(1898584078);
                    gae.b(a0g.E(R.drawable.ic_check_24, 0, oq5Var21), null, d.m(vciVar, 24), ((dq0) oq5Var21.j(eq0.a)).a.a, oq5Var21, 432, 0);
                    oq5Var21.p(false);
                } else {
                    oq5Var21.Z(1898851205);
                    vz1.B(vciVar, 24, oq5Var21, false);
                }
                break;
            case 18:
                hq5 hq5Var16 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var22 = (oq5) hq5Var16;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        break;
                    }
                }
                ivf.l(this.b, d.r(vciVar, 64), null, hq5Var16, 48, 4);
            case 19:
                hq5 hq5Var17 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var23 = (oq5) hq5Var17;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                        break;
                    }
                }
                if (!z) {
                    if (z) {
                        b6e.s();
                        break;
                    } else {
                        i = R.string.listen;
                    }
                } else {
                    i = R.string.pause;
                }
                if (!z) {
                    if (z) {
                        b6e.s();
                        break;
                    } else {
                        i2 = R.drawable.ic_play_64;
                    }
                } else {
                    i2 = R.drawable.ic_pause_64;
                }
                gae.b(a0g.E(i2, 0, hq5Var17), rvf.M(i, hq5Var17), d.m(vciVar, fj6.b), ((dq0) ((oq5) hq5Var17).j(eq0.a)).a.h, hq5Var17, 384, 0);
            case 20:
                hq5 hq5Var18 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var24 = (oq5) hq5Var18;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        break;
                    }
                }
                float f2 = 12;
                ivf.k(0, 0, hq5Var18, androidx.compose.ui.platform.a.a(d.m(xp3.u(androidx.compose.foundation.layout.a.q(vci.a, 16, f2, 0.0f, f2, 4), irf.R(qo6.a, hq5Var18)), 52), "cover_track_placeholder"), z);
            case 21:
                hq5 hq5Var19 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var25 = (oq5) hq5Var19;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        break;
                    }
                }
                ta5 a9 = sa5.a(qx0.c, b2c.n, hq5Var19, 0);
                oq5 oq5Var26 = (oq5) hq5Var19;
                int i10 = oq5Var26.P;
                a l7 = oq5Var26.l();
                yci H7 = vnj.H(hq5Var19, vciVar);
                xp5.T.getClass();
                grb grbVar7 = wp5.b;
                oq5Var26.d0();
                if (oq5Var26.O) {
                    oq5Var26.k(grbVar7);
                } else {
                    oq5Var26.n0();
                }
                g0g.U(hq5Var19, a9, wp5.f);
                g0g.U(hq5Var19, l7, wp5.e);
                kb5 kb5Var7 = wp5.g;
                if (oq5Var26.O || !Intrinsics.d(oq5Var26.K(), Integer.valueOf(i10))) {
                    ouj.x(i10, oq5Var26, i10, kb5Var7);
                }
                g0g.U(hq5Var19, H7, wp5.d);
                h6g h6gVar5 = nu0.a;
                h6g h6gVar6 = h6g.c;
                ges j4 = nu0.j();
                yci a10 = androidx.compose.ui.platform.a.a(d.r(vciVar, 148), "title_placeholder");
                boolean z8 = this.b;
                ivf.l(z8, a10, j4, hq5Var19, 48, 0);
                u1g.l(hq5Var19, d.e(vciVar, mu0.a));
                ivf.l(z8, androidx.compose.ui.platform.a.a(d.r(vciVar, 64), "subtitle_placeholder"), nu0.i(), hq5Var19, 48, 0);
                oq5Var26.p(true);
                break;
            case 22:
                hq5 hq5Var20 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var27 = (oq5) hq5Var20;
                if (oq5Var27.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ivf.l(this.b, d.r(vciVar, 148), null, oq5Var27, 48, 4);
                } else {
                    oq5Var27.S();
                }
                break;
            case 23:
                hq5 hq5Var21 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var28 = (oq5) hq5Var21;
                if (oq5Var28.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ivf.l(this.b, d.r(vciVar, 260), null, oq5Var28, 48, 4);
                } else {
                    oq5Var28.S();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                vut.p(z, (hq5) obj, rvf.R(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                avf.e(z, (hq5) obj, rvf.R(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ivf.f(z, (hq5) obj, rvf.R(1));
                break;
            case 27:
                hq5 hq5Var22 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                int i11 = 1;
                oq5 oq5Var29 = (oq5) hq5Var22;
                if (oq5Var29.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    yci u = xp3.u(vciVar, ugo.a);
                    Object K = oq5Var29.K();
                    if (K == gq5.a) {
                        K = new m2j(i11);
                        oq5Var29.k0(K);
                    }
                    ivf.k(0, 0, oq5Var29, androidx.compose.ui.draw.a.c(u, (Function1) K), z);
                } else {
                    oq5Var29.S();
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var23 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var30 = (oq5) hq5Var23;
                if (oq5Var30.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    vci vciVar3 = vci.a;
                    yci h = d.h(vciVar3, 107);
                    kfh d = ug3.d(b2c.b, false);
                    int i12 = oq5Var30.P;
                    a l8 = oq5Var30.l();
                    yci H8 = vnj.H(oq5Var30, h);
                    xp5.T.getClass();
                    grb grbVar8 = wp5.b;
                    oq5Var30.d0();
                    if (oq5Var30.O) {
                        oq5Var30.k(grbVar8);
                    } else {
                        oq5Var30.n0();
                    }
                    kb5 kb5Var8 = wp5.f;
                    g0g.U(oq5Var30, d, kb5Var8);
                    kb5 kb5Var9 = wp5.e;
                    g0g.U(oq5Var30, l8, kb5Var9);
                    kb5 kb5Var10 = wp5.g;
                    if (oq5Var30.O || !Intrinsics.d(oq5Var30.K(), Integer.valueOf(i12))) {
                        ouj.x(i12, oq5Var30, i12, kb5Var10);
                    }
                    kb5 kb5Var11 = wp5.d;
                    g0g.U(oq5Var30, H8, kb5Var11);
                    yci u2 = xp3.u(d.c(vciVar3, 1.0f), o5g.C(oq5Var30));
                    boolean z9 = this.b;
                    ivf.k(0, 0, oq5Var30, u2, z9);
                    x2i x2iVar = qx0.a;
                    hz2 hz2Var = b2c.l;
                    float f3 = 12;
                    yci m = androidx.compose.foundation.layout.a.m(d.d(vciVar3, 1.0f), f3);
                    nho a11 = lho.a(x2iVar, hz2Var, oq5Var30, 54);
                    int i13 = oq5Var30.P;
                    a l9 = oq5Var30.l();
                    yci H9 = vnj.H(oq5Var30, m);
                    oq5Var30.d0();
                    if (oq5Var30.O) {
                        oq5Var30.k(grbVar8);
                    } else {
                        oq5Var30.n0();
                    }
                    g0g.U(oq5Var30, a11, kb5Var8);
                    g0g.U(oq5Var30, l9, kb5Var9);
                    if (oq5Var30.O || !Intrinsics.d(oq5Var30.K(), Integer.valueOf(i13))) {
                        ouj.x(i13, oq5Var30, i13, kb5Var10);
                    }
                    g0g.U(oq5Var30, H9, kb5Var11);
                    ivf.k(0, 0, oq5Var30, xp3.u(d.m(vciVar3, 80), o5g.F(oq5Var30)), z9);
                    yci q = androidx.compose.foundation.layout.a.q(vciVar3, f3, 0.0f, 0.0f, 0.0f, 14);
                    ta5 a12 = sa5.a(qx0.c, b2c.n, oq5Var30, 0);
                    int i14 = oq5Var30.P;
                    a l10 = oq5Var30.l();
                    yci H10 = vnj.H(oq5Var30, q);
                    oq5Var30.d0();
                    if (oq5Var30.O) {
                        oq5Var30.k(grbVar8);
                    } else {
                        oq5Var30.n0();
                    }
                    g0g.U(oq5Var30, a12, kb5Var8);
                    g0g.U(oq5Var30, l10, kb5Var9);
                    if (oq5Var30.O || !Intrinsics.d(oq5Var30.K(), Integer.valueOf(i14))) {
                        ouj.x(i14, oq5Var30, i14, kb5Var10);
                    }
                    g0g.U(oq5Var30, H10, kb5Var11);
                    ivf.l(z9, d.r(xp3.u(vciVar3, o5g.G(oq5Var30)), 148), nu0.j(), oq5Var30, 0, 0);
                    u1g.l(oq5Var30, d.m(vciVar3, 4));
                    ivf.l(z9, d.r(xp3.u(vciVar3, o5g.G(oq5Var30)), 64), nu0.j(), oq5Var30, 0, 0);
                    f1d.u(oq5Var30, true, true, true);
                } else {
                    oq5Var30.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                j66.y(z, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sm(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
