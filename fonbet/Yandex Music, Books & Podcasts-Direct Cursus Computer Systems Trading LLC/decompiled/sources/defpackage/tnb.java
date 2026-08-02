package defpackage;

import com.appsflyer.internal.k;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class tnb {
    public final cvo a;
    public final fnb b;
    public final arf c;
    public final boolean d;
    public final Function0 e;

    public /* synthetic */ tnb(cvo cvoVar, fnb fnbVar, jyr jyrVar, int i) {
        this(cvoVar, fnbVar, (i & 4) != 0 ? btf.b(new tka(22)) : jyrVar, false, new x6s(26));
    }

    public static void d(tnb tnbVar, wjb wjbVar) {
        wjb wjbVar2;
        cvo cvoVar = tnbVar.a;
        wjbVar.getClass();
        if (tnbVar.d) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
            wjbVar2 = wjbVar;
        } else {
            String concat = " on ".concat(zwf.J(cvoVar));
            StringBuilder sb = new StringBuilder("Navigated(to=");
            wjbVar2 = wjbVar;
            sb.append(wjbVar2);
            sb.append(")");
            ssg.a(3, "EvGenScreenReporter", ((Object) sb.toString()) + "" + concat, null);
        }
        nmb a = tnbVar.a();
        if (a != null) {
            String G = tnbVar.b.G();
            wjb wjbVar3 = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str = cvoVar.d.a;
            avo avoVar = cvoVar.e;
            pkb pkbVar = avoVar.a;
            String str2 = avoVar.b;
            qkb qkbVar = qkb.Actions;
            nmb.y(a, qkbVar, qkbVar, G, wjbVar3, ilbVar, glbVar, str, pkbVar, str2, wjbVar3, wjbVar2, null, 19968);
        }
    }

    public static void f(tnb tnbVar, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        int i3 = (i2 & 64) != 0 ? 1 : i;
        tnbVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        nmb a = tnbVar.a();
        if (a != null) {
            String G = tnbVar.b.G();
            cvo cvoVar = tnbVar.a;
            wjb wjbVar = cvoVar.a;
            String str6 = cvoVar.d.a;
            avo avoVar = cvoVar.e;
            nmb.z(a, G, wjbVar, str6, avoVar.a, avoVar.b, null, 0, false, str3, str2, 0, str5, str4, i3, str, 3296);
        }
    }

    public final nmb a() {
        if (((Boolean) this.e.invoke()).booleanValue()) {
            return (nmb) this.c.getValue();
        }
        return null;
    }

    public final void b() {
        cvo cvoVar = this.a;
        if (this.d) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(3, "EvGenScreenReporter", "Closed".concat(" on ".concat(zwf.J(cvoVar))), null);
        }
        nmb a = a();
        if (a != null) {
            String G = this.b.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str = cvoVar.d.a;
            avo avoVar = cvoVar.e;
            pkb pkbVar = avoVar.a;
            String str2 = avoVar.b;
            String a2 = cvoVar.a();
            G.getClass();
            wjbVar.getClass();
            ilbVar.getClass();
            glbVar.getClass();
            str.getClass();
            pkbVar.getClass();
            str2.getClass();
            a2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("hash", G);
            linkedHashMap.put("page_id", wjbVar.a);
            linkedHashMap.put("page_style", ilbVar.a);
            linkedHashMap.put("page_placement", glbVar.a);
            linkedHashMap.put("skeleton_id", str);
            linkedHashMap.put("main_object_type", pkbVar.a);
            linkedHashMap.put("main_object_id", str2);
            eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
            linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
            linkedHashMap.put("view_uuid", a2);
            linkedHashMap.put("_meta", nmb.u(4));
            a.C("Screen.Closed", linkedHashMap);
        }
    }

    public final void c(String str) {
        str.getClass();
        qkb qkbVar = qkb.Carousel;
        cvo cvoVar = this.a;
        avo avoVar = cvoVar.e;
        String str2 = avoVar.b;
        pkb pkbVar = avoVar.a;
        str2.getClass();
        pkbVar.getClass();
        nmb a = a();
        if (a != null) {
            String G = this.b.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str3 = cvoVar.d.a;
            avo avoVar2 = cvoVar.e;
            String str4 = avoVar2.b;
            pkb pkbVar2 = avoVar2.a;
            fmb[] fmbVarArr = fmb.a;
            G.getClass();
            wjbVar.getClass();
            ilbVar.getClass();
            glbVar.getClass();
            str3.getClass();
            pkbVar2.getClass();
            str4.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("entity_type", "deeplink");
            eta.m(0, "entity_id", "deeplink", "entity_pos_x", linkedHashMap);
            linkedHashMap.put("entity_pos_y", String.valueOf(0));
            linkedHashMap.put("object_type", pkbVar.a);
            eta.m(0, "object_id", str2, "object_pos_x", linkedHashMap);
            k.u(0, "object_pos_y", "playback_action_id", str, linkedHashMap);
            linkedHashMap.put("stream_start_trigger", "user_action");
            linkedHashMap.put("hash", G);
            linkedHashMap.put("page_id", wjbVar.a);
            linkedHashMap.put("page_style", ilbVar.a);
            linkedHashMap.put("page_placement", glbVar.a);
            linkedHashMap.put("skeleton_id", str3);
            linkedHashMap.put("main_object_type", pkbVar2.a);
            linkedHashMap.put("main_object_id", str4);
            eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
            linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
            linkedHashMap.put("_meta", nmb.u(5));
            a.C("Screen.Started", linkedHashMap);
        }
    }

    public final void e() {
        cvo cvoVar = this.a;
        if (this.d) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(3, "EvGenScreenReporter", "Opened".concat(" on ".concat(zwf.J(cvoVar))), null);
        }
        nmb a = a();
        if (a != null) {
            String G = this.b.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str = cvoVar.d.a;
            avo avoVar = cvoVar.e;
            pkb pkbVar = avoVar.a;
            String str2 = avoVar.b;
            String a2 = cvoVar.a();
            G.getClass();
            wjbVar.getClass();
            ilbVar.getClass();
            glbVar.getClass();
            str.getClass();
            pkbVar.getClass();
            str2.getClass();
            a2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("hash", G);
            linkedHashMap.put("page_id", wjbVar.a);
            linkedHashMap.put("page_style", ilbVar.a);
            linkedHashMap.put("page_placement", glbVar.a);
            linkedHashMap.put("skeleton_id", str);
            linkedHashMap.put("main_object_type", pkbVar.a);
            linkedHashMap.put("main_object_id", str2);
            eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
            linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
            linkedHashMap.put("view_uuid", a2);
            linkedHashMap.put("_meta", nmb.u(3));
            a.C("Screen.Opened", linkedHashMap);
        }
    }

    public final void g(u0s u0sVar) {
        u0sVar.getClass();
        cvo cvoVar = this.a;
        if (this.d) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(3, "EvGenScreenReporter", hrg.r("Tab.Loaded", " with ".concat(zwf.K(u0sVar)), "", " on ".concat(zwf.J(cvoVar))), null);
        }
        nmb a = a();
        if (a != null) {
            String G = this.b.G();
            wjb wjbVar = cvoVar.a;
            String str = cvoVar.d.a;
            avo avoVar = cvoVar.e;
            String str2 = avoVar.b;
            pkb pkbVar = avoVar.a;
            String str3 = u0sVar.a;
            int i = u0sVar.b;
            boolean z = u0sVar.c;
            G.getClass();
            wjbVar.getClass();
            str.getClass();
            pkbVar.getClass();
            str2.getClass();
            str3.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("hash", G);
            linkedHashMap.put("page_id", wjbVar.a);
            linkedHashMap.put("skeleton_id", str);
            linkedHashMap.put("main_object_type", pkbVar.a);
            linkedHashMap.put("main_object_id", str2);
            eta.m(i, "tab_id", str3, "tab_pos", linkedHashMap);
            linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
            linkedHashMap.put("_meta", nmb.u(1));
            a.C("Tab.Loaded", linkedHashMap);
        }
    }

    public final void h(u0s u0sVar) {
        u0sVar.getClass();
        cvo cvoVar = this.a;
        if (this.d) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(3, "EvGenScreenReporter", hrg.r("Tab.Opened", " with ".concat(zwf.K(u0sVar)), "", " on ".concat(zwf.J(cvoVar))), null);
        }
        nmb a = a();
        if (a != null) {
            String G = this.b.G();
            wjb wjbVar = cvoVar.a;
            String str = cvoVar.d.a;
            avo avoVar = cvoVar.e;
            a.B(G, wjbVar, str, avoVar.a, avoVar.b, u0sVar.a, u0sVar.b, u0sVar.c);
        }
    }

    public final void i(sjb sjbVar) {
        kmb kmbVar = kmb.Tap;
        cvo cvoVar = this.a;
        if (this.d) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(3, "EvGenScreenReporter", ((Object) ("ActionPerformed(action=" + sjbVar + ", type=" + kmbVar + ")")) + "" + " on ".concat(zwf.J(cvoVar)), null);
        }
        nmb a = a();
        if (a != null) {
            String G = this.b.G();
            wjb wjbVar = cvoVar.a;
            String str = cvoVar.d.a;
            avo avoVar = cvoVar.e;
            nmb.v(a, sjbVar, G, wjbVar, str, avoVar.a, avoVar.b, 896);
        }
    }

    public tnb(cvo cvoVar, fnb fnbVar, arf arfVar, boolean z, Function0 function0) {
        cvoVar.getClass();
        fnbVar.getClass();
        arfVar.getClass();
        this.a = cvoVar;
        this.b = fnbVar;
        this.c = arfVar;
        this.d = z;
        this.e = function0;
    }
}
