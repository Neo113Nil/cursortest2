package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class psv {
    public final fkn a;
    public final sml b;
    public final dxv c;
    public final p0w d;
    public final ftv e;

    public psv(fkn fknVar, sml smlVar, dxv dxvVar, p0w p0wVar, ftv ftvVar) {
        p0wVar.getClass();
        ftvVar.getClass();
        this.a = fknVar;
        this.b = smlVar;
        this.c = dxvVar;
        this.d = p0wVar;
        this.e = ftvVar;
    }

    public final ktv a() {
        Object value = this.a.a.getValue();
        xsv xsvVar = value instanceof xsv ? (xsv) value : null;
        if (xsvVar != null) {
            return xsvVar.a;
        }
        return null;
    }

    public final void b() {
        uyv uyvVar = (uyv) this.b.a;
        ktv a = a();
        if (a == null) {
            return;
        }
        if (((zsv) this.a.a.getValue()).a()) {
            String str = a.b;
            String str2 = a.c;
            boolean z = a.i;
            String str3 = (String) this.c.invoke();
            p0w p0wVar = this.d;
            p0wVar.getClass();
            str3.getClass();
            nmb a2 = p0wVar.a();
            String j = k5r.j(p0wVar, a2);
            LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
            m.put("hash", j);
            m.put("genre_tab", str3);
            m.put("artist_id", str);
            eta.u(m, "artist_name", str2, z, "insta_recommended");
            m.put("_meta", nmb.u(1));
            a2.C("Wizard.Artist.Tapped", m);
            jtv jtvVar = a.h;
            hjp hjpVar = uyvVar.b;
            ((j1w) ((cyv) hjpVar.b).c.a).a.i0(jtvVar, czv.c);
        }
        ((j1w) ((cyv) uyvVar.b.b).c.a).a.V();
    }

    public final void c() {
        ktv ktvVar;
        psv psvVar = this;
        vdr vdrVar = psvVar.a.a;
        if (!((zsv) vdrVar.getValue()).a()) {
            psvVar.b();
            return;
        }
        ktv a = psvVar.a();
        if (a == null) {
            return;
        }
        boolean z = a.i;
        String str = a.c;
        String str2 = a.b;
        zsv zsvVar = (zsv) vdrVar.getValue();
        if (!(zsvVar instanceof ysv)) {
            if (!(zsvVar instanceof xsv)) {
                b6e.s();
                return;
            }
            wsv wsvVar = ((xsv) zsvVar).b;
            if (!(wsvVar instanceof vsv)) {
                boolean z2 = wsvVar instanceof rsv;
                p0w p0wVar = psvVar.d;
                if (z2) {
                    rsv rsvVar = (rsv) wsvVar;
                    osv osvVar = rsvVar.c;
                    nsv nsvVar = osvVar instanceof nsv ? (nsv) osvVar : null;
                    boolean z3 = (nsvVar != null ? nsvVar.d : null) != null;
                    if (rsvVar.a) {
                        p0wVar.getClass();
                        nmb a2 = p0wVar.a();
                        String j = k5r.j(p0wVar, a2);
                        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
                        m.put("hash", j);
                        m.put("artist_id", str2);
                        eta.u(m, "artist_name", str, z3, "with_videoshot");
                        m.put("_meta", nmb.u(1));
                        a2.C("Wizard.OneToOne.Unliked", m);
                    } else {
                        p0wVar.getClass();
                        nmb a3 = p0wVar.a();
                        String j2 = k5r.j(p0wVar, a3);
                        LinkedHashMap m2 = dfi.m("page_type", "landing", "page_id", "wizard");
                        m2.put("hash", j2);
                        m2.put("artist_id", str2);
                        eta.u(m2, "artist_name", str, z3, "with_videoshot");
                        m2.put("_meta", nmb.u(1));
                        a3.C("Wizard.OneToOne.Liked", m2);
                    }
                    ktvVar = a;
                    uyv uyvVar = (uyv) psvVar.b.a;
                    hjp hjpVar = uyvVar.b;
                    jtv jtvVar = (jtv) uyvVar.e.getValue();
                    jtvVar.getClass();
                    ((j1w) ((cyv) hjpVar.b).c.a).a.c0(ktvVar, jtvVar);
                }
                if (!(wsvVar instanceof qsv)) {
                    b6e.s();
                    return;
                }
                boolean z4 = ((qsv) wsvVar).a;
                ktvVar = a;
                dxv dxvVar = psvVar.c;
                if (z4) {
                    String str3 = (String) dxvVar.invoke();
                    p0wVar.getClass();
                    str3.getClass();
                    nmb a4 = p0wVar.a();
                    String j3 = k5r.j(p0wVar, a4);
                    LinkedHashMap m3 = dfi.m("page_type", "landing", "page_id", "wizard");
                    m3.put("hash", j3);
                    m3.put("genre_tab", str3);
                    m3.put("artist_id", str2);
                    eta.u(m3, "artist_name", str, z, "insta_recommended");
                    m3.put("_meta", nmb.u(2));
                    a4.C("Wizard.Artist.Unliked", m3);
                } else {
                    String str4 = (String) dxvVar.invoke();
                    p0wVar.getClass();
                    str4.getClass();
                    nmb a5 = p0wVar.a();
                    String j4 = k5r.j(p0wVar, a5);
                    LinkedHashMap m4 = dfi.m("page_type", "landing", "page_id", "wizard");
                    m4.put("hash", j4);
                    m4.put("genre_tab", str4);
                    m4.put("artist_id", str2);
                    eta.u(m4, "artist_name", str, z, "insta_recommended");
                    m4.put("_meta", nmb.u(2));
                    a5.C("Wizard.Artist.Liked", m4);
                }
                psvVar = this;
                uyv uyvVar2 = (uyv) psvVar.b.a;
                hjp hjpVar2 = uyvVar2.b;
                jtv jtvVar2 = (jtv) uyvVar2.e.getValue();
                jtvVar2.getClass();
                ((j1w) ((cyv) hjpVar2.b).c.a).a.c0(ktvVar, jtvVar2);
            }
        }
        ktvVar = a;
        psvVar = this;
        uyv uyvVar22 = (uyv) psvVar.b.a;
        hjp hjpVar22 = uyvVar22.b;
        jtv jtvVar22 = (jtv) uyvVar22.e.getValue();
        jtvVar22.getClass();
        ((j1w) ((cyv) hjpVar22.b).c.a).a.c0(ktvVar, jtvVar22);
    }
}
