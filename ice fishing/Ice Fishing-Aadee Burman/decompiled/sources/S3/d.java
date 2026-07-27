package S3;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2867n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f2868u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f2869v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f2870w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f2871x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2872y;

    public /* synthetic */ d(f fVar, Runnable runnable, long j6, long j9, TimeUnit timeUnit, int i) {
        this.f2867n = i;
        this.f2868u = fVar;
        this.f2869v = runnable;
        this.f2870w = j6;
        this.f2871x = j9;
        this.f2872y = timeUnit;
    }

    @Override // S3.g
    public final ScheduledFuture a(F1.a aVar) {
        switch (this.f2867n) {
            case 0:
                f fVar = this.f2868u;
                return fVar.f2878u.scheduleAtFixedRate(new e(fVar, this.f2869v, aVar, 0), this.f2870w, this.f2871x, this.f2872y);
            default:
                f fVar2 = this.f2868u;
                return fVar2.f2878u.scheduleWithFixedDelay(new e(fVar2, this.f2869v, aVar, 2), this.f2870w, this.f2871x, this.f2872y);
        }
    }
}
