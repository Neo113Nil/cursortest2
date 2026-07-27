package N2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1979n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1980u;

    public /* synthetic */ A(int i, Object obj) {
        this.f1979n = i;
        this.f1980u = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1979n) {
            case 0:
                ((Z2.e) this.f1980u).post(runnable);
                break;
            case 1:
                ((Handler) ((Y2.e) this.f1980u).f3964v).post(runnable);
                break;
            case 2:
                ((ExecutorService) this.f1980u).execute(new O3.i(2, runnable));
                break;
            case 3:
                ((Z2.e) this.f1980u).post(runnable);
                break;
            default:
                ((Handler) this.f1980u).post(runnable);
                break;
        }
    }

    public A() {
        this.f1979n = 3;
        Z2.e eVar = new Z2.e(Looper.getMainLooper(), 4, false);
        Looper.getMainLooper();
        this.f1980u = eVar;
    }
}
