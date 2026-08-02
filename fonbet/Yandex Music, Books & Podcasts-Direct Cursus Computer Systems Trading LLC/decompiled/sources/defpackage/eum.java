package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class eum {
    public final fnb a;
    public final jyr b;
    public final jyr c;
    public final String d;

    public eum(fnb fnbVar) {
        fnbVar.getClass();
        this.a = fnbVar;
        this.b = l18.b.b(hag.I(tya.class), true);
        this.c = btf.b(new hvl(26));
        this.d = eta.e();
    }

    public final void a(dum dumVar) {
        dlb dlbVar;
        nmb nmbVar = (nmb) this.c.getValue();
        String G = this.a.G();
        int ordinal = dumVar.ordinal();
        if (ordinal == 0) {
            dlbVar = dlb.PlusSdkScreen;
        } else if (ordinal == 1) {
            dlbVar = dlb.SettingsScreen;
        } else if (ordinal == 2) {
            dlbVar = dlb.RestorePurchasesScreen;
        } else if (ordinal == 3) {
            dlbVar = dlb.DeleteAccountScreen;
        } else if (ordinal == 4) {
            dlbVar = dlb.WizardScreen;
        } else {
            if (ordinal != 5) {
                b6e.s();
                return;
            }
            dlbVar = dlb.LogoutScreen;
        }
        nmbVar.getClass();
        G.getClass();
        String str = this.d;
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_id", "profile_screen");
        linkedHashMap.put("page_type", "other");
        linkedHashMap.put("hash", G);
        linkedHashMap.put("view_uuid", str);
        linkedHashMap.put("from", "profile_screen");
        linkedHashMap.put("to", dlbVar.a);
        dfi.p(1, "deep_link", "", "_meta", linkedHashMap);
        nmbVar.C("Profile.Navigated", linkedHashMap);
    }
}
