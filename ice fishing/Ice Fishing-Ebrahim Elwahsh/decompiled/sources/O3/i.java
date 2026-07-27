package O3;

import android.os.Process;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2514n;

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f2515u;

    public /* synthetic */ i(int i, Runnable runnable) {
        this.f2514n = i;
        this.f2515u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2514n) {
            case 0:
                this.f2515u.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                this.f2515u.run();
                break;
            case 2:
                try {
                    this.f2515u.run();
                    break;
                } catch (Exception e6) {
                    U2.a.d("Executor", "Background execution failure.", e6);
                    return;
                }
            default:
                Process.setThreadPriority(10);
                this.f2515u.run();
                break;
        }
    }

    public String toString() {
        switch (this.f2514n) {
            case 0:
                return this.f2515u.toString();
            default:
                return super.toString();
        }
    }
}
