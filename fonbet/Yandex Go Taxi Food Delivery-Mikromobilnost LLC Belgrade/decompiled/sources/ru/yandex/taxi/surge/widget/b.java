package ru.yandex.taxi.surge.widget;

import android.net.Uri;
import com.yandex.go.deeplinks.generated.summary.SummarySection;
import com.yandex.go.taxi.tariffs.interactor.h;
import defpackage.a60;
import defpackage.afv0;
import defpackage.arv0;
import defpackage.b8a0;
import defpackage.c4r0;
import defpackage.ck31;
import defpackage.cug;
import defpackage.e8a0;
import defpackage.eu0;
import defpackage.frl0;
import defpackage.g8a0;
import defpackage.h010;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.m950;
import defpackage.nuw0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.rag;
import defpackage.rqw0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v770;
import defpackage.vm30;
import defpackage.wiq0;
import defpackage.x111;
import defpackage.y50;
import defpackage.ycq0;
import defpackage.yvf0;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class b implements rqw0 {
    public final c4r0 a;
    public final wiq0 b;
    public final ck31 c;
    public final arv0 d;
    public final h e;
    public final yvf0 f;
    public final yvf0 g;
    public final h3y h;
    public final h3y i;
    public final h3y j;
    public final tse k;
    public final nuw0 l;
    public final eu0 m;
    public final rag n;

    public b(c4r0 c4r0Var, wiq0 wiq0Var, ck31 ck31Var, arv0 arv0Var, h hVar, yvf0 yvf0Var, yvf0 yvf0Var2, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, tse tseVar, nuw0 nuw0Var, eu0 eu0Var, rag ragVar) {
        this.a = c4r0Var;
        this.b = wiq0Var;
        this.c = ck31Var;
        this.d = arv0Var;
        this.e = hVar;
        this.f = yvf0Var;
        this.g = yvf0Var2;
        this.h = h3yVar;
        this.i = h3yVar2;
        this.j = h3yVar3;
        this.k = tseVar;
        this.l = nuw0Var;
        this.m = eu0Var;
        this.n = ragVar;
    }

    @Override // defpackage.rqw0
    public final void handle(String str) {
        Uri parse = Uri.parse(str);
        String authority = parse.getAuthority();
        if ("route".equalsIgnoreCase(authority)) {
            tje.N(this.k, null, null, new SurgeInfoDeeplinkHandlerImpl$handleRedirectDeeplink$1(parse, this, null), 3);
            return;
        }
        boolean equalsIgnoreCase = "transport_routes".equalsIgnoreCase(authority);
        h3y h3yVar = this.j;
        nuw0 nuw0Var = this.l;
        if (equalsIgnoreCase) {
            cug cugVar = ((x111) h3yVar.get()).a;
            cugVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("action", "transport_routes");
            cugVar.a.a("openDeeplink", hashMap, 1, new HashMap());
            nuw0Var.b("transport");
            return;
        }
        if ("mobility_hub".equalsIgnoreCase(authority)) {
            nuw0Var.b("hub");
            return;
        }
        frl0 frl0Var = frl0.C;
        if (frl0Var.c(authority)) {
            afv0 r = frl0Var.r(parse);
            if ((r != null ? r.a : null) == SummarySection.PRICE_INFO) {
                oep0 oep0Var = (oep0) this.n.get();
                m950 m950Var = (m950) this.m.get();
                String str2 = r.b;
                if (str2 == null) {
                    str2 = "widget";
                }
                ((pep0) oep0Var).f(m950Var, str2, hxx.a);
                return;
            }
            return;
        }
        if ("masstransit".equalsIgnoreCase(authority)) {
            ((x111) h3yVar.get()).a();
            ((h010) this.g.get()).a(new vm30(0), null);
        } else {
            if (!"paymentmethods".equalsIgnoreCase(authority)) {
                ((a60) ((y50) this.f.get())).c(parse.toString(), v770.b);
                return;
            }
            e8a0 a = ((g8a0) this.h.get()).a(parse);
            if (a instanceof b8a0) {
                ((ycq0) this.i.get()).b(((b8a0) a).a);
            }
            nuw0Var.a();
        }
    }
}
