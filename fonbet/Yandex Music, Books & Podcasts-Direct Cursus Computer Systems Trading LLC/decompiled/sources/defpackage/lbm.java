package defpackage;

import android.content.Context;
import com.yandex.passport.internal.push.x0;
import com.yandex.plus.core.benchmark.e0;
import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.core.config.b;
import com.yandex.plus.core.locale.a;
import com.yandex.plus.domain.auth.impl.i;
import com.yandex.plus.home.d;
import com.yandex.plus.metrica.utils.n;
import com.yandex.plus.pay.internal.common.e;
import com.yandex.plus.pay.internal.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class lbm implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ lbm(zbm zbmVar, fvf fvfVar, eoe eoeVar, aqi aqiVar, tvd tvdVar, dam damVar, rbm rbmVar, u0s u0sVar, mm6 mm6Var, jx7 jx7Var, thj thjVar, poi poiVar) {
        float f = edo.a;
        this.b = zbmVar;
        this.c = fvfVar;
        this.d = eoeVar;
        this.e = aqiVar;
        this.f = tvdVar;
        this.g = damVar;
        this.h = rbmVar;
        this.i = u0sVar;
        this.j = mm6Var;
        this.k = jx7Var;
        this.l = thjVar;
        this.m = poiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List list;
        eoe eoeVar;
        fvf fvfVar;
        thj thjVar;
        char c;
        nab labVar;
        String str;
        a aVar;
        int i = this.a;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        Object obj11 = this.d;
        Object obj12 = this.c;
        Object obj13 = this.b;
        switch (i) {
            case 0:
                fvf fvfVar2 = (fvf) obj12;
                eoe eoeVar2 = (eoe) obj11;
                aqi aqiVar = (aqi) obj10;
                rbm rbmVar = (rbm) obj7;
                final u0s u0sVar = (u0s) obj6;
                mm6 mm6Var = (mm6) obj5;
                jx7 jx7Var = (jx7) obj4;
                float f = edo.a;
                thj thjVar2 = (thj) obj3;
                poi poiVar = (poi) obj2;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                List a = ((zbm) obj13).a(((jcj) aqiVar.getValue()).a);
                rbm rbmVar2 = rbmVar;
                List list2 = a;
                char c2 = 3;
                vuf.Y(vufVar, null, new wn5(new up((tvd) obj9, (dam) obj8, rbmVar, a, 29), 1100292724, true), 3);
                final int i2 = 0;
                int i3 = -1;
                for (Object obj14 : list2) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        u75.n();
                        throw null;
                    }
                    cbm cbmVar = (cbm) obj14;
                    if (cbmVar instanceof qzn) {
                        i3++;
                    }
                    if (cbmVar instanceof wam) {
                        jab jabVar = new jab(qkb.DisclaimerBlock, 1, i3 + 1, 1);
                        rbmVar2.getClass();
                        rbmVar2.b.L(jabVar, u0sVar);
                        vuf.Y(vufVar, "podcast_disclaimer_block", new wn5(new lc((wam) cbmVar, rbmVar2, jabVar, thjVar2, u0sVar, 13), 1478246754, true), 2);
                        list = list2;
                        c = c2;
                        thjVar = thjVar2;
                        eoeVar = eoeVar2;
                        fvfVar = fvfVar2;
                    } else {
                        thj thjVar3 = thjVar2;
                        if (cbmVar instanceof uam) {
                            final uam uamVar = (uam) cbmVar;
                            final jab jabVar2 = new jab(qkb.BrandedButtons, 1, i3 + 1, 1);
                            rbmVar2.getClass();
                            rbmVar2.b.L(jabVar2, u0sVar);
                            final thj v = qwp.v(uamVar.a);
                            final List list3 = list2;
                            final rbm rbmVar3 = rbmVar2;
                            vuf.Y(vufVar, "podcast_branded_buttons_block", new wn5(new pyc() { // from class: mbm
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj15, Object obj16, Object obj17) {
                                    boolean z;
                                    hq5 hq5Var = (hq5) obj16;
                                    int intValue = ((Integer) obj17).intValue();
                                    ((androidx.compose.foundation.lazy.a) obj15).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        te teVar = uam.this.a;
                                        List list4 = list3;
                                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                            Iterator it = list4.iterator();
                                            while (it.hasNext()) {
                                                if (((cbm) it.next()) instanceof bbm) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z = false;
                                        rbm rbmVar4 = rbmVar3;
                                        boolean h = oq5Var.h(rbmVar4);
                                        u0s u0sVar2 = u0sVar;
                                        boolean h2 = h | oq5Var.h(u0sVar2);
                                        jab jabVar3 = jabVar2;
                                        boolean h3 = h2 | oq5Var.h(jabVar3);
                                        thj thjVar4 = v;
                                        boolean h4 = h3 | oq5Var.h(thjVar4);
                                        Object K = oq5Var.K();
                                        kjn kjnVar = gq5.a;
                                        if (h4 || K == kjnVar) {
                                            i50 i50Var = new i50(rbmVar4, u0sVar2, jabVar3, thjVar4, 16);
                                            oq5Var.k0(i50Var);
                                            K = i50Var;
                                        }
                                        Function1 function1 = (Function1) K;
                                        boolean h5 = oq5Var.h(rbmVar4) | oq5Var.h(jabVar3) | oq5Var.h(thjVar4) | oq5Var.h(u0sVar2);
                                        Object K2 = oq5Var.K();
                                        if (h5 || K2 == kjnVar) {
                                            gam gamVar = new gam(rbmVar4, jabVar3, thjVar4, u0sVar2, 1);
                                            oq5Var.k0(gamVar);
                                            K2 = gamVar;
                                        }
                                        y1g.g(teVar, i2, z, function1, com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K2, 15), oq5Var, 0);
                                    } else {
                                        oq5Var.S();
                                    }
                                    return Unit.a;
                                }
                            }, 1895948185, true), 2);
                            list = list2;
                            thjVar = thjVar3;
                            eoeVar = eoeVar2;
                            fvfVar = fvfVar2;
                        } else {
                            if (cbmVar instanceof bbm) {
                                jcj jcjVar = (jcj) aqiVar.getValue();
                                jcjVar.getClass();
                                boolean z = jcjVar.b;
                                j0s j0sVar = jcjVar.a;
                                list = list2;
                                List h = u75.h(new u0s("details", 1, z && j0sVar == j0s.a), new u0s("episodes", 2, z && j0sVar == j0s.b));
                                rbmVar2.getClass();
                                h.getClass();
                                gcm gcmVar = rbmVar2.b;
                                gcmVar.getClass();
                                if (!gcmVar.K) {
                                    gcmVar.K = true;
                                    Iterator it = h.iterator();
                                    while (it.hasNext()) {
                                        gcmVar.l.b().g((u0s) it.next());
                                    }
                                }
                                vuf.Y(vufVar, "podcast_tabs_block", new wn5(new gab(26, (bbm) cbmVar, aqiVar), 58465882, true), 2);
                                thjVar = thjVar3;
                                eoeVar = eoeVar2;
                                fvfVar = fvfVar2;
                            } else {
                                list = list2;
                                if (cbmVar instanceof xam) {
                                    jab jabVar3 = new jab(qkb.InformationBlock, 1, i3 + 1, 1);
                                    rbmVar2.getClass();
                                    rbmVar2.b.L(jabVar3, u0sVar);
                                    vuf.Y(vufVar, null, new wn5(new lc((xam) cbmVar, u0sVar, jabVar3, thjVar3, rbmVar2, 14), -1779016421, true), 3);
                                    c = 3;
                                    thjVar = thjVar3;
                                    eoeVar = eoeVar2;
                                    fvfVar = fvfVar2;
                                } else if (cbmVar instanceof yam) {
                                    ghm ghmVar = ((yam) cbmVar).a;
                                    List list4 = ghmVar.a;
                                    jab jabVar4 = new jab(qkb.LatestEpisodes, 1, i3 + 1, list4.size());
                                    rbmVar2.getClass();
                                    rbmVar2.b.L(jabVar4, u0sVar);
                                    x80 x80Var = new x80(aqiVar, 19);
                                    mm6Var.getClass();
                                    jx7Var.getClass();
                                    vuf.Y(vufVar, "podcast_popular_tracks_block", qld.c, 2);
                                    rbm rbmVar4 = rbmVar2;
                                    vufVar.Z(list4.size(), null, new zcf(list4, 13), new wn5(new n50(list4, rbmVar4, u0sVar, jabVar4, 3), -1091073711, true));
                                    if (ghmVar.b) {
                                        eoeVar = eoeVar2;
                                        fvfVar = fvfVar2;
                                        rbmVar2 = rbmVar4;
                                        vuf.Y(vufVar, null, new wn5(new g0d(x80Var, mm6Var, jx7Var, jabVar4, eoeVar2, fvfVar2, rbmVar4, u0sVar), -423787818, true), 3);
                                    } else {
                                        eoeVar = eoeVar2;
                                        fvfVar = fvfVar2;
                                        rbmVar2 = rbmVar4;
                                    }
                                    thjVar = thjVar3;
                                } else {
                                    eoeVar = eoeVar2;
                                    fvfVar = fvfVar2;
                                    if (cbmVar instanceof abm) {
                                        abm abmVar = (abm) cbmVar;
                                        tx txVar = abmVar.a;
                                        String str2 = txVar.b;
                                        ArrayList arrayList = txVar.c;
                                        if (str2 == null) {
                                            thjVar = thjVar3;
                                            labVar = new jab(qkb.OtherAlbums, 1, i3 + 1, arrayList.size());
                                        } else {
                                            thjVar = thjVar3;
                                            qkb qkbVar = qkb.Carousel;
                                            labVar = new lab(1, i3 + 1, arrayList.size(), "other_albums", str2);
                                        }
                                        rbmVar2.getClass();
                                        rbmVar2.b.L(labVar, u0sVar);
                                        vuf.Y(vufVar, null, new wn5(new up(abmVar, rbmVar2, u0sVar, labVar, 28), -1159013731, true), 3);
                                        c = 3;
                                    } else {
                                        thjVar = thjVar3;
                                        if (cbmVar instanceof vam) {
                                            mxs mxsVar = ((vam) cbmVar).a;
                                            List list5 = mxsVar.d;
                                            jab jabVar5 = new jab(qkb.Episodes, 1, i3 + 1, list5.size());
                                            rbmVar2.getClass();
                                            rbmVar2.b.L(jabVar5, u0sVar);
                                            wp wpVar = new wp(poiVar, 6);
                                            vuf.Y(vufVar, null, new wn5(new up(mxsVar, rbmVar2, jabVar5, u0sVar, 27), -118408276, true), 3);
                                            vqn vqnVar = new vqn();
                                            vqnVar.a = -1;
                                            vufVar.Z(list5.size(), null, new zcf(list5, 12), new wn5(new bam(list5, vqnVar, rbmVar2, u0sVar, jabVar5, mxsVar, wpVar), -1091073711, true));
                                        } else {
                                            c = 3;
                                            if (!(cbmVar instanceof zam)) {
                                                b6e.s();
                                                return null;
                                            }
                                            jab jabVar6 = new jab(qkb.OfflineMode, 1, i3 + 1, 1);
                                            rbmVar2.getClass();
                                            rbmVar2.b.L(jabVar6, u0sVar);
                                            vuf.Y(vufVar, "podcast_offline_blocks", new wn5(new vtb(17, rbmVar2, jabVar6, u0sVar), -539011041, true), 2);
                                        }
                                    }
                                }
                            }
                            c = 3;
                        }
                        c = 3;
                    }
                    eoeVar2 = eoeVar;
                    i2 = i4;
                    fvfVar2 = fvfVar;
                    thjVar2 = thjVar;
                    c2 = c;
                    list2 = list;
                }
                jf0.h(vufVar, fvfVar2, eoeVar2);
                return Unit.a;
            default:
                com.yandex.plus.pay.internal.a aVar2 = (com.yandex.plus.pay.internal.a) obj13;
                Context context = (Context) obj12;
                String str3 = (String) obj11;
                b bVar = (b) obj10;
                com.yandex.plus.metrica.api.b bVar2 = (com.yandex.plus.metrica.api.b) obj9;
                com.yandex.plus.metrica.a aVar3 = (com.yandex.plus.metrica.a) obj8;
                i iVar = (i) obj7;
                e0 e0Var = (e0) obj6;
                n nVar = (n) obj5;
                x0 x0Var = (x0) obj4;
                tf6 tf6Var = (tf6) obj3;
                com.yandex.plus.core.dispatcher.b bVar3 = (com.yandex.plus.core.dispatcher.b) obj2;
                ((l) obj).getClass();
                String str4 = aVar2.e;
                if (str4 == null) {
                    b6e.j(33, "Parameter clientSubSource is required for ", ern.a(com.yandex.plus.pay.internal.a.class));
                    return null;
                }
                msa msaVar = nsa.b;
                long M = yd5.M(12, ssa.HOURS);
                ((com.yandex.plus.core.dispatcher.a) bVar3).getClass();
                mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                mn7Var.getClass();
                e eVar = new e(aVar3.a(), new com.yandex.plus.pay.internal.utils.e(new com.yandex.plus.core.analytics.n(mn7Var)));
                String str5 = aVar2.p;
                if (str5 == null) {
                    context.getClass();
                    str5 = com.yandex.plus.home.common.utils.a.h(context);
                }
                String str6 = str5;
                String str7 = aVar2.b != null ? "PlusPaySDK" : null;
                if (str7 == null || StringsKt.U(str7)) {
                    str7 = null;
                }
                String str8 = str7 == null ? "PlusPaySDK" : str7;
                String str9 = aVar2.c;
                String str10 = aVar2.d;
                if (str10 != null) {
                    String str11 = StringsKt.U(str10) ? null : str10;
                    if (str11 != null) {
                        str = str11;
                        String str12 = aVar2.i;
                        String str13 = aVar2.j;
                        com.yandex.plus.core.strings.a aVar4 = aVar2.o;
                        aVar = aVar2.h;
                        if (aVar == null) {
                            aVar = new d(1);
                        }
                        return new g(str3, str8, str9, str, str4, aVar, bVar, context, str12, str13, aVar2.k, aVar2.t, new com.yandex.plus.pay.internal.network.d(context), aVar2.l, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(9, aVar2.m), aVar2.s, aVar4, str6, bVar2, (com.yandex.plus.metrica.utils.i) aVar3.b.getValue(), aVar3.a(), aVar3.a(), eVar, aVar2.n, iVar, x0Var, nVar, e0Var, tf6Var, bVar3, M);
                    }
                }
                str = str3;
                String str122 = aVar2.i;
                String str132 = aVar2.j;
                com.yandex.plus.core.strings.a aVar42 = aVar2.o;
                aVar = aVar2.h;
                if (aVar == null) {
                }
                return new g(str3, str8, str9, str, str4, aVar, bVar, context, str122, str132, aVar2.k, aVar2.t, new com.yandex.plus.pay.internal.network.d(context), aVar2.l, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(9, aVar2.m), aVar2.s, aVar42, str6, bVar2, (com.yandex.plus.metrica.utils.i) aVar3.b.getValue(), aVar3.a(), aVar3.a(), eVar, aVar2.n, iVar, x0Var, nVar, e0Var, tf6Var, bVar3, M);
        }
    }

    public /* synthetic */ lbm(com.yandex.plus.pay.internal.a aVar, Context context, String str, b bVar, com.yandex.plus.metrica.api.b bVar2, com.yandex.plus.metrica.a aVar2, i iVar, e0 e0Var, n nVar, x0 x0Var, tf6 tf6Var, com.yandex.plus.core.dispatcher.b bVar3) {
        this.b = aVar;
        this.c = context;
        this.d = str;
        this.e = bVar;
        this.f = bVar2;
        this.g = aVar2;
        this.h = iVar;
        this.i = e0Var;
        this.j = nVar;
        this.k = x0Var;
        this.l = tf6Var;
        this.m = bVar3;
    }
}
