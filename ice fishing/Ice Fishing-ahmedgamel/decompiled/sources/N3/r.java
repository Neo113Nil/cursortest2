package N3;

import android.os.Process;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2009n;

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f2010u;

    public /* synthetic */ r(int i, Runnable runnable) {
        this.f2009n = i;
        this.f2010u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2009n) {
            case 0:
                try {
                    this.f2010u.run();
                    break;
                } catch (RuntimeException e9) {
                    Log.e("ServiceConnMgrImpl", "error caused by ", e9);
                    return;
                }
            case 1:
                this.f2010u.run();
                break;
            case 2:
                Process.setThreadPriority(0);
                this.f2010u.run();
                break;
            case 3:
                try {
                    this.f2010u.run();
                    break;
                } catch (Exception e10) {
                    Z2.d.j("Executor", "Background execution failure.", e10);
                    return;
                }
            default:
                Process.setThreadPriority(10);
                this.f2010u.run();
                break;
        }
    }

    public String toString() {
        switch (this.f2009n) {
            case 1:
                return this.f2010u.toString();
            default:
                return super.toString();
        }
    }
}
