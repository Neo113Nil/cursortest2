package defpackage;

import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import java.util.concurrent.Callable;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes11.dex */
public final /* synthetic */ class r7a1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8a1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ r7a1(p8a1 p8a1Var, String str, int i) {
        this.a = i;
        this.b = p8a1Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.c;
        p8a1 p8a1Var = this.b;
        switch (i) {
            case 0:
                return new hma1(new r7a1(p8a1Var, str, 1));
            case 1:
                b bVar = p8a1Var.c.c;
                n.O(bVar);
                n3a1 Ih = bVar.Ih(str);
                HashMap u = g8e.u("platform", ConstantDeviceInfo.APP_PLATFORM, "package_name", str);
                ((g) p8a1Var.b).w.Lg();
                u.put("gmp_version", 133005L);
                if (Ih != null) {
                    String N = Ih.N();
                    if (N != null) {
                        u.put(StartupRequest.PARAM_APP_VERSION, N);
                    }
                    u.put("app_version_int", Long.valueOf(Ih.P()));
                    u.put("dynamite_version", Long.valueOf(Ih.b()));
                }
                return u;
            default:
                wl91 wl91Var = new wl91(p8a1Var, str);
                g3b1 g3b1Var = new g3b1("internal.remoteConfig", 0);
                g3b1Var.b.put("getValue", new hma1(g3b1Var, wl91Var));
                return g3b1Var;
        }
    }
}
