package O2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2162n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2163u;

    public /* synthetic */ B(int i, Object obj) {
        this.f2162n = i;
        this.f2163u = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2162n) {
            case 0:
                ((a3.e) this.f2163u).post(runnable);
                break;
            case 1:
                ((Handler) ((Z2.e) this.f2163u).f4171v).post(runnable);
                break;
            case 2:
                ((ExecutorService) this.f2163u).execute(new L3.u(3, runnable));
                break;
            case 3:
                ((a3.e) this.f2163u).post(runnable);
                break;
            default:
                ((Handler) this.f2163u).post(runnable);
                break;
        }
    }

    public B() {
        this.f2162n = 3;
        a3.e eVar = new a3.e(Looper.getMainLooper(), 4, false);
        Looper.getMainLooper();
        this.f2163u = eVar;
    }
}
