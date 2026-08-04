package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.t5;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ l1 e;
    public final /* synthetic */ String i;

    public /* synthetic */ j1(l1 l1Var, String str, int i) {
        this.d = i;
        this.e = l1Var;
        this.i = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new com.gamericefishpro.space.i9.h4(new j1(this.e, this.i, 1));
            case 1:
                l1 l1Var = this.e;
                m mVar = l1Var.e.i;
                m4.T(mVar);
                String str = this.i;
                a1 a1VarT0 = mVar.t0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((r1) l1Var.d).v.w();
                map.put("gmp_version", 133005L);
                if (a1VarT0 != null) {
                    String strN = a1VarT0.N();
                    if (strN != null) {
                        map.put("app_version", strN);
                    }
                    map.put("app_version_int", Long.valueOf(a1VarT0.P()));
                    map.put("dynamite_version", Long.valueOf(a1VarT0.b()));
                }
                return map;
            default:
                com.gamericefishpro.space.u6.e eVar = new com.gamericefishpro.space.u6.e(this.e, this.i);
                t5 t5Var = new t5("internal.remoteConfig", 0);
                t5Var.e.put("getValue", new com.gamericefishpro.space.i9.h4(t5Var, eVar));
                return t5Var;
        }
    }
}
