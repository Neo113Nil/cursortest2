package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aj0 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ bj0 a;

    public aj0(bj0 bj0Var) {
        this.a = bj0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.e.removeCallbacks(this);
        bj0.J0(this.a);
        bj0 bj0Var = this.a;
        synchronized (bj0Var.f) {
            if (bj0Var.k) {
                bj0Var.k = false;
                ArrayList arrayList = bj0Var.h;
                bj0Var.h = bj0Var.i;
                bj0Var.i = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        bj0.J0(this.a);
        bj0 bj0Var = this.a;
        synchronized (bj0Var.f) {
            if (bj0Var.h.isEmpty()) {
                bj0Var.d.removeFrameCallback(this);
                bj0Var.k = false;
            }
        }
    }
}
