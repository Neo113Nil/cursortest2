package m7;

import android.os.Process;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4959g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f4960h;

    public /* synthetic */ j(Runnable runnable, int i10) {
        this.f4959g = i10;
        this.f4960h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4959g) {
            case 0:
                this.f4960h.run();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Process.setThreadPriority(0);
                this.f4960h.run();
                break;
            default:
                try {
                    this.f4960h.run();
                    break;
                } catch (Exception e10) {
                    a.a.u("Executor", "Background execution failure.", e10);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f4959g) {
            case 0:
                return this.f4960h.toString();
            default:
                return super.toString();
        }
    }
}
