package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class hxv {
    public final vdr a;
    public final c5p b;
    public final p0w c;
    public final String d;

    public hxv(vdr vdrVar, c5p c5pVar, p0w p0wVar, String str) {
        vdrVar.getClass();
        p0wVar.getClass();
        str.getClass();
        this.a = vdrVar;
        this.b = c5pVar;
        this.c = p0wVar;
        this.d = str;
        nmb a = p0wVar.a();
        String j = k5r.j(p0wVar, a);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        dfi.p(1, "hash", j, "_meta", m);
        a.C("Wizard.LikedArtists.Opened", m);
    }

    public final void a() {
        p0w p0wVar = this.c;
        nmb a = p0wVar.a();
        String j = k5r.j(p0wVar, a);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        dfi.p(1, "hash", j, "_meta", m);
        a.C("Wizard.LikedArtists.Closed", m);
        ((j1w) this.b.b).a.G();
    }
}
