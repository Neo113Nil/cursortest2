package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class lc implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lc(tsf tsfVar, String str, List list, Function1 function1, Function1 function12) {
        this.a = 15;
        this.d = tsfVar;
        this.e = str;
        this.f = list;
        this.b = function1;
        this.c = function12;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        xam xamVar = (xam) this.b;
        u0s u0sVar = (u0s) this.c;
        jab jabVar = (jab) this.d;
        thj thjVar = (thj) this.e;
        rbm rbmVar = (rbm) this.f;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            ocg.d(xamVar, u0sVar, jabVar, thjVar, rbmVar, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        tsf tsfVar = (tsf) this.d;
        String str = (String) this.e;
        List list = (List) this.f;
        Function1 function1 = (Function1) this.b;
        Function1 function12 = (Function1) this.c;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            iic iicVar = new iic(160);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new fam(16);
                oq5Var.k0(K);
            }
            yci b = nfp.b(vci.a, false, (Function1) K);
            float f = 16;
            vm C = ghh.C(ghh.C(ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(f, f, f, 0.0f, 8)), zs4.g(oq5Var)), ogp.A(oq5Var));
            nx0 g = qx0.g(f);
            nx0 g2 = qx0.g(20);
            boolean f2 = oq5Var.f(str) | oq5Var.h(list) | oq5Var.f(function1) | oq5Var.f(function12);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new i50(str, list, function1, function12);
                oq5Var.k0(K2);
            }
            wdp.U(iicVar, b, tsfVar, C, g2, g, null, false, null, (Function1) K2, oq5Var, 1769472, 0, 912);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        pu0 pu0Var = (pu0) this.b;
        qec qecVar = (qec) this.c;
        kjm kjmVar = (kjm) this.d;
        Context context = (Context) this.e;
        y yVar = (y) this.f;
        bci bciVar = (bci) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        bciVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        jf0.a(new qzm[0], pu0Var, false, ild.C(-680533861, new pli(qecVar, kjmVar, context, yVar, bciVar, 11), hq5Var), hq5Var, 0, 4);
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        aas aasVar;
        boolean z;
        boolean z2;
        long j3;
        String str = (String) this.b;
        d85 d85Var = (d85) this.c;
        r2n r2nVar = (r2n) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((dh3) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            vci vciVar = vci.a;
            yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 12, 0.0f, 2);
            boolean f = oq5Var.f(str);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new q1h(str, 25);
                oq5Var.k0(K);
            }
            yci b = nfp.b(o, false, (Function1) K);
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ges j4 = nu0.j();
            if (d85Var == null) {
                oq5Var.Z(1592508600);
                j = ((dq0) oq5Var.j(eq0.a)).b.a;
                oq5Var.p(false);
            } else {
                oq5Var.Z(1592507329);
                oq5Var.p(false);
                j = d85Var.a;
            }
            int[] iArr = o2n.a;
            int i2 = iArr[r2nVar.ordinal()];
            aas aasVar2 = aas.b;
            aas aasVar3 = aas.c;
            if (i2 == 2) {
                j2 = j;
                aasVar = aasVar3;
            } else {
                j2 = j;
                aasVar = aasVar2;
            }
            xcs.b(str2, androidx.compose.ui.platform.a.a(vciVar, "button_title"), j2, 0L, null, 0L, aasVar, new o9s(3), 0L, 0, false, 0, 0, null, j4, oq5Var, 48, 0, 64760);
            oq5 oq5Var2 = oq5Var;
            if (str3 == null || str3.length() == 0) {
                z = false;
                oq5Var2.Z(2119888241);
            } else {
                oq5Var2.Z(2123521224);
                u1g.l(oq5Var2, d.e(vciVar, 2));
                ges h = nu0.h();
                if (d85Var == null) {
                    oq5Var2.Z(1592529466);
                    j3 = ((dq0) oq5Var2.j(eq0.a)).b.b;
                    z2 = false;
                    oq5Var2.p(false);
                } else {
                    z2 = false;
                    oq5Var2.Z(1592528195);
                    oq5Var2.p(false);
                    j3 = d85Var.a;
                }
                z = z2;
                xcs.b(str3, androidx.compose.ui.platform.a.a(vciVar, "button_subtitle"), j3, 0L, null, 0L, iArr[r2nVar.ordinal()] == 2 ? aasVar3 : aasVar2, new o9s(3), 0L, 0, false, 0, 0, null, h, oq5Var2, 48, 0, 64760);
                oq5Var2 = oq5Var2;
            }
            oq5Var2.p(z);
            oq5Var2.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        kb5 kb5Var;
        kb5 kb5Var2;
        wn5 wn5Var = (wn5) this.b;
        String str = (String) this.c;
        d85 d85Var = (d85) this.d;
        String str2 = (String) this.e;
        wn5 wn5Var2 = (wn5) this.f;
        c cVar = (c) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        cVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        float c = cVar.c();
        wn5Var.invoke(hq5Var, 0);
        ta5 a = sa5.a(qx0.c, b2c.o, hq5Var, 48);
        oq5 oq5Var2 = (oq5) hq5Var;
        int i = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        yci H = vnj.H(hq5Var, vci.a);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        kb5 kb5Var3 = wp5.f;
        g0g.U(hq5Var, a, kb5Var3);
        kb5 kb5Var4 = wp5.e;
        g0g.U(hq5Var, l, kb5Var4);
        kb5 kb5Var5 = wp5.g;
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var2, i, kb5Var5);
        }
        kb5 kb5Var6 = wp5.d;
        g0g.U(hq5Var, H, kb5Var6);
        pvo.b(str, d85Var, c, hq5Var, 0);
        if (str2 == null) {
            oq5Var2.Z(-824658244);
            oq5Var2.p(false);
            kb5Var2 = kb5Var5;
            kb5Var = kb5Var3;
        } else {
            oq5Var2.Z(-824658243);
            kb5Var = kb5Var3;
            kb5Var2 = kb5Var5;
            ocg.e(str2, itq.d, null, null, hq5Var, 48, 12);
            oq5Var2.p(false);
        }
        if (1.0f <= 0.0d) {
            qme.a("invalid weight; must be greater than zero");
        }
        yci d = d.d(new LayoutWeightElement(true, 1.0f), 1.0f);
        kfh d2 = ug3.d(b2c.b, false);
        int i2 = oq5Var2.P;
        androidx.compose.runtime.internal.a l2 = oq5Var2.l();
        yci H2 = vnj.H(hq5Var, d);
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        g0g.U(hq5Var, d2, kb5Var);
        g0g.U(hq5Var, l2, kb5Var4);
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
            ouj.x(i2, oq5Var2, i2, kb5Var2);
        }
        g0g.U(hq5Var, H2, kb5Var6);
        wn5Var2.invoke(hq5Var, 0);
        oq5Var2.p(true);
        oq5Var2.p(true);
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        oq5 oq5Var;
        int i;
        kjn kjnVar;
        oq5 oq5Var2;
        qqq qqqVar = (qqq) this.b;
        tmb tmbVar = (tmb) this.c;
        nnq nnqVar = (nnq) this.d;
        qnq qnqVar = (qnq) this.e;
        fvf fvfVar = (fvf) this.f;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var3 = (oq5) hq5Var;
        if (oq5Var3.P(intValue & 1, (intValue & 19) != 18)) {
            cpq cpqVar = (cpq) gld.M(qqqVar.d, oq5Var3).getValue();
            ogp ogpVar = ogp.g;
            boolean z = cpqVar instanceof zoq;
            zoq zoqVar = z ? (zoq) cpqVar : null;
            ogpVar.e((zoqVar != null ? zoqVar.a : null) == zpq.a, cpqVar instanceof apq, null, oq5Var3, 4096, 4);
            boolean d = Intrinsics.d(cpqVar, apq.a);
            vci vciVar = vci.a;
            if (d) {
                oq5Var3.Z(-466970642);
                c3x.m(0, 2, 0L, oq5Var3, d.x(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(o0kVar, zs4.g(oq5Var3))), 1.0f), b2c.f, 2));
                oq5Var3.p(false);
            } else if (z) {
                oq5Var3.Z(-466577252);
                int ordinal = ((zoq) cpqVar).a.ordinal();
                kjn kjnVar2 = gq5.a;
                if (ordinal == 0) {
                    oq5Var3.Z(-466520987);
                    boolean h = oq5Var3.h(qqqVar);
                    Object K = oq5Var3.K();
                    if (h || K == kjnVar2) {
                        K = new kzp(12, qqqVar);
                        oq5Var3.k0(K);
                    }
                    oq5Var = oq5Var3;
                    rvf.j((Function1) K, tmbVar, d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(o0kVar, zs4.g(oq5Var3))), 1.0f), bfg.C(oq5Var3), false, 14), new iz2(0.0f, -0.1f), 2), 0, false, null, oq5Var, 64, 56);
                    oq5Var.p(false);
                } else {
                    if (ordinal != 1) {
                        throw vz1.i(oq5Var3, 1231875110, false);
                    }
                    oq5Var3.Z(-465896461);
                    boolean h2 = oq5Var3.h(qqqVar);
                    Object K2 = oq5Var3.K();
                    if (h2 || K2 == kjnVar2) {
                        i = 14;
                        kjnVar = kjnVar2;
                        oq5Var2 = oq5Var3;
                        qbp qbpVar = new qbp(0, qqqVar, qqq.class, "onBackToMixesClick", "onBackToMixesClick()V", 0, 26);
                        oq5Var2.k0(qbpVar);
                        K2 = qbpVar;
                    } else {
                        i = 14;
                        oq5Var2 = oq5Var3;
                        kjnVar = kjnVar2;
                    }
                    Function0 function0 = (Function0) ((h9f) K2);
                    boolean h3 = oq5Var2.h(qqqVar);
                    Object K3 = oq5Var2.K();
                    if (h3 || K3 == kjnVar) {
                        qbp qbpVar2 = new qbp(0, qqqVar, qqq.class, "onBackToHomeClick", "onBackToHomeClick()V", 0, 27);
                        oq5Var2.k0(qbpVar2);
                        K3 = qbpVar2;
                    }
                    Function0 function02 = (Function0) ((h9f) K3);
                    boolean h4 = oq5Var2.h(qqqVar);
                    Object K4 = oq5Var2.K();
                    if (h4 || K4 == kjnVar) {
                        qbp qbpVar3 = new qbp(0, qqqVar, qqq.class, "onBackToCollectionClick", "onBackToCollectionClick()V", 0, 28);
                        oq5Var2.k0(qbpVar3);
                        K4 = qbpVar3;
                    }
                    bkp.N(function0, function02, (Function0) ((h9f) K4), d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(o0kVar, zs4.g(oq5Var2))), 1.0f), bfg.C(oq5Var2), false, i), new iz2(0.0f, -0.1f), 2), oq5Var2, 0);
                    oq5Var2.p(false);
                    oq5Var = oq5Var2;
                }
                oq5Var.p(false);
            } else {
                if (!(cpqVar instanceof bpq)) {
                    throw vz1.i(oq5Var3, 1231862557, false);
                }
                oq5Var3.Z(-465150415);
                bpq bpqVar = (bpq) cpqVar;
                y7g.e(qqqVar, etn.d0(bpqVar.a, nnqVar, qnqVar, oq5Var3), fvfVar, ghh.C(ghh.C(o0kVar, zs4.g(oq5Var3)), ogp.A(oq5Var3)), androidx.compose.foundation.layout.a.c(0.0f, bpqVar.b ? 0 : 16, 0.0f, 0.0f, 13), oq5Var3, 0);
                oq5Var3.p(false);
            }
        } else {
            oq5Var3.S();
        }
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        kjn kjnVar;
        int i;
        float f;
        int i2;
        float f2;
        a6t a6tVar = (a6t) this.b;
        sdr sdrVar = (sdr) this.c;
        h5t h5tVar = (h5t) this.d;
        ynn ynnVar = (ynn) this.e;
        fvf fvfVar = (fvf) this.f;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ua5) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            List list = a6tVar.b;
            l5t l5tVar = a6tVar.d;
            int intValue2 = ((Number) sdrVar.getValue()).intValue();
            vci vciVar = vci.a;
            k5t.b(list, l5tVar, h5tVar, ynnVar, intValue2, fvfVar, androidx.compose.ui.platform.a.a(vciVar, "trailer_smart_previews"), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB);
            u1g.l(oq5Var, d.m(vciVar, 32));
            String M = rvf.M(R.string.trailer_dialog_listen_all, oq5Var);
            boolean h = oq5Var.h(h5tVar);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h || K == kjnVar2) {
                kjnVar = kjnVar2;
                zhs zhsVar = new zhs(0, h5tVar, h5t.class, "onListenFullClick", "onListenFullClick()V", 0, 16);
                oq5Var.k0(zhsVar);
                K = zhsVar;
            } else {
                kjnVar = kjnVar2;
            }
            float f3 = 16;
            cb0.h(384, oq5Var, androidx.compose.ui.platform.a.a(d.d(androidx.compose.foundation.layout.a.o(vciVar, f3, 0.0f, 2), 1.0f), "trailer_listen_full_button"), M, (Function0) ((h9f) K));
            if (a6tVar.e) {
                oq5Var.Z(-600974900);
                l5t l5tVar2 = a6tVar.d;
                String str = null;
                if (j5t.a[l5tVar2.ordinal()] == 1) {
                    oq5Var.Z(-11815530);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(1246545558);
                    int ordinal = l5tVar2.ordinal();
                    if (ordinal == 0) {
                        i = R.string.trailer_dialog_move_to_album;
                    } else if (ordinal == 1) {
                        i = R.string.trailer_dialog_move_to_single;
                    } else if (ordinal == 2) {
                        i = R.string.trailer_dialog_move_to_playlist;
                    } else {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                b6e.s();
                                return null;
                            }
                            e7o.f(new x6s(20));
                            return null;
                        }
                        i = R.string.trailer_dialog_move_to_artist;
                    }
                    str = rvf.M(i, oq5Var);
                    oq5Var.p(false);
                }
                String str2 = str;
                if (str2 == null) {
                    oq5Var.Z(-1450352715);
                } else {
                    oq5Var.Z(-1450352714);
                    u1g.l(oq5Var, d.e(vciVar, 8));
                    boolean h2 = oq5Var.h(h5tVar);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        f = 0.0f;
                        i2 = 2;
                        f2 = 1.0f;
                        zhs zhsVar2 = new zhs(0, h5tVar, h5t.class, "onOpenEntityClicked", "onOpenEntityClicked()V", 0, 17);
                        oq5Var.k0(zhsVar2);
                        K2 = zhsVar2;
                    } else {
                        f = 0.0f;
                        i2 = 2;
                        f2 = 1.0f;
                    }
                    hdg.t(str2, (Function0) ((h9f) K2), androidx.compose.ui.platform.a.a(d.d(androidx.compose.foundation.layout.a.o(vciVar, f3, f, i2), f2), "trailer_entity_navigation_button"), null, oq5Var, 384, 8);
                }
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1453324436);
            }
            oq5Var.p(false);
            u1g.l(oq5Var, d.m(vciVar, 24));
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        b4v b4vVar = (b4v) this.b;
        s2v s2vVar = (s2v) this.c;
        sdr sdrVar = (sdr) this.d;
        sdr sdrVar2 = (sdr) this.e;
        sdr sdrVar3 = (sdr) this.f;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((dh3) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        aqi o0 = szf.o0(b4vVar, hq5Var);
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean h = oq5Var2.h(s2vVar);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (h || K == kjnVar) {
            j6u j6uVar = new j6u(0, s2vVar, s2v.class, "onPlayClick", "onPlayClick()V", 0, 29);
            oq5Var2.k0(j6uVar);
            K = j6uVar;
        }
        h9f h9fVar = (h9f) K;
        boolean h2 = oq5Var2.h(s2vVar);
        Object K2 = oq5Var2.K();
        if (h2 || K2 == kjnVar) {
            vtu vtuVar = new vtu(0, s2vVar, s2v.class, "openExpandedPlayer", "openExpandedPlayer()V", 0, 0);
            oq5Var2.k0(vtuVar);
            K2 = vtuVar;
        }
        h9f h9fVar2 = (h9f) K2;
        boolean h3 = oq5Var2.h(s2vVar);
        Object K3 = oq5Var2.K();
        if (h3 || K3 == kjnVar) {
            lgq lgqVar = new lgq(1, s2vVar, s2v.class, "onSeek", "onSeek(F)V", 0, 25);
            oq5Var2.k0(lgqVar);
            K3 = lgqVar;
        }
        h9f h9fVar3 = (h9f) K3;
        boolean h4 = oq5Var2.h(s2vVar);
        Object K4 = oq5Var2.K();
        if (h4 || K4 == kjnVar) {
            K4 = new qtu(s2vVar, 0);
            oq5Var2.k0(K4);
        }
        Function1 function1 = (Function1) K4;
        Function0 function0 = (Function0) h9fVar;
        Function0 function02 = (Function0) h9fVar2;
        Function1 function12 = (Function1) h9fVar3;
        boolean h5 = oq5Var2.h(s2vVar);
        Object K5 = oq5Var2.K();
        if (h5 || K5 == kjnVar) {
            K5 = new qtu(s2vVar, 1);
            oq5Var2.k0(K5);
        }
        r2v.d(o0, sdrVar, sdrVar2, sdrVar3, function1, function0, function02, function12, null, (Function1) K5, oq5Var2, 3456);
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        s2v s2vVar = (s2v) this.b;
        sdr sdrVar = (sdr) this.c;
        sdr sdrVar2 = (sdr) this.d;
        ab0 ab0Var = (ab0) this.e;
        onu onuVar = (onu) this.f;
        sdr sdrVar3 = (sdr) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        sdrVar3.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(sdrVar3) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        g0g.A(s2vVar, sdrVar3, sdrVar, sdrVar2, ab0Var, onuVar, hq5Var, ((intValue << 3) & 112) | 384);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object obj4;
        eml emlVar;
        vci vciVar;
        Object k5hVar;
        int i2;
        ?? r6;
        na0 na0Var;
        jyr jyrVar;
        float u;
        float u2;
        String str;
        switch (this.a) {
            case 0:
                final Function1 function1 = (Function1) this.b;
                final Function1 function12 = (Function1) this.c;
                final sh4 sh4Var = (sh4) this.d;
                final iev ievVar = (iev) this.e;
                final aqi aqiVar = (aqi) this.f;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                long j = cVar.b;
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    final int i3 = -1;
                    if (ga6.g(j)) {
                        i = -1;
                    } else {
                        i = -1;
                        i3 = -2;
                    }
                    final int i4 = ga6.f(j) ? i : -2;
                    boolean f = oq5Var.f(function1) | oq5Var.f(function12) | oq5Var.d(i3) | oq5Var.d(i4) | oq5Var.h(sh4Var) | oq5Var.h(ievVar);
                    Object K = oq5Var.K();
                    if (f || K == gq5.a) {
                        K = new Function1() { // from class: nc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                WebView webView;
                                Context context = (Context) obj5;
                                context.getClass();
                                Function1 function13 = Function1.this;
                                if (function13 == null || (webView = (WebView) function13.invoke(context)) == null) {
                                    webView = new WebView(context);
                                }
                                function12.invoke(webView);
                                int i5 = i3;
                                int i6 = i4;
                                webView.setLayoutParams(new ViewGroup.LayoutParams(i5, i6));
                                webView.setWebChromeClient(sh4Var);
                                webView.setWebViewClient(ievVar);
                                aqiVar.setValue(webView);
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i5, i6));
                                frameLayout.addView(webView);
                                return frameLayout;
                            }
                        };
                        oq5Var.k0(K);
                    }
                    androidx.compose.ui.viewinterop.a.a(0, 6, oq5Var, null, (Function1) K, null);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                dy7 dy7Var = (dy7) this.b;
                oq oqVar = (oq) this.c;
                kxi kxiVar = (kxi) this.d;
                pu0 pu0Var = (pu0) this.e;
                sai saiVar = (sai) this.f;
                bci bciVar = (bci) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((oq5) hq5Var2).f(bciVar) : ((oq5) hq5Var2).h(bciVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                dy7Var.getClass();
                oqVar.getClass();
                kxiVar.getClass();
                gt gtVar = (gt) dy7Var.a.a.getValue();
                gtVar.getClass();
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h = oq5Var3.h(oqVar) | oq5Var3.h(kxiVar) | oq5Var3.h(gtVar);
                Object K2 = oq5Var3.K();
                kjn kjnVar = gq5.a;
                if (h || K2 == kjnVar) {
                    K2 = new g3(3, oqVar, kxiVar, gtVar);
                    oq5Var3.k0(K2);
                }
                Function1 function13 = (Function1) K2;
                oq5Var3.a0(419377738);
                kfu a = rpg.a(oq5Var3);
                if (a == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(jt.class), a, null, k5r.g(jt.class, new p97(1), function13), a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var3);
                oq5Var3.p(false);
                jt jtVar = (jt) R;
                Object K3 = oq5Var3.K();
                if (K3 == kjnVar) {
                    K3 = new ht(jtVar);
                    oq5Var3.k0(K3);
                }
                ht htVar = (ht) K3;
                jf0.a(new qzm[0], pu0Var, false, ild.C(1536750216, new wl(bciVar, (gy7) gld.M(htVar.b, hq5Var2).getValue(), htVar, saiVar, 3), hq5Var2), hq5Var2, 0, 4);
                return Unit.a;
            case 2:
                m93 m93Var = (m93) this.b;
                u0s u0sVar = (u0s) this.c;
                jab jabVar = (jab) this.d;
                thj thjVar = (thj) this.e;
                va3 va3Var = (va3) this.f;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    wct.c(m93Var.a, u0sVar, jabVar, thjVar, va3Var, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 3:
                iil iilVar = (iil) this.b;
                st4 st4Var = (st4) this.c;
                kml kmlVar = (kml) this.d;
                sdr sdrVar = (sdr) this.e;
                p9 p9Var = (p9) this.f;
                wxk wxkVar = (wxk) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                wxkVar.getClass();
                kml kmlVar2 = iilVar.a;
                Iterator it = xz0.w(new cml[]{kmlVar2.a, kmlVar2.b, kmlVar2.c}).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj4 = it.next();
                        if (Intrinsics.d(((cml) obj4).a, wxkVar)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                cml cmlVar = (cml) obj4;
                if (cmlVar == null || (emlVar = cmlVar.b) == null) {
                    emlVar = eml.d;
                }
                qt4.c(st4Var, wxkVar, emlVar, sdrVar, wxkVar.equals(kmlVar2.b.a), p9Var, qt4.i(st4Var, kmlVar.a != null, kmlVar.c != null, hq5Var4), null, null, hq5Var4, (intValue4 << 3) & 112, 384);
                return Unit.a;
            case 4:
                String str2 = (String) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                aqi aqiVar2 = (aqi) this.f;
                c cVar2 = (c) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).f(cVar2) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var5;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var6 = (oq5) hq5Var5;
                boolean f2 = oq5Var6.f(str2);
                Object K4 = oq5Var6.K();
                if (f2 || K4 == gq5.a) {
                    K4 = new wq(str2, 12);
                    oq5Var6.k0(K4);
                }
                xv7.i(new mn0(6, str3, (ArrayList) null), androidx.compose.ui.platform.a.a(vci.a, "concert_item_long_place"), ((dq0) oq5Var6.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 0, false, (!((Boolean) aqiVar2.getValue()).booleanValue() && str4 == null && str5 == null) ? 2 : 1, 0, null, null, nu0.j(), vut.s(cVar2, (Function1) K4), null, oq5Var6, 48, 134217728, 647160);
                return Unit.a;
            case 5:
                String str6 = (String) this.b;
                dup dupVar = (dup) this.c;
                uoi uoiVar = (uoi) this.d;
                pyc pycVar = (pyc) this.e;
                qo6 qo6Var = (qo6) this.f;
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(dh3Var) ? 4 : 2;
                }
                int i5 = intValue6;
                if ((i5 & 19) == 18) {
                    oq5 oq5Var7 = (oq5) hq5Var6;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                j66.q(str6, ild.C(1652739779, new qp(qo6Var, 3), hq5Var6), dupVar, null, uoiVar, hq5Var6, 24624);
                oq5 oq5Var8 = (oq5) hq5Var6;
                if (pycVar != null) {
                    oq5Var8.Z(-229614948);
                    pycVar.invoke(dh3Var, oq5Var8, Integer.valueOf(i5 & 14));
                } else {
                    oq5Var8.Z(-233054584);
                }
                oq5Var8.p(false);
                return Unit.a;
            case 6:
                ml4 ml4Var = (ml4) this.b;
                wn5 wn5Var = (wn5) this.c;
                o3k o3kVar = (o3k) this.d;
                wn5 wn5Var2 = (wn5) this.e;
                List list = (List) this.f;
                c cVar3 = (c) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(cVar3) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var9 = (oq5) hq5Var7;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var10 = (oq5) hq5Var7;
                jx7 jx7Var = (jx7) oq5Var10.j(es5.h);
                etn.l(jzj.a.a(null), ild.C(-760945229, new tu(ml4Var, wn5Var, eeh.b(jx7Var.n0(cVar3.c()) - jx7Var.n0(xvq.c + xvq.b)), o3kVar, wn5Var2, list), oq5Var10), oq5Var10, 56);
                return Unit.a;
            case 7:
                vm vmVar = (vm) this.b;
                Function0 function0 = (Function0) this.c;
                rli rliVar = (rli) this.d;
                vm vmVar2 = (vm) this.e;
                fvf fvfVar = (fvf) this.f;
                cmi cmiVar = (cmi) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                cmiVar.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var8).f(cmiVar) ? 4 : 2;
                }
                oq5 oq5Var11 = (oq5) hq5Var8;
                if (oq5Var11.P(intValue8 & 1, (intValue8 & 19) != 18)) {
                    boolean equals = cmiVar.equals(ami.a);
                    vci vciVar2 = vci.a;
                    if (equals) {
                        oq5Var11.Z(-694777949);
                        p6g.c(0, 0, oq5Var11, androidx.compose.foundation.layout.a.l(vciVar2, ghh.C(vmVar, (o0k) function0.invoke())));
                        oq5Var11.p(false);
                    } else if (cmiVar instanceof bmi) {
                        oq5Var11.Z(-694488285);
                        orl.b(ild.C(378588573, new pli(rliVar, cmiVar, fvfVar, vmVar2, function0), oq5Var11), oq5Var11, 6);
                        oq5Var11.p(false);
                    } else {
                        boolean equals2 = cmiVar.equals(zli.a);
                        Object obj5 = gq5.a;
                        Continuation continuation = null;
                        if (equals2) {
                            oq5Var11.Z(-693716509);
                            Unit unit = Unit.a;
                            boolean h2 = oq5Var11.h(rliVar);
                            Object K5 = oq5Var11.K();
                            if (h2 || K5 == obj5) {
                                K5 = new qli(rliVar, continuation, 1);
                                oq5Var11.k0(K5);
                            }
                            gld.w(oq5Var11, unit, (Function2) K5);
                            rliVar.getClass();
                            oq5Var11.Z(177019975);
                            nmj nmjVar = rliVar.e;
                            Activity activity = rliVar.a;
                            tmb tmbVar = rliVar.d;
                            boolean h3 = oq5Var11.h(rliVar);
                            Object K6 = oq5Var11.K();
                            if (h3 || K6 == obj5) {
                                K6 = new ti1(7, rliVar);
                                oq5Var11.k0(K6);
                            }
                            jmj b = nmjVar.b((dmj) K6, activity, tmbVar, 1, oq5Var11, 36352);
                            oq5Var11.p(false);
                            ivf.g(b, d.x(bfg.Q(androidx.compose.foundation.layout.a.l(d.c(vciVar2, 1.0f), ghh.C((o0k) function0.invoke(), vmVar2)), bfg.C(oq5Var11), false, 14), b2c.f, 2), false, null, oq5Var11, 0, 12);
                            oq5Var11.p(false);
                        } else {
                            if (!cmiVar.equals(yli.a)) {
                                throw vz1.i(oq5Var11, -1130791012, false);
                            }
                            oq5Var11.Z(-693099888);
                            Unit unit2 = Unit.a;
                            boolean h4 = oq5Var11.h(rliVar);
                            Object K7 = oq5Var11.K();
                            if (h4 || K7 == obj5) {
                                K7 = new qli(rliVar, continuation, 2);
                                oq5Var11.k0(K7);
                            }
                            gld.w(oq5Var11, unit2, (Function2) K7);
                            boolean h5 = oq5Var11.h(rliVar);
                            Object K8 = oq5Var11.K();
                            if (h5 || K8 == obj5) {
                                vciVar = vciVar2;
                                i2 = 2;
                                r6 = 0;
                                k5hVar = new k5h(0, rliVar, rli.class, "onMainTabClick", "onMainTabClick()V", 0, 16);
                                oq5Var11.k0(k5hVar);
                            } else {
                                vciVar = vciVar2;
                                r6 = 0;
                                k5hVar = K8;
                                i2 = 2;
                            }
                            v5g.b((Function0) ((h9f) k5hVar), d.c(androidx.compose.foundation.layout.a.l(androidx.compose.ui.platform.a.a(vciVar, "music_history_empty_screen"), ghh.C(ghh.C(vmVar2, (o0k) function0.invoke()), androidx.compose.foundation.layout.a.a(16, 0.0f, i2))), 1.0f), oq5Var11, r6);
                            oq5Var11.p(r6);
                        }
                    }
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 8:
                k4k k4kVar = (k4k) this.b;
                tmb tmbVar2 = (tmb) this.c;
                Function0 function02 = (Function0) this.d;
                Function0 function03 = (Function0) this.e;
                wn5 wn5Var3 = (wn5) this.f;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var9).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var12 = (oq5) hq5Var9;
                if (oq5Var12.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    ezf.f(o0kVar, k4kVar, tmbVar2, function02, function03, wn5Var3, oq5Var12, (intValue9 & 14) | RemoteCameraConfig.Mic.BUFFER_SIZE);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 9:
                na0 na0Var2 = (na0) this.b;
                jx7 jx7Var2 = (jx7) this.c;
                adl adlVar = (adl) this.d;
                jyr jyrVar2 = adlVar.t;
                jyr jyrVar3 = adlVar.l;
                jyr jyrVar4 = adlVar.m;
                jyr jyrVar5 = adlVar.k;
                jyr jyrVar6 = adlVar.u;
                sdr sdrVar2 = (sdr) this.e;
                h4b h4bVar = (h4b) this.f;
                c cVar4 = (c) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                cVar4.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((oq5) hq5Var10).f(cVar4) ? 4 : 2;
                }
                oq5 oq5Var13 = (oq5) hq5Var10;
                if (oq5Var13.P(intValue10 & 1, (intValue10 & 19) != 18)) {
                    if (na0Var2 == null) {
                        oq5Var13.Z(1591978083);
                        float b2 = zs4.b(jx7Var2);
                        Parcelable parcelable = adlVar.requireArguments().getParcelable("playerScreen:args");
                        if (parcelable == null) {
                            xq0.x("Required value was null.");
                            return null;
                        }
                        na0Var = yd5.D(b2, ((v9l) parcelable).a, ((Boolean) sdrVar2.getValue()).booleanValue(), ga6.h(cVar4.b), false, oq5Var13, 16);
                        oq5Var13.p(false);
                    } else {
                        oq5Var13.Z(1591976812);
                        oq5Var13.p(false);
                        na0Var = na0Var2;
                    }
                    ja0 ja0Var = na0Var.e;
                    ml7 c = ja0Var.c();
                    boolean h6 = oq5Var13.h(adlVar) | oq5Var13.f(ja0Var);
                    Object K9 = oq5Var13.K();
                    Object obj6 = gq5.a;
                    if (h6 || K9 == obj6) {
                        jyrVar = jyrVar2;
                        K9 = new b5l(adlVar, ja0Var, (Continuation) null, 5);
                        oq5Var13.k0(K9);
                    } else {
                        jyrVar = jyrVar2;
                    }
                    gld.y(ja0Var, c, (Function2) K9, oq5Var13);
                    boolean h7 = oq5Var13.h(adlVar) | oq5Var13.f(na0Var);
                    Object K10 = oq5Var13.K();
                    if (h7 || K10 == obj6) {
                        K10 = new b5l(adlVar, na0Var, (Continuation) null, 6);
                        oq5Var13.k0(K10);
                    }
                    gld.w(oq5Var13, na0Var, (Function2) K10);
                    if (((Boolean) oq5Var13.j((agr) wpg.d.c)).booleanValue()) {
                        oq5Var13.Z(2107742472);
                        float d = cVar4.d();
                        float c2 = cVar4.c();
                        if (((Boolean) oq5Var13.j((agr) spg.d.c)).booleanValue()) {
                            oq5Var13.Z(2108097608);
                            u2 = ocg.v(oq5Var13);
                            oq5Var13.p(false);
                        } else {
                            oq5Var13.Z(2108356303);
                            u2 = ocg.u(oq5Var13);
                            oq5Var13.p(false);
                        }
                        hvb c3 = ivb.c(d, c2, u2, oq5Var13);
                        iml imlVar = (iml) jyrVar5.getValue();
                        st4 st4Var2 = (st4) jyrVar4.getValue();
                        jub jubVar = (jub) jyrVar3.getValue();
                        Object obj7 = (thi) jyrVar.getValue();
                        boolean h8 = oq5Var13.h(obj7);
                        Object K11 = oq5Var13.K();
                        if (h8 || K11 == obj6) {
                            K11 = new msj(0, obj7, thi.class, "openVideoPlayer", "openVideoPlayer()V", 0, 8);
                            oq5Var13.k0(K11);
                        }
                        h9f h9fVar = (h9f) K11;
                        boolean f3 = oq5Var13.f(((fal) jyrVar6.getValue()).a);
                        Object K12 = oq5Var13.K();
                        if (f3 || K12 == obj6) {
                            K12 = new drh(((fal) jyrVar6.getValue()).a);
                            oq5Var13.k0(K12);
                        }
                        c9g.h(na0Var, c3, imlVar, st4Var2, jubVar, h4bVar, (drh) K12, (Function0) h9fVar, adlVar.n, sdrVar2, null, oq5Var13, 0);
                        oq5Var13.p(false);
                    } else {
                        oq5Var13.Z(2109620390);
                        float d2 = cVar4.d();
                        float c4 = cVar4.c();
                        if (((Boolean) oq5Var13.j((agr) spg.d.c)).booleanValue()) {
                            oq5Var13.Z(2109981292);
                            u = ocg.v(oq5Var13);
                            oq5Var13.p(false);
                        } else {
                            oq5Var13.Z(2110113135);
                            u = ocg.u(oq5Var13);
                            oq5Var13.p(false);
                        }
                        hvb d3 = ivb.d(d2, c4, u, oq5Var13);
                        iml imlVar2 = (iml) jyrVar5.getValue();
                        st4 st4Var3 = (st4) jyrVar4.getValue();
                        jub jubVar2 = (jub) jyrVar3.getValue();
                        Object obj8 = (thi) jyrVar.getValue();
                        boolean h9 = oq5Var13.h(obj8);
                        Object K13 = oq5Var13.K();
                        if (h9 || K13 == obj6) {
                            K13 = new msj(0, obj8, thi.class, "openVideoPlayer", "openVideoPlayer()V", 0, 9);
                            oq5Var13.k0(K13);
                        }
                        h9f h9fVar2 = (h9f) K13;
                        boolean f4 = oq5Var13.f(((fal) jyrVar6.getValue()).a);
                        Object K14 = oq5Var13.K();
                        if (f4 || K14 == obj6) {
                            K14 = new drh(((fal) jyrVar6.getValue()).a);
                            oq5Var13.k0(K14);
                        }
                        lsq.e(na0Var, d3, imlVar2, st4Var3, jubVar2, h4bVar, (drh) K14, (Function0) h9fVar2, adlVar.n, sdrVar2, null, oq5Var13, 0);
                        oq5Var13.p(false);
                    }
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 10:
                dy7 dy7Var2 = (dy7) this.b;
                cvl cvlVar = (cvl) this.c;
                kxi kxiVar2 = (kxi) this.d;
                pu0 pu0Var2 = (pu0) this.e;
                sai saiVar2 = (sai) this.f;
                bci bciVar2 = (bci) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bciVar2.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= (intValue11 & 8) == 0 ? ((oq5) hq5Var11).f(bciVar2) : ((oq5) hq5Var11).h(bciVar2) ? 4 : 2;
                }
                if ((intValue11 & 19) == 18) {
                    oq5 oq5Var14 = (oq5) hq5Var11;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var15 = (oq5) hq5Var11;
                Context context = (Context) oq5Var15.j(AndroidCompositionLocals_androidKt.b);
                dy7Var2.getClass();
                context.getClass();
                cvlVar.getClass();
                ivl ivlVar = (ivl) dy7Var2.a.c.getValue();
                ivlVar.getClass();
                boolean h10 = oq5Var15.h(context) | oq5Var15.h(cvlVar) | oq5Var15.h(kxiVar2) | oq5Var15.h(ivlVar);
                Object K15 = oq5Var15.K();
                kjn kjnVar2 = gq5.a;
                if (h10 || K15 == kjnVar2) {
                    K15 = new i50(context, cvlVar, kxiVar2, ivlVar, 13);
                    oq5Var15.k0(K15);
                }
                Function1 function14 = (Function1) K15;
                oq5Var15.a0(419377738);
                kfu a2 = rpg.a(oq5Var15);
                if (a2 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R2 = ngg.R(ern.a(kvl.class), a2, null, k5r.g(kvl.class, new p97(1), function14), a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var15);
                oq5Var15.p(false);
                kvl kvlVar = (kvl) R2;
                Object K16 = oq5Var15.K();
                if (K16 == kjnVar2) {
                    K16 = new jvl(kvlVar);
                    oq5Var15.k0(K16);
                }
                jvl jvlVar = (jvl) K16;
                jf0.a(new qzm[0], pu0Var2, false, ild.C(-1477517898, new gvl(bciVar2, (gy7) gld.M(jvlVar.b, oq5Var15).getValue(), jvlVar, saiVar2, 0), oq5Var15), oq5Var15, 0, 4);
                return Unit.a;
            case 11:
                dvl dvlVar = (dvl) this.b;
                nab nabVar = (nab) this.c;
                thj thjVar2 = (thj) this.d;
                qzl qzlVar = (qzl) this.e;
                tvd tvdVar = (tvd) this.f;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var16 = (oq5) hq5Var12;
                if (oq5Var16.P(intValue12 & 1, (intValue12 & 17) != 16)) {
                    y1g.j(dvlVar, nabVar, thjVar2, qzlVar, tvdVar, oq5Var16, 0);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 12:
                a3m a3mVar = (a3m) this.b;
                vm vmVar3 = (vm) this.c;
                fvf fvfVar2 = (fvf) this.d;
                lf5 lf5Var = (lf5) this.e;
                aqi aqiVar3 = (aqi) this.f;
                ((Boolean) obj).getClass();
                hq5 hq5Var13 = (hq5) obj2;
                if ((((Integer) obj3).intValue() & 17) == 16) {
                    oq5 oq5Var17 = (oq5) hq5Var13;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                k3m k3mVar = (k3m) aqiVar3.getValue();
                boolean z = k3mVar instanceof h3m;
                vci vciVar3 = vci.a;
                if (z) {
                    oq5 oq5Var18 = (oq5) hq5Var13;
                    oq5Var18.Z(1222293066);
                    a3mVar.getClass();
                    oq5Var18.Z(-1997884419);
                    nmj nmjVar2 = a3mVar.d;
                    t tVar = a3mVar.a;
                    boolean h11 = oq5Var18.h(a3mVar);
                    Object K17 = oq5Var18.K();
                    if (h11 || K17 == gq5.a) {
                        K17 = new ti1(8, a3mVar);
                        oq5Var18.k0(K17);
                    }
                    jmj b3 = nmjVar2.b((dmj) K17, tVar, a3mVar.c, 1, oq5Var18, 36352);
                    oq5Var18.p(false);
                    ivf.g(b3, d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar3, vmVar3), 1.0f), bfg.C(oq5Var18), false, 14), b2c.f, 2), false, null, oq5Var18, 0, 12);
                    oq5Var18.p(false);
                } else if (k3mVar instanceof i3m) {
                    oq5 oq5Var19 = (oq5) hq5Var13;
                    oq5Var19.Z(1222827661);
                    yci l = androidx.compose.foundation.layout.a.l(d.c(vciVar3, 1.0f), vmVar3);
                    ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var19, 0);
                    int i6 = oq5Var19.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var19.l();
                    yci H = vnj.H(oq5Var19, l);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var19.d0();
                    if (oq5Var19.O) {
                        oq5Var19.k(grbVar);
                    } else {
                        oq5Var19.n0();
                    }
                    g0g.U(oq5Var19, a3, wp5.f);
                    g0g.U(oq5Var19, l2, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var19.O || !Intrinsics.d(oq5Var19.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var19, i6, kb5Var);
                    }
                    g0g.U(oq5Var19, H, wp5.d);
                    oq5Var19.Z(244853148);
                    for (int i7 = 0; i7 < 15; i7++) {
                        ngg.d(null, oq5Var19, 6);
                    }
                    f1d.u(oq5Var19, false, true, false);
                } else {
                    if (!(k3mVar instanceof j3m)) {
                        throw vz1.i((oq5) hq5Var13, -514762339, false);
                    }
                    oq5 oq5Var20 = (oq5) hq5Var13;
                    oq5Var20.Z(1223297063);
                    p6g.g(a3mVar, (j3m) k3mVar, fvfVar2, lf5Var, null, vmVar3, oq5Var20, 0);
                    oq5Var20.p(false);
                }
                return Unit.a;
            case 13:
                wam wamVar = (wam) this.b;
                rbm rbmVar = (rbm) this.c;
                jab jabVar2 = (jab) this.d;
                thj thjVar3 = (thj) this.e;
                u0s u0sVar2 = (u0s) this.f;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var21 = (oq5) hq5Var14;
                if (oq5Var21.P(intValue13 & 1, (intValue13 & 17) != 16)) {
                    String str7 = wamVar.a;
                    boolean h12 = oq5Var21.h(rbmVar) | oq5Var21.h(jabVar2) | oq5Var21.h(thjVar3) | oq5Var21.h(u0sVar2);
                    Object K18 = oq5Var21.K();
                    if (h12 || K18 == gq5.a) {
                        K18 = new gam(rbmVar, jabVar2, thjVar3, u0sVar2, 2);
                        oq5Var21.k0(K18);
                    }
                    dag.e(0, oq5Var21, com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K18, 15), str7);
                } else {
                    oq5Var21.S();
                }
                return Unit.a;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return j(obj, obj2, obj3);
            case 19:
                return k(obj, obj2, obj3);
            case 20:
                return l(obj, obj2, obj3);
            case 21:
                return m(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            default:
                String str8 = (String) this.b;
                kes kesVar = (kes) this.c;
                plv plvVar = (plv) this.d;
                jzb jzbVar = (jzb) this.e;
                String str9 = (String) this.f;
                hq5 hq5Var15 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((pho) obj).getClass();
                kes kesVar2 = kesVar;
                plv plvVar2 = plvVar;
                o2g.n(str8, null, kesVar2, plvVar2, hq5Var15, 0, 2);
                oq5 oq5Var22 = (oq5) hq5Var15;
                if (jzbVar != null) {
                    oq5Var22.Z(1790840127);
                    int ordinal = jzbVar.ordinal();
                    if (ordinal == 0) {
                        str = "🄴";
                    } else if (ordinal == 1) {
                        str = "⑱";
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        str = "ⓘ";
                    }
                    o2g.n("  ".concat(str), null, kesVar2, plvVar2, oq5Var22, 0, 2);
                    kesVar2 = kesVar2;
                    plvVar2 = plvVar2;
                } else {
                    oq5Var22.Z(1788576104);
                }
                oq5Var22.p(false);
                o2g.b(f1d.g(" — ", str9), pho.a(), kesVar2, plvVar2, hq5Var15, 0);
                return Unit.a;
        }
    }

    public /* synthetic */ lc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
