package ru.yandex.taxi.summary.deeplink;

import android.net.Uri;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a2v;
import defpackage.a60;
import defpackage.b8a0;
import defpackage.baa0;
import defpackage.bov0;
import defpackage.ck31;
import defpackage.cug;
import defpackage.cy1;
import defpackage.cz00;
import defpackage.d8a0;
import defpackage.e8a0;
import defpackage.eja1;
import defpackage.ey1;
import defpackage.h3y;
import defpackage.hz00;
import defpackage.iv20;
import defpackage.jsa1;
import defpackage.jst;
import defpackage.kma1;
import defpackage.qht0;
import defpackage.qpt0;
import defpackage.rpt0;
import defpackage.tje;
import defpackage.uv20;
import defpackage.v770;
import defpackage.vm30;
import defpackage.w411;
import defpackage.x111;
import defpackage.x811;
import defpackage.y50;
import defpackage.za31;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class a {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final h3y h;
    public final h3y i;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, h3y h3yVar9) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = h3yVar5;
        this.f = h3yVar6;
        this.g = h3yVar7;
        this.h = h3yVar8;
        this.i = h3yVar9;
    }

    public final void a(String str, v770 v770Var, SelectionOrigin selectionOrigin) {
        Object obj;
        jsa1 ey1Var;
        String str2;
        Uri parse = Uri.parse(str);
        String authority = parse.getAuthority();
        if ("route".equalsIgnoreCase(authority)) {
            b bVar = (b) this.a.get();
            tje.N(bVar.i, null, null, new TariffRedirectDeeplinkHandler$handleRedirectDeeplink$1(parse, bVar, selectionOrigin, null), 3);
            return;
        }
        if ("requirement".equalsIgnoreCase(authority)) {
            ru.yandex.taxi.summary.deeplink.requirement.a aVar = (ru.yandex.taxi.summary.deeplink.requirement.a) this.f.get();
            aVar.getClass();
            aVar.c(kma1.f(hz00.D.f(parse)));
            return;
        }
        boolean equalsIgnoreCase = "transport_routes".equalsIgnoreCase(authority);
        h3y h3yVar = this.d;
        if (!equalsIgnoreCase) {
            if ("mobility_hub".equalsIgnoreCase(authority)) {
                uv20 uv20Var = (uv20) this.h.get();
                uv20Var.getClass();
                iv20 l = parse.getQueryParameterNames().isEmpty() ? null : uv20Var.c.l(parse);
                ((qht0) uv20Var.b).d(new cy1("hub", l != null ? l.c : null, l != null ? new Pair(l.a, l.b) : null), uv20Var.a.a(), null, new a2v(null, MobilityHubSourceType.HUB));
                return;
            }
            if ("masstransit".equalsIgnoreCase(authority)) {
                ((x111) h3yVar.get()).a();
                ((cz00) this.b.get()).a.a(new vm30(0), null);
                return;
            }
            if (!"paymentmethods".equalsIgnoreCase(authority)) {
                if ("scheduleride".equalsIgnoreCase(authority)) {
                    ((ru.yandex.taxi.scheduleride.deeplink.b) this.i.get()).a(parse);
                    return;
                } else {
                    ((a60) ((y50) this.c.get())).c(str, v770Var);
                    return;
                }
            }
            baa0 baa0Var = (baa0) this.e.get();
            e8a0 a = baa0Var.a.a(parse);
            if (a instanceof b8a0) {
                baa0Var.b.b(((b8a0) a).a);
            }
            qpt0 qpt0Var = baa0Var.c;
            d8a0 d8a0Var = a instanceof d8a0 ? (d8a0) a : null;
            ((rpt0) qpt0Var).b(d8a0Var != null ? d8a0Var.a : null, null);
            return;
        }
        cug cugVar = ((x111) h3yVar.get()).a;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", "transport_routes");
        cugVar.a.a("openDeeplink", hashMap, 1, new HashMap());
        x811 x811Var = (x811) this.g.get();
        ck31 ck31Var = x811Var.d;
        w411 j = parse.getQueryParameterNames().isEmpty() ? null : x811Var.b.j(parse);
        bov0 a2 = x811Var.a.a();
        k kVar = (k) ck31Var;
        List list = kVar.j().a;
        if (list.isEmpty()) {
            jst.e.f("TRANSPORT_HUB_ROUTING:REDIRECT", "TransportHubRouting", "verticals not ready");
        }
        boolean x = eja1.x(list);
        String str3 = "transport";
        if (x) {
            ey1Var = new cy1("transport", null, j != null ? new Pair(j.a, j.b) : null);
        } else {
            Iterator it = kVar.j().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((za31) obj).a.e()) {
                        break;
                    }
                }
            }
            za31 za31Var = (za31) obj;
            if (za31Var != null && (str2 = za31Var.d) != null) {
                str3 = str2;
            }
            ey1Var = new ey1(j, str3);
        }
        ((qht0) x811Var.c).d(ey1Var, a2, kVar.h(), x ? new a2v(null, MobilityHubSourceType.TRANSPORT) : null);
    }
}
