package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final /* synthetic */ class xot implements xf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf7 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xot(xf7 xf7Var, Object obj, int i) {
        this.a = i;
        this.b = xf7Var;
        this.c = obj;
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        int i = this.a;
        Object obj = this.c;
        xf7 xf7Var = this.b;
        switch (i) {
            case 0:
                HostMobSupportedApiNames hostMobSupportedApiNames = (HostMobSupportedApiNames) obj;
                if (d5j0Var.c(HostMobSupportedApiNames.class) != null) {
                    return xf7Var.newCall(d5j0Var);
                }
                t4j0 b = d5j0Var.b();
                b.g(HostMobSupportedApiNames.class, hostMobSupportedApiNames);
                return xf7Var.newCall(new d5j0(b));
            case 1:
                OkHttpClient okHttpClient = (OkHttpClient) xf7Var;
                cpt cptVar = (cpt) obj;
                cptVar.getClass();
                String str = d5j0Var.a.i;
                not notVar = (not) cptVar.a;
                HostMobSupportedApiNames hostMobSupportedApiNames2 = cvu0.x(str, notVar.c(), false) ? HostMobSupportedApiNames.TAXI : cvu0.x(str, notVar.e(), false) ? HostMobSupportedApiNames.TC : null;
                if (hostMobSupportedApiNames2 != null) {
                    t4j0 b2 = d5j0Var.b();
                    b2.g(HostMobSupportedApiNames.class, hostMobSupportedApiNames2);
                    b2.g(y6v.class, y6v.a);
                    d5j0Var = new d5j0(b2);
                }
                return okHttpClient.newCall(d5j0Var);
            default:
                return ((xf7) ((c7j0) xf7Var).a.getValue()).newCall((d5j0) obj);
        }
    }
}
