package m7;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements h {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4940g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f4941h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f4942i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f4943j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f4944k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f4945l;

    public /* synthetic */ c(f fVar, Runnable runnable, long j3, long j6, TimeUnit timeUnit, int i10) {
        this.f4940g = i10;
        this.f4941h = fVar;
        this.f4942i = runnable;
        this.f4943j = j3;
        this.f4944k = j6;
        this.f4945l = timeUnit;
    }

    @Override // m7.h
    public final ScheduledFuture b(g gVar) {
        switch (this.f4940g) {
            case 0:
                f fVar = this.f4941h;
                return fVar.f4955h.scheduleAtFixedRate(new d(fVar, this.f4942i, gVar, 0), this.f4943j, this.f4944k, this.f4945l);
            default:
                f fVar2 = this.f4941h;
                return fVar2.f4955h.scheduleWithFixedDelay(new d(fVar2, this.f4942i, gVar, 2), this.f4943j, this.f4944k, this.f4945l);
        }
    }
}
