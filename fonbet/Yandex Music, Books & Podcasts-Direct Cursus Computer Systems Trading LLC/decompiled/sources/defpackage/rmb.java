package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rmb {
    public final fnb a;
    public final cvo b;
    public final nab c;
    public final u0s d;
    public final boolean e;
    public final arf f;
    public final Function0 g;
    public final LinkedHashMap h;
    public Integer i;
    public String j;
    public final jyr k;

    public rmb(fnb fnbVar, cvo cvoVar, nab nabVar, u0s u0sVar, boolean z, jyr jyrVar, Function0 function0) {
        fnbVar.getClass();
        cvoVar.getClass();
        nabVar.getClass();
        jyrVar.getClass();
        this.a = fnbVar;
        this.b = cvoVar;
        this.c = nabVar;
        this.d = u0sVar;
        this.e = z;
        this.f = jyrVar;
        this.g = function0;
        this.h = new LinkedHashMap();
        this.k = btf.b(new ita(10, this));
    }

    public static void a(rmb rmbVar, sjb sjbVar, thj thjVar, fcc fccVar, int i) {
        kmb kmbVar = kmb.Tap;
        thj thjVar2 = (i & 4) != 0 ? null : thjVar;
        fcc fccVar2 = (i & 8) != 0 ? null : fccVar;
        rmbVar.getClass();
        sjbVar.getClass();
        xmb e = rmbVar.e();
        String str = (String) rmbVar.h.get(thjVar2 != null ? thjVar2.b : null);
        if (str == null) {
            str = "";
        }
        e.a(sjbVar, kmbVar, rmbVar.c, rmbVar.d, rmbVar.b, rmbVar.d(), str, thjVar2, fccVar2, rmbVar.c());
    }

    public static /* synthetic */ void h(rmb rmbVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = rmbVar.c.getCount();
        }
        rmbVar.g(i, "");
    }

    public static /* synthetic */ void j(rmb rmbVar, wjb wjbVar, thj thjVar, fcc fccVar, int i) {
        if ((i & 2) != 0) {
            thjVar = null;
        }
        if ((i & 4) != 0) {
            fccVar = null;
        }
        rmbVar.i(wjbVar, thjVar, fccVar, null);
    }

    public static void k(rmb rmbVar, String str, thj thjVar, fcc fccVar, int i) {
        String str2;
        String str3;
        thj thjVar2 = (i & 2) != 0 ? null : thjVar;
        fcc fccVar2 = (i & 4) != 0 ? null : fccVar;
        rmbVar.getClass();
        str.getClass();
        if (thjVar2 == null || (str3 = thjVar2.b) == null || (str2 = (String) rmbVar.h.get(str3)) == null) {
            str2 = "";
        }
        rmbVar.e().h(str, rmbVar.c, rmbVar.d, rmbVar.b, rmbVar.d(), str2, thjVar2, fccVar2, rmbVar.c());
    }

    public final u5l b(thj thjVar) {
        thjVar.getClass();
        xmb e = e();
        Integer num = this.i;
        e.getClass();
        return xmb.c(thjVar, this.c, this.d, this.b, num);
    }

    public final String c() {
        String str = this.j;
        return str == null ? "" : str;
    }

    public final int d() {
        Integer num = this.i;
        return num != null ? num.intValue() : this.c.getCount();
    }

    public final xmb e() {
        return (xmb) this.k.getValue();
    }

    public final void f(thj thjVar, fcc fccVar) {
        thjVar.getClass();
        String str = (String) this.h.remove(thjVar.b);
        if (str == null) {
            str = "";
        }
        xmb e = e();
        int d = d();
        String c = c();
        e.e(d, this.c, fccVar, thjVar, this.b, this.d, str, c);
    }

    public final void g(int i, String str) {
        String str2;
        nab nabVar = this.c;
        if (i != nabVar.getCount()) {
            this.i = Integer.valueOf(i);
        }
        if (!Intrinsics.d(this.j, str)) {
            this.j = str;
        }
        xmb e = e();
        int d = d();
        String c = c();
        e.getClass();
        cvo cvoVar = this.b;
        cvoVar.getClass();
        boolean z = e.b;
        u0s u0sVar = this.d;
        if (z) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            v3w.m(f1d.m("Loaded", " in ".concat(zwf.H(nabVar)), "", u0sVar == null ? "" : " with ".concat(zwf.K(u0sVar)), ""), " on ".concat(zwf.J(cvoVar)), 4, "EvGenBlockReporter", null);
        }
        nmb d2 = e.d();
        if (d2 != null) {
            String G = e.a.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str3 = cvoVar.d.a;
            String a = cvoVar.a();
            avo avoVar = cvoVar.e;
            String str4 = avoVar.b;
            pkb pkbVar = avoVar.a;
            if (u0sVar == null || (str2 = u0sVar.a) == null) {
                str2 = "";
            }
            int i2 = u0sVar != null ? u0sVar.b : 0;
            boolean z2 = u0sVar != null ? u0sVar.c : false;
            String a2 = nabVar.a();
            boolean z3 = z2;
            String c2 = nabVar.c();
            int b = nabVar.b();
            int d3 = nabVar.d();
            G.getClass();
            wjbVar.getClass();
            ilbVar.getClass();
            glbVar.getClass();
            str3.getClass();
            pkbVar.getClass();
            str4.getClass();
            c2.getClass();
            a2.getClass();
            a.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("hash", G);
            linkedHashMap.put("page_id", wjbVar.a);
            linkedHashMap.put("page_style", ilbVar.a);
            linkedHashMap.put("page_placement", glbVar.a);
            linkedHashMap.put("skeleton_id", str3);
            linkedHashMap.put("main_object_type", pkbVar.a);
            linkedHashMap.put("main_object_id", str4);
            eta.m(i2, "tab_id", str2, "tab_pos", linkedHashMap);
            linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z3));
            linkedHashMap.put("entity_type", c2);
            eta.m(b, "entity_id", a2, "entity_pos_x", linkedHashMap);
            ouj.y(d3, linkedHashMap, "entity_pos_y", d, "objects_count");
            linkedHashMap.put("display_reason_id", c);
            linkedHashMap.put("filter_key", "");
            eta.m(0, "filter_value", "", "filter_pos", linkedHashMap);
            linkedHashMap.put("view_uuid", "");
            linkedHashMap.put("screen_view_uuid", a);
            dfi.p(3, "loaded_view_uuid", "", "_meta", linkedHashMap);
            d2.C("LandingBlock.Loaded", linkedHashMap);
        }
    }

    public final void i(wjb wjbVar, thj thjVar, fcc fccVar, String str) {
        String str2;
        String str3;
        wjbVar.getClass();
        if (thjVar == null || (str3 = thjVar.b) == null || (str2 = (String) this.h.get(str3)) == null) {
            str2 = "";
        }
        e().g(wjbVar, this.c, this.d, this.b, d(), str2, thjVar, fccVar, str, c());
    }

    public final void l(fcc fccVar, thj thjVar, String str) {
        thjVar.getClass();
        str.getClass();
        this.h.put(thjVar.b, str);
        e().j(d(), this.c, fccVar, thjVar, this.b, this.d, str, c());
    }

    public final void m(fcc fccVar, thj thjVar, String str) {
        str.getClass();
        xmb e = e();
        String str2 = (String) this.h.get(thjVar != null ? thjVar.b : null);
        if (str2 == null) {
            str2 = "";
        }
        e.l(str, this.c, this.d, this.b, d(), str2, "", thjVar, fccVar, c());
    }
}
