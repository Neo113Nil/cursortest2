package Q2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2480n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2481u;

    public /* synthetic */ A(int i, Object obj) {
        this.f2480n = i;
        this.f2481u = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2480n) {
            case 0:
                ((c3.e) this.f2481u).post(runnable);
                break;
            case 1:
                ((Handler) ((b3.e) this.f2481u).f5558v).post(runnable);
                break;
            case 2:
                ((ExecutorService) this.f2481u).execute(new N3.r(3, runnable));
                break;
            case 3:
                ((c3.e) this.f2481u).post(runnable);
                break;
            default:
                ((Handler) this.f2481u).post(runnable);
                break;
        }
    }

    public A() {
        this.f2480n = 3;
        c3.e eVar = new c3.e(Looper.getMainLooper(), 4, false);
        Looper.getMainLooper();
        this.f2481u = eVar;
    }
}
