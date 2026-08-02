package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.music.core.ui.compose.b;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.f;

/* loaded from: classes3.dex */
public final /* synthetic */ class gab implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gab(xke xkeVar, fle fleVar) {
        this.a = 4;
        this.b = xkeVar;
        this.c = fleVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        c a;
        gs4 gs4Var = (gs4) this.b;
        pu0 pu0Var = (pu0) this.c;
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
        oq5 oq5Var2 = (oq5) hq5Var;
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
        }
        mm6 mm6Var = ((fs5) K).a;
        Object K2 = oq5Var2.K();
        if (K2 == kjnVar) {
            lt ltVar = (lt) gs4Var.a;
            oq oqVar = (oq) gs4Var.b;
            r8j r8jVar = (r8j) gs4Var.c;
            jyr jyrVar = r8jVar.t;
            qe3 qe3Var = (qe3) gs4Var.d;
            sui suiVar = new sui(0, (sai) gs4Var.e, sai.class, "hide", "hide()V", 0, 11);
            boolean z = r8jVar.e;
            if (z) {
                ((f) jyrVar.getValue()).getClass();
                a = f.c();
            } else {
                if (z) {
                    b6e.s();
                    return null;
                }
                ((f) jyrVar.getValue()).getClass();
                a = f.a();
            }
            w8j w8jVar = new w8j(ltVar, oqVar, r8jVar, qe3Var, new s8j(r8jVar.b, r8jVar.a, r8jVar.c, r8jVar.d, a, r8jVar.u, suiVar), mm6Var);
            oq5Var2.k0(w8jVar);
            K2 = w8jVar;
        }
        w8j w8jVar2 = (w8j) K2;
        aqi M = gld.M(w8jVar2.d, hq5Var);
        a9j a9jVar = (a9j) M.getValue();
        if (Intrinsics.d(a9jVar, x8j.a)) {
            oq5Var2.Z(-1019240511);
            oq5Var2.p(false);
        } else {
            if (!Intrinsics.d(a9jVar, y8j.a) && !(a9jVar instanceof z8j)) {
                throw vz1.i(oq5Var2, -1019242224, false);
            }
            oq5Var2.Z(-1531534696);
            jf0.a(new qzm[0], pu0Var, false, ild.C(-787098940, new q6h(10, bciVar, w8jVar2, M), oq5Var2), oq5Var2, 0, 4);
            oq5Var2.p(false);
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        pu0 pu0Var = (pu0) this.b;
        ime imeVar = (ime) this.c;
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
        jf0.a(new qzm[0], pu0Var, false, ild.C(588406021, new m2g(28, imeVar, bciVar), hq5Var), hq5Var, 0, 4);
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        mdj mdjVar = (mdj) this.b;
        fvf fvfVar = (fvf) this.c;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            qdj qdjVar = (qdj) gld.M(mdjVar.k, oq5Var).getValue();
            if (qdjVar instanceof pdj) {
                oq5Var.Z(-1949669886);
                dag.d(fvfVar, o0kVar, ((pdj) qdjVar).a, mdjVar, oq5Var, (intValue << 3) & 112);
                oq5Var.p(false);
            } else if (qdjVar instanceof ndj) {
                oq5Var.Z(-1949369186);
                q5g.d(o0kVar, ((ndj) qdjVar).a, oq5Var, intValue & 14);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(qdjVar, odj.a)) {
                    throw vz1.i(oq5Var, 1045483275, false);
                }
                oq5Var.Z(-1949155565);
                yci c = d.c(vci.a, 1.0f);
                kfh d = ug3.d(b2c.f, false);
                int i = oq5Var.P;
                a l = oq5Var.l();
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
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var, i, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                c3x.m(0, 3, 0L, oq5Var, null);
                oq5Var.p(true);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r15.K(), java.lang.Integer.valueOf(r11)) == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v3, types: [int] */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(Object obj, Object obj2, Object obj3) {
        char c;
        ?? r35;
        wn5 wn5Var = (wn5) this.b;
        usj usjVar = (usj) this.c;
        oho ohoVar = (oho) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ohoVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(ohoVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.Z(1442697627);
            vci vciVar = vci.a;
            yci m = d.m(vciVar, 88);
            kfh d = ug3.d(b2c.f, false);
            int i = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
            wp5 wp5Var = xp5.T;
            wp5Var.getClass();
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
            if (oq5Var.O) {
                c = 0;
            } else {
                char c2 = 0;
                r35 = c2;
                c = c2;
            }
            ouj.x(i, oq5Var, i, kb5Var3);
            r35 = c;
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            wn5Var.invoke(oq5Var, Integer.valueOf((int) r35));
            oq5Var.p(true);
            boolean z = r35;
            oq5Var.p(z);
            if (Unit.a == null) {
                oq5Var.Z(2124757021);
                u1g.l(oq5Var, d.o(vciVar, 16, 88));
                oq5Var.p(z);
            } else {
                oq5Var.Z(2124748310);
                oq5Var.p(z);
            }
            yci a = ohoVar.a(1.0f, vciVar, true);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, z ? 1 : 0);
            int i2 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a);
            wp5Var.getClass();
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            bg3.a(null, null, false, ild.C(1353861938, new tt5(27, usjVar), oq5Var), oq5Var, 3072, 7);
            String str = usjVar.b;
            if (str == null) {
                oq5Var.Z(762848101);
            } else {
                oq5Var.Z(762848102);
                u1g.l(oq5Var, d.e(vciVar, 4));
                xv7.j(str, androidx.compose.ui.platform.a.a(vciVar, "open_playlist_description"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 2, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
                oq5Var = oq5Var;
            }
            oq5Var.p(false);
            oq5Var.p(true);
            u1g.l(oq5Var, d.r(vciVar, 8));
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        return com.yandex.music.core.ui.compose.a.b(vci.a, (ynn) this.b, 0L, 0.0f, null, new sy3((osj) this.c, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), 3), 14);
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        String str = (String) this.b;
        ges gesVar = (ges) this.c;
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
        xcs.b(str, null, ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar, hq5Var, 0, 3120, 55290);
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        o0k o0kVar = (o0k) this.b;
        wn5 wn5Var = (wn5) this.c;
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
        h6g h6gVar = nu0.a;
        h6g h6gVar2 = h6g.c;
        xcs.a(nu0.i(), ild.C(1010107287, new ngf(o0kVar, wn5Var, 1), hq5Var), hq5Var, 48);
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        lvf lvfVar = (lvf) this.b;
        q0k q0kVar = (q0k) this.c;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((dsf) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            if (lvfVar.d() != 0) {
                oq5Var.Z(-209841252);
                boolean z = lvfVar.e().c instanceof mfg;
                boolean z2 = lvfVar.e().c instanceof lfg;
                boolean h = oq5Var.h(lvfVar);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new ul1(lvfVar, 5);
                    oq5Var.k0(K);
                }
                hyf.e(z, z2, (Function0) K, q0kVar, null, oq5Var, 0);
            } else {
                oq5Var.Z(-216594044);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        dn9 dn9Var = (dn9) this.b;
        vrl vrlVar = (vrl) dn9Var.d;
        pu0 pu0Var = (pu0) this.c;
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
        oq5 oq5Var2 = (oq5) hq5Var;
        Object K = oq5Var2.K();
        Object obj4 = gq5.a;
        if (K == obj4) {
            K = new wrl(vrlVar.a, vrlVar.f, vrlVar.b, vrlVar.c, new msj(0, (sai) dn9Var.f, sai.class, "hide", "hide()V", 0, 13), vrlVar.d, vrlVar.e);
            oq5Var2.k0(K);
        }
        wrl wrlVar = (wrl) K;
        cvl cvlVar = (cvl) dn9Var.b;
        List list = (List) dn9Var.c;
        qe3 qe3Var = (qe3) dn9Var.e;
        cvlVar.getClass();
        wrlVar.getClass();
        Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
        Object K2 = oq5Var2.K();
        if (K2 == obj4) {
            K2 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
        }
        mm6 mm6Var = ((fs5) K2).a;
        boolean f = oq5Var2.f(cvlVar) | oq5Var2.f(list) | oq5Var2.f(vrlVar) | oq5Var2.f(qe3Var) | oq5Var2.f(wrlVar);
        Object K3 = oq5Var2.K();
        if (f || K3 == obj4) {
            Object yrlVar = new yrl(cvlVar, list, vrlVar, qe3Var, wrlVar, context, mm6Var);
            oq5Var2.k0(yrlVar);
            K3 = yrlVar;
        }
        yrl yrlVar2 = (yrl) K3;
        aqi M = gld.M(yrlVar2.g, oq5Var2);
        dsl dslVar = (dsl) M.getValue();
        if (Intrinsics.d(dslVar, asl.a)) {
            oq5Var2.Z(-877562931);
            oq5Var2.p(false);
        } else {
            if (!Intrinsics.d(dslVar, bsl.a) && !(dslVar instanceof csl)) {
                throw vz1.i(oq5Var2, -877564511, false);
            }
            oq5Var2.Z(-1434507304);
            jf0.a(new qzm[0], pu0Var, false, ild.C(992757008, new q6h(17, bciVar, yrlVar2, M), oq5Var2), oq5Var2, 0, 4);
            oq5Var2.p(false);
        }
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        yxl yxlVar = (yxl) this.b;
        jab jabVar = (jab) this.c;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            a4g.f((uxl) yxlVar, jabVar, null, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        a3m a3mVar = (a3m) this.b;
        sdr sdrVar = (sdr) this.c;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((oho) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean h = oq5Var2.h(a3mVar);
        Object K = oq5Var2.K();
        if (h || K == gq5.a) {
            ayl aylVar = new ayl(0, a3mVar, a3m.class, "onSaveClick", "onSaveClick()V", 0, 8);
            oq5Var2.k0(aylVar);
            K = aylVar;
        }
        c3x.d(0, oq5Var2, null, (Function0) ((h9f) K), ((Boolean) sdrVar.getValue()).booleanValue());
        return Unit.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        bbm bbmVar = (bbm) this.b;
        aqi aqiVar = (aqi) this.c;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            String M = rvf.M(R.string.non_music_screen_about_podcast_tab, oq5Var);
            String str = bbmVar.a;
            j0s j0sVar = ((jcj) aqiVar.getValue()).a;
            boolean f = oq5Var.f(aqiVar);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new x80(aqiVar, 20);
                oq5Var.k0(K);
            }
            ocg.c(M, str, j0sVar, (Function1) K, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        t5n t5nVar = (t5n) this.b;
        sdr sdrVar = (sdr) this.c;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            yci l = androidx.compose.foundation.layout.a.l(vci.a, o0kVar);
            l6n l6nVar = (l6n) sdrVar.getValue();
            boolean h = oq5Var.h(t5nVar) | oq5Var.f(sdrVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new xum(5, t5nVar, sdrVar);
                oq5Var.k0(K);
            }
            Function1 function1 = (Function1) K;
            boolean h2 = oq5Var.h(t5nVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new b6n(1, t5nVar);
                oq5Var.k0(K2);
            }
            o5g.f(function1, (Function0) K2, l6nVar, l, false, oq5Var, 0, 16);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        kdn kdnVar = (kdn) this.b;
        d85 d85Var = (d85) this.c;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((oho) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        yci d = d.d(vci.a, 1.0f);
        fgq.j(kdnVar.a, kdnVar.c, d, ndn.b, kdnVar.b, kdnVar.d == etq.b, d85Var, hq5Var, 221616);
        return Unit.a;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nsp nspVar;
        String str;
        boolean z;
        oq5 oq5Var;
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = this.a;
        int i2 = 3;
        int i3 = 16;
        Object obj4 = gq5.a;
        vci vciVar = vci.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                jzb jzbVar = (jzb) obj6;
                mn0 mn0Var = (mn0) obj5;
                androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                boolean z6 = jzbVar != null;
                xme E = ox6.E(jzbVar, 0L, hq5Var, 6);
                xv7.i(mn0Var, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "bottom_sheet_header_title"), ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 4, 0, bow.l(E), null, nu0.b(), z6 ? bow.k(cVar, new xme[]{E}) : null, null, hq5Var, 48, 134220848, 612344);
                return Unit.a;
            case 1:
                dtp dtpVar = ((rnl) obj6).f;
                kub kubVar = (kub) obj5;
                otb otbVar = (otb) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                otbVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((oq5) hq5Var2).f(otbVar) : ((oq5) hq5Var2).h(otbVar) ? 4 : 2;
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    dtp dtpVar2 = (otbVar.e || !((nspVar = dtpVar.f) == nsp.c || nspVar == nsp.d)) ? dtpVar : new dtp(dtpVar.a, dtpVar.b, dtpVar.c, dtpVar.d, dtpVar.e, nsp.a);
                    boolean h = oq5Var3.h(kubVar);
                    Object K = oq5Var3.K();
                    if (h || K == obj4) {
                        K = new o57(1, kubVar, kub.class, "onRepeatModeClick", "onRepeatModeClick(Lcom/yandex/music/shared/common_queue/api/RepeatModeType;)V", 0, 23);
                        oq5Var3.k0(K);
                    }
                    Function1 function1 = (Function1) ((h9f) K);
                    boolean h2 = oq5Var3.h(kubVar);
                    Object K2 = oq5Var3.K();
                    if (h2 || K2 == obj4) {
                        K2 = new o57(1, kubVar, kub.class, "onShuffleClick", "onShuffleClick(Z)V", 0, 24);
                        oq5Var3.k0(K2);
                    }
                    Function1 function12 = (Function1) ((h9f) K2);
                    boolean h3 = oq5Var3.h(kubVar);
                    Object K3 = oq5Var3.K();
                    if (h3 || K3 == obj4) {
                        K3 = new o57(1, kubVar, kub.class, "onSpeedClick", "onSpeedClick(Lcom/yandex/music/screen/player/viewmodel/PlayerPlaybackSpeed;)V", 0, 25);
                        oq5Var3.k0(K3);
                    }
                    Function1 function13 = (Function1) ((h9f) K3);
                    boolean h4 = oq5Var3.h(kubVar);
                    Object K4 = oq5Var3.K();
                    if (h4 || K4 == obj4) {
                        K4 = new ceb(0, kubVar, kub.class, "onQualitySettingsClick", "onQualitySettingsClick()V", 0, 13);
                        oq5Var3.k0(K4);
                    }
                    Function0 function0 = (Function0) ((h9f) K4);
                    boolean h5 = oq5Var3.h(kubVar);
                    Object K5 = oq5Var3.K();
                    if (h5 || K5 == obj4) {
                        K5 = new ceb(0, kubVar, kub.class, "onTimerClick", "onTimerClick()V", 0, 14);
                        oq5Var3.k0(K5);
                    }
                    Function0 function02 = (Function0) ((h9f) K5);
                    boolean h6 = oq5Var3.h(kubVar);
                    Object K6 = oq5Var3.K();
                    if (h6 || K6 == obj4) {
                        K6 = new o57(1, kubVar, kub.class, "onLyricsClick", "onLyricsClick(Z)V", 0, 26);
                        oq5Var3.k0(K6);
                    }
                    g0g.q(dtpVar2, function1, function12, function13, function0, function02, (Function1) ((h9f) K6), androidx.compose.foundation.layout.a.n(vciVar, 8, 4), oq5Var3, 0, 0);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 2:
                String str3 = (String) obj6;
                yci yciVar = (yci) obj5;
                androidx.compose.foundation.layout.c cVar2 = (androidx.compose.foundation.layout.c) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(cVar2) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                ges i4 = nu0.i();
                ids O = o5g.O(0, 1, hq5Var3);
                oq5 oq5Var5 = (oq5) hq5Var3;
                boolean f = oq5Var5.f(str3);
                Object K7 = oq5Var5.K();
                if (f || K7 == obj4) {
                    int i5 = ga6.i(cVar2.b);
                    if (i5 < 0) {
                        ume.a("width must be >= 0");
                    }
                    str = str3;
                    K7 = ids.a(O, str, i4, 0, false, 0, ia6.h(i5, i5, 0, Integer.MAX_VALUE), 988);
                    oq5Var5.k0(K7);
                } else {
                    str = str3;
                }
                yci a = androidx.compose.ui.platform.a.a(yciVar, "foreign_agent_block");
                if (((cds) K7).b.f > 1) {
                    i4 = ges.b(i4, 0L, v7g.z(12), null, null, 0L, 0, 0L, null, null, 0, 0, 16777213);
                }
                xv7.j(str, a, ((dq0) oq5Var5.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 0, 0, null, i4, oq5Var5, 0, 0, 65528);
                return Unit.a;
            case 3:
                qo6 qo6Var = (qo6) obj6;
                yci yciVar2 = (yci) obj5;
                zkn zknVar = (zkn) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(zknVar) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (k instanceof as1) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    oq5Var7.Z(202080759);
                    yciVar2.getClass();
                    irf.r(((as1) k).a, null, androidx.compose.ui.draw.a.b(yciVar2, new p1i(i3)), zknVar.d, zknVar.e, 0.0f, null, oq5Var7, 48, 96);
                    oq5Var7.p(false);
                } else if (k instanceof yr1) {
                    oq5 oq5Var8 = (oq5) hq5Var4;
                    oq5Var8.Z(202529887);
                    swf.d(qo6Var, gce.b, null, null, 0L, 0L, false, oq5Var8, 48, 124);
                    oq5Var8.p(false);
                } else {
                    if (!Intrinsics.d(k, xr1.a) && !(k instanceof zr1)) {
                        throw vz1.i((oq5) hq5Var4, 976347203, false);
                    }
                    oq5 oq5Var9 = (oq5) hq5Var4;
                    oq5Var9.Z(976372675);
                    oq5Var9.p(false);
                }
                return Unit.a;
            case 4:
                xke xkeVar = (xke) obj6;
                fle fleVar = (fle) obj5;
                lke lkeVar = (lke) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (lkeVar == null || !lkeVar.d().contains(xkeVar)) {
                    z = false;
                    oq5Var = (oq5) hq5Var5;
                    oq5Var.Z(-891802856);
                } else {
                    oq5Var = (oq5) hq5Var5;
                    oq5Var.Z(-890688096);
                    jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                    iz2 iz2Var = b2c.f;
                    yci d = b.d(androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "informers_container"), uah.e(new Pair("informers_container_tag", lkeVar.getTag()), new Pair("informers_container_place", xkeVar)));
                    boolean h7 = oq5Var.h(fleVar) | oq5Var.f(jx7Var);
                    Object K8 = oq5Var.K();
                    if (h7 || K8 == obj4) {
                        K8 = new dae(1, fleVar, jx7Var);
                        oq5Var.k0(K8);
                    }
                    Function1 function14 = (Function1) K8;
                    d.getClass();
                    function14.getClass();
                    yci b = androidx.compose.ui.layout.a.b(d, new fdi(0, function14));
                    kfh d2 = ug3.d(iz2Var, false);
                    int i6 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, b);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var, i6, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    lkeVar.b(intValue5 & 14, oq5Var);
                    oq5Var.p(true);
                    z = false;
                }
                oq5Var.p(z);
                return Unit.a;
            case 5:
                pu0 pu0Var = (pu0) obj6;
                sai saiVar = (sai) obj5;
                bci bciVar = (bci) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= (intValue6 & 8) == 0 ? ((oq5) hq5Var6).f(bciVar) : ((oq5) hq5Var6).h(bciVar) ? 4 : 2;
                }
                if ((intValue6 & 19) == 18) {
                    oq5 oq5Var10 = (oq5) hq5Var6;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                jf0.a(new qzm[0], pu0Var, false, ild.C(350102679, new m2g(1, bciVar, saiVar), hq5Var6), hq5Var6, 0, 4);
                return Unit.a;
            case 6:
                jzb jzbVar2 = (jzb) obj6;
                String str4 = (String) obj5;
                androidx.compose.foundation.layout.c cVar3 = (androidx.compose.foundation.layout.c) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(cVar3) ? 4 : 2;
                }
                oq5 oq5Var11 = (oq5) hq5Var7;
                if (oq5Var11.P(intValue7 & 1, (intValue7 & 19) != 18)) {
                    long j = ((dq0) oq5Var11.j(eq0.a)).b.a;
                    xme E2 = ox6.E(jzbVar2, j, oq5Var11, 2);
                    mn0 mn0Var2 = new mn0(str4);
                    ges b2 = nu0.b();
                    LinkedHashMap l2 = bow.l(E2);
                    pn0 k2 = E2 != null ? bow.k(cVar3, new xme[]{E2}) : null;
                    yci d3 = d.d(vciVar, 1.0f);
                    boolean f2 = oq5Var11.f(str4);
                    Object K9 = oq5Var11.K();
                    if (f2 || K9 == obj4) {
                        K9 = new wq(str4, 29);
                        oq5Var11.k0(K9);
                    }
                    xv7.i(mn0Var2, androidx.compose.ui.platform.a.a(nfp.b(d3, false, (Function1) K9), "track_title"), j, 0L, 0L, 0, 0L, 2, false, 2, 0, l2, null, b2, k2, null, oq5Var11, 0, 134220848, 612344);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 7:
                List list = (List) obj6;
                Object obj7 = (Function2) obj5;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var12 = (oq5) hq5Var8;
                if (oq5Var12.P(intValue8 & 1, (intValue8 & 17) != 16)) {
                    float f3 = 20;
                    u1g.l(oq5Var12, d.e(vciVar, f3));
                    yci u = xp3.u(androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), o5g.G(oq5Var12));
                    boolean f4 = oq5Var12.f(list);
                    Object K10 = oq5Var12.K();
                    if (f4 || K10 == obj4) {
                        K10 = new h50(list, 4);
                        oq5Var12.k0(K10);
                    }
                    yci b3 = nfp.b(u, false, (Function1) K10);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var12, 0);
                    int i7 = oq5Var12.P;
                    a l3 = oq5Var12.l();
                    yci H2 = vnj.H(oq5Var12, b3);
                    xp5.T.getClass();
                    Function0 function03 = wp5.b;
                    oq5Var12.d0();
                    if (oq5Var12.O) {
                        oq5Var12.k(function03);
                    } else {
                        oq5Var12.n0();
                    }
                    g0g.U(oq5Var12, a2, wp5.f);
                    g0g.U(oq5Var12, l3, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var12, i7, kb5Var2);
                    }
                    g0g.U(oq5Var12, H2, wp5.d);
                    oq5Var12.Z(1814172746);
                    int i8 = 0;
                    for (Object obj8 : list) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            u75.n();
                            throw null;
                        }
                        wf wfVar = (wf) obj8;
                        boolean f5 = oq5Var12.f(obj7) | oq5Var12.f(wfVar) | oq5Var12.d(i8);
                        Object K11 = oq5Var12.K();
                        if (f5 || K11 == obj4) {
                            K11 = new de(obj7, wfVar, i8, 26);
                            oq5Var12.k0(K11);
                        }
                        Function0 function04 = (Function0) K11;
                        boolean d4 = oq5Var12.d(i8);
                        Object K12 = oq5Var12.K();
                        if (d4 || K12 == obj4) {
                            K12 = new cv0(i8, 3);
                            oq5Var12.k0(K12);
                        }
                        yci a3 = androidx.compose.ui.platform.a.a(nfp.b(vciVar, false, (Function1) K12), wfVar.d);
                        String M = rvf.M(wfVar.c, oq5Var12);
                        Integer num = wfVar.b;
                        if (num == null) {
                            oq5Var12.Z(524017161);
                            oq5Var12.p(false);
                            str2 = null;
                        } else {
                            oq5Var12.Z(524017162);
                            String M2 = rvf.M(num.intValue(), oq5Var12);
                            oq5Var12.p(false);
                            str2 = M2;
                        }
                        a0g.a(wfVar, function04, a3, M, str2, oq5Var12, 0);
                        if (i8 != u75.g(list)) {
                            oq5Var12.Z(524124112);
                            xv7.k(null, 0L, 0.0f, 0.0f, oq5Var12, 0, 15);
                            z2 = false;
                        } else {
                            z2 = false;
                            oq5Var12.Z(519709929);
                        }
                        oq5Var12.p(z2);
                        i8 = i9;
                    }
                    oq5Var12.p(false);
                    oq5Var12.p(true);
                    u1g.l(oq5Var12, d.e(vciVar, f3));
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 8:
                wn5 wn5Var = (wn5) obj6;
                sai saiVar2 = (sai) obj5;
                ua5 ua5Var = (ua5) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ua5Var.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var9).f(ua5Var) ? 4 : 2;
                }
                if ((intValue9 & 19) == 18) {
                    oq5 oq5Var13 = (oq5) hq5Var9;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(ua5Var, saiVar2, hq5Var9, Integer.valueOf(intValue9 & 14));
                return Unit.a;
            case 9:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                ksk M3 = ffhVar.M(((ga6) obj3).a);
                return mfh.m0(mfhVar, M3.a, M3.b, new p3e(7, (ja0) obj6, M3, (Function1) obj5));
            case 10:
                mvi mviVar = (mvi) obj6;
                dvi dviVar = (dvi) obj5;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var14 = (oq5) hq5Var10;
                if (oq5Var14.P(intValue10 & 1, (intValue10 & 17) != 16)) {
                    if (mviVar.a.b.isEmpty()) {
                        z3 = false;
                        oq5Var14.Z(-1097217068);
                    } else {
                        oq5Var14.Z(-1094558353);
                        t1f t1fVar = dviVar.f;
                        boolean h8 = oq5Var14.h(dviVar);
                        Object K13 = oq5Var14.K();
                        if (h8 || K13 == obj4) {
                            K13 = new dmg(25, dviVar);
                            oq5Var14.k0(K13);
                        }
                        Function0 function05 = (Function0) K13;
                        boolean h9 = oq5Var14.h(dviVar) | oq5Var14.f(mviVar);
                        Object K14 = oq5Var14.K();
                        if (h9 || K14 == obj4) {
                            K14 = new y6g(15, dviVar, mviVar);
                            oq5Var14.k0(K14);
                        }
                        pcg.h(mviVar, t1fVar, function05, (Function0) K14, oq5Var14, 0);
                        z3 = false;
                    }
                    oq5Var14.p(z3);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 11:
                dvi dviVar2 = (dvi) obj6;
                lvi lviVar = (lvi) obj5;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var15 = (oq5) hq5Var11;
                if (oq5Var15.P(intValue11 & 1, (intValue11 & 17) != 16)) {
                    boolean h10 = oq5Var15.h(dviVar2) | oq5Var15.f(lviVar);
                    Object K15 = oq5Var15.K();
                    if (h10 || K15 == obj4) {
                        K15 = new y6g(i3, dviVar2, lviVar);
                        oq5Var15.k0(K15);
                    }
                    swf.l((Function0) K15, androidx.compose.ui.platform.a.a(vciVar, "my_shelf_show_more_history"), null, null, oq5Var15, 48, 12);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 12:
                awi awiVar = (awi) obj5;
                hq5 hq5Var12 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                llf llfVar = ((ulf) obj6).a;
                w4k E3 = a0g.E(llfVar.b ? R.drawable.ic_pause_big_32 : R.drawable.ic_play_big_32, 0, hq5Var12);
                awiVar.getClass();
                zvi zviVar = zvi.a;
                if (!zviVar.equals(zviVar)) {
                    throw vz1.i((oq5) hq5Var12, 2032358283, false);
                }
                oq5 oq5Var16 = (oq5) hq5Var12;
                oq5Var16.Z(2032359046);
                o6g a4 = awi.a(oq5Var16);
                oq5Var16.p(false);
                boolean z7 = llfVar.b;
                wdg.a(E3, a4, b.c(vciVar, "landing_wave_block_button_play_pause", Boolean.valueOf(z7)), rvf.M(z7 ? R.string.accessibility_my_wave_pause_button_description : R.string.accessibility_my_wave_play_button_description, hq5Var12), hq5Var12, 0);
                return Unit.a;
            case 13:
                s3j s3jVar = (s3j) obj6;
                tmb tmbVar = (tmb) obj5;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((oq5) hq5Var13).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var17 = (oq5) hq5Var13;
                if (oq5Var17.P(intValue12 & 1, (intValue12 & 19) != 18)) {
                    yci x = d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar), 1.0f), bfg.C(oq5Var17), false, 14), b2c.f, 2);
                    boolean h11 = oq5Var17.h(s3jVar);
                    Object K16 = oq5Var17.K();
                    if (h11 || K16 == obj4) {
                        K16 = new s8i(i2, s3jVar);
                        oq5Var17.k0(K16);
                    }
                    rvf.j((Function1) K16, tmbVar, x, 0, true, null, oq5Var17, 24640, 40);
                } else {
                    oq5Var17.S();
                }
                return Unit.a;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                l9j l9jVar = (l9j) obj6;
                fvf fvfVar = (fvf) obj5;
                o0k o0kVar2 = (o0k) obj;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                o0kVar2.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((oq5) hq5Var14).f(o0kVar2) ? 4 : 2;
                }
                oq5 oq5Var18 = (oq5) hq5Var14;
                if (oq5Var18.P(intValue13 & 1, (intValue13 & 19) != 18)) {
                    q9j q9jVar = (q9j) gld.M(l9jVar.g, oq5Var18).getValue();
                    if (q9jVar instanceof p9j) {
                        oq5Var18.Z(2037082426);
                        u1g.e(fvfVar, o0kVar2, ((p9j) q9jVar).a, l9jVar, oq5Var18, (intValue13 << 3) & 112);
                        oq5Var18.p(false);
                    } else if (q9jVar instanceof n9j) {
                        oq5Var18.Z(2037383126);
                        q5g.d(o0kVar2, ((n9j) q9jVar).a, oq5Var18, intValue13 & 14);
                        oq5Var18.p(false);
                    } else {
                        if (!Intrinsics.d(q9jVar, o9j.a)) {
                            throw vz1.i(oq5Var18, -211385133, false);
                        }
                        oq5Var18.Z(2037596747);
                        yci c = d.c(vciVar, 1.0f);
                        kfh d5 = ug3.d(b2c.f, false);
                        int i10 = oq5Var18.P;
                        a l4 = oq5Var18.l();
                        yci H3 = vnj.H(oq5Var18, c);
                        xp5.T.getClass();
                        grb grbVar2 = wp5.b;
                        oq5Var18.d0();
                        if (oq5Var18.O) {
                            oq5Var18.k(grbVar2);
                        } else {
                            oq5Var18.n0();
                        }
                        g0g.U(oq5Var18, d5, wp5.f);
                        g0g.U(oq5Var18, l4, wp5.e);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var18.O || !Intrinsics.d(oq5Var18.K(), Integer.valueOf(i10))) {
                            ouj.x(i10, oq5Var18, i10, kb5Var3);
                        }
                        g0g.U(oq5Var18, H3, wp5.d);
                        c3x.m(0, 3, 0L, oq5Var18, null);
                        oq5Var18.p(true);
                        oq5Var18.p(false);
                    }
                } else {
                    oq5Var18.S();
                }
                return Unit.a;
            case 16:
                return d(obj, obj2, obj3);
            case 17:
                return g(obj, obj2, obj3);
            case 18:
                return j(obj, obj2, obj3);
            case 19:
                return h(obj, obj2, obj3);
            case 20:
                return k(obj, obj2, obj3);
            case 21:
                return l(obj, obj2, obj3);
            case 22:
                return m(obj, obj2, obj3);
            case 23:
                return n(obj, obj2, obj3);
            case 24:
                return o(obj, obj2, obj3);
            case 25:
                return p(obj, obj2, obj3);
            case 26:
                return q(obj, obj2, obj3);
            case 27:
                return r(obj, obj2, obj3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return s(obj, obj2, obj3);
            default:
                m1p m1pVar = (m1p) obj6;
                x6k x6kVar = m1pVar.b;
                Function2 function2 = (Function2) obj5;
                Function2 function22 = (Function2) obj;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                function22.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((oq5) hq5Var15).h(function22) ? 4 : 2;
                }
                if ((intValue14 & 19) == 18) {
                    oq5 oq5Var19 = (oq5) hq5Var15;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 16, 0.0f, 0.0f, 0.0f, 14);
                nho a5 = lho.a(qx0.a, b2c.l, hq5Var15, 48);
                oq5 oq5Var20 = (oq5) hq5Var15;
                int i11 = oq5Var20.P;
                a l5 = oq5Var20.l();
                yci H4 = vnj.H(hq5Var15, q);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var20.d0();
                if (oq5Var20.O) {
                    oq5Var20.k(grbVar3);
                } else {
                    oq5Var20.n0();
                }
                kb5 kb5Var4 = wp5.f;
                g0g.U(hq5Var15, a5, kb5Var4);
                kb5 kb5Var5 = wp5.e;
                g0g.U(hq5Var15, l5, kb5Var5);
                kb5 kb5Var6 = wp5.g;
                if (oq5Var20.O || !Intrinsics.d(oq5Var20.K(), Integer.valueOf(i11))) {
                    ouj.x(i11, oq5Var20, i11, kb5Var6);
                }
                kb5 kb5Var7 = wp5.d;
                g0g.U(hq5Var15, H4, kb5Var7);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                kfh d6 = ug3.d(b2c.b, true);
                int i12 = oq5Var20.P;
                a l6 = oq5Var20.l();
                yci H5 = vnj.H(hq5Var15, layoutWeightElement);
                oq5Var20.d0();
                if (oq5Var20.O) {
                    oq5Var20.k(grbVar3);
                } else {
                    oq5Var20.n0();
                }
                g0g.U(hq5Var15, d6, kb5Var4);
                g0g.U(hq5Var15, l6, kb5Var5);
                if (oq5Var20.O || !Intrinsics.d(oq5Var20.K(), Integer.valueOf(i12))) {
                    ouj.x(i12, oq5Var20, i12, kb5Var6);
                }
                g0g.U(hq5Var15, H5, kb5Var7);
                if (((ybs) x6kVar.getValue()).a.b.length() == 0) {
                    oq5Var20.Z(-382540184);
                    function2.invoke(hq5Var15, 0);
                    z4 = false;
                } else {
                    z4 = false;
                    oq5Var20.Z(-386140307);
                }
                oq5Var20.p(z4);
                function22.invoke(hq5Var15, Integer.valueOf(intValue14 & 14));
                oq5Var20.p(true);
                if (((ybs) x6kVar.getValue()).a.b.length() > 0) {
                    oq5Var20.Z(-436101929);
                    boolean h12 = oq5Var20.h(m1pVar);
                    Object K17 = oq5Var20.K();
                    if (h12 || K17 == obj4) {
                        K17 = new i1p(m1pVar, 1);
                        oq5Var20.k0(K17);
                    }
                    Function0 function06 = (Function0) K17;
                    z5 = false;
                    aae.a(function06, null, false, ild.C(-1102260700, new j1p(0), hq5Var15), hq5Var15, 24576, 14);
                } else {
                    z5 = false;
                    oq5Var20.Z(-439909721);
                }
                oq5Var20.p(z5);
                oq5Var20.p(true);
                return Unit.a;
        }
    }

    public /* synthetic */ gab(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
