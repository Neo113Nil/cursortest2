package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.y;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.passport.internal.storage.a;
import com.yandex.passport.internal.ui.sloth.screen.e;
import com.yandex.passport.internal.ui.sloth.webcard.f;
import com.yandex.passport.internal.ui.sloth.webcard.h0;
import com.yandex.passport.internal.ui.sloth.webcard.i0;
import com.yandex.passport.sloth.data.m;
import com.yandex.plus.bdui.plus.action.o;
import com.yandex.plus.bdui.plus.scenario.g;
import com.yandex.plus.bdui.plus.scenario.h;
import com.yandex.plus.bdui.s;
import com.yandex.plus.pay.ui.core.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class mdn implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mdn(um0 um0Var, ckq ckqVar, d85 d85Var, Function0 function0) {
        this.a = 4;
        this.c = um0Var;
        this.b = ckqVar;
        this.e = d85Var;
        this.d = function0;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        m mVar = (m) this.b;
        f fVar = (f) this.c;
        final h0 h0Var = (h0) this.d;
        aqi aqiVar = (aqi) this.e;
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
        oq5 oq5Var2 = (oq5) hq5Var;
        Object j = oq5Var2.j(AndroidCompositionLocals_androidKt.b);
        Continuation continuation = null;
        Activity activity = j instanceof Activity ? (Activity) j : null;
        Window window = activity != null ? activity.getWindow() : null;
        i0 i0Var = (i0) aqiVar.getValue();
        boolean h = oq5Var2.h(window);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (h || K == kjnVar) {
            K = new a(window, aqiVar, continuation, 24);
            oq5Var2.k0(K);
        }
        gld.w(oq5Var2, i0Var, (Function2) K);
        e slothScreenComponentBuilder = fVar.getSlothScreenComponentBuilder();
        boolean h2 = oq5Var2.h(h0Var);
        Object K2 = oq5Var2.K();
        if (h2 || K2 == kjnVar) {
            final int i = 0;
            K2 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.webcard.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj4;
                            b1Var.getClass();
                            h0Var.a(new f0(b1Var));
                            break;
                        case 1:
                            com.yandex.passport.sloth.h0 h0Var2 = (com.yandex.passport.sloth.h0) obj4;
                            h0Var2.getClass();
                            h0Var.a(new d0(h0Var2));
                            break;
                        default:
                            com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj4;
                            e1Var.getClass();
                            h0Var.a(new e0(e1Var));
                            break;
                    }
                    return Unit.a;
                }
            };
            oq5Var2.k0(K2);
        }
        Function1 function1 = (Function1) K2;
        boolean h3 = oq5Var2.h(h0Var);
        Object K3 = oq5Var2.K();
        if (h3 || K3 == kjnVar) {
            final int i2 = 1;
            K3 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.webcard.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj4;
                            b1Var.getClass();
                            h0Var.a(new f0(b1Var));
                            break;
                        case 1:
                            com.yandex.passport.sloth.h0 h0Var2 = (com.yandex.passport.sloth.h0) obj4;
                            h0Var2.getClass();
                            h0Var.a(new d0(h0Var2));
                            break;
                        default:
                            com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj4;
                            e1Var.getClass();
                            h0Var.a(new e0(e1Var));
                            break;
                    }
                    return Unit.a;
                }
            };
            oq5Var2.k0(K3);
        }
        Function1 function12 = (Function1) K3;
        boolean h4 = oq5Var2.h(h0Var);
        Object K4 = oq5Var2.K();
        if (h4 || K4 == kjnVar) {
            final int i3 = 2;
            K4 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.webcard.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj4;
                            b1Var.getClass();
                            h0Var.a(new f0(b1Var));
                            break;
                        case 1:
                            com.yandex.passport.sloth.h0 h0Var2 = (com.yandex.passport.sloth.h0) obj4;
                            h0Var2.getClass();
                            h0Var.a(new d0(h0Var2));
                            break;
                        default:
                            com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj4;
                            e1Var.getClass();
                            h0Var.a(new e0(e1Var));
                            break;
                    }
                    return Unit.a;
                }
            };
            oq5Var2.k0(K4);
        }
        b.g(mVar, slothScreenComponentBuilder, function1, function12, (Function1) K4, null, oq5Var2, 0, 32);
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        com.yandex.plus.bdui.plus.query.a aVar = (com.yandex.plus.bdui.plus.query.a) this.b;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.c;
        com.yandex.plus.bdui.plus.scenario.m mVar = (com.yandex.plus.bdui.plus.scenario.m) this.d;
        Context context = (Context) this.e;
        Function0 function0 = (Function0) obj2;
        ((s) obj).getClass();
        function0.getClass();
        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
        g gVar = new g(mVar, context, 0);
        aVar.getClass();
        bVar.getClass();
        return new o(gVar, aVar, new v0(8), new f0g(8, function0), bVar, "PlusRemoteActionHandler");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v77 */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        vci vciVar;
        yci yciVar;
        ?? r6;
        boolean z3;
        int i;
        boolean z4;
        oq5 oq5Var;
        oq5 oq5Var2;
        boolean z5;
        oq5 oq5Var3;
        final int i2;
        Object obj4;
        String str;
        int i3 = this.a;
        vci vciVar2 = vci.a;
        int i4 = 16;
        Object obj5 = gq5.a;
        int i5 = 1;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.b;
        switch (i3) {
            case 0:
                ldn ldnVar = (ldn) obj9;
                um0 um0Var = (um0) obj8;
                Object obj10 = (Function0) obj7;
                d85 d85Var = (d85) obj6;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                float f = ndn.d;
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                float c = cVar.c();
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var5 = (oq5) hq5Var;
                int i6 = oq5Var5.P;
                androidx.compose.runtime.internal.a l = oq5Var5.l();
                vci vciVar3 = vci.a;
                yci H = vnj.H(hq5Var, vciVar3);
                xp5.T.getClass();
                Function0 function0 = wp5.b;
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(function0);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(hq5Var, a, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var5, i6, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                int i7 = (int) ((c - ndn.c) / ((2 * f) + (ndn.b + ndn.a)));
                Object K = oq5Var5.K();
                Object obj11 = K;
                if (K == obj5) {
                    Object q0 = CollectionsKt.q0(ldnVar.b, i7);
                    oq5Var5.k0(q0);
                    obj11 = q0;
                }
                oq5Var5.Z(2145070081);
                int i8 = 0;
                for (Object obj12 : (List) obj11) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        u75.n();
                        throw null;
                    }
                    kdn kdnVar = (kdn) obj12;
                    hq5 hq5Var2 = hq5Var;
                    vm0 b = fn0.b(i8, 0.0f, um0Var, hq5Var2, 0, 2);
                    vci vciVar4 = vciVar3;
                    yci q = androidx.compose.foundation.layout.a.q(vciVar4, 0.0f, 0.0f, 0.0f, ndn.a, 7);
                    boolean f2 = oq5Var5.f(b);
                    Object K2 = oq5Var5.K();
                    Object obj13 = K2;
                    if (f2 || K2 == obj5) {
                        Object xtbVar = new xtb(b, 26);
                        oq5Var5.k0(xtbVar);
                        obj13 = xtbVar;
                    }
                    yci s = wyf.s(q, (Function0) obj13);
                    tgo a2 = ugo.a(10);
                    q0k q0kVar = new q0k(f, f, f, f);
                    q0k q0kVar2 = bl3.a;
                    kk7 a3 = bl3.a(((dq0) ((oq5) hq5Var2).j(eq0.a)).d.c, 0L, 0L, 0L, hq5Var2, 0, 14);
                    boolean f3 = oq5Var5.f(b) | oq5Var5.f(obj10);
                    Object K3 = oq5Var5.K();
                    if (f3 || K3 == obj5) {
                        K3 = new iik(28, obj10, b);
                        oq5Var5.k0(K3);
                    }
                    xee.d((Function0) K3, s, true, null, a2, a3, q0kVar, ild.C(-1746386395, new gab(28, kdnVar, d85Var), hq5Var2), hq5Var2, 907542528, 0);
                    i8 = i9;
                    vciVar3 = vciVar4;
                    hq5Var = hq5Var2;
                }
                oq5Var5.p(false);
                oq5Var5.p(true);
                return Unit.a;
            case 1:
                pu0 pu0Var = (pu0) obj9;
                uln ulnVar = (uln) obj8;
                sai saiVar = (sai) obj7;
                mjm mjmVar = (mjm) obj6;
                bci bciVar = (bci) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((oq5) hq5Var3).f(bciVar) : ((oq5) hq5Var3).h(bciVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var6 = (oq5) hq5Var3;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                jf0.a(new qzm[0], pu0Var, false, ild.C(1136822961, new pli(ulnVar, bciVar, saiVar, pu0Var, mjmVar, 13), hq5Var3), hq5Var3, 0, 4);
                return Unit.a;
            case 2:
                pu0 pu0Var2 = (pu0) obj9;
                wln wlnVar = (wln) obj8;
                mjm mjmVar2 = (mjm) obj7;
                sai saiVar2 = (sai) obj6;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue3 & 17) == 16) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                lmn lmnVar = new lmn(((Boolean) gld.O(pu0Var2.a, hq5Var4).getValue()).booleanValue(), new kmn(ges.b(nu0.j(), 0L, v7g.z(40), null, null, 0L, 0, v7g.z(48), null, null, 0, 0, 16646141), ges.b(nu0.j(), 0L, v7g.z(40), null, null, 0L, 0, v7g.z(48), null, null, 0, 0, 16646141), nu0.j()), new jmn());
                yci e = d.e(vciVar2, ((irv.d(hq5Var4) - irv.f(hq5Var4)) - irv.e(hq5Var4)) / 2);
                oq5 oq5Var8 = (oq5) hq5Var4;
                boolean f4 = oq5Var8.f(mjmVar2) | oq5Var8.f(saiVar2);
                Object K4 = oq5Var8.K();
                if (f4 || K4 == obj5) {
                    K4 = new xum(7, mjmVar2, saiVar2);
                    oq5Var8.k0(K4);
                }
                avf.i(wlnVar, lmnVar, (Function1) K4, e, oq5Var8, 0);
                return Unit.a;
            case 3:
                umn umnVar = (umn) obj9;
                Function1 function1 = (Function1) obj8;
                yci yciVar2 = (yci) obj7;
                wln wlnVar2 = (wln) obj6;
                umn umnVar2 = (umn) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                umnVar2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var5).f(umnVar2) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var9 = (oq5) hq5Var5;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                if (umnVar2 instanceof tmn) {
                    oq5 oq5Var10 = (oq5) hq5Var5;
                    oq5Var10.Z(-2035436076);
                    boolean f5 = oq5Var10.f(function1) | ((intValue4 & 14) == 4);
                    Object K5 = oq5Var10.K();
                    if (f5 || K5 == obj5) {
                        z2 = false;
                        K5 = new imn(function1, umnVar2, null, false ? 1 : 0);
                        oq5Var10.k0(K5);
                    } else {
                        z2 = false;
                    }
                    gld.w(oq5Var10, umnVar, (Function2) K5);
                    oq5Var10.p(z2);
                } else if (umnVar2.equals(smn.a)) {
                    oq5 oq5Var11 = (oq5) hq5Var5;
                    oq5Var11.Z(-2035306806);
                    ((jmn) oq5Var11.j(jft.c)).getClass();
                    dag.h(rvf.M(R.string.recognition_listening, oq5Var11), ((tln) oq5Var11.j(jft.a)).a, yciVar2, oq5Var11, 0);
                    oq5Var11.p(false);
                } else if (umnVar2.equals(nmn.a) || umnVar2.equals(omn.a)) {
                    oq5 oq5Var12 = (oq5) hq5Var5;
                    oq5Var12.Z(-2034975385);
                    ((jmn) oq5Var12.j(jft.c)).getClass();
                    dag.h(rvf.M(R.string.recognition_connecting, oq5Var12), ((tln) oq5Var12.j(jft.a)).b, yciVar2, oq5Var12, 0);
                    oq5Var12.p(false);
                } else if (umnVar2 instanceof rmn) {
                    oq5 oq5Var13 = (oq5) hq5Var5;
                    oq5Var13.Z(-2034682156);
                    rmn rmnVar = (rmn) umnVar2;
                    hdg.h(rmnVar.a, rmnVar.b, yciVar2, oq5Var13, 0);
                    oq5Var13.p(false);
                } else {
                    if (!(umnVar2 instanceof qmn)) {
                        throw vz1.i((oq5) hq5Var5, -1866774706, false);
                    }
                    oq5 oq5Var14 = (oq5) hq5Var5;
                    oq5Var14.Z(-2034401017);
                    int ordinal = ((qmn) umnVar2).a.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            oq5Var14.Z(-2034324881);
                            boolean h = oq5Var14.h(wlnVar2);
                            Object K6 = oq5Var14.K();
                            if (h || K6 == obj5) {
                                K6 = new b6n(15, wlnVar2);
                                oq5Var14.k0(K6);
                            }
                            z = false;
                            gld.n((Function0) K6, yciVar2, oq5Var14, 0);
                            oq5Var14.p(false);
                            oq5Var14.p(z);
                        } else if (ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                            throw vz1.i(oq5Var14, -1866741157, false);
                        }
                    }
                    oq5Var14.Z(-2033775964);
                    boolean f6 = ((intValue4 & 14) == 4) | oq5Var14.f(function1);
                    Object K7 = oq5Var14.K();
                    if (f6 || K7 == obj5) {
                        K7 = new imn(function1, umnVar2, null, 1);
                        oq5Var14.k0(K7);
                    }
                    gld.w(oq5Var14, umnVar, (Function2) K7);
                    z = false;
                    oq5Var14.p(false);
                    oq5Var14.p(z);
                }
                return Unit.a;
            case 4:
                final um0 um0Var2 = (um0) obj8;
                final ckq ckqVar = (ckq) obj9;
                final d85 d85Var2 = (d85) obj6;
                Function0 function02 = (Function0) obj7;
                c cVar2 = (c) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var6).f(cVar2) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var15 = (oq5) hq5Var6;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                final vqn vqnVar = new vqn();
                vm0 a4 = fn0.a(new act(1000, (kya) null, 6), 0.0f, um0Var2, hq5Var6, 6, 2);
                int h2 = ga6.h(cVar2.b);
                String str2 = ckqVar.f;
                String str3 = ckqVar.c;
                dtq dtqVar = ckqVar.g;
                vci vciVar5 = vci.a;
                if (str2 != null) {
                    yciVar = androidx.compose.foundation.layout.a.q(vciVar5, 0.0f, 12, 0.0f, 0.0f, 13);
                    vciVar = vciVar5;
                } else {
                    vciVar = vciVar5;
                    yciVar = vciVar;
                }
                yci c2 = d.c(yciVar, 1.0f);
                oq5 oq5Var16 = (oq5) hq5Var6;
                boolean f7 = oq5Var16.f(a4);
                Object K8 = oq5Var16.K();
                Object obj14 = K8;
                if (f7 || K8 == obj5) {
                    Object a9qVar = new a9q(a4, 5);
                    oq5Var16.k0(a9qVar);
                    obj14 = a9qVar;
                }
                yci s2 = wyf.s(c2, (Function0) obj14);
                ta5 a5 = sa5.a(dtqVar.a, b2c.o, oq5Var16, 48);
                int i10 = oq5Var16.P;
                androidx.compose.runtime.internal.a l2 = oq5Var16.l();
                yci H2 = vnj.H(oq5Var16, s2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var16.d0();
                if (oq5Var16.O) {
                    oq5Var16.k(grbVar);
                } else {
                    oq5Var16.n0();
                }
                g0g.U(oq5Var16, a5, wp5.f);
                g0g.U(oq5Var16, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var16.O || !Intrinsics.d(oq5Var16.K(), Integer.valueOf(i10))) {
                    ouj.x(i10, oq5Var16, i10, kb5Var2);
                }
                g0g.U(oq5Var16, H2, wp5.d);
                final boolean equals = dtqVar.equals(atq.c);
                boolean z6 = ckqVar.a != null;
                boolean z7 = ckqVar.b != null;
                boolean z8 = ckqVar.f != null;
                boolean z9 = str3 != null;
                float c0 = ((jx7) oq5Var16.j(es5.h)).c0(h2);
                if (z6) {
                    oq5Var16.Z(1821849771);
                    c0 = (c0 - (w1g.p(nu0.e(), 0, oq5Var16, 0, 2) * 2)) - 16;
                    r6 = 0;
                } else {
                    r6 = 0;
                    oq5Var16.Z(1805902348);
                }
                oq5Var16.p(r6);
                if (z7) {
                    oq5Var16.Z(1822002105);
                    c0 = (c0 - (w1g.p(nu0.j(), r6, oq5Var16, r6, 2) * 2)) - 8;
                } else {
                    oq5Var16.Z(1805902348);
                }
                oq5Var16.p(r6);
                if (z8) {
                    c0 -= fkq.a;
                }
                if (z9) {
                    oq5Var16.Z(1822233830);
                    c0 = (c0 - (w1g.p(nu0.j(), 0, oq5Var16, 0, 2) * 3)) - (irv.h(oq5Var16) ? 40 : 24);
                    z3 = false;
                } else {
                    z3 = false;
                    oq5Var16.Z(1805902348);
                }
                oq5Var16.p(z3);
                float f8 = c0;
                boolean z10 = Float.compare(f8, fkq.b) >= 0;
                if (!z9 || equals) {
                    i = -155917557;
                    z4 = false;
                    oq5Var16.Z(-155917557);
                    oq5Var = oq5Var16;
                } else {
                    oq5Var16.Z(-149965619);
                    if (str3 != null) {
                        oq5Var16.Z(-149872836);
                        int i11 = vqnVar.a;
                        vqnVar.a = i11 + 1;
                        i = -155917557;
                        fkq.b(str3, i11, um0Var2, d85Var2, oq5Var16, 0);
                        oq5Var3 = oq5Var16;
                        z4 = false;
                    } else {
                        i = -155917557;
                        z4 = false;
                        oq5Var16.Z(-155917557);
                        oq5Var3 = oq5Var16;
                    }
                    oq5Var3.p(z4);
                    oq5Var = oq5Var3;
                }
                oq5Var.p(z4);
                u1g.l(oq5Var, d.e(vciVar, irv.h(oq5Var) ? 40 : 24));
                if (z10) {
                    oq5Var.Z(-149415679);
                    int i12 = vqnVar.a;
                    vqnVar.a = i12 + 1;
                    vm0 b2 = fn0.b(i12, 0.0f, um0Var2, oq5Var, 0, 2);
                    yci d = androidx.compose.foundation.layout.a.d(d.r(androidx.compose.foundation.layout.a.o(vciVar, equals ? 128 : 64, 0.0f, 2), f8), 1.0f);
                    boolean f9 = oq5Var.f(b2);
                    Object K9 = oq5Var.K();
                    Object obj15 = K9;
                    if (f9 || K9 == obj5) {
                        Object a9qVar2 = new a9q(b2, 6);
                        oq5Var.k0(a9qVar2);
                        obj15 = a9qVar2;
                    }
                    yci s3 = wyf.s(d, (Function0) obj15);
                    saf safVar = ckqVar.e;
                    if (safVar instanceof nn6) {
                        oq5Var.Z(1796315917);
                        nn6 nn6Var = (nn6) safVar;
                        bfg.b(nn6Var.n, nn6Var.o, nn6Var.p, s3, oq5Var, 0);
                        z5 = false;
                        oq5Var.p(false);
                        oq5Var2 = oq5Var;
                    } else {
                        if (!(safVar instanceof mn6)) {
                            throw vz1.i(oq5Var, 1796312989, false);
                        }
                        oq5Var.Z(1796326394);
                        oq5 oq5Var17 = oq5Var;
                        ocg.e(((mn6) safVar).n, new htq(etq.a), s3, null, oq5Var17, 0, 8);
                        oq5Var2 = oq5Var17;
                        z5 = false;
                        oq5Var2.p(false);
                    }
                } else {
                    oq5Var2 = oq5Var;
                    z5 = false;
                    oq5Var2.Z(i);
                }
                oq5Var2.p(z5);
                final boolean z11 = z9;
                fkq.a(ild.C(67270808, new qr(ckqVar, z8, um0Var2, function02, vqnVar), oq5Var2), ild.C(1505323673, new Function2() { // from class: dkq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj16, Object obj17) {
                        hq5 hq5Var7 = (hq5) obj16;
                        if ((((Integer) obj17).intValue() & 3) == 2) {
                            oq5 oq5Var18 = (oq5) hq5Var7;
                            if (oq5Var18.z()) {
                                oq5Var18.S();
                                return Unit.a;
                            }
                        }
                        vqn vqnVar2 = vqn.this;
                        int i13 = vqnVar2.a;
                        vqnVar2.a = i13 + 1;
                        um0 um0Var3 = um0Var2;
                        vm0 b3 = fn0.b(i13, 0.0f, um0Var3, hq5Var7, 0, 2);
                        gz2 gz2Var = b2c.o;
                        oq5 oq5Var19 = (oq5) hq5Var7;
                        boolean f10 = oq5Var19.f(b3);
                        Object K10 = oq5Var19.K();
                        if (f10 || K10 == gq5.a) {
                            K10 = new a9q(b3, 2);
                            oq5Var19.k0(K10);
                        }
                        vci vciVar6 = vci.a;
                        yci s4 = wyf.s(vciVar6, (Function0) K10);
                        ta5 a6 = sa5.a(qx0.c, gz2Var, oq5Var19, 48);
                        int i14 = oq5Var19.P;
                        androidx.compose.runtime.internal.a l3 = oq5Var19.l();
                        yci H3 = vnj.H(oq5Var19, s4);
                        xp5.T.getClass();
                        grb grbVar2 = wp5.b;
                        oq5Var19.d0();
                        if (oq5Var19.O) {
                            oq5Var19.k(grbVar2);
                        } else {
                            oq5Var19.n0();
                        }
                        g0g.U(oq5Var19, a6, wp5.f);
                        g0g.U(oq5Var19, l3, wp5.e);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var19.O || !Intrinsics.d(oq5Var19.K(), Integer.valueOf(i14))) {
                            ouj.x(i14, oq5Var19, i14, kb5Var3);
                        }
                        g0g.U(oq5Var19, H3, wp5.d);
                        ckq ckqVar2 = ckqVar;
                        String str4 = ckqVar2.a;
                        String str5 = ckqVar2.b;
                        d85 d85Var3 = d85Var2;
                        fkq.d(str4, str5, d85Var3, null, oq5Var19, 0);
                        if (z11 && equals) {
                            oq5Var19.Z(-1062852766);
                            u1g.l(oq5Var19, d.e(vciVar6, 8));
                            String str6 = ckqVar2.c;
                            if (str6 != null) {
                                oq5Var19.Z(-1062681584);
                                int i15 = vqnVar2.a;
                                vqnVar2.a = i15 + 1;
                                fkq.b(str6, i15, um0Var3, d85Var3, oq5Var19, 0);
                                oq5Var19 = oq5Var19;
                            } else {
                                oq5Var19.Z(-1071799149);
                            }
                            oq5Var19.p(false);
                        } else {
                            oq5Var19.Z(-1071799149);
                        }
                        oq5Var19.p(false);
                        oq5Var19.p(true);
                        return Unit.a;
                    }
                }, oq5Var2), null, oq5Var2, 54);
                oq5Var2.p(true);
                return Unit.a;
            case 5:
                gsu gsuVar = (gsu) obj9;
                nru nruVar = (nru) obj8;
                sai saiVar3 = (sai) obj7;
                bci bciVar2 = (bci) obj6;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue6 & 17) == 16) {
                    oq5 oq5Var18 = (oq5) hq5Var7;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        return Unit.a;
                    }
                }
                zdg.l(gsuVar, nruVar, saiVar3, bciVar2, null, hq5Var7, 4104);
                return Unit.a;
            case 6:
                xsq xsqVar = (xsq) obj9;
                hvq hvqVar = (hvq) obj8;
                zsq zsqVar = (zsq) obj6;
                Function0 function03 = (Function0) obj7;
                um0 um0Var3 = (um0) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                um0Var3.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var8).d(um0Var3.ordinal()) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var19 = (oq5) hq5Var8;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                psq psqVar = (psq) xsqVar;
                fkq.c(psqVar.g, hvqVar, um0Var3, psqVar.j, null, zsqVar, function03, hq5Var8, (intValue7 << 6) & 896, 16);
                return Unit.a;
            case 7:
                sdr sdrVar = (sdr) obj9;
                x3h x3hVar = (x3h) obj8;
                z2h z2hVar = (z2h) obj7;
                b2h b2hVar = (b2h) obj6;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue8 & 17) == 16) {
                    oq5 oq5Var20 = (oq5) hq5Var9;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                u7g.t(sdrVar, ((w3h) CollectionsKt.Q(x3hVar.a)).a, z2hVar, b2hVar.a.a(hq5Var9), null, hq5Var9, 0);
                return Unit.a;
            case 8:
                g5t g5tVar = (g5t) obj9;
                g5t g5tVar2 = (g5t) obj8;
                sai saiVar4 = (sai) obj7;
                fvf fvfVar = (fvf) obj6;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var21 = (oq5) hq5Var10;
                if (oq5Var21.P(intValue9 & 1, (intValue9 & 17) != 16)) {
                    y parentFragmentManager = g5tVar2.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    g5tVar.x(parentFragmentManager, saiVar4, (e6t) g5tVar.h.getValue(), ((hai) oq5Var21.j(iai.a)).b, fvfVar, oq5Var21, 4096);
                } else {
                    oq5Var21.S();
                }
                return Unit.a;
            case 9:
                Continuation continuation = null;
                njt njtVar = (njt) obj9;
                tmb tmbVar = (tmb) obj8;
                o0k o0kVar = (o0k) obj7;
                wn5 wn5Var = (wn5) obj6;
                sjt sjtVar = (sjt) obj;
                hq5 hq5Var11 = (hq5) obj2;
                ((Integer) obj3).getClass();
                sjtVar.getClass();
                if (sjtVar instanceof rjt) {
                    oq5 oq5Var22 = (oq5) hq5Var11;
                    oq5Var22.Z(1871076960);
                    Unit unit = Unit.a;
                    boolean h3 = oq5Var22.h(njtVar);
                    Object K10 = oq5Var22.K();
                    if (h3 || K10 == obj5) {
                        K10 = new pjt(njtVar, continuation, 0);
                        oq5Var22.k0(K10);
                    }
                    gld.w(oq5Var22, unit, (Function2) K10);
                    boolean h4 = oq5Var22.h(njtVar);
                    Object K11 = oq5Var22.K();
                    if (h4 || K11 == obj5) {
                        K11 = new r3s(11, njtVar);
                        oq5Var22.k0(K11);
                    }
                    rvf.j((Function1) K11, tmbVar, d.x(bfg.Q(androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.a.l(d.c(vciVar2, 1.0f), o0kVar), ghh.C(zs4.g(oq5Var22), ogp.A(oq5Var22))), bfg.C(oq5Var22), false, 14), b2c.f, 2), 0, false, null, oq5Var22, 64, 56);
                    oq5Var22.p(false);
                } else {
                    if (!(sjtVar instanceof qjt)) {
                        throw vz1.i((oq5) hq5Var11, 891639393, false);
                    }
                    oq5 oq5Var23 = (oq5) hq5Var11;
                    oq5Var23.Z(1871790456);
                    fjt fjtVar = ((qjt) sjtVar).b;
                    Class<?> cls = fjtVar.getClass();
                    boolean h5 = oq5Var23.h(sjtVar) | oq5Var23.h(njtVar);
                    Object K12 = oq5Var23.K();
                    if (h5 || K12 == obj5) {
                        K12 = new n6p(sjtVar, njtVar, null, i4);
                        oq5Var23.k0(K12);
                    }
                    gld.w(oq5Var23, cls, (Function2) K12);
                    wn5Var.invoke(o0kVar, fjtVar, oq5Var23, 0);
                    oq5Var23.p(false);
                }
                return Unit.a;
            case 10:
                r4v r4vVar = (r4v) obj9;
                b7v b7vVar = (b7v) obj8;
                Function0 function04 = (Function0) obj7;
                Function0 function05 = (Function0) obj6;
                c cVar3 = (c) obj;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((oq5) hq5Var12).f(cVar3) ? 4 : 2;
                }
                if ((intValue10 & 19) == 18) {
                    oq5 oq5Var24 = (oq5) hq5Var12;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        return Unit.a;
                    }
                }
                aqi O = gld.O((vdr) r4vVar.e.getValue(), hq5Var12);
                aqi M = gld.M((vdr) r4vVar.f.getValue(), hq5Var12);
                O.getClass();
                fav favVar = (fav) O.getValue();
                favVar.getClass();
                oq5 oq5Var25 = (oq5) hq5Var12;
                Object K13 = oq5Var25.K();
                Object obj16 = K13;
                if (K13 == obj5) {
                    obj16 = tlm.f(gld.R(kotlin.coroutines.g.a, oq5Var25), oq5Var25);
                }
                mm6 mm6Var = ((fs5) obj16).a;
                Object K14 = oq5Var25.K();
                Object obj17 = K14;
                if (K14 == obj5) {
                    Object a6 = vq2.a(favVar.a ? 1.0f : 0.0f);
                    oq5Var25.k0(a6);
                    obj17 = a6;
                }
                fk0 fk0Var = (fk0) obj17;
                Object K15 = oq5Var25.K();
                Object obj18 = K15;
                if (K15 == obj5) {
                    Object t9vVar = new t9v(mm6Var, fk0Var);
                    oq5Var25.k0(t9vVar);
                    obj18 = t9vVar;
                }
                t9v t9vVar2 = (t9v) obj18;
                fav favVar2 = (fav) O.getValue();
                favVar2.getClass();
                Object K16 = oq5Var25.K();
                Object obj19 = K16;
                if (K16 == obj5) {
                    obj19 = tlm.f(gld.R(kotlin.coroutines.g.a, oq5Var25), oq5Var25);
                }
                mm6 mm6Var2 = ((fs5) obj19).a;
                Object K17 = oq5Var25.K();
                Object obj20 = K17;
                if (K17 == obj5) {
                    eav eavVar = favVar2 instanceof eav ? (eav) favVar2 : null;
                    Object g0 = szf.g0(Boolean.valueOf(eavVar != null ? eavVar.b.a.j : false));
                    oq5Var25.k0(g0);
                    obj20 = g0;
                }
                aqi aqiVar = (aqi) obj20;
                boolean f10 = oq5Var25.f(mm6Var2);
                Object K18 = oq5Var25.K();
                Object obj21 = K18;
                if (f10 || K18 == obj5) {
                    Object d9vVar = new d9v(mm6Var2, aqiVar);
                    oq5Var25.k0(d9vVar);
                    obj21 = d9vVar;
                }
                d9v d9vVar2 = (d9v) obj21;
                Object K19 = oq5Var25.K();
                Object obj22 = K19;
                if (K19 == obj5) {
                    Object g02 = szf.g0(Boolean.valueOf(((fav) O.getValue()).a));
                    oq5Var25.k0(g02);
                    obj22 = g02;
                }
                aqi aqiVar2 = (aqi) obj22;
                Object K20 = oq5Var25.K();
                Object obj23 = K20;
                if (K20 == obj5) {
                    Object g03 = szf.g0(null);
                    oq5Var25.k0(g03);
                    obj23 = g03;
                }
                aqi aqiVar3 = (aqi) obj23;
                Object K21 = oq5Var25.K();
                Object obj24 = K21;
                if (K21 == obj5) {
                    Object h9vVar = new h9v(aqiVar3, aqiVar2, d9vVar2, t9vVar2);
                    oq5Var25.k0(h9vVar);
                    obj24 = h9vVar;
                }
                final h9v h9vVar2 = (h9v) obj24;
                tqn tqnVar = new tqn();
                tqnVar.a = true;
                boolean f11 = oq5Var25.f(O) | oq5Var25.f(M);
                Object K22 = oq5Var25.K();
                Object obj25 = K22;
                if (f11 || K22 == obj5) {
                    Object otuVar = new otu(O, M);
                    oq5Var25.k0(otuVar);
                    obj25 = otuVar;
                }
                Function0 function06 = (Function0) obj25;
                boolean f12 = oq5Var25.f(O) | oq5Var25.h(r4vVar);
                Object K23 = oq5Var25.K();
                Object obj26 = K23;
                if (f12 || K23 == obj5) {
                    Object xesVar = new xes(29, O, r4vVar);
                    oq5Var25.k0(xesVar);
                    obj26 = xesVar;
                }
                Function0 function07 = (Function0) obj26;
                function06.getClass();
                function07.getClass();
                yci r = vnj.r(vciVar2, "com.yandex.music.core.ui.compose.clickableIf", new Object[0], new gja(function07, function06, 2));
                boolean booleanValue = ((Boolean) M.getValue()).booleanValue();
                boolean f13 = oq5Var25.f(h9vVar2);
                Object K24 = oq5Var25.K();
                if (f13 || K24 == obj5) {
                    i2 = 0;
                    Object obj27 = new Function0() { // from class: y9v
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    float floatValue = ((Number) h9vVar2.d.b.e()).floatValue();
                                    return new zrq(yhn.c((0.76f * floatValue) + 0.24f, 0.0f, 1.0f), yhn.c((0.5f * floatValue) + 0.5f, 0.0f, 1.0f), yhn.c((0.6f * floatValue) + 0.4f, 0.0f, 1.0f));
                                default:
                                    return androidx.compose.ui.graphics.a.a(vci.a, new q0v(2, h9vVar2));
                            }
                        }
                    };
                    oq5Var25.k0(obj27);
                    obj4 = obj27;
                } else {
                    i2 = 0;
                    obj4 = K24;
                }
                Function0 function08 = (Function0) obj4;
                z9v z9vVar = new z9v(h9vVar2, i2);
                final int i13 = 1;
                z9v z9vVar2 = new z9v(h9vVar2, 1);
                boolean f14 = oq5Var25.f(h9vVar2);
                Object K25 = oq5Var25.K();
                Object obj28 = K25;
                if (f14 || K25 == obj5) {
                    Object obj29 = new Function0() { // from class: y9v
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    float floatValue = ((Number) h9vVar2.d.b.e()).floatValue();
                                    return new zrq(yhn.c((0.76f * floatValue) + 0.24f, 0.0f, 1.0f), yhn.c((0.5f * floatValue) + 0.5f, 0.0f, 1.0f), yhn.c((0.6f * floatValue) + 0.4f, 0.0f, 1.0f));
                                default:
                                    return androidx.compose.ui.graphics.a.a(vci.a, new q0v(2, h9vVar2));
                            }
                        }
                    };
                    oq5Var25.k0(obj29);
                    obj28 = obj29;
                }
                hyf.n(cVar3, b7vVar, function08, z9vVar, z9vVar2, r, (Function0) obj28, booleanValue, ild.C(-305814652, new ntb(tqnVar, O, h9vVar2, function04, b7vVar, function05, r4vVar, 5), oq5Var25), oq5Var25, (intValue10 & 14) | 100663296);
                return Unit.a;
            case 11:
                kes kesVar = (kes) obj8;
                plv plvVar = (plv) obj7;
                jzb jzbVar = (jzb) obj6;
                hq5 hq5Var13 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((pho) obj).getClass();
                o2g.n((String) obj9, pho.a(), kesVar, plvVar, hq5Var13, 0, 0);
                oq5 oq5Var26 = (oq5) hq5Var13;
                if (jzbVar != null) {
                    oq5Var26.Z(529492885);
                    int ordinal2 = jzbVar.ordinal();
                    if (ordinal2 == 0) {
                        str = "🄴";
                    } else if (ordinal2 == 1) {
                        str = "⑱";
                    } else {
                        if (ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        str = "ⓘ";
                    }
                    o2g.n("  ".concat(str), null, kesVar, plvVar, oq5Var26, 0, 2);
                } else {
                    oq5Var26.Z(528152414);
                }
                oq5Var26.p(false);
                return Unit.a;
            case 12:
                return a(obj, obj2, obj3);
            case 13:
                ((s) obj).getClass();
                ((Function0) obj2).getClass();
                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                return new com.yandex.plus.bdui.plus.action.e((j) obj9, (com.yandex.plus.bdui.plus.auth.a) obj8, (tf6) obj7, (com.yandex.plus.log.api.b) obj6);
            case 14:
                ((s) obj).getClass();
                ((Function0) obj2).getClass();
                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                return new com.yandex.plus.bdui.plus.action.e((com.yandex.plus.home.internal.di.y) obj9, (com.yandex.plus.pay.ui.core.api.domain.a) obj8, (tf6) obj7, (com.yandex.plus.log.api.b) obj6);
            case 15:
                return d(obj, obj2, obj3);
            default:
                Function0 function09 = (Function0) obj2;
                ((s) obj).getClass();
                function09.getClass();
                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                return new com.yandex.plus.bdui.plus.action.e((com.yandex.plus.bdui.plus.scenario.e) obj9, new h((com.yandex.plus.bdui.plus.scenario.m) obj7, (com.yandex.plus.bdui.plus.scenario.e) obj6, i5), function09, (com.yandex.plus.log.api.b) obj8);
        }
    }

    public /* synthetic */ mdn(xsq xsqVar, hvq hvqVar, zsq zsqVar, Function0 function0) {
        this.a = 6;
        this.b = xsqVar;
        this.c = hvqVar;
        this.e = zsqVar;
        this.d = function0;
    }

    public /* synthetic */ mdn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
