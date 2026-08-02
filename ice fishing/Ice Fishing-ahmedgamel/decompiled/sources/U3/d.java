package U3;

import i1.C4586c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3306n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f3307u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f3308v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f3309w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f3310x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f3311y;

    public /* synthetic */ d(f fVar, Runnable runnable, long j6, long j9, TimeUnit timeUnit, int i) {
        this.f3306n = i;
        this.f3307u = fVar;
        this.f3308v = runnable;
        this.f3309w = j6;
        this.f3310x = j9;
        this.f3311y = timeUnit;
    }

    @Override // U3.g
    public final ScheduledFuture a(C4586c c4586c) {
        switch (this.f3306n) {
            case 0:
                f fVar = this.f3307u;
                return fVar.f3317u.scheduleAtFixedRate(new e(fVar, this.f3308v, c4586c, 0), this.f3309w, this.f3310x, this.f3311y);
            default:
                f fVar2 = this.f3307u;
                return fVar2.f3317u.scheduleWithFixedDelay(new e(fVar2, this.f3308v, c4586c, 2), this.f3309w, this.f3310x, this.f3311y);
        }
    }
}
