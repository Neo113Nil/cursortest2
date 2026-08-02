package defpackage;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* loaded from: classes3.dex */
public final class qi5 {
    public final cy2 a;
    public final qkp b;

    public qi5(cy2 cy2Var, qkp qkpVar) {
        this.a = cy2Var;
        this.b = qkpVar;
    }

    public static void a(qi5 qi5Var, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        qi5Var.getClass();
        qi5Var.b("parse", str, str2, str3);
    }

    public static /* synthetic */ void c(qi5 qi5Var, String str, String str2, String str3, String str4, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        qi5Var.b(str, str2, str3, str4);
    }

    public final void b(String str, String str2, String str3, String str4) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            f9h f9hVar = new f9h();
            f9hVar.put(AdRevenueConstants.LAYER_KEY, str);
            f9hVar.put("reason", str2);
            if (str3 != null) {
                f9hVar.put("anchorId", str3);
            }
            if (str4 != null) {
                f9hVar.put("screenId", str4);
            }
            this.a.b("COMMUNICATION_TRIGGER_DROP", f9hVar.b());
        }
    }
}
