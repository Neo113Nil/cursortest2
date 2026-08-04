package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ w3 i;

    public s3(w3 w3Var, long j, int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.e = j;
                Objects.requireNonNull(w3Var);
                this.i = w3Var;
                break;
            default:
                this.e = j;
                Objects.requireNonNull(w3Var);
                this.i = w3Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                w3 w3Var = this.i;
                v3 v3Var = w3Var.y;
                w3Var.r();
                w3Var.v();
                r1 r1Var = (r1) w3Var.d;
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                t0 t0Var = v0Var.G;
                long j = this.e;
                t0Var.b(Long.valueOf(j), "Activity resumed, time");
                g gVar = r1Var.v;
                if (gVar.B(null, e0.U0)) {
                    if (gVar.F() || w3Var.v) {
                        ((w3) v3Var.v).r();
                        ((u3) v3Var.i).c();
                        v3Var.d = j;
                        v3Var.e = j;
                    }
                } else if (gVar.F()) {
                    ((w3) v3Var.v).r();
                    ((u3) v3Var.i).c();
                    v3Var.d = j;
                    v3Var.e = j;
                } else {
                    f1 f1Var = r1Var.w;
                    r1.j(f1Var);
                    if (f1Var.L.a()) {
                        ((w3) v3Var.v).r();
                        ((u3) v3Var.i).c();
                        v3Var.d = j;
                        v3Var.e = j;
                    }
                }
                com.gamericefishpro.space.u6.s sVar = w3Var.z;
                w3 w3Var2 = (w3) sVar.i;
                w3Var2.r();
                r1 r1Var2 = (r1) w3Var2.d;
                t3 t3Var = (t3) sVar.e;
                if (t3Var != null) {
                    w3Var2.i.removeCallbacks(t3Var);
                }
                f1 f1Var2 = r1Var2.w;
                t2 t2Var = r1Var2.F;
                r1.j(f1Var2);
                f1Var2.L.b(false);
                w3Var2.r();
                w3Var2.v = false;
                if (r1Var2.v.B(null, e0.T0)) {
                    r1.k(t2Var);
                    if (t2Var.G) {
                        v0 v0Var2 = r1Var2.y;
                        r1.l(v0Var2);
                        v0Var2.G.a("Retrying trigger URI registration in foreground");
                        r1.k(t2Var);
                        t2Var.Q();
                    }
                }
                com.gamericefishpro.space.m.d dVar = w3Var.w;
                w3 w3Var3 = (w3) dVar.e;
                w3Var3.r();
                r1 r1Var3 = (r1) w3Var3.d;
                if (r1Var3.b()) {
                    r1Var3.D.getClass();
                    dVar.F(System.currentTimeMillis());
                    break;
                }
                break;
            default:
                w3 w3Var4 = this.i;
                w3Var4.r();
                w3Var4.v();
                r1 r1Var4 = (r1) w3Var4.d;
                v0 v0Var3 = r1Var4.y;
                r1.l(v0Var3);
                t0 t0Var2 = v0Var3.G;
                long j2 = this.e;
                t0Var2.b(Long.valueOf(j2), "Activity paused, time");
                com.gamericefishpro.space.u6.s sVar2 = w3Var4.z;
                w3 w3Var5 = (w3) sVar2.i;
                ((r1) w3Var5.d).D.getClass();
                t3 t3Var2 = new t3(sVar2, System.currentTimeMillis(), j2);
                sVar2.e = t3Var2;
                w3Var5.i.postDelayed(t3Var2, 2000L);
                if (r1Var4.v.F()) {
                    ((u3) w3Var4.y.i).c();
                }
                break;
        }
    }
}
