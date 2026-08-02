package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final /* synthetic */ class rqh implements uqh {
    public final /* synthetic */ int a;
    public final /* synthetic */ tqh b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ rqh(tqh tqhVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = tqhVar;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.uqh
    public final ScheduledFuture a(zgf zgfVar) {
        int i = this.a;
        Runnable runnable = this.c;
        tqh tqhVar = this.b;
        switch (i) {
            case 0:
                return tqhVar.b.scheduleAtFixedRate(new sqh(tqhVar, runnable, zgfVar, 0), this.d, this.e, this.f);
            default:
                return tqhVar.b.scheduleWithFixedDelay(new sqh(tqhVar, runnable, zgfVar, 2), this.d, this.e, this.f);
        }
    }
}
