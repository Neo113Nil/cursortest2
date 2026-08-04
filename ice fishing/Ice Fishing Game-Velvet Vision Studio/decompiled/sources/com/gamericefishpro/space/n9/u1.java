package com.gamericefishpro.space.n9;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ long v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object y;

    public /* synthetic */ u1(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.d = i;
        this.e = str;
        this.i = str2;
        this.w = obj2;
        this.v = j;
        this.y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) this.i;
                y1 y1Var = (y1) this.y;
                String str2 = (String) this.e;
                if (str2 != null) {
                    b3 b3Var = new b3((String) this.w, str2, this.v);
                    m4 m4Var = y1Var.d;
                    m4Var.c().r();
                    String str3 = m4Var.Z;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    m4Var.Z = str;
                    m4Var.Y = b3Var;
                } else {
                    m4 m4Var2 = y1Var.d;
                    m4Var2.c().r();
                    String str4 = m4Var2.Z;
                    if (str4 == null || str4.equals(str)) {
                        m4Var2.Z = str;
                        m4Var2.Y = null;
                    }
                }
                break;
            case 1:
                t2 t2Var = (t2) this.y;
                String str5 = (String) this.e;
                String str6 = (String) this.i;
                t2Var.C(this.v, this.w, str5, str6);
                break;
            default:
                e3 e3Var = (e3) this.y;
                Bundle bundle = (Bundle) this.e;
                b3 b3Var2 = (b3) this.i;
                b3 b3Var3 = (b3) this.w;
                e3Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                r4 r4Var = ((r1) e3Var.d).B;
                r1.j(r4Var);
                e3Var.B(b3Var2, b3Var3, this.v, true, r4Var.z("screen_view", bundle, null, false));
                break;
        }
    }

    public u1(e3 e3Var, Bundle bundle, b3 b3Var, b3 b3Var2, long j) {
        this.d = 2;
        this.e = bundle;
        this.i = b3Var;
        this.w = b3Var2;
        this.v = j;
        Objects.requireNonNull(e3Var);
        this.y = e3Var;
    }
}
