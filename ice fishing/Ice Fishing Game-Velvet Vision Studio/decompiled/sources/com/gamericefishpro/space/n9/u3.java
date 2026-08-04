package com.gamericefishpro.space.n9;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3(Object obj, a2 a2Var, int i) {
        super(a2Var);
        this.e = i;
        this.f = obj;
    }

    @Override // com.gamericefishpro.space.n9.n
    public final void a() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                v3 v3Var = (v3) this.f;
                w3 w3Var = (w3) v3Var.v;
                w3Var.r();
                r1 r1Var = (r1) w3Var.d;
                r1Var.D.getClass();
                v3Var.e(false, false, SystemClock.elapsedRealtime());
                x xVar = r1Var.G;
                r1.i(xVar);
                r1Var.D.getClass();
                xVar.u(SystemClock.elapsedRealtime());
                break;
            case 1:
                b4 b4Var = (b4) this.f;
                b4Var.v();
                v0 v0Var = ((r1) b4Var.d).y;
                r1.l(v0Var);
                v0Var.G.a("Starting upload from DelayedRunnable");
                b4Var.e.q();
                break;
            default:
                m4 m4Var = (m4) this.f;
                m4Var.c().r();
                String str = (String) m4Var.J.pollFirst();
                if (str != null) {
                    m4Var.e().getClass();
                    m4Var.b0 = SystemClock.elapsedRealtime();
                    m4Var.a().G.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = m4Var.E.d;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                m4Var.H();
                break;
        }
    }
}
