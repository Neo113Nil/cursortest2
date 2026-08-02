package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import android.content.Context;
import com.adjust.sdk.Constants;
import defpackage.a320;
import defpackage.ao;
import defpackage.aoi;
import defpackage.apf;
import defpackage.at20;
import defpackage.awp0;
import defpackage.b320;
import defpackage.bo;
import defpackage.bvf0;
import defpackage.c1x0;
import defpackage.c320;
import defpackage.cg7;
import defpackage.ck70;
import defpackage.co;
import defpackage.cr;
import defpackage.cx;
import defpackage.cxm;
import defpackage.czh;
import defpackage.d301;
import defpackage.dci;
import defpackage.dhs0;
import defpackage.dw7;
import defpackage.ef00;
import defpackage.ek70;
import defpackage.eo;
import defpackage.eqh;
import defpackage.eyf;
import defpackage.fo;
import defpackage.fw7;
import defpackage.g870;
import defpackage.g8b;
import defpackage.gd3;
import defpackage.gmh;
import defpackage.go;
import defpackage.gri;
import defpackage.gw7;
import defpackage.gzh;
import defpackage.h3y;
import defpackage.h8b;
import defpackage.hd3;
import defpackage.hk70;
import defpackage.ho;
import defpackage.ht10;
import defpackage.htg;
import defpackage.hwy0;
import defpackage.i5m;
import defpackage.id3;
import defpackage.ike;
import defpackage.izh;
import defpackage.j00;
import defpackage.j470;
import defpackage.j870;
import defpackage.jw40;
import defpackage.kcz0;
import defpackage.kk70;
import defpackage.kn;
import defpackage.kw40;
import defpackage.kw7;
import defpackage.l7x0;
import defpackage.lej;
import defpackage.ln;
import defpackage.lq40;
import defpackage.md6;
import defpackage.mn;
import defpackage.mv4;
import defpackage.n3w;
import defpackage.nn;
import defpackage.nr;
import defpackage.o8b;
import defpackage.on;
import defpackage.ove;
import defpackage.ow;
import defpackage.p370;
import defpackage.p470;
import defpackage.p670;
import defpackage.pn;
import defpackage.pw;
import defpackage.pxy0;
import defpackage.q5z;
import defpackage.q670;
import defpackage.q8s;
import defpackage.qc20;
import defpackage.qcp0;
import defpackage.qn;
import defpackage.rkb1;
import defpackage.rn;
import defpackage.rsc;
import defpackage.sn;
import defpackage.ssc;
import defpackage.st2;
import defpackage.t701;
import defpackage.tje;
import defpackage.tn;
import defpackage.tsc;
import defpackage.un;
import defpackage.uv7;
import defpackage.uy31;
import defpackage.vn;
import defpackage.vrt0;
import defpackage.vwa0;
import defpackage.w511;
import defpackage.wn;
import defpackage.wwf;
import defpackage.x201;
import defpackage.x501;
import defpackage.x701;
import defpackage.xn;
import defpackage.xvf0;
import defpackage.yj70;
import defpackage.yn;
import defpackage.yuj0;
import defpackage.ywf;
import defpackage.ywh;
import defpackage.z220;
import defpackage.zgf;
import defpackage.zia1;
import defpackage.zn;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.models.ActionPosition;

/* loaded from: classes5.dex */
public final class l {
    public final String a;
    public final x201 b;
    public final kcz0 c;
    public final j00 d;
    public final ru.yandex.taxi.logistics.sdk.management.f e;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e f;
    public final uy31 g;
    public final b h;
    public final c1x0 i;
    public final ht10 j;
    public final md6 k;
    public final j l;
    public final Context m;
    public final d301 n;
    public final wwf o;
    public final ike p;

    public l(String str, x201 x201Var, kcz0 kcz0Var, j00 j00Var, st2 st2Var, ru.yandex.taxi.logistics.sdk.management.f fVar, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, uy31 uy31Var, b bVar, c1x0 c1x0Var, ht10 ht10Var, md6 md6Var, j jVar, Context context, d301 d301Var, wwf wwfVar) {
        this.a = str;
        this.b = x201Var;
        this.c = kcz0Var;
        this.d = j00Var;
        this.e = fVar;
        this.f = eVar;
        this.g = uy31Var;
        this.h = bVar;
        this.i = c1x0Var;
        this.j = ht10Var;
        this.k = md6Var;
        this.l = jVar;
        this.m = context;
        this.n = d301Var;
        this.o = wwfVar;
        this.p = bvf0.a(st2Var.a);
    }

