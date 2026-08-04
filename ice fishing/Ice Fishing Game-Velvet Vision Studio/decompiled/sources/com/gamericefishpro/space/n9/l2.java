package com.gamericefishpro.space.n9;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ t2 i;

    public l2(t2 t2Var, long j, int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.e = j;
                Objects.requireNonNull(t2Var);
                this.i = t2Var;
                break;
            default:
                this.e = j;
                Objects.requireNonNull(t2Var);
                this.i = t2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r1 r1Var = (r1) this.i.d;
                f1 f1Var = r1Var.w;
                r1.j(f1Var);
                d1 d1Var = f1Var.D;
                long j = this.e;
                d1Var.b(j);
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.F.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                t2 t2Var = this.i;
                t2Var.r();
                t2Var.s();
                r1 r1Var2 = (r1) t2Var.d;
                v0 v0Var2 = r1Var2.y;
                r1.l(v0Var2);
                v0Var2.F.a("Resetting analytics data (FE)");
                w3 w3Var = r1Var2.A;
                r1.k(w3Var);
                w3Var.r();
                v3 v3Var = w3Var.y;
                ((u3) v3Var.i).c();
                ((r1) ((w3) v3Var.v).d).D.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                v3Var.d = jElapsedRealtime;
                v3Var.e = jElapsedRealtime;
                r1Var2.q().w();
                boolean z = !r1Var2.b();
                f1 f1Var2 = r1Var2.w;
                r1.j(f1Var2);
                f1Var2.y.b(this.e);
                r1 r1Var3 = (r1) f1Var2.d;
                f1 f1Var3 = r1Var3.w;
                r1.j(f1Var3);
                if (!TextUtils.isEmpty(f1Var3.O.d())) {
                    f1Var2.O.e(null);
                }
                f1Var2.I.b(0L);
                f1Var2.J.b(0L);
                if (!r1Var3.v.E()) {
                    f1Var2.A(z);
                }
                f1Var2.P.e(null);
                f1Var2.Q.b(0L);
                f1Var2.R.l(null);
                o3 o3VarO = r1Var2.o();
                o3VarO.r();
                o3VarO.s();
                t4 t4VarH = o3VarO.H(false);
                o3VarO.D();
                ((r1) o3VarO.d).n().v();
                o3VarO.F(new j3(o3VarO, t4VarH, 0));
                r1.k(w3Var);
                w3Var.w.D();
                t2Var.L = z;
                r1Var2.o().v(new AtomicReference());
                break;
        }
    }
}
