package S7;

import java.util.concurrent.ScheduledFuture;

/* renamed from: S7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0391e implements m0, I7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3033n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3034u;

    public /* synthetic */ C0391e(int i, Object obj) {
        this.f3033n = i;
        this.f3034u = obj;
    }

    public final void a(Throwable th) {
        switch (this.f3033n) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f3034u).cancel(false);
                    break;
                }
                break;
            case 1:
                ((H) this.f3034u).b();
                break;
            default:
                ((I7.l) this.f3034u).invoke(th);
                break;
        }
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f3033n) {
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
        return u7.v.f41073a;
    }

    public final String toString() {
        switch (this.f3033n) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f3034u) + ']';
            case 1:
                return "DisposeOnCancel[" + ((H) this.f3034u) + ']';
            default:
                return "InvokeOnCancel[" + ((I7.l) this.f3034u).getClass().getSimpleName() + '@' + AbstractC0410y.j(this) + ']';
        }
    }
}
