package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class rx2 {
    public final pho a;

    public /* synthetic */ rx2(pho phoVar) {
        this.a = phoVar;
    }

    public void a(int i, String str, String str2, String str3, String str4) {
        HashMap u = g8e.u("from_contour", str, "to_contour", str2);
        if (str4 != null) {
            u.put("zone_name", str4);
        }
        u.put("trigger_screen", str3);
        u.put("duration_ms", Integer.valueOf(i));
        this.a.a("SwitchNetworkEnvironment.Failed", u, 1, new HashMap());
    }
}
