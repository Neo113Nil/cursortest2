package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class ekf {
    public final fnb a;

    public ekf(fnb fnbVar) {
        fnbVar.getClass();
        this.a = fnbVar;
    }

    public final void a(String str, wre wreVar, boolean z, ah ahVar) {
        kmb kmbVar;
        elb elbVar;
        nmb nmbVar = dkf.a;
        int ordinal = wreVar.ordinal();
        if (ordinal == 0) {
            kmbVar = kmb.Tap;
        } else if (ordinal == 1) {
            kmbVar = kmb.LongTap;
        } else if (ordinal == 2) {
            kmbVar = kmb.DoubleTap;
        } else if (ordinal == 3) {
            kmbVar = kmb.Pan;
        } else {
            if (ordinal != 4) {
                b6e.s();
                return;
            }
            kmbVar = kmb.Swipe;
        }
        flb flbVar = z ? flb.Fullscreen : flb.Regular;
        switch (ahVar.ordinal()) {
            case 0:
                elbVar = elb.Play;
                break;
            case 1:
                elbVar = elb.Pause;
                break;
            case 2:
                elbVar = elb.Like;
                break;
            case 3:
                elbVar = elb.Next;
                break;
            case 4:
                elbVar = elb.Previous;
                break;
            case 5:
                elbVar = elb.EnterFullscreenMode;
                break;
            case 6:
                elbVar = elb.ExitFullscreenMode;
                break;
            case 7:
                elbVar = elb.Glow;
                break;
            default:
                b6e.s();
                return;
        }
        fnb fnbVar = this.a;
        fnbVar.getClass();
        nmb nmbVar2 = dkf.a;
        String G = fnbVar.G();
        nmbVar2.getClass();
        G.getClass();
        LinkedHashMap m = dfi.m("page_id", "main_screen", "page_type", "landing");
        m.put("hash", G);
        m.put("user_interaction_type", kmbVar.a);
        m.put("entity_type", "my_wave");
        m.put("entity_id", "my_wave");
        m.put("object_type", "wave");
        m.put("object_id", str);
        m.put("view_mode", flbVar.a);
        dfi.p(1, "action_type", elbVar.a, "_meta", m);
        nmbVar2.C("Home.MyWave.ActionPerformed", m);
    }

    public final void b(String str, List list) {
        str.getClass();
        list.getClass();
        nmb nmbVar = dkf.a;
        String X = CollectionsKt.X(list, null, null, null, null, 63);
        pkb pkbVar = pkb.Audiobook;
        fnb fnbVar = this.a;
        fnbVar.getClass();
        nmb.z(dkf.a, fnbVar.G(), wjb.MainScreen, null, null, null, null, 0, false, "deeplink", "deeplink", 0, "wave", X, 0, str, 52476);
    }
}
