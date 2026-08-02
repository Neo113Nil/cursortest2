package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class hw7 implements lw7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw7 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ hw7(kw7 kw7Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = kw7Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.lw7
    public final ScheduledFuture a(qxp qxpVar) {
        switch (this.a) {
            case 0:
                kw7 kw7Var = this.b;
                return kw7Var.b.scheduleAtFixedRate(new iw7(kw7Var, this.c, qxpVar, 0), this.d, this.e, this.f);
            default:
                kw7 kw7Var2 = this.b;
                return kw7Var2.b.scheduleWithFixedDelay(new iw7(kw7Var2, this.c, qxpVar, 2), this.d, this.e, this.f);
        }
    }
}
