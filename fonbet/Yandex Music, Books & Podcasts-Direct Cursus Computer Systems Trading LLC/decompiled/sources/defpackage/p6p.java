package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class p6p extends bfu {
    public final jyr k;
    public final xdr l;
    public final xdr m;
    public final xdr n;
    public final fkn o;
    public final eoi p;
    public final fkn q;
    public final fkn r;
    public final tao s;

    public p6p(c0p c0pVar, q0h q0hVar, fnb fnbVar) {
        c0pVar.getClass();
        q0hVar.getClass();
        jyr b = l18.b.b(hag.I(z66.class), true);
        this.k = b;
        xdr a = ydr.a(Boolean.FALSE);
        this.l = a;
        xdr a2 = ydr.a(m6p.a);
        this.m = a2;
        xdr a3 = ydr.a("");
        this.n = a3;
        fkn fknVar = new fkn(a3);
        this.o = fknVar;
        this.p = new eoi();
        this.q = vq1.E(ot0.F(this), a2, a, new j1p(3));
        vdr c = ((z66) b.getValue()).c();
        cq4 F = ot0.F(this);
        this.r = zsd.F0(new ail(17, c, this), F, lbq.a, Boolean.valueOf(((x66) c.getValue()).a && ((z66) b.getValue()).f()));
        String e = eta.e();
        tao taoVar = new tao(fnbVar, c0pVar, e);
        this.s = taoVar;
        nmb nmbVar = (nmb) taoVar.d;
        long b2 = ((zzp) taoVar.e).b();
        mkb k = tao.k(c0pVar);
        String G = fnbVar.G();
        nmbVar.getClass();
        G.getClass();
        LinkedHashMap r = su4.r("search_session_id", e);
        r.put("event_timestamp", String.valueOf(b2));
        r.put("page_id", k.a);
        r.put("hash", G);
        dfi.p(2, "page_type", "landing", "_meta", r);
        nmbVar.C("Search.Opened", r);
        zsd.r0(ot0.F(this), new ub7(12, fknVar, new n6p(this, (Continuation) null, 0)));
        q0hVar.e();
    }

    public final void a(String str) {
        xdr xdrVar;
        Object value;
        str.getClass();
        do {
            xdrVar = this.n;
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, str));
    }
}
