package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.view.View;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes4.dex */
public final /* synthetic */ class t31 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t31(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        o1v o1vVar = (o1v) this.b;
        sai saiVar = (sai) obj2;
        hq5 hq5Var = (hq5) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ua5) obj).getClass();
        saiVar.getClass();
        if ((intValue & 48) == 0) {
            intValue |= ((oq5) hq5Var).f(saiVar) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 145) != 144)) {
            rmb a = ((hai) oq5Var.j(iai.a)).b.a(new jab(qkb.InformationBlock, 1, 1, 0), null);
            int i = intValue & 112;
            boolean z = i == 32;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new co5(saiVar, 4);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h = oq5Var.h(a) | (i == 32) | oq5Var.f(o1vVar);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new ftr(9, a, saiVar, o1vVar);
                oq5Var.k0(K2);
            }
            a4g.p(function0, (Function0) K2, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = (List) this.b;
        int intValue = ((Integer) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        ((Integer) obj4).getClass();
        ((b3k) obj).getClass();
        vci vciVar = vci.a;
        yci c = d.c(vciVar, 1.0f);
        kfh d = ug3.d(b2c.f, false);
        oq5 oq5Var = (oq5) hq5Var;
        int i = oq5Var.P;
        a l = oq5Var.l();
        yci H = vnj.H(hq5Var, c);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
            oq5Var.k(grbVar);
        } else {
            oq5Var.n0();
        }
        g0g.U(hq5Var, d, wp5.f);
        g0g.U(hq5Var, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var, i, kb5Var);
        }
        g0g.U(hq5Var, H, wp5.d);
        String o = ouj.o(rvf.M(((rmv) list.get(intValue)).b, hq5Var), ". ", rvf.M(R.string.widget_install_a11y_widget, hq5Var));
        w4k E = a0g.E(((rmv) list.get(intValue)).a, 0, hq5Var);
        yci t = d.t(vciVar, 400, 0.0f, 2);
        boolean f = oq5Var.f(o);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            K = new srp(o, 23);
            oq5Var.k0(K);
        }
        irf.r(E, null, nfp.a(t, (Function1) K), null, null, 0.0f, null, hq5Var, 48, 120);
        oq5Var.p(true);
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        jzb jzbVar = (jzb) this.b;
        String str = (String) obj2;
        hq5 hq5Var = (hq5) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((cl0) obj).getClass();
        str.getClass();
        nho a = lho.a(qx0.a, b2c.l, hq5Var, 48);
        oq5 oq5Var = (oq5) hq5Var;
        int i = oq5Var.P;
        a l = oq5Var.l();
        vci vciVar = vci.a;
        yci H = vnj.H(hq5Var, vciVar);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
            oq5Var.k(grbVar);
        } else {
            oq5Var.n0();
        }
        g0g.U(hq5Var, a, wp5.f);
        g0g.U(hq5Var, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var, i, kb5Var);
        }
        g0g.U(hq5Var, H, wp5.d);
        long j = ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a;
        ges gesVar = neg.t(hq5Var).i.a;
        long z = v7g.z(14);
        v7g.p(z);
        long D = v7g.D(kes.c(z) * 0.45454544f, z & 1095216660480L);
        long z2 = v7g.z(20);
        v7g.p(z2);
        xcs.b(str, null, j, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ges.f(gesVar, 0L, D, null, 0L, null, new otp(c3x.f(1711276032), swf.i(0.0f, 1.0f), 1.0f), 0, v7g.D(kes.c(z2) * 0.45454544f, 1095216660480L & z2), 16637949), hq5Var, (intValue >> 3) & 14, 3120, 55290);
        if (jzbVar != null) {
            oq5Var.Z(-136601671);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(9);
                oq5Var.k0(K);
            }
            y7g.o(jzbVar, d.m(androidx.compose.foundation.layout.a.i(vciVar, (Function1) K), 16 * 0.45454544f), hq5Var, 0);
        } else {
            oq5Var.Z(-146394013);
        }
        oq5Var.p(false);
        oq5Var.p(true);
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        long j2;
        Function0 function0;
        int i;
        final wvv wvvVar = (wvv) this.b;
        g0w g0wVar = (g0w) obj2;
        ((Integer) obj4).getClass();
        ((cl0) obj).getClass();
        oq5 oq5Var = (oq5) ((hq5) obj3);
        oq5Var.Z(-1236258398);
        final int i2 = 3;
        Object obj5 = gq5.a;
        final int i3 = 1;
        final int i4 = 0;
        if (g0wVar != null && g0wVar.a()) {
            oq5Var.Z(330714052);
            neg.s(oq5Var);
            j = neg.n(oq5Var).c.a;
            j2 = neg.n(oq5Var).a.a;
            neg.n(oq5Var);
            boolean h = oq5Var.h(wvvVar);
            Object K = oq5Var.K();
            if (h || K == obj5) {
                K = new Function0() { // from class: pvv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.f0();
                                break;
                            case 1:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.g0();
                                break;
                            case 2:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.g0();
                                break;
                            default:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.X();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            function0 = (Function0) K;
            oq5Var.p(false);
            i = R.string.wizard_progress_button_text_continue;
        } else if (g0wVar instanceof e0w) {
            oq5Var.Z(-1236245210);
            neg.u(oq5Var).getClass();
            oq5Var.p(false);
            oq5Var.Z(331131374);
            boolean h2 = oq5Var.h(wvvVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == obj5) {
                K2 = new Function0() { // from class: pvv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.f0();
                                break;
                            case 1:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.g0();
                                break;
                            case 2:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.g0();
                                break;
                            default:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.X();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            pd.c(0, 1, oq5Var, (Function0) K2, false);
            neg.s(oq5Var);
            ozm ozmVar = eq0.a;
            j = ((dq0) oq5Var.j(ozmVar)).b.a;
            j2 = ((dq0) oq5Var.j(ozmVar)).d.e;
            boolean h3 = oq5Var.h(wvvVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == obj5) {
                final int i5 = 2;
                K3 = new Function0() { // from class: pvv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.f0();
                                break;
                            case 1:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.g0();
                                break;
                            case 2:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.g0();
                                break;
                            default:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.X();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K3);
            }
            function0 = (Function0) K3;
            oq5Var.p(false);
            i = R.string.wizard_progress_button_text_later;
        } else {
            oq5Var.Z(331105391);
            oq5Var.p(false);
            neg.u(oq5Var).getClass();
            oq5Var.Z(331958733);
            neg.s(oq5Var);
            ozm ozmVar2 = eq0.a;
            j = ((dq0) oq5Var.j(ozmVar2)).b.a;
            j2 = ((dq0) oq5Var.j(ozmVar2)).d.e;
            boolean h4 = oq5Var.h(wvvVar);
            Object K4 = oq5Var.K();
            if (h4 || K4 == obj5) {
                K4 = new Function0() { // from class: pvv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.f0();
                                break;
                            case 1:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.g0();
                                break;
                            case 2:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.g0();
                                break;
                            default:
                                ((j1w) ((cyv) wvvVar.c.b).c.a).a.X();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K4);
            }
            function0 = (Function0) K4;
            oq5Var.p(false);
            i = R.string.wizard_progress_button_text_back;
        }
        oq5Var.p(false);
        vci vciVar = vci.a;
        yci f = xp3.u(androidx.compose.ui.platform.a.a(vciVar, "wizard_footer_button"), ugo.a).f(androidx.compose.foundation.a.b(vciVar, j2, vnj.i));
        oq5Var.Z(-1236197966);
        boolean f2 = oq5Var.f(function0);
        Object K5 = oq5Var.K();
        if (f2 || K5 == obj5) {
            K5 = new gct(20, function0);
            oq5Var.k0(K5);
        }
        yci e = androidx.compose.foundation.a.e(vciVar, false, null, null, (Function0) K5, 7);
        oq5Var.p(false);
        yci f3 = f.f(e);
        kfh d = ug3.d(b2c.b, false);
        int i6 = oq5Var.P;
        a l = oq5Var.l();
        yci H = vnj.H(oq5Var, f3);
        xp5.T.getClass();
        Function0 function02 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
            oq5Var.k(function02);
        } else {
            oq5Var.n0();
        }
        g0g.U(oq5Var, d, wp5.f);
        g0g.U(oq5Var, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
            ouj.x(i6, oq5Var, i6, kb5Var);
        }
        g0g.U(oq5Var, H, wp5.d);
        xcs.b(rvf.M(i, oq5Var), androidx.compose.foundation.layout.a.n(androidx.compose.ui.platform.a.a(vciVar, "wizard_footer_button_text"), 16, 10), j, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(oq5Var).b.b, oq5Var, 48, 0, 65016);
        oq5Var.p(true);
        return Unit.a;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        h9f h9fVar;
        oq5 oq5Var;
        vci vciVar;
        h9f h9fVar2;
        oq5 oq5Var2;
        yci yciVar;
        yci u;
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.a) {
            case 0:
                p31 p31Var = (p31) this.b;
                m31 m31Var = (m31) obj;
                s31 s31Var = (s31) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                m31Var.getClass();
                s31Var.getClass();
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var3 = (oq5) hq5Var;
                int i5 = oq5Var3.P;
                a l = oq5Var3.l();
                vci vciVar2 = vci.a;
                yci H = vnj.H(hq5Var, vciVar2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var, a, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var3, i5, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                String str = m31Var.d;
                if (str == null) {
                    oq5Var3.Z(163942628);
                    oq5Var3.p(false);
                    oq5Var = oq5Var3;
                    vciVar = vciVar2;
                } else {
                    oq5Var3.Z(163942629);
                    if (m31Var.e != null) {
                        oq5Var3.Z(1473085966);
                        boolean h = oq5Var3.h(s31Var);
                        Object K = oq5Var3.K();
                        if (h || K == gq5.a) {
                            K = new zy(0, s31Var, s31.class, "onHeaderClick", "onHeaderClick()V", 0, 22);
                            oq5Var3.k0(K);
                        }
                        h9fVar = (h9f) K;
                        oq5Var3.p(false);
                    } else {
                        oq5Var3.Z(1473115105);
                        oq5Var3.p(false);
                        h9fVar = null;
                    }
                    Function0 function0 = (Function0) h9fVar;
                    oq5Var = oq5Var3;
                    vciVar = vciVar2;
                    irf.h(str, null, null, null, function0, false, null, false, null, hq5Var, 0, 494);
                    oq5Var.p(false);
                }
                hld.d((nii) p31Var.a.getValue(), s31Var, androidx.compose.ui.platform.a.a(vciVar, "block_concerts"), hq5Var, (intValue & 112) | 384);
                oq5Var.p(true);
                return Unit.a;
            case 1:
                pk1 pk1Var = (pk1) this.b;
                ok1 ok1Var = (ok1) obj;
                sk1 sk1Var = (sk1) obj2;
                hq5 hq5Var2 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ok1Var.getClass();
                sk1Var.getClass();
                yci a2 = androidx.compose.ui.platform.a.a(vci.a, "block_artist_popular_tracks");
                ta5 a3 = sa5.a(qx0.c, b2c.n, hq5Var2, 0);
                oq5 oq5Var4 = (oq5) hq5Var2;
                int i6 = oq5Var4.P;
                a l2 = oq5Var4.l();
                yci H2 = vnj.H(hq5Var2, a2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, a3, wp5.f);
                g0g.U(hq5Var2, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var4, i6, kb5Var2);
                }
                g0g.U(hq5Var2, H2, wp5.d);
                String str2 = ok1Var.d;
                if (str2 == null) {
                    oq5Var4.Z(-232501271);
                    oq5Var4.p(false);
                    oq5Var2 = oq5Var4;
                    yciVar = null;
                } else {
                    oq5Var4.Z(-232501270);
                    if (ok1Var.e != null) {
                        oq5Var4.Z(-1496882387);
                        boolean h2 = oq5Var4.h(sk1Var);
                        Object K2 = oq5Var4.K();
                        if (h2 || K2 == gq5.a) {
                            K2 = new oi1(0, sk1Var, sk1.class, "onViewAllClick", "onViewAllClick()V", 0, 5);
                            oq5Var4.k0(K2);
                        }
                        h9fVar2 = (h9f) K2;
                        oq5Var4.p(false);
                    } else {
                        oq5Var4.Z(-1496852287);
                        oq5Var4.p(false);
                        h9fVar2 = null;
                    }
                    Function0 function02 = (Function0) h9fVar2;
                    oq5Var2 = oq5Var4;
                    yciVar = null;
                    irf.h(str2, null, null, null, function02, false, null, false, null, hq5Var2, 0, 494);
                    oq5Var2.p(false);
                }
                up6.d((nii) pk1Var.a.getValue(), sk1Var, yciVar, hq5Var2, intValue2 & 112);
                oq5Var2.p(true);
                return Unit.a;
            case 2:
                ub4 ub4Var = (ub4) this.b;
                sai saiVar = (sai) obj2;
                hq5 hq5Var3 = (hq5) obj3;
                int d = eta.d((Integer) obj4, (ua5) obj, saiVar);
                if ((d & 48) == 0) {
                    d |= ((oq5) hq5Var3).f(saiVar) ? 32 : 16;
                }
                oq5 oq5Var5 = (oq5) hq5Var3;
                if (oq5Var5.P(d & 1, (d & 145) != 144)) {
                    boolean f = oq5Var5.f(ub4Var) | ((d & 112) == 32);
                    Object K3 = oq5Var5.K();
                    if (f || K3 == gq5.a) {
                        K3 = new ap1(0, saiVar, ub4Var);
                        oq5Var5.k0(K3);
                    }
                    lxe.a((Function0) K3, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 3:
                qn2 qn2Var = (qn2) this.b;
                uo2 uo2Var = (uo2) obj2;
                hq5 hq5Var4 = (hq5) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((cl0) obj).getClass();
                uo2Var.getClass();
                if (uo2Var instanceof so2) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    oq5Var6.Z(-1561289615);
                    mo2 mo2Var = ((so2) uo2Var).a;
                    boolean h3 = ((((intValue3 & 112) ^ 48) > 32 && oq5Var6.f(uo2Var)) || (intValue3 & 48) == 32) | oq5Var6.h(qn2Var);
                    Object K4 = oq5Var6.K();
                    if (h3 || K4 == gq5.a) {
                        K4 = new m32(4, qn2Var, uo2Var);
                        oq5Var6.k0(K4);
                    }
                    u = d.u(d.d(com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K4, 15), 1.0f), b2c.l, (r2 & 2) == 0);
                    float f2 = 8;
                    float f3 = 16;
                    ot0.c(mo2Var, qn2Var, androidx.compose.foundation.layout.a.p(u, f3, irv.f(oq5Var6) + f2, f3, f2), oq5Var6, 0);
                    oq5Var6.p(false);
                } else {
                    if (!uo2Var.equals(to2.a)) {
                        throw vz1.i((oq5) hq5Var4, -1990028545, false);
                    }
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    oq5Var7.Z(-1990005584);
                    oq5Var7.p(false);
                }
                return Unit.a;
            case 4:
                pyc pycVar = (pyc) this.b;
                Integer num = (Integer) obj2;
                num.intValue();
                int intValue4 = ((Integer) obj4).intValue();
                ((b3k) obj).getClass();
                pycVar.invoke(num, (hq5) obj3, Integer.valueOf((intValue4 >> 3) & 14));
                return Unit.a;
            case 5:
                b84 b84Var = (b84) this.b;
                hq5 hq5Var5 = (hq5) obj3;
                int d2 = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
                oq5 oq5Var8 = (oq5) hq5Var5;
                if (oq5Var8.P(d2 & 1, (d2 & 129) != 128)) {
                    Object K5 = oq5Var8.K();
                    kjn kjnVar = gq5.a;
                    if (K5 == kjnVar) {
                        K5 = new z74(b84Var);
                        oq5Var8.k0(K5);
                    }
                    cxb.c((z74) K5, oq5Var8, 0);
                    l74 l74Var = b84Var.b;
                    boolean h4 = oq5Var8.h(l74Var);
                    Object K6 = oq5Var8.K();
                    if (h4 || K6 == kjnVar) {
                        t93 t93Var = new t93(0, l74Var, l74.class, "onClose", "onClose()V", 0, 27);
                        oq5Var8.k0(t93Var);
                        K6 = t93Var;
                    }
                    wyf.c(null, null, null, null, (Function0) ((h9f) K6), oq5Var8, 0, 31);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 6:
                k65 k65Var = (k65) this.b;
                int intValue5 = ((Integer) obj).intValue();
                aau aauVar = (aau) obj2;
                int intValue6 = ((Integer) obj4).intValue();
                aauVar.getClass();
                z9u z9uVar = aauVar.b;
                oq5 oq5Var9 = (oq5) ((hq5) obj3);
                boolean h5 = oq5Var9.h(k65Var) | oq5Var9.h(aauVar) | ((((intValue6 & 14) ^ 6) > 4 && oq5Var9.d(intValue5)) || (intValue6 & 6) == 4);
                Object K7 = oq5Var9.K();
                if (h5 || K7 == gq5.a) {
                    K7 = new h65(k65Var, aauVar, intValue5, 0);
                    oq5Var9.k0(K7);
                }
                o5g.j(z9uVar, (Function0) K7, b.b(androidx.compose.ui.platform.a.a(vci.a, "video_clip_item"), intValue5), oq5Var9, 0, 0);
                return Unit.a;
            case 7:
                y26 y26Var = (y26) this.b;
                int intValue7 = ((Integer) obj).intValue();
                e36 e36Var = (e36) obj2;
                hq5 hq5Var6 = (hq5) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                e36Var.getClass();
                if ((intValue8 & 6) == 0) {
                    i = (((oq5) hq5Var6).d(intValue7) ? 4 : 2) | intValue8;
                } else {
                    i = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i |= (intValue8 & 64) == 0 ? ((oq5) hq5Var6).f(e36Var) : ((oq5) hq5Var6).h(e36Var) ? 32 : 16;
                }
                oq5 oq5Var10 = (oq5) hq5Var6;
                if (!oq5Var10.P(i & 1, (i & 147) != 146)) {
                    oq5Var10.S();
                } else if (e36Var instanceof c36) {
                    oq5Var10.Z(-1104443596);
                    ct5 ct5Var = ((c36) e36Var).a.b;
                    int i7 = i & 14;
                    int i8 = i & 112;
                    boolean h6 = oq5Var10.h(y26Var) | (i7 == 4) | (i8 == 32 || ((i & 64) != 0 && oq5Var10.h(e36Var)));
                    Object K8 = oq5Var10.K();
                    kjn kjnVar2 = gq5.a;
                    if (h6 || K8 == kjnVar2) {
                        K8 = new de(y26Var, intValue7, e36Var, 7);
                        oq5Var10.k0(K8);
                    }
                    Function0 function03 = (Function0) K8;
                    boolean b = y26Var.b();
                    boolean h7 = (i8 == 32 || ((i & 64) != 0 && oq5Var10.h(e36Var))) | oq5Var10.h(y26Var) | (i7 == 4);
                    Object K9 = oq5Var10.K();
                    if (h7 || K9 == kjnVar2) {
                        K9 = new z2(e36Var, y26Var, intValue7, 22);
                        oq5Var10.k0(K9);
                    }
                    qwp.i(ct5Var, function03, b, b.b(androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K9, 15), "concert_item"), intValue7), oq5Var10, 8);
                    oq5Var10.p(false);
                } else {
                    if (!(e36Var instanceof d36)) {
                        throw vz1.i(oq5Var10, -1282556195, false);
                    }
                    oq5Var10.Z(-1103156104);
                    up6.l(y26Var, (d36) e36Var, oq5Var10, i & 112);
                    oq5Var10.p(false);
                }
                return Unit.a;
            case 8:
                tea teaVar = (tea) this.b;
                int intValue9 = ((Integer) obj).intValue();
                nt ntVar = (nt) obj2;
                hq5 hq5Var7 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ntVar.getClass();
                taj S = y9w.S(ntVar.a, new ix6(27, teaVar), hq5Var7);
                x1g x1gVar = ntVar.b;
                w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var7).getValue();
                yci b2 = b.b(vci.a, intValue9);
                oq5 oq5Var11 = (oq5) hq5Var7;
                boolean h8 = oq5Var11.h(S);
                Object K10 = oq5Var11.K();
                kjn kjnVar3 = gq5.a;
                if (h8 || K10 == kjnVar3) {
                    K10 = new oea(S, 1);
                    oq5Var11.k0(K10);
                }
                Function0 function04 = (Function0) K10;
                boolean h9 = oq5Var11.h(S);
                Object K11 = oq5Var11.K();
                if (h9 || K11 == kjnVar3) {
                    K11 = new oea(S, 0);
                    oq5Var11.k0(K11);
                }
                w1g.a(function04, x1gVar, w3gVar, b2, false, (Function0) K11, oq5Var11, 0, 16);
                return Unit.a;
            case 9:
                xha xhaVar = (xha) this.b;
                int intValue10 = ((Integer) obj).intValue();
                nt ntVar2 = (nt) obj2;
                hq5 hq5Var8 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ntVar2.getClass();
                taj S2 = y9w.S(ntVar2.a, new jzi(xhaVar), hq5Var8);
                x1g x1gVar2 = ntVar2.b;
                w3g w3gVar2 = (w3g) szf.Q(S2.b(), hq5Var8).getValue();
                yci b3 = b.b(vci.a, intValue10);
                oq5 oq5Var12 = (oq5) hq5Var8;
                boolean h10 = oq5Var12.h(S2);
                Object K12 = oq5Var12.K();
                kjn kjnVar4 = gq5.a;
                if (h10 || K12 == kjnVar4) {
                    K12 = new oea(S2, 5);
                    oq5Var12.k0(K12);
                }
                Function0 function05 = (Function0) K12;
                boolean h11 = oq5Var12.h(S2);
                Object K13 = oq5Var12.K();
                if (h11 || K13 == kjnVar4) {
                    K13 = new oea(S2, 4);
                    oq5Var12.k0(K13);
                }
                w1g.a(function05, x1gVar2, w3gVar2, b3, false, (Function0) K13, oq5Var12, 0, 16);
                return Unit.a;
            case 10:
                xsr xsrVar = (xsr) this.b;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                xsrVar.z(new hwc(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 11:
                s2e s2eVar = (s2e) this.b;
                kqv kqvVar = (kqv) obj2;
                ((View) obj).getClass();
                kqvVar.getClass();
                ((cme) obj3).getClass();
                zne g = kqvVar.a.g(519);
                g.getClass();
                s2eVar.A = g.d + g.b;
                s2eVar.o();
                return Unit.a;
            case 12:
                final v0i v0iVar = (v0i) this.b;
                int intValue11 = ((Integer) obj).intValue();
                final p0i p0iVar = (p0i) obj2;
                hq5 hq5Var9 = (hq5) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                p0iVar.getClass();
                if ((intValue12 & 6) == 0) {
                    i2 = (((oq5) hq5Var9).d(intValue11) ? 4 : 2) | intValue12;
                } else {
                    i2 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i2 |= ((oq5) hq5Var9).f(p0iVar) ? 32 : 16;
                }
                oq5 oq5Var13 = (oq5) hq5Var9;
                if (oq5Var13.P(i2 & 1, (i2 & 147) != 146)) {
                    rab rabVar = p0iVar.a;
                    yci b4 = b.b(vci.a, intValue11);
                    int i9 = i2 & 112;
                    boolean f4 = oq5Var13.f(v0iVar) | (i9 == 32);
                    Object K14 = oq5Var13.K();
                    kjn kjnVar5 = gq5.a;
                    if (f4 || K14 == kjnVar5) {
                        final int i10 = 0;
                        K14 = new Function0() { // from class: x0i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        oq oqVar = p0iVar.b;
                                        oqVar.getClass();
                                        w0i w0iVar = v0iVar.c;
                                        w0iVar.getClass();
                                        t tVar = w0iVar.a;
                                        tVar.startActivity(quj.T(tVar, oqVar, new h(Page.METATAG_ALBUMS)));
                                        break;
                                    default:
                                        oq oqVar2 = p0iVar.b;
                                        oqVar2.getClass();
                                        w0i w0iVar2 = v0iVar.c;
                                        w0iVar2.getClass();
                                        lwg C = g0g.C(oqVar2, null);
                                        y supportFragmentManager = w0iVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var13.k0(K14);
                    }
                    Function0 function06 = (Function0) K14;
                    boolean f5 = oq5Var13.f(v0iVar) | (i9 == 32);
                    Object K15 = oq5Var13.K();
                    if (f5 || K15 == kjnVar5) {
                        final int i11 = 1;
                        K15 = new Function0() { // from class: x0i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        oq oqVar = p0iVar.b;
                                        oqVar.getClass();
                                        w0i w0iVar = v0iVar.c;
                                        w0iVar.getClass();
                                        t tVar = w0iVar.a;
                                        tVar.startActivity(quj.T(tVar, oqVar, new h(Page.METATAG_ALBUMS)));
                                        break;
                                    default:
                                        oq oqVar2 = p0iVar.b;
                                        oqVar2.getClass();
                                        w0i w0iVar2 = v0iVar.c;
                                        w0iVar2.getClass();
                                        lwg C = g0g.C(oqVar2, null);
                                        y supportFragmentManager = w0iVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var13.k0(K15);
                    }
                    irf.a(0, 16, oq5Var13, rabVar, b4, function06, (Function0) K15, false);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 13:
                final i1i i1iVar = (i1i) this.b;
                int intValue13 = ((Integer) obj).intValue();
                final c1i c1iVar = (c1i) obj2;
                hq5 hq5Var10 = (hq5) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                c1iVar.getClass();
                if ((intValue14 & 6) == 0) {
                    i3 = (((oq5) hq5Var10).d(intValue13) ? 4 : 2) | intValue14;
                } else {
                    i3 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i3 |= ((oq5) hq5Var10).f(c1iVar) ? 32 : 16;
                }
                oq5 oq5Var14 = (oq5) hq5Var10;
                if (oq5Var14.P(i3 & 1, (i3 & 147) != 146)) {
                    jd1 jd1Var = c1iVar.a;
                    yci b5 = b.b(vci.a, intValue13);
                    int i12 = i3 & 112;
                    boolean f6 = oq5Var14.f(i1iVar) | (i12 == 32);
                    Object K16 = oq5Var14.K();
                    kjn kjnVar6 = gq5.a;
                    if (f6 || K16 == kjnVar6) {
                        final int i13 = 0;
                        K16 = new Function0() { // from class: k1i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i14 = i13;
                                c1i c1iVar2 = c1iVar;
                                i1i i1iVar2 = i1iVar;
                                switch (i14) {
                                    case 0:
                                        c01 c01Var = c1iVar2.b;
                                        c01Var.getClass();
                                        j1i j1iVar = i1iVar2.c;
                                        j1iVar.getClass();
                                        t tVar = j1iVar.a;
                                        int i15 = ArtistScreenActivity.w0;
                                        tVar.startActivity(l48.o(tVar, c01Var, new h(Page.METATAG_ARTISTS), 24));
                                        break;
                                    default:
                                        c01 c01Var2 = c1iVar2.b;
                                        c01Var2.getClass();
                                        j1i j1iVar2 = i1iVar2.c;
                                        j1iVar2.getClass();
                                        lwg E = g0g.E(c01Var2);
                                        y supportFragmentManager = j1iVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, E), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var14.k0(K16);
                    }
                    Function0 function07 = (Function0) K16;
                    boolean f7 = oq5Var14.f(i1iVar) | (i12 == 32);
                    Object K17 = oq5Var14.K();
                    if (f7 || K17 == kjnVar6) {
                        final int i14 = 1;
                        K17 = new Function0() { // from class: k1i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i14;
                                c1i c1iVar2 = c1iVar;
                                i1i i1iVar2 = i1iVar;
                                switch (i142) {
                                    case 0:
                                        c01 c01Var = c1iVar2.b;
                                        c01Var.getClass();
                                        j1i j1iVar = i1iVar2.c;
                                        j1iVar.getClass();
                                        t tVar = j1iVar.a;
                                        int i15 = ArtistScreenActivity.w0;
                                        tVar.startActivity(l48.o(tVar, c01Var, new h(Page.METATAG_ARTISTS), 24));
                                        break;
                                    default:
                                        c01 c01Var2 = c1iVar2.b;
                                        c01Var2.getClass();
                                        j1i j1iVar2 = i1iVar2.c;
                                        j1iVar2.getClass();
                                        lwg E = g0g.E(c01Var2);
                                        y supportFragmentManager = j1iVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, E), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var14.k0(K17);
                    }
                    jf0.b(function07, jd1Var, b5, null, null, (Function0) K17, oq5Var14, 0, 24);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 14:
                final b2i b2iVar = (b2i) this.b;
                int intValue15 = ((Integer) obj).intValue();
                final w1i w1iVar = (w1i) obj2;
                hq5 hq5Var11 = (hq5) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                w1iVar.getClass();
                if ((intValue16 & 6) == 0) {
                    i4 = (((oq5) hq5Var11).d(intValue15) ? 4 : 2) | intValue16;
                } else {
                    i4 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i4 |= ((oq5) hq5Var11).f(w1iVar) ? 32 : 16;
                }
                oq5 oq5Var15 = (oq5) hq5Var11;
                if (oq5Var15.P(i4 & 1, (i4 & 147) != 146)) {
                    rab rabVar2 = w1iVar.a;
                    yci b6 = b.b(vci.a, intValue15);
                    int i15 = i4 & 112;
                    boolean f8 = oq5Var15.f(b2iVar) | (i15 == 32);
                    Object K18 = oq5Var15.K();
                    kjn kjnVar7 = gq5.a;
                    if (f8 || K18 == kjnVar7) {
                        final int i16 = 0;
                        K18 = new Function0() { // from class: d2i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        cvl cvlVar = w1iVar.b;
                                        cvlVar.getClass();
                                        c2i c2iVar = b2iVar.c;
                                        c2iVar.getClass();
                                        t tVar = c2iVar.a;
                                        tVar.startActivity(ixf.E(tVar, cvlVar, new h(Page.METATAG_PLAYLISTS)));
                                        break;
                                    default:
                                        cvl cvlVar2 = w1iVar.b;
                                        cvlVar2.getClass();
                                        c2i c2iVar2 = b2iVar.c;
                                        c2iVar2.getClass();
                                        lwg G = g0g.G(cvlVar2);
                                        y supportFragmentManager = c2iVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var15.k0(K18);
                    }
                    Function0 function08 = (Function0) K18;
                    boolean f9 = oq5Var15.f(b2iVar) | (i15 == 32);
                    Object K19 = oq5Var15.K();
                    if (f9 || K19 == kjnVar7) {
                        final int i17 = 1;
                        K19 = new Function0() { // from class: d2i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        cvl cvlVar = w1iVar.b;
                                        cvlVar.getClass();
                                        c2i c2iVar = b2iVar.c;
                                        c2iVar.getClass();
                                        t tVar = c2iVar.a;
                                        tVar.startActivity(ixf.E(tVar, cvlVar, new h(Page.METATAG_PLAYLISTS)));
                                        break;
                                    default:
                                        cvl cvlVar2 = w1iVar.b;
                                        cvlVar2.getClass();
                                        c2i c2iVar2 = b2iVar.c;
                                        c2iVar2.getClass();
                                        lwg G = g0g.G(cvlVar2);
                                        y supportFragmentManager = c2iVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var15.k0(K19);
                    }
                    swf.j(0, 8, oq5Var15, rabVar2, b6, function08, (Function0) K19, false);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 15:
                kgt kgtVar = (kgt) this.b;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                hq5 hq5Var12 = (hq5) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                oq5 oq5Var16 = (oq5) hq5Var12;
                if (oq5Var16.P(intValue17 & 1, (intValue17 & 129) != 128)) {
                    e9q.i(48, 4, oq5Var16, null, kgtVar.a, false);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 16:
                dgt dgtVar = (dgt) this.b;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                hq5 hq5Var13 = (hq5) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                oq5 oq5Var17 = (oq5) hq5Var13;
                if (oq5Var17.P(intValue18 & 1, (intValue18 & 129) != 128)) {
                    j66.y(dgtVar.a, oq5Var17, 0);
                } else {
                    oq5Var17.S();
                }
                return Unit.a;
            case 17:
                ofj ofjVar = (ofj) this.b;
                sai saiVar2 = (sai) obj2;
                hq5 hq5Var14 = (hq5) obj3;
                int d3 = eta.d((Integer) obj4, (ua5) obj, saiVar2);
                if ((d3 & 48) == 0) {
                    d3 |= ((oq5) hq5Var14).f(saiVar2) ? 32 : 16;
                }
                oq5 oq5Var18 = (oq5) hq5Var14;
                if (oq5Var18.P(d3 & 1, (d3 & 145) != 144)) {
                    boolean z = (d3 & 112) == 32;
                    Object K20 = oq5Var18.K();
                    if (z || K20 == gq5.a) {
                        m9j m9jVar = new m9j(0, saiVar2, sai.class, "hide", "hide()V", 0, 17);
                        oq5Var18.k0(m9jVar);
                        K20 = m9jVar;
                    }
                    Context requireContext = ofjVar.a.requireContext();
                    requireContext.getClass();
                    neg.c(new min(requireContext, (Function0) ((h9f) K20)), null, oq5Var18, 0);
                } else {
                    oq5Var18.S();
                }
                return Unit.a;
            case 18:
                xdh xdhVar = (xdh) this.b;
                hq5 hq5Var15 = (hq5) obj3;
                int d4 = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
                oq5 oq5Var19 = (oq5) hq5Var15;
                if (oq5Var19.P(d4 & 1, (d4 & 129) != 128)) {
                    jf0.l(48, oq5Var19, androidx.compose.ui.platform.a.a(vci.a, "modal_bottom_sheet_overview"), (String) xdhVar.c, (String) xdhVar.b);
                } else {
                    oq5Var19.S();
                }
                return Unit.a;
            case 19:
                n3m n3mVar = (n3m) this.b;
                x5n x5nVar = (x5n) n3mVar.c;
                hq5 hq5Var16 = (hq5) obj3;
                int d5 = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
                oq5 oq5Var20 = (oq5) hq5Var16;
                if (oq5Var20.P(d5 & 1, (d5 & 129) != 128)) {
                    Object K21 = oq5Var20.K();
                    kjn kjnVar8 = gq5.a;
                    if (K21 == kjnVar8) {
                        a6n a6nVar = (a6n) n3mVar.b;
                        K21 = new y5n(x5nVar, new n6n(new vtm(a6nVar), a6nVar.b.a()));
                        oq5Var20.k0(K21);
                    }
                    o2g.j((y5n) K21, true, oq5Var20, 48);
                    boolean h12 = oq5Var20.h(x5nVar);
                    Object K22 = oq5Var20.K();
                    if (h12 || K22 == kjnVar8) {
                        ebm ebmVar = new ebm(0, x5nVar, w5n.class, "onClose", "onClose()V", 0, 23);
                        oq5Var20.k0(ebmVar);
                        K22 = ebmVar;
                    }
                    wyf.c(null, null, null, null, (Function0) ((h9f) K22), oq5Var20, 0, 31);
                } else {
                    oq5Var20.S();
                }
                return Unit.a;
            case 20:
                y8p y8pVar = (y8p) this.b;
                hq5 hq5Var17 = (hq5) obj3;
                int d6 = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
                oq5 oq5Var21 = (oq5) hq5Var17;
                if (oq5Var21.P(d6 & 1, (d6 & 129) != 128)) {
                    ixf.h(y8pVar, oq5Var21, 0);
                } else {
                    oq5Var21.S();
                }
                return Unit.a;
            case 21:
                sdr sdrVar = (sdr) this.b;
                ((Integer) obj2).getClass();
                hq5 hq5Var18 = (hq5) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue19 & 129) == 128) {
                    oq5 oq5Var22 = (oq5) hq5Var18;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                yci d7 = d.d(vci.a, 1.0f);
                oq5 oq5Var23 = (oq5) hq5Var18;
                boolean f10 = oq5Var23.f(sdrVar);
                Object K23 = oq5Var23.K();
                if (f10 || K23 == gq5.a) {
                    K23 = new f6u(sdrVar, 8);
                    oq5Var23.k0(K23);
                }
                pcg.o(wyf.s(d7, (Function0) K23), oq5Var23, 0);
                return Unit.a;
            case 22:
                return a(obj, obj2, obj3, obj4);
            case 23:
                n7v n7vVar = (n7v) this.b;
                a9v a9vVar = (a9v) obj2;
                hq5 hq5Var19 = (hq5) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                ((cl0) obj).getClass();
                a9vVar.getClass();
                if (Intrinsics.d(a9vVar, y8v.a)) {
                    oq5 oq5Var24 = (oq5) hq5Var19;
                    oq5Var24.Z(801462019);
                    y7g.h(0, oq5Var24);
                    oq5Var24.p(false);
                } else {
                    if (!(a9vVar instanceof z8v)) {
                        throw vz1.i((oq5) hq5Var19, 801460141, false);
                    }
                    oq5 oq5Var25 = (oq5) hq5Var19;
                    oq5Var25.Z(801464653);
                    o8g.h((z8v) a9vVar, n7vVar, oq5Var25, (intValue20 >> 3) & 14);
                    oq5Var25.p(false);
                }
                return Unit.a;
            case 24:
                return d(obj, obj2, obj3, obj4);
            case 25:
                return g(obj, obj2, obj3, obj4);
            case 26:
                return h(obj, obj2, obj3, obj4);
            default:
                v0w v0wVar = (v0w) this.b;
                sai saiVar3 = (sai) obj2;
                hq5 hq5Var20 = (hq5) obj3;
                int d8 = eta.d((Integer) obj4, (ua5) obj, saiVar3);
                if ((d8 & 48) == 0) {
                    d8 |= ((oq5) hq5Var20).f(saiVar3) ? 32 : 16;
                }
                oq5 oq5Var26 = (oq5) hq5Var20;
                if (oq5Var26.P(d8 & 1, (d8 & 145) != 144)) {
                    v0wVar.A(ild.C(1619857064, new u0v(17, saiVar3, v0wVar), oq5Var26), oq5Var26, 6);
                } else {
                    oq5Var26.S();
                }
                return Unit.a;
        }
    }
}
