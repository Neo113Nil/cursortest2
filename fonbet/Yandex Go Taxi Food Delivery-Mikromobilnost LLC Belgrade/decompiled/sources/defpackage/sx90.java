package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;

/* loaded from: classes7.dex */
public final /* synthetic */ class sx90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ju6 b;

    public /* synthetic */ sx90(ju6 ju6Var, int i) {
        this.a = i;
        this.b = ju6Var;
    }

    public final String a() {
        int i = this.a;
        ju6 ju6Var = this.b;
        switch (i) {
            case 0:
                not notVar = (not) ju6Var;
                notVar.getClass();
                HostMobSupportedApiNames hostMobSupportedApiNames = HostMobSupportedApiNames.BILLING;
                notVar.c.getClass();
                return notVar.f(hostMobSupportedApiNames, "https://pcidss.yandex.net/api/");
            case 1:
                not notVar2 = (not) ju6Var;
                notVar2.getClass();
                HostMobSupportedApiNames hostMobSupportedApiNames2 = HostMobSupportedApiNames.BILLING_INTERNATIONAL;
                notVar2.c.getClass();
                return notVar2.f(hostMobSupportedApiNames2, "https://api.diehard.yango.com/api/");
            case 2:
                return ((not) ju6Var).d();
            default:
                return ((not) ju6Var).c();
        }
    }
}
