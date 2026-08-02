package defpackage;

import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.config.ServiceDescription;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class vtb implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vtb(ArrayList arrayList, Function1 function1, Function1 function12) {
        this.a = 13;
        this.b = arrayList;
        this.c = (ezc) function1;
        this.d = (ezc) function12;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        yem yemVar = (yem) this.b;
        sem semVar = (sem) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(yemVar, wem.b)) {
            oq5Var.Z(1074115130);
            oq5Var.p(false);
        } else if (yemVar instanceof xem) {
            oq5Var.Z(1004481817);
            rvf.l(((xem) yemVar).a, semVar, fvfVar, o0kVar, oq5Var, (intValue << 9) & 7168);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(yemVar, wem.a)) {
                throw vz1.i(oq5Var, 1004479010, false);
            }
            oq5Var.Z(1004489974);
            fgq.n(0, oq5Var, a.a(d.c(androidx.compose.foundation.layout.a.l(vci.a, o0kVar), 1.0f), "collection_downloaded_podcasts_empty"), rvf.M(R.string.downloaded_podcasts_empty, oq5Var));
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        final yit yitVar = (yit) this.b;
        final Function1 function1 = (Function1) this.c;
        final Function1 function12 = (Function1) this.d;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((dsf) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            boolean f = oq5Var.f(function1) | oq5Var.h(yitVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                final int i = 0;
                K = new Function0() { // from class: fim
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                function1.invoke(yitVar);
                                break;
                            default:
                                function1.invoke(yitVar);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean f2 = oq5Var.f(function12) | oq5Var.h(yitVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                final int i2 = 1;
                K2 = new Function0() { // from class: fim
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                function12.invoke(yitVar);
                                break;
                            default:
                                function12.invoke(yitVar);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            ezf.k(yitVar, function0, (Function0) K2, null, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        w4k w4kVar = (w4k) this.b;
        sdr sdrVar = (sdr) this.d;
        wn5 wn5Var = (wn5) this.c;
        mxm mxmVar = (mxm) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        mxmVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).d(mxmVar.ordinal()) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            yci c = d.c(vci.a, 1.0f);
            kfh d = ug3.d(b2c.f, false);
            int i = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int ordinal = mxmVar.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(1150158398);
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var.Z(1294792780);
                irf.r(w4kVar, null, null, null, null, 0.0f, new d43(((d85) sdrVar.getValue()).a, 5), oq5Var, 48, 60);
                oq5Var.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, 1150144834, false);
                }
                oq5Var.Z(1295073609);
                wn5Var.invoke(oq5Var, 0);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        yci g;
        bzj bzjVar = (bzj) this.b;
        oxn oxnVar = (oxn) this.c;
        bg5 bg5Var = (bg5) this.d;
        dh3 dh3Var = (dh3) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        dh3Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(dh3Var) ? 4 : 2;
        }
        int i = intValue;
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 19) != 18)) {
            int ordinal = bzjVar.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(918829557);
                w4k E = a0g.E(R.drawable.ic_burger, 0, oq5Var);
                long j = ((dq0) oq5Var.j(eq0.a)).a.c;
                yci a = dh3Var.a(d.m(vci.a, 24), b2c.f);
                msd msdVar = (msd) oq5Var.j(es5.l);
                oxnVar.getClass();
                a.getClass();
                msdVar.getClass();
                g = androidx.compose.foundation.a.g(gut.X(oxnVar, gut.B(oxnVar, a, new k2m(msdVar, 2)), new k2m(msdVar, 3)), null, null, true, null, (r17 & 16) != 0 ? null : null, null, (r17 & 64) != 0 ? null : null, null, new p1n(7));
                gae.b(E, null, a.a(g, "track_move"), j, oq5Var, 48, 0);
                oq5Var.p(false);
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var, 2107847288, false);
                }
                oq5Var.Z(919410652);
                boolean h = oq5Var.h(bg5Var);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    ebm ebmVar = new ebm(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 28);
                    oq5Var.k0(ebmVar);
                    K = ebmVar;
                }
                qgg.h(dh3Var, zyj.c, (Function0) ((h9f) K), ((dq0) oq5Var.j(eq0.a)).a.c, oq5Var, (i & 14) | 48);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        float f;
        con conVar = (con) this.b;
        wn5 wn5Var = (wn5) this.c;
        wn5 wn5Var2 = (wn5) this.d;
        hq5 hq5Var = (hq5) obj2;
        ((Integer) obj3).getClass();
        ((va5) obj).getClass();
        boolean z = conVar.r;
        if (z) {
            f = fma.c(conVar.t) + conVar.c;
        } else {
            f = 0;
        }
        skd skdVar = skd.a;
        ukd A = ngg.A(skdVar, 0.0f, f, 0.0f, 11);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new kin(8);
            oq5Var.k0(K);
        }
        vq2.c(zdg.E(A, (Function1) K), null, ild.C(-815517450, new ion(wn5Var, 1), oq5Var), oq5Var, 384, 2);
        if (z) {
            oq5Var.Z(-345099694);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new kin(9);
                oq5Var.k0(K2);
            }
            vq2.c(zdg.E(skdVar, (Function1) K2), null, ild.C(-413137135, new ion(wn5Var2, 2), oq5Var), oq5Var, 384, 2);
        } else {
            oq5Var.Z(-353991734);
        }
        oq5Var.p(false);
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str = (String) this.b;
        Function0 function0 = (Function0) this.c;
        wn5 wn5Var = (wn5) this.d;
        Function2 function2 = (Function2) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        function2.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).h(function2) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            yci q = androidx.compose.foundation.layout.a.q(d.d(vci.a, 1.0f), 16, 0.0f, 0.0f, 0.0f, 14);
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            kfh d = ug3.d(b2c.b, true);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (str.length() == 0) {
                oq5Var.Z(1145706784);
                wn5Var.invoke(oq5Var, 0);
                z = false;
            } else {
                z = false;
                oq5Var.Z(1139191917);
            }
            oq5Var.p(z);
            function2.invoke(oq5Var, Integer.valueOf(intValue & 14));
            oq5Var.p(true);
            if (str.length() > 0) {
                oq5Var.Z(-478046982);
                boolean f = oq5Var.f(function0);
                Object K = oq5Var.K();
                if (f || K == gq5.a) {
                    K = new g1j(14, function0);
                    oq5Var.k0(K);
                }
                aae.a((Function0) K, null, false, q6k.d, oq5Var, 24576, 14);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-477440622);
                agr agrVar = yre.a;
                u1g.l(oq5Var, MinimumInteractiveModifier.a);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        fvf fvfVar = (fvf) this.b;
        ppp pppVar = (ppp) this.c;
        mpp mppVar = (mpp) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            float f = 16;
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(f, 0.0f, f, f, 2));
            gz2 gz2Var = b2c.o;
            yci a = a.a(d.c(vci.a, 1.0f), "clear_memory_screen");
            boolean f2 = oq5Var.f(pppVar) | oq5Var.h(mppVar);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new xum(12, pppVar, mppVar);
                oq5Var.k0(K);
            }
            weo.f(a, fvfVar, C, null, gz2Var, null, false, null, (Function1) K, oq5Var, 196614, 472);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        List list = (List) this.b;
        eqp eqpVar = (eqp) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            p1g.n(list, eqpVar, fvfVar, o0kVar, oq5Var, (intValue << 9) & 7168);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        t53 t53Var = (t53) this.b;
        eqp eqpVar = (eqp) this.c;
        x8l x8lVar = (x8l) this.d;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            dag.i(t53Var, eqpVar, (yci) x8lVar.invoke(oq5Var, 0), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        h53 h53Var = (h53) this.b;
        eqp eqpVar = (eqp) this.c;
        x8l x8lVar = (x8l) this.d;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            wct.j(h53Var, eqpVar, (yci) x8lVar.invoke(oq5Var, 0), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r10v34, types: [ezc, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r15v5, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vti vtiVar;
        oq5 oq5Var;
        int i = this.a;
        int i2 = 16;
        Continuation continuation = null;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        int i3 = 6;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                rnl rnlVar = (rnl) obj6;
                kub kubVar = (kub) obj5;
                sdr sdrVar = (sdr) obj4;
                otb otbVar = (otb) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                otbVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(otbVar) : ((oq5) hq5Var).h(otbVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 19) != 18)) {
                    etn.l(es5.n.a(xof.a), ild.C(805903046, new av5(rnlVar, otbVar, kubVar, sdrVar, 11), oq5Var2), oq5Var2, 56);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 1:
                mdc mdcVar = (mdc) obj6;
                final List list = (List) obj5;
                final t5c t5cVar = (t5c) obj4;
                final int intValue2 = ((Integer) obj).intValue();
                final int intValue3 = ((Integer) obj2).intValue();
                final int intValue4 = ((Integer) obj3).intValue();
                return com.yandex.music.core.ui.compose.a.c(vciVar, null, mdcVar != null ? (hcc) mdcVar.a.get(mdcVar.b) : null, new pyc() { // from class: c6c
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        fcc fccVar;
                        boolean booleanValue = ((Boolean) obj7).booleanValue();
                        String str = (String) obj8;
                        str.getClass();
                        mqs mqsVar = ((jo6) list.get(intValue2)).b;
                        t5c t5cVar2 = t5cVar;
                        t5cVar2.getClass();
                        rmb rmbVar = t5cVar2.b;
                        thj M = szf.M(mqsVar, intValue3, intValue4);
                        mdc a = t5cVar2.a();
                        if (a != null) {
                            ArrayList arrayList = a.a;
                            int i4 = a.b;
                            hcc hccVar = (hcc) arrayList.get(i4);
                            hccVar.getClass();
                            fccVar = new fcc(ServiceDescription.KEY_FILTER, hccVar.a, i4 + 1);
                        } else {
                            fccVar = null;
                        }
                        weo.H(rmbVar, M, booleanValue, str, fccVar);
                        return Unit.a;
                    }
                }, 15);
            case 2:
                y6c y6cVar = (y6c) obj6;
                uoi uoiVar = (uoi) obj5;
                e7c e7cVar = (e7c) obj4;
                yci yciVar = (yci) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                yciVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var2).f(yciVar) ? 4 : 2;
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue5 & 1, (intValue5 & 19) != 18)) {
                    boolean f = oq5Var3.f(y6cVar);
                    Object K = oq5Var3.K();
                    if (f || K == kjnVar) {
                        K = new at5(23, y6cVar);
                        oq5Var3.k0(K);
                    }
                    yci a = e.a(nfp.b(yciVar, false, (Function1) K), uoiVar, (yie) oq5Var3.j(e.a));
                    kfh d = ug3.d(b2c.b, false);
                    int i4 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l = oq5Var3.l();
                    yci H = vnj.H(oq5Var3, a);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, d, wp5.f);
                    g0g.U(oq5Var3, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var3, i4, kb5Var);
                    }
                    g0g.U(oq5Var3, H, wp5.d);
                    qo6 qo6Var = qo6.k;
                    String str = y6cVar.f;
                    b bVar = b.a;
                    ltg.e(qo6Var, str, bVar.b(vciVar), null, null, null, null, null, oq5Var3, 6, 248);
                    String str2 = y6cVar.g;
                    if (str2 == null) {
                        oq5Var3.Z(-930725370);
                    } else {
                        oq5Var3.Z(-930725369);
                        boolean h = oq5Var3.h(e7cVar) | oq5Var3.f(str2);
                        Object K2 = oq5Var3.K();
                        if (h || K2 == kjnVar) {
                            K2 = new zya(r12, e7cVar, str2);
                            oq5Var3.k0(K2);
                        }
                        lg3.B((Function0) K2, uop.b(ogo.a), bVar.a(vciVar, b2c.j), null, null, oq5Var3, 48, 24);
                    }
                    oq5Var3.p(false);
                    oq5Var3.p(true);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 3:
                pdf pdfVar = (pdf) obj6;
                bdf bdfVar = (bdf) obj5;
                fvf fvfVar = (fvf) obj4;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var3).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (!oq5Var4.P(intValue6 & 1, (intValue6 & 19) != 18)) {
                    oq5Var4.S();
                } else if (Intrinsics.d(pdfVar, kdf.b)) {
                    oq5Var4.Z(-2084332721);
                    oq5Var4.p(false);
                } else if (pdfVar instanceof ndf) {
                    oq5Var4.Z(-1729801575);
                    ox6.q(((ndf) pdfVar).a, bdfVar, fvfVar, o0kVar, oq5Var4, (intValue6 << 9) & 7168);
                    oq5Var4.p(false);
                } else {
                    if (!Intrinsics.d(pdfVar, kdf.a)) {
                        throw vz1.i(oq5Var4, -1729805776, false);
                    }
                    oq5Var4.Z(-1729793417);
                    fgq.n(0, oq5Var4, a.a(d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar), 1.0f), "collection_downloaded_kids_albums_empty"), rvf.M(R.string.downloaded_kids_empty, oq5Var4));
                    oq5Var4.p(false);
                }
                return Unit.a;
            case 4:
                qdf qdfVar = (qdf) obj6;
                cdf cdfVar = (cdf) obj5;
                fvf fvfVar2 = (fvf) obj4;
                o0k o0kVar2 = (o0k) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                o0kVar2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var4).f(o0kVar2) ? 4 : 2;
                }
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (!oq5Var5.P(intValue7 & 1, (intValue7 & 19) != 18)) {
                    oq5Var5.S();
                } else if (Intrinsics.d(qdfVar, mdf.a)) {
                    oq5Var5.Z(1847862304);
                    oq5Var5.p(false);
                } else if (qdfVar instanceof odf) {
                    oq5Var5.Z(752346801);
                    zsd.x(((odf) qdfVar).a, cdfVar, fvfVar2, o0kVar2, oq5Var5, (intValue7 << 9) & 7168);
                    oq5Var5.p(false);
                } else {
                    if (!Intrinsics.d(qdfVar, ldf.a)) {
                        throw vz1.i(oq5Var5, 752343788, false);
                    }
                    oq5Var5.Z(752354876);
                    wct.i(0, oq5Var5, d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar2), 1.0f), rvf.M(R.string.kids_empty, oq5Var5));
                    oq5Var5.p(false);
                }
                return Unit.a;
            case 5:
                nff nffVar = (nff) obj6;
                zef zefVar = (zef) obj5;
                fvf fvfVar3 = (fvf) obj4;
                o0k o0kVar3 = (o0k) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                o0kVar3.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var5).f(o0kVar3) ? 4 : 2;
                }
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (!oq5Var6.P(intValue8 & 1, (intValue8 & 19) != 18)) {
                    oq5Var6.S();
                } else if (Intrinsics.d(nffVar, iff.b)) {
                    oq5Var6.Z(365921821);
                    oq5Var6.p(false);
                } else if (nffVar instanceof lff) {
                    oq5Var6.Z(-680929676);
                    sj2.h(((lff) nffVar).a, zefVar, fvfVar3, o0kVar3, oq5Var6, (intValue8 << 9) & 7168);
                    oq5Var6.p(false);
                } else {
                    if (!Intrinsics.d(nffVar, iff.a)) {
                        throw vz1.i(oq5Var6, -680934057, false);
                    }
                    oq5Var6.Z(-680921140);
                    fgq.n(0, oq5Var6, a.a(d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar3), 1.0f), "collection_downloaded_kids_playlists_empty"), rvf.M(R.string.downloaded_kids_empty, oq5Var6));
                    oq5Var6.p(false);
                }
                return Unit.a;
            case 6:
                off offVar = (off) obj6;
                aff affVar = (aff) obj5;
                fvf fvfVar4 = (fvf) obj4;
                o0k o0kVar4 = (o0k) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                o0kVar4.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var6).f(o0kVar4) ? 4 : 2;
                }
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (!oq5Var7.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    oq5Var7.S();
                } else if (Intrinsics.d(offVar, kff.a)) {
                    oq5Var7.Z(430844190);
                    oq5Var7.p(false);
                } else if (offVar instanceof mff) {
                    oq5Var7.Z(429541980);
                    vq2.l(((mff) offVar).a, affVar, fvfVar4, o0kVar4, oq5Var7, (intValue9 << 9) & 7168);
                    oq5Var7.p(false);
                } else {
                    if (!Intrinsics.d(offVar, jff.a)) {
                        throw vz1.i(oq5Var7, 429538784, false);
                    }
                    oq5Var7.Z(429550430);
                    wct.i(0, oq5Var7, d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar4), 1.0f), rvf.M(R.string.kids_empty, oq5Var7));
                    oq5Var7.p(false);
                }
                return Unit.a;
            case 7:
                shf shfVar = (shf) obj6;
                ygf ygfVar = (ygf) obj5;
                fvf fvfVar5 = (fvf) obj4;
                o0k o0kVar5 = (o0k) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                o0kVar5.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((oq5) hq5Var7).f(o0kVar5) ? 4 : 2;
                }
                oq5 oq5Var8 = (oq5) hq5Var7;
                if (!oq5Var8.P(intValue10 & 1, (intValue10 & 19) != 18)) {
                    oq5Var8.S();
                } else if (Intrinsics.d(shfVar, nhf.b)) {
                    oq5Var8.Z(1420550735);
                    oq5Var8.p(false);
                } else if (shfVar instanceof qhf) {
                    oq5Var8.Z(1985489817);
                    j66.s(((qhf) shfVar).a, ygfVar, fvfVar5, o0kVar5, oq5Var8, (intValue10 << 9) & 7168);
                    oq5Var8.p(false);
                } else {
                    if (!Intrinsics.d(shfVar, nhf.a)) {
                        throw vz1.i(oq5Var8, 1985485544, false);
                    }
                    oq5Var8.Z(1985497903);
                    fgq.n(0, oq5Var8, d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar5), 1.0f), rvf.M(R.string.downloaded_kids_empty, oq5Var8));
                    oq5Var8.p(false);
                }
                return Unit.a;
            case 8:
                thf thfVar = (thf) obj6;
                zgf zgfVar = (zgf) obj5;
                fvf fvfVar6 = (fvf) obj4;
                o0k o0kVar6 = (o0k) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                o0kVar6.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var8).f(o0kVar6) ? 4 : 2;
                }
                oq5 oq5Var9 = (oq5) hq5Var8;
                if (!oq5Var9.P(intValue11 & 1, (intValue11 & 19) != 18)) {
                    oq5Var9.S();
                } else if (Intrinsics.d(thfVar, phf.a)) {
                    oq5Var9.Z(967376784);
                    oq5Var9.p(false);
                } else if (thfVar instanceof rhf) {
                    oq5Var9.Z(-661529279);
                    up6.k(((rhf) thfVar).a, zgfVar, fvfVar6, o0kVar6, oq5Var9, (intValue11 << 9) & 7168);
                    oq5Var9.p(false);
                } else {
                    if (!Intrinsics.d(thfVar, ohf.a)) {
                        throw vz1.i(oq5Var9, -661532292, false);
                    }
                    oq5Var9.Z(-661521204);
                    wct.i(0, oq5Var9, d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar6), 1.0f), rvf.M(R.string.kids_empty, oq5Var9));
                    oq5Var9.p(false);
                }
                return Unit.a;
            case 9:
                x0h x0hVar = (x0h) obj6;
                sai saiVar = (sai) obj5;
                Function0 function0 = (Function0) obj4;
                bci bciVar = (bci) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= (intValue12 & 8) == 0 ? ((oq5) hq5Var9).f(bciVar) : ((oq5) hq5Var9).h(bciVar) ? 4 : 2;
                }
                if ((intValue12 & 19) == 18) {
                    oq5 oq5Var10 = (oq5) hq5Var9;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                jf0.a(new qzm[0], x0hVar.d, true, ild.C(1779561647, new av5(x0hVar, bciVar, saiVar, function0, 15), hq5Var9), hq5Var9, 3456, 0);
                return Unit.a;
            case 10:
                pu0 pu0Var = (pu0) obj6;
                i1h i1hVar = (i1h) obj5;
                mqs mqsVar = (mqs) obj4;
                bci bciVar2 = (bci) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bciVar2.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= (intValue13 & 8) == 0 ? ((oq5) hq5Var10).f(bciVar2) : ((oq5) hq5Var10).h(bciVar2) ? 4 : 2;
                }
                if ((intValue13 & 19) == 18) {
                    oq5 oq5Var11 = (oq5) hq5Var10;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var12 = (oq5) hq5Var10;
                tmb tmbVar = ((hai) oq5Var12.j(iai.a)).b;
                mqsVar.getClass();
                tmbVar.getClass();
                j1h j1hVar = i1hVar.a;
                boolean h2 = oq5Var12.h(mqsVar) | oq5Var12.h(j1hVar);
                Object K3 = oq5Var12.K();
                Object obj7 = K3;
                if (h2 || K3 == kjnVar) {
                    dae daeVar = new dae(i2, mqsVar, j1hVar);
                    oq5Var12.k0(daeVar);
                    obj7 = daeVar;
                }
                Function1 function1 = (Function1) obj7;
                oq5Var12.a0(419377738);
                kfu a2 = rpg.a(oq5Var12);
                if (a2 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(y1h.class), a2, null, k5r.g(y1h.class, new p97(1), function1), a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var12);
                oq5Var12.p(false);
                y1h y1hVar = (y1h) R;
                boolean f2 = oq5Var12.f(y1hVar) | oq5Var12.f(j1hVar) | oq5Var12.f(tmbVar);
                Object K4 = oq5Var12.K();
                Object obj8 = K4;
                if (f2 || K4 == kjnVar) {
                    n1h n1hVar = new n1h(y1hVar, tmbVar, (nmj) j1hVar.c.getValue());
                    oq5Var12.k0(n1hVar);
                    obj8 = n1hVar;
                }
                o5g.b(bciVar2, pu0Var, (n1h) obj8, a.a(vciVar, "lyrics_bottom_sheet"), oq5Var12, 3080 | (intValue13 & 14));
                return Unit.a;
            case 11:
                x5h x5hVar = (x5h) obj6;
                r5h r5hVar = (r5h) obj5;
                fvf fvfVar7 = (fvf) obj4;
                o0k o0kVar7 = (o0k) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                o0kVar7.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((oq5) hq5Var11).f(o0kVar7) ? 4 : 2;
                }
                oq5 oq5Var13 = (oq5) hq5Var11;
                if (!oq5Var13.P(intValue14 & 1, (intValue14 & 19) != 18)) {
                    oq5Var13.S();
                } else if (Intrinsics.d(x5hVar, v5h.a)) {
                    oq5Var13.Z(-1795231156);
                    oq5Var13.p(false);
                } else if (x5hVar instanceof w5h) {
                    oq5Var13.Z(496280355);
                    w5h w5hVar = (w5h) x5hVar;
                    t7g.b(w5hVar.a, w5hVar.b, w5hVar.c, r5hVar, fvfVar7, o0kVar7, oq5Var13, (intValue14 << 15) & 458752);
                    oq5Var13.p(false);
                } else {
                    if (!Intrinsics.d(x5hVar, u5h.a)) {
                        throw vz1.i(oq5Var13, 496277464, false);
                    }
                    oq5Var13.Z(496291280);
                    wct.i(0, oq5Var13, d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar7), 1.0f), rvf.M(R.string.kids_empty, oq5Var13));
                    oq5Var13.p(false);
                }
                return Unit.a;
            case 12:
                zti ztiVar = (zti) obj6;
                fvf fvfVar8 = (fvf) obj5;
                vti vtiVar2 = (vti) obj4;
                o0k o0kVar8 = (o0k) obj;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                o0kVar8.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((oq5) hq5Var12).f(o0kVar8) ? 4 : 2;
                }
                oq5 oq5Var14 = (oq5) hq5Var12;
                if (!oq5Var14.P(intValue15 & 1, (intValue15 & 19) != 18)) {
                    oq5Var14.S();
                } else if (Intrinsics.d(ztiVar, wti.a)) {
                    oq5Var14.Z(-144388270);
                    hag.c(0, oq5Var14, androidx.compose.foundation.layout.a.l(vciVar, o0kVar8), rvf.M(R.string.my_shelf_placeholder_title, oq5Var14));
                    oq5Var14.p(false);
                } else if (Intrinsics.d(ztiVar, xti.a)) {
                    oq5Var14.Z(-144120895);
                    dag.c(o0kVar8, null, oq5Var14, intValue15 & 14);
                    oq5Var14.p(false);
                } else {
                    if (!(ztiVar instanceof yti)) {
                        throw vz1.i(oq5Var14, -1944321794, false);
                    }
                    oq5Var14.Z(-143978264);
                    zab zabVar = ((yti) ztiVar).a;
                    boolean booleanValue = ((Boolean) szf.Q(vtiVar2.d, oq5Var14).getValue()).booleanValue();
                    boolean h3 = oq5Var14.h(vtiVar2);
                    Object K5 = oq5Var14.K();
                    if (h3 || K5 == kjnVar) {
                        vtiVar = vtiVar2;
                        K5 = new k5h(0, vtiVar, vti.class, "onRefresh", "onRefresh()V", 0, 29);
                        oq5Var14.k0(K5);
                    } else {
                        vtiVar = vtiVar2;
                    }
                    lsq.c(zabVar, fvfVar8, o0kVar8, booleanValue, (Function0) ((h9f) K5), vtiVar, oq5Var14, (intValue15 << 6) & 896);
                    oq5Var14.p(false);
                }
                return Unit.a;
            case 13:
                ArrayList arrayList = (ArrayList) obj6;
                ?? r10 = (ezc) obj5;
                ?? r15 = (ezc) obj4;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var15 = (oq5) hq5Var13;
                if (oq5Var15.P(intValue16 & 1, (intValue16 & 17) != 16)) {
                    List q0 = CollectionsKt.q0(arrayList, 4);
                    yci a3 = a.a(vciVar, "collection_non_music_albums_block");
                    Object K6 = oq5Var15.K();
                    if (K6 == kjnVar) {
                        K6 = new d6h(i3);
                        oq5Var15.k0(K6);
                    }
                    up6.i(q0, a3, (Function2) K6, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(1782954891, new jv(r10, r15), oq5Var15), oq5Var15, 432, 384, 4088);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 14:
                aqi aqiVar = (aqi) obj6;
                na0 na0Var = (na0) obj5;
                ja0 ja0Var = (ja0) obj4;
                yci yciVar2 = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar2.getClass();
                oq5 oq5Var16 = (oq5) ((hq5) obj2);
                oq5Var16.Z(1434604614);
                bxj bxjVar = bxj.a;
                aqiVar.getClass();
                Object K7 = oq5Var16.K();
                Object obj9 = K7;
                if (K7 == kjnVar) {
                    obj9 = vz1.h(oq5Var16);
                }
                uoi uoiVar2 = (uoi) obj9;
                Object K8 = oq5Var16.K();
                Object obj10 = K8;
                if (K8 == kjnVar) {
                    x6k g0 = szf.g0(Boolean.FALSE);
                    oq5Var16.k0(g0);
                    obj10 = g0;
                }
                aqi aqiVar2 = (aqi) obj10;
                Object K9 = oq5Var16.K();
                Object obj11 = K9;
                if (K9 == kjnVar) {
                    noa noaVar = new noa(uoiVar2, aqiVar2, continuation, false ? 1 : 0);
                    oq5Var16.k0(noaVar);
                    obj11 = noaVar;
                }
                gld.w(oq5Var16, uoiVar2, (Function2) obj11);
                boolean f3 = oq5Var16.f(aqiVar2) | oq5Var16.f(aqiVar);
                Object K10 = oq5Var16.K();
                Object obj12 = K10;
                if (f3 || K10 == kjnVar) {
                    ill illVar = new ill(aqiVar2, aqiVar, continuation, false ? 1 : 0);
                    oq5Var16.k0(illVar);
                    obj12 = illVar;
                }
                gld.w(oq5Var16, uoiVar2, (Function2) obj12);
                yci f4 = com.yandex.music.core.ui.compose.draggable.a.f(yciVar2, ja0Var, bxjVar, na0Var.a(), uoiVar2, null, 48);
                oq5Var16.p(false);
                return f4;
            case 15:
                gy7 gy7Var = (gy7) obj6;
                jvl jvlVar = (jvl) obj5;
                sai saiVar2 = (sai) obj4;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                int i5 = 17;
                if ((intValue17 & 17) == 16) {
                    oq5 oq5Var17 = (oq5) hq5Var14;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var18 = (oq5) hq5Var14;
                boolean h4 = oq5Var18.h(jvlVar) | oq5Var18.f(saiVar2);
                Object K11 = oq5Var18.K();
                if (h4 || K11 == kjnVar) {
                    K11 = new avi(i5, jvlVar, saiVar2);
                    oq5Var18.k0(K11);
                }
                pd.k(gy7Var, (Function1) K11, null, oq5Var18, 8);
                return Unit.a;
            case 16:
                ram ramVar = (ram) obj6;
                fvf fvfVar9 = (fvf) obj5;
                mam mamVar = (mam) obj4;
                o0k o0kVar9 = (o0k) obj;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                o0kVar9.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((oq5) hq5Var15).f(o0kVar9) ? 4 : 2;
                }
                oq5 oq5Var19 = (oq5) hq5Var15;
                if (!oq5Var19.P(intValue18 & 1, (intValue18 & 19) != 18)) {
                    oq5Var19.S();
                } else if (ramVar instanceof qam) {
                    oq5Var19.Z(-1322088970);
                    hdg.m(fvfVar9, o0kVar9, ((qam) ramVar).a, mamVar, oq5Var19, (intValue18 << 3) & 112);
                    oq5Var19.p(false);
                } else if (Intrinsics.d(ramVar, oam.a)) {
                    oq5Var19.Z(-1321797074);
                    q5g.d(o0kVar9, R.string.collection_podcasts_empty_screen, oq5Var19, intValue18 & 14);
                    oq5Var19.p(false);
                } else {
                    if (!Intrinsics.d(ramVar, pam.a)) {
                        throw vz1.i(oq5Var19, -735385768, false);
                    }
                    oq5Var19.Z(-1321552763);
                    yci c = d.c(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var19), 7), 1.0f);
                    kfh d2 = ug3.d(b2c.f, false);
                    int i6 = oq5Var19.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var19.l();
                    yci H2 = vnj.H(oq5Var19, c);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var19.d0();
                    if (oq5Var19.O) {
                        oq5Var19.k(grbVar2);
                    } else {
                        oq5Var19.n0();
                    }
                    g0g.U(oq5Var19, d2, wp5.f);
                    g0g.U(oq5Var19, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var19.O || !Intrinsics.d(oq5Var19.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var19, i6, kb5Var2);
                    }
                    g0g.U(oq5Var19, H2, wp5.d);
                    c3x.m(0, 3, 0L, oq5Var19, null);
                    oq5Var19.p(true);
                    oq5Var19.p(false);
                }
                return Unit.a;
            case 17:
                rbm rbmVar = (rbm) obj6;
                jab jabVar = (jab) obj5;
                u0s u0sVar = (u0s) obj4;
                hq5 hq5Var16 = (hq5) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var20 = (oq5) hq5Var16;
                if (oq5Var20.P(intValue19 & 1, (intValue19 & 17) != 16)) {
                    boolean h5 = oq5Var20.h(rbmVar) | oq5Var20.h(jabVar) | oq5Var20.h(u0sVar);
                    Object K12 = oq5Var20.K();
                    if (h5 || K12 == kjnVar) {
                        K12 = new eam(rbmVar, jabVar, u0sVar, true ? 1 : 0);
                        oq5Var20.k0(K12);
                    }
                    v3g.i((Function0) K12, oq5Var20, 0);
                } else {
                    oq5Var20.S();
                }
                return Unit.a;
            case 18:
                return a(obj, obj2, obj3);
            case 19:
                return d(obj, obj2, obj3);
            case 20:
                return g(obj, obj2, obj3);
            case 21:
                return h(obj, obj2, obj3);
            case 22:
                return j(obj, obj2, obj3);
            case 23:
                List list2 = (List) obj6;
                wn5 wn5Var = (wn5) obj5;
                con conVar = (con) obj4;
                pho phoVar = (pho) obj;
                hq5 hq5Var17 = (hq5) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                phoVar.getClass();
                int i7 = 0;
                for (Object obj13 : list2) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        u75.n();
                        throw null;
                    }
                    wn5Var.invoke(phoVar, pho.a(), (flv) obj13, hq5Var17, Integer.valueOf((intValue20 & 14) | 3072));
                    if (i7 != u75.g(list2)) {
                        oq5Var = (oq5) hq5Var17;
                        oq5Var.Z(-66401693);
                        p1g.o(new yov(new n38(conVar.d)), oq5Var, 0);
                    } else {
                        oq5Var = (oq5) hq5Var17;
                        oq5Var.Z(-77755009);
                    }
                    oq5Var.p(false);
                    i7 = i8;
                }
                return Unit.a;
            case 24:
                return k(obj, obj2, obj3);
            case 25:
                return l(obj, obj2, obj3);
            case 26:
                return m(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return o(obj, obj2, obj3);
            default:
                q53 q53Var = (q53) obj6;
                eqp eqpVar = (eqp) obj5;
                x8l x8lVar = (x8l) obj4;
                hq5 hq5Var18 = (hq5) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var21 = (oq5) hq5Var18;
                if (oq5Var21.P(intValue21 & 1, (intValue21 & 17) != 16)) {
                    g0g.s(q53Var, eqpVar, (yci) x8lVar.invoke(oq5Var21, 0), oq5Var21, 0);
                } else {
                    oq5Var21.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ vtb(w4k w4kVar, sdr sdrVar, wn5 wn5Var) {
        this.a = 20;
        this.b = w4kVar;
        this.d = sdrVar;
        this.c = wn5Var;
    }

    public /* synthetic */ vtb(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
