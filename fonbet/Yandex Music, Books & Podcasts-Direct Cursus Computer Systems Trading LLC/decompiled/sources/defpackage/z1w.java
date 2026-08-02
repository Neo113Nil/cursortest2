package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class z1w {
    public final vdr a;
    public final z6n b;
    public final p0w c;
    public final String d;
    public final xdr e;

    public z1w(vdr vdrVar, z6n z6nVar, p0w p0wVar, String str) {
        vdrVar.getClass();
        p0wVar.getClass();
        str.getClass();
        this.a = vdrVar;
        this.b = z6nVar;
        this.c = p0wVar;
        this.d = str;
        this.e = ydr.a("");
        nmb a = p0wVar.a();
        String j = k5r.j(p0wVar, a);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        dfi.p(1, "hash", j, "_meta", m);
        a.C("Wizard.Search.Opened", m);
    }

    public final void a() {
        p0w p0wVar = this.c;
        nmb a = p0wVar.a();
        String j = k5r.j(p0wVar, a);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        dfi.p(1, "hash", j, "_meta", m);
        a.C("Wizard.Search.Closed", m);
        ((j1w) this.b.b).a.J();
    }

    public final void b(x1w x1wVar, int i) {
        j1w j1wVar = (j1w) this.b.b;
        x1wVar.getClass();
        jd1 jd1Var = (jd1) x1wVar.g.getValue();
        String str = x1wVar.c;
        String str2 = x1wVar.b;
        boolean z = jd1Var.c;
        String str3 = this.d;
        p0w p0wVar = this.c;
        if (z) {
            p0wVar.getClass();
            str2.getClass();
            str.getClass();
            str3.getClass();
            nmb a = p0wVar.a();
            String j = k5r.j(p0wVar, a);
            LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
            m.put("hash", j);
            m.put("genre_tab", str3);
            m.put("artist_id", str2);
            eta.m(i, "artist_name", str, "artist_pos", m);
            m.put("_meta", nmb.u(1));
            a.C("Wizard.SearchResultItem.Unliked", m);
            j1wVar.a.h0(x1wVar);
            return;
        }
        p0wVar.getClass();
        str2.getClass();
        str.getClass();
        str3.getClass();
        nmb a2 = p0wVar.a();
        String j2 = k5r.j(p0wVar, a2);
        LinkedHashMap m2 = dfi.m("page_type", "landing", "page_id", "wizard");
        m2.put("hash", j2);
        m2.put("genre_tab", str3);
        m2.put("artist_id", str2);
        eta.m(i, "artist_name", str, "artist_pos", m2);
        m2.put("_meta", nmb.u(1));
        a2.C("Wizard.SearchResultItem.Liked", m2);
        j1wVar.a.b0(x1wVar);
    }
}
