package S7;

import java.util.concurrent.ScheduledFuture;

/* renamed from: S7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0387e implements m0, I7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2950n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2951u;

    public /* synthetic */ C0387e(int i, Object obj) {
        this.f2950n = i;
        this.f2951u = obj;
    }

    public final void a(Throwable th) {
        switch (this.f2950n) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f2951u).cancel(false);
                    break;
                }
                break;
            case 1:
                ((H) this.f2951u).b();
                break;
            default:
                ((I7.l) this.f2951u).invoke(th);
                break;
        }
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2950n) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return u7.v.f41350a;
    }

    public final String toString() {
        switch (this.f2950n) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f2951u) + ']';
            case 1:
                return "DisposeOnCancel[" + ((H) this.f2951u) + ']';
            default:
                return "InvokeOnCancel[" + ((I7.l) this.f2951u).getClass().getSimpleName() + '@' + AbstractC0406y.j(this) + ']';
        }
    }
}
