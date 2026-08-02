package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.t;
import com.yandex.music.core.ui.compose.b;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.bdui.action.h;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.plus.content.controller.e;
import com.yandex.plus.bdui.plus.content.i;
import com.yandex.plus.bdui.plus.content.serializer.t0;
import com.yandex.plus.bdui.plus.shared.f;
import com.yandex.plus.divkit.impl.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class fb1 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fb1(xdr xdrVar, Function1 function1, t tVar) {
        this.a = 7;
        this.b = xdrVar;
        this.c = (ezc) function1;
        this.d = tVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        muv muvVar = (muv) this.b;
        nvv nvvVar = (nvv) this.c;
        rmb rmbVar = (rmb) this.d;
        hq5 hq5Var = (hq5) obj3;
        int d = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(d & 1, (d & 129) != 128)) {
            vci vciVar = vci.a;
            yci a = a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 16, 5), "modal_bottom_sheet_wave_wizard_entry_point");
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new cvv(muvVar, nvvVar, rmbVar);
                oq5Var.k0(K);
            }
            gdg.p((cvv) K, a.a(vciVar, "wizard_entry_point_block"), false, oq5Var, 48, 4);
            WeakHashMap weakHashMap = rqv.w;
            u1g.l(oq5Var, s7g.F(z7l.h(oq5Var).e));
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        oq5 oq5Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.a;
        int i7 = 2;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i6) {
            case 0:
                lb1 lb1Var = (lb1) obj7;
                fvf fvfVar = (fvf) obj6;
                u6k u6kVar = (u6k) obj5;
                ((Integer) obj2).getClass();
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 129) != 128)) {
                    Object K = oq5Var2.K();
                    if (K == kjnVar) {
                        K = szf.U(new hb(16, fvfVar, u6kVar));
                        oq5Var2.k0(K);
                    }
                    sdr sdrVar = (sdr) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        K2 = new aq(u6kVar, r12);
                        oq5Var2.k0(K2);
                    }
                    c3x.a(384, oq5Var2, androidx.compose.ui.layout.a.d(vciVar, (Function1) K2), lb1Var.getTitle(), ((Boolean) sdrVar.getValue()).booleanValue());
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 1:
                ao1 ao1Var = (ao1) obj7;
                List list = (List) obj6;
                Function1 function1 = (Function1) obj5;
                sai saiVar = (sai) obj2;
                hq5 hq5Var2 = (hq5) obj3;
                int d = eta.d((Integer) obj4, (ua5) obj, saiVar);
                if ((d & 48) == 0) {
                    d |= ((oq5) hq5Var2).f(saiVar) ? 32 : 16;
                }
                if ((d & 145) == 144) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                if (ao1Var == null) {
                    ao1.a.getClass();
                    ao1Var = ao1.b;
                }
                int ordinal = ao1Var.ordinal();
                if (ordinal == 0) {
                    z = 0;
                    oq5Var = (oq5) hq5Var2;
                    i = R.string.artists;
                    i2 = 1056410254;
                } else {
                    if (ordinal != 1) {
                        throw vz1.i((oq5) hq5Var2, 1056407458, false);
                    }
                    oq5Var = (oq5) hq5Var2;
                    i = R.string.narrators;
                    i2 = 1056412784;
                    z = 0;
                }
                String n = vz1.n(oq5Var, i2, i, oq5Var, z);
                oq5 oq5Var4 = (oq5) hq5Var2;
                int i8 = (oq5Var4.f(function1) ? 1 : 0) | ((d & 112) != 32 ? z : 1);
                Object K3 = oq5Var4.K();
                if (i8 != 0 || K3 == kjnVar) {
                    K3 = new kc(17, saiVar, function1);
                    oq5Var4.k0(K3);
                }
                xv.d(n, list, (Function1) K3, a.a(vciVar, "artist_list_bottom_sheet_dialog"), oq5Var4, 3072);
                return Unit.a;
            case 2:
                m71 m71Var = (m71) obj7;
                u51 u51Var = (u51) obj6;
                m71 m71Var2 = (m71) obj5;
                sai saiVar2 = (sai) obj;
                bci bciVar = (bci) obj2;
                hq5 hq5Var3 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                saiVar2.getClass();
                bciVar.getClass();
                if ((intValue2 & 6) == 0) {
                    i3 = (((oq5) hq5Var3).f(saiVar2) ? 4 : 2) | intValue2;
                } else {
                    i3 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i3 |= (intValue2 & 64) == 0 ? ((oq5) hq5Var3).f(bciVar) : ((oq5) hq5Var3).h(bciVar) ? 32 : 16;
                }
                if ((i3 & 147) == 146) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                rbi.b(null, bciVar, m71Var, d85.m, 0L, null, 0, false, ild.C(1353650765, new xk(12, u51Var, m71Var2, saiVar2), hq5Var3), hq5Var3, 102239296 | (i3 & 112), 177);
                return Unit.a;
            case 3:
                lvf lvfVar = (lvf) obj7;
                final Function2 function2 = (Function2) obj6;
                final Function2 function22 = (Function2) obj5;
                final int intValue3 = ((Integer) obj2).intValue();
                hq5 hq5Var4 = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((oq5) hq5Var4).d(intValue3) ? 32 : 16;
                }
                oq5 oq5Var6 = (oq5) hq5Var4;
                if (oq5Var6.P(intValue4 & 1, (intValue4 & 145) != 144)) {
                    lk1 lk1Var = (lk1) lvfVar.c(intValue3);
                    if (lk1Var == null) {
                        return Unit.a;
                    }
                    yci a = a.a(vciVar, "artist_track");
                    po6 po6Var = lk1Var.a;
                    mqs mqsVar = lk1Var.b;
                    int i9 = intValue4 & 112;
                    boolean f = oq5Var6.f(function2) | (i9 == 32);
                    Object K4 = oq5Var6.K();
                    if (f || K4 == kjnVar) {
                        final int i10 = 0;
                        K4 = new Function1() { // from class: tl1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                mqs mqsVar2 = (mqs) obj8;
                                switch (i10) {
                                    case 0:
                                        mqsVar2.getClass();
                                        function2.invoke(mqsVar2, Integer.valueOf(intValue3));
                                        break;
                                    default:
                                        mqsVar2.getClass();
                                        function2.invoke(mqsVar2, Integer.valueOf(intValue3));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var6.k0(K4);
                    }
                    Function1 function12 = (Function1) K4;
                    boolean f2 = oq5Var6.f(function22) | (i9 == 32);
                    Object K5 = oq5Var6.K();
                    if (f2 || K5 == kjnVar) {
                        K5 = new Function1() { // from class: tl1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                mqs mqsVar2 = (mqs) obj8;
                                switch (r2) {
                                    case 0:
                                        mqsVar2.getClass();
                                        function22.invoke(mqsVar2, Integer.valueOf(intValue3));
                                        break;
                                    default:
                                        mqsVar2.getClass();
                                        function22.invoke(mqsVar2, Integer.valueOf(intValue3));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var6.k0(K5);
                    }
                    Function1 function13 = (Function1) K5;
                    Object K6 = oq5Var6.K();
                    if (K6 == kjnVar) {
                        K6 = new j3(20);
                        oq5Var6.k0(K6);
                    }
                    vut.i(po6Var, up6.I(mqsVar, function12, function13, (Function2) K6, oq5Var6), a, oq5Var6, 384);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 4:
                int intValue5 = ((Integer) obj).intValue();
                oq oqVar = (oq) obj2;
                String str = (String) obj3;
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                oqVar.getClass();
                str.getClass();
                ((va3) obj7).b((nab) obj6, c3x.x(oqVar, intValue5), (u0s) obj5, str, booleanValue);
                return Unit.a;
            case 5:
                lv5 lv5Var = (lv5) obj7;
                fp7 fp7Var = (fp7) obj6;
                hs1 hs1Var = (hs1) obj5;
                int intValue6 = ((Integer) obj2).intValue();
                hq5 hq5Var5 = (hq5) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((b3k) obj).getClass();
                yci a2 = a.a(d.d(vciVar, 1.0f), "gallery_item_" + intValue6);
                kfh d2 = ug3.d(b2c.f, false);
                oq5 oq5Var7 = (oq5) hq5Var5;
                int i11 = oq5Var7.P;
                androidx.compose.runtime.internal.a l = oq5Var7.l();
                yci H = vnj.H(hq5Var5, a2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var7.d0();
                if (oq5Var7.O) {
                    oq5Var7.k(grbVar);
                } else {
                    oq5Var7.n0();
                }
                g0g.U(hq5Var5, d2, wp5.f);
                g0g.U(hq5Var5, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var7.O || !Intrinsics.d(oq5Var7.K(), Integer.valueOf(i11))) {
                    ouj.x(i11, oq5Var7, i11, kb5Var);
                }
                g0g.U(hq5Var5, H, wp5.d);
                zu5 zu5Var = (zu5) lv5Var.e.get(intValue6);
                if (((Boolean) oq5Var7.j(koe.a)).booleanValue()) {
                    oq5Var7.Z(-564540427);
                    i4w.m(zu5Var, intValue6, hq5Var5, intValue7 & 112);
                    oq5Var7.p(false);
                } else {
                    int i12 = 0;
                    oq5Var7.Z(-564347948);
                    Object K7 = oq5Var7.K();
                    if (K7 == kjnVar) {
                        K7 = szf.U(new bv5(fp7Var, intValue6, i12));
                        oq5Var7.k0(K7);
                    }
                    sdr sdrVar2 = (sdr) K7;
                    oq5Var7.Z(-564027160);
                    oq5Var7.p(false);
                    Boolean bool = (Boolean) sdrVar2.getValue();
                    bool.booleanValue();
                    fuw fuwVar = null;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean f3 = oq5Var7.f(null);
                    Object K8 = oq5Var7.K();
                    if (f3 || K8 == kjnVar) {
                        K8 = new gv5(z3 ? 1 : 0, sdrVar2, z2 ? 1 : 0, 0);
                        oq5Var7.k0(K8);
                    }
                    gld.w(hq5Var5, bool, (Function2) K8);
                    Integer valueOf = Integer.valueOf(fp7Var.q());
                    boolean f4 = oq5Var7.f(fp7Var) | ((((intValue7 & 112) ^ 48) > 32 && oq5Var7.d(intValue6)) || (intValue7 & 48) == 32) | oq5Var7.f(null);
                    Object K9 = oq5Var7.K();
                    if (f4 || K9 == kjnVar) {
                        hv5 hv5Var = new hv5(fp7Var, intValue6, fuwVar, z4 ? 1 : 0, 0);
                        oq5Var7.k0(hv5Var);
                        K9 = hv5Var;
                    }
                    gld.w(hq5Var5, valueOf, (Function2) K9);
                    i4w.f(zu5Var, hs1Var, null, null, hq5Var5, 0);
                    oq5Var7.p(false);
                }
                oq5Var7.p(true);
                return Unit.a;
            case 6:
                s1b s1bVar = (s1b) obj7;
                r1b r1bVar = (r1b) obj6;
                ynn ynnVar = (ynn) obj5;
                int intValue8 = ((Integer) obj).intValue();
                p1b p1bVar = (p1b) obj2;
                hq5 hq5Var6 = (hq5) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                p1bVar.getClass();
                int i13 = (intValue9 & 6) == 0 ? (((oq5) hq5Var6).d(intValue8) ? 4 : 2) | intValue9 : intValue9;
                if ((intValue9 & 48) == 0) {
                    i13 |= (intValue9 & 64) == 0 ? ((oq5) hq5Var6).f(p1bVar) : ((oq5) hq5Var6).h(p1bVar) ? 32 : 16;
                }
                if ((i13 & 147) == 146) {
                    oq5 oq5Var8 = (oq5) hq5Var6;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var9 = (oq5) hq5Var6;
                int i14 = (oq5Var9.h(s1bVar) ? 1 : 0) | (((i13 & 112) == 32 || ((i13 & 64) != 0 && oq5Var9.h(p1bVar))) ? 1 : 0) | ((i13 & 14) != 4 ? 0 : 1);
                Object K10 = oq5Var9.K();
                if (i14 != 0 || K10 == kjnVar) {
                    K10 = new gva(s1bVar, p1bVar, intValue8, 2);
                    oq5Var9.k0(K10);
                }
                quj.m(p1bVar, s1bVar, r1bVar, intValue8, b.b(a.a(com.yandex.music.core.ui.compose.a.b(vci.a, ynnVar, 0L, 0.0f, null, (Function2) K10, 14), "editorial_wave_agents_block_item"), intValue8), oq5Var9, ((i13 >> 3) & 14) | 8 | ((i13 << 9) & 7168));
                return Unit.a;
            case 7:
                vdr vdrVar = (vdr) obj7;
                ?? r15 = (ezc) obj6;
                t tVar = (t) obj5;
                sai saiVar3 = (sai) obj2;
                hq5 hq5Var7 = (hq5) obj3;
                int d3 = eta.d((Integer) obj4, (ua5) obj, saiVar3);
                if ((d3 & 48) == 0) {
                    d3 |= ((oq5) hq5Var7).f(saiVar3) ? 32 : 16;
                }
                oq5 oq5Var10 = (oq5) hq5Var7;
                if (oq5Var10.P(d3 & 1, (d3 & 145) != 144)) {
                    Iterable<vbc> iterable = (Iterable) gld.M(vdrVar, oq5Var10).getValue();
                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                    for (vbc vbcVar : iterable) {
                        if (vbcVar instanceof kbc) {
                            i4 = R.string.sort_by_alphabet;
                        } else if (vbcVar instanceof nbc) {
                            i4 = R.string.sort_by_date;
                        } else if (vbcVar instanceof pbc) {
                            i4 = R.string.sort_by_downloaded_date;
                        } else if (vbcVar instanceof lbc) {
                            i4 = R.string.sort_by_artist;
                        } else if (vbcVar instanceof tbc) {
                            i4 = R.string.sort_by_release_date;
                        } else if (vbcVar instanceof sbc) {
                            i4 = R.string.sort_by_recently_updated;
                        } else if (vbcVar instanceof rbc) {
                            i4 = R.string.sort_by_podcast;
                        } else if (vbcVar instanceof mbc) {
                            i4 = R.string.sort_by_creation_date;
                        } else if (vbcVar instanceof ubc) {
                            i4 = R.string.sort_by_songs;
                        } else if (vbcVar instanceof qbc) {
                            i4 = R.string.sort_by_episodes;
                        } else {
                            if (!(vbcVar instanceof obc)) {
                                b6e.s();
                                return null;
                            }
                            i4 = R.string.sort_by_default;
                        }
                        String string = tVar.getString(i4);
                        string.getClass();
                        arrayList.add(new hdp(vbcVar, string, vbcVar.a(), vbcVar.b()));
                    }
                    r12 = (d3 & 112) != 32 ? 0 : 1;
                    Object K11 = oq5Var10.K();
                    if (r12 != 0 || K11 == kjnVar) {
                        K11 = new ceb(0, saiVar3, sai.class, "hide", "hide()V", 0, 24);
                        oq5Var10.k0(K11);
                    }
                    q6k.g(arrayList, r15, (Function0) ((h9f) K11), oq5Var10, 0);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 8:
                List list2 = (List) obj7;
                String str2 = (String) obj6;
                Function2 function23 = (Function2) obj5;
                int intValue10 = ((Integer) obj).intValue();
                m0s m0sVar = (m0s) obj2;
                hq5 hq5Var8 = (hq5) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                m0sVar.getClass();
                int i15 = (intValue11 & 6) == 0 ? (((oq5) hq5Var8).d(intValue10) ? 4 : 2) | intValue11 : intValue11;
                if ((intValue11 & 48) == 0) {
                    i15 |= ((oq5) hq5Var8).f(m0sVar) ? 32 : 16;
                }
                oq5 oq5Var11 = (oq5) hq5Var8;
                if (oq5Var11.P(i15 & 1, (i15 & 147) != 146)) {
                    boolean contains = list2.contains(m0sVar.getId());
                    float f5 = 40;
                    yci b = androidx.compose.foundation.a.b(xp3.u(d.e(vciVar, f5), ugo.a(f5)), d85.m, vnj.i);
                    boolean g = oq5Var11.g(contains) | oq5Var11.f(str2);
                    Object K12 = oq5Var11.K();
                    if (g || K12 == kjnVar) {
                        K12 = new ag3(contains, str2, r12);
                        oq5Var11.k0(K12);
                    }
                    yci b2 = nfp.b(b, false, (Function1) K12);
                    boolean f6 = oq5Var11.f(function23) | ((i15 & 14) == 4) | ((i15 & 112) == 32);
                    Object K13 = oq5Var11.K();
                    if (f6 || K13 == kjnVar) {
                        K13 = new de(function23, intValue10, m0sVar, 25);
                        oq5Var11.k0(K13);
                    }
                    f1s.b(false, (Function0) K13, b2, false, ild.C(-426274687, new xf3(contains, m0sVar, r12), oq5Var11), 0L, 0L, oq5Var11, 24582);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 9:
                ArrayList<hoi> arrayList2 = (ArrayList) obj7;
                Function1 function14 = (Function1) obj6;
                t tVar2 = (t) obj5;
                sai saiVar4 = (sai) obj2;
                hq5 hq5Var9 = (hq5) obj3;
                int d4 = eta.d((Integer) obj4, (ua5) obj, saiVar4);
                if ((d4 & 48) == 0) {
                    d4 |= ((oq5) hq5Var9).f(saiVar4) ? 32 : 16;
                }
                if ((d4 & 145) == 144) {
                    oq5 oq5Var12 = (oq5) hq5Var9;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                String M = rvf.M(R.string.sort, hq5Var9);
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                for (hoi hoiVar : arrayList2) {
                    hoiVar.getClass();
                    tVar2.getClass();
                    String str3 = hoiVar.a;
                    itr itrVar = hoiVar.d;
                    if (str3 == null) {
                        int ordinal2 = itrVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 == i7) {
                                    i5 = R.string.track_order_old_first;
                                } else if (ordinal2 != 3) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            i5 = R.string.tag_sort_by_new;
                        } else {
                            i5 = R.string.tag_sort_by_popular;
                        }
                        str3 = tVar2.getString(i5);
                        str3.getClass();
                    }
                    arrayList3.add(new hdp(hoiVar, str3, itrVar.a, hoiVar.c));
                    i7 = 2;
                }
                r12 = (d4 & 112) != 32 ? 0 : 1;
                oq5 oq5Var13 = (oq5) hq5Var9;
                Object K14 = oq5Var13.K();
                if (r12 != 0 || K14 == kjnVar) {
                    K14 = new k5h(0, saiVar4, sai.class, "hide", "hide()V", 0, 18);
                    oq5Var13.k0(K14);
                }
                hag.f(arrayList3, M, function14, (Function0) ((h9f) K14), a.a(vciVar, "music_sort_bottom_sheet"), oq5Var13, 24576, 0);
                return Unit.a;
            case 10:
                orj orjVar = (orj) obj6;
                o3k o3kVar = (o3k) obj5;
                Integer num = (Integer) obj2;
                int intValue12 = num.intValue();
                int intValue13 = ((Integer) obj4).intValue();
                ((b3k) obj).getClass();
                tyc tycVar = (tyc) ((List) obj7).get(intValue12);
                oq5 oq5Var14 = (oq5) ((hq5) obj3);
                boolean h = oq5Var14.h(orjVar);
                if ((((intValue13 & 112) ^ 48) <= 32 || !oq5Var14.d(intValue12)) && (intValue13 & 48) != 32) {
                    r12 = 0;
                }
                int i16 = (h ? 1 : 0) | r12;
                Object K15 = oq5Var14.K();
                if (i16 != 0 || K15 == kjnVar) {
                    K15 = new i4(orjVar, intValue12, 17);
                    oq5Var14.k0(K15);
                }
                tycVar.invoke(num, com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K15, 15), o3kVar, oq5Var14, Integer.valueOf((intValue13 >> 3) & 14));
                return Unit.a;
            case 11:
                int intValue14 = ((Integer) obj).intValue();
                oq oqVar2 = (oq) obj2;
                String str4 = (String) obj3;
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                oqVar2.getClass();
                str4.getClass();
                rbm.b((rbm) obj7, str4, booleanValue2, (nab) obj6, c3x.x(oqVar2, intValue14), (u0s) obj5);
                return Unit.a;
            case 12:
                Function2 function24 = (Function2) obj7;
                Function2 function25 = (Function2) obj6;
                Function2 function26 = (Function2) obj5;
                Integer num2 = (Integer) obj;
                int intValue15 = num2.intValue();
                f9j f9jVar = (f9j) obj2;
                hq5 hq5Var10 = (hq5) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                f9jVar.getClass();
                oq oqVar3 = f9jVar.b;
                int i17 = (intValue16 & 6) == 0 ? intValue16 | (((oq5) hq5Var10).d(intValue15) ? 4 : 2) : intValue16;
                if ((intValue16 & 48) == 0) {
                    i17 |= (intValue16 & 64) == 0 ? ((oq5) hq5Var10).f(f9jVar) : ((oq5) hq5Var10).h(f9jVar) ? 32 : 16;
                }
                oq5 oq5Var15 = (oq5) hq5Var10;
                if (oq5Var15.P(i17 & 1, (i17 & 147) != 146)) {
                    taj S = y9w.S(oqVar3, new x0(function25, intValue15, function26, 26), oq5Var15);
                    x1g x1gVar = f9jVar.a;
                    w3g w3gVar = (w3g) szf.Q(S.b(), oq5Var15).getValue();
                    yci yciVar = (yci) function24.invoke(num2, oqVar3);
                    boolean h2 = oq5Var15.h(S);
                    Object K16 = oq5Var15.K();
                    Object obj8 = K16;
                    if (h2 || K16 == kjnVar) {
                        oea oeaVar = new oea(S, 8);
                        oq5Var15.k0(oeaVar);
                        obj8 = oeaVar;
                    }
                    Function0 function0 = (Function0) obj8;
                    boolean h3 = oq5Var15.h(S);
                    Object K17 = oq5Var15.K();
                    Object obj9 = K17;
                    if (h3 || K17 == kjnVar) {
                        oea oeaVar2 = new oea(S, 9);
                        oq5Var15.k0(oeaVar2);
                        obj9 = oeaVar2;
                    }
                    w1g.a(function0, x1gVar, w3gVar, yciVar, false, (Function0) obj9, oq5Var15, 0, 16);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 13:
                tnb tnbVar = (tnb) obj7;
                sai saiVar5 = (sai) obj6;
                b6p b6pVar = (b6p) obj5;
                hq5 hq5Var11 = (hq5) obj3;
                int d5 = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
                oq5 oq5Var16 = (oq5) hq5Var11;
                if (oq5Var16.P(d5 & 1, (d5 & 129) != 128)) {
                    boolean f7 = oq5Var16.f(saiVar5);
                    Object K18 = oq5Var16.K();
                    if (f7 || K18 == kjnVar) {
                        K18 = new r9n(0, saiVar5, sai.class, "hide", "hide()V", 0, 27);
                        oq5Var16.k0(K18);
                    }
                    Context requireContext = b6pVar.requireContext();
                    requireContext.getClass();
                    zdg.h(new lin(tnbVar, (Function0) ((h9f) K18), requireContext), null, oq5Var16, 0);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 14:
                ids idsVar = (ids) obj7;
                CharSequence charSequence = (CharSequence) obj6;
                jx7 jx7Var = (jx7) obj5;
                ((Integer) obj2).getClass();
                hq5 hq5Var12 = (hq5) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                if ((intValue17 & 129) == 128) {
                    oq5 oq5Var17 = (oq5) hq5Var12;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                ivf.l(true, d.r(vciVar, jx7Var.c0((int) (ids.a(idsVar, charSequence.toString(), null, 0, false, 0, 0L, 1022).c >> 32))), null, hq5Var12, 0, 4);
                return Unit.a;
            case 15:
                dsu dsuVar = (dsu) obj7;
                t tVar3 = (t) obj6;
                kpu kpuVar = (kpu) obj5;
                sai saiVar6 = (sai) obj2;
                hq5 hq5Var13 = (hq5) obj3;
                int d6 = eta.d((Integer) obj4, (ua5) obj, saiVar6);
                if ((d6 & 48) == 0) {
                    d6 |= ((oq5) hq5Var13).f(saiVar6) ? 32 : 16;
                }
                if ((d6 & 145) == 144) {
                    oq5 oq5Var18 = (oq5) hq5Var13;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        return Unit.a;
                    }
                }
                u7g.u((mpu) dsuVar.a.a.getValue(), tVar3, kpuVar, saiVar6, ild.C(1069153153, new f6p(18, dsuVar, tVar3), hq5Var13), null, hq5Var13, 24584 | ((d6 << 6) & 7168));
                return Unit.a;
            case 16:
                i4v i4vVar = (i4v) obj7;
                q6v q6vVar = (q6v) obj6;
                p1v p1vVar = (p1v) obj5;
                sai saiVar7 = (sai) obj2;
                hq5 hq5Var14 = (hq5) obj3;
                int d7 = eta.d((Integer) obj4, (ua5) obj, saiVar7);
                if ((d7 & 48) == 0) {
                    d7 |= ((oq5) hq5Var14).f(saiVar7) ? 32 : 16;
                }
                oq5 oq5Var19 = (oq5) hq5Var14;
                if (oq5Var19.P(d7 & 1, (d7 & 145) != 144)) {
                    r12 = (d7 & 112) != 32 ? 0 : 1;
                    Object K19 = oq5Var19.K();
                    if (r12 != 0 || K19 == kjnVar) {
                        K19 = new j6u(0, saiVar7, sai.class, "hide", "hide()V", 0, 23);
                        oq5Var19.k0(K19);
                    }
                    t7g.l(i4vVar, q6vVar, ((hai) oq5Var19.j(iai.a)).b, p1vVar, (Function0) ((h9f) K19), oq5Var19, 520);
                } else {
                    oq5Var19.S();
                }
                return Unit.a;
            case 17:
                return a(obj, obj2, obj3, obj4);
            default:
                com.yandex.plus.bdui.content.d dVar = (com.yandex.plus.bdui.content.d) obj6;
                String str5 = (String) obj2;
                Map map = (Map) obj3;
                ((e) obj).getClass();
                str5.getClass();
                map.getClass();
                ((n) obj4).getClass();
                p pVar = (p) ((j) obj7).c;
                String str6 = ((com.yandex.plus.divkit.api.a) obj5).c;
                m mVar = (m) pVar.b;
                dVar.getClass();
                com.yandex.plus.bdui.shared.b bVar = dVar.c;
                str6.getClass();
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) pVar.d;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar)) {
                    bVar2.c(aVar, "PlusDivContentController.ActionDispatcher", ouj.k('\"', "dispatchAction(); name = \"", str5));
                }
                com.yandex.plus.bdui.action.a aVar2 = (com.yandex.plus.bdui.action.a) ((t0) ((i) dVar.b)).b.get(str5);
                if (aVar2 != null) {
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "PlusDivContentController.ActionDispatcher", "dispatchAction(); dispatch action = " + aVar2 + ' ' + ("with payload = " + map));
                    }
                    mVar.a.a(aVar2, new h(bVar.c(new f(str6))), map);
                } else {
                    String q = hrg.q("action named \"", str5, "\" not found in layout actions!");
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar3)) {
                        bVar2.c(aVar3, "PlusDivContentController.ActionDispatcher", "dispatchOnErrorAction(); ".concat(q));
                    }
                    com.yandex.plus.bdui.action.a a3 = ((o) pVar.c).a(new IllegalStateException("PlusDivContent: ".concat(q)));
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "PlusDivContentController.ActionDispatcher", "dispatchOnErrorAction(); dispatch onErrorAction = " + a3);
                    }
                    mVar.a.a(a3, new h(bVar), null);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ fb1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
