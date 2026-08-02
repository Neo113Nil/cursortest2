package defpackage;

import java.util.HashMap;

/* loaded from: classes14.dex */
public final class qov {
    public final pho a;

    public qov(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2, String str3, String str4) {
        HashMap u = g8e.u("order_id", str, "mode", str2);
        u.put("action", str3);
        if (str4 != null) {
            u.put("ClickButton", str4);
        }
        this.a.a("InactivePhoneCall.forceDestinationAlert", u, 1, new HashMap());
    }

    public final void b(String str, String str2, String str3, String str4) {
        HashMap u = g8e.u("order_id", str, "mode", str2);
        u.put("action", str3);
        if (str4 != null) {
            u.put("ClickButton", str4);
        }
        this.a.a("InactivePhoneCall.InformationAlert", u, 1, new HashMap());
    }
}
