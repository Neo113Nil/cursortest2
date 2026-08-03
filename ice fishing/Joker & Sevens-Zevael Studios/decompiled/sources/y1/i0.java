package y1;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f8555g;

    public i0(j0 j0Var) {
        this.f8555g = j0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f8555g.f8561j.removeCallbacks(this);
        j0.z(this.f8555g);
        j0 j0Var = this.f8555g;
        synchronized (j0Var.f8562k) {
            if (j0Var.f8567p) {
                j0Var.f8567p = false;
                ArrayList arrayList = j0Var.f8564m;
                j0Var.f8564m = j0Var.f8565n;
                j0Var.f8565n = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j3);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.z(this.f8555g);
        j0 j0Var = this.f8555g;
        synchronized (j0Var.f8562k) {
            if (j0Var.f8564m.isEmpty()) {
                j0Var.f8560i.removeFrameCallback(this);
                j0Var.f8567p = false;
            }
        }
    }
}
