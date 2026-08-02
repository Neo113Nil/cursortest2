package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class qe3 {
    public final kxi a;
    public final cvo b;
    public final nmb c;
    public final avo d;

    public qe3(kxi kxiVar, cvo cvoVar) {
        kxiVar.getClass();
        this.a = kxiVar;
        this.b = cvoVar;
        this.c = qld.m();
        this.d = cvoVar.e;
    }

    public final void a(sjb sjbVar) {
        sjbVar.getClass();
        kmb kmbVar = kmb.Tap;
        String G = this.a.a.G();
        wjb wjbVar = this.b.a;
        ilb ilbVar = ilb.Sheet;
        glb glbVar = glb.Bottom;
        avo avoVar = this.d;
        nmb.w(this.c, sjbVar, kmbVar, G, wjbVar, ilbVar, glbVar, null, avoVar.a, avoVar.b, 3648);
    }

    public final void b(wjb wjbVar) {
        qkb qkbVar = qkb.Actions;
        String G = this.a.a.G();
        wjb wjbVar2 = this.b.a;
        ilb ilbVar = ilb.Sheet;
        glb glbVar = glb.Bottom;
        avo avoVar = this.d;
        nmb.y(this.c, qkbVar, qkbVar, G, wjbVar2, ilbVar, glbVar, null, avoVar.a, avoVar.b, wjbVar2, wjbVar, null, 20032);
    }

    public final void c(xlb xlbVar, String str) {
        str.getClass();
        avo avoVar = this.d;
        String str2 = avoVar.b;
        String G = this.a.a.G();
        wjb wjbVar = this.b.a;
        ilb ilbVar = ilb.Fullscreen;
        glb glbVar = glb.Fullscreen;
        pkb pkbVar = avoVar.a;
        String str3 = avoVar.b;
        nmb nmbVar = this.c;
        nmbVar.getClass();
        str2.getClass();
        G.getClass();
        wjbVar.getClass();
        pkbVar.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entity_type", "actions");
        linkedHashMap.put("entity_id", "actions");
        ouj.y(1, linkedHashMap, "entity_pos_x", 1, "entity_pos_y");
        linkedHashMap.put("object_type", "track");
        eta.m(0, "object_id", str2, "object_pos_x", linkedHashMap);
        linkedHashMap.put("object_pos_y", String.valueOf(0));
        linkedHashMap.put("queue_position", xlbVar.a);
        linkedHashMap.put("playback_action_id", str);
        linkedHashMap.put("hash", G);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", "sheet");
        linkedHashMap.put("page_placement", "bottom");
        linkedHashMap.put("skeleton_id", "");
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("_meta", nmb.u(5));
        nmbVar.C("Screen.Queued", linkedHashMap);
    }
}
