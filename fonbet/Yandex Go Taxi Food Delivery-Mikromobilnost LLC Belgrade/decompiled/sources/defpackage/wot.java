package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.mob.api.model.MobEnvironment;

/* loaded from: classes8.dex */
public final class wot {
    public final MobEnvironment a;

    public wot(MobEnvironment mobEnvironment) {
        this.a = mobEnvironment;
    }

    public final String a(d5j0 d5j0Var) {
        kwu kwuVar = d5j0Var.a;
        HostMobSupportedApiNames hostMobSupportedApiNames = (HostMobSupportedApiNames) d5j0Var.c(HostMobSupportedApiNames.class);
        if (hostMobSupportedApiNames == null) {
            return kwuVar.b();
        }
        String f0 = q5z.f0(hostMobSupportedApiNames, this.a);
        if (f0 != null && !evu0.J(f0) && cvu0.x(kwuVar.b(), f0, false)) {
            return kwuVar.b();
        }
        if (f0 == null) {
            f0 = "";
        }
        return f0.concat(kwuVar.b());
    }
}
