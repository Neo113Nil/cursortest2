package ru.yandex.taxi.masstransit.router;

import defpackage.a60;
import defpackage.agd;
import defpackage.alb0;
import defpackage.b611;
import defpackage.fu30;
import defpackage.gh00;
import defpackage.hv30;
import defpackage.is30;
import defpackage.iv30;
import defpackage.jl40;
import defpackage.js30;
import defpackage.jst;
import defpackage.jv30;
import defpackage.ks30;
import defpackage.kv30;
import defpackage.ls30;
import defpackage.lv30;
import defpackage.mv30;
import defpackage.my6;
import defpackage.nv30;
import defpackage.ov30;
import defpackage.p540;
import defpackage.pgd;
import defpackage.pt30;
import defpackage.pv30;
import defpackage.q47;
import defpackage.q540;
import defpackage.q5z;
import defpackage.qt30;
import defpackage.qu;
import defpackage.qv30;
import defpackage.r540;
import defpackage.rt30;
import defpackage.rv30;
import defpackage.s540;
import defpackage.st30;
import defpackage.sv30;
import defpackage.t130;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt30;
import defpackage.uj30;
import defpackage.ut30;
import defpackage.v770;
import defpackage.vt30;
import defpackage.w511;
import defpackage.w540;
import defpackage.x540;
import defpackage.y50;
import defpackage.yfd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.masstransit.analytic.MasstransitPurchaseAnalytics$PurchaseScenariosSource;

/* loaded from: classes6.dex */
public final /* synthetic */ class j implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pgd b;

    public /* synthetic */ j(pgd pgdVar, int i) {
        this.a = i;
        this.b = pgdVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 10;
        int i3 = 1;
        pgd pgdVar = this.b;
        switch (i) {
            case 0:
                x540 x540Var = (x540) pgdVar;
                yfd yfdVar = (yfd) obj;
                tje.N(x540Var.o(), null, null, new MtThreadScheduleRouter$content$1$1(x540Var, yfdVar, null), 3);
                agd agdVar = (agd) yfdVar;
                agdVar.c = kotlinx.coroutines.flow.e.n(x540Var.P.d, x540Var.J.a(), com.yandex.go.coroutines.b.d(x540Var.M.a(), new MtThreadScheduleRouter$content$lambda$0$$inlined$start$1(ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b, null)), new MtThreadScheduleRouter$content$1$2(x540Var, x540Var.K.a(), Collections.singletonList(((w540) ((agd) yfdVar).a).a.b.d.b), null));
                agdVar.e = new j(x540Var, i3);
                agdVar.g = new androidx.compose.runtime.internal.a(-1458843308, new alb0(15, new t130(i2, x540Var, yfdVar)), true);
                break;
            case 1:
                x540 x540Var2 = (x540) pgdVar;
                y50 y50Var = x540Var2.O;
                s540 s540Var = (s540) obj;
                if (s540Var instanceof r540) {
                    tje.N(x540Var2.o(), null, null, new MtThreadScheduleRouter$content$1$3$1(x540Var2, null), 3);
                    break;
                } else if (jl40.l(s540Var, p540.a)) {
                    x540Var2.r(new qu(9));
                    break;
                } else if (jl40.l(s540Var, p540.b)) {
                    ((gh00) x540Var2.H).w();
                    break;
                } else {
                    if (s540Var instanceof q540) {
                        vt30 vt30Var = ((q540) s540Var).a;
                        ls30 ls30Var = x540Var2.N;
                        boolean z = vt30Var instanceof tt30;
                        v770 v770Var = v770.c;
                        if (z) {
                            ks30 ks30Var = ((tt30) vt30Var).a;
                            if (ks30Var instanceof is30) {
                                ((a60) y50Var).c(((is30) ks30Var).a, v770Var);
                                break;
                            } else if (ks30Var instanceof js30) {
                                jst.e.getClass();
                                break;
                            } else {
                                w511.b();
                            }
                        } else if (vt30Var instanceof ut30) {
                            String str2 = ((ut30) vt30Var).a;
                            if (str2 != null) {
                                ((a60) y50Var).c(str2, v770Var);
                                break;
                            }
                        } else if (vt30Var instanceof st30) {
                            ArrayList arrayList = ((st30) vt30Var).a;
                            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((fu30) it.next()).c);
                            }
                            ls30Var.c(arrayList2, MasstransitPurchaseAnalytics$PurchaseScenariosSource.Variants);
                            break;
                        } else if (vt30Var instanceof pt30) {
                            ls30Var.a(Collections.singletonList(((pt30) vt30Var).a.c), MasstransitPurchaseAnalytics$PurchaseScenariosSource.Variants);
                            break;
                        } else if (vt30Var instanceof qt30) {
                            ls30Var.b(MasstransitPurchaseAnalytics$PurchaseScenariosSource.Variants);
                            break;
                        } else if (!(vt30Var instanceof rt30)) {
                            w511.b();
                        }
                    } else {
                        w511.b();
                    }
                    break;
                }
                break;
            default:
                h hVar = (h) pgdVar;
                pv30 pv30Var = (pv30) obj;
                b611 b611Var = hVar.L;
                uj30 uj30Var = hVar.G;
                if (jl40.l(pv30Var, hv30.a)) {
                    hVar.r(new qu(9));
                    break;
                } else if (jl40.l(pv30Var, kv30.a)) {
                    hVar.I.a();
                    uj30Var.a();
                    break;
                } else if (jl40.l(pv30Var, lv30.a)) {
                    tje.N(hVar.o(), null, null, new MtRouteInfoRouter$processAction$1(hVar, null), 3);
                    break;
                } else if (jl40.l(pv30Var, mv30.a)) {
                    uj30Var.b();
                    break;
                } else if (pv30Var instanceof nv30) {
                    q5z.b0(hVar.F, ((nv30) pv30Var).a);
                    break;
                } else if (pv30Var instanceof iv30) {
                    iv30 iv30Var = (iv30) pv30Var;
                    String str3 = iv30Var.b;
                    String str4 = iv30Var.a;
                    b611Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("button_name", str3);
                    hashMap.put("route_id", str4);
                    b611Var.a.a("TransportRoute.ViewOnMapCard.Tapped", hashMap, 1, new HashMap());
                    break;
                } else if (pv30Var instanceof ov30) {
                    hVar.K.a(((ov30) pv30Var).a);
                    break;
                } else {
                    if (pv30Var instanceof jv30) {
                        jv30 jv30Var = (jv30) pv30Var;
                        q47 q47Var = jv30Var.a;
                        String str5 = jv30Var.b;
                        List list = q47Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list) {
                            if (!(((my6) obj2).e instanceof qv30)) {
                                arrayList3.add(obj2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            sv30 sv30Var = (sv30) ((my6) it2.next()).e;
                            if (sv30Var != null) {
                                if (sv30Var instanceof rv30) {
                                    str = "share_route";
                                } else if (sv30Var instanceof qv30) {
                                    str = null;
                                } else {
                                    w511.b();
                                }
                                if (str != null) {
                                    arrayList4.add(str);
                                }
                            }
                            str = "";
                            arrayList4.add(str);
                        }
                        b611Var.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("button_list", arrayList4);
                        hashMap2.put("route_id", str5);
                        b611Var.a.a("TransportRoute.ViewOnMapCard.Shown", hashMap2, 1, new HashMap());
                        break;
                    } else {
                        w511.b();
                    }
                    break;
                }
        }
        return zy11Var;
    }
}
