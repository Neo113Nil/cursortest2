package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class p0w {
    public final kxi a;
    public final fi1 b;
    public final jyr c = btf.b(new dxv(2, this));

    public p0w(kxi kxiVar, fi1 fi1Var) {
        this.a = kxiVar;
        this.b = fi1Var;
    }

    public final nmb a() {
        return (nmb) this.c.getValue();
    }

    public final String b() {
        return this.a.a.G();
    }

    public final void c() {
        nmb a = a();
        String j = k5r.j(this, a);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        m.put("hash", j);
        m.put("from", "wizard_screen");
        m.put("to", "main_screen");
        dfi.p(1, "entity_type", "button", "_meta", m);
        a.C("Wizard.Navigated", m);
    }

    public final void d(String str, String str2) {
        nmb a = a();
        String j = k5r.j(this, a);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        m.put("hash", j);
        m.put("artist_id", str);
        eta.u(m, "artist_name", str2, false, "with_videoshot");
        m.put("_meta", nmb.u(1));
        a.C("Wizard.OneToOne.Showed", m);
    }
}
