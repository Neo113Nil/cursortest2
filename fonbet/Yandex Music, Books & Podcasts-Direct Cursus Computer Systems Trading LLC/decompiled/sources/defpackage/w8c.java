package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class w8c extends omd {
    public static final po0 k = new po0("Fido.FIDO2_API", new bww(16), new go0());
    public static final po0 l = new po0("ClientTelemetry.API", new bww(3), new go0());
    public static final po0 m = new po0("SmsRetriever.API", new bww(8), new go0());
    public static final po0 n = new po0("CastApi.API", new bww(14), new go0());
    public static int o = 1;

    public synchronized int d() {
        int i;
        try {
            i = o;
            if (i == 1) {
                Context context = this.a;
                pmd pmdVar = pmd.e;
                int b = pmdVar.b(context, 12451000);
                if (b == 0) {
                    i = 4;
                    o = 4;
                } else if (pmdVar.a(context, null, b) != null || cya.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    o = 2;
                } else {
                    i = 3;
                    o = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public onx e(String[] strArr) {
        q5i a = h8s.a();
        a.c = new c5p(this, strArr, 20);
        a.d = new i6c[]{vwb.l};
        a.a = false;
        a.b = 8425;
        return c(0, a.c());
    }
}
