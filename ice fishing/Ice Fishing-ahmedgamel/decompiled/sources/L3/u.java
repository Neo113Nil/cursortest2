package L3;

import android.os.Process;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1736n;

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f1737u;

    public /* synthetic */ u(int i, Runnable runnable) {
        this.f1736n = i;
        this.f1737u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1736n) {
            case 0:
                try {
                    this.f1737u.run();
                    break;
                } catch (RuntimeException e9) {
                    Log.e("ServiceConnMgrImpl", "error caused by ", e9);
                    return;
                }
            case 1:
                this.f1737u.run();
                break;
            case 2:
                Process.setThreadPriority(0);
                this.f1737u.run();
                break;
            case 3:
                try {
                    this.f1737u.run();
                    break;
                } catch (Exception e10) {
                    O3.b.k("Executor", "Background execution failure.", e10);
                    return;
                }
            default:
                Process.setThreadPriority(10);
                this.f1737u.run();
                break;
        }
    }

    public String toString() {
        switch (this.f1736n) {
            case 1:
                return this.f1737u.toString();
            default:
                return super.toString();
        }
    }
}
