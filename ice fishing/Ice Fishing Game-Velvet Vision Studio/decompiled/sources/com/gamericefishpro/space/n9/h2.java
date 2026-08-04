package com.gamericefishpro.space.n9;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ t2 e;

    public /* synthetic */ h2(t2 t2Var, int i) {
        this.d = i;
        this.e = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.O();
                break;
            case 1:
                h1 h1Var = this.e.K;
                r1 r1Var = h1Var.e;
                p1 p1Var = r1Var.z;
                t2 t2Var = r1Var.F;
                f1 f1Var = r1Var.w;
                r1.l(p1Var);
                p1Var.r();
                if (h1Var.e()) {
                    if (h1Var.d()) {
                        r1.j(f1Var);
                        f1Var.P.e(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        r1.k(t2Var);
                        t2Var.y("auto", "_cmpx", bundle);
                    } else {
                        r1.j(f1Var);
                        com.gamericefishpro.space.h0.z0 z0Var = f1Var.P;
                        String strD = z0Var.d();
                        if (TextUtils.isEmpty(strD)) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.z.a("Cache still valid but referrer not found");
                        } else {
                            long jA = f1Var.Q.a() / 3600000;
                            Uri uri = Uri.parse(strD);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            r1.k(t2Var);
                            t2Var.y(str2, "_cmp", (Bundle) pair.second);
                        }
                        z0Var.e(null);
                    }
                    r1.j(f1Var);
                    f1Var.Q.b(0L);
                    break;
                }
                break;
            case 2:
                t2 t2Var2 = this.e;
                t2Var2.r();
                r1 r1Var2 = (r1) t2Var2.d;
                f1 f1Var2 = r1Var2.w;
                v0 v0Var2 = r1Var2.y;
                r1.j(f1Var2);
                c1 c1Var = f1Var2.M;
                if (c1Var.a()) {
                    r1.l(v0Var2);
                    v0Var2.F.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    d1 d1Var = f1Var2.N;
                    long jA2 = d1Var.a();
                    d1Var.b(1 + jA2);
                    if (jA2 >= 5) {
                        r1.l(v0Var2);
                        v0Var2.B.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c1Var.b(true);
                    } else {
                        if (t2Var2.M == null) {
                            t2Var2.M = new i2(t2Var2, r1Var2, 3);
                        }
                        t2Var2.M.b(0L);
                    }
                }
                break;
            default:
                this.e.O();
                break;
        }
    }
}
