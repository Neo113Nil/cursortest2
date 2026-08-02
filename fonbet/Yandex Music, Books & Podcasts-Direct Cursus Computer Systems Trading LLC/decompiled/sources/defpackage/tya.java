package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class tya {
    public final nmb a;

    public tya(nmb nmbVar) {
        this.a = nmbVar;
    }

    public final void a(b6 b6Var, wjb wjbVar, String str) {
        sjb sjbVar;
        str.getClass();
        if (b6Var instanceof qya) {
            sjbVar = sjb.EasyLoginSetup;
        } else if (b6Var instanceof oya) {
            sjbVar = sjb.Cancel;
        } else if (b6Var instanceof pya) {
            sjbVar = sjb.Later;
        } else {
            if (!(b6Var instanceof rya)) {
                b6e.s();
                return;
            }
            sjbVar = sjb.Cancel;
        }
        kmb kmbVar = kmb.Tap;
        hlb hlbVar = (hlb) b6Var.b;
        pkb pkbVar = (pkb) b6Var.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", sjbVar.a);
        linkedHashMap.put("user_interaction_type", "tap");
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", hlbVar.a);
        linkedHashMap.put("skeleton_id", "");
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", "");
        eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("_meta", nmb.u(2));
        this.a.C("Screen.ActionPerformed", linkedHashMap);
    }
}
