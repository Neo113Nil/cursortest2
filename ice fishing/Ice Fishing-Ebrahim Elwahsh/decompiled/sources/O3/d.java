package O3;

import g1.C4523c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2501n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f2502u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f2503v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f2504w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f2505x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2506y;

    public /* synthetic */ d(f fVar, Runnable runnable, long j9, long j10, TimeUnit timeUnit, int i) {
        this.f2501n = i;
        this.f2502u = fVar;
        this.f2503v = runnable;
        this.f2504w = j9;
        this.f2505x = j10;
        this.f2506y = timeUnit;
    }

    @Override // O3.g
    public final ScheduledFuture a(C4523c c4523c) {
        switch (this.f2501n) {
            case 0:
                f fVar = this.f2502u;
                return fVar.f2512u.scheduleAtFixedRate(new e(fVar, this.f2503v, c4523c, 0), this.f2504w, this.f2505x, this.f2506y);
            default:
                f fVar2 = this.f2502u;
                return fVar2.f2512u.scheduleWithFixedDelay(new e(fVar2, this.f2503v, c4523c, 2), this.f2504w, this.f2505x, this.f2506y);
        }
    }
}