    public static /* synthetic */ void b(l lVar, String str, String str2, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        lVar.a(str, null, null, str2);
    }

    public final void a(String str, ActionPosition actionPosition, String str2, String str3) {
        String str4;
        if (str3 != null) {
            str4 = str3.concat(".Tapped");
            str = null;
        } else {
            str4 = "SharedOrderCard.Tapped";
        }
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("button_name", str);
        }
        if (actionPosition != null) {
            mapBuilder.put("button_position", actionPosition.toString());
        }
        if (str2 != null) {
            mapBuilder.put("button_icon_tag", str2);
        }
        this.c.x(str4, mapBuilder.j());
    }

    public final Object c() {
        gri griVar;
        Object value = this.f.e.a.getValue();
        t701 t701Var = value instanceof t701 ? (t701) value : null;
        if (t701Var == null || (griVar = t701Var.a) == null) {
            return null;
        }
        return griVar.i;
    }

    public final vwa0 d() {
        gri griVar;
        Object value = this.f.e.a.getValue();
        t701 t701Var = value instanceof t701 ? (t701) value : null;
        if (t701Var == null || (griVar = t701Var.a) == null) {
            return null;
        }
        return griVar.k;
    }

    public final void e(nr nrVar) {
        gri griVar;
        if ((nrVar instanceof cx) || (nrVar instanceof ho) || (nrVar instanceof ao) || (nrVar instanceof tn) || (nrVar instanceof wn) || (nrVar instanceof co) || (nrVar instanceof ln) || (nrVar instanceof fo) || (nrVar instanceof cr)) {
            return;
        }
        boolean z = nrVar instanceof zn;
        int i = 6;
        ike ikeVar = this.p;
        ActionPosition actionPosition = null;
        r6 = null;
        vwa0 vwa0Var = null;
        actionPosition = null;
        if (z) {
            zn znVar = (zn) nrVar;
            b(this, "call", znVar.c, 6);
            tje.N(ikeVar, null, null, new TrackingActionsHandler$onCall$1(this, znVar.b, d(), null), 3);
            return;
        }
        if (nrVar instanceof kn) {
            tje.N(ikeVar, null, null, new TrackingActionsHandler$onCancelV1Clicked$1(this, (kn) nrVar, null), 3);
            return;
        }
        if (nrVar instanceof mn) {
            mn mnVar = (mn) nrVar;
            b(this, "cancel", mnVar.c, 6);
            h(mnVar.b);
            return;
        }
        if (nrVar instanceof qn) {
            Object value = this.f.e.a.getValue();
            t701 t701Var = value instanceof t701 ? (t701) value : null;
            if (t701Var != null && (griVar = t701Var.a) != null) {
                vwa0Var = griVar.k;
            }
            int i2 = 0;
            k kVar = new k(this, i2);
            int i3 = 1;
            k kVar2 = new k(this, i3);
            wwf wwfVar = this.o;
            czh create = ((gzh) wwfVar.b).create();
            zgf zgfVar = (zgf) wwfVar.c;
            uv7 uv7Var = new uv7((String) wwfVar.a, vwa0Var);
            wwf wwfVar2 = new wwf(create, kVar2, kVar);
            com.yandex.passport.sloth.ui.dependencies.m mVar = (com.yandex.passport.sloth.ui.dependencies.m) zgfVar.b;
            mVar.getClass();
            xvf0 a = dhs0.a(new gmh(new eyf(mVar, i2), 4));
            c320 c320Var = b320.a;
            tsc tscVar = ssc.a;
            gw7 gw7Var = new gw7(new cg7(c320Var, tscVar, 5), i2);
            eqh eqhVar = new eqh();
            eqh eqhVar2 = new eqh();
            lej lejVar = new lej(eqhVar2, i2);
            eyf eyfVar = new eyf(mVar, i3);
            vrt0 vrt0Var = new vrt0(eyfVar, 2);
            id3 id3Var = hd3.a;
            eqh.a(eqhVar2, new pw(gw7Var, tscVar, eqhVar, lejVar, c320Var, id3Var, vrt0Var));
            lej lejVar2 = new lej(eqhVar2, i);
            eqh.a(eqhVar, new ove(lejVar2, eyfVar, mv4.a, new awp0((xvf0) eqhVar2, (xvf0) id3Var, (xvf0) lejVar2, 10), vrt0Var));
            q5z.h((qcp0) mVar.b);
            Context context = (Context) mVar.a;
            q5z.h(context);
            h3y a2 = i5m.a(a);
            fw7 fw7Var = new fw7(new dw7(new a320(), new rsc()));
            rsc rscVar = new rsc();
            h3y a3 = i5m.a(eqhVar);
            h3y a4 = i5m.a(lejVar);
            h3y a5 = i5m.a(c320Var);
            gd3 gd3Var = new gd3();
            l7x0 l7x0Var = (l7x0) mVar.h;
            q5z.h(l7x0Var);
            ru.yandex.taxi.logistics.sdk.tracking.domain.impl.repository.a aVar = new ru.yandex.taxi.logistics.sdk.tracking.domain.impl.repository.a(a2, new ywh(new ow(fw7Var, rscVar, a3, a4, a5, gd3Var, new qc20(l7x0Var)), new gd3()));
            yuj0 yuj0Var = (yuj0) mVar.f;
            q5z.h(yuj0Var);
            com.yandex.delivery.utils.dialogmanager.impl.b bVar = (com.yandex.delivery.utils.dialogmanager.impl.b) mVar.d;
            q5z.h(bVar);
            com.yandex.delivery.utils.dialogmanager.a aVar2 = new com.yandex.delivery.utils.dialogmanager.a(yuj0Var, bVar);
            q8s q8sVar = (q8s) mVar.i;
            q5z.h(q8sVar);
            ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.mapper.a aVar3 = new ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.mapper.a(q8sVar, l7x0Var);
            htg htgVar = (htg) mVar.j;
            q5z.h(htgVar);
            ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.ui.b bVar2 = new ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.ui.b(uv7Var, aVar, aVar2, aVar3, wwfVar2, htgVar);
            hwy0 hwy0Var = (hwy0) mVar.c;
            q5z.h(hwy0Var);
            dci dciVar = (dci) mVar.e;
            q5z.h(dciVar);
            czh.a(create, new izh(new cxm(new aoi(new apf(context, bVar2, hwy0Var, dciVar, 9), uv7Var, wwfVar2)), ButtonType.BACK, ScreenMode.FIXED, null, null, null, 8178));
            return;
        }
        boolean z2 = nrVar instanceof eo;
        x201 x201Var = this.b;
        if (z2) {
            b(this, "show_delivery_from_market_content", null, 14);
            x201Var.a(new q670(((eo) nrVar).b));
            return;
        }
        boolean z3 = nrVar instanceof nn;
        kcz0 kcz0Var = this.c;
        if (z3) {
            kcz0Var.x("SuperApp.Delivery.ExtNDD.Tracking.ReschedulingDelivery", null);
            tje.N(ikeVar, null, null, new TrackingActionsHandler$onChangeDateTimeClicked$1(this, (nn) nrVar, null), 3);
            return;
        }
        if (nrVar instanceof pn) {
            pn pnVar = (pn) nrVar;
            tje.N(ikeVar, null, null, new TrackingActionsHandler$onShowDialogClicked$1(this, pnVar, null), 3);
            jw40 jw40Var = pnVar.d;
            if (!(jw40Var.c.c instanceof nn)) {
                kw40 kw40Var = jw40Var.d;
                if (!((kw40Var != null ? kw40Var.c : null) instanceof nn)) {
                    return;
                }
            }
            kcz0Var.x("SuperApp.Delivery.ExtNDD.Tracking.ReschedulingDelivery", null);
            return;
        }
        if (nrVar instanceof go) {
            go goVar = (go) nrVar;
            x701 x701Var = (x701) this.d.a.e.a.getValue();
            if (x701Var instanceof t701) {
                gri griVar2 = ((t701) x701Var).a;
                List list = griVar2.d;
                List list2 = griVar2.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof go) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (obj2 instanceof go) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        actionPosition = ActionPosition.SECONDARY;
                    }
                } else {
                    actionPosition = ActionPosition.PRIMARY;
                }
            }
            a("show_support_from_service", actionPosition, goVar.c, goVar.d);
            x201Var.a(new j870(goVar.b));
            return;
        }
        if (nrVar instanceof bo) {
            bo boVar = (bo) nrVar;
            b(this, "share_delivery_route", boVar.c, 6);
            zia1.c(this.m, boVar.b, boVar.a);
            return;
        }
        if (nrVar instanceof yn) {
            b(this, "order_more", null, 14);
            x201Var.a(new g870((yn) nrVar));
            return;
        }
        if (nrVar instanceof xn) {
            xn xnVar = (xn) nrVar;
            b(this, "open_universal_link", xnVar.f, 6);
            tje.N(ikeVar, null, null, new TrackingActionsHandler$onOpenAppClicked$1(this, xnVar, null), 3);
            return;
        }
        if (nrVar instanceof un) {
            f((un) nrVar);
            return;
        }
        if (nrVar instanceof on) {
            on onVar = (on) nrVar;
            String str = onVar.e;
            if (str == null) {
                str = Constants.DEEPLINK;
            }
            b(this, str, null, 14);
            x201Var.a(new p470(onVar.a));
            return;
        }
        if (nrVar instanceof rn) {
            b(this, "edit_order_details", null, 14);
            tje.N(ikeVar, null, null, new TrackingActionsHandler$onEditOrderDetailsClicked$1(this, (rn) nrVar, null), 3);
        } else if (nrVar instanceof sn) {
            kcz0Var.x("SharedOrderCard.Tapped", kotlin.collections.b.i(new Pair("button_name", "extend_delivery_expiration_date"), new Pair("action_source", "round_button")));
            tje.N(ikeVar, null, null, new TrackingActionsHandler$onExtendExpirationDateClicked$1(this, (sn) nrVar, null), 3);
        } else if (nrVar instanceof vn) {
            g((vn) nrVar);
        } else {
            w511.b();
        }
    }

    public final void f(un unVar) {
        b(this, "contact_courier", unVar.d, 6);
        LinkedHashMap l = kotlin.collections.b.l(new Pair("order_id", this.a));
        z220 z220Var = unVar.b;
        rkb1 rkb1Var = z220Var.b;
        if (rkb1Var instanceof h8b) {
            l.put("chat_id", ((h8b) rkb1Var).a);
        } else if (rkb1Var instanceof g8b) {
            l.put("bot_id", ((g8b) rkb1Var).a);
        } else if (!(rkb1Var instanceof o8b)) {
            w511.b();
            return;
        }
        j470 j470Var = new j470(unVar.a, z220Var, unVar.c, this.i.a(l));
        md6 md6Var = this.k;
        ((x501) md6Var.b).getClass();
        ((x201) md6Var.c).a(j470Var);
    }

    public final void g(vn vnVar) {
        b(this, null, vnVar.k, 6);
        String str = vnVar.e;
        if (str != null) {
            this.n.a(str);
        }
        this.b.a(new p670(vnVar.a, vnVar.b, vnVar.c, vnVar.d, vnVar.f));
    }

    public final void h(kw7 kw7Var) {
        k kVar = new k(this, 2);
        k kVar2 = new k(this, 3);
        pxy0 pxy0Var = new pxy0(14, this);
        ht10 ht10Var = this.j;
        czh create = ((gzh) ht10Var.b).create();
        ef00 ef00Var = (ef00) ((yj70) ht10Var.c).a;
        ef00Var.getClass();
        n3w a = n3w.a(new kk70(new at20(hk70.a, new lq40(22, new ywf(8, ef00Var)))));
        q5z.h(ef00Var.b);
        Context context = ef00Var.a;
        q5z.h(context);
        hwy0 hwy0Var = ef00Var.c;
        q5z.h(hwy0Var);
        czh.a(create, new izh(new cxm(new aoi(new p370(4, context, hwy0Var, (kk70) a.a), new ek70(kw7Var), new ck70(create, kVar, kVar2, pxy0Var))), null, null, null, null, null, 8190));
    }
}
